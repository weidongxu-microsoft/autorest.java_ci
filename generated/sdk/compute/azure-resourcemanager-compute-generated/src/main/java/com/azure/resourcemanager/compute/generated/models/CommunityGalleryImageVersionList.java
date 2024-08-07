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
import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageVersionInner;
import java.io.IOException;
import java.util.List;

/**
 * The List Community Gallery Image versions operation response.
 */
@Fluent
public final class CommunityGalleryImageVersionList implements JsonSerializable<CommunityGalleryImageVersionList> {
    /*
     * A list of community gallery image versions.
     */
    private List<CommunityGalleryImageVersionInner> value;

    /*
     * The URI to fetch the next page of community gallery image versions. Call ListNext() with this to fetch the next
     * page of community gallery image versions.
     */
    private String nextLink;

    /**
     * Creates an instance of CommunityGalleryImageVersionList class.
     */
    public CommunityGalleryImageVersionList() {
    }

    /**
     * Get the value property: A list of community gallery image versions.
     * 
     * @return the value value.
     */
    public List<CommunityGalleryImageVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of community gallery image versions.
     * 
     * @param value the value value to set.
     * @return the CommunityGalleryImageVersionList object itself.
     */
    public CommunityGalleryImageVersionList withValue(List<CommunityGalleryImageVersionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of community gallery image versions. Call ListNext()
     * with this to fetch the next page of community gallery image versions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of community gallery image versions. Call ListNext()
     * with this to fetch the next page of community gallery image versions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the CommunityGalleryImageVersionList object itself.
     */
    public CommunityGalleryImageVersionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model CommunityGalleryImageVersionList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommunityGalleryImageVersionList.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CommunityGalleryImageVersionList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunityGalleryImageVersionList if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CommunityGalleryImageVersionList.
     */
    public static CommunityGalleryImageVersionList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunityGalleryImageVersionList deserializedCommunityGalleryImageVersionList
                = new CommunityGalleryImageVersionList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<CommunityGalleryImageVersionInner> value
                        = reader.readArray(reader1 -> CommunityGalleryImageVersionInner.fromJson(reader1));
                    deserializedCommunityGalleryImageVersionList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCommunityGalleryImageVersionList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCommunityGalleryImageVersionList;
        });
    }
}
