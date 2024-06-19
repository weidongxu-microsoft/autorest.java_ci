// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.Container;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterfaceConfiguration;
import com.azure.resourcemanager.network.generated.models.ContainerNetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of container network interface.
 */
@Fluent
public final class ContainerNetworkInterfacePropertiesFormat
    implements JsonSerializable<ContainerNetworkInterfacePropertiesFormat> {
    /*
     * Container network interface configuration from which this container network interface is created.
     */
    private ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration;

    /*
     * Reference to the container to which this container network interface is attached.
     */
    private Container container;

    /*
     * Reference to the ip configuration on this container nic.
     */
    private List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * The provisioning state of the container network interface resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ContainerNetworkInterfacePropertiesFormat class.
     */
    public ContainerNetworkInterfacePropertiesFormat() {
    }

    /**
     * Get the containerNetworkInterfaceConfiguration property: Container network interface configuration from which
     * this container network interface is created.
     * 
     * @return the containerNetworkInterfaceConfiguration value.
     */
    public ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration() {
        return this.containerNetworkInterfaceConfiguration;
    }

    /**
     * Get the container property: Reference to the container to which this container network interface is attached.
     * 
     * @return the container value.
     */
    public Container container() {
        return this.container;
    }

    /**
     * Set the container property: Reference to the container to which this container network interface is attached.
     * 
     * @param container the container value to set.
     * @return the ContainerNetworkInterfacePropertiesFormat object itself.
     */
    public ContainerNetworkInterfacePropertiesFormat withContainer(Container container) {
        this.container = container;
        return this;
    }

    /**
     * Get the ipConfigurations property: Reference to the ip configuration on this container nic.
     * 
     * @return the ipConfigurations value.
     */
    public List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the provisioningState property: The provisioning state of the container network interface resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerNetworkInterfaceConfiguration() != null) {
            containerNetworkInterfaceConfiguration().validate();
        }
        if (container() != null) {
            container().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("container", this.container);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerNetworkInterfacePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerNetworkInterfacePropertiesFormat if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContainerNetworkInterfacePropertiesFormat.
     */
    public static ContainerNetworkInterfacePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerNetworkInterfacePropertiesFormat deserializedContainerNetworkInterfacePropertiesFormat
                = new ContainerNetworkInterfacePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("containerNetworkInterfaceConfiguration".equals(fieldName)) {
                    deserializedContainerNetworkInterfacePropertiesFormat.containerNetworkInterfaceConfiguration
                        = ContainerNetworkInterfaceConfiguration.fromJson(reader);
                } else if ("container".equals(fieldName)) {
                    deserializedContainerNetworkInterfacePropertiesFormat.container = Container.fromJson(reader);
                } else if ("ipConfigurations".equals(fieldName)) {
                    List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations
                        = reader.readArray(reader1 -> ContainerNetworkInterfaceIpConfiguration.fromJson(reader1));
                    deserializedContainerNetworkInterfacePropertiesFormat.ipConfigurations = ipConfigurations;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedContainerNetworkInterfacePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerNetworkInterfacePropertiesFormat;
        });
    }
}
