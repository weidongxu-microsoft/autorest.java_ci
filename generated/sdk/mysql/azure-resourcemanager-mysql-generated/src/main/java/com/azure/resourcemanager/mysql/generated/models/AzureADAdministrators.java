// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AzureADAdministrators.
 */
public interface AzureADAdministrators {
    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serverName, AdministratorName administratorName);

    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serverName, AdministratorName administratorName, Context context);

    /**
     * Gets information about an azure ad administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an azure ad administrator along with {@link Response}.
     */
    Response<AzureADAdministrator> getWithResponse(String resourceGroupName, String serverName,
        AdministratorName administratorName, Context context);

    /**
     * Gets information about an azure ad administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an azure ad administrator.
     */
    AzureADAdministrator get(String resourceGroupName, String serverName, AdministratorName administratorName);

    /**
     * List all the AAD administrators in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of azure ad administrators as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureADAdministrator> listByServer(String resourceGroupName, String serverName);

    /**
     * List all the AAD administrators in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of azure ad administrators as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureADAdministrator> listByServer(String resourceGroupName, String serverName, Context context);

    /**
     * Gets information about an azure ad administrator.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an azure ad administrator along with {@link Response}.
     */
    AzureADAdministrator getById(String id);

    /**
     * Gets information about an azure ad administrator.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an azure ad administrator along with {@link Response}.
     */
    Response<AzureADAdministrator> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AzureADAdministrator resource.
     * 
     * @param name resource name.
     * @return the first stage of the new AzureADAdministrator definition.
     */
    AzureADAdministrator.DefinitionStages.Blank define(AdministratorName name);
}
