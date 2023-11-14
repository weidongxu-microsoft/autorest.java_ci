// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The status of data ingestion for this workspace.
 */
public final class DataIngestionStatus extends ExpandableStringEnum<DataIngestionStatus> {
    /**
     * Static value RespectQuota for DataIngestionStatus.
     */
    public static final DataIngestionStatus RESPECT_QUOTA = fromString("RespectQuota");

    /**
     * Static value ForceOn for DataIngestionStatus.
     */
    public static final DataIngestionStatus FORCE_ON = fromString("ForceOn");

    /**
     * Static value ForceOff for DataIngestionStatus.
     */
    public static final DataIngestionStatus FORCE_OFF = fromString("ForceOff");

    /**
     * Static value OverQuota for DataIngestionStatus.
     */
    public static final DataIngestionStatus OVER_QUOTA = fromString("OverQuota");

    /**
     * Static value SubscriptionSuspended for DataIngestionStatus.
     */
    public static final DataIngestionStatus SUBSCRIPTION_SUSPENDED = fromString("SubscriptionSuspended");

    /**
     * Static value ApproachingQuota for DataIngestionStatus.
     */
    public static final DataIngestionStatus APPROACHING_QUOTA = fromString("ApproachingQuota");

    /**
     * Creates a new instance of DataIngestionStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataIngestionStatus() {
    }

    /**
     * Creates or finds a DataIngestionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataIngestionStatus.
     */
    @JsonCreator
    public static DataIngestionStatus fromString(String name) {
        return fromString(name, DataIngestionStatus.class);
    }

    /**
     * Gets known DataIngestionStatus values.
     * 
     * @return known DataIngestionStatus values.
     */
    public static Collection<DataIngestionStatus> values() {
        return values(DataIngestionStatus.class);
    }
}
