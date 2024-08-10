// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the settings to produce a JPEG image from the input video.
 */
@Fluent
public final class JpgLayer extends Layer {
    /*
     * The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     */
    private Integer quality;

    /**
     * Creates an instance of JpgLayer class.
     */
    public JpgLayer() {
    }

    /**
     * Get the quality property: The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     * 
     * @return the quality value.
     */
    public Integer quality() {
        return this.quality;
    }

    /**
     * Set the quality property: The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     * 
     * @param quality the quality value to set.
     * @return the JpgLayer object itself.
     */
    public JpgLayer withQuality(Integer quality) {
        this.quality = quality;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JpgLayer withWidth(String width) {
        super.withWidth(width);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JpgLayer withHeight(String height) {
        super.withHeight(height);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JpgLayer withLabel(String label) {
        super.withLabel(label);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("width", width());
        jsonWriter.writeStringField("height", height());
        jsonWriter.writeStringField("label", label());
        jsonWriter.writeNumberField("quality", this.quality);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JpgLayer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JpgLayer if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the JpgLayer.
     */
    public static JpgLayer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JpgLayer deserializedJpgLayer = new JpgLayer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("width".equals(fieldName)) {
                    deserializedJpgLayer.withWidth(reader.getString());
                } else if ("height".equals(fieldName)) {
                    deserializedJpgLayer.withHeight(reader.getString());
                } else if ("label".equals(fieldName)) {
                    deserializedJpgLayer.withLabel(reader.getString());
                } else if ("quality".equals(fieldName)) {
                    deserializedJpgLayer.quality = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJpgLayer;
        });
    }
}
