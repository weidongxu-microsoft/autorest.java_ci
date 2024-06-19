// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.NetworkAdapter;
import java.io.IOException;
import java.util.List;

/**
 * The network settings of a device.
 */
@Immutable
public final class NetworkSettingsInner extends ArmBaseModel {
    /*
     * The properties of network settings of a device.
     */
    private NetworkSettingsProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of NetworkSettings
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of NetworkSettingsInner class.
     */
    public NetworkSettingsInner() {
    }

    /**
     * Get the innerProperties property: The properties of network settings of a device.
     * 
     * @return the innerProperties value.
     */
    private NetworkSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of NetworkSettings.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Get the networkAdapters property: The network adapter list on the device.
     * 
     * @return the networkAdapters value.
     */
    public List<NetworkAdapter> networkAdapters() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAdapters();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkSettingsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSettingsInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkSettingsInner.
     */
    public static NetworkSettingsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSettingsInner deserializedNetworkSettingsInner = new NetworkSettingsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkSettingsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNetworkSettingsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetworkSettingsInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkSettingsInner.innerProperties = NetworkSettingsProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedNetworkSettingsInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSettingsInner;
        });
    }
}
