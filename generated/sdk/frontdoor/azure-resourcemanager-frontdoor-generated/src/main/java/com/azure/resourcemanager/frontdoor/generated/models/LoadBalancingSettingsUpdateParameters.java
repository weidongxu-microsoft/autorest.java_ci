// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Round-Robin load balancing settings for a backend pool.
 */
@Fluent
public class LoadBalancingSettingsUpdateParameters {
    /*
     * The number of samples to consider for load balancing decisions
     */
    @JsonProperty(value = "sampleSize")
    private Integer sampleSize;

    /*
     * The number of samples within the sample period that must succeed
     */
    @JsonProperty(value = "successfulSamplesRequired")
    private Integer successfulSamplesRequired;

    /*
     * The additional latency in milliseconds for probes to fall into the lowest latency bucket
     */
    @JsonProperty(value = "additionalLatencyMilliseconds")
    private Integer additionalLatencyMilliseconds;

    /**
     * Creates an instance of LoadBalancingSettingsUpdateParameters class.
     */
    public LoadBalancingSettingsUpdateParameters() {
    }

    /**
     * Get the sampleSize property: The number of samples to consider for load balancing decisions.
     * 
     * @return the sampleSize value.
     */
    public Integer sampleSize() {
        return this.sampleSize;
    }

    /**
     * Set the sampleSize property: The number of samples to consider for load balancing decisions.
     * 
     * @param sampleSize the sampleSize value to set.
     * @return the LoadBalancingSettingsUpdateParameters object itself.
     */
    public LoadBalancingSettingsUpdateParameters withSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
        return this;
    }

    /**
     * Get the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     * 
     * @return the successfulSamplesRequired value.
     */
    public Integer successfulSamplesRequired() {
        return this.successfulSamplesRequired;
    }

    /**
     * Set the successfulSamplesRequired property: The number of samples within the sample period that must succeed.
     * 
     * @param successfulSamplesRequired the successfulSamplesRequired value to set.
     * @return the LoadBalancingSettingsUpdateParameters object itself.
     */
    public LoadBalancingSettingsUpdateParameters withSuccessfulSamplesRequired(Integer successfulSamplesRequired) {
        this.successfulSamplesRequired = successfulSamplesRequired;
        return this;
    }

    /**
     * Get the additionalLatencyMilliseconds property: The additional latency in milliseconds for probes to fall into the lowest latency bucket.
     * 
     * @return the additionalLatencyMilliseconds value.
     */
    public Integer additionalLatencyMilliseconds() {
        return this.additionalLatencyMilliseconds;
    }

    /**
     * Set the additionalLatencyMilliseconds property: The additional latency in milliseconds for probes to fall into the lowest latency bucket.
     * 
     * @param additionalLatencyMilliseconds the additionalLatencyMilliseconds value to set.
     * @return the LoadBalancingSettingsUpdateParameters object itself.
     */
    public LoadBalancingSettingsUpdateParameters
        withAdditionalLatencyMilliseconds(Integer additionalLatencyMilliseconds) {
        this.additionalLatencyMilliseconds = additionalLatencyMilliseconds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
