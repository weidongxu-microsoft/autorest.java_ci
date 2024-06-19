// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The error info.
 */
@Fluent
public class ErrorInfo implements JsonSerializable<ErrorInfo> {
    /*
     * The error code.
     */
    private String code;

    /**
     * Creates an instance of ErrorInfo class.
     */
    public ErrorInfo() {
    }

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     * 
     * @param code the code value to set.
     * @return the ErrorInfo object itself.
     */
    public ErrorInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (code() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property code in model ErrorInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ErrorInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ErrorInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorInfo if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ErrorInfo.
     */
    public static ErrorInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorInfo deserializedErrorInfo = new ErrorInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedErrorInfo.code = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorInfo;
        });
    }
}
