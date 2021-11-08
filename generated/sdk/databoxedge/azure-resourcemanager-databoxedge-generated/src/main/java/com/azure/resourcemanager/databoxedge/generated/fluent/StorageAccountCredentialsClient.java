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
import com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountCredentialInner;

/** An instance of this class provides access to all the operations defined in StorageAccountCredentialsClient. */
public interface StorageAccountCredentialsClient {
    /**
     * Gets all the storage account credentials in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the storage account credentials in a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageAccountCredentialInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Gets all the storage account credentials in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the storage account credentials in a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageAccountCredentialInner> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified storage account credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageAccountCredentialInner get(String deviceName, String name, String resourceGroupName);

    /**
     * Gets the properties of the specified storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified storage account credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StorageAccountCredentialInner> getWithResponse(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Creates or updates the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @param storageAccountCredential The storage account credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account credential.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageAccountCredentialInner>, StorageAccountCredentialInner> beginCreateOrUpdate(
        String deviceName,
        String name,
        String resourceGroupName,
        StorageAccountCredentialInner storageAccountCredential);

    /**
     * Creates or updates the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @param storageAccountCredential The storage account credential.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account credential.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StorageAccountCredentialInner>, StorageAccountCredentialInner> beginCreateOrUpdate(
        String deviceName,
        String name,
        String resourceGroupName,
        StorageAccountCredentialInner storageAccountCredential,
        Context context);

    /**
     * Creates or updates the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @param storageAccountCredential The storage account credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageAccountCredentialInner createOrUpdate(
        String deviceName,
        String name,
        String resourceGroupName,
        StorageAccountCredentialInner storageAccountCredential);

    /**
     * Creates or updates the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @param storageAccountCredential The storage account credential.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageAccountCredentialInner createOrUpdate(
        String deviceName,
        String name,
        String resourceGroupName,
        StorageAccountCredentialInner storageAccountCredential,
        Context context);

    /**
     * Deletes the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Deletes the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName, Context context);
}
