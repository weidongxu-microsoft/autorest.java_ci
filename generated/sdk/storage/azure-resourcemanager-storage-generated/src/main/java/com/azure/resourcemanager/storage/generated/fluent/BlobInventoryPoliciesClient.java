// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobInventoryPolicyInner;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicyName;

/** An instance of this class provides access to all the operations defined in BlobInventoryPoliciesClient. */
public interface BlobInventoryPoliciesClient {
    /**
     * Gets the blob inventory policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be
     *     'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the blob inventory policy associated with the specified storage account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BlobInventoryPolicyInner> getWithResponse(
        String resourceGroupName, String accountName, BlobInventoryPolicyName blobInventoryPolicyName, Context context);

    /**
     * Gets the blob inventory policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be
     *     'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the blob inventory policy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlobInventoryPolicyInner get(
        String resourceGroupName, String accountName, BlobInventoryPolicyName blobInventoryPolicyName);

    /**
     * Sets the blob inventory policy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be
     *     'default'.
     * @param properties The blob inventory policy set to a storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account blob inventory policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BlobInventoryPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        BlobInventoryPolicyName blobInventoryPolicyName,
        BlobInventoryPolicyInner properties,
        Context context);

    /**
     * Sets the blob inventory policy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be
     *     'default'.
     * @param properties The blob inventory policy set to a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account blob inventory policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlobInventoryPolicyInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        BlobInventoryPolicyName blobInventoryPolicyName,
        BlobInventoryPolicyInner properties);

    /**
     * Deletes the blob inventory policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be
     *     'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, BlobInventoryPolicyName blobInventoryPolicyName, Context context);

    /**
     * Deletes the blob inventory policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be
     *     'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, BlobInventoryPolicyName blobInventoryPolicyName);

    /**
     * Gets the blob inventory policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the blob inventory policy associated with the specified storage account as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlobInventoryPolicyInner> list(String resourceGroupName, String accountName);

    /**
     * Gets the blob inventory policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the blob inventory policy associated with the specified storage account as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlobInventoryPolicyInner> list(String resourceGroupName, String accountName, Context context);
}
