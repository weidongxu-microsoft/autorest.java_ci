// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DataConnectionValidationInner;

/** Resource collection API of DataConnections. */
public interface DataConnections {
    /**
     * Returns the list of data connections of the given Kusto database.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connections operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataConnection> listByDatabase(String resourceGroupName, String clusterName, String databaseName);

    /**
     * Returns the list of data connections of the given Kusto database.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connections operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataConnection> listByDatabase(
        String resourceGroupName, String clusterName, String databaseName, Context context);

    /**
     * Checks that the data connection parameters are valid.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The data connection parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connection validation result.
     */
    DataConnectionValidationListResult dataConnectionValidation(
        String resourceGroupName, String clusterName, String databaseName, DataConnectionValidationInner parameters);

    /**
     * Checks that the data connection parameters are valid.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The data connection parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connection validation result.
     */
    DataConnectionValidationListResult dataConnectionValidation(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionValidationInner parameters,
        Context context);

    /**
     * Checks that the data connection name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    CheckNameResult checkNameAvailability(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionCheckNameRequest dataConnectionName);

    /**
     * Checks that the data connection name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionCheckNameRequest dataConnectionName,
        Context context);

    /**
     * Returns a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    DataConnection get(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName);

    /**
     * Returns a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection along with {@link Response}.
     */
    Response<DataConnection> getWithResponse(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName, Context context);

    /**
     * Creates or updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters The data connection parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    DataConnection createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters);

    /**
     * Creates or updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters The data connection parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    DataConnection createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context);

    /**
     * Updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters The data connection parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    DataConnection update(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters);

    /**
     * Updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters The data connection parameters supplied to the Update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    DataConnection update(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context);

    /**
     * Deletes the data connection with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName);

    /**
     * Deletes the data connection with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName, Context context);
}
