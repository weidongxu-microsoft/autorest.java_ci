// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class Representing Detector Evidence used for analysis. */
@Fluent
public final class AnalysisData {
    /*
     * Name of the Detector
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Detector Definition
     */
    @JsonProperty(value = "detectorDefinition")
    private DetectorDefinition detectorDefinition;

    /*
     * Source Metrics
     */
    @JsonProperty(value = "metrics")
    private List<DiagnosticMetricSet> metrics;

    /*
     * Additional Source Data
     */
    @JsonProperty(value = "data")
    private List<List<NameValuePair>> data;

    /*
     * Detector Meta Data
     */
    @JsonProperty(value = "detectorMetaData")
    private ResponseMetadata detectorMetadata;

    /** Creates an instance of AnalysisData class. */
    public AnalysisData() {
    }

    /**
     * Get the source property: Name of the Detector.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Name of the Detector.
     *
     * @param source the source value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the detectorDefinition property: Detector Definition.
     *
     * @return the detectorDefinition value.
     */
    public DetectorDefinition detectorDefinition() {
        return this.detectorDefinition;
    }

    /**
     * Set the detectorDefinition property: Detector Definition.
     *
     * @param detectorDefinition the detectorDefinition value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withDetectorDefinition(DetectorDefinition detectorDefinition) {
        this.detectorDefinition = detectorDefinition;
        return this;
    }

    /**
     * Get the metrics property: Source Metrics.
     *
     * @return the metrics value.
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Source Metrics.
     *
     * @param metrics the metrics value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withMetrics(List<DiagnosticMetricSet> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the data property: Additional Source Data.
     *
     * @return the data value.
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set the data property: Additional Source Data.
     *
     * @param data the data value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the detectorMetadata property: Detector Meta Data.
     *
     * @return the detectorMetadata value.
     */
    public ResponseMetadata detectorMetadata() {
        return this.detectorMetadata;
    }

    /**
     * Set the detectorMetadata property: Detector Meta Data.
     *
     * @param detectorMetadata the detectorMetadata value to set.
     * @return the AnalysisData object itself.
     */
    public AnalysisData withDetectorMetadata(ResponseMetadata detectorMetadata) {
        this.detectorMetadata = detectorMetadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (detectorDefinition() != null) {
            detectorDefinition().validate();
        }
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
        if (data() != null) {
            data().forEach(e -> e.forEach(e1 -> e1.validate()));
        }
        if (detectorMetadata() != null) {
            detectorMetadata().validate();
        }
    }
}
