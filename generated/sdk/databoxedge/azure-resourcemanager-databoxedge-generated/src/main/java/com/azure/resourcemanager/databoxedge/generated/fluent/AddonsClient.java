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
import com.azure.resourcemanager.databoxedge.generated.fluent.models.AddonInner;

/** An instance of this class provides access to all the operations defined in AddonsClient. */
public interface AddonsClient {
    /**
     * Lists all the addons configured in the role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the Role addon on the Azure Stack Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AddonInner> listByRole(String deviceName, String roleName, String resourceGroupName);

    /**
     * Lists all the addons configured in the role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the Role addon on the Azure Stack Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AddonInner> listByRole(String deviceName, String roleName, String resourceGroupName, Context context);

    /**
     * Gets a specific addon by name.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific addon by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AddonInner get(String deviceName, String roleName, String addonName, String resourceGroupName);

    /**
     * Gets a specific addon by name.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific addon by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AddonInner> getWithResponse(
        String deviceName, String roleName, String addonName, String resourceGroupName, Context context);

    /**
     * Create or update a addon.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @param addon The addon properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Addon.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AddonInner>, AddonInner> beginCreateOrUpdate(
        String deviceName, String roleName, String addonName, String resourceGroupName, AddonInner addon);

    /**
     * Create or update a addon.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @param addon The addon properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Addon.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AddonInner>, AddonInner> beginCreateOrUpdate(
        String deviceName,
        String roleName,
        String addonName,
        String resourceGroupName,
        AddonInner addon,
        Context context);

    /**
     * Create or update a addon.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @param addon The addon properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Addon.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AddonInner createOrUpdate(
        String deviceName, String roleName, String addonName, String resourceGroupName, AddonInner addon);

    /**
     * Create or update a addon.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @param addon The addon properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Addon.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AddonInner createOrUpdate(
        String deviceName,
        String roleName,
        String addonName,
        String resourceGroupName,
        AddonInner addon,
        Context context);

    /**
     * Deletes the addon on the device.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String roleName, String addonName, String resourceGroupName);

    /**
     * Deletes the addon on the device.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String roleName, String addonName, String resourceGroupName, Context context);

    /**
     * Deletes the addon on the device.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String roleName, String addonName, String resourceGroupName);

    /**
     * Deletes the addon on the device.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param addonName The addon name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String roleName, String addonName, String resourceGroupName, Context context);
}
