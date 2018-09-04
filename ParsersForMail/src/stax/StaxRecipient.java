package stax;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import model.Recipients;

public class StaxRecipient {
	private static final String EMAIL = "email";
	private static final String TEXT = "text";
	private static final String ID = "id";
	private static final String RECIPIENT = "Recipient";
	private Recipients recipient;
	List<Recipients> recipients = new ArrayList<>();

	public List<Recipients> parse(XMLEventReader xmlEventReader) throws FileNotFoundException, XMLStreamException {
		while (xmlEventReader.hasNext()) {
			XMLEvent xmlEvent = xmlEventReader.nextEvent();
			proceedStartElement(xmlEvent, xmlEventReader);
			proceedEndElement(xmlEvent);
		}
		return recipients;
	}

	private void proceedStartElement(XMLEvent xmlEvent, XMLEventReader xmlEventReader) throws XMLStreamException {
		if (xmlEvent.isStartElement()) {
			StartElement startElement = xmlEvent.asStartElement();
			if (isTagNameEqual(startElement, RECIPIENT)) {
				recipient = new Recipients();
				Attribute attribute = startElement.getAttributeByName(new QName(ID));
				if (attribute != null) {
					recipient.setId(Integer.parseInt(attribute.getValue()));
				}
			}

			else if (isTagNameEqual(startElement, EMAIL)) {
				recipient.setEmail(xmlEventReader.nextEvent().asCharacters().getData());
			} else if (isTagNameEqual(startElement, TEXT)) {
				recipient.setText(xmlEventReader.nextEvent().asCharacters().getData());
			}

		}
	}

	private void proceedEndElement(XMLEvent xmlEvent) {
		if (xmlEvent.isEndElement()) {
			EndElement endElement = xmlEvent.asEndElement();
			if (endElement.getName().getLocalPart().equals(RECIPIENT)) {
				recipients.add(recipient);
			}
		}
	}

	private boolean isTagNameEqual(StartElement startElement, String tagName) {
		return startElement.getName().getLocalPart().equals(tagName);
	}

}
