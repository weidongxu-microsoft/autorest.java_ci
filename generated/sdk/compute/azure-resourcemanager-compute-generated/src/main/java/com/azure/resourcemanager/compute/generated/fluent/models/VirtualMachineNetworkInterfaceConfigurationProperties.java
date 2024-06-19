// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.DeleteOptions;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceAuxiliaryMode;
import com.azure.resourcemanager.compute.generated.models.NetworkInterfaceAuxiliarySku;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceDnsSettingsConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineNetworkInterfaceIpConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * Describes a virtual machine network profile's IP configuration.
 */
@Fluent
public final class VirtualMachineNetworkInterfaceConfigurationProperties
    implements JsonSerializable<VirtualMachineNetworkInterfaceConfigurationProperties> {
    /*
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     */
    private Boolean primary;

    /*
     * Specify what happens to the network interface when the VM is deleted
     */
    private DeleteOptions deleteOption;

    /*
     * Specifies whether the network interface is accelerated networking-enabled.
     */
    private Boolean enableAcceleratedNetworking;

    /*
     * Specifies whether the network interface is disabled for tcp state tracking.
     */
    private Boolean disableTcpStateTracking;

    /*
     * Specifies whether the network interface is FPGA networking-enabled.
     */
    private Boolean enableFpga;

    /*
     * Whether IP forwarding enabled on this NIC.
     */
    private Boolean enableIpForwarding;

    /*
     * The network security group.
     */
    private SubResource networkSecurityGroup;

    /*
     * The dns settings to be applied on the network interfaces.
     */
    private VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings;

    /*
     * Specifies the IP configurations of the network interface.
     */
    private List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * The dscpConfiguration property.
     */
    private SubResource dscpConfiguration;

    /*
     * Specifies whether the Auxiliary mode is enabled for the Network Interface resource.
     */
    private NetworkInterfaceAuxiliaryMode auxiliaryMode;

    /*
     * Specifies whether the Auxiliary sku is enabled for the Network Interface resource.
     */
    private NetworkInterfaceAuxiliarySku auxiliarySku;

    /**
     * Creates an instance of VirtualMachineNetworkInterfaceConfigurationProperties class.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties() {
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @param primary the primary value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withDeleteOption(DeleteOptions deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     * 
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     * 
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the disableTcpStateTracking property: Specifies whether the network interface is disabled for tcp state
     * tracking.
     * 
     * @return the disableTcpStateTracking value.
     */
    public Boolean disableTcpStateTracking() {
        return this.disableTcpStateTracking;
    }

    /**
     * Set the disableTcpStateTracking property: Specifies whether the network interface is disabled for tcp state
     * tracking.
     * 
     * @param disableTcpStateTracking the disableTcpStateTracking value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withDisableTcpStateTracking(Boolean disableTcpStateTracking) {
        this.disableTcpStateTracking = disableTcpStateTracking;
        return this;
    }

    /**
     * Get the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     * 
     * @return the enableFpga value.
     */
    public Boolean enableFpga() {
        return this.enableFpga;
    }

    /**
     * Set the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     * 
     * @param enableFpga the enableFpga value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withEnableFpga(Boolean enableFpga) {
        this.enableFpga = enableFpga;
        return this;
    }

    /**
     * Get the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     * 
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.enableIpForwarding;
    }

    /**
     * Set the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     * 
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withEnableIpForwarding(Boolean enableIpForwarding) {
        this.enableIpForwarding = enableIpForwarding;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The network security group.
     * 
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The network security group.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the network interfaces.
     * 
     * @return the dnsSettings value.
     */
    public VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the network interfaces.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withDnsSettings(VirtualMachineNetworkInterfaceDnsSettingsConfiguration dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipConfigurations property: Specifies the IP configurations of the network interface.
     * 
     * @return the ipConfigurations value.
     */
    public List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: Specifies the IP configurations of the network interface.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withIpConfigurations(List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the dscpConfiguration property: The dscpConfiguration property.
     * 
     * @return the dscpConfiguration value.
     */
    public SubResource dscpConfiguration() {
        return this.dscpConfiguration;
    }

    /**
     * Set the dscpConfiguration property: The dscpConfiguration property.
     * 
     * @param dscpConfiguration the dscpConfiguration value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties withDscpConfiguration(SubResource dscpConfiguration) {
        this.dscpConfiguration = dscpConfiguration;
        return this;
    }

    /**
     * Get the auxiliaryMode property: Specifies whether the Auxiliary mode is enabled for the Network Interface
     * resource.
     * 
     * @return the auxiliaryMode value.
     */
    public NetworkInterfaceAuxiliaryMode auxiliaryMode() {
        return this.auxiliaryMode;
    }

    /**
     * Set the auxiliaryMode property: Specifies whether the Auxiliary mode is enabled for the Network Interface
     * resource.
     * 
     * @param auxiliaryMode the auxiliaryMode value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withAuxiliaryMode(NetworkInterfaceAuxiliaryMode auxiliaryMode) {
        this.auxiliaryMode = auxiliaryMode;
        return this;
    }

    /**
     * Get the auxiliarySku property: Specifies whether the Auxiliary sku is enabled for the Network Interface resource.
     * 
     * @return the auxiliarySku value.
     */
    public NetworkInterfaceAuxiliarySku auxiliarySku() {
        return this.auxiliarySku;
    }

    /**
     * Set the auxiliarySku property: Specifies whether the Auxiliary sku is enabled for the Network Interface resource.
     * 
     * @param auxiliarySku the auxiliarySku value to set.
     * @return the VirtualMachineNetworkInterfaceConfigurationProperties object itself.
     */
    public VirtualMachineNetworkInterfaceConfigurationProperties
        withAuxiliarySku(NetworkInterfaceAuxiliarySku auxiliarySku) {
        this.auxiliarySku = auxiliarySku;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (ipConfigurations() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ipConfigurations in model VirtualMachineNetworkInterfaceConfigurationProperties"));
        } else {
            ipConfigurations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(VirtualMachineNetworkInterfaceConfigurationProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("ipConfigurations", this.ipConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("primary", this.primary);
        jsonWriter.writeStringField("deleteOption", this.deleteOption == null ? null : this.deleteOption.toString());
        jsonWriter.writeBooleanField("enableAcceleratedNetworking", this.enableAcceleratedNetworking);
        jsonWriter.writeBooleanField("disableTcpStateTracking", this.disableTcpStateTracking);
        jsonWriter.writeBooleanField("enableFpga", this.enableFpga);
        jsonWriter.writeBooleanField("enableIPForwarding", this.enableIpForwarding);
        jsonWriter.writeJsonField("networkSecurityGroup", this.networkSecurityGroup);
        jsonWriter.writeJsonField("dnsSettings", this.dnsSettings);
        jsonWriter.writeJsonField("dscpConfiguration", this.dscpConfiguration);
        jsonWriter.writeStringField("auxiliaryMode", this.auxiliaryMode == null ? null : this.auxiliaryMode.toString());
        jsonWriter.writeStringField("auxiliarySku", this.auxiliarySku == null ? null : this.auxiliarySku.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineNetworkInterfaceConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineNetworkInterfaceConfigurationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualMachineNetworkInterfaceConfigurationProperties.
     */
    public static VirtualMachineNetworkInterfaceConfigurationProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineNetworkInterfaceConfigurationProperties deserializedVirtualMachineNetworkInterfaceConfigurationProperties
                = new VirtualMachineNetworkInterfaceConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipConfigurations".equals(fieldName)) {
                    List<VirtualMachineNetworkInterfaceIpConfiguration> ipConfigurations
                        = reader.readArray(reader1 -> VirtualMachineNetworkInterfaceIpConfiguration.fromJson(reader1));
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.ipConfigurations
                        = ipConfigurations;
                } else if ("primary".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.primary
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("deleteOption".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.deleteOption
                        = DeleteOptions.fromString(reader.getString());
                } else if ("enableAcceleratedNetworking".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.enableAcceleratedNetworking
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("disableTcpStateTracking".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.disableTcpStateTracking
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableFpga".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.enableFpga
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableIPForwarding".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.enableIpForwarding
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("networkSecurityGroup".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.networkSecurityGroup
                        = SubResource.fromJson(reader);
                } else if ("dnsSettings".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.dnsSettings
                        = VirtualMachineNetworkInterfaceDnsSettingsConfiguration.fromJson(reader);
                } else if ("dscpConfiguration".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.dscpConfiguration
                        = SubResource.fromJson(reader);
                } else if ("auxiliaryMode".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.auxiliaryMode
                        = NetworkInterfaceAuxiliaryMode.fromString(reader.getString());
                } else if ("auxiliarySku".equals(fieldName)) {
                    deserializedVirtualMachineNetworkInterfaceConfigurationProperties.auxiliarySku
                        = NetworkInterfaceAuxiliarySku.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineNetworkInterfaceConfigurationProperties;
        });
    }
}
