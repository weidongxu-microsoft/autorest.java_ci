// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of SSL certificates of application gateway.
 */
@Fluent
public final class VpnClientRootCertificatePropertiesFormat
    implements JsonSerializable<VpnClientRootCertificatePropertiesFormat> {
    /*
     * The certificate public data.
     */
    private String publicCertData;

    /*
     * The provisioning state of the VPN client root certificate resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VpnClientRootCertificatePropertiesFormat class.
     */
    public VpnClientRootCertificatePropertiesFormat() {
    }

    /**
     * Get the publicCertData property: The certificate public data.
     * 
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Set the publicCertData property: The certificate public data.
     * 
     * @param publicCertData the publicCertData value to set.
     * @return the VpnClientRootCertificatePropertiesFormat object itself.
     */
    public VpnClientRootCertificatePropertiesFormat withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client root certificate resource.
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
        if (publicCertData() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publicCertData in model VpnClientRootCertificatePropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VpnClientRootCertificatePropertiesFormat.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("publicCertData", this.publicCertData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnClientRootCertificatePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnClientRootCertificatePropertiesFormat if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VpnClientRootCertificatePropertiesFormat.
     */
    public static VpnClientRootCertificatePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnClientRootCertificatePropertiesFormat deserializedVpnClientRootCertificatePropertiesFormat
                = new VpnClientRootCertificatePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publicCertData".equals(fieldName)) {
                    deserializedVpnClientRootCertificatePropertiesFormat.publicCertData = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVpnClientRootCertificatePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnClientRootCertificatePropertiesFormat;
        });
    }
}
