// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.RuntimeScriptActionDetailInner;

/**
 * An instance of this class provides access to all the operations defined in ScriptActionsClient.
 */
public interface ScriptActionsClient {
    /**
     * Deletes a specified persisted script action of the cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptName The name of the script.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String clusterName, String scriptName, Context context);

    /**
     * Deletes a specified persisted script action of the cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptName The name of the script.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String scriptName);

    /**
     * Lists all the persisted script actions for the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the persisted script action for the cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RuntimeScriptActionDetailInner> listByCluster(String resourceGroupName, String clusterName);

    /**
     * Lists all the persisted script actions for the specified cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the persisted script action for the cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RuntimeScriptActionDetailInner> listByCluster(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Gets the script execution detail for the given script execution ID.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the script execution detail for the given script execution ID along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RuntimeScriptActionDetailInner> getExecutionDetailWithResponse(String resourceGroupName,
        String clusterName, String scriptExecutionId, Context context);

    /**
     * Gets the script execution detail for the given script execution ID.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the script execution detail for the given script execution ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RuntimeScriptActionDetailInner getExecutionDetail(String resourceGroupName, String clusterName,
        String scriptExecutionId);

    /**
     * Gets the async operation status of execution operation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param operationId The long running operation id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status of execution operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AsyncOperationResultInner> getExecutionAsyncOperationStatusWithResponse(String resourceGroupName,
        String clusterName, String operationId, Context context);

    /**
     * Gets the async operation status of execution operation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param operationId The long running operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status of execution operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationResultInner getExecutionAsyncOperationStatus(String resourceGroupName, String clusterName,
        String operationId);
}
