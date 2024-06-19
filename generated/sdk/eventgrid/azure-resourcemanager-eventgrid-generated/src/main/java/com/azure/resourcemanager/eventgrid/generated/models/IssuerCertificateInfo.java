// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information about the certificate that is used for token validation.
 */
@Fluent
public final class IssuerCertificateInfo implements JsonSerializable<IssuerCertificateInfo> {
    /*
     * Keyvault certificate URL in https://keyvaultname.vault.azure.net/certificates/certificateName/certificateVersion
     * format.
     */
    private String certificateUrl;

    /*
     * The identity that will be used to access the certificate.
     */
    private CustomJwtAuthenticationManagedIdentity identity;

    /**
     * Creates an instance of IssuerCertificateInfo class.
     */
    public IssuerCertificateInfo() {
    }

    /**
     * Get the certificateUrl property: Keyvault certificate URL in
     * https://keyvaultname.vault.azure.net/certificates/certificateName/certificateVersion format.
     * 
     * @return the certificateUrl value.
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl property: Keyvault certificate URL in
     * https://keyvaultname.vault.azure.net/certificates/certificateName/certificateVersion format.
     * 
     * @param certificateUrl the certificateUrl value to set.
     * @return the IssuerCertificateInfo object itself.
     */
    public IssuerCertificateInfo withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

    /**
     * Get the identity property: The identity that will be used to access the certificate.
     * 
     * @return the identity value.
     */
    public CustomJwtAuthenticationManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity that will be used to access the certificate.
     * 
     * @param identity the identity value to set.
     * @return the IssuerCertificateInfo object itself.
     */
    public IssuerCertificateInfo withIdentity(CustomJwtAuthenticationManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateUrl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property certificateUrl in model IssuerCertificateInfo"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IssuerCertificateInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("certificateUrl", this.certificateUrl);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IssuerCertificateInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IssuerCertificateInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IssuerCertificateInfo.
     */
    public static IssuerCertificateInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IssuerCertificateInfo deserializedIssuerCertificateInfo = new IssuerCertificateInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificateUrl".equals(fieldName)) {
                    deserializedIssuerCertificateInfo.certificateUrl = reader.getString();
                } else if ("identity".equals(fieldName)) {
                    deserializedIssuerCertificateInfo.identity
                        = CustomJwtAuthenticationManagedIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIssuerCertificateInfo;
        });
    }
}
