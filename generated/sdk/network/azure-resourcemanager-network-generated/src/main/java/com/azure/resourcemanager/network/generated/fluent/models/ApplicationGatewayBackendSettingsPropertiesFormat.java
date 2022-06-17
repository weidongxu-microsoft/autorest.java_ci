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

/** Properties of Backend address pool settings of an application gateway. */
@Fluent
public final class ApplicationGatewayBackendSettingsPropertiesFormat {
    /*
     * The destination port on the backend.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The protocol used to communicate with the backend.
     */
    @JsonProperty(value = "protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Connection timeout in seconds. Application Gateway will fail the request
     * if response is not received within ConnectionTimeout. Acceptable values
     * are from 1 second to 86400 seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /*
     * Probe resource of an application gateway.
     */
    @JsonProperty(value = "probe")
    private SubResource probe;

    /*
     * Array of references to application gateway trusted root certificates.
     */
    @JsonProperty(value = "trustedRootCertificates")
    private List<SubResource> trustedRootCertificates;

    /*
     * Server name indication to be sent to the backend servers for Tls
     * protocol.
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * Whether to pick server name indication from the host name of the backend
     * server for Tls protocol. Default value is false.
     */
    @JsonProperty(value = "pickHostNameFromBackendAddress")
    private Boolean pickHostnameFromBackendAddress;

    /*
     * The provisioning state of the backend HTTP settings resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the port property: The destination port on the backend.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The destination port on the backend.
     *
     * @param port the port value to set.
     * @return the ApplicationGatewayBackendSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendSettingsPropertiesFormat withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the protocol property: The protocol used to communicate with the backend.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol used to communicate with the backend.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayBackendSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendSettingsPropertiesFormat withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the timeout property: Connection timeout in seconds. Application Gateway will fail the request if response is
     * not received within ConnectionTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Connection timeout in seconds. Application Gateway will fail the request if response is
     * not received within ConnectionTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param timeout the timeout value to set.
     * @return the ApplicationGatewayBackendSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendSettingsPropertiesFormat withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the probe property: Probe resource of an application gateway.
     *
     * @return the probe value.
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the probe property: Probe resource of an application gateway.
     *
     * @param probe the probe value to set.
     * @return the ApplicationGatewayBackendSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendSettingsPropertiesFormat withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @return the trustedRootCertificates value.
     */
    public List<SubResource> trustedRootCertificates() {
        return this.trustedRootCertificates;
    }

    /**
     * Set the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @param trustedRootCertificates the trustedRootCertificates value to set.
     * @return the ApplicationGatewayBackendSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendSettingsPropertiesFormat withTrustedRootCertificates(
        List<SubResource> trustedRootCertificates) {
        this.trustedRootCertificates = trustedRootCertificates;
        return this;
    }

    /**
     * Get the hostname property: Server name indication to be sent to the backend servers for Tls protocol.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Server name indication to be sent to the backend servers for Tls protocol.
     *
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayBackendSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendSettingsPropertiesFormat withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the pickHostnameFromBackendAddress property: Whether to pick server name indication from the host name of the
     * backend server for Tls protocol. Default value is false.
     *
     * @return the pickHostnameFromBackendAddress value.
     */
    public Boolean pickHostnameFromBackendAddress() {
        return this.pickHostnameFromBackendAddress;
    }

    /**
     * Set the pickHostnameFromBackendAddress property: Whether to pick server name indication from the host name of the
     * backend server for Tls protocol. Default value is false.
     *
     * @param pickHostnameFromBackendAddress the pickHostnameFromBackendAddress value to set.
     * @return the ApplicationGatewayBackendSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendSettingsPropertiesFormat withPickHostnameFromBackendAddress(
        Boolean pickHostnameFromBackendAddress) {
        this.pickHostnameFromBackendAddress = pickHostnameFromBackendAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the backend HTTP settings resource.
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
}