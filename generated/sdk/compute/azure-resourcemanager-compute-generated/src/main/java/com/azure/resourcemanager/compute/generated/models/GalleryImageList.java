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
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageInner;
import java.io.IOException;
import java.util.List;

/**
 * The List Gallery Images operation response.
 */
@Fluent
public final class GalleryImageList implements JsonSerializable<GalleryImageList> {
    /*
     * A list of Shared Image Gallery images.
     */
    private List<GalleryImageInner> value;

    /*
     * The uri to fetch the next page of Image Definitions in the Shared Image Gallery. Call ListNext() with this to
     * fetch the next page of gallery image definitions.
     */
    private String nextLink;

    /**
     * Creates an instance of GalleryImageList class.
     */
    public GalleryImageList() {
    }

    /**
     * Get the value property: A list of Shared Image Gallery images.
     * 
     * @return the value value.
     */
    public List<GalleryImageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of Shared Image Gallery images.
     * 
     * @param value the value value to set.
     * @return the GalleryImageList object itself.
     */
    public GalleryImageList withValue(List<GalleryImageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Image Definitions in the Shared Image Gallery. Call
     * ListNext() with this to fetch the next page of gallery image definitions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Image Definitions in the Shared Image Gallery. Call
     * ListNext() with this to fetch the next page of gallery image definitions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the GalleryImageList object itself.
     */
    public GalleryImageList withNextLink(String nextLink) {
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
                .log(new IllegalArgumentException("Missing required property value in model GalleryImageList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryImageList.class);

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
     * Reads an instance of GalleryImageList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryImageList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GalleryImageList.
     */
    public static GalleryImageList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryImageList deserializedGalleryImageList = new GalleryImageList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<GalleryImageInner> value = reader.readArray(reader1 -> GalleryImageInner.fromJson(reader1));
                    deserializedGalleryImageList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedGalleryImageList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryImageList;
        });
    }
}
