
package ua.silentium;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the ua.silentium package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TourServiceImpl_QNAME = new QName("http://silentium.ua", "TourServiceImpl");
    private final static QName _TourServiceImplResponse_QNAME = new QName("http://silentium.ua",
	    "TourServiceImplResponse");
    private final static QName _AddTour_QNAME = new QName("http://silentium.ua", "addTour");
    private final static QName _AddTourDate_QNAME = new QName("http://silentium.ua", "addTourDate");
    private final static QName _AddTourDateResponse_QNAME = new QName("http://silentium.ua", "addTourDateResponse");
    private final static QName _AddTourResponse_QNAME = new QName("http://silentium.ua", "addTourResponse");
    private final static QName _DeleteTour_QNAME = new QName("http://silentium.ua", "deleteTour");
    private final static QName _DeleteTourDate_QNAME = new QName("http://silentium.ua", "deleteTourDate");
    private final static QName _DeleteTourDateResponse_QNAME = new QName("http://silentium.ua",
	    "deleteTourDateResponse");
    private final static QName _DeleteTourResponse_QNAME = new QName("http://silentium.ua", "deleteTourResponse");
    private final static QName _FindAllTourDates_QNAME = new QName("http://silentium.ua", "findAllTourDates");
    private final static QName _FindAllTourDatesResponse_QNAME = new QName("http://silentium.ua",
	    "findAllTourDatesResponse");
    private final static QName _FindAllTours_QNAME = new QName("http://silentium.ua", "findAllTours");
    private final static QName _FindAllToursResponse_QNAME = new QName("http://silentium.ua", "findAllToursResponse");

    private final static QName _FindAllTypeFood_QNAME = new QName("http://silentium.ua", "findAllTypeFood");
    private final static QName _FindAllTypeFoodResponse_QNAME = new QName("http://silentium.ua",
	    "findAllTypeFoodResponse");

    private final static QName _FindAllTypeTransport_QNAME = new QName("http://silentium.ua", "findAllTypeTransport");
    private final static QName _FindAllTypeTransportResponse_QNAME = new QName("http://silentium.ua",
	    "findAllTypeTransportResponse");

    private final static QName _FindAllTypeTour_QNAME = new QName("http://silentium.ua", "findAllTypeTour");
    private final static QName _FindAllTypeTourResponse_QNAME = new QName("http://silentium.ua",
	    "findAllTypeTourResponse");

    private final static QName _FindAllStatusOrder_QNAME = new QName("http://silentium.ua", "findAllStatusOrder");
    private final static QName _FindAllStatusOrderResponse_QNAME = new QName("http://silentium.ua",
	    "findAllStatusOrderResponse");

    private final static QName _FindAllStatusVoucher_QNAME = new QName("http://silentium.ua", "findStatusVoucher");
    private final static QName _FindAllStatusVoucherResponse_QNAME = new QName("http://silentium.ua",
	    "findAllStatusVoucherResponse");

    private final static QName _FindToursByName_QNAME = new QName("http://silentium.ua", "findToursByName");
    private final static QName _FindToursByNameResponse_QNAME = new QName("http://silentium.ua",
	    "findToursByNameResponse");
    private final static QName _GetTour_QNAME = new QName("http://silentium.ua", "getTour");
    private final static QName _GetTourDatesByTourId_QNAME = new QName("http://silentium.ua", "getTourDatesByTourId");
    private final static QName _GetTourDatesByTourIdResponse_QNAME = new QName("http://silentium.ua",
	    "getTourDatesByTourIdResponse");
    private final static QName _GetTourResponse_QNAME = new QName("http://silentium.ua", "getTourResponse");
    private final static QName _UpdateTour_QNAME = new QName("http://silentium.ua", "updateTour");
    private final static QName _UpdateTourDate_QNAME = new QName("http://silentium.ua", "updateTourDate");
    private final static QName _UpdateTourDateResponse_QNAME = new QName("http://silentium.ua",
	    "updateTourDateResponse");
    private final static QName _UpdateTourResponse_QNAME = new QName("http://silentium.ua", "updateTourResponse");

    private final static QName _AddPerson_QNAME = new QName("http://silentium.ua", "addPerson");
    private final static QName _AddPersonResponse_QNAME = new QName("http://silentium.ua", "addPersonResponse");
    private final static QName _CheckPerson_QNAME = new QName("http://silentium.ua", "checkPerson");
    private final static QName _CheckPersonResponse_QNAME = new QName("http://silentium.ua", "checkPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://silentium.ua", "deletePerson");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://silentium.ua", "deletePersonResponse");
    private final static QName _GetPerson_QNAME = new QName("http://silentium.ua", "getPerson");
    private final static QName _GetPersonResponse_QNAME = new QName("http://silentium.ua", "getPersonResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://silentium.ua", "updatePerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://silentium.ua", "updatePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package: ua.silentium
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TourServiceImpl }
     * 
     */
    public TourServiceImpl createTourServiceImpl() {
	return new TourServiceImpl();
    }

    /**
     * Create an instance of {@link TourServiceImplResponse }
     * 
     */
    public TourServiceImplResponse createTourServiceImplResponse() {
	return new TourServiceImplResponse();
    }

    /**
     * Create an instance of {@link AddTour }
     * 
     */
    public AddTour createAddTour() {
	return new AddTour();
    }

    /**
     * Create an instance of {@link AddTourDate }
     * 
     */
    public AddTourDate createAddTourDate() {
	return new AddTourDate();
    }

    /**
     * Create an instance of {@link AddTourDateResponse }
     * 
     */
    public AddTourDateResponse createAddTourDateResponse() {
	return new AddTourDateResponse();
    }

    /**
     * Create an instance of {@link AddTourResponse }
     * 
     */
    public AddTourResponse createAddTourResponse() {
	return new AddTourResponse();
    }

    /**
     * Create an instance of {@link DeleteTour }
     * 
     */
    public DeleteTour createDeleteTour() {
	return new DeleteTour();
    }

    /**
     * Create an instance of {@link DeleteTourDate }
     * 
     */
    public DeleteTourDate createDeleteTourDate() {
	return new DeleteTourDate();
    }

    /**
     * Create an instance of {@link DeleteTourDateResponse }
     * 
     */
    public DeleteTourDateResponse createDeleteTourDateResponse() {
	return new DeleteTourDateResponse();
    }

    /**
     * Create an instance of {@link DeleteTourResponse }
     * 
     */
    public DeleteTourResponse createDeleteTourResponse() {
	return new DeleteTourResponse();
    }

    /**
     * Create an instance of {@link FindAllTourDates }
     * 
     */
    public FindAllTourDates createFindAllTourDates() {
	return new FindAllTourDates();
    }

    /**
     * Create an instance of {@link FindAllTourDatesResponse }
     * 
     */
    public FindAllTourDatesResponse createFindAllTourDatesResponse() {
	return new FindAllTourDatesResponse();
    }

    /**
     * Create an instance of {@link FindAllTours }
     * 
     */
    public FindAllTours createFindAllTours() {
	return new FindAllTours();
    }

    /**
     * Create an instance of {@link FindAllToursResponse }
     * 
     */
    public FindAllToursResponse createFindAllToursResponse() {
	return new FindAllToursResponse();
    }

    /**
     * Create an instance of {@link FindAllTypeFood }
     * 
     */
    public FindAllTypeFood createFindAllTypeFood() {
	return new FindAllTypeFood();
    }

    /**
     * Create an instance of {@link FindAllTypeFoodResponse }
     * 
     */
    public FindAllTypeFoodResponse createFindAllTypeFoodResponse() {
	return new FindAllTypeFoodResponse();
    }

    /**
     * Create an instance of {@link FindAllTypeTransport }
     * 
     */
    public FindAllTypeTransport createFindAllTypeTransport() {
	return new FindAllTypeTransport();
    }

    /**
     * Create an instance of {@link FindAllTypeTransportResponse }
     * 
     */
    public FindAllTypeTransportResponse createFindAllTypeTransportResponse() {
	return new FindAllTypeTransportResponse();
    }

    /**
     * Create an instance of {@link FindAllTypeTour }
     * 
     */
    public FindAllTypeTour createFindAllTypeTour() {
	return new FindAllTypeTour();
    }

    /**
     * Create an instance of {@link FindAllTypeTourResponse }
     * 
     */
    public FindAllTypeTourResponse createFindAllTypeTourResponse() {
	return new FindAllTypeTourResponse();
    }

    /**
     * Create an instance of {@link FindAllStatusOrder }
     * 
     */
    public FindAllStatusOrder createFindAllStatusOrder() {
	return new FindAllStatusOrder();
    }

    /**
     * Create an instance of {@link FindAllStatusOrderResponse }
     * 
     */
    public FindAllStatusOrderResponse createFindAllStatusOrderResponse() {
	return new FindAllStatusOrderResponse();
    }

    /**
     * Create an instance of {@link FindAllStatusVoucher }
     * 
     */
    public FindAllStatusVoucher createFindAllStatusVoucher() {
	return new FindAllStatusVoucher();
    }

    /**
     * Create an instance of {@link FindAllStatusVoucherResponse }
     * 
     */
    public FindAllStatusVoucherResponse createFindAllStatusVoucherResponse() {
	return new FindAllStatusVoucherResponse();
    }

    /**
     * Create an instance of {@link FindToursByName }
     * 
     */

    public FindToursByName createFindToursByName() {
	return new FindToursByName();
    }

    /**
     * Create an instance of {@link FindToursByNameResponse }
     * 
     */
    public FindToursByNameResponse createFindToursByNameResponse() {
	return new FindToursByNameResponse();
    }

    /**
     * Create an instance of {@link GetTour }
     * 
     */
    public GetTour createGetTour() {
	return new GetTour();
    }

    /**
     * Create an instance of {@link GetTourDatesByTourId }
     * 
     */
    public GetTourDatesByTourId createGetTourDatesByTourId() {
	return new GetTourDatesByTourId();
    }

    /**
     * Create an instance of {@link GetTourDatesByTourIdResponse }
     * 
     */
    public GetTourDatesByTourIdResponse createGetTourDatesByTourIdResponse() {
	return new GetTourDatesByTourIdResponse();
    }

    /**
     * Create an instance of {@link GetTourResponse }
     * 
     */
    public GetTourResponse createGetTourResponse() {
	return new GetTourResponse();
    }

    /**
     * Create an instance of {@link UpdateTour }
     * 
     */
    public UpdateTour createUpdateTour() {
	return new UpdateTour();
    }

    /**
     * Create an instance of {@link UpdateTourDate }
     * 
     */
    public UpdateTourDate createUpdateTourDate() {
	return new UpdateTourDate();
    }

    /**
     * Create an instance of {@link UpdateTourDateResponse }
     * 
     */
    public UpdateTourDateResponse createUpdateTourDateResponse() {
	return new UpdateTourDateResponse();
    }

    /**
     * Create an instance of {@link UpdateTourResponse }
     * 
     */
    public UpdateTourResponse createUpdateTourResponse() {
	return new UpdateTourResponse();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TourServiceImpl
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link TourServiceImpl }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "TourServiceImpl")
    public JAXBElement<TourServiceImpl> createTourServiceImpl(TourServiceImpl value) {
	return new JAXBElement<TourServiceImpl>(_TourServiceImpl_QNAME, TourServiceImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link TourServiceImplResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link TourServiceImplResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "TourServiceImplResponse")
    public JAXBElement<TourServiceImplResponse> createTourServiceImplResponse(TourServiceImplResponse value) {
	return new JAXBElement<TourServiceImplResponse>(_TourServiceImplResponse_QNAME, TourServiceImplResponse.class,
		null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTour }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddTour
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "addTour")
    public JAXBElement<AddTour> createAddTour(AddTour value) {
	return new JAXBElement<AddTour>(_AddTour_QNAME, AddTour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTourDate
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddTourDate
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "addTourDate")
    public JAXBElement<AddTourDate> createAddTourDate(AddTourDate value) {
	return new JAXBElement<AddTourDate>(_AddTourDate_QNAME, AddTourDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTourDateResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link AddTourDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "addTourDateResponse")
    public JAXBElement<AddTourDateResponse> createAddTourDateResponse(AddTourDateResponse value) {
	return new JAXBElement<AddTourDateResponse>(_AddTourDateResponse_QNAME, AddTourDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTourResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link AddTourResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "addTourResponse")
    public JAXBElement<AddTourResponse> createAddTourResponse(AddTourResponse value) {
	return new JAXBElement<AddTourResponse>(_AddTourResponse_QNAME, AddTourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTour
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteTour
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "deleteTour")
    public JAXBElement<DeleteTour> createDeleteTour(DeleteTour value) {
	return new JAXBElement<DeleteTour>(_DeleteTour_QNAME, DeleteTour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTourDate
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link DeleteTourDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "deleteTourDate")
    public JAXBElement<DeleteTourDate> createDeleteTourDate(DeleteTourDate value) {
	return new JAXBElement<DeleteTourDate>(_DeleteTourDate_QNAME, DeleteTourDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link DeleteTourDateResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link DeleteTourDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "deleteTourDateResponse")
    public JAXBElement<DeleteTourDateResponse> createDeleteTourDateResponse(DeleteTourDateResponse value) {
	return new JAXBElement<DeleteTourDateResponse>(_DeleteTourDateResponse_QNAME, DeleteTourDateResponse.class,
		null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTourResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link DeleteTourResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "deleteTourResponse")
    public JAXBElement<DeleteTourResponse> createDeleteTourResponse(DeleteTourResponse value) {
	return new JAXBElement<DeleteTourResponse>(_DeleteTourResponse_QNAME, DeleteTourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTourDates
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTourDates }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTourDates")
    public JAXBElement<FindAllTourDates> createFindAllTourDates(FindAllTourDates value) {
	return new JAXBElement<FindAllTourDates>(_FindAllTourDates_QNAME, FindAllTourDates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllTourDatesResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTourDatesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTourDatesResponse")
    public JAXBElement<FindAllTourDatesResponse> createFindAllTourDatesResponse(FindAllTourDatesResponse value) {
	return new JAXBElement<FindAllTourDatesResponse>(_FindAllTourDatesResponse_QNAME,
		FindAllTourDatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTours
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FindAllTours
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTours")
    public JAXBElement<FindAllTours> createFindAllTours(FindAllTours value) {
	return new JAXBElement<FindAllTours>(_FindAllTours_QNAME, FindAllTours.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllToursResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllToursResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllToursResponse")
    public JAXBElement<FindAllToursResponse> createFindAllToursResponse(FindAllToursResponse value) {
	return new JAXBElement<FindAllToursResponse>(_FindAllToursResponse_QNAME, FindAllToursResponse.class, null,
		value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTypeFood
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTypeFood }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTypeFood")
    public JAXBElement<FindAllTypeFood> createFindAllTypeFood(FindAllTypeFood value) {
	return new JAXBElement<FindAllTypeFood>(_FindAllTypeFood_QNAME, FindAllTypeFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllTypeFoodResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTypeFoodResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTypeFoodResponse")
    public JAXBElement<FindAllTypeFoodResponse> createFindAllTypeFoodResponse(FindAllTypeFoodResponse value) {
	return new JAXBElement<FindAllTypeFoodResponse>(_FindAllTypeFoodResponse_QNAME, FindAllTypeFoodResponse.class,
		null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllTypeTransport }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTypeTransport }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTypeTransport")
    public JAXBElement<FindAllTypeTransport> createFindAllTypeTransport(FindAllTypeTransport value) {
	return new JAXBElement<FindAllTypeTransport>(_FindAllTypeTransport_QNAME, FindAllTypeTransport.class, null,
		value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllTypeTransportResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTypeTransportResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTypeTransportResponse")
    public JAXBElement<FindAllTypeTransportResponse> createFindAllTypeTransportResponse(
	    FindAllTypeTransportResponse value) {
	return new JAXBElement<FindAllTypeTransportResponse>(_FindAllTypeTransportResponse_QNAME,
		FindAllTypeTransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTypeTour
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTypeTour }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTypeTour")
    public JAXBElement<FindAllTypeTour> createFindAllTypeTour(FindAllTypeTour value) {
	return new JAXBElement<FindAllTypeTour>(_FindAllTypeTour_QNAME, FindAllTypeTour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllTypeTourResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllTypeTourResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllTypeTourResponse")
    public JAXBElement<FindAllTypeTourResponse> createFindAllTypeTourResponse(FindAllTypeTourResponse value) {
	return new JAXBElement<FindAllTypeTourResponse>(_FindAllTypeTourResponse_QNAME, FindAllTypeTourResponse.class,
		null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllStatusOrder
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllStatusOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllStatusOrder")
    public JAXBElement<FindAllStatusOrder> createFindAllStatusOrder(FindAllStatusOrder value) {
	return new JAXBElement<FindAllStatusOrder>(_FindAllStatusOrder_QNAME, FindAllStatusOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllStatusOrderResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllStatusOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllStatusOrderResponse")
    public JAXBElement<FindAllStatusOrderResponse> createFindAllStatusOrderResponse(FindAllStatusOrderResponse value) {
	return new JAXBElement<FindAllStatusOrderResponse>(_FindAllStatusOrderResponse_QNAME,
		FindAllStatusOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllStatusVoucher }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllStatusVoucher }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllStatusVoucher")
    public JAXBElement<FindAllStatusVoucher> createFindAllStatusVoucher(FindAllStatusVoucher value) {
	return new JAXBElement<FindAllStatusVoucher>(_FindAllStatusVoucher_QNAME, FindAllStatusVoucher.class, null,
		value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindAllStatusVoucherResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindAllStatusVoucherResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findAllStatusVoucherResponse")
    public JAXBElement<FindAllStatusVoucherResponse> createFindAllStatusVoucherResponse(
	    FindAllStatusVoucherResponse value) {
	return new JAXBElement<FindAllStatusVoucherResponse>(_FindAllStatusVoucherResponse_QNAME,
		FindAllStatusVoucherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindToursByName
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindToursByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findToursByName")
    public JAXBElement<FindToursByName> createFindToursByName(FindToursByName value) {
	return new JAXBElement<FindToursByName>(_FindToursByName_QNAME, FindToursByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link FindToursByNameResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link FindToursByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "findToursByNameResponse")
    public JAXBElement<FindToursByNameResponse> createFindToursByNameResponse(FindToursByNameResponse value) {
	return new JAXBElement<FindToursByNameResponse>(_FindToursByNameResponse_QNAME, FindToursByNameResponse.class,
		null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTour }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetTour
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "getTour")
    public JAXBElement<GetTour> createGetTour(GetTour value) {
	return new JAXBElement<GetTour>(_GetTour_QNAME, GetTour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link GetTourDatesByTourId }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link GetTourDatesByTourId }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "getTourDatesByTour")
    public JAXBElement<GetTourDatesByTourId> createGetTourDatesByTourId(GetTourDatesByTourId value) {
	return new JAXBElement<GetTourDatesByTourId>(_GetTourDatesByTourId_QNAME, GetTourDatesByTourId.class, null,
		value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link GetTourDatesByTourIdResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link GetTourDatesByTourIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "getTourDatesByTourIdResponse")
    public JAXBElement<GetTourDatesByTourIdResponse> createGetTourDatesByTourIdResponse(
	    GetTourDatesByTourIdResponse value) {
	return new JAXBElement<GetTourDatesByTourIdResponse>(_GetTourDatesByTourIdResponse_QNAME,
		GetTourDatesByTourIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTourResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link GetTourResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "getTourResponse")
    public JAXBElement<GetTourResponse> createGetTourResponse(GetTourResponse value) {
	return new JAXBElement<GetTourResponse>(_GetTourResponse_QNAME, GetTourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTour
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateTour
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "updateTour")
    public JAXBElement<UpdateTour> createUpdateTour(UpdateTour value) {
	return new JAXBElement<UpdateTour>(_UpdateTour_QNAME, UpdateTour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTourDate
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link UpdateTourDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "updateTourDate")
    public JAXBElement<UpdateTourDate> createUpdateTourDate(UpdateTourDate value) {
	return new JAXBElement<UpdateTourDate>(_UpdateTourDate_QNAME, UpdateTourDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link UpdateTourDateResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link UpdateTourDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "updateTourDateResponse")
    public JAXBElement<UpdateTourDateResponse> createUpdateTourDateResponse(UpdateTourDateResponse value) {
	return new JAXBElement<UpdateTourDateResponse>(_UpdateTourDateResponse_QNAME, UpdateTourDateResponse.class,
		null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTourResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link UpdateTourResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "updateTourResponse")
    public JAXBElement<UpdateTourResponse> createUpdateTourResponse(UpdateTourResponse value) {
	return new JAXBElement<UpdateTourResponse>(_UpdateTourResponse_QNAME, UpdateTourResponse.class, null, value);
    }

    public AddPerson createAddPerson() {
	return new AddPerson();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
	return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link CheckPerson }
     * 
     */
    public CheckPerson createCheckPerson() {
	return new CheckPerson();
    }

    /**
     * Create an instance of {@link CheckPersonResponse }
     * 
     */
    public CheckPersonResponse createCheckPersonResponse() {
	return new CheckPersonResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
	return new DeletePerson();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
	return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
	return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
	return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
	return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
	return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
	return new Date();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddPerson
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
	return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link AddPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
	return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPerson
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CheckPerson
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "checkPerson")
    public JAXBElement<CheckPerson> createCheckPerson(CheckPerson value) {
	return new JAXBElement<CheckPerson>(_CheckPerson_QNAME, CheckPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPersonResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link CheckPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "checkPersonResponse")
    public JAXBElement<CheckPersonResponse> createCheckPersonResponse(CheckPersonResponse value) {
	return new JAXBElement<CheckPersonResponse>(_CheckPersonResponse_QNAME, CheckPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeletePerson
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
	return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link DeletePersonResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link DeletePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
	return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null,
		value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPerson
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
	return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link GetPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
	return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson
     * }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdatePerson
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
	return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link UpdatePersonResponse }{@code >}
     * 
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link UpdatePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://silentium.ua", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
	return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null,
		value);
    }

}
