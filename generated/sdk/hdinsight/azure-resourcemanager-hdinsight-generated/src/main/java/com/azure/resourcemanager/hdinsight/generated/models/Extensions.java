// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Extensions. */
public interface Extensions {
    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableMonitoring(String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters);

    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableMonitoring(
        String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters, Context context);

    /**
     * Gets the status of Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Operations Management Suite (OMS) on the HDInsight cluster.
     */
    ClusterMonitoringResponse getMonitoringStatus(String resourceGroupName, String clusterName);

    /**
     * Gets the status of Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Operations Management Suite (OMS) on the HDInsight cluster along with {@link Response}.
     */
    Response<ClusterMonitoringResponse> getMonitoringStatusWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableMonitoring(String resourceGroupName, String clusterName);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableMonitoring(String resourceGroupName, String clusterName, Context context);

    /**
     * Enables the Azure Monitor on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableAzureMonitor(String resourceGroupName, String clusterName, AzureMonitorRequest parameters);

    /**
     * Enables the Azure Monitor on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Log Analytics workspace parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableAzureMonitor(
        String resourceGroupName, String clusterName, AzureMonitorRequest parameters, Context context);

    /**
     * Gets the status of Azure Monitor on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Azure Monitor on the HDInsight cluster.
     */
    AzureMonitorResponse getAzureMonitorStatus(String resourceGroupName, String clusterName);

    /**
     * Gets the status of Azure Monitor on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Azure Monitor on the HDInsight cluster along with {@link Response}.
     */
    Response<AzureMonitorResponse> getAzureMonitorStatusWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Disables the Azure Monitor on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableAzureMonitor(String resourceGroupName, String clusterName);

    /**
     * Disables the Azure Monitor on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableAzureMonitor(String resourceGroupName, String clusterName, Context context);

    /**
     * Creates an HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters The cluster extensions create request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(String resourceGroupName, String clusterName, String extensionName, Extension parameters);

    /**
     * Creates an HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters The cluster extensions create request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(
        String resourceGroupName, String clusterName, String extensionName, Extension parameters, Context context);

    /**
     * Gets the extension properties for the specified HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the extension properties for the specified HDInsight cluster extension.
     */
    ClusterMonitoringResponse get(String resourceGroupName, String clusterName, String extensionName);

    /**
     * Gets the extension properties for the specified HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the extension properties for the specified HDInsight cluster extension along with {@link Response}.
     */
    Response<ClusterMonitoringResponse> getWithResponse(
        String resourceGroupName, String clusterName, String extensionName, Context context);

    /**
     * Deletes the specified extension for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String extensionName);

    /**
     * Deletes the specified extension for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String extensionName, Context context);

    /**
     * Gets the async operation status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param operationId The long running operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status.
     */
    AsyncOperationResult getAzureAsyncOperationStatus(
        String resourceGroupName, String clusterName, String extensionName, String operationId);

    /**
     * Gets the async operation status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param operationId The long running operation id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status along with {@link Response}.
     */
    Response<AsyncOperationResult> getAzureAsyncOperationStatusWithResponse(
        String resourceGroupName, String clusterName, String extensionName, String operationId, Context context);
}
