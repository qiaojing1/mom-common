package com.lets.platform.common.pojo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
 
import java.util.List;
 
public class XmltoJson {
    /**
     * 将xml转换为JSON对象
     *
     * @param xml xml字符串
     * @return
     * @throws Exception
     */
    public static JSONObject xmltoJson(String xml) throws Exception {
        JSONObject jsonObject = new JSONObject();
        Document document = DocumentHelper.parseText(xml);
        //获取根节点元素对象
        Element root = document.getRootElement();
        iterateNodes(root, jsonObject);
        return jsonObject;
    }
 
    /**
     * 遍历元素
     *
     * @param node 元素
     * @param json 将元素遍历完成之后放的JSON对象
     */
    @SuppressWarnings("unchecked")
    public static void iterateNodes(Element node, JSONObject json) {
        //获取当前元素的名称
        String nodeName = node.getName();
        //判断已遍历的JSON中是否已经有了该元素的名称
        if (json.containsKey(nodeName)) {
            //该元素在同级下有多个
            Object Object = json.get(nodeName);
            JSONArray array = null;
            if (Object instanceof JSONArray) {
                array = (JSONArray) Object;
            } else {
                array = new JSONArray();
                array.add(Object);
            }
            //获取该元素下所有子元素
            List<Element> listElement = node.elements();
            if (listElement.isEmpty()) {
                //该元素无子元素，获取元素的值
                String nodeValue = node.getTextTrim();
                array.add(nodeValue);
                json.put(nodeName, array);
                return;
            }
            //有子元素
            JSONObject newJson = new JSONObject();
            //遍历所有子元素
            for (Element e : listElement) {
                //递归
                iterateNodes(e, newJson);
            }
            array.add(newJson);
            json.put(nodeName, array);
            return;
        }
        //该元素同级下第一次遍历
        //获取该元素下所有子元素
        List<Element> listElement = node.elements();
        if (listElement.isEmpty()) {
            //该元素无子元素，获取元素的值
            String nodeValue = node.getTextTrim();
            json.put(nodeName, nodeValue);
            return;
        }
        //有子节点，新建一个JSONObject来存储该节点下子节点的值
        JSONObject object = new JSONObject();
        //遍历所有一级子节点
        for (Element e : listElement) {
            //递归
            iterateNodes(e, object);
        }
        json.put(nodeName, object);
        return;
    }
 
    /**
     * 测试的main方法
     */
    public static void main(String[] args) throws Exception {
        String xml = "<SOAP:Envelope xmlns:SOAP='http://schemas.xmlsoap.org/soap/envelope/'><SOAP:Header/><SOAP:Body xmlns:fpms='http://www.hbc.com/hpase1/fpms'><ns0:mt_fvptms001_fvptms_return xmlns:ns0='http://www.hbc.com/hpase1/fpms'><HEAD><INTF_ID>FVPTMS001</INTF_ID><SRC_SYSTEM>VPTMS2080</SRC_SYSTEM><DEST_SYSTEM>SAP</DEST_SYSTEM><SRC_MSGID>6080328865802240</SRC_MSGID></HEAD><BODY><ITEM><VBELN>26548</VBELN><POSNR>10</POSNR><ZPOSID>2401079-0320</ZPOSID><ZPARTS_BILLNO>22.2486.0013</ZPARTS_BILLNO><KWMENG>2</KWMENG><VRKME>台</VRKME><ZFMNAM>减压阀</ZFMNAM><ZXH>Y967Y</ZXH><ZFT_TEX>F91</ZFT_TEX><GROES>DN350</GROES><ZYLJB>P57.466V</ZYLJB><ZSY>见附件</ZSY><ZSYMF>见附件</ZSYMF></ITEM></BODY></ns0:mt_fvptms001_fvptms_return></SOAP:Body></SOAP:Envelope>";
        JSONObject jsonObject = xmltoJson(xml);
        System.out.println(jsonObject);
    }
}