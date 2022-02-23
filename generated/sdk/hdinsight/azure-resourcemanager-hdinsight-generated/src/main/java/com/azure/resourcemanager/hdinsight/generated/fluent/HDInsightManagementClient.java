// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for HDInsightManagementClient class. */
public interface HDInsightManagementClient {
    /**
     * Gets The subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
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
     * Gets the ApplicationsClient object to access its operations.
     *
     * @return the ApplicationsClient object.
     */
    ApplicationsClient getApplications();

    /**
     * Gets the LocationsClient object to access its operations.
     *
     * @return the LocationsClient object.
     */
    LocationsClient getLocations();

    /**
     * Gets the ConfigurationsClient object to access its operations.
     *
     * @return the ConfigurationsClient object.
     */
    ConfigurationsClient getConfigurations();

    /**
     * Gets the ExtensionsClient object to access its operations.
     *
     * @return the ExtensionsClient object.
     */
    ExtensionsClient getExtensions();

    /**
     * Gets the ScriptActionsClient object to access its operations.
     *
     * @return the ScriptActionsClient object.
     */
    ScriptActionsClient getScriptActions();

    /**
     * Gets the ScriptExecutionHistoriesClient object to access its operations.
     *
     * @return the ScriptExecutionHistoriesClient object.
     */
    ScriptExecutionHistoriesClient getScriptExecutionHistories();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the VirtualMachinesClient object to access its operations.
     *
     * @return the VirtualMachinesClient object.
     */
    VirtualMachinesClient getVirtualMachines();

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
}
