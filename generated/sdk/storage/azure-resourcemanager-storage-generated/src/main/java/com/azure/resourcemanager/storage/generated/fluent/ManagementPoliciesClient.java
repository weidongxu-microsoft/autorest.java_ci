// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.ManagementPolicyInner;
import com.azure.resourcemanager.storage.generated.models.ManagementPolicyName;

/**
 * An instance of this class provides access to all the operations defined in ManagementPoliciesClient.
 */
public interface ManagementPoliciesClient {
    /**
     * Gets the managementpolicy associated with the specified storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagementPolicyInner> getWithResponse(String resourceGroupName, String accountName,
        ManagementPolicyName managementPolicyName, Context context);

    /**
     * Gets the managementpolicy associated with the specified storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagementPolicyInner get(String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName);

    /**
     * Sets the managementpolicy to the specified storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param properties The ManagementPolicy set to a storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagementPolicyInner> createOrUpdateWithResponse(String resourceGroupName, String accountName,
        ManagementPolicyName managementPolicyName, ManagementPolicyInner properties, Context context);

    /**
     * Sets the managementpolicy to the specified storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param properties The ManagementPolicy set to a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagementPolicyInner createOrUpdate(String resourceGroupName, String accountName,
        ManagementPolicyName managementPolicyName, ManagementPolicyInner properties);

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName,
        ManagementPolicyName managementPolicyName, Context context);

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName);
}
