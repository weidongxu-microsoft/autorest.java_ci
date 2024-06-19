// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The redundancy type of the account after an account failover is performed.
 */
public final class PostFailoverRedundancy extends ExpandableStringEnum<PostFailoverRedundancy> {
    /**
     * Static value Standard_LRS for PostFailoverRedundancy.
     */
    public static final PostFailoverRedundancy STANDARD_LRS = fromString("Standard_LRS");

    /**
     * Static value Standard_ZRS for PostFailoverRedundancy.
     */
    public static final PostFailoverRedundancy STANDARD_ZRS = fromString("Standard_ZRS");

    /**
     * Creates a new instance of PostFailoverRedundancy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PostFailoverRedundancy() {
    }

    /**
     * Creates or finds a PostFailoverRedundancy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PostFailoverRedundancy.
     */
    public static PostFailoverRedundancy fromString(String name) {
        return fromString(name, PostFailoverRedundancy.class);
    }

    /**
     * Gets known PostFailoverRedundancy values.
     * 
     * @return known PostFailoverRedundancy values.
     */
    public static Collection<PostFailoverRedundancy> values() {
        return values(PostFailoverRedundancy.class);
    }
}
