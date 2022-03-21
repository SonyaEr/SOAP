package ua.silentium;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ua.silentium.entity.vouchers.Tour;
import ua.silentium.entity.vouchers.TourDate;

public class TourServiceData {
    private static TourWebServiceSEI tourService;

    public static TourWebServiceSEI getWorker() {
        return tourService;
    }

    static {
        TourService service = new TourService();
        tourService = service.getTourServicePort();
        
        List<Tour> data = tourService.findAllTours();
        /**        try {
            data = loadData();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }**/
 /*       if (!Objects.isNull(data) && data.size() == 0) 
            { for (int i = 0; i < data.size(); i++) {
        	tourService.addTour(data.get(i));
            }
        }*/
 /*       List<TourDate> dataTourDate = null;
        try {
            dataTourDate = loadDataTourDate();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        if (!Objects.isNull(dataTourDate)) //&& tourService.findAllTourDates().size() == 0) {
            {for (int i = 0; i < dataTourDate.size(); i++) {
        	tourService.addTourDate(dataTourDate.get(i));
            }
        }*/
    }
    /*
    private static List<TourDate> loadDataTourDate() throws DatatypeConfigurationException {
        List<TourDate> data = new ArrayList<>();
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar("2022-01-21");
        XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar("2022-02-28");
        BigDecimal price = new BigDecimal("150.50"); 
        BigDecimal price2 = new BigDecimal("160");
        data.add(new TourDate(1, date, price, "TourDate name", new Tour ("France", "France tour description", 5, "Flyair", "Breakfast and dinner", "Airpale", "Excursion")));
        data.add(new TourDate(2, date2, price2, "TourDate name", new Tour ("France", "France tour description", 5, "Flyair", "Breakfast and dinner", "Airpale", "Excursion")));
        data.add(new TourDate(3, date, price2, "TourDate name", new Tour ("Germany", "Germany tour description", 2, "Flyair", "Breakfast", "Bus", "Rest day")));
        
        return data;
    }
    */

    private static List<Tour> loadData() throws DatatypeConfigurationException {
        List<Tour> data = new ArrayList<>();
        data.add(new Tour("France", "France tour description", 5, "Flyair", "Breakfast and dinner", "Airpale", "Excursion"));
        data.add(new Tour("Germany", "Germany tour description", 2, "Flyair", "Breakfast", "Bus", "Rest day"));
        data.add(new Tour("Italy", "Italy tour description", 3, "Flyair", "All inclusive", "Airpale", "Gastro tour"));
        data.add(new Tour("Poland", "Poland tour description", 4, "Flyair", "Breakfast and dinner", "Bus", "Excursion"));
        return data;
    }

}
