// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for SearchManagementClient class.
 */
public interface SearchManagementClient {
    /**
     * Gets The unique identifier for a Microsoft Azure subscription. You can obtain this value from the Azure Resource
     * Manager API or the portal.
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
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the AdminKeysClient object to access its operations.
     * 
     * @return the AdminKeysClient object.
     */
    AdminKeysClient getAdminKeys();

    /**
     * Gets the QueryKeysClient object to access its operations.
     * 
     * @return the QueryKeysClient object.
     */
    QueryKeysClient getQueryKeys();

    /**
     * Gets the ServicesClient object to access its operations.
     * 
     * @return the ServicesClient object.
     */
    ServicesClient getServices();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the SharedPrivateLinkResourcesClient object to access its operations.
     * 
     * @return the SharedPrivateLinkResourcesClient object.
     */
    SharedPrivateLinkResourcesClient getSharedPrivateLinkResources();

    /**
     * Gets the UsagesClient object to access its operations.
     * 
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     * 
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the NetworkSecurityPerimeterConfigurationsClient object to access its operations.
     * 
     * @return the NetworkSecurityPerimeterConfigurationsClient object.
     */
    NetworkSecurityPerimeterConfigurationsClient getNetworkSecurityPerimeterConfigurations();
}
