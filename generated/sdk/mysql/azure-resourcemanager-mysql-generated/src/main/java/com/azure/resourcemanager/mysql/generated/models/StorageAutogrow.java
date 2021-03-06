// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enable Storage Auto Grow. */
public final class StorageAutogrow extends ExpandableStringEnum<StorageAutogrow> {
    /** Static value Enabled for StorageAutogrow. */
    public static final StorageAutogrow ENABLED = fromString("Enabled");

    /** Static value Disabled for StorageAutogrow. */
    public static final StorageAutogrow DISABLED = fromString("Disabled");

    /**
     * Creates or finds a StorageAutogrow from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageAutogrow.
     */
    @JsonCreator
    public static StorageAutogrow fromString(String name) {
        return fromString(name, StorageAutogrow.class);
    }

    /**
     * Gets known StorageAutogrow values.
     *
     * @return known StorageAutogrow values.
     */
    public static Collection<StorageAutogrow> values() {
        return values(StorageAutogrow.class);
    }
}
