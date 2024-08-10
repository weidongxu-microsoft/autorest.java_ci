// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.fluent.models.ReissueCertificateOrderRequestProperties;
import java.io.IOException;

/**
 * Class representing certificate reissue request.
 */
@Fluent
public final class ReissueCertificateOrderRequest extends ProxyOnlyResource {
    /*
     * ReissueCertificateOrderRequest resource specific properties
     */
    private ReissueCertificateOrderRequestProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ReissueCertificateOrderRequest class.
     */
    public ReissueCertificateOrderRequest() {
    }

    /**
     * Get the innerProperties property: ReissueCertificateOrderRequest resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private ReissueCertificateOrderRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReissueCertificateOrderRequest withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the keySize property: Certificate Key Size.
     * 
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.innerProperties() == null ? null : this.innerProperties().keySize();
    }

    /**
     * Set the keySize property: Certificate Key Size.
     * 
     * @param keySize the keySize value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withKeySize(Integer keySize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withKeySize(keySize);
        return this;
    }

    /**
     * Get the delayExistingRevokeInHours property: Delay in hours to revoke existing certificate after the new
     * certificate is issued.
     * 
     * @return the delayExistingRevokeInHours value.
     */
    public Integer delayExistingRevokeInHours() {
        return this.innerProperties() == null ? null : this.innerProperties().delayExistingRevokeInHours();
    }

    /**
     * Set the delayExistingRevokeInHours property: Delay in hours to revoke existing certificate after the new
     * certificate is issued.
     * 
     * @param delayExistingRevokeInHours the delayExistingRevokeInHours value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withDelayExistingRevokeInHours(Integer delayExistingRevokeInHours) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withDelayExistingRevokeInHours(delayExistingRevokeInHours);
        return this;
    }

    /**
     * Get the csr property: Csr to be used for re-key operation.
     * 
     * @return the csr value.
     */
    public String csr() {
        return this.innerProperties() == null ? null : this.innerProperties().csr();
    }

    /**
     * Set the csr property: Csr to be used for re-key operation.
     * 
     * @param csr the csr value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withCsr(String csr) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withCsr(csr);
        return this;
    }

    /**
     * Get the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     * 
     * @return the isPrivateKeyExternal value.
     */
    public Boolean isPrivateKeyExternal() {
        return this.innerProperties() == null ? null : this.innerProperties().isPrivateKeyExternal();
    }

    /**
     * Set the isPrivateKeyExternal property: Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     * 
     * @param isPrivateKeyExternal the isPrivateKeyExternal value to set.
     * @return the ReissueCertificateOrderRequest object itself.
     */
    public ReissueCertificateOrderRequest withIsPrivateKeyExternal(Boolean isPrivateKeyExternal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReissueCertificateOrderRequestProperties();
        }
        this.innerProperties().withIsPrivateKeyExternal(isPrivateKeyExternal);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReissueCertificateOrderRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReissueCertificateOrderRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReissueCertificateOrderRequest.
     */
    public static ReissueCertificateOrderRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReissueCertificateOrderRequest deserializedReissueCertificateOrderRequest
                = new ReissueCertificateOrderRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequest.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequest.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequest.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedReissueCertificateOrderRequest.innerProperties
                        = ReissueCertificateOrderRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReissueCertificateOrderRequest;
        });
    }
}
