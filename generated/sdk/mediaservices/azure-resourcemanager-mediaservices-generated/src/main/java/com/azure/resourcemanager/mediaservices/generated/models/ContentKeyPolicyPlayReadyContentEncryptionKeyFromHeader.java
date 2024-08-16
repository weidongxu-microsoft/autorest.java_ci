// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies that the content key ID is in the PlayReady header.
 */
@Immutable
public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader
    extends ContentKeyPolicyPlayReadyContentKeyLocation {
    /**
     * Creates an instance of ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader class.
     */
    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader() {
        this.odataType = "#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader";
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
        toJsonShared(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader.
     */
    public static ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader deserializedContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader
                = new ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader;
        });
    }
}
