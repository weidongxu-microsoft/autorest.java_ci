// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.MonitoringMetricConfigurationInner;

/** Resource collection API of MonitoringConfigs. */
public interface MonitoringConfigs {
    /**
     * Lists metric configurations in a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of metric configurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitoringMetricConfiguration> list(String deviceName, String roleName, String resourceGroupName);

    /**
     * Lists metric configurations in a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of metric configurations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitoringMetricConfiguration> list(
        String deviceName, String roleName, String resourceGroupName, Context context);

    /**
     * Gets a metric configuration of a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a metric configuration of a role.
     */
    MonitoringMetricConfiguration get(String deviceName, String roleName, String resourceGroupName);

    /**
     * Gets a metric configuration of a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a metric configuration of a role along with {@link Response}.
     */
    Response<MonitoringMetricConfiguration> getWithResponse(
        String deviceName, String roleName, String resourceGroupName, Context context);

    /**
     * Creates a new metric configuration or updates an existing one for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param monitoringMetricConfiguration The metric configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric setting details for the role.
     */
    MonitoringMetricConfiguration createOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration);

    /**
     * Creates a new metric configuration or updates an existing one for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param monitoringMetricConfiguration The metric configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metric setting details for the role.
     */
    MonitoringMetricConfiguration createOrUpdate(
        String deviceName,
        String roleName,
        String resourceGroupName,
        MonitoringMetricConfigurationInner monitoringMetricConfiguration,
        Context context);

    /**
     * deletes a new metric configuration for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String roleName, String resourceGroupName);

    /**
     * deletes a new metric configuration for a role.
     *
     * @param deviceName The device name.
     * @param roleName The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String roleName, String resourceGroupName, Context context);
}
