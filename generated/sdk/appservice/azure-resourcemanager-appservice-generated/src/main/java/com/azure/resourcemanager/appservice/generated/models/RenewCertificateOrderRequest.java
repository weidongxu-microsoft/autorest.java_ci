// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.fluent.models.RenewCertificateOrderRequestProperties;
import java.io.IOException;

/**
 * Class representing certificate renew request.
 */
@Fluent
public final class RenewCertificateOrderRequest extends ProxyOnlyResource {
    /*
     * RenewCertificateOrderRequest resource specific properties
     */
    private RenewCertificateOrderRequestProperties innerProperties;

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
     * Creates an instance of RenewCertificateOrderRequest class.
     */
    public RenewCertificateOrderRequest() {
    }

    /**
     * Get the innerProperties property: RenewCertificateOrderRequest resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private RenewCertificateOrderRequestProperties innerProperties() {
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
    public RenewCertificateOrderRequest withKind(String kind) {
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
     * @return the RenewCertificateOrderRequest object itself.
     */
    public RenewCertificateOrderRequest withKeySize(Integer keySize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RenewCertificateOrderRequestProperties();
        }
        this.innerProperties().withKeySize(keySize);
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
     * @return the RenewCertificateOrderRequest object itself.
     */
    public RenewCertificateOrderRequest withCsr(String csr) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RenewCertificateOrderRequestProperties();
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
     * @return the RenewCertificateOrderRequest object itself.
     */
    public RenewCertificateOrderRequest withIsPrivateKeyExternal(Boolean isPrivateKeyExternal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RenewCertificateOrderRequestProperties();
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
     * Reads an instance of RenewCertificateOrderRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RenewCertificateOrderRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RenewCertificateOrderRequest.
     */
    public static RenewCertificateOrderRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RenewCertificateOrderRequest deserializedRenewCertificateOrderRequest = new RenewCertificateOrderRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRenewCertificateOrderRequest.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRenewCertificateOrderRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRenewCertificateOrderRequest.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedRenewCertificateOrderRequest.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedRenewCertificateOrderRequest.innerProperties
                        = RenewCertificateOrderRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRenewCertificateOrderRequest;
        });
    }
}
