// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of NetworkSecurityPerimeterConfigurations.
 */
public interface NetworkSecurityPerimeterConfigurations {
    /**
     * Gets list of effective NetworkSecurityPerimeterConfiguration for storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of effective NetworkSecurityPerimeterConfiguration for storage account as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<NetworkSecurityPerimeterConfiguration> list(String resourceGroupName, String accountName);

    /**
     * Gets list of effective NetworkSecurityPerimeterConfiguration for storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of effective NetworkSecurityPerimeterConfiguration for storage account as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<NetworkSecurityPerimeterConfiguration> list(String resourceGroupName, String accountName,
        Context context);

    /**
     * Gets effective NetworkSecurityPerimeterConfiguration for association.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return effective NetworkSecurityPerimeterConfiguration for association along with {@link Response}.
     */
    Response<NetworkSecurityPerimeterConfiguration> getWithResponse(String resourceGroupName, String accountName,
        String networkSecurityPerimeterConfigurationName, Context context);

    /**
     * Gets effective NetworkSecurityPerimeterConfiguration for association.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return effective NetworkSecurityPerimeterConfiguration for association.
     */
    NetworkSecurityPerimeterConfiguration get(String resourceGroupName, String accountName,
        String networkSecurityPerimeterConfigurationName);

    /**
     * Refreshes any information about the association.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reconcile(String resourceGroupName, String accountName, String networkSecurityPerimeterConfigurationName);

    /**
     * Refreshes any information about the association.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param networkSecurityPerimeterConfigurationName The name for Network Security Perimeter configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reconcile(String resourceGroupName, String accountName, String networkSecurityPerimeterConfigurationName,
        Context context);
}