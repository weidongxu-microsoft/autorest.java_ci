// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Output of custom domain validation.
 */
@Immutable
public final class ValidateCustomDomainOutputInner implements JsonSerializable<ValidateCustomDomainOutputInner> {
    /*
     * Indicates whether the custom domain is valid or not.
     */
    private Boolean customDomainValidated;

    /*
     * The reason why the custom domain is not valid.
     */
    private String reason;

    /*
     * Error message describing why the custom domain is not valid.
     */
    private String message;

    /**
     * Creates an instance of ValidateCustomDomainOutputInner class.
     */
    public ValidateCustomDomainOutputInner() {
    }

    /**
     * Get the customDomainValidated property: Indicates whether the custom domain is valid or not.
     * 
     * @return the customDomainValidated value.
     */
    public Boolean customDomainValidated() {
        return this.customDomainValidated;
    }

    /**
     * Get the reason property: The reason why the custom domain is not valid.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Get the message property: Error message describing why the custom domain is not valid.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidateCustomDomainOutputInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidateCustomDomainOutputInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ValidateCustomDomainOutputInner.
     */
    public static ValidateCustomDomainOutputInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidateCustomDomainOutputInner deserializedValidateCustomDomainOutputInner
                = new ValidateCustomDomainOutputInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("customDomainValidated".equals(fieldName)) {
                    deserializedValidateCustomDomainOutputInner.customDomainValidated
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedValidateCustomDomainOutputInner.reason = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedValidateCustomDomainOutputInner.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidateCustomDomainOutputInner;
        });
    }
}
