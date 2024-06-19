// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Trusted Root certificates properties of an application gateway.
 */
@Fluent
public final class ApplicationGatewayTrustedRootCertificatePropertiesFormat
    implements JsonSerializable<ApplicationGatewayTrustedRootCertificatePropertiesFormat> {
    /*
     * Certificate public data.
     */
    private String data;

    /*
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     */
    private String keyVaultSecretId;

    /*
     * The provisioning state of the trusted root certificate resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ApplicationGatewayTrustedRootCertificatePropertiesFormat class.
     */
    public ApplicationGatewayTrustedRootCertificatePropertiesFormat() {
    }

    /**
     * Get the data property: Certificate public data.
     * 
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Certificate public data.
     * 
     * @param data the data value to set.
     * @return the ApplicationGatewayTrustedRootCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewayTrustedRootCertificatePropertiesFormat withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     * 
     * @return the keyVaultSecretId value.
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     * 
     * @param keyVaultSecretId the keyVaultSecretId value to set.
     * @return the ApplicationGatewayTrustedRootCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewayTrustedRootCertificatePropertiesFormat withKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the trusted root certificate resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("data", this.data);
        jsonWriter.writeStringField("keyVaultSecretId", this.keyVaultSecretId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayTrustedRootCertificatePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayTrustedRootCertificatePropertiesFormat if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * ApplicationGatewayTrustedRootCertificatePropertiesFormat.
     */
    public static ApplicationGatewayTrustedRootCertificatePropertiesFormat fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayTrustedRootCertificatePropertiesFormat deserializedApplicationGatewayTrustedRootCertificatePropertiesFormat
                = new ApplicationGatewayTrustedRootCertificatePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("data".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedRootCertificatePropertiesFormat.data = reader.getString();
                } else if ("keyVaultSecretId".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedRootCertificatePropertiesFormat.keyVaultSecretId
                        = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedRootCertificatePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayTrustedRootCertificatePropertiesFormat;
        });
    }
}
