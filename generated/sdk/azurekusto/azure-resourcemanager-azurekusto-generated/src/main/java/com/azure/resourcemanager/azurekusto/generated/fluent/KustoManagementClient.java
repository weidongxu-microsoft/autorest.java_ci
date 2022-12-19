// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for KustoManagementClient class. */
public interface KustoManagementClient {
    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID
     * forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    ClustersClient getClusters();

    /**
     * Gets the ClusterPrincipalAssignmentsClient object to access its operations.
     *
     * @return the ClusterPrincipalAssignmentsClient object.
     */
    ClusterPrincipalAssignmentsClient getClusterPrincipalAssignments();

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    SkusClient getSkus();

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    DatabasesClient getDatabases();

    /**
     * Gets the AttachedDatabaseConfigurationsClient object to access its operations.
     *
     * @return the AttachedDatabaseConfigurationsClient object.
     */
    AttachedDatabaseConfigurationsClient getAttachedDatabaseConfigurations();

    /**
     * Gets the ManagedPrivateEndpointsClient object to access its operations.
     *
     * @return the ManagedPrivateEndpointsClient object.
     */
    ManagedPrivateEndpointsClient getManagedPrivateEndpoints();

    /**
     * Gets the DatabasePrincipalAssignmentsClient object to access its operations.
     *
     * @return the DatabasePrincipalAssignmentsClient object.
     */
    DatabasePrincipalAssignmentsClient getDatabasePrincipalAssignments();

    /**
     * Gets the ScriptsClient object to access its operations.
     *
     * @return the ScriptsClient object.
     */
    ScriptsClient getScripts();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the DataConnectionsClient object to access its operations.
     *
     * @return the DataConnectionsClient object.
     */
    DataConnectionsClient getDataConnections();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the OperationsResultsClient object to access its operations.
     *
     * @return the OperationsResultsClient object.
     */
    OperationsResultsClient getOperationsResults();

    /**
     * Gets the OperationsResultsLocationsClient object to access its operations.
     *
     * @return the OperationsResultsLocationsClient object.
     */
    OperationsResultsLocationsClient getOperationsResultsLocations();
}
