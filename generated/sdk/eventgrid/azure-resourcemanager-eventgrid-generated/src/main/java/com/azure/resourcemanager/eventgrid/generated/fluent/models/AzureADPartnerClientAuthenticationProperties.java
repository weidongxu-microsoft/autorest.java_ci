// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an Azure Active Directory Partner Client Authentication.
 */
@Fluent
public final class AzureADPartnerClientAuthenticationProperties {
    /*
     * The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in
     * delivery requests.
     */
    @JsonProperty(value = "azureActiveDirectoryTenantId")
    private String azureActiveDirectoryTenantId;

    /*
     * The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer
     * token in delivery requests.
     */
    @JsonProperty(value = "azureActiveDirectoryApplicationIdOrUri")
    private String azureActiveDirectoryApplicationIdOrUri;

    /**
     * Creates an instance of AzureADPartnerClientAuthenticationProperties class.
     */
    public AzureADPartnerClientAuthenticationProperties() {
    }

    /**
     * Get the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     * 
     * @return the azureActiveDirectoryTenantId value.
     */
    public String azureActiveDirectoryTenantId() {
        return this.azureActiveDirectoryTenantId;
    }

    /**
     * Set the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     * 
     * @param azureActiveDirectoryTenantId the azureActiveDirectoryTenantId value to set.
     * @return the AzureADPartnerClientAuthenticationProperties object itself.
     */
    public AzureADPartnerClientAuthenticationProperties
        withAzureActiveDirectoryTenantId(String azureActiveDirectoryTenantId) {
        this.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
        return this;
    }

    /**
     * Get the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     * 
     * @return the azureActiveDirectoryApplicationIdOrUri value.
     */
    public String azureActiveDirectoryApplicationIdOrUri() {
        return this.azureActiveDirectoryApplicationIdOrUri;
    }

    /**
     * Set the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     * 
     * @param azureActiveDirectoryApplicationIdOrUri the azureActiveDirectoryApplicationIdOrUri value to set.
     * @return the AzureADPartnerClientAuthenticationProperties object itself.
     */
    public AzureADPartnerClientAuthenticationProperties
        withAzureActiveDirectoryApplicationIdOrUri(String azureActiveDirectoryApplicationIdOrUri) {
        this.azureActiveDirectoryApplicationIdOrUri = azureActiveDirectoryApplicationIdOrUri;
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
