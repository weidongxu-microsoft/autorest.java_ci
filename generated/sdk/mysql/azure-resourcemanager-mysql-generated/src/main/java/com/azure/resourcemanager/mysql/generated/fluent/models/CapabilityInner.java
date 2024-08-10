// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mysql.generated.models.ServerEditionCapabilityV2;
import com.azure.resourcemanager.mysql.generated.models.ServerVersionCapabilityV2;
import java.io.IOException;
import java.util.List;

/**
 * Represents a location capability set.
 */
@Immutable
public final class CapabilityInner extends ProxyResource {
    /*
     * The properties of a location capability set.
     */
    private CapabilityPropertiesV2 innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of CapabilityInner class.
     */
    public CapabilityInner() {
    }

    /**
     * Get the innerProperties property: The properties of a location capability set.
     * 
     * @return the innerProperties value.
     */
    private CapabilityPropertiesV2 innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the supportedGeoBackupRegions property: supported geo backup regions.
     * 
     * @return the supportedGeoBackupRegions value.
     */
    public List<String> supportedGeoBackupRegions() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedGeoBackupRegions();
    }

    /**
     * Get the supportedFlexibleServerEditions property: A list of supported flexible server editions.
     * 
     * @return the supportedFlexibleServerEditions value.
     */
    public List<ServerEditionCapabilityV2> supportedFlexibleServerEditions() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedFlexibleServerEditions();
    }

    /**
     * Get the supportedServerVersions property: A list of supported server versions.
     * 
     * @return the supportedServerVersions value.
     */
    public List<ServerVersionCapabilityV2> supportedServerVersions() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedServerVersions();
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
     * Reads an instance of CapabilityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapabilityInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CapabilityInner.
     */
    public static CapabilityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapabilityInner deserializedCapabilityInner = new CapabilityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCapabilityInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCapabilityInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCapabilityInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedCapabilityInner.innerProperties = CapabilityPropertiesV2.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedCapabilityInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapabilityInner;
        });
    }
}
