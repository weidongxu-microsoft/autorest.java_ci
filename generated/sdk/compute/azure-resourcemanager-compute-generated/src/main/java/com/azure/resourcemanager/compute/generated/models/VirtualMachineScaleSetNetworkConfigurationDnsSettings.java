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
import java.util.List;

/**
 * Describes a virtual machines scale sets network configuration's DNS settings.
 */
@Fluent
public final class VirtualMachineScaleSetNetworkConfigurationDnsSettings
    implements JsonSerializable<VirtualMachineScaleSetNetworkConfigurationDnsSettings> {
    /*
     * List of DNS servers IP addresses
     */
    private List<String> dnsServers;

    /**
     * Creates an instance of VirtualMachineScaleSetNetworkConfigurationDnsSettings class.
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings() {
    }

    /**
     * Get the dnsServers property: List of DNS servers IP addresses.
     * 
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: List of DNS servers IP addresses.
     * 
     * @param dnsServers the dnsServers value to set.
     * @return the VirtualMachineScaleSetNetworkConfigurationDnsSettings object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
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
        jsonWriter.writeArrayField("dnsServers", this.dnsServers, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetNetworkConfigurationDnsSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetNetworkConfigurationDnsSettings if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetNetworkConfigurationDnsSettings.
     */
    public static VirtualMachineScaleSetNetworkConfigurationDnsSettings fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetNetworkConfigurationDnsSettings deserializedVirtualMachineScaleSetNetworkConfigurationDnsSettings
                = new VirtualMachineScaleSetNetworkConfigurationDnsSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dnsServers".equals(fieldName)) {
                    List<String> dnsServers = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualMachineScaleSetNetworkConfigurationDnsSettings.dnsServers = dnsServers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetNetworkConfigurationDnsSettings;
        });
    }
}
