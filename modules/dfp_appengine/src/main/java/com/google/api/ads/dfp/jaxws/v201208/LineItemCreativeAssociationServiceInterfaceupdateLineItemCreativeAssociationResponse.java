
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateLineItemCreativeAssociationResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateLineItemCreativeAssociationResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rval" type="{https://www.google.com/apis/ads/publisher/v201208}LineItemCreativeAssociation" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rval"
})
@XmlRootElement(name = "updateLineItemCreativeAssociationResponse")
public class LineItemCreativeAssociationServiceInterfaceupdateLineItemCreativeAssociationResponse {

    protected LineItemCreativeAssociation rval;

    /**
     * Gets the value of the rval property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemCreativeAssociation }
     *     
     */
    public LineItemCreativeAssociation getRval() {
        return rval;
    }

    /**
     * Sets the value of the rval property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemCreativeAssociation }
     *     
     */
    public void setRval(LineItemCreativeAssociation value) {
        this.rval = value;
    }

}
