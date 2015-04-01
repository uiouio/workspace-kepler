package com.ocean;

import java.util.ArrayList;
import java.util.Properties;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@SuppressWarnings("rawtypes")
public class XmlCallback extends DefaultHandler {
	private boolean textFlag = false;
	private ArrayList propsAl;
	private Properties curProps;
	private String curKey;
	private String PROPSROW_DESC;
	private String KEY_DESC;
	private String curPROPSROW_DESC;
	private String curKEY_DESC;

	public XmlCallback() {
	}

	@Override
	public void startDocument() throws SAXException {
		// LogUtil.fine("start parse xml");
	}

	@Override
	public void startElement(String uri, String sName, String qName,
			Attributes attrs) {
		if (qName.equals("PROPSTABLE")) {
			// LogUtil.fine(attrs.getValue("DESC"));
			propsAl = new ArrayList();
		} else if (qName.equals("PROPSROW")) {
			curPROPSROW_DESC = attrs.getValue("DESC");
			curProps = new Properties();
		} else {
			// LogUtil.fine(qName);
			curKEY_DESC = attrs.getValue("DESC");
			curKey = qName;
			textFlag = true;
		}
	}

	@Override
	public void characters(char[] data, int start, int length) {
		String content = new String(data, start, length);
		if (textFlag) {
			// LogUtil.fine(content);
			if (KEY_DESC == null
					|| (curKEY_DESC != null && curKEY_DESC.equals(KEY_DESC)))
				curProps.put(curKey, content.trim());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void endElement(String uri, String sName, String qName) {

		if (qName.equals("PROPSTABLE")) {
		} else if (qName.equals("PROPSROW")) {
			if (PROPSROW_DESC == null
					|| (curPROPSROW_DESC != null && curPROPSROW_DESC
							.equals(PROPSROW_DESC)))
				propsAl.add(curProps);
		} else {
			// LogUtil.fine("/"+qName);
			textFlag = false;
		}
	}

	@Override
	public void endDocument() throws SAXException {
		// LogUtil.fine("end parse xml");
	}

	public ArrayList getPropsAl() {
		return propsAl;
	}

	public void setPROPSROW_DESC(String PROPSROW_DESC) {
		this.PROPSROW_DESC = PROPSROW_DESC;
	}

	public void setKEY_DESC(String KEY_DESC) {
		this.KEY_DESC = KEY_DESC;
	}
}