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
 * Properties of the revoked VPN client certificate of virtual network gateway.
 */
@Fluent
public final class VpnClientRevokedCertificatePropertiesFormat
    implements JsonSerializable<VpnClientRevokedCertificatePropertiesFormat> {
    /*
     * The revoked VPN client certificate thumbprint.
     */
    private String thumbprint;

    /*
     * The provisioning state of the VPN client revoked certificate resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VpnClientRevokedCertificatePropertiesFormat class.
     */
    public VpnClientRevokedCertificatePropertiesFormat() {
    }

    /**
     * Get the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the VpnClientRevokedCertificatePropertiesFormat object itself.
     */
    public VpnClientRevokedCertificatePropertiesFormat withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client revoked certificate resource.
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
        jsonWriter.writeStringField("thumbprint", this.thumbprint);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnClientRevokedCertificatePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnClientRevokedCertificatePropertiesFormat if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnClientRevokedCertificatePropertiesFormat.
     */
    public static VpnClientRevokedCertificatePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnClientRevokedCertificatePropertiesFormat deserializedVpnClientRevokedCertificatePropertiesFormat
                = new VpnClientRevokedCertificatePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("thumbprint".equals(fieldName)) {
                    deserializedVpnClientRevokedCertificatePropertiesFormat.thumbprint = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVpnClientRevokedCertificatePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnClientRevokedCertificatePropertiesFormat;
        });
    }
}
