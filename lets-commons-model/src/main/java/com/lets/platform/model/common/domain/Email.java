package com.lets.platform.model.common.domain;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.core.io.InputStreamSource;
import org.springframework.util.Assert;

import javax.mail.internet.InternetAddress;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author liwan@letsiot.com
 * @version 1.0 创建时间: 2017年9月2日 上午9:16:28
 *
 */
public class Email {
	public static class EmailReceiver {
		private final String name;
		private final String address;

		public String getName() {
			return name;
		}

		public String getAddress() {
			return address;
		}

		public EmailReceiver(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}

		public InternetAddress toInternetAddress() {
			try {
				return new InternetAddress(address, name, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new Error(e);
			}
		}
	}

	public static class Attachment {
		private final String name;
		private final InputStreamSource inputStreamSource;

		public String getName() {
			return name;
		}

		public InputStreamSource getInputStreamSource() {
			return inputStreamSource;
		}

		public Attachment(String name, InputStreamSource inputStreamSource) {
			super();
			this.name = name;
			this.inputStreamSource = inputStreamSource;
		}
	}

	private String subject;
	private String content;
	private List<EmailReceiver> to;
	private List<EmailReceiver> cc;
	private List<EmailReceiver> bcc;

	private String tplName;
	private Map<String, Object> tplData;
	private List<Attachment> attachments;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private String from;

	private String fromAddr;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getFromAddr() {
		return fromAddr;
	}

	public void setFromAddr(String fromAddr) {
		this.fromAddr = fromAddr;
	}
	public void addTplData(String key, Object data) {
		this.getTplData().put(key, data);
	}

	public void addTo(String name, String address) {
		this.getTo().add(new EmailReceiver(name, address));
	}

	public void addCc(String name, String address) {
		this.getCc().add(new EmailReceiver(name, address));
	}

	public void addBcc(String name, String address) {
		this.getBcc().add(new EmailReceiver(name, address));
	}

	public void addAttachment(String name, InputStreamSource iss) {
		this.getAttachments().add(new Attachment(name, iss));
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<EmailReceiver> getTo() {
		if (this.to == null) {
			this.to = Lists.newArrayList();
		}
		return to;
	}

	public void setTo(List<EmailReceiver> to) {
		this.to = to;
	}

	public List<EmailReceiver> getCc() {
		if (this.cc == null) {
			this.cc = Lists.newArrayList();
		}
		return cc;
	}

	public void setCc(List<EmailReceiver> cc) {
		this.cc = cc;
	}

	public List<EmailReceiver> getBcc() {
		if (this.bcc == null) {
			this.bcc = Lists.newArrayList();
		}
		return bcc;
	}

	public void setBcc(List<EmailReceiver> bcc) {
		this.bcc = bcc;
	}

	public String getTplName() {
		return tplName;
	}

	public void setTplName(String tplName) {
		this.tplName = tplName;
	}

	public Map<String, Object> getTplData() {
		if (this.tplData == null) {
			this.tplData = Maps.newHashMap();
		}
		return tplData;
	}

	public void setTplData(Map<String, Object> tplData) {
		this.tplData = tplData;
	}

	public List<Attachment> getAttachments() {
		if (this.attachments == null) {
			this.attachments = Lists.newArrayList();
		}
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public InternetAddress[] convert(List<EmailReceiver> revs) {
		Assert.notNull(revs);
		List<InternetAddress> ias = Lists.transform(revs, rev -> rev.toInternetAddress());
		return ias.toArray(new InternetAddress[ias.size()]);
	}

	public InternetAddress[] getToAddress() {
		return this.convert(this.getTo());
	}

	public InternetAddress[] getCcAddress() {
		return this.convert(this.getCc());
	}

	public InternetAddress[] getBccAddress() {
		return this.convert(this.getBcc());
	}
}
