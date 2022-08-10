// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureMediaServices class. */
public interface AzureMediaServices {
    /**
     * Gets The unique identifier for a Microsoft Azure subscription.
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
     * Gets the AccountFiltersClient object to access its operations.
     *
     * @return the AccountFiltersClient object.
     */
    AccountFiltersClient getAccountFilters();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the MediaservicesClient object to access its operations.
     *
     * @return the MediaservicesClient object.
     */
    MediaservicesClient getMediaservices();

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
     * Gets the LocationsClient object to access its operations.
     *
     * @return the LocationsClient object.
     */
    LocationsClient getLocations();

    /**
     * Gets the MediaServicesOperationStatusesClient object to access its operations.
     *
     * @return the MediaServicesOperationStatusesClient object.
     */
    MediaServicesOperationStatusesClient getMediaServicesOperationStatuses();

    /**
     * Gets the MediaServicesOperationResultsClient object to access its operations.
     *
     * @return the MediaServicesOperationResultsClient object.
     */
    MediaServicesOperationResultsClient getMediaServicesOperationResults();

    /**
     * Gets the AssetsClient object to access its operations.
     *
     * @return the AssetsClient object.
     */
    AssetsClient getAssets();

    /**
     * Gets the AssetFiltersClient object to access its operations.
     *
     * @return the AssetFiltersClient object.
     */
    AssetFiltersClient getAssetFilters();

    /**
     * Gets the TracksClient object to access its operations.
     *
     * @return the TracksClient object.
     */
    TracksClient getTracks();

    /**
     * Gets the OperationStatusesClient object to access its operations.
     *
     * @return the OperationStatusesClient object.
     */
    OperationStatusesClient getOperationStatuses();

    /**
     * Gets the OperationResultsClient object to access its operations.
     *
     * @return the OperationResultsClient object.
     */
    OperationResultsClient getOperationResults();

    /**
     * Gets the ContentKeyPoliciesClient object to access its operations.
     *
     * @return the ContentKeyPoliciesClient object.
     */
    ContentKeyPoliciesClient getContentKeyPolicies();

    /**
     * Gets the TransformsClient object to access its operations.
     *
     * @return the TransformsClient object.
     */
    TransformsClient getTransforms();

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    JobsClient getJobs();

    /**
     * Gets the StreamingPoliciesClient object to access its operations.
     *
     * @return the StreamingPoliciesClient object.
     */
    StreamingPoliciesClient getStreamingPolicies();

    /**
     * Gets the StreamingLocatorsClient object to access its operations.
     *
     * @return the StreamingLocatorsClient object.
     */
    StreamingLocatorsClient getStreamingLocators();

    /**
     * Gets the LiveEventsClient object to access its operations.
     *
     * @return the LiveEventsClient object.
     */
    LiveEventsClient getLiveEvents();

    /**
     * Gets the LiveOutputsClient object to access its operations.
     *
     * @return the LiveOutputsClient object.
     */
    LiveOutputsClient getLiveOutputs();

    /**
     * Gets the StreamingEndpointsClient object to access its operations.
     *
     * @return the StreamingEndpointsClient object.
     */
    StreamingEndpointsClient getStreamingEndpoints();
}
