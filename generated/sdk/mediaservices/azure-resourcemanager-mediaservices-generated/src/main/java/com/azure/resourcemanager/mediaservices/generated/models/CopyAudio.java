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
 * A codec flag, which tells the encoder to copy the input audio bitstream.
 */
@Fluent
public final class CopyAudio extends Codec {
    /*
     * The discriminator for derived types.
     */
    private String odataType = "#Microsoft.Media.CopyAudio";

    /**
     * Creates an instance of CopyAudio class.
     */
    public CopyAudio() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyAudio withLabel(String label) {
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
        jsonWriter.writeStringField("label", label());
        jsonWriter.writeStringField("@odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CopyAudio from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CopyAudio if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the CopyAudio.
     */
    public static CopyAudio fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CopyAudio deserializedCopyAudio = new CopyAudio();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("label".equals(fieldName)) {
                    deserializedCopyAudio.withLabel(reader.getString());
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedCopyAudio.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCopyAudio;
        });
    }
}
