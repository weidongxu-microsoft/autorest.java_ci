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

/**
 * This is the gallery image definition identifier.
 */
@Fluent
public final class GalleryImageIdentifier implements JsonSerializable<GalleryImageIdentifier> {
    /*
     * The name of the gallery image definition publisher.
     */
    private String publisher;

    /*
     * The name of the gallery image definition offer.
     */
    private String offer;

    /*
     * The name of the gallery image definition SKU.
     */
    private String sku;

    /**
     * Creates an instance of GalleryImageIdentifier class.
     */
    public GalleryImageIdentifier() {
    }

    /**
     * Get the publisher property: The name of the gallery image definition publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the gallery image definition publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the GalleryImageIdentifier object itself.
     */
    public GalleryImageIdentifier withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: The name of the gallery image definition offer.
     * 
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The name of the gallery image definition offer.
     * 
     * @param offer the offer value to set.
     * @return the GalleryImageIdentifier object itself.
     */
    public GalleryImageIdentifier withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: The name of the gallery image definition SKU.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name of the gallery image definition SKU.
     * 
     * @param sku the sku value to set.
     * @return the GalleryImageIdentifier object itself.
     */
    public GalleryImageIdentifier withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publisher() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publisher in model GalleryImageIdentifier"));
        }
        if (offer() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property offer in model GalleryImageIdentifier"));
        }
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model GalleryImageIdentifier"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryImageIdentifier.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("offer", this.offer);
        jsonWriter.writeStringField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryImageIdentifier from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryImageIdentifier if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GalleryImageIdentifier.
     */
    public static GalleryImageIdentifier fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryImageIdentifier deserializedGalleryImageIdentifier = new GalleryImageIdentifier();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publisher".equals(fieldName)) {
                    deserializedGalleryImageIdentifier.publisher = reader.getString();
                } else if ("offer".equals(fieldName)) {
                    deserializedGalleryImageIdentifier.offer = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedGalleryImageIdentifier.sku = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryImageIdentifier;
        });
    }
}
