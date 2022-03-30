// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The share properties. */
@Fluent
public final class SupportPackageRequestProperties {
    /*
     * MinimumTimeStamp from where logs need to be collected
     */
    @JsonProperty(value = "minimumTimeStamp")
    private OffsetDateTime minimumTimestamp;

    /*
     * Start of the timespan of the log collection
     */
    @JsonProperty(value = "maximumTimeStamp")
    private OffsetDateTime maximumTimestamp;

    /*
     * Type of files, which need to be included in the logs
     * This will contain the type of logs
     * (Default/DefaultWithDumps/None/All/DefaultWithArchived)
     * or a comma separated list of log types that are required
     */
    @JsonProperty(value = "include")
    private String include;

    /**
     * Get the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     *
     * @return the minimumTimestamp value.
     */
    public OffsetDateTime minimumTimestamp() {
        return this.minimumTimestamp;
    }

    /**
     * Set the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     *
     * @param minimumTimestamp the minimumTimestamp value to set.
     * @return the SupportPackageRequestProperties object itself.
     */
    public SupportPackageRequestProperties withMinimumTimestamp(OffsetDateTime minimumTimestamp) {
        this.minimumTimestamp = minimumTimestamp;
        return this;
    }

    /**
     * Get the maximumTimestamp property: Start of the timespan of the log collection.
     *
     * @return the maximumTimestamp value.
     */
    public OffsetDateTime maximumTimestamp() {
        return this.maximumTimestamp;
    }

    /**
     * Set the maximumTimestamp property: Start of the timespan of the log collection.
     *
     * @param maximumTimestamp the maximumTimestamp value to set.
     * @return the SupportPackageRequestProperties object itself.
     */
    public SupportPackageRequestProperties withMaximumTimestamp(OffsetDateTime maximumTimestamp) {
        this.maximumTimestamp = maximumTimestamp;
        return this;
    }

    /**
     * Get the include property: Type of files, which need to be included in the logs This will contain the type of logs
     * (Default/DefaultWithDumps/None/All/DefaultWithArchived) or a comma separated list of log types that are required.
     *
     * @return the include value.
     */
    public String include() {
        return this.include;
    }

    /**
     * Set the include property: Type of files, which need to be included in the logs This will contain the type of logs
     * (Default/DefaultWithDumps/None/All/DefaultWithArchived) or a comma separated list of log types that are required.
     *
     * @param include the include value to set.
     * @return the SupportPackageRequestProperties object itself.
     */
    public SupportPackageRequestProperties withInclude(String include) {
        this.include = include;
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
