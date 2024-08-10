// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.AdditionalInfo;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An error response from the Compute service.
 */
@Immutable
public final class ApiError extends ManagementError {
    /*
     * The Api inner error
     */
    private InnerError innererror;

    /*
     * Additional info for the error.
     */
    private List<AdditionalInfo> additionalInfo;

    /*
     * Details for the error.
     */
    private List<ManagementError> details;

    /*
     * The target of the error.
     */
    private String target;

    /*
     * The error message parsed from the body of the http error response.
     */
    private String message;

    /*
     * The error code parsed from the body of the http error response.
     */
    private String code;

    /**
     * Creates an instance of ApiError class.
     */
    public ApiError() {
    }

    /**
     * Get the innererror property: The Api inner error.
     * 
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
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
     * Get the details property: Details for the error.
     * 
     * @return the details value.
     */
    @Override
    public List<ManagementError> getDetails() {
        return this.details;
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
     * Get the message property: The error message parsed from the body of the http error response.
     * 
     * @return the message value.
     */
    @Override
    public String getMessage() {
        return this.message;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getInnererror() != null) {
            getInnererror().validate();
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
     * Reads an instance of ApiError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiError if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the ApiError.
     */
    public static ApiError fromJson(JsonReader jsonReader) throws IOException {
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

    private static ApiError readManagementError(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiError deserializedApiError = new ApiError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedApiError.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedApiError.message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedApiError.target = reader.getString();
                } else if ("details".equals(fieldName)) {
                    List<ManagementError> details = reader.readArray(reader1 -> ManagementError.fromJson(reader1));
                    deserializedApiError.details = details;
                } else if ("additionalInfo".equals(fieldName)) {
                    List<AdditionalInfo> additionalInfo = reader.readArray(reader1 -> AdditionalInfo.fromJson(reader1));
                    deserializedApiError.additionalInfo = additionalInfo;
                } else if ("innererror".equals(fieldName)) {
                    deserializedApiError.innererror = InnerError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiError;
        });
    }
}
