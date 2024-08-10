// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.models.Address;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.ContactDetails;
import com.azure.resourcemanager.databoxedge.generated.models.OrderStatus;
import com.azure.resourcemanager.databoxedge.generated.models.ShipmentType;
import com.azure.resourcemanager.databoxedge.generated.models.TrackingInfo;
import java.io.IOException;
import java.util.List;

/**
 * The order details.
 */
@Fluent
public final class OrderInner extends ArmBaseModel {
    /*
     * It specify the order api version.
     */
    private String kind;

    /*
     * Metadata pertaining to creation and last modification of Order
     */
    private SystemData systemData;

    /*
     * The order properties.
     */
    private OrderProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of OrderInner class.
     */
    public OrderInner() {
    }

    /**
     * Get the kind property: It specify the order api version.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of Order.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: The order properties.
     * 
     * @return the innerProperties value.
     */
    private OrderProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the orderId property: It specify the order resource id.
     * 
     * @return the orderId value.
     */
    public String orderId() {
        return this.innerProperties() == null ? null : this.innerProperties().orderId();
    }

    /**
     * Get the contactInformation property: The contact details.
     * 
     * @return the contactInformation value.
     */
    public ContactDetails contactInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().contactInformation();
    }

    /**
     * Set the contactInformation property: The contact details.
     * 
     * @param contactInformation the contactInformation value to set.
     * @return the OrderInner object itself.
     */
    public OrderInner withContactInformation(ContactDetails contactInformation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OrderProperties();
        }
        this.innerProperties().withContactInformation(contactInformation);
        return this;
    }

    /**
     * Get the shippingAddress property: The shipping address.
     * 
     * @return the shippingAddress value.
     */
    public Address shippingAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().shippingAddress();
    }

    /**
     * Set the shippingAddress property: The shipping address.
     * 
     * @param shippingAddress the shippingAddress value to set.
     * @return the OrderInner object itself.
     */
    public OrderInner withShippingAddress(Address shippingAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OrderProperties();
        }
        this.innerProperties().withShippingAddress(shippingAddress);
        return this;
    }

    /**
     * Get the currentStatus property: Current status of the order.
     * 
     * @return the currentStatus value.
     */
    public OrderStatus currentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().currentStatus();
    }

    /**
     * Get the orderHistory property: List of status changes in the order.
     * 
     * @return the orderHistory value.
     */
    public List<OrderStatus> orderHistory() {
        return this.innerProperties() == null ? null : this.innerProperties().orderHistory();
    }

    /**
     * Get the serialNumber property: Serial number of the device.
     * 
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().serialNumber();
    }

    /**
     * Get the deliveryTrackingInfo property: Tracking information for the package delivered to the customer whether it
     * has an original or a replacement device.
     * 
     * @return the deliveryTrackingInfo value.
     */
    public List<TrackingInfo> deliveryTrackingInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryTrackingInfo();
    }

    /**
     * Get the returnTrackingInfo property: Tracking information for the package returned from the customer whether it
     * has an original or a replacement device.
     * 
     * @return the returnTrackingInfo value.
     */
    public List<TrackingInfo> returnTrackingInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().returnTrackingInfo();
    }

    /**
     * Get the shipmentType property: ShipmentType of the order.
     * 
     * @return the shipmentType value.
     */
    public ShipmentType shipmentType() {
        return this.innerProperties() == null ? null : this.innerProperties().shipmentType();
    }

    /**
     * Set the shipmentType property: ShipmentType of the order.
     * 
     * @param shipmentType the shipmentType value to set.
     * @return the OrderInner object itself.
     */
    public OrderInner withShipmentType(ShipmentType shipmentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OrderProperties();
        }
        this.innerProperties().withShipmentType(shipmentType);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OrderInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OrderInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OrderInner.
     */
    public static OrderInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OrderInner deserializedOrderInner = new OrderInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedOrderInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedOrderInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedOrderInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedOrderInner.kind = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedOrderInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedOrderInner.innerProperties = OrderProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOrderInner;
        });
    }
}
