// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The baseline values for a single sensitivity value.
 */
@Fluent
public final class SingleBaseline {
    /*
     * the sensitivity of the baseline.
     */
    @JsonProperty(value = "sensitivity", required = true)
    private BaselineSensitivity sensitivity;

    /*
     * The low thresholds of the baseline.
     */
    @JsonProperty(value = "lowThresholds", required = true)
    private List<Double> lowThresholds;

    /*
     * The high thresholds of the baseline.
     */
    @JsonProperty(value = "highThresholds", required = true)
    private List<Double> highThresholds;

    /**
     * Creates an instance of SingleBaseline class.
     */
    public SingleBaseline() {
    }

    /**
     * Get the sensitivity property: the sensitivity of the baseline.
     * 
     * @return the sensitivity value.
     */
    public BaselineSensitivity sensitivity() {
        return this.sensitivity;
    }

    /**
     * Set the sensitivity property: the sensitivity of the baseline.
     * 
     * @param sensitivity the sensitivity value to set.
     * @return the SingleBaseline object itself.
     */
    public SingleBaseline withSensitivity(BaselineSensitivity sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    /**
     * Get the lowThresholds property: The low thresholds of the baseline.
     * 
     * @return the lowThresholds value.
     */
    public List<Double> lowThresholds() {
        return this.lowThresholds;
    }

    /**
     * Set the lowThresholds property: The low thresholds of the baseline.
     * 
     * @param lowThresholds the lowThresholds value to set.
     * @return the SingleBaseline object itself.
     */
    public SingleBaseline withLowThresholds(List<Double> lowThresholds) {
        this.lowThresholds = lowThresholds;
        return this;
    }

    /**
     * Get the highThresholds property: The high thresholds of the baseline.
     * 
     * @return the highThresholds value.
     */
    public List<Double> highThresholds() {
        return this.highThresholds;
    }

    /**
     * Set the highThresholds property: The high thresholds of the baseline.
     * 
     * @param highThresholds the highThresholds value to set.
     * @return the SingleBaseline object itself.
     */
    public SingleBaseline withHighThresholds(List<Double> highThresholds) {
        this.highThresholds = highThresholds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sensitivity() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sensitivity in model SingleBaseline"));
        }
        if (lowThresholds() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property lowThresholds in model SingleBaseline"));
        }
        if (highThresholds() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property highThresholds in model SingleBaseline"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SingleBaseline.class);
}
