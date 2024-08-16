// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the settings for producing PNG thumbnails.
 */
@Fluent
public final class PngFormat extends ImageFormat {
    /**
     * Creates an instance of PngFormat class.
     */
    public PngFormat() {
        this.odataType = "#Microsoft.Media.PngFormat";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngFormat withFilenamePattern(String filenamePattern) {
        super.withFilenamePattern(filenamePattern);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (filenamePattern() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property filenamePattern in model PngFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PngFormat.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PngFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PngFormat if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PngFormat.
     */
    public static PngFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PngFormat deserializedPngFormat = new PngFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filenamePattern".equals(fieldName)) {
                    deserializedPngFormat.withFilenamePattern(reader.getString());
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedPngFormat.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPngFormat;
        });
    }
}
