// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies a symmetric key for token validation.
 */
@Fluent
public final class ContentKeyPolicySymmetricTokenKey extends ContentKeyPolicyRestrictionTokenKey {
    /*
     * The key value of the key
     */
    private byte[] keyValue;

    /**
     * Creates an instance of ContentKeyPolicySymmetricTokenKey class.
     */
    public ContentKeyPolicySymmetricTokenKey() {
        this.odataType = "#Microsoft.Media.ContentKeyPolicySymmetricTokenKey";
    }

    /**
     * Get the keyValue property: The key value of the key.
     * 
     * @return the keyValue value.
     */
    public byte[] keyValue() {
        return CoreUtils.clone(this.keyValue);
    }

    /**
     * Set the keyValue property: The key value of the key.
     * 
     * @param keyValue the keyValue value to set.
     * @return the ContentKeyPolicySymmetricTokenKey object itself.
     */
    public ContentKeyPolicySymmetricTokenKey withKeyValue(byte[] keyValue) {
        this.keyValue = CoreUtils.clone(keyValue);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (keyValue() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyValue in model ContentKeyPolicySymmetricTokenKey"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicySymmetricTokenKey.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeBinaryField("keyValue", this.keyValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentKeyPolicySymmetricTokenKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentKeyPolicySymmetricTokenKey if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContentKeyPolicySymmetricTokenKey.
     */
    public static ContentKeyPolicySymmetricTokenKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContentKeyPolicySymmetricTokenKey deserializedContentKeyPolicySymmetricTokenKey
                = new ContentKeyPolicySymmetricTokenKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyValue".equals(fieldName)) {
                    deserializedContentKeyPolicySymmetricTokenKey.keyValue = reader.getBinary();
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedContentKeyPolicySymmetricTokenKey.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContentKeyPolicySymmetricTokenKey;
        });
    }
}
