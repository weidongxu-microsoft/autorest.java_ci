// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Virtual Network Tap resource.
 */
@Fluent
public final class VirtualNetworkTapInner extends Resource {
    /*
     * Virtual Network Tap Properties.
     */
    private VirtualNetworkTapPropertiesFormatInner innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of VirtualNetworkTapInner class.
     */
    public VirtualNetworkTapInner() {
    }

    /**
     * Get the innerProperties property: Virtual Network Tap Properties.
     * 
     * @return the innerProperties value.
     */
    private VirtualNetworkTapPropertiesFormatInner innerProperties() {
        return this.innerProperties;
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
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withId(String id) {
        this.id = id;
        return this;
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
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualNetworkTapInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualNetworkTapInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the networkInterfaceTapConfigurations property: Specifies the list of resource IDs for the network interface
     * IP configuration that needs to be tapped.
     * 
     * @return the networkInterfaceTapConfigurations value.
     */
    public List<NetworkInterfaceTapConfigurationInner> networkInterfaceTapConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterfaceTapConfigurations();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network tap resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network tap resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     * 
     * @return the destinationNetworkInterfaceIpConfiguration value.
     */
    public NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().destinationNetworkInterfaceIpConfiguration();
    }

    /**
     * Set the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     * 
     * @param destinationNetworkInterfaceIpConfiguration the destinationNetworkInterfaceIpConfiguration value to set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationNetworkInterfaceIpConfiguration(
        NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkTapPropertiesFormatInner();
        }
        this.innerProperties()
            .withDestinationNetworkInterfaceIpConfiguration(destinationNetworkInterfaceIpConfiguration);
        return this;
    }

    /**
     * Get the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     * 
     * @return the destinationLoadBalancerFrontEndIpConfiguration value.
     */
    public FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().destinationLoadBalancerFrontEndIpConfiguration();
    }

    /**
     * Set the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     * 
     * @param destinationLoadBalancerFrontEndIpConfiguration the destinationLoadBalancerFrontEndIpConfiguration value to
     * set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationLoadBalancerFrontEndIpConfiguration(
        FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkTapPropertiesFormatInner();
        }
        this.innerProperties()
            .withDestinationLoadBalancerFrontEndIpConfiguration(destinationLoadBalancerFrontEndIpConfiguration);
        return this;
    }

    /**
     * Get the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     * 
     * @return the destinationPort value.
     */
    public Integer destinationPort() {
        return this.innerProperties() == null ? null : this.innerProperties().destinationPort();
    }

    /**
     * Set the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     * 
     * @param destinationPort the destinationPort value to set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationPort(Integer destinationPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkTapPropertiesFormatInner();
        }
        this.innerProperties().withDestinationPort(destinationPort);
        return this;
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkTapInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkTapInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualNetworkTapInner.
     */
    public static VirtualNetworkTapInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkTapInner deserializedVirtualNetworkTapInner = new VirtualNetworkTapInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVirtualNetworkTapInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVirtualNetworkTapInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualNetworkTapInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedVirtualNetworkTapInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVirtualNetworkTapInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedVirtualNetworkTapInner.innerProperties
                        = VirtualNetworkTapPropertiesFormatInner.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedVirtualNetworkTapInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedVirtualNetworkTapInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkTapInner;
        });
    }
}
