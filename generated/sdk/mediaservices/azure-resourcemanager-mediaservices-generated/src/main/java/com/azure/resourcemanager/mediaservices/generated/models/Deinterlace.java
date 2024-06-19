// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the de-interlacing settings.
 */
@Fluent
public final class Deinterlace implements JsonSerializable<Deinterlace> {
    /*
     * The field parity for de-interlacing, defaults to Auto.
     */
    private DeinterlaceParity parity;

    /*
     * The deinterlacing mode. Defaults to AutoPixelAdaptive.
     */
    private DeinterlaceMode mode;

    /**
     * Creates an instance of Deinterlace class.
     */
    public Deinterlace() {
    }

    /**
     * Get the parity property: The field parity for de-interlacing, defaults to Auto.
     * 
     * @return the parity value.
     */
    public DeinterlaceParity parity() {
        return this.parity;
    }

    /**
     * Set the parity property: The field parity for de-interlacing, defaults to Auto.
     * 
     * @param parity the parity value to set.
     * @return the Deinterlace object itself.
     */
    public Deinterlace withParity(DeinterlaceParity parity) {
        this.parity = parity;
        return this;
    }

    /**
     * Get the mode property: The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     * @return the mode value.
     */
    public DeinterlaceMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     * @param mode the mode value to set.
     * @return the Deinterlace object itself.
     */
    public Deinterlace withMode(DeinterlaceMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("parity", this.parity == null ? null : this.parity.toString());
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Deinterlace from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Deinterlace if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the Deinterlace.
     */
    public static Deinterlace fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Deinterlace deserializedDeinterlace = new Deinterlace();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("parity".equals(fieldName)) {
                    deserializedDeinterlace.parity = DeinterlaceParity.fromString(reader.getString());
                } else if ("mode".equals(fieldName)) {
                    deserializedDeinterlace.mode = DeinterlaceMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeinterlace;
        });
    }
}
