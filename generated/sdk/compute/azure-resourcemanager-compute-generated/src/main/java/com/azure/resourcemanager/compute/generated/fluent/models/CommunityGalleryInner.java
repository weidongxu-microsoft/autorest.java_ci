// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryMetadata;
import com.azure.resourcemanager.compute.generated.models.PirCommunityGalleryResource;
import java.io.IOException;
import java.util.Map;

/**
 * Specifies information about the Community Gallery that you want to create or update.
 */
@Fluent
public final class CommunityGalleryInner extends PirCommunityGalleryResource {
    /*
     * Describes the properties of a community gallery.
     */
    private CommunityGalleryProperties innerProperties;

    /*
     * The identifier information of community gallery.
     */
    private CommunityGalleryIdentifier innerIdentifier;

    /*
     * Resource type
     */
    private String type;

    /*
     * Resource location
     */
    private String location;

    /*
     * Resource name
     */
    private String name;

    /**
     * Creates an instance of CommunityGalleryInner class.
     */
    public CommunityGalleryInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a community gallery.
     * 
     * @return the innerProperties value.
     */
    private CommunityGalleryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the innerIdentifier property: The identifier information of community gallery.
     * 
     * @return the innerIdentifier value.
     */
    private CommunityGalleryIdentifier innerIdentifier() {
        return this.innerIdentifier;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
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
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the uniqueId property: The unique id of this community gallery.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.innerIdentifier() == null ? null : this.innerIdentifier().uniqueId();
    }

    /**
     * Set the uniqueId property: The unique id of this community gallery.
     * 
     * @param uniqueId the uniqueId value to set.
     * @return the CommunityGalleryInner object itself.
     */
    public CommunityGalleryInner withUniqueId(String uniqueId) {
        if (this.innerIdentifier() == null) {
            this.innerIdentifier = new CommunityGalleryIdentifier();
        }
        this.innerIdentifier().withUniqueId(uniqueId);
        return this;
    }

    /**
     * Get the disclaimer property: The disclaimer for a community gallery resource.
     * 
     * @return the disclaimer value.
     */
    public String disclaimer() {
        return this.innerProperties() == null ? null : this.innerProperties().disclaimer();
    }

    /**
     * Set the disclaimer property: The disclaimer for a community gallery resource.
     * 
     * @param disclaimer the disclaimer value to set.
     * @return the CommunityGalleryInner object itself.
     */
    public CommunityGalleryInner withDisclaimer(String disclaimer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryProperties();
        }
        this.innerProperties().withDisclaimer(disclaimer);
        return this;
    }

    /**
     * Get the artifactTags property: The artifact tags of a community gallery resource.
     * 
     * @return the artifactTags value.
     */
    public Map<String, String> artifactTags() {
        return this.innerProperties() == null ? null : this.innerProperties().artifactTags();
    }

    /**
     * Set the artifactTags property: The artifact tags of a community gallery resource.
     * 
     * @param artifactTags the artifactTags value to set.
     * @return the CommunityGalleryInner object itself.
     */
    public CommunityGalleryInner withArtifactTags(Map<String, String> artifactTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryProperties();
        }
        this.innerProperties().withArtifactTags(artifactTags);
        return this;
    }

    /**
     * Get the communityMetadata property: The metadata of community gallery.
     * 
     * @return the communityMetadata value.
     */
    public CommunityGalleryMetadata communityMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().communityMetadata();
    }

    /**
     * Set the communityMetadata property: The metadata of community gallery.
     * 
     * @param communityMetadata the communityMetadata value to set.
     * @return the CommunityGalleryInner object itself.
     */
    public CommunityGalleryInner withCommunityMetadata(CommunityGalleryMetadata communityMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryProperties();
        }
        this.innerProperties().withCommunityMetadata(communityMetadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (innerIdentifier() != null) {
            innerIdentifier().validate();
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
     * Reads an instance of CommunityGalleryInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunityGalleryInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CommunityGalleryInner.
     */
    public static CommunityGalleryInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunityGalleryInner deserializedCommunityGalleryInner = new CommunityGalleryInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCommunityGalleryInner.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedCommunityGalleryInner.location = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCommunityGalleryInner.type = reader.getString();
                } else if ("identifier".equals(fieldName)) {
                    deserializedCommunityGalleryInner.innerIdentifier = CommunityGalleryIdentifier.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedCommunityGalleryInner.innerProperties = CommunityGalleryProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommunityGalleryInner;
        });
    }
}
