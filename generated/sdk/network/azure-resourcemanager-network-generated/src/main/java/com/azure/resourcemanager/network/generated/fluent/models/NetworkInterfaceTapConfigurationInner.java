// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Tap configuration in a Network Interface.
 */
@Fluent
public final class NetworkInterfaceTapConfigurationInner extends SubResource {
    /*
     * Properties of the Virtual Network Tap configuration.
     */
    private NetworkInterfaceTapConfigurationPropertiesFormatInner innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Sub Resource type.
     */
    private String type;

    /**
     * Creates an instance of NetworkInterfaceTapConfigurationInner class.
     */
    public NetworkInterfaceTapConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Virtual Network Tap configuration.
     * 
     * @return the innerProperties value.
     */
    private NetworkInterfaceTapConfigurationPropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the NetworkInterfaceTapConfigurationInner object itself.
     */
    public NetworkInterfaceTapConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Sub Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkInterfaceTapConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the virtualNetworkTap property: The reference to the Virtual Network Tap resource.
     * 
     * @return the virtualNetworkTap value.
     */
    public VirtualNetworkTapInner virtualNetworkTap() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkTap();
    }

    /**
     * Set the virtualNetworkTap property: The reference to the Virtual Network Tap resource.
     * 
     * @param virtualNetworkTap the virtualNetworkTap value to set.
     * @return the NetworkInterfaceTapConfigurationInner object itself.
     */
    public NetworkInterfaceTapConfigurationInner withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceTapConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withVirtualNetworkTap(virtualNetworkTap);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network interface tap configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkInterfaceTapConfigurationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkInterfaceTapConfigurationInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkInterfaceTapConfigurationInner.
     */
    public static NetworkInterfaceTapConfigurationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkInterfaceTapConfigurationInner deserializedNetworkInterfaceTapConfigurationInner
                = new NetworkInterfaceTapConfigurationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkInterfaceTapConfigurationInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkInterfaceTapConfigurationInner.innerProperties
                        = NetworkInterfaceTapConfigurationPropertiesFormatInner.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedNetworkInterfaceTapConfigurationInner.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedNetworkInterfaceTapConfigurationInner.etag = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetworkInterfaceTapConfigurationInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkInterfaceTapConfigurationInner;
        });
    }
}
