// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayTrustedClientCertificatePropertiesFormat;
import java.io.IOException;

/**
 * Trusted client certificates of an application gateway.
 */
@Fluent
public final class ApplicationGatewayTrustedClientCertificate extends SubResource {
    /*
     * Properties of the application gateway trusted client certificate.
     */
    private ApplicationGatewayTrustedClientCertificatePropertiesFormat innerProperties;

    /*
     * Name of the trusted client certificate that is unique within an Application Gateway.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ApplicationGatewayTrustedClientCertificate class.
     */
    public ApplicationGatewayTrustedClientCertificate() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway trusted client certificate.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayTrustedClientCertificatePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the trusted client certificate that is unique within an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the trusted client certificate that is unique within an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayTrustedClientCertificate object itself.
     */
    public ApplicationGatewayTrustedClientCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayTrustedClientCertificate withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the data property: Certificate public data.
     * 
     * @return the data value.
     */
    public String data() {
        return this.innerProperties() == null ? null : this.innerProperties().data();
    }

    /**
     * Set the data property: Certificate public data.
     * 
     * @param data the data value to set.
     * @return the ApplicationGatewayTrustedClientCertificate object itself.
     */
    public ApplicationGatewayTrustedClientCertificate withData(String data) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayTrustedClientCertificatePropertiesFormat();
        }
        this.innerProperties().withData(data);
        return this;
    }

    /**
     * Get the validatedCertData property: Validated certificate data.
     * 
     * @return the validatedCertData value.
     */
    public String validatedCertData() {
        return this.innerProperties() == null ? null : this.innerProperties().validatedCertData();
    }

    /**
     * Get the clientCertIssuerDN property: Distinguished name of client certificate issuer.
     * 
     * @return the clientCertIssuerDN value.
     */
    public String clientCertIssuerDN() {
        return this.innerProperties() == null ? null : this.innerProperties().clientCertIssuerDN();
    }

    /**
     * Get the provisioningState property: The provisioning state of the trusted client certificate resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayTrustedClientCertificate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayTrustedClientCertificate if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayTrustedClientCertificate.
     */
    public static ApplicationGatewayTrustedClientCertificate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayTrustedClientCertificate deserializedApplicationGatewayTrustedClientCertificate
                = new ApplicationGatewayTrustedClientCertificate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedClientCertificate.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedClientCertificate.innerProperties
                        = ApplicationGatewayTrustedClientCertificatePropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedClientCertificate.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedClientCertificate.etag = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationGatewayTrustedClientCertificate.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayTrustedClientCertificate;
        });
    }
}
