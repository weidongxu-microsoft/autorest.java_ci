// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of StorageTaskAssignments.
 */
public interface StorageTaskAssignments {
    /**
     * Get the storage task assignment properties.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param storageTaskAssignmentName The name of the storage task assignment within the specified resource group.
     * Storage task assignment names must be between 3 and 24 characters in length and use numbers and lower-case
     * letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage task assignment properties along with {@link Response}.
     */
    Response<StorageTaskAssignment> getWithResponse(String resourceGroupName, String accountName,
        String storageTaskAssignmentName, Context context);

    /**
     * Get the storage task assignment properties.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param storageTaskAssignmentName The name of the storage task assignment within the specified resource group.
     * Storage task assignment names must be between 3 and 24 characters in length and use numbers and lower-case
     * letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage task assignment properties.
     */
    StorageTaskAssignment get(String resourceGroupName, String accountName, String storageTaskAssignmentName);

    /**
     * Delete the storage task assignment sub-resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param storageTaskAssignmentName The name of the storage task assignment within the specified resource group.
     * Storage task assignment names must be between 3 and 24 characters in length and use numbers and lower-case
     * letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String storageTaskAssignmentName);

    /**
     * Delete the storage task assignment sub-resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param storageTaskAssignmentName The name of the storage task assignment within the specified resource group.
     * Storage task assignment names must be between 3 and 24 characters in length and use numbers and lower-case
     * letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String storageTaskAssignmentName, Context context);

    /**
     * List all the storage task assignments in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of storage task assignments for the storage account as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StorageTaskAssignment> list(String resourceGroupName, String accountName);

    /**
     * List all the storage task assignments in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment Ids to be included in the
     * list response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of storage task assignments for the storage account as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StorageTaskAssignment> list(String resourceGroupName, String accountName, String maxpagesize,
        Context context);

    /**
     * Get the storage task assignment properties.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage task assignment properties along with {@link Response}.
     */
    StorageTaskAssignment getById(String id);

    /**
     * Get the storage task assignment properties.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage task assignment properties along with {@link Response}.
     */
    Response<StorageTaskAssignment> getByIdWithResponse(String id, Context context);

    /**
     * Delete the storage task assignment sub-resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the storage task assignment sub-resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new StorageTaskAssignment resource.
     * 
     * @param name resource name.
     * @return the first stage of the new StorageTaskAssignment definition.
     */
    StorageTaskAssignment.DefinitionStages.Blank define(String name);
}
