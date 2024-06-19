// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a single certificate reference in a Key Vault, and where the certificate should reside on the role
 * instance.
 */
@Fluent
public final class CloudServiceVaultCertificate implements JsonSerializable<CloudServiceVaultCertificate> {
    /*
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret.
     */
    private String certificateUrl;

    /**
     * Creates an instance of CloudServiceVaultCertificate class.
     */
    public CloudServiceVaultCertificate() {
    }

    /**
     * Get the certificateUrl property: This is the URL of a certificate that has been uploaded to Key Vault as a
     * secret.
     * 
     * @return the certificateUrl value.
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl property: This is the URL of a certificate that has been uploaded to Key Vault as a
     * secret.
     * 
     * @param certificateUrl the certificateUrl value to set.
     * @return the CloudServiceVaultCertificate object itself.
     */
    public CloudServiceVaultCertificate withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
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
        jsonWriter.writeStringField("certificateUrl", this.certificateUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudServiceVaultCertificate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudServiceVaultCertificate if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudServiceVaultCertificate.
     */
    public static CloudServiceVaultCertificate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudServiceVaultCertificate deserializedCloudServiceVaultCertificate = new CloudServiceVaultCertificate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificateUrl".equals(fieldName)) {
                    deserializedCloudServiceVaultCertificate.certificateUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudServiceVaultCertificate;
        });
    }
}
