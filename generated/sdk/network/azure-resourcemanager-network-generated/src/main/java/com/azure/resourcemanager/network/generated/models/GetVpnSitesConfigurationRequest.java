// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * List of Vpn-Sites.
 */
@Fluent
public final class GetVpnSitesConfigurationRequest implements JsonSerializable<GetVpnSitesConfigurationRequest> {
    /*
     * List of resource-ids of the vpn-sites for which config is to be downloaded.
     */
    private List<String> vpnSites;

    /*
     * The sas-url to download the configurations for vpn-sites.
     */
    private String outputBlobSasUrl;

    /**
     * Creates an instance of GetVpnSitesConfigurationRequest class.
     */
    public GetVpnSitesConfigurationRequest() {
    }

    /**
     * Get the vpnSites property: List of resource-ids of the vpn-sites for which config is to be downloaded.
     * 
     * @return the vpnSites value.
     */
    public List<String> vpnSites() {
        return this.vpnSites;
    }

    /**
     * Set the vpnSites property: List of resource-ids of the vpn-sites for which config is to be downloaded.
     * 
     * @param vpnSites the vpnSites value to set.
     * @return the GetVpnSitesConfigurationRequest object itself.
     */
    public GetVpnSitesConfigurationRequest withVpnSites(List<String> vpnSites) {
        this.vpnSites = vpnSites;
        return this;
    }

    /**
     * Get the outputBlobSasUrl property: The sas-url to download the configurations for vpn-sites.
     * 
     * @return the outputBlobSasUrl value.
     */
    public String outputBlobSasUrl() {
        return this.outputBlobSasUrl;
    }

    /**
     * Set the outputBlobSasUrl property: The sas-url to download the configurations for vpn-sites.
     * 
     * @param outputBlobSasUrl the outputBlobSasUrl value to set.
     * @return the GetVpnSitesConfigurationRequest object itself.
     */
    public GetVpnSitesConfigurationRequest withOutputBlobSasUrl(String outputBlobSasUrl) {
        this.outputBlobSasUrl = outputBlobSasUrl;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outputBlobSasUrl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property outputBlobSasUrl in model GetVpnSitesConfigurationRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GetVpnSitesConfigurationRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("outputBlobSasUrl", this.outputBlobSasUrl);
        jsonWriter.writeArrayField("vpnSites", this.vpnSites, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetVpnSitesConfigurationRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetVpnSitesConfigurationRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetVpnSitesConfigurationRequest.
     */
    public static GetVpnSitesConfigurationRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetVpnSitesConfigurationRequest deserializedGetVpnSitesConfigurationRequest
                = new GetVpnSitesConfigurationRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("outputBlobSasUrl".equals(fieldName)) {
                    deserializedGetVpnSitesConfigurationRequest.outputBlobSasUrl = reader.getString();
                } else if ("vpnSites".equals(fieldName)) {
                    List<String> vpnSites = reader.readArray(reader1 -> reader1.getString());
                    deserializedGetVpnSitesConfigurationRequest.vpnSites = vpnSites;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetVpnSitesConfigurationRequest;
        });
    }
}
