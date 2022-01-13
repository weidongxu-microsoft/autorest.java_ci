// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ObjectReplicationPoliciesOperations. */
public interface ObjectReplicationPoliciesOperations {
    /**
     * List the object replication policies associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account object replication policies.
     */
    PagedIterable<ObjectReplicationPolicy> list(String resourceGroupName, String accountName);

    /**
     * List the object replication policies associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account object replication policies.
     */
    PagedIterable<ObjectReplicationPolicy> list(String resourceGroupName, String accountName, Context context);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId For the destination account, provide the value 'default'. Configure the policy
     *     on the destination account first. For the source account, provide the value of the policy ID that is returned
     *     when you download the policy that was defined on the destination account. The policy is downloaded as a JSON
     *     file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID.
     */
    ObjectReplicationPolicy get(String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId For the destination account, provide the value 'default'. Configure the policy
     *     on the destination account first. For the source account, provide the value of the policy ID that is returned
     *     when you download the policy that was defined on the destination account. The policy is downloaded as a JSON
     *     file.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID along with {@link Response}.
     */
    Response<ObjectReplicationPolicy> getWithResponse(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId For the destination account, provide the value 'default'. Configure the policy
     *     on the destination account first. For the source account, provide the value of the policy ID that is returned
     *     when you download the policy that was defined on the destination account. The policy is downloaded as a JSON
     *     file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId For the destination account, provide the value 'default'. Configure the policy
     *     on the destination account first. For the source account, provide the value of the policy ID that is returned
     *     when you download the policy that was defined on the destination account. The policy is downloaded as a JSON
     *     file.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID along with {@link Response}.
     */
    ObjectReplicationPolicy getById(String id);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID along with {@link Response}.
     */
    Response<ObjectReplicationPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ObjectReplicationPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ObjectReplicationPolicy definition.
     */
    ObjectReplicationPolicy.DefinitionStages.Blank define(String name);
}
