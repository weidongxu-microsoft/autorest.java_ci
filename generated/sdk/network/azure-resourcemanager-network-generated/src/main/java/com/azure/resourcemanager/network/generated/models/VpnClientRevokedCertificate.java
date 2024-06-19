// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.VpnClientRevokedCertificatePropertiesFormat;
import java.io.IOException;

/**
 * VPN client revoked certificate of virtual network gateway.
 */
@Fluent
public final class VpnClientRevokedCertificate extends SubResource {
    /*
     * Properties of the vpn client revoked certificate.
     */
    private VpnClientRevokedCertificatePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of VpnClientRevokedCertificate class.
     */
    public VpnClientRevokedCertificate() {
    }

    /**
     * Get the innerProperties property: Properties of the vpn client revoked certificate.
     * 
     * @return the innerProperties value.
     */
    private VpnClientRevokedCertificatePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the VpnClientRevokedCertificate object itself.
     */
    public VpnClientRevokedCertificate withName(String name) {
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
     * {@inheritDoc}
     */
    @Override
    public VpnClientRevokedCertificate withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Set the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the VpnClientRevokedCertificate object itself.
     */
    public VpnClientRevokedCertificate withThumbprint(String thumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnClientRevokedCertificatePropertiesFormat();
        }
        this.innerProperties().withThumbprint(thumbprint);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client revoked certificate resource.
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
     * Reads an instance of VpnClientRevokedCertificate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnClientRevokedCertificate if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnClientRevokedCertificate.
     */
    public static VpnClientRevokedCertificate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnClientRevokedCertificate deserializedVpnClientRevokedCertificate = new VpnClientRevokedCertificate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVpnClientRevokedCertificate.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVpnClientRevokedCertificate.innerProperties
                        = VpnClientRevokedCertificatePropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedVpnClientRevokedCertificate.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedVpnClientRevokedCertificate.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnClientRevokedCertificate;
        });
    }
}
