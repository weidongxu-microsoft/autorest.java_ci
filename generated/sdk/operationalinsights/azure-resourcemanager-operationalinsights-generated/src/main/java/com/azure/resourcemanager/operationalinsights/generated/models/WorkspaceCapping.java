// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The daily volume cap for ingestion. */
@Fluent
public final class WorkspaceCapping {
    /*
     * The workspace daily quota for ingestion.
     */
    @JsonProperty(value = "dailyQuotaGb")
    private Double dailyQuotaGb;

    /*
     * The time when the quota will be rest.
     */
    @JsonProperty(value = "quotaNextResetTime", access = JsonProperty.Access.WRITE_ONLY)
    private String quotaNextResetTime;

    /*
     * The status of data ingestion for this workspace.
     */
    @JsonProperty(value = "dataIngestionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DataIngestionStatus dataIngestionStatus;

    /**
     * Get the dailyQuotaGb property: The workspace daily quota for ingestion.
     *
     * @return the dailyQuotaGb value.
     */
    public Double dailyQuotaGb() {
        return this.dailyQuotaGb;
    }

    /**
     * Set the dailyQuotaGb property: The workspace daily quota for ingestion.
     *
     * @param dailyQuotaGb the dailyQuotaGb value to set.
     * @return the WorkspaceCapping object itself.
     */
    public WorkspaceCapping withDailyQuotaGb(Double dailyQuotaGb) {
        this.dailyQuotaGb = dailyQuotaGb;
        return this;
    }

    /**
     * Get the quotaNextResetTime property: The time when the quota will be rest.
     *
     * @return the quotaNextResetTime value.
     */
    public String quotaNextResetTime() {
        return this.quotaNextResetTime;
    }

    /**
     * Get the dataIngestionStatus property: The status of data ingestion for this workspace.
     *
     * @return the dataIngestionStatus value.
     */
    public DataIngestionStatus dataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
