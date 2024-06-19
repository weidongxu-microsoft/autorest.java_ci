// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Indicates the error details if the background copy of a resource created via the CopyStart operation fails.
 */
@Fluent
public final class CopyCompletionError implements JsonSerializable<CopyCompletionError> {
    /*
     * Indicates the error code if the background copy of a resource created via the CopyStart operation fails.
     */
    private CopyCompletionErrorReason errorCode;

    /*
     * Indicates the error message if the background copy of a resource created via the CopyStart operation fails.
     */
    private String errorMessage;

    /**
     * Creates an instance of CopyCompletionError class.
     */
    public CopyCompletionError() {
    }

    /**
     * Get the errorCode property: Indicates the error code if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @return the errorCode value.
     */
    public CopyCompletionErrorReason errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Indicates the error code if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @param errorCode the errorCode value to set.
     * @return the CopyCompletionError object itself.
     */
    public CopyCompletionError withErrorCode(CopyCompletionErrorReason errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Indicates the error message if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Indicates the error message if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the CopyCompletionError object itself.
     */
    public CopyCompletionError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorCode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property errorCode in model CopyCompletionError"));
        }
        if (errorMessage() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property errorMessage in model CopyCompletionError"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CopyCompletionError.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("errorCode", this.errorCode == null ? null : this.errorCode.toString());
        jsonWriter.writeStringField("errorMessage", this.errorMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CopyCompletionError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CopyCompletionError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CopyCompletionError.
     */
    public static CopyCompletionError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CopyCompletionError deserializedCopyCompletionError = new CopyCompletionError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errorCode".equals(fieldName)) {
                    deserializedCopyCompletionError.errorCode
                        = CopyCompletionErrorReason.fromString(reader.getString());
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedCopyCompletionError.errorMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCopyCompletionError;
        });
    }
}
