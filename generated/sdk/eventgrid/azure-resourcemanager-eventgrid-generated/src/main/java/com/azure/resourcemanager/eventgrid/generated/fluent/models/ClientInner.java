// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.ClientAuthentication;
import com.azure.resourcemanager.eventgrid.generated.models.ClientCertificateAuthentication;
import com.azure.resourcemanager.eventgrid.generated.models.ClientProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.ClientState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Client resource. */
@Fluent
public final class ClientInner extends ProxyResource {
    /*
     * The properties of client.
     */
    @JsonProperty(value = "properties")
    private ClientProperties innerProperties;

    /*
     * The system metadata relating to the Client resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ClientInner class. */
    public ClientInner() {
    }

    /**
     * Get the innerProperties property: The properties of client.
     *
     * @return the innerProperties value.
     */
    private ClientProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to the Client resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: Description for the Client resource.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description for the Client resource.
     *
     * @param description the description value to set.
     * @return the ClientInner object itself.
     */
    public ClientInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the authenticationName property: The name presented by the client for authentication. The default value is
     * the name of the resource.
     *
     * @return the authenticationName value.
     */
    public String authenticationName() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationName();
    }

    /**
     * Set the authenticationName property: The name presented by the client for authentication. The default value is
     * the name of the resource.
     *
     * @param authenticationName the authenticationName value to set.
     * @return the ClientInner object itself.
     */
    public ClientInner withAuthenticationName(String authenticationName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientProperties();
        }
        this.innerProperties().withAuthenticationName(authenticationName);
        return this;
    }

    /**
     * Get the authentication property: Authentication information for the client.
     *
     * @return the authentication value.
     */
    public ClientAuthentication authentication() {
        return this.innerProperties() == null ? null : this.innerProperties().authentication();
    }

    /**
     * Set the authentication property: Authentication information for the client.
     *
     * @param authentication the authentication value to set.
     * @return the ClientInner object itself.
     */
    public ClientInner withAuthentication(ClientAuthentication authentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientProperties();
        }
        this.innerProperties().withAuthentication(authentication);
        return this;
    }

    /**
     * Get the clientCertificateAuthentication property: The client certificate authentication information.
     *
     * @return the clientCertificateAuthentication value.
     */
    public ClientCertificateAuthentication clientCertificateAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().clientCertificateAuthentication();
    }

    /**
     * Set the clientCertificateAuthentication property: The client certificate authentication information.
     *
     * @param clientCertificateAuthentication the clientCertificateAuthentication value to set.
     * @return the ClientInner object itself.
     */
    public ClientInner withClientCertificateAuthentication(
        ClientCertificateAuthentication clientCertificateAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientProperties();
        }
        this.innerProperties().withClientCertificateAuthentication(clientCertificateAuthentication);
        return this;
    }

    /**
     * Get the state property: Indicates if the client is enabled or not. Default value is Enabled.
     *
     * @return the state value.
     */
    public ClientState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Indicates if the client is enabled or not. Default value is Enabled.
     *
     * @param state the state value to set.
     * @return the ClientInner object itself.
     */
    public ClientInner withState(ClientState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the attributes property: Attributes for the client. Supported values are int, bool, string, string[].
     * Example: "attributes": { "room": "345", "floor": 12, "deviceTypes": ["Fan", "Light"] }.
     *
     * @return the attributes value.
     */
    public Map<String, Object> attributes() {
        return this.innerProperties() == null ? null : this.innerProperties().attributes();
    }

    /**
     * Set the attributes property: Attributes for the client. Supported values are int, bool, string, string[].
     * Example: "attributes": { "room": "345", "floor": 12, "deviceTypes": ["Fan", "Light"] }.
     *
     * @param attributes the attributes value to set.
     * @return the ClientInner object itself.
     */
    public ClientInner withAttributes(Map<String, Object> attributes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientProperties();
        }
        this.innerProperties().withAttributes(attributes);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Client resource.
     *
     * @return the provisioningState value.
     */
    public ClientProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
}
