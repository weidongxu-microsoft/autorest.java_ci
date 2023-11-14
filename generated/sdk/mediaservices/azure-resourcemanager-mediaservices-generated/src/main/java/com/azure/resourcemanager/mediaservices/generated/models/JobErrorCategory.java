// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Helps with categorization of errors.
 */
public final class JobErrorCategory extends ExpandableStringEnum<JobErrorCategory> {
    /**
     * Static value Service for JobErrorCategory.
     */
    public static final JobErrorCategory SERVICE = fromString("Service");

    /**
     * Static value Download for JobErrorCategory.
     */
    public static final JobErrorCategory DOWNLOAD = fromString("Download");

    /**
     * Static value Upload for JobErrorCategory.
     */
    public static final JobErrorCategory UPLOAD = fromString("Upload");

    /**
     * Static value Configuration for JobErrorCategory.
     */
    public static final JobErrorCategory CONFIGURATION = fromString("Configuration");

    /**
     * Static value Content for JobErrorCategory.
     */
    public static final JobErrorCategory CONTENT = fromString("Content");

    /**
     * Static value Account for JobErrorCategory.
     */
    public static final JobErrorCategory ACCOUNT = fromString("Account");

    /**
     * Creates a new instance of JobErrorCategory value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JobErrorCategory() {
    }

    /**
     * Creates or finds a JobErrorCategory from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JobErrorCategory.
     */
    @JsonCreator
    public static JobErrorCategory fromString(String name) {
        return fromString(name, JobErrorCategory.class);
    }

    /**
     * Gets known JobErrorCategory values.
     * 
     * @return known JobErrorCategory values.
     */
    public static Collection<JobErrorCategory> values() {
        return values(JobErrorCategory.class);
    }
}
