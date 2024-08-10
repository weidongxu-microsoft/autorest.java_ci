// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.generated.models.SchemaCompatibility;
import com.azure.resourcemanager.eventhubs.generated.models.SchemaType;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * Single item in List or Get Schema Group operation.
 */
@Fluent
public final class SchemaGroupInner extends ProxyResource {
    /*
     * The properties property.
     */
    private SchemaGroupProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    private String location;

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
     * Creates an instance of SchemaGroupInner class.
     */
    public SchemaGroupInner() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private SchemaGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
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
     * Get the updatedAtUtc property: Exact time the Schema Group was updated.
     * 
     * @return the updatedAtUtc value.
     */
    public OffsetDateTime updatedAtUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAtUtc();
    }

    /**
     * Get the createdAtUtc property: Exact time the Schema Group was created.
     * 
     * @return the createdAtUtc value.
     */
    public OffsetDateTime createdAtUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAtUtc();
    }

    /**
     * Get the etag property: The ETag value.
     * 
     * @return the etag value.
     */
    public UUID etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Get the groupProperties property: dictionary object for SchemaGroup group properties.
     * 
     * @return the groupProperties value.
     */
    public Map<String, String> groupProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().groupProperties();
    }

    /**
     * Set the groupProperties property: dictionary object for SchemaGroup group properties.
     * 
     * @param groupProperties the groupProperties value to set.
     * @return the SchemaGroupInner object itself.
     */
    public SchemaGroupInner withGroupProperties(Map<String, String> groupProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SchemaGroupProperties();
        }
        this.innerProperties().withGroupProperties(groupProperties);
        return this;
    }

    /**
     * Get the schemaCompatibility property: The schemaCompatibility property.
     * 
     * @return the schemaCompatibility value.
     */
    public SchemaCompatibility schemaCompatibility() {
        return this.innerProperties() == null ? null : this.innerProperties().schemaCompatibility();
    }

    /**
     * Set the schemaCompatibility property: The schemaCompatibility property.
     * 
     * @param schemaCompatibility the schemaCompatibility value to set.
     * @return the SchemaGroupInner object itself.
     */
    public SchemaGroupInner withSchemaCompatibility(SchemaCompatibility schemaCompatibility) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SchemaGroupProperties();
        }
        this.innerProperties().withSchemaCompatibility(schemaCompatibility);
        return this;
    }

    /**
     * Get the schemaType property: The schemaType property.
     * 
     * @return the schemaType value.
     */
    public SchemaType schemaType() {
        return this.innerProperties() == null ? null : this.innerProperties().schemaType();
    }

    /**
     * Set the schemaType property: The schemaType property.
     * 
     * @param schemaType the schemaType value to set.
     * @return the SchemaGroupInner object itself.
     */
    public SchemaGroupInner withSchemaType(SchemaType schemaType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SchemaGroupProperties();
        }
        this.innerProperties().withSchemaType(schemaType);
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SchemaGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SchemaGroupInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SchemaGroupInner.
     */
    public static SchemaGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SchemaGroupInner deserializedSchemaGroupInner = new SchemaGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSchemaGroupInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSchemaGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSchemaGroupInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSchemaGroupInner.innerProperties = SchemaGroupProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSchemaGroupInner.systemData = SystemData.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedSchemaGroupInner.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSchemaGroupInner;
        });
    }
}
