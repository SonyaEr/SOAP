package ua.silentium.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ua.silentium.TourService;
import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;
import ua.silentium.entity.vouchers.TypeFood;
import ua.silentium.entity.vouchers.TypeTour;
import ua.silentium.entity.vouchers.TypeTransport;
import ua.silentium.TourWebServiceSEI;

public class Test {
    public static void main(String[] args) throws ParseException {

	TourWebServiceSEI port = new TourService().getTourServicePort();

	List<Tour> tour_arr = null;
	List<TourDate> tourdate_arr = null;

	TypeFood typefood = new TypeFood(1, "Breakfast");
	TypeTransport typetransport = new TypeTransport(1, "Bus");
	TypeTour typetour = new TypeTour(1, "Excursion");
	// Добавление туров
	System.out.println("Add tours:");
	System.out.println("add tour id=1 - " + port.addTour(new Tour(1, "Germany",
		"Bavarian Highlights with Oberammergau", 3, "Flyair", typefood, typetransport, typetour)));
	System.out.println("add tour id=2 - "
		+ port.addTour(new Tour(2, "Italy", "We offer acclaimed guided tours in Italy, Official Vatican Tours",
			2, "Flyair", typefood, typetransport, typetour)));
	System.out.println("add tour id=3 - " + port.addTour(new Tour(3, "USA", "New York City: Empire State Building",
		5, "Tritravel", typefood, typetransport, typetour)));
	System.out.println("add tour id=4 - "
		+ port.addTour(new Tour(4, "France", "You can reach many of Paris's main attractions on foot", 6,
			"AllStar", typefood, typetransport, typetour)));
	System.out.println();

	// Вывести туры с именем "France"
	System.out.println("List tours with name 'France'");
	tour_arr = port.findToursByName("France");
	for (Tour tt : tour_arr) {
	    System.out.println(tt.toString());
	}
	System.out.println();
	System.out.println("List tours:");
	tour_arr = port.findAllTours();
	for (Tour tt : tour_arr) {
	    System.out.println(tt.toString());
	}
	System.out.println();

	// Обновление тура
	System.out.println("Update tours:");
	Tour tour_update = new Tour(3, "Canada", "Our Canada tours can take you to the wilds", 1,
		"Canadianlines", typefood, typetransport, typetour);
	System.out.println("update tour id=3 from " + tour_update.toString());
	System.out.println("update tour №3 - " + port.updateTour(tour_update));
	System.out.println();

	// Вывести туры
	System.out.println("List tours:");
	tour_arr = port.findAllTours();
	for (Tour tt : tour_arr) {
	    System.out.println(tt.toString());
	}
	System.out.println();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date1 = sdf.parse("2022-02-23");
	XMLGregorianCalendar xmldate = ConvertDate.toXMLGregorianCalendar(date1);


	BigDecimal decimal = new BigDecimal("100");
	// Добавление даты к туру
/*	System.out.println("Add tourdates:");
	System.out.println("add tourdate id=1 - "
		+ port.addTourDate(new TourDate(1, xmldate, decimal, "German February", port.getTour(1))));
	System.out.println();

	// Вывести тур даты
	System.out.println("List tourdate:");
	tourdate_arr = port.findAllTourDates();
	for (TourDate tt : tourdate_arr) {
	    System.out.println(tt.toString());
	}
	System.out.println();

	// Вывести туры с датами
	System.out.println("List tours with tourdates:");
	tour_arr = port.findAllTours();

	// Получить туры с датами
	for (Tour tt : tour_arr) {
	    System.out.println(tt.toString());
	    tourdate_arr = port.getTourDatesByTour(tt);
	    System.out.println(" TourDate:");
	    for (TourDate tt2 : tourdate_arr) {
		System.out.println("   " + tt2.toString());
	    }
	}
	System.out.println();

	// Обновление тура с датой
	BigDecimal decimal2 = new BigDecimal("110.50");

	System.out.println("Update tourdates:");
	TourDate tourdate_update = new TourDate(1, xmldate, decimal2, "Germany March ", port.getTour(1));
	System.out.println("update tour id=1 from " + tourdate_update.toString());
	System.out.println("update tour №1 - " + port.updateTourDate(tourdate_update));
	System.out.println();
*/
	// Тур по айди
	System.out.println("Get tour id=1 - " + port.getTour(1));
	System.out.println();


	// Удалить тур дату по номеру
	//System.out.println("Delete tourdate id=1 - " + port.deleteTourDate(1));
	//System.out.println();

	// Удалить тур по номеру
	//System.out.println("Delete tour id=1 - " + port.deleteTour(2));
	//System.out.println();


    }

}
