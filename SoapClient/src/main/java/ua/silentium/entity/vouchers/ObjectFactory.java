
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.silentium.entity.vouchers package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.silentium.entity.vouchers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VoucherList }
     * 
     */
    public VoucherList createVoucherList() {
        return new VoucherList();
    }

    /**
     * Create an instance of {@link Voucher }
     * 
     */
    public Voucher createVoucher() {
        return new Voucher();
    }

    /**
     * Create an instance of {@link Tour }
     * 
     */
    public Tour createTour() {
        return new Tour();
    }

    /**
     * Create an instance of {@link TypeFood }
     * 
     */
    public TypeFood createTypeFood() {
        return new TypeFood();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link TourDate }
     * 
     */
    public TourDate createTourDate() {
        return new TourDate();
    }

    /**
     * Create an instance of {@link StatusOrder }
     * 
     */
    public StatusOrder createStatusOrder() {
        return new StatusOrder();
    }

    /**
     * Create an instance of {@link StatusVoucher }
     * 
     */
    public StatusVoucher createStatusVoucher() {
        return new StatusVoucher();
    }

    /**
     * Create an instance of {@link TypeTransport }
     * 
     */
    public TypeTransport createTypeTransport() {
        return new TypeTransport();
    }

    /**
     * Create an instance of {@link TypeTour }
     * 
     */
    public TypeTour createTypeTour() {
        return new TypeTour();
    }

}
