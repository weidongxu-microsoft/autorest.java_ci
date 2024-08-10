// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.postgresql.generated.models.VirtualNetworkRuleState;
import java.io.IOException;

/**
 * A virtual network rule.
 */
@Fluent
public final class VirtualNetworkRuleInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private VirtualNetworkRuleProperties innerProperties;

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
     * Creates an instance of VirtualNetworkRuleInner class.
     */
    public VirtualNetworkRuleInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private VirtualNetworkRuleProperties innerProperties() {
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
     * Get the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     * 
     * @return the virtualNetworkSubnetId value.
     */
    public String virtualNetworkSubnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkSubnetId();
    }

    /**
     * Set the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     * 
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set.
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkRuleProperties();
        }
        this.innerProperties().withVirtualNetworkSubnetId(virtualNetworkSubnetId);
        return this;
    }

    /**
     * Get the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     * 
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().ignoreMissingVnetServiceEndpoint();
    }

    /**
     * Set the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     * 
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set.
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkRuleProperties();
        }
        this.innerProperties().withIgnoreMissingVnetServiceEndpoint(ignoreMissingVnetServiceEndpoint);
        return this;
    }

    /**
     * Get the state property: Virtual Network Rule State.
     * 
     * @return the state value.
     */
    public VirtualNetworkRuleState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
     * Reads an instance of VirtualNetworkRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkRuleInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualNetworkRuleInner.
     */
    public static VirtualNetworkRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkRuleInner deserializedVirtualNetworkRuleInner = new VirtualNetworkRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedVirtualNetworkRuleInner.innerProperties = VirtualNetworkRuleProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkRuleInner;
        });
    }
}
