// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BandwidthSchedules. */
public interface BandwidthSchedules {
    /**
     * Gets all the bandwidth schedules for a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the bandwidth schedules for a Data Box Edge/Data Box Gateway device as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BandwidthSchedule> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Gets all the bandwidth schedules for a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the bandwidth schedules for a Data Box Edge/Data Box Gateway device as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BandwidthSchedule> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified bandwidth schedule along with {@link Response}.
     */
    Response<BandwidthSchedule> getWithResponse(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified bandwidth schedule.
     */
    BandwidthSchedule get(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified bandwidth schedule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified bandwidth schedule along with {@link Response}.
     */
    BandwidthSchedule getById(String id);

    /**
     * Gets the properties of the specified bandwidth schedule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified bandwidth schedule along with {@link Response}.
     */
    Response<BandwidthSchedule> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new BandwidthSchedule resource.
     *
     * @param name resource name.
     * @return the first stage of the new BandwidthSchedule definition.
     */
    BandwidthSchedule.DefinitionStages.Blank define(String name);
}
