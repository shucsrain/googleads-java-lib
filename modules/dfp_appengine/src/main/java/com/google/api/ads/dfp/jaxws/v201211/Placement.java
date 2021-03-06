
package com.google.api.ads.dfp.jaxws.v201211;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Placement} groups related {@code AdUnit} objects.
 *           
 * 
 * <p>Java class for Placement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Placement">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201211}SiteTargetingInfo">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201211}InventoryStatus" minOccurs="0"/>
 *         &lt;element name="isAdSenseTargetingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAdPlannerTargetingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adSenseTargetingLocale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetedAdUnitIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201211}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Placement", propOrder = {
    "id",
    "name",
    "description",
    "placementCode",
    "status",
    "isAdSenseTargetingEnabled",
    "isAdPlannerTargetingEnabled",
    "adSenseTargetingLocale",
    "targetedAdUnitIds",
    "lastModifiedDateTime"
})
public class Placement
    extends SiteTargetingInfo
{

    protected Long id;
    protected String name;
    protected String description;
    protected String placementCode;
    protected InventoryStatus status;
    protected Boolean isAdSenseTargetingEnabled;
    protected Boolean isAdPlannerTargetingEnabled;
    protected String adSenseTargetingLocale;
    protected List<String> targetedAdUnitIds;
    protected DateTime lastModifiedDateTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the placementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementCode() {
        return placementCode;
    }

    /**
     * Sets the value of the placementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementCode(String value) {
        this.placementCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatus }
     *     
     */
    public InventoryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatus }
     *     
     */
    public void setStatus(InventoryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the isAdSenseTargetingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdSenseTargetingEnabled() {
        return isAdSenseTargetingEnabled;
    }

    /**
     * Sets the value of the isAdSenseTargetingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdSenseTargetingEnabled(Boolean value) {
        this.isAdSenseTargetingEnabled = value;
    }

    /**
     * Gets the value of the isAdPlannerTargetingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdPlannerTargetingEnabled() {
        return isAdPlannerTargetingEnabled;
    }

    /**
     * Sets the value of the isAdPlannerTargetingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdPlannerTargetingEnabled(Boolean value) {
        this.isAdPlannerTargetingEnabled = value;
    }

    /**
     * Gets the value of the adSenseTargetingLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdSenseTargetingLocale() {
        return adSenseTargetingLocale;
    }

    /**
     * Sets the value of the adSenseTargetingLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdSenseTargetingLocale(String value) {
        this.adSenseTargetingLocale = value;
    }

    /**
     * Gets the value of the targetedAdUnitIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedAdUnitIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedAdUnitIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetedAdUnitIds() {
        if (targetedAdUnitIds == null) {
            targetedAdUnitIds = new ArrayList<String>();
        }
        return this.targetedAdUnitIds;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastModifiedDateTime(DateTime value) {
        this.lastModifiedDateTime = value;
    }

}
