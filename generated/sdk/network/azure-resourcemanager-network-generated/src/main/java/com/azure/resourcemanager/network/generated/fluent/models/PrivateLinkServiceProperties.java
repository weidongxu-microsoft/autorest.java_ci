// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServicePropertiesAutoApproval;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServicePropertiesVisibility;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the private link service.
 */
@Fluent
public final class PrivateLinkServiceProperties implements JsonSerializable<PrivateLinkServiceProperties> {
    /*
     * An array of references to the load balancer IP configurations.
     */
    private List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations;

    /*
     * An array of private link service IP configurations.
     */
    private List<PrivateLinkServiceIpConfigurationInner> ipConfigurations;

    /*
     * An array of references to the network interfaces created for this private link service.
     */
    private List<NetworkInterfaceInner> networkInterfaces;

    /*
     * The provisioning state of the private link service resource.
     */
    private ProvisioningState provisioningState;

    /*
     * An array of list about connections to the private endpoint.
     */
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The visibility list of the private link service.
     */
    private PrivateLinkServicePropertiesVisibility visibility;

    /*
     * The auto-approval list of the private link service.
     */
    private PrivateLinkServicePropertiesAutoApproval autoApproval;

    /*
     * The list of Fqdn.
     */
    private List<String> fqdns;

    /*
     * The alias of the private link service.
     */
    private String alias;

    /*
     * Whether the private link service is enabled for proxy protocol or not.
     */
    private Boolean enableProxyProtocol;

    /**
     * Creates an instance of PrivateLinkServiceProperties class.
     */
    public PrivateLinkServiceProperties() {
    }

    /**
     * Get the loadBalancerFrontendIpConfigurations property: An array of references to the load balancer IP
     * configurations.
     * 
     * @return the loadBalancerFrontendIpConfigurations value.
     */
    public List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations() {
        return this.loadBalancerFrontendIpConfigurations;
    }

    /**
     * Set the loadBalancerFrontendIpConfigurations property: An array of references to the load balancer IP
     * configurations.
     * 
     * @param loadBalancerFrontendIpConfigurations the loadBalancerFrontendIpConfigurations value to set.
     * @return the PrivateLinkServiceProperties object itself.
     */
    public PrivateLinkServiceProperties withLoadBalancerFrontendIpConfigurations(
        List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations) {
        this.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
        return this;
    }

    /**
     * Get the ipConfigurations property: An array of private link service IP configurations.
     * 
     * @return the ipConfigurations value.
     */
    public List<PrivateLinkServiceIpConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: An array of private link service IP configurations.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the PrivateLinkServiceProperties object itself.
     */
    public PrivateLinkServiceProperties
        withIpConfigurations(List<PrivateLinkServiceIpConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the networkInterfaces property: An array of references to the network interfaces created for this private
     * link service.
     * 
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private link service resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpointConnections property: An array of list about connections to the private endpoint.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the visibility property: The visibility list of the private link service.
     * 
     * @return the visibility value.
     */
    public PrivateLinkServicePropertiesVisibility visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: The visibility list of the private link service.
     * 
     * @param visibility the visibility value to set.
     * @return the PrivateLinkServiceProperties object itself.
     */
    public PrivateLinkServiceProperties withVisibility(PrivateLinkServicePropertiesVisibility visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the autoApproval property: The auto-approval list of the private link service.
     * 
     * @return the autoApproval value.
     */
    public PrivateLinkServicePropertiesAutoApproval autoApproval() {
        return this.autoApproval;
    }

    /**
     * Set the autoApproval property: The auto-approval list of the private link service.
     * 
     * @param autoApproval the autoApproval value to set.
     * @return the PrivateLinkServiceProperties object itself.
     */
    public PrivateLinkServiceProperties withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval) {
        this.autoApproval = autoApproval;
        return this;
    }

    /**
     * Get the fqdns property: The list of Fqdn.
     * 
     * @return the fqdns value.
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Set the fqdns property: The list of Fqdn.
     * 
     * @param fqdns the fqdns value to set.
     * @return the PrivateLinkServiceProperties object itself.
     */
    public PrivateLinkServiceProperties withFqdns(List<String> fqdns) {
        this.fqdns = fqdns;
        return this;
    }

    /**
     * Get the alias property: The alias of the private link service.
     * 
     * @return the alias value.
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Get the enableProxyProtocol property: Whether the private link service is enabled for proxy protocol or not.
     * 
     * @return the enableProxyProtocol value.
     */
    public Boolean enableProxyProtocol() {
        return this.enableProxyProtocol;
    }

    /**
     * Set the enableProxyProtocol property: Whether the private link service is enabled for proxy protocol or not.
     * 
     * @param enableProxyProtocol the enableProxyProtocol value to set.
     * @return the PrivateLinkServiceProperties object itself.
     */
    public PrivateLinkServiceProperties withEnableProxyProtocol(Boolean enableProxyProtocol) {
        this.enableProxyProtocol = enableProxyProtocol;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loadBalancerFrontendIpConfigurations() != null) {
            loadBalancerFrontendIpConfigurations().forEach(e -> e.validate());
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (visibility() != null) {
            visibility().validate();
        }
        if (autoApproval() != null) {
            autoApproval().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("loadBalancerFrontendIpConfigurations", this.loadBalancerFrontendIpConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("ipConfigurations", this.ipConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("visibility", this.visibility);
        jsonWriter.writeJsonField("autoApproval", this.autoApproval);
        jsonWriter.writeArrayField("fqdns", this.fqdns, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("enableProxyProtocol", this.enableProxyProtocol);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkServiceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkServiceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkServiceProperties.
     */
    public static PrivateLinkServiceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkServiceProperties deserializedPrivateLinkServiceProperties = new PrivateLinkServiceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("loadBalancerFrontendIpConfigurations".equals(fieldName)) {
                    List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations
                        = reader.readArray(reader1 -> FrontendIpConfigurationInner.fromJson(reader1));
                    deserializedPrivateLinkServiceProperties.loadBalancerFrontendIpConfigurations
                        = loadBalancerFrontendIpConfigurations;
                } else if ("ipConfigurations".equals(fieldName)) {
                    List<PrivateLinkServiceIpConfigurationInner> ipConfigurations
                        = reader.readArray(reader1 -> PrivateLinkServiceIpConfigurationInner.fromJson(reader1));
                    deserializedPrivateLinkServiceProperties.ipConfigurations = ipConfigurations;
                } else if ("networkInterfaces".equals(fieldName)) {
                    List<NetworkInterfaceInner> networkInterfaces
                        = reader.readArray(reader1 -> NetworkInterfaceInner.fromJson(reader1));
                    deserializedPrivateLinkServiceProperties.networkInterfaces = networkInterfaces;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPrivateLinkServiceProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedPrivateLinkServiceProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("visibility".equals(fieldName)) {
                    deserializedPrivateLinkServiceProperties.visibility
                        = PrivateLinkServicePropertiesVisibility.fromJson(reader);
                } else if ("autoApproval".equals(fieldName)) {
                    deserializedPrivateLinkServiceProperties.autoApproval
                        = PrivateLinkServicePropertiesAutoApproval.fromJson(reader);
                } else if ("fqdns".equals(fieldName)) {
                    List<String> fqdns = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateLinkServiceProperties.fqdns = fqdns;
                } else if ("alias".equals(fieldName)) {
                    deserializedPrivateLinkServiceProperties.alias = reader.getString();
                } else if ("enableProxyProtocol".equals(fieldName)) {
                    deserializedPrivateLinkServiceProperties.enableProxyProtocol
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkServiceProperties;
        });
    }
}
