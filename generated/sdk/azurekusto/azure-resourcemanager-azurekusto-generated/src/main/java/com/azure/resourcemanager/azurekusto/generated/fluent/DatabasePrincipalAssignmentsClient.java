// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DatabasePrincipalAssignmentInner;
import com.azure.resourcemanager.azurekusto.generated.models.DatabasePrincipalAssignmentCheckNameRequest;

/**
 * An instance of this class provides access to all the operations defined in DatabasePrincipalAssignmentsClient.
 */
public interface DatabasePrincipalAssignmentsClient {
    /**
     * Checks that the database principal assignment is valid and is not already in use.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameResultInner> checkNameAvailabilityWithResponse(String resourceGroupName, String clusterName,
        String databaseName, DatabasePrincipalAssignmentCheckNameRequest principalAssignmentName, Context context);

    /**
     * Checks that the database principal assignment is valid and is not already in use.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameResultInner checkNameAvailability(String resourceGroupName, String clusterName, String databaseName,
        DatabasePrincipalAssignmentCheckNameRequest principalAssignmentName);

    /**
     * Gets a Kusto cluster database principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto cluster database principalAssignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabasePrincipalAssignmentInner> getWithResponse(String resourceGroupName, String clusterName,
        String databaseName, String principalAssignmentName, Context context);

    /**
     * Gets a Kusto cluster database principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto cluster database principalAssignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabasePrincipalAssignmentInner get(String resourceGroupName, String clusterName, String databaseName,
        String principalAssignmentName);

    /**
     * Creates a Kusto cluster database principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabasePrincipalAssignmentInner>, DatabasePrincipalAssignmentInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, String databaseName, String principalAssignmentName,
        DatabasePrincipalAssignmentInner parameters);

    /**
     * Creates a Kusto cluster database principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabasePrincipalAssignmentInner>, DatabasePrincipalAssignmentInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, String databaseName, String principalAssignmentName,
        DatabasePrincipalAssignmentInner parameters, Context context);

    /**
     * Creates a Kusto cluster database principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabasePrincipalAssignmentInner createOrUpdate(String resourceGroupName, String clusterName, String databaseName,
        String principalAssignmentName, DatabasePrincipalAssignmentInner parameters);

    /**
     * Creates a Kusto cluster database principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param parameters The Kusto principalAssignments parameters supplied for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database principal assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabasePrincipalAssignmentInner createOrUpdate(String resourceGroupName, String clusterName, String databaseName,
        String principalAssignmentName, DatabasePrincipalAssignmentInner parameters, Context context);

    /**
     * Deletes a Kusto principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, String databaseName,
        String principalAssignmentName);

    /**
     * Deletes a Kusto principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, String databaseName,
        String principalAssignmentName, Context context);

    /**
     * Deletes a Kusto principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String databaseName, String principalAssignmentName);

    /**
     * Deletes a Kusto principalAssignment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param principalAssignmentName The name of the Kusto principalAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String databaseName, String principalAssignmentName,
        Context context);

    /**
     * Lists all Kusto cluster database principalAssignments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principal assignments operation response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabasePrincipalAssignmentInner> list(String resourceGroupName, String clusterName,
        String databaseName);

    /**
     * Lists all Kusto cluster database principalAssignments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database principal assignments operation response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabasePrincipalAssignmentInner> list(String resourceGroupName, String clusterName,
        String databaseName, Context context);
}
