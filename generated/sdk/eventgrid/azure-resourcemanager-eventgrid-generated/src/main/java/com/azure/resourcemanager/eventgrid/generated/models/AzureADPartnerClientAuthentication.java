// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.AzureADPartnerClientAuthenticationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure Active Directory Partner Client Authentication.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "clientAuthenticationType",
    defaultImpl = AzureADPartnerClientAuthentication.class,
    visible = true)
@JsonTypeName("AzureAD")
@Fluent
public final class AzureADPartnerClientAuthentication extends PartnerClientAuthentication {
    /*
     * Type of client authentication
     */
    @JsonTypeId
    @JsonProperty(value = "clientAuthenticationType", required = true)
    private PartnerClientAuthenticationType clientAuthenticationType = PartnerClientAuthenticationType.AZURE_AD;

    /*
     * AzureAD ClientAuthentication Properties
     */
    @JsonProperty(value = "properties")
    private AzureADPartnerClientAuthenticationProperties innerProperties;

    /**
     * Creates an instance of AzureADPartnerClientAuthentication class.
     */
    public AzureADPartnerClientAuthentication() {
    }

    /**
     * Get the clientAuthenticationType property: Type of client authentication.
     * 
     * @return the clientAuthenticationType value.
     */
    @Override
    public PartnerClientAuthenticationType clientAuthenticationType() {
        return this.clientAuthenticationType;
    }

    /**
     * Get the innerProperties property: AzureAD ClientAuthentication Properties.
     * 
     * @return the innerProperties value.
     */
    private AzureADPartnerClientAuthenticationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     * 
     * @return the azureActiveDirectoryTenantId value.
     */
    public String azureActiveDirectoryTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().azureActiveDirectoryTenantId();
    }

    /**
     * Set the azureActiveDirectoryTenantId property: The Azure Active Directory Tenant ID to get the access token that
     * will be included as the bearer token in delivery requests.
     * 
     * @param azureActiveDirectoryTenantId the azureActiveDirectoryTenantId value to set.
     * @return the AzureADPartnerClientAuthentication object itself.
     */
    public AzureADPartnerClientAuthentication withAzureActiveDirectoryTenantId(String azureActiveDirectoryTenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureADPartnerClientAuthenticationProperties();
        }
        this.innerProperties().withAzureActiveDirectoryTenantId(azureActiveDirectoryTenantId);
        return this;
    }

    /**
     * Get the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     * 
     * @return the azureActiveDirectoryApplicationIdOrUri value.
     */
    public String azureActiveDirectoryApplicationIdOrUri() {
        return this.innerProperties() == null ? null : this.innerProperties().azureActiveDirectoryApplicationIdOrUri();
    }

    /**
     * Set the azureActiveDirectoryApplicationIdOrUri property: The Azure Active Directory Application ID or URI to get
     * the access token that will be included as the bearer token in delivery requests.
     * 
     * @param azureActiveDirectoryApplicationIdOrUri the azureActiveDirectoryApplicationIdOrUri value to set.
     * @return the AzureADPartnerClientAuthentication object itself.
     */
    public AzureADPartnerClientAuthentication
        withAzureActiveDirectoryApplicationIdOrUri(String azureActiveDirectoryApplicationIdOrUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureADPartnerClientAuthenticationProperties();
        }
        this.innerProperties().withAzureActiveDirectoryApplicationIdOrUri(azureActiveDirectoryApplicationIdOrUri);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
