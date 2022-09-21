// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DiskEncryptionSets. */
public interface DiskEncryptionSets {
    /**
     * Gets information about a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The
     *     maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set along with {@link Response}.
     */
    Response<DiskEncryptionSet> getByResourceGroupWithResponse(
        String resourceGroupName, String diskEncryptionSetName, Context context);

    /**
     * Gets information about a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set.
     */
    DiskEncryptionSet getByResourceGroup(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The
     *     maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String diskEncryptionSetName, Context context);

    /**
     * Lists all the disk encryption sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskEncryptionSet> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the disk encryption sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskEncryptionSet> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the disk encryption sets under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskEncryptionSet> list();

    /**
     * Lists all the disk encryption sets under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskEncryptionSet> list(Context context);

    /**
     * Lists all resources that are encrypted with this disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List resources which are encrypted with the disk encryption set as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<String> listAssociatedResources(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Lists all resources that are encrypted with this disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, _ and -. The
     *     maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List resources which are encrypted with the disk encryption set as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<String> listAssociatedResources(
        String resourceGroupName, String diskEncryptionSetName, Context context);

    /**
     * Gets information about a disk encryption set.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set along with {@link Response}.
     */
    DiskEncryptionSet getById(String id);

    /**
     * Gets information about a disk encryption set.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set along with {@link Response}.
     */
    Response<DiskEncryptionSet> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a disk encryption set.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a disk encryption set.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DiskEncryptionSet resource.
     *
     * @param name resource name.
     * @return the first stage of the new DiskEncryptionSet definition.
     */
    DiskEncryptionSet.DefinitionStages.Blank define(String name);
}
