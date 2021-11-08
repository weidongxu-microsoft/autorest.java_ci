// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ContainerInner;

/** An instance of this class provides access to all the operations defined in ContainersClient. */
public interface ContainersClient {
    /**
     * Lists all the containers of a storage Account in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The storage Account name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the containers on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerInner> listByStorageAccount(
        String deviceName, String storageAccountName, String resourceGroupName);

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
     * @return collection of all the containers on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerInner> listByStorageAccount(
        String deviceName, String storageAccountName, String resourceGroupName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerInner get(String deviceName, String storageAccountName, String containerName, String resourceGroupName);

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
     * @return a container by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerInner> getWithResponse(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context);

    /**
     * Creates a new container or updates an existing container on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @param container The container properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a container on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ContainerInner>, ContainerInner> beginCreateOrUpdate(
        String deviceName,
        String storageAccountName,
        String containerName,
        String resourceGroupName,
        ContainerInner container);

    /**
     * Creates a new container or updates an existing container on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @param container The container properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a container on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ContainerInner>, ContainerInner> beginCreateOrUpdate(
        String deviceName,
        String storageAccountName,
        String containerName,
        String resourceGroupName,
        ContainerInner container,
        Context context);

    /**
     * Creates a new container or updates an existing container on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @param container The container properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a container on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerInner createOrUpdate(
        String deviceName,
        String storageAccountName,
        String containerName,
        String resourceGroupName,
        ContainerInner container);

    /**
     * Creates a new container or updates an existing container on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name.
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @param container The container properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a container on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerInner createOrUpdate(
        String deviceName,
        String storageAccountName,
        String containerName,
        String resourceGroupName,
        ContainerInner container,
        Context context);

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
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName);

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
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context);

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
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRefresh(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName);

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
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRefresh(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    void refresh(
        String deviceName, String storageAccountName, String containerName, String resourceGroupName, Context context);
}
