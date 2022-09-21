// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.costmanagement.generated.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The status of the long running operation. */
@Fluent
public final class OperationStatusInner {
    /*
     * The status of the long running operation.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * The properties of the resource generated.
     */
    @JsonProperty(value = "properties")
    private ReportUrl innerProperties;

    /** Creates an instance of OperationStatusInner class. */
    public OperationStatusInner() {
    }

    /**
     * Get the status property: The status of the long running operation.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the long running operation.
     *
     * @param status the status value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the resource generated.
     *
     * @return the innerProperties value.
     */
    private ReportUrl innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the reportUrl property: The URL to download the generated report.
     *
     * @return the reportUrl value.
     */
    public String reportUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().reportUrl();
    }

    /**
     * Set the reportUrl property: The URL to download the generated report.
     *
     * @param reportUrl the reportUrl value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withReportUrl(String reportUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReportUrl();
        }
        this.innerProperties().withReportUrl(reportUrl);
        return this;
    }

    /**
     * Get the validUntil property: The time at which report URL becomes invalid.
     *
     * @return the validUntil value.
     */
    public OffsetDateTime validUntil() {
        return this.innerProperties() == null ? null : this.innerProperties().validUntil();
    }

    /**
     * Set the validUntil property: The time at which report URL becomes invalid.
     *
     * @param validUntil the validUntil value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withValidUntil(OffsetDateTime validUntil) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReportUrl();
        }
        this.innerProperties().withValidUntil(validUntil);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
