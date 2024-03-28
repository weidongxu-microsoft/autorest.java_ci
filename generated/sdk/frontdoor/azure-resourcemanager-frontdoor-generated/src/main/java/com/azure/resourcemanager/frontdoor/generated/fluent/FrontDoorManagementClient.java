// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for FrontDoorManagementClient class.
 */
public interface FrontDoorManagementClient {
    /**
     * Gets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID
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
     * Gets the PoliciesClient object to access its operations.
     * 
     * @return the PoliciesClient object.
     */
    PoliciesClient getPolicies();

    /**
     * Gets the ManagedRuleSetsClient object to access its operations.
     * 
     * @return the ManagedRuleSetsClient object.
     */
    ManagedRuleSetsClient getManagedRuleSets();

    /**
     * Gets the FrontDoorNameAvailabilitiesClient object to access its operations.
     * 
     * @return the FrontDoorNameAvailabilitiesClient object.
     */
    FrontDoorNameAvailabilitiesClient getFrontDoorNameAvailabilities();

    /**
     * Gets the FrontDoorNameAvailabilityWithSubscriptionsClient object to access its operations.
     * 
     * @return the FrontDoorNameAvailabilityWithSubscriptionsClient object.
     */
    FrontDoorNameAvailabilityWithSubscriptionsClient getFrontDoorNameAvailabilityWithSubscriptions();

    /**
     * Gets the FrontDoorsClient object to access its operations.
     * 
     * @return the FrontDoorsClient object.
     */
    FrontDoorsClient getFrontDoors();

    /**
     * Gets the FrontendEndpointsClient object to access its operations.
     * 
     * @return the FrontendEndpointsClient object.
     */
    FrontendEndpointsClient getFrontendEndpoints();

    /**
     * Gets the EndpointsClient object to access its operations.
     * 
     * @return the EndpointsClient object.
     */
    EndpointsClient getEndpoints();

    /**
     * Gets the RulesEnginesClient object to access its operations.
     * 
     * @return the RulesEnginesClient object.
     */
    RulesEnginesClient getRulesEngines();

    /**
     * Gets the NetworkExperimentProfilesClient object to access its operations.
     * 
     * @return the NetworkExperimentProfilesClient object.
     */
    NetworkExperimentProfilesClient getNetworkExperimentProfiles();

    /**
     * Gets the PreconfiguredEndpointsClient object to access its operations.
     * 
     * @return the PreconfiguredEndpointsClient object.
     */
    PreconfiguredEndpointsClient getPreconfiguredEndpoints();

    /**
     * Gets the ExperimentsClient object to access its operations.
     * 
     * @return the ExperimentsClient object.
     */
    ExperimentsClient getExperiments();

    /**
     * Gets the ReportsClient object to access its operations.
     * 
     * @return the ReportsClient object.
     */
    ReportsClient getReports();
}
