// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.PirSharedGalleryResource;
import java.io.IOException;
import java.util.Map;

/**
 * Specifies information about the Shared Gallery that you want to create or update.
 */
@Fluent
public final class SharedGalleryInner extends PirSharedGalleryResource {
    /*
     * Specifies the properties of a shared gallery
     */
    private SharedGalleryProperties innerProperties;

    /*
     * Resource name
     */
    private String name;

    /*
     * Resource location
     */
    private String location;

    /*
     * The identifier information of shared gallery.
     */
    private SharedGalleryIdentifier innerIdentifier;

    /**
     * Creates an instance of SharedGalleryInner class.
     */
    public SharedGalleryInner() {
    }

    /**
     * Get the innerProperties property: Specifies the properties of a shared gallery.
     * 
     * @return the innerProperties value.
     */
    private SharedGalleryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    @Override
    public String location() {
        return this.location;
    }

    /**
     * Get the innerIdentifier property: The identifier information of shared gallery.
     * 
     * @return the innerIdentifier value.
     */
    private SharedGalleryIdentifier innerIdentifier() {
        return this.innerIdentifier;
    }

    /**
     * Get the uniqueId property: The unique id of this shared gallery.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.innerIdentifier() == null ? null : this.innerIdentifier().uniqueId();
    }

    /**
     * Set the uniqueId property: The unique id of this shared gallery.
     * 
     * @param uniqueId the uniqueId value to set.
     * @return the SharedGalleryInner object itself.
     */
    public SharedGalleryInner withUniqueId(String uniqueId) {
        if (this.innerIdentifier() == null) {
            this.innerIdentifier = new SharedGalleryIdentifier();
        }
        this.innerIdentifier().withUniqueId(uniqueId);
        return this;
    }

    /**
     * Get the artifactTags property: The artifact tags of a shared gallery resource.
     * 
     * @return the artifactTags value.
     */
    public Map<String, String> artifactTags() {
        return this.innerProperties() == null ? null : this.innerProperties().artifactTags();
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
        jsonWriter.writeJsonField("identifier", innerIdentifier());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedGalleryInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedGalleryInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharedGalleryInner.
     */
    public static SharedGalleryInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedGalleryInner deserializedSharedGalleryInner = new SharedGalleryInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSharedGalleryInner.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSharedGalleryInner.location = reader.getString();
                } else if ("identifier".equals(fieldName)) {
                    deserializedSharedGalleryInner.innerIdentifier = SharedGalleryIdentifier.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedSharedGalleryInner.innerProperties = SharedGalleryProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedGalleryInner;
        });
    }
}
