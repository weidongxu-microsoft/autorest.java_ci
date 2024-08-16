// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for specifying a clip time. Use sub classes of this class to specify the time position in the media.
 */
@Immutable
public class ClipTime implements JsonSerializable<ClipTime> {
    /*
     * The discriminator for derived types.
     */
    String odataType;

    /**
     * Creates an instance of ClipTime class.
     */
    public ClipTime() {
        this.odataType = "ClipTime";
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
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
        toJsonShared(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    void toJsonShared(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStringField("@odata.type", this.odataType);
    }

    /**
     * Reads an instance of ClipTime from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClipTime if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the ClipTime.
     */
    public static ClipTime fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.Media.AbsoluteClipTime".equals(discriminatorValue)) {
                    return AbsoluteClipTime.fromJson(readerToUse.reset());
                } else if ("#Microsoft.Media.UtcClipTime".equals(discriminatorValue)) {
                    return UtcClipTime.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ClipTime fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClipTime deserializedClipTime = new ClipTime();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedClipTime.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClipTime;
        });
    }
}
