// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of the shared private link resource. Valid values are Pending, Approved, Rejected or Disconnected.
 */
public final class SharedPrivateLinkResourceStatus extends ExpandableStringEnum<SharedPrivateLinkResourceStatus> {
    /**
     * Static value Pending for SharedPrivateLinkResourceStatus.
     */
    public static final SharedPrivateLinkResourceStatus PENDING = fromString("Pending");

    /**
     * Static value Approved for SharedPrivateLinkResourceStatus.
     */
    public static final SharedPrivateLinkResourceStatus APPROVED = fromString("Approved");

    /**
     * Static value Rejected for SharedPrivateLinkResourceStatus.
     */
    public static final SharedPrivateLinkResourceStatus REJECTED = fromString("Rejected");

    /**
     * Static value Disconnected for SharedPrivateLinkResourceStatus.
     */
    public static final SharedPrivateLinkResourceStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates a new instance of SharedPrivateLinkResourceStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SharedPrivateLinkResourceStatus() {
    }

    /**
     * Creates or finds a SharedPrivateLinkResourceStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SharedPrivateLinkResourceStatus.
     */
    public static SharedPrivateLinkResourceStatus fromString(String name) {
        return fromString(name, SharedPrivateLinkResourceStatus.class);
    }

    /**
     * Gets known SharedPrivateLinkResourceStatus values.
     * 
     * @return known SharedPrivateLinkResourceStatus values.
     */
    public static Collection<SharedPrivateLinkResourceStatus> values() {
        return values(SharedPrivateLinkResourceStatus.class);
    }
}
