// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The origin of the following setup.
 */
public final class DatabaseShareOrigin extends ExpandableStringEnum<DatabaseShareOrigin> {
    /**
     * Static value Direct for DatabaseShareOrigin.
     */
    public static final DatabaseShareOrigin DIRECT = fromString("Direct");

    /**
     * Static value DataShare for DatabaseShareOrigin.
     */
    public static final DatabaseShareOrigin DATA_SHARE = fromString("DataShare");

    /**
     * Static value Other for DatabaseShareOrigin.
     */
    public static final DatabaseShareOrigin OTHER = fromString("Other");

    /**
     * Creates a new instance of DatabaseShareOrigin value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabaseShareOrigin() {
    }

    /**
     * Creates or finds a DatabaseShareOrigin from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabaseShareOrigin.
     */
    @JsonCreator
    public static DatabaseShareOrigin fromString(String name) {
        return fromString(name, DatabaseShareOrigin.class);
    }

    /**
     * Gets known DatabaseShareOrigin values.
     * 
     * @return known DatabaseShareOrigin values.
     */
    public static Collection<DatabaseShareOrigin> values() {
        return values(DatabaseShareOrigin.class);
    }
}
