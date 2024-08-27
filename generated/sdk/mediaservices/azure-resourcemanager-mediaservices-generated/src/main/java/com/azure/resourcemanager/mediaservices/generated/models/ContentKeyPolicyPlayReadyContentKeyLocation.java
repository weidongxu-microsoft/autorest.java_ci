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
 * Base class for content key ID location. A derived class must be used to represent the location.
 */
@Immutable
public class ContentKeyPolicyPlayReadyContentKeyLocation
    implements JsonSerializable<ContentKeyPolicyPlayReadyContentKeyLocation> {
    /*
     * The discriminator for derived types.
     */
    private String odataType = "ContentKeyPolicyPlayReadyContentKeyLocation";

    /**
     * Creates an instance of ContentKeyPolicyPlayReadyContentKeyLocation class.
     */
    public ContentKeyPolicyPlayReadyContentKeyLocation() {
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
        jsonWriter.writeStringField("@odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentKeyPolicyPlayReadyContentKeyLocation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentKeyPolicyPlayReadyContentKeyLocation if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContentKeyPolicyPlayReadyContentKeyLocation.
     */
    public static ContentKeyPolicyPlayReadyContentKeyLocation fromJson(JsonReader jsonReader) throws IOException {
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
                if ("#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader"
                    .equals(discriminatorValue)) {
                    return ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader.fromJson(readerToUse.reset());
                } else if ("#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier"
                    .equals(discriminatorValue)) {
                    return ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ContentKeyPolicyPlayReadyContentKeyLocation fromJsonKnownDiscriminator(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ContentKeyPolicyPlayReadyContentKeyLocation deserializedContentKeyPolicyPlayReadyContentKeyLocation
                = new ContentKeyPolicyPlayReadyContentKeyLocation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyContentKeyLocation.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContentKeyPolicyPlayReadyContentKeyLocation;
        });
    }
}
