// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Containers.
 */
public interface Containers {
    /**
     * Lists all the containers of a storage Account in a Data Box Edge/Data Box Gateway device.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The storage Account name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the containers on the Data Box Edge/Gateway device as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Container> listByStorageAccount(String deviceName, String storageAccountName,
        String resourceGroupName);

    /**
     * Lists all the containers of a storage Account in a Data Box Edge/Data Box Gateway device.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The storage Account name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the containers on the Data Box Edge/Gateway device as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Container> listByStorageAccount(String deviceName, String storageAccountName,
        String resourceGroupName, Context context);

    /**
     * Gets a container by name.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container Name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container by name along with {@link Response}.
     */
    Response<Container> getWithResponse(String deviceName, String storageAccountName, String containerName,
        String resourceGroupName, Context context);

    /**
     * Gets a container by name.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container Name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container by name.
     */
    Container get(String deviceName, String storageAccountName, String containerName, String resourceGroupName);

    /**
     * Deletes the container on the Data Box Edge/Data Box Gateway device.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String storageAccountName, String containerName, String resourceGroupName);

    /**
     * Deletes the container on the Data Box Edge/Data Box Gateway device.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String storageAccountName, String containerName, String resourceGroupName,
        Context context);

    /**
     * Refreshes the container metadata with the data from the cloud.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void refresh(String deviceName, String storageAccountName, String containerName, String resourceGroupName);

    /**
     * Refreshes the container metadata with the data from the cloud.
     * 
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void refresh(String deviceName, String storageAccountName, String containerName, String resourceGroupName,
        Context context);

    /**
     * Gets a container by name.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container by name along with {@link Response}.
     */
    Container getById(String id);

    /**
     * Gets a container by name.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container by name along with {@link Response}.
     */
    Response<Container> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the container on the Data Box Edge/Data Box Gateway device.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the container on the Data Box Edge/Data Box Gateway device.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Container resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Container definition.
     */
    Container.DefinitionStages.Blank define(String name);
}
