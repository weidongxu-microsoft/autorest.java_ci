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
import com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in StorageAccountsClient. */
public interface StorageAccountsClient {
    /**
     * Lists all the StorageAccounts in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the Storage Accounts on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageAccountInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Lists all the StorageAccounts in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the Storage Accounts on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageAccountInner> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets a StorageAccount by name.
     *
     * @param deviceName The device name.
     * @param storageAccountName The storage account name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StorageAccount by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageAccountInner get(String deviceName, String storageAccountName, String resourceGroupName);

    /**
     * Gets a StorageAccount by name.
     *
     * @param deviceName The device name.
     * @param storageAccountName The storage account name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StorageAccount by name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StorageAccountInner> getWithResponse(
        String deviceName, String storageAccountName, String resourceGroupName, Context context);

    /**
     * Creates a new StorageAccount or updates an existing StorageAccount on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @param storageAccount The StorageAccount properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Storage Account on the Data Box Edge/Gateway device along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageAccountInner>, StorageAccountInner> beginCreateOrUpdate(
        String deviceName, String storageAccountName, String resourceGroupName, StorageAccountInner storageAccount);

    /**
     * Creates a new StorageAccount or updates an existing StorageAccount on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @param storageAccount The StorageAccount properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Storage Account on the Data Box Edge/Gateway device along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageAccountInner>, StorageAccountInner> beginCreateOrUpdate(
        String deviceName,
        String storageAccountName,
        String resourceGroupName,
        StorageAccountInner storageAccount,
        Context context);

    /**
     * Creates a new StorageAccount or updates an existing StorageAccount on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @param storageAccount The StorageAccount properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Storage Account on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageAccountInner createOrUpdate(
        String deviceName, String storageAccountName, String resourceGroupName, StorageAccountInner storageAccount);

    /**
     * Creates a new StorageAccount or updates an existing StorageAccount on the device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @param storageAccount The StorageAccount properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Storage Account on the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageAccountInner createOrUpdate(
        String deviceName,
        String storageAccountName,
        String resourceGroupName,
        StorageAccountInner storageAccount,
        Context context);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String storageAccountName, String resourceGroupName);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String storageAccountName, String resourceGroupName, Context context);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String storageAccountName, String resourceGroupName);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String storageAccountName, String resourceGroupName, Context context);
}
