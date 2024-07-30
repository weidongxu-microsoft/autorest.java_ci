// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.AdditionalInfo;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The resource management error response.
 */
@Immutable
public final class ErrorResponseCommon extends ManagementError {
    /*
     * The error details.
     */
    private List<ErrorResponseCommon> details;

    /*
     * The error code parsed from the body of the http error response.
     */
    private String code;

    /*
     * The error message parsed from the body of the http error response.
     */
    private String message;

    /*
     * The target of the error.
     */
    private String target;

    /*
     * Additional info for the error.
     */
    private List<AdditionalInfo> additionalInfo;

    /**
     * Creates an instance of ErrorResponseCommon class.
     */
    public ErrorResponseCommon() {
    }

    /**
     * Get the details property: The error details.
     * 
     * @return the details value.
     */
    @Override
    public List<ErrorResponseCommon> getDetails() {
        return this.details;
    }

    /**
     * Get the code property: The error code parsed from the body of the http error response.
     * 
     * @return the code value.
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: The error message parsed from the body of the http error response.
     * 
     * @return the message value.
     */
    @Override
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The target of the error.
     * 
     * @return the target value.
     */
    @Override
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the additionalInfo property: Additional info for the error.
     * 
     * @return the additionalInfo value.
     */
    @Override
    public List<AdditionalInfo> getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getDetails() != null) {
            getDetails().forEach(e -> e.validate());
        }
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
     * Reads an instance of ErrorResponseCommon from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorResponseCommon if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ErrorResponseCommon.
     */
    public static ErrorResponseCommon fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JsonReader bufferedReader = reader.bufferObject();
            bufferedReader.nextToken();
            while (bufferedReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = bufferedReader.getFieldName();
                bufferedReader.nextToken();

                if ("error".equals(fieldName)) {
                    return readManagementError(bufferedReader);
                } else {
                    bufferedReader.skipChildren();
                }
            }
            return readManagementError(bufferedReader.reset());
        });
    }

    private static ErrorResponseCommon readManagementError(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorResponseCommon deserializedErrorResponseCommon = new ErrorResponseCommon();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedErrorResponseCommon.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedErrorResponseCommon.message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedErrorResponseCommon.target = reader.getString();
                } else if ("additionalInfo".equals(fieldName)) {
                    List<AdditionalInfo> additionalInfo = reader.readArray(reader1 -> AdditionalInfo.fromJson(reader1));
                    deserializedErrorResponseCommon.additionalInfo = additionalInfo;
                } else if ("details".equals(fieldName)) {
                    List<ErrorResponseCommon> details
                        = reader.readArray(reader1 -> ErrorResponseCommon.fromJson(reader1));
                    deserializedErrorResponseCommon.details = details;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorResponseCommon;
        });
    }
}
