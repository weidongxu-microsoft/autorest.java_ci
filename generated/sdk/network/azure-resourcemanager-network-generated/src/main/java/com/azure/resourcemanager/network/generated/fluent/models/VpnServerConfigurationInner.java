// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.AadAuthenticationParameters;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.RadiusServer;
import com.azure.resourcemanager.network.generated.models.VpnAuthenticationType;
import com.azure.resourcemanager.network.generated.models.VpnGatewayTunnelingProtocol;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigRadiusClientRootCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigRadiusServerRootCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigVpnClientRevokedCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigVpnClientRootCertificate;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * VpnServerConfiguration Resource.
 */
@Fluent
public final class VpnServerConfigurationInner extends Resource {
    /*
     * Properties of the P2SVpnServer configuration.
     */
    private VpnServerConfigurationProperties innerProperties;

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
     * Creates an instance of VpnServerConfigurationInner class.
     */
    public VpnServerConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the P2SVpnServer configuration.
     * 
     * @return the innerProperties value.
     */
    private VpnServerConfigurationProperties innerProperties() {
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
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withId(String id) {
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
    public VpnServerConfigurationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VpnServerConfigurationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the name property: The name of the VpnServerConfiguration that is unique within a resource group.
     * 
     * @return the name value.
     */
    public String namePropertiesName() {
        return this.innerProperties() == null ? null : this.innerProperties().name();
    }

    /**
     * Set the name property: The name of the VpnServerConfiguration that is unique within a resource group.
     * 
     * @param name the name value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withNamePropertiesName(String name) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withName(name);
        return this;
    }

    /**
     * Get the vpnProtocols property: VPN protocols for the VpnServerConfiguration.
     * 
     * @return the vpnProtocols value.
     */
    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnProtocols();
    }

    /**
     * Set the vpnProtocols property: VPN protocols for the VpnServerConfiguration.
     * 
     * @param vpnProtocols the vpnProtocols value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withVpnProtocols(vpnProtocols);
        return this;
    }

    /**
     * Get the vpnAuthenticationTypes property: VPN authentication types for the VpnServerConfiguration.
     * 
     * @return the vpnAuthenticationTypes value.
     */
    public List<VpnAuthenticationType> vpnAuthenticationTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnAuthenticationTypes();
    }

