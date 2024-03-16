// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enable AAD authentication for SQL VM.
 */
@Fluent
public final class AadAuthenticationSettings {
    /*
     * The client Id of the Managed Identity to query Microsoft Graph API. An empty string must be used for the system assigned Managed Identity
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /**
     * Creates an instance of AadAuthenticationSettings class.
     */
    public AadAuthenticationSettings() {
    }

    /**
     * Get the clientId property: The client Id of the Managed Identity to query Microsoft Graph API. An empty string must be used for the system assigned Managed Identity.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client Id of the Managed Identity to query Microsoft Graph API. An empty string must be used for the system assigned Managed Identity.
     * 
     * @param clientId the clientId value to set.
     * @return the AadAuthenticationSettings object itself.
     */
    public AadAuthenticationSettings withClientId(String clientId) {
        this.clientId = clientId;
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
