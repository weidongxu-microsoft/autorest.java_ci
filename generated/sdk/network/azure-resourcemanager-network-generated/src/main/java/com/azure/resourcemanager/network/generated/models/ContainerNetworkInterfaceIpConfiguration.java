// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.ContainerNetworkInterfaceIpConfigurationPropertiesFormat;
import java.io.IOException;

/**
 * The ip configuration for a container network interface.
 */
@Fluent
public final class ContainerNetworkInterfaceIpConfiguration
    implements JsonSerializable<ContainerNetworkInterfaceIpConfiguration> {
    /*
     * Properties of the container network interface IP configuration.
     */
    private ContainerNetworkInterfaceIpConfigurationPropertiesFormat innerProperties;

    /*
     * The name of the resource. This name can be used to access the resource.
     */
    private String name;

    /*
     * Sub Resource type.
     */
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of ContainerNetworkInterfaceIpConfiguration class.
     */
    public ContainerNetworkInterfaceIpConfiguration() {
    }

    /**
     * Get the innerProperties property: Properties of the container network interface IP configuration.
     * 
     * @return the innerProperties value.
     */
    private ContainerNetworkInterfaceIpConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the ContainerNetworkInterfaceIpConfiguration object itself.
     */
    public ContainerNetworkInterfaceIpConfiguration withName(String name) {
        this.name = name;
        return this;
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
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the provisioningState property: The provisioning state of the container network interface IP configuration
     * resource.
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerNetworkInterfaceIpConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerNetworkInterfaceIpConfiguration if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContainerNetworkInterfaceIpConfiguration.
     */
    public static ContainerNetworkInterfaceIpConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerNetworkInterfaceIpConfiguration deserializedContainerNetworkInterfaceIpConfiguration
                = new ContainerNetworkInterfaceIpConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedContainerNetworkInterfaceIpConfiguration.innerProperties
                        = ContainerNetworkInterfaceIpConfigurationPropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedContainerNetworkInterfaceIpConfiguration.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedContainerNetworkInterfaceIpConfiguration.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedContainerNetworkInterfaceIpConfiguration.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerNetworkInterfaceIpConfiguration;
        });
    }
}
