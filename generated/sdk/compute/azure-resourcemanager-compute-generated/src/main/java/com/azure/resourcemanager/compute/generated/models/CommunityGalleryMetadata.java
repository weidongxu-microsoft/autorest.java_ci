// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The metadata of community gallery.
 */
@Fluent
public final class CommunityGalleryMetadata implements JsonSerializable<CommunityGalleryMetadata> {
    /*
     * The publisher URI of this community gallery.
     */
    private String publisherUri;

    /*
     * The publisher email id of this community gallery.
     */
    private String publisherContact;

    /*
     * The end-user license agreement for this community gallery.
     */
    private String eula;

    /*
     * A list of public names the gallery has.
     */
    private List<String> publicNames;

    /*
     * The link for the privacy statement of this community gallery from the gallery publisher.
     */
    private String privacyStatementUri;

    /**
     * Creates an instance of CommunityGalleryMetadata class.
     */
    public CommunityGalleryMetadata() {
    }

    /**
     * Get the publisherUri property: The publisher URI of this community gallery.
     * 
     * @return the publisherUri value.
     */
    public String publisherUri() {
        return this.publisherUri;
    }

    /**
     * Set the publisherUri property: The publisher URI of this community gallery.
     * 
     * @param publisherUri the publisherUri value to set.
     * @return the CommunityGalleryMetadata object itself.
     */
    public CommunityGalleryMetadata withPublisherUri(String publisherUri) {
        this.publisherUri = publisherUri;
        return this;
    }

    /**
     * Get the publisherContact property: The publisher email id of this community gallery.
     * 
     * @return the publisherContact value.
     */
    public String publisherContact() {
        return this.publisherContact;
    }

    /**
     * Set the publisherContact property: The publisher email id of this community gallery.
     * 
     * @param publisherContact the publisherContact value to set.
     * @return the CommunityGalleryMetadata object itself.
     */
    public CommunityGalleryMetadata withPublisherContact(String publisherContact) {
        this.publisherContact = publisherContact;
        return this;
    }

    /**
     * Get the eula property: The end-user license agreement for this community gallery.
     * 
     * @return the eula value.
     */
    public String eula() {
        return this.eula;
    }

    /**
     * Set the eula property: The end-user license agreement for this community gallery.
     * 
     * @param eula the eula value to set.
     * @return the CommunityGalleryMetadata object itself.
     */
    public CommunityGalleryMetadata withEula(String eula) {
        this.eula = eula;
        return this;
    }

    /**
     * Get the publicNames property: A list of public names the gallery has.
     * 
     * @return the publicNames value.
     */
    public List<String> publicNames() {
        return this.publicNames;
    }

    /**
     * Set the publicNames property: A list of public names the gallery has.
     * 
     * @param publicNames the publicNames value to set.
     * @return the CommunityGalleryMetadata object itself.
     */
    public CommunityGalleryMetadata withPublicNames(List<String> publicNames) {
        this.publicNames = publicNames;
        return this;
    }

    /**
     * Get the privacyStatementUri property: The link for the privacy statement of this community gallery from the
     * gallery publisher.
     * 
     * @return the privacyStatementUri value.
     */
    public String privacyStatementUri() {
        return this.privacyStatementUri;
    }

    /**
     * Set the privacyStatementUri property: The link for the privacy statement of this community gallery from the
     * gallery publisher.
     * 
     * @param privacyStatementUri the privacyStatementUri value to set.
     * @return the CommunityGalleryMetadata object itself.
     */
    public CommunityGalleryMetadata withPrivacyStatementUri(String privacyStatementUri) {
        this.privacyStatementUri = privacyStatementUri;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publisherContact() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publisherContact in model CommunityGalleryMetadata"));
        }
        if (publicNames() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publicNames in model CommunityGalleryMetadata"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommunityGalleryMetadata.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("publisherContact", this.publisherContact);
        jsonWriter.writeArrayField("publicNames", this.publicNames, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("publisherUri", this.publisherUri);
        jsonWriter.writeStringField("eula", this.eula);
        jsonWriter.writeStringField("privacyStatementUri", this.privacyStatementUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CommunityGalleryMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunityGalleryMetadata if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommunityGalleryMetadata.
     */
    public static CommunityGalleryMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunityGalleryMetadata deserializedCommunityGalleryMetadata = new CommunityGalleryMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publisherContact".equals(fieldName)) {
                    deserializedCommunityGalleryMetadata.publisherContact = reader.getString();
                } else if ("publicNames".equals(fieldName)) {
                    List<String> publicNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedCommunityGalleryMetadata.publicNames = publicNames;
                } else if ("publisherUri".equals(fieldName)) {
                    deserializedCommunityGalleryMetadata.publisherUri = reader.getString();
                } else if ("eula".equals(fieldName)) {
                    deserializedCommunityGalleryMetadata.eula = reader.getString();
                } else if ("privacyStatementUri".equals(fieldName)) {
                    deserializedCommunityGalleryMetadata.privacyStatementUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommunityGalleryMetadata;
        });
    }
}
