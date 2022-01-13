// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.AddonInner;

/** Resource collection API of Addons. */
public interface Addons {
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
    PagedIterable<Addon> listByRole(String deviceName, String roleName, String resourceGroupName);

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
    PagedIterable<Addon> listByRole(String deviceName, String roleName, String resourceGroupName, Context context);

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
    Addon get(String deviceName, String roleName, String addonName, String resourceGroupName);

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
     * @return a specific addon by name along with {@link Response}.
     */
    Response<Addon> getWithResponse(
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
    Addon createOrUpdate(
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
    Addon createOrUpdate(
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
     */
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
    void delete(String deviceName, String roleName, String addonName, String resourceGroupName, Context context);
}
