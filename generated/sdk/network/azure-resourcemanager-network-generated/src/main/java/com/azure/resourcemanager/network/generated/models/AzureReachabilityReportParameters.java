// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Geographic and time constraints for Azure reachability report.
 */
@Fluent
public final class AzureReachabilityReportParameters {
    /*
     * Parameters that define a geographic location.
     */
    @JsonProperty(value = "providerLocation", required = true)
    private AzureReachabilityReportLocation providerLocation;

    /*
     * List of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /*
     * Optional Azure regions to scope the query to.
     */
    @JsonProperty(value = "azureLocations")
    private List<String> azureLocations;

    /*
     * The start time for the Azure reachability report.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * The end time for the Azure reachability report.
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /**
     * Creates an instance of AzureReachabilityReportParameters class.
     */
    public AzureReachabilityReportParameters() {
    }

    /**
     * Get the providerLocation property: Parameters that define a geographic location.
     * 
     * @return the providerLocation value.
     */
    public AzureReachabilityReportLocation providerLocation() {
        return this.providerLocation;
    }

    /**
     * Set the providerLocation property: Parameters that define a geographic location.
     * 
     * @param providerLocation the providerLocation value to set.
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withProviderLocation(AzureReachabilityReportLocation providerLocation) {
        this.providerLocation = providerLocation;
        return this;
    }

    /**
     * Get the providers property: List of Internet service providers.
     * 
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers property: List of Internet service providers.
     * 
     * @param providers the providers value to set.
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get the azureLocations property: Optional Azure regions to scope the query to.
     * 
     * @return the azureLocations value.
     */
    public List<String> azureLocations() {
        return this.azureLocations;
    }

    /**
     * Set the azureLocations property: Optional Azure regions to scope the query to.
     * 
     * @param azureLocations the azureLocations value to set.
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withAzureLocations(List<String> azureLocations) {
        this.azureLocations = azureLocations;
        return this;
    }

    /**
     * Get the startTime property: The start time for the Azure reachability report.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time for the Azure reachability report.
     * 
     * @param startTime the startTime value to set.
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time for the Azure reachability report.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time for the Azure reachability report.
     * 
     * @param endTime the endTime value to set.
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerLocation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property providerLocation in model AzureReachabilityReportParameters"));
        } else {
            providerLocation().validate();
        }
        if (startTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property startTime in model AzureReachabilityReportParameters"));
        }
        if (endTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endTime in model AzureReachabilityReportParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureReachabilityReportParameters.class);
}
