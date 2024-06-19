// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the directory service used. Note that this enum may be extended in the future.
 */
public final class DirectoryServiceOptions extends ExpandableStringEnum<DirectoryServiceOptions> {
    /**
     * Static value None for DirectoryServiceOptions.
     */
    public static final DirectoryServiceOptions NONE = fromString("None");

    /**
     * Static value AADDS for DirectoryServiceOptions.
     */
    public static final DirectoryServiceOptions AADDS = fromString("AADDS");

    /**
     * Static value AD for DirectoryServiceOptions.
     */
    public static final DirectoryServiceOptions AD = fromString("AD");

    /**
     * Static value AADKERB for DirectoryServiceOptions.
     */
    public static final DirectoryServiceOptions AADKERB = fromString("AADKERB");

    /**
     * Creates a new instance of DirectoryServiceOptions value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DirectoryServiceOptions() {
    }

    /**
     * Creates or finds a DirectoryServiceOptions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DirectoryServiceOptions.
     */
    public static DirectoryServiceOptions fromString(String name) {
        return fromString(name, DirectoryServiceOptions.class);
    }

    /**
     * Gets known DirectoryServiceOptions values.
     * 
     * @return known DirectoryServiceOptions values.
     */
    public static Collection<DirectoryServiceOptions> values() {
        return values(DirectoryServiceOptions.class);
    }
}
