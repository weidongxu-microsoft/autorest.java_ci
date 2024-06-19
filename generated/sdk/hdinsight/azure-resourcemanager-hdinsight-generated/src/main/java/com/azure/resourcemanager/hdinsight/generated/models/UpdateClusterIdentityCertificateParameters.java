// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The update cluster identity certificate request parameters.
 */
@Fluent
public final class UpdateClusterIdentityCertificateParameters
    implements JsonSerializable<UpdateClusterIdentityCertificateParameters> {
    /*
     * The application id.
     */
    private String applicationId;

    /*
     * The certificate in base64 encoded format.
     */
    private String certificate;

    /*
     * The password of the certificate.
     */
    private String certificatePassword;

    /**
     * Creates an instance of UpdateClusterIdentityCertificateParameters class.
     */
    public UpdateClusterIdentityCertificateParameters() {
    }

    /**
     * Get the applicationId property: The application id.
     * 
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The application id.
     * 
     * @param applicationId the applicationId value to set.
     * @return the UpdateClusterIdentityCertificateParameters object itself.
     */
    public UpdateClusterIdentityCertificateParameters withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the certificate property: The certificate in base64 encoded format.
     * 
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: The certificate in base64 encoded format.
     * 
     * @param certificate the certificate value to set.
     * @return the UpdateClusterIdentityCertificateParameters object itself.
     */
    public UpdateClusterIdentityCertificateParameters withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the certificatePassword property: The password of the certificate.
     * 
     * @return the certificatePassword value.
     */
    public String certificatePassword() {
        return this.certificatePassword;
    }

    /**
     * Set the certificatePassword property: The password of the certificate.
     * 
     * @param certificatePassword the certificatePassword value to set.
     * @return the UpdateClusterIdentityCertificateParameters object itself.
     */
    public UpdateClusterIdentityCertificateParameters withCertificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
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
        jsonWriter.writeStringField("applicationId", this.applicationId);
        jsonWriter.writeStringField("certificate", this.certificate);
        jsonWriter.writeStringField("certificatePassword", this.certificatePassword);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateClusterIdentityCertificateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateClusterIdentityCertificateParameters if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateClusterIdentityCertificateParameters.
     */
    public static UpdateClusterIdentityCertificateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateClusterIdentityCertificateParameters deserializedUpdateClusterIdentityCertificateParameters
                = new UpdateClusterIdentityCertificateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationId".equals(fieldName)) {
                    deserializedUpdateClusterIdentityCertificateParameters.applicationId = reader.getString();
                } else if ("certificate".equals(fieldName)) {
                    deserializedUpdateClusterIdentityCertificateParameters.certificate = reader.getString();
                } else if ("certificatePassword".equals(fieldName)) {
                    deserializedUpdateClusterIdentityCertificateParameters.certificatePassword = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateClusterIdentityCertificateParameters;
        });
    }
}
