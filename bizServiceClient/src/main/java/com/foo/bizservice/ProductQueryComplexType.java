
package com.foo.bizservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productQueryComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productQueryComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="qty" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productQueryComplexType", propOrder = {
    "queryItem"
})
public class ProductQueryComplexType {

    @XmlElement(required = true)
    protected List<ProductQueryComplexType.QueryItem> queryItem;

    /**
     * Gets the value of the queryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductQueryComplexType.QueryItem }
     * 
     * 
     */
    public List<ProductQueryComplexType.QueryItem> getQueryItem() {
        if (queryItem == null) {
            queryItem = new ArrayList<ProductQueryComplexType.QueryItem>();
        }
        return this.queryItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="qty" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class QueryItem {

        @XmlAttribute(name = "productId")
        protected String productId;
        @XmlAttribute(name = "qty")
        protected Integer qty;

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductId(String value) {
            this.productId = value;
        }

        /**
         * Gets the value of the qty property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQty() {
            return qty;
        }

        /**
         * Sets the value of the qty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQty(Integer value) {
            this.qty = value;
        }

    }

}
