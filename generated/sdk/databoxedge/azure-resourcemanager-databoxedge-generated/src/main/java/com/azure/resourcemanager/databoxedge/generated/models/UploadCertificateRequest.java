// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.RawCertificateData;
import java.io.IOException;

/**
 * The upload certificate request.
 */
@Fluent
public final class UploadCertificateRequest implements JsonSerializable<UploadCertificateRequest> {
    /*
     * The Base 64 encoded certificate raw data.
     */
    private RawCertificateData innerProperties = new RawCertificateData();

    /**
     * Creates an instance of UploadCertificateRequest class.
     */
    public UploadCertificateRequest() {
    }

    /**
     * Get the innerProperties property: The Base 64 encoded certificate raw data.
     * 
     * @return the innerProperties value.
     */
    private RawCertificateData innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the authenticationType property: The authentication type.
     * 
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the UploadCertificateRequest object itself.
     */
    public UploadCertificateRequest withAuthenticationType(AuthenticationType authenticationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RawCertificateData();
        }
        this.innerProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the certificate property: The base64 encoded certificate raw data.
     * 
     * @return the certificate value.
     */
    public String certificate() {
        return this.innerProperties() == null ? null : this.innerProperties().certificate();
    }

    /**
     * Set the certificate property: The base64 encoded certificate raw data.
     * 
     * @param certificate the certificate value to set.
     * @return the UploadCertificateRequest object itself.
     */
    public UploadCertificateRequest withCertificate(String certificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RawCertificateData();
        }
        this.innerProperties().withCertificate(certificate);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model UploadCertificateRequest"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UploadCertificateRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UploadCertificateRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UploadCertificateRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UploadCertificateRequest.
     */
    public static UploadCertificateRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UploadCertificateRequest deserializedUploadCertificateRequest = new UploadCertificateRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedUploadCertificateRequest.innerProperties = RawCertificateData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUploadCertificateRequest;
        });
    }
}
