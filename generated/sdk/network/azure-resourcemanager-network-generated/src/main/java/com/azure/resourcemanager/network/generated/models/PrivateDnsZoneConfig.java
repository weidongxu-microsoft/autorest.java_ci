// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateDnsZonePropertiesFormat;
import java.io.IOException;
import java.util.List;

/**
 * PrivateDnsZoneConfig resource.
 */
@Fluent
public final class PrivateDnsZoneConfig implements JsonSerializable<PrivateDnsZoneConfig> {
    /*
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * Properties of the private dns zone configuration.
     */
    private PrivateDnsZonePropertiesFormat innerProperties;

    /**
     * Creates an instance of PrivateDnsZoneConfig class.
     */
    public PrivateDnsZoneConfig() {
    }

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the PrivateDnsZoneConfig object itself.
     */
    public PrivateDnsZoneConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the private dns zone configuration.
     * 
     * @return the innerProperties value.
     */
    private PrivateDnsZonePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the privateDnsZoneId property: The resource id of the private dns zone.
     * 
     * @return the privateDnsZoneId value.
     */
    public String privateDnsZoneId() {
        return this.innerProperties() == null ? null : this.innerProperties().privateDnsZoneId();
    }

    /**
     * Set the privateDnsZoneId property: The resource id of the private dns zone.
     * 
     * @param privateDnsZoneId the privateDnsZoneId value to set.
     * @return the PrivateDnsZoneConfig object itself.
     */
    public PrivateDnsZoneConfig withPrivateDnsZoneId(String privateDnsZoneId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateDnsZonePropertiesFormat();
        }
        this.innerProperties().withPrivateDnsZoneId(privateDnsZoneId);
        return this;
    }

    /**
     * Get the recordSets property: A collection of information regarding a recordSet, holding information to identify
     * private resources.
     * 
     * @return the recordSets value.
     */
    public List<RecordSet> recordSets() {
        return this.innerProperties() == null ? null : this.innerProperties().recordSets();
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateDnsZoneConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateDnsZoneConfig if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateDnsZoneConfig.
     */
    public static PrivateDnsZoneConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateDnsZoneConfig deserializedPrivateDnsZoneConfig = new PrivateDnsZoneConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedPrivateDnsZoneConfig.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateDnsZoneConfig.innerProperties = PrivateDnsZonePropertiesFormat.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateDnsZoneConfig;
        });
    }
}
