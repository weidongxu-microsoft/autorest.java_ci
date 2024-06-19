// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the lot.
 */
public final class Status extends ExpandableStringEnum<Status> {
    /**
     * Static value None for Status.
     */
    public static final Status NONE = fromString("None");

    /**
     * Static value Active for Status.
     */
    public static final Status ACTIVE = fromString("Active");

    /**
     * Static value Inactive for Status.
     */
    public static final Status INACTIVE = fromString("Inactive");

    /**
     * Static value Expired for Status.
     */
    public static final Status EXPIRED = fromString("Expired");

    /**
     * Static value Complete for Status.
     */
    public static final Status COMPLETE = fromString("Complete");

    /**
     * Static value Canceled for Status.
     */
    public static final Status CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of Status value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Status() {
    }

    /**
     * Creates or finds a Status from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * Gets known Status values.
     * 
     * @return known Status values.
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