    /**
     * Set the vpnAuthenticationTypes property: VPN authentication types for the VpnServerConfiguration.
     * 
     * @param vpnAuthenticationTypes the vpnAuthenticationTypes value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnAuthenticationTypes(List<VpnAuthenticationType> vpnAuthenticationTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withVpnAuthenticationTypes(vpnAuthenticationTypes);
        return this;
    }

    /**
     * Get the vpnClientRootCertificates property: VPN client root certificate of VpnServerConfiguration.
     * 
     * @return the vpnClientRootCertificates value.
     */
    public List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientRootCertificates();
    }

    /**
     * Set the vpnClientRootCertificates property: VPN client root certificate of VpnServerConfiguration.
     * 
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner
        withVpnClientRootCertificates(List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withVpnClientRootCertificates(vpnClientRootCertificates);
        return this;
    }

    /**
     * Get the vpnClientRevokedCertificates property: VPN client revoked certificate of VpnServerConfiguration.
     * 
     * @return the vpnClientRevokedCertificates value.
     */
    public List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientRevokedCertificates();
    }

    /**
     * Set the vpnClientRevokedCertificates property: VPN client revoked certificate of VpnServerConfiguration.
     * 
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientRevokedCertificates(
        List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withVpnClientRevokedCertificates(vpnClientRevokedCertificates);
        return this;
    }

    /**
     * Get the radiusServerRootCertificates property: Radius Server root certificate of VpnServerConfiguration.
     * 
     * @return the radiusServerRootCertificates value.
     */
    public List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().radiusServerRootCertificates();
    }

    /**
     * Set the radiusServerRootCertificates property: Radius Server root certificate of VpnServerConfiguration.
     * 
     * @param radiusServerRootCertificates the radiusServerRootCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerRootCertificates(
        List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withRadiusServerRootCertificates(radiusServerRootCertificates);
        return this;
    }

    /**
     * Get the radiusClientRootCertificates property: Radius client root certificate of VpnServerConfiguration.
     * 
     * @return the radiusClientRootCertificates value.
     */
    public List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().radiusClientRootCertificates();
    }

    /**
     * Set the radiusClientRootCertificates property: Radius client root certificate of VpnServerConfiguration.
     * 
     * @param radiusClientRootCertificates the radiusClientRootCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusClientRootCertificates(
        List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withRadiusClientRootCertificates(radiusClientRootCertificates);
        return this;
    }

    /**
     * Get the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     * @return the vpnClientIpsecPolicies value.
     */
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientIpsecPolicies();
    }

    /**
     * Set the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     * @param vpnClientIpsecPolicies the vpnClientIpsecPolicies value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withVpnClientIpsecPolicies(vpnClientIpsecPolicies);
        return this;
    }

    /**
     * Get the radiusServerAddress property: The radius server address property of the VpnServerConfiguration resource
     * for point to site client connection.
     * 
     * @return the radiusServerAddress value.
     */
    public String radiusServerAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().radiusServerAddress();
    }

    /**
     * Set the radiusServerAddress property: The radius server address property of the VpnServerConfiguration resource
     * for point to site client connection.
     * 
     * @param radiusServerAddress the radiusServerAddress value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerAddress(String radiusServerAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withRadiusServerAddress(radiusServerAddress);
        return this;
    }

    /**
     * Get the radiusServerSecret property: The radius secret property of the VpnServerConfiguration resource for point
     * to site client connection.
     * 
     * @return the radiusServerSecret value.
     */
    public String radiusServerSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().radiusServerSecret();
    }

    /**
     * Set the radiusServerSecret property: The radius secret property of the VpnServerConfiguration resource for point
     * to site client connection.
     * 
     * @param radiusServerSecret the radiusServerSecret value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerSecret(String radiusServerSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withRadiusServerSecret(radiusServerSecret);
        return this;
    }

    /**
     * Get the radiusServers property: Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     * @return the radiusServers value.
     */
    public List<RadiusServer> radiusServers() {
        return this.innerProperties() == null ? null : this.innerProperties().radiusServers();
    }

    /**
     * Set the radiusServers property: Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     * @param radiusServers the radiusServers value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServers(List<RadiusServer> radiusServers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withRadiusServers(radiusServers);
        return this;
    }

    /**
     * Get the aadAuthenticationParameters property: The set of aad vpn authentication parameters.
     * 
     * @return the aadAuthenticationParameters value.
     */
    public AadAuthenticationParameters aadAuthenticationParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().aadAuthenticationParameters();
    }

    /**
     * Set the aadAuthenticationParameters property: The set of aad vpn authentication parameters.
     * 
     * @param aadAuthenticationParameters the aadAuthenticationParameters value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner
        withAadAuthenticationParameters(AadAuthenticationParameters aadAuthenticationParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withAadAuthenticationParameters(aadAuthenticationParameters);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VpnServerConfiguration resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the p2SVpnGateways property: List of references to P2SVpnGateways.
     * 
     * @return the p2SVpnGateways value.
     */
    public List<P2SVpnGatewayInner> p2SVpnGateways() {
        return this.innerProperties() == null ? null : this.innerProperties().p2SVpnGateways();
    }

    /**
     * Get the configurationPolicyGroups property: List of all VpnServerConfigurationPolicyGroups.
     * 
     * @return the configurationPolicyGroups value.
     */
    public List<VpnServerConfigurationPolicyGroupInner> configurationPolicyGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationPolicyGroups();
    }

    /**
     * Set the configurationPolicyGroups property: List of all VpnServerConfigurationPolicyGroups.
     * 
     * @param configurationPolicyGroups the configurationPolicyGroups value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner
        withConfigurationPolicyGroups(List<VpnServerConfigurationPolicyGroupInner> configurationPolicyGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnServerConfigurationProperties();
        }
        this.innerProperties().withConfigurationPolicyGroups(configurationPolicyGroups);
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etagPropertiesEtag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
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
     * Reads an instance of VpnServerConfigurationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnServerConfigurationInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VpnServerConfigurationInner.
     */
    public static VpnServerConfigurationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnServerConfigurationInner deserializedVpnServerConfigurationInner = new VpnServerConfigurationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVpnServerConfigurationInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVpnServerConfigurationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVpnServerConfigurationInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedVpnServerConfigurationInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVpnServerConfigurationInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedVpnServerConfigurationInner.innerProperties
                        = VpnServerConfigurationProperties.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedVpnServerConfigurationInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedVpnServerConfigurationInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnServerConfigurationInner;
        });
    }
}
