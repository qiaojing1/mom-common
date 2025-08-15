package com.lets.platform.common.pojo.util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;

import com.lets.platform.common.pojo.base.SoapEntity;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class SOAPUtil {

    public static void main(String[] args) throws Exception {

        List<SoapEntity> nameSpacesLsit= new ArrayList<>();
        SoapEntity soapEntity = new SoapEntity();
        soapEntity.setValue("http://schemas.xmlsoap.org/soap/envelope/");
        soapEntity.setPrefix("soapenv");
        nameSpacesLsit.add(soapEntity);
        soapEntity = new SoapEntity();
        soapEntity.setValue("http://server.webservice.example.com");
        soapEntity.setPrefix("ser");
        nameSpacesLsit.add(soapEntity);
        //创建本类的对象
        SOAPUtil util = new SOAPUtil();
        //调用本类的方法
        SOAPPart part = util.initsoappart(nameSpacesLsit,null);

        SoapEntity methods = new SoapEntity();
        methods.setPrefix("ser");
        methods.setTag("querySapMatInfo");

        List<SoapEntity> parmList= new ArrayList<>();
        SoapEntity controlInfo = new SoapEntity();
        controlInfo.setTag("ControlInfo");

        List<SoapEntity> clist= new ArrayList<>();
        SoapEntity soapEntity1 = new SoapEntity();
        soapEntity1.setValue("1");
        soapEntity1.setTag("INTF_ID");
        clist.add(soapEntity1);
        soapEntity1 = new SoapEntity();
        soapEntity1.setValue("sap");
        soapEntity1.setTag("Src_System");
        clist.add(soapEntity);
        controlInfo.setChilds(clist);
        parmList.add(controlInfo);
        SoapEntity LineOfHeaders = new SoapEntity();
        LineOfHeaders.setTag("LineOfHeaders");

        List<SoapEntity> llist= new ArrayList<>();
        SoapEntity soapEntity2 = new SoapEntity();
        soapEntity2.setValue("2");
        soapEntity2.setTag("LGORT");
        llist.add(soapEntity2);
        soapEntity2 = new SoapEntity();
        soapEntity2.setValue("sap");
        soapEntity2.setTag("WERKS");
        llist.add(soapEntity2);
        LineOfHeaders.setChilds(llist);
        parmList.add(LineOfHeaders);

        //获取返回的soap报文
        Source inform = util.getparametervalues(part,methods,parmList);
        //输出这些soap报文到控制台，如果是我，我只需要封装就行了
        util.soap2string(inform);
    }

    /*
     * 总结：
     * 1、既然有set元素，那么就可以进行get元素中的内容
     */

    /**
     * 封装命名空间、请求头
     * @return
     * @throws SOAPException
     */
    public SOAPPart initsoappart(List<SoapEntity> nameSpaceList, List<SoapEntity> headerList) throws SOAPException {
        //创建SoapMessage
        SOAPMessage soapmessage = MessageFactory.newInstance().createMessage();
        //创建SoapPart
        SOAPPart soappart = soapmessage.getSOAPPart();
        //创建SoapEnvelope
        SOAPEnvelope soapenvelope = soappart.getEnvelope();
        //创建Header
        SOAPHeader soapheader = soapenvelope.getHeader();
        //创建命名空间声明

        //实际的报文输出：SOAP-ENV、cwmp、soap-enc、xsd、xsi
        //维度没有第一个？说明第一个是默认的
        for (SoapEntity d : nameSpaceList) {
            soapenvelope.addNamespaceDeclaration(d.getPrefix(),
                    d.getValue());
        }
       /* SOAPElement cwmp = soapenvelope.addNamespaceDeclaration("cwmp",
                "urn:dslforum-org:cwmp-1-0");
        SOAPElement xsi = soapenvelope.addNamespaceDeclaration("xsi",
                "http://www.w3.org/2001/xmlschema-instance");
        SOAPElement xsd = soapenvelope.addNamespaceDeclaration("xsd",
                "http://www.w3.org/2001/xmlschema");

        SOAPElement enc = soapenvelope.addNamespaceDeclaration("soap-enc",
                "http://schemas.xmlsoap.org/soap/encoding/");
*/
        //向soap头中添加数据
//        for (SoapEntity d : headerList) {
//                    SOAPElement id = soapheader.addChildElement("id", "cwmp");//也就是说在header中新增子标签
////            向标签中添加数据
//        id.setTextContent("1");
//        }
//        SOAPElement id = soapheader.addChildElement("id", "cwmp");//也就是说在header中新增子标签
        //向标签中添加数据
//        id.setTextContent("1");
        //返回SOAPPart对象
        return soappart;
    }
    /**
     * 封装请求体内容
     * @param part
     * @param
     * @return
     * @throws Exception
     */
    public Source getparametervalues(SOAPPart part,SoapEntity method,  List<SoapEntity> bodyparmList) throws Exception {
        //再次通过soappart对象创建envelope对象
        SOAPEnvelope soapenvelope = part.getEnvelope();
        //通过envelope对象获取body对象
        SOAPBody soapbody = soapenvelope.getBody();
        //通过body对象创建子节点  <prefix:methods>
        SOAPElement methods = soapbody.addChildElement(method.getTag(), method.getPrefix());

        for (SoapEntity one :bodyparmList) {
            //实例化SOAP工厂
            SOAPFactory soapfactory = SOAPFactory.newInstance();
            //通过soap工厂创建标签  <parameternames soap-enc:arraytype="xsd:string[27]">
            SOAPElement names = soapfactory.createElement(one.getTag(), one.getPrefix(), "");
            //并且为这个标签新增属性 name 以及 value
//        names.addAttribute(new QName("soap-enc:arraytype"), "xsd:string["
//                + list.size() + "]");

            //方法传入的参数list，来自于另外一个方法，其实就是一个保存有value的集合，也就是子标签中需要存入的数据
            //
            SOAPElement nameelement = null;
            List<SoapEntity> parmChilds = one.getChilds();
            for (int i = 0; i < parmChilds.size(); i++) {
                SoapEntity param = parmChilds.get(i);
                //使用soap工厂创建标签
                nameelement = soapfactory.createElement(param.getTag(), param.getPrefix(), "");
                //将集合中的内容保存到创建的string标签中
                nameelement.setTextContent( param.getValue());
                //再把存有子标签的数据存到外层标签中
                names.addChildElement(nameelement);
            }
            //在把这个多重子标签，存入到外面的标签中
            methods.addChildElement(names);
        }

        //最后返回这个最外层的part对象，其中就包含了header和body
        return part.getContent();
    }


    /**
     * 将soap报文转换成string，在控制台输出
     * @param source
     * @throws Exception
     */
    public String soap2string(Source source) throws Exception {
        //此处的source就是封装的soap请求报文
        if (source != null) {
            //定义一个w3c包中的node对象
            Node root = null;
            //如果请求报文属于DOM类型
            if (source instanceof DOMSource) {
                //就获取node
                root = ((DOMSource) source).getNode();
                //如果请求报文是sax类型
            } else if (source instanceof SAXSource) {
                //最终还是获取其中的元素
                InputSource insource = ((SAXSource) source).getInputSource();
                DocumentBuilderFactory dbf = DocumentBuilderFactory
                        .newInstance();
                dbf.setNamespaceAware(true);
                Document doc = (Document) dbf.newDocumentBuilder().parse(insource);
                root = (Node) doc.getDefaultRootElement();
            }
            //创建transfermerfactory示例，创建transformer对象
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            //设置属性为yes
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            //调用方法，将node类型的请求报文在控制台进行输出
            //transformer.transform(new DOMSource(root), new StreamResult(System.out));

                DOMSource domSource = new DOMSource(root);
                java.io.StringWriter sw = new java.io.StringWriter();
                StreamResult sr = new StreamResult(sw);
                 transformer.transform(domSource, sr);
                 String xml = sw.toString();
              return xml;


        }
        return "";
    }
}