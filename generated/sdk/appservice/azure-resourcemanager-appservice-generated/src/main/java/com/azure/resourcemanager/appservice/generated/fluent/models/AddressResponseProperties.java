// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.VirtualIpMapping;
import java.io.IOException;
import java.util.List;

/**
 * AddressResponse resource specific properties.
 */
@Fluent
public final class AddressResponseProperties implements JsonSerializable<AddressResponseProperties> {
    /*
     * Main public virtual IP.
     */
    private String serviceIpAddress;

    /*
     * Virtual Network internal IP address of the App Service Environment if it is in internal load-balancing mode.
     */
    private String internalIpAddress;

    /*
     * IP addresses appearing on outbound connections.
     */
    private List<String> outboundIpAddresses;

    /*
     * Additional virtual IPs.
     */
    private List<VirtualIpMapping> vipMappings;

    /**
     * Creates an instance of AddressResponseProperties class.
     */
    public AddressResponseProperties() {
    }

    /**
     * Get the serviceIpAddress property: Main public virtual IP.
     * 
     * @return the serviceIpAddress value.
     */
    public String serviceIpAddress() {
        return this.serviceIpAddress;
    }

    /**
     * Set the serviceIpAddress property: Main public virtual IP.
     * 
     * @param serviceIpAddress the serviceIpAddress value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withServiceIpAddress(String serviceIpAddress) {
        this.serviceIpAddress = serviceIpAddress;
        return this;
    }

    /**
     * Get the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     * 
     * @return the internalIpAddress value.
     */
    public String internalIpAddress() {
        return this.internalIpAddress;
    }

    /**
     * Set the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     * 
     * @param internalIpAddress the internalIpAddress value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withInternalIpAddress(String internalIpAddress) {
        this.internalIpAddress = internalIpAddress;
        return this;
    }

    /**
     * Get the outboundIpAddresses property: IP addresses appearing on outbound connections.
     * 
     * @return the outboundIpAddresses value.
     */
    public List<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Set the outboundIpAddresses property: IP addresses appearing on outbound connections.
     * 
     * @param outboundIpAddresses the outboundIpAddresses value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withOutboundIpAddresses(List<String> outboundIpAddresses) {
        this.outboundIpAddresses = outboundIpAddresses;
        return this;
    }

    /**
     * Get the vipMappings property: Additional virtual IPs.
     * 
     * @return the vipMappings value.
     */
    public List<VirtualIpMapping> vipMappings() {
        return this.vipMappings;
    }

    /**
     * Set the vipMappings property: Additional virtual IPs.
     * 
     * @param vipMappings the vipMappings value to set.
     * @return the AddressResponseProperties object itself.
     */
    public AddressResponseProperties withVipMappings(List<VirtualIpMapping> vipMappings) {
        this.vipMappings = vipMappings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vipMappings() != null) {
            vipMappings().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("serviceIpAddress", this.serviceIpAddress);
        jsonWriter.writeStringField("internalIpAddress", this.internalIpAddress);
        jsonWriter.writeArrayField("outboundIpAddresses", this.outboundIpAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("vipMappings", this.vipMappings, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AddressResponseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AddressResponseProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AddressResponseProperties.
     */
    public static AddressResponseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AddressResponseProperties deserializedAddressResponseProperties = new AddressResponseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceIpAddress".equals(fieldName)) {
                    deserializedAddressResponseProperties.serviceIpAddress = reader.getString();
                } else if ("internalIpAddress".equals(fieldName)) {
                    deserializedAddressResponseProperties.internalIpAddress = reader.getString();
                } else if ("outboundIpAddresses".equals(fieldName)) {
                    List<String> outboundIpAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedAddressResponseProperties.outboundIpAddresses = outboundIpAddresses;
                } else if ("vipMappings".equals(fieldName)) {
                    List<VirtualIpMapping> vipMappings
                        = reader.readArray(reader1 -> VirtualIpMapping.fromJson(reader1));
                    deserializedAddressResponseProperties.vipMappings = vipMappings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAddressResponseProperties;
        });
    }
}
