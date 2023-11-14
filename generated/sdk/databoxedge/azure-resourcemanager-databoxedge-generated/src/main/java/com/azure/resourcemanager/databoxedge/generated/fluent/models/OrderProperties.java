// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.Address;
import com.azure.resourcemanager.databoxedge.generated.models.ContactDetails;
import com.azure.resourcemanager.databoxedge.generated.models.OrderStatus;
import com.azure.resourcemanager.databoxedge.generated.models.ShipmentType;
import com.azure.resourcemanager.databoxedge.generated.models.TrackingInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Order properties.
 */
@Fluent
public final class OrderProperties {
    /*
     * It specify the order resource id.
     */
    @JsonProperty(value = "orderId", access = JsonProperty.Access.WRITE_ONLY)
    private String orderId;

    /*
     * The contact details.
     */
    @JsonProperty(value = "contactInformation", required = true)
    private ContactDetails contactInformation;

    /*
     * The shipping address.
     */
    @JsonProperty(value = "shippingAddress")
    private Address shippingAddress;

    /*
     * Current status of the order.
     */
    @JsonProperty(value = "currentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private OrderStatus currentStatus;

    /*
     * List of status changes in the order.
     */
    @JsonProperty(value = "orderHistory", access = JsonProperty.Access.WRITE_ONLY)
    private List<OrderStatus> orderHistory;

    /*
     * Serial number of the device.
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * Tracking information for the package delivered to the customer whether it has an original or a replacement
     * device.
     */
    @JsonProperty(value = "deliveryTrackingInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<TrackingInfo> deliveryTrackingInfo;

    /*
     * Tracking information for the package returned from the customer whether it has an original or a replacement
     * device.
     */
    @JsonProperty(value = "returnTrackingInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<TrackingInfo> returnTrackingInfo;

    /*
     * ShipmentType of the order
     */
    @JsonProperty(value = "shipmentType")
    private ShipmentType shipmentType;

    /**
     * Creates an instance of OrderProperties class.
     */
    public OrderProperties() {
    }

    /**
     * Get the orderId property: It specify the order resource id.
     * 
     * @return the orderId value.
     */
    public String orderId() {
        return this.orderId;
    }

    /**
     * Get the contactInformation property: The contact details.
     * 
     * @return the contactInformation value.
     */
    public ContactDetails contactInformation() {
        return this.contactInformation;
    }

    /**
     * Set the contactInformation property: The contact details.
     * 
     * @param contactInformation the contactInformation value to set.
     * @return the OrderProperties object itself.
     */
    public OrderProperties withContactInformation(ContactDetails contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    /**
     * Get the shippingAddress property: The shipping address.
     * 
     * @return the shippingAddress value.
     */
    public Address shippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Set the shippingAddress property: The shipping address.
     * 
     * @param shippingAddress the shippingAddress value to set.
     * @return the OrderProperties object itself.
     */
    public OrderProperties withShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Get the currentStatus property: Current status of the order.
     * 
     * @return the currentStatus value.
     */
    public OrderStatus currentStatus() {
        return this.currentStatus;
    }

    /**
     * Get the orderHistory property: List of status changes in the order.
     * 
     * @return the orderHistory value.
     */
    public List<OrderStatus> orderHistory() {
        return this.orderHistory;
    }

    /**
     * Get the serialNumber property: Serial number of the device.
     * 
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the deliveryTrackingInfo property: Tracking information for the package delivered to the customer whether it
     * has an original or a replacement device.
     * 
     * @return the deliveryTrackingInfo value.
     */
    public List<TrackingInfo> deliveryTrackingInfo() {
        return this.deliveryTrackingInfo;
    }

    /**
     * Get the returnTrackingInfo property: Tracking information for the package returned from the customer whether it
     * has an original or a replacement device.
     * 
     * @return the returnTrackingInfo value.
     */
    public List<TrackingInfo> returnTrackingInfo() {
        return this.returnTrackingInfo;
    }

    /**
     * Get the shipmentType property: ShipmentType of the order.
     * 
     * @return the shipmentType value.
     */
    public ShipmentType shipmentType() {
        return this.shipmentType;
    }

    /**
     * Set the shipmentType property: ShipmentType of the order.
     * 
     * @param shipmentType the shipmentType value to set.
     * @return the OrderProperties object itself.
     */
    public OrderProperties withShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactInformation() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property contactInformation in model OrderProperties"));
        } else {
            contactInformation().validate();
        }
        if (shippingAddress() != null) {
            shippingAddress().validate();
        }
        if (currentStatus() != null) {
            currentStatus().validate();
        }
        if (orderHistory() != null) {
            orderHistory().forEach(e -> e.validate());
        }
        if (deliveryTrackingInfo() != null) {
            deliveryTrackingInfo().forEach(e -> e.validate());
        }
        if (returnTrackingInfo() != null) {
            returnTrackingInfo().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OrderProperties.class);
}
