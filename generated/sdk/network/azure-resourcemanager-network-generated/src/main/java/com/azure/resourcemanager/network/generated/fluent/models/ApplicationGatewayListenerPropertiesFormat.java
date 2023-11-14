// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayProtocol;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of listener of an application gateway.
 */
@Fluent
public final class ApplicationGatewayListenerPropertiesFormat {
    /*
     * Frontend IP configuration resource of an application gateway.
     */
    @JsonProperty(value = "frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * Frontend port resource of an application gateway.
     */
    @JsonProperty(value = "frontendPort")
    private SubResource frontendPort;

    /*
     * Protocol of the listener.
     */
    @JsonProperty(value = "protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * SSL certificate resource of an application gateway.
     */
    @JsonProperty(value = "sslCertificate")
    private SubResource sslCertificate;

    /*
     * SSL profile resource of the application gateway.
     */
    @JsonProperty(value = "sslProfile")
    private SubResource sslProfile;

    /*
     * The provisioning state of the listener resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * List of Server Name Indications(SNI) for TLS Multi-site Listener that allows special wildcard characters as
     * well.
     */
    @JsonProperty(value = "hostNames")
    private List<String> hostNames;

    /**
     * Creates an instance of ApplicationGatewayListenerPropertiesFormat class.
     */
    public ApplicationGatewayListenerPropertiesFormat() {
    }

    /**
     * Get the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     * 
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.frontendIpConfiguration;
    }

    /**
     * Set the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     * 
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the ApplicationGatewayListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayListenerPropertiesFormat withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the frontendPort property: Frontend port resource of an application gateway.
     * 
     * @return the frontendPort value.
     */
    public SubResource frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: Frontend port resource of an application gateway.
     * 
     * @param frontendPort the frontendPort value to set.
     * @return the ApplicationGatewayListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayListenerPropertiesFormat withFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the protocol property: Protocol of the listener.
     * 
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol of the listener.
     * 
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayListenerPropertiesFormat withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sslCertificate property: SSL certificate resource of an application gateway.
     * 
     * @return the sslCertificate value.
     */
    public SubResource sslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate property: SSL certificate resource of an application gateway.
     * 
     * @param sslCertificate the sslCertificate value to set.
     * @return the ApplicationGatewayListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayListenerPropertiesFormat withSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get the sslProfile property: SSL profile resource of the application gateway.
     * 
     * @return the sslProfile value.
     */
    public SubResource sslProfile() {
        return this.sslProfile;
    }

    /**
     * Set the sslProfile property: SSL profile resource of the application gateway.
     * 
     * @param sslProfile the sslProfile value to set.
     * @return the ApplicationGatewayListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayListenerPropertiesFormat withSslProfile(SubResource sslProfile) {
        this.sslProfile = sslProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the listener resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hostNames property: List of Server Name Indications(SNI) for TLS Multi-site Listener that allows special
     * wildcard characters as well.
     * 
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames property: List of Server Name Indications(SNI) for TLS Multi-site Listener that allows special
     * wildcard characters as well.
     * 
     * @param hostNames the hostNames value to set.
     * @return the ApplicationGatewayListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayListenerPropertiesFormat withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
