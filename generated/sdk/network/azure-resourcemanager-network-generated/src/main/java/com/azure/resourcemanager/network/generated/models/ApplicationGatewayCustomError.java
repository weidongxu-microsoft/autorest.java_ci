// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Custom error of an application gateway.
 */
@Fluent
public final class ApplicationGatewayCustomError implements JsonSerializable<ApplicationGatewayCustomError> {
    /*
     * Status code of the application gateway custom error.
     */
    private ApplicationGatewayCustomErrorStatusCode statusCode;

    /*
     * Error page URL of the application gateway custom error.
     */
    private String customErrorPageUrl;

    /**
     * Creates an instance of ApplicationGatewayCustomError class.
     */
    public ApplicationGatewayCustomError() {
    }

    /**
     * Get the statusCode property: Status code of the application gateway custom error.
     * 
     * @return the statusCode value.
     */
    public ApplicationGatewayCustomErrorStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: Status code of the application gateway custom error.
     * 
     * @param statusCode the statusCode value to set.
     * @return the ApplicationGatewayCustomError object itself.
     */
    public ApplicationGatewayCustomError withStatusCode(ApplicationGatewayCustomErrorStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the customErrorPageUrl property: Error page URL of the application gateway custom error.
     * 
     * @return the customErrorPageUrl value.
     */
    public String customErrorPageUrl() {
        return this.customErrorPageUrl;
    }

    /**
     * Set the customErrorPageUrl property: Error page URL of the application gateway custom error.
     * 
     * @param customErrorPageUrl the customErrorPageUrl value to set.
     * @return the ApplicationGatewayCustomError object itself.
     */
    public ApplicationGatewayCustomError withCustomErrorPageUrl(String customErrorPageUrl) {
        this.customErrorPageUrl = customErrorPageUrl;
        return this;
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
        jsonWriter.writeStringField("statusCode", this.statusCode == null ? null : this.statusCode.toString());
        jsonWriter.writeStringField("customErrorPageUrl", this.customErrorPageUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayCustomError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayCustomError if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayCustomError.
     */
    public static ApplicationGatewayCustomError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayCustomError deserializedApplicationGatewayCustomError
                = new ApplicationGatewayCustomError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("statusCode".equals(fieldName)) {
                    deserializedApplicationGatewayCustomError.statusCode
                        = ApplicationGatewayCustomErrorStatusCode.fromString(reader.getString());
                } else if ("customErrorPageUrl".equals(fieldName)) {
                    deserializedApplicationGatewayCustomError.customErrorPageUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayCustomError;
        });
    }
}
