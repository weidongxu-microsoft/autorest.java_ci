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
 * Specifies a RSA key for token validation.
 */
@Fluent
public final class ContentKeyPolicyRsaTokenKey extends ContentKeyPolicyRestrictionTokenKey {
    /*
     * The RSA Parameter exponent
     */
    private byte[] exponent;

    /*
     * The RSA Parameter modulus
     */
    private byte[] modulus;

    /**
     * Creates an instance of ContentKeyPolicyRsaTokenKey class.
     */
    public ContentKeyPolicyRsaTokenKey() {
        this.odataType = "#Microsoft.Media.ContentKeyPolicyRsaTokenKey";
    }

    /**
     * Get the exponent property: The RSA Parameter exponent.
     * 
     * @return the exponent value.
     */
    public byte[] exponent() {
        return CoreUtils.clone(this.exponent);
    }

    /**
     * Set the exponent property: The RSA Parameter exponent.
     * 
     * @param exponent the exponent value to set.
     * @return the ContentKeyPolicyRsaTokenKey object itself.
     */
    public ContentKeyPolicyRsaTokenKey withExponent(byte[] exponent) {
        this.exponent = CoreUtils.clone(exponent);
        return this;
    }

    /**
     * Get the modulus property: The RSA Parameter modulus.
     * 
     * @return the modulus value.
     */
    public byte[] modulus() {
        return CoreUtils.clone(this.modulus);
    }

    /**
     * Set the modulus property: The RSA Parameter modulus.
     * 
     * @param modulus the modulus value to set.
     * @return the ContentKeyPolicyRsaTokenKey object itself.
     */
    public ContentKeyPolicyRsaTokenKey withModulus(byte[] modulus) {
        this.modulus = CoreUtils.clone(modulus);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (exponent() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property exponent in model ContentKeyPolicyRsaTokenKey"));
        }
        if (modulus() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property modulus in model ContentKeyPolicyRsaTokenKey"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicyRsaTokenKey.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeBinaryField("exponent", this.exponent);
        jsonWriter.writeBinaryField("modulus", this.modulus);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentKeyPolicyRsaTokenKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentKeyPolicyRsaTokenKey if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContentKeyPolicyRsaTokenKey.
     */
    public static ContentKeyPolicyRsaTokenKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContentKeyPolicyRsaTokenKey deserializedContentKeyPolicyRsaTokenKey = new ContentKeyPolicyRsaTokenKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("exponent".equals(fieldName)) {
                    deserializedContentKeyPolicyRsaTokenKey.exponent = reader.getBinary();
                } else if ("modulus".equals(fieldName)) {
                    deserializedContentKeyPolicyRsaTokenKey.modulus = reader.getBinary();
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedContentKeyPolicyRsaTokenKey.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContentKeyPolicyRsaTokenKey;
        });
    }
}
