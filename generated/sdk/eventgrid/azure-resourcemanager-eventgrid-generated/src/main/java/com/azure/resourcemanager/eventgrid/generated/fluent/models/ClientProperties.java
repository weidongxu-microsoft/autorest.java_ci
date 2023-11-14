// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.ClientCertificateAuthentication;
import com.azure.resourcemanager.eventgrid.generated.models.ClientProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.ClientState;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The properties of client.
 */
@Fluent
public final class ClientProperties {
    /*
     * Description for the Client resource.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The name presented by the client for authentication. The default value is the name of the resource.
     */
    @JsonProperty(value = "authenticationName")
    private String authenticationName;

    /*
     * The client certificate authentication information.
     */
    @JsonProperty(value = "clientCertificateAuthentication")
    private ClientCertificateAuthentication clientCertificateAuthentication;

    /*
     * Indicates if the client is enabled or not. Default value is Enabled.
     */
    @JsonProperty(value = "state")
    private ClientState state;

    /*
     * Attributes for the client. Supported values are int, bool, string, string[].
     * Example:
     * "attributes": { "room": "345", "floor": 12, "deviceTypes": ["Fan", "Light"] }
     */
    @JsonProperty(value = "attributes")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> attributes;

    /*
     * Provisioning state of the Client resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ClientProvisioningState provisioningState;

    /**
     * Creates an instance of ClientProperties class.
     */
    public ClientProperties() {
    }

    /**
     * Get the description property: Description for the Client resource.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the Client resource.
     * 
     * @param description the description value to set.
     * @return the ClientProperties object itself.
     */
    public ClientProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the authenticationName property: The name presented by the client for authentication. The default value is
     * the name of the resource.
     * 
     * @return the authenticationName value.
     */
    public String authenticationName() {
        return this.authenticationName;
    }

    /**
     * Set the authenticationName property: The name presented by the client for authentication. The default value is
     * the name of the resource.
     * 
     * @param authenticationName the authenticationName value to set.
     * @return the ClientProperties object itself.
     */
    public ClientProperties withAuthenticationName(String authenticationName) {
        this.authenticationName = authenticationName;
        return this;
    }

    /**
     * Get the clientCertificateAuthentication property: The client certificate authentication information.
     * 
     * @return the clientCertificateAuthentication value.
     */
    public ClientCertificateAuthentication clientCertificateAuthentication() {
        return this.clientCertificateAuthentication;
    }

    /**
     * Set the clientCertificateAuthentication property: The client certificate authentication information.
     * 
     * @param clientCertificateAuthentication the clientCertificateAuthentication value to set.
     * @return the ClientProperties object itself.
     */
    public ClientProperties
        withClientCertificateAuthentication(ClientCertificateAuthentication clientCertificateAuthentication) {
        this.clientCertificateAuthentication = clientCertificateAuthentication;
        return this;
    }

    /**
     * Get the state property: Indicates if the client is enabled or not. Default value is Enabled.
     * 
     * @return the state value.
     */
    public ClientState state() {
        return this.state;
    }

    /**
     * Set the state property: Indicates if the client is enabled or not. Default value is Enabled.
     * 
     * @param state the state value to set.
     * @return the ClientProperties object itself.
     */
    public ClientProperties withState(ClientState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the attributes property: Attributes for the client. Supported values are int, bool, string, string[].
     * Example:
     * "attributes": { "room": "345", "floor": 12, "deviceTypes": ["Fan", "Light"] }.
     * 
     * @return the attributes value.
     */
    public Map<String, Object> attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: Attributes for the client. Supported values are int, bool, string, string[].
     * Example:
     * "attributes": { "room": "345", "floor": 12, "deviceTypes": ["Fan", "Light"] }.
     * 
     * @param attributes the attributes value to set.
     * @return the ClientProperties object itself.
     */
    public ClientProperties withAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Client resource.
     * 
     * @return the provisioningState value.
     */
    public ClientProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientCertificateAuthentication() != null) {
            clientCertificateAuthentication().validate();
        }
    }
}
