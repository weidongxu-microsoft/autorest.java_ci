// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TableSubTypeEnum. */
public final class TableSubTypeEnum extends ExpandableStringEnum<TableSubTypeEnum> {
    /** Static value Any for TableSubTypeEnum. */
    public static final TableSubTypeEnum ANY = fromString("Any");

    /** Static value Classic for TableSubTypeEnum. */
    public static final TableSubTypeEnum CLASSIC = fromString("Classic");

    /** Static value DataCollectionRuleBased for TableSubTypeEnum. */
    public static final TableSubTypeEnum DATA_COLLECTION_RULE_BASED = fromString("DataCollectionRuleBased");

    /**
     * Creates or finds a TableSubTypeEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TableSubTypeEnum.
     */
    @JsonCreator
    public static TableSubTypeEnum fromString(String name) {
        return fromString(name, TableSubTypeEnum.class);
    }

    /**
     * Gets known TableSubTypeEnum values.
     *
     * @return known TableSubTypeEnum values.
     */
    public static Collection<TableSubTypeEnum> values() {
        return values(TableSubTypeEnum.class);
    }
}
