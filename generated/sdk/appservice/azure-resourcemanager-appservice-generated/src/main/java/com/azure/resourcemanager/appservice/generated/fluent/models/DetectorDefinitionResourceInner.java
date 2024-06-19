// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * ARM resource for a detector definition.
 */
@Fluent
public final class DetectorDefinitionResourceInner extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    private DetectorDefinition innerProperties;

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
     * Creates an instance of DetectorDefinitionResourceInner class.
     */
    public DetectorDefinitionResourceInner() {
    }

    /**
     * Get the innerProperties property: Core resource properties.
     * 
     * @return the innerProperties value.
     */
    private DetectorDefinition innerProperties() {
        return this.innerProperties;
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
     * {@inheritDoc}
     */
    @Override
    public DetectorDefinitionResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the displayName property: Display name of the detector.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the description property: Description of the detector.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the rank property: Detector Rank.
     * 
     * @return the rank value.
     */
    public Double rank() {
        return this.innerProperties() == null ? null : this.innerProperties().rank();
    }

    /**
     * Get the isEnabled property: Flag representing whether detector is enabled or not.
     * 
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isEnabled();
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DetectorDefinitionResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DetectorDefinitionResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DetectorDefinitionResourceInner.
     */
    public static DetectorDefinitionResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DetectorDefinitionResourceInner deserializedDetectorDefinitionResourceInner
                = new DetectorDefinitionResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDetectorDefinitionResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDetectorDefinitionResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDetectorDefinitionResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedDetectorDefinitionResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedDetectorDefinitionResourceInner.innerProperties = DetectorDefinition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDetectorDefinitionResourceInner;
        });
    }
}
