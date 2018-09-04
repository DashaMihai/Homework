package runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;


import dom.DomRecipient;
import model.Recipients;
import sax.RecipientHandler;
import stax.StaxRecipient;

public class Run {


		private static final String RECIPIENTS_XML = "recipients.xml";

		public static void main(String[] args)
				throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
			System.out.println(" ========================= SAX parser ==============================");
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			SAXParser saxParser = saxParserFactory.newSAXParser();
			RecipientHandler recipientHandler = new RecipientHandler();
			saxParser.parse(new File(RECIPIENTS_XML), recipientHandler);
			List<Recipients> recipients = recipientHandler.getRecipients();
			recipients.forEach(recipient -> System.out.println(recipient));

			System.out.println(" ============================== STAX parser =========================");
			XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(RECIPIENTS_XML));
			recipients = new StaxRecipient().parse(xmlEventReader);
			recipients.forEach(recipient -> System.out.println(recipient));

			System.out.println(" ============================== DOM parser =========================");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(RECIPIENTS_XML);
			recipients = new DomRecipient().parse(document);
			recipients.forEach(recipient -> System.out.println(recipient));
		}

	}


