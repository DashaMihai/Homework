package sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.Recipients;

public class RecipientHandler extends DefaultHandler {
	private List<Recipients> recipients;
	private Recipients recipient;
	boolean bEmail = false;
	boolean bText = false;

	public List<Recipients> getRecipients() {
		return recipients;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("Recipient")) {
			String id = attributes.getValue("id");
			recipient = new Recipients();
			recipient.setId(Integer.parseInt(id));
			if (recipients == null) {
				recipients = new ArrayList<>();
			}
		} else if (qName.equalsIgnoreCase("email")) {
			bEmail = true;
		} else if (qName.equalsIgnoreCase("text")) {
			bText = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("Recipient")) {
			recipients.add(recipient);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bEmail) {
			recipient.setEmail(new String(ch, start, length));
			bEmail = false;
		} else if (bText) {
			recipient.setText(new String(ch, start, length));
			bText = false;
		}

	}

}
