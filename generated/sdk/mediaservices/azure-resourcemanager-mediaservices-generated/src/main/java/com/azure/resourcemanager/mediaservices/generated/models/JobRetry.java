// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates that it may be possible to retry the Job. If retry is unsuccessful, please contact Azure support via Azure
 * Portal.
 */
public final class JobRetry extends ExpandableStringEnum<JobRetry> {
    /** Static value DoNotRetry for JobRetry. */
    public static final JobRetry DO_NOT_RETRY = fromString("DoNotRetry");

    /** Static value MayRetry for JobRetry. */
    public static final JobRetry MAY_RETRY = fromString("MayRetry");

    /**
     * Creates or finds a JobRetry from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobRetry.
     */
    @JsonCreator
    public static JobRetry fromString(String name) {
        return fromString(name, JobRetry.class);
    }

    /**
     * Gets known JobRetry values.
     *
     * @return known JobRetry values.
     */
    public static Collection<JobRetry> values() {
        return values(JobRetry.class);
    }
}
