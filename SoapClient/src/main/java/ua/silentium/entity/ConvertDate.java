package ua.silentium.entity;

import java.io.*;
import java.util.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

class ConvertDate {
    public static void main(String[] args) {
	Date today = new Date();

	// Converting date to XMLGregorianCalendar
	XMLGregorianCalendar xml = toXMLGregorianCalendar(today);
	System.out.println("XMLGregorianCalendar from Date in Java      : " + xml);

	// Converting XMLGregorianCalendar to java.util.Date
	// in Java
	Date date = toDate(xml);
	System.out.println("java.util.Date from XMLGregorianCalendar in Java : " + date);
    }

    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
	GregorianCalendar gCalendar = new GregorianCalendar();
	gCalendar.setTime(date);
	XMLGregorianCalendar xmlCalendar = null;
	try {
	    xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
	} catch (DatatypeConfigurationException ex) {
	    System.out.println(ex);
	}
	return xmlCalendar;
    }

    public static Date toDate(XMLGregorianCalendar calendar) {
	if (calendar == null) {
	    return null;
	}
	return calendar.toGregorianCalendar().getTime();
    }
}
