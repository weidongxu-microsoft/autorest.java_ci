// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.fluent.models.NetworkInterfaceReferenceProperties;
import java.io.IOException;

/**
 * Describes a network interface reference.
 */
@Fluent
public final class NetworkInterfaceReference extends SubResource {
    /*
     * Describes a network interface reference properties.
     */
    private NetworkInterfaceReferenceProperties innerProperties;

    /**
     * Creates an instance of NetworkInterfaceReference class.
     */
    public NetworkInterfaceReference() {
    }

    /**
     * Get the innerProperties property: Describes a network interface reference properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkInterfaceReferenceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkInterfaceReference withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @param primary the primary value to set.
     * @return the NetworkInterfaceReference object itself.
     */
    public NetworkInterfaceReference withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceReferenceProperties();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteOption();
    }

    /**
     * Set the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the NetworkInterfaceReference object itself.
     */
    public NetworkInterfaceReference withDeleteOption(DeleteOptions deleteOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceReferenceProperties();
        }
        this.innerProperties().withDeleteOption(deleteOption);
        return this;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkInterfaceReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkInterfaceReference if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkInterfaceReference.
     */
    public static NetworkInterfaceReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkInterfaceReference deserializedNetworkInterfaceReference = new NetworkInterfaceReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkInterfaceReference.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkInterfaceReference.innerProperties
                        = NetworkInterfaceReferenceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkInterfaceReference;
        });
    }
}
