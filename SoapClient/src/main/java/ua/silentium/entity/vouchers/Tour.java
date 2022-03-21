
package ua.silentium.entity.vouchers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ua.silentium.entity.Entity;


/**
 * <p>Java class for Tour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://silentium.ua/entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tour_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tour_description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quantity_night" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tour_operator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type_food" type="{http://silentium.ua/entity/vouchers}Type_food"/&gt;
 *         &lt;element name="Type_transport" type="{http://silentium.ua/entity/vouchers}Type_transport"/&gt;
 *         &lt;element name="Type_tour" type="{http://silentium.ua/entity/vouchers}Type_tour"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tour", propOrder = {
    "tourName",
    "tourDescription",
    "quantityNight",
    "tourOperator",
    "typeFood",
    "typeTransport",
    "typeTour"
})
public class Tour
    extends Entity
{

    @XmlElement(name = "tour_name", required = true)
    protected String tourName;
    @XmlElement(name = "tour_description", required = true)
    protected String tourDescription;
    @XmlElement(name = "quantity_night")
    protected int quantityNight;
    @XmlElement(name = "tour_operator", required = true)
    protected String tourOperator;
    @XmlElement(name = "Type_food", required = true)
    protected TypeFood typeFood;
    @XmlElement(name = "Type_transport", required = true)
    protected TypeTransport typeTransport;
    @XmlElement(name = "Type_tour", required = true)
    protected TypeTour typeTour;

    public Tour(int idTour, String tourName, String tourDescription, int quantityNight, 
	    String tourOperator, TypeFood typeFood, TypeTransport typeTransport, TypeTour typeTour) {
	this.id = idTour;
	this.tourName = tourName;
	this.tourDescription = tourDescription;
	this.quantityNight = quantityNight;
	this.tourOperator = tourOperator;
	this.typeFood = typeFood;
	this.typeTransport = typeTransport;
	this.typeTour = typeTour;
    }
    
    public Tour(int idTour,String tourName, String tourDescription, int quantityNight, 
	    String tourOperator, String typeFood, String typeTransport, String typeTour) {
	this.id = idTour;
	this.tourName = tourName;
	this.tourDescription = tourDescription;
	this.quantityNight = quantityNight;
	this.tourOperator = tourOperator;
	this.typeFood = new TypeFood(typeFood);
	this.typeTransport = new TypeTransport(typeTransport);
	this.typeTour = new TypeTour (typeTour);
	// TODO Auto-generated constructor stub
    }
    
    public Tour( String tourName, String tourDescription, int quantityNight, 
	    String tourOperator, String typeFood, String typeTransport, String typeTour) {
	this.tourName = tourName;
	this.tourDescription = tourDescription;
	this.quantityNight = quantityNight;
	this.tourOperator = tourOperator;
	this.typeFood = new TypeFood(typeFood);
	this.typeTransport = new TypeTransport(typeTransport);
	this.typeTour = new TypeTour (typeTour);
    }
    public Tour() {
    }
    /**
     * Gets the value of the tourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourName() {
        return tourName;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourName(String value) {
        this.tourName = value;
    }

    /**
     * Gets the value of the tourDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourDescription() {
        return tourDescription;
    }

    /**
     * Sets the value of the tourDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourDescription(String value) {
        this.tourDescription = value;
    }

    /**
     * Gets the value of the quantityNight property.
     * 
     */
    public int getQuantityNight() {
        return quantityNight;
    }

    /**
     * Sets the value of the quantityNight property.
     * 
     */
    public void setQuantityNight(int value) {
        this.quantityNight = value;
    }

    /**
     * Gets the value of the tourOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperator() {
        return tourOperator;
    }

    /**
     * Sets the value of the tourOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperator(String value) {
        this.tourOperator = value;
    }

    /**
     * Gets the value of the typeFood property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFood }
     *     
     */
    public TypeFood getTypeFood() {
        return typeFood;
    }

    /**
     * Sets the value of the typeFood property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFood }
     *     
     */
    public void setTypeFood(TypeFood value) {
        this.typeFood = value;
    }

    /**
     * Gets the value of the typeTransport property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransport }
     *     
     */
    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    /**
     * Sets the value of the typeTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransport }
     *     
     */
    public void setTypeTransport(TypeTransport value) {
        this.typeTransport = value;
    }

    /**
     * Gets the value of the typeTour property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTour }
     *     
     */
    public TypeTour getTypeTour() {
        return typeTour;
    }

    /**
     * Sets the value of the typeTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTour }
     *     
     */
    public void setTypeTour(TypeTour value) {
        this.typeTour = value;
    }
    @Override
    public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tour(tourName=");
		builder.append(tourName);
		builder.append(", tourDescription=");
		builder.append(tourDescription);
		builder.append(", quantityNight=");
		builder.append(quantityNight);
		builder.append(", tourOperator=");
		builder.append(tourOperator);
		builder.append(", typeFood=");
		builder.append(typeFood);
		builder.append(", typeTransport=");
		builder.append(typeTransport);
		builder.append(", typeTour=");
		builder.append(typeTour);

		builder.append(")");
		return builder.toString();
    }

}
