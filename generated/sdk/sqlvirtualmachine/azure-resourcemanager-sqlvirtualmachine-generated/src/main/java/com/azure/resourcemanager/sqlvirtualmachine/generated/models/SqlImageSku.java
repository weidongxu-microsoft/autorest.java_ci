// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** SQL Server edition type. */
public final class SqlImageSku extends ExpandableStringEnum<SqlImageSku> {
    /** Static value Developer for SqlImageSku. */
    public static final SqlImageSku DEVELOPER = fromString("Developer");

    /** Static value Express for SqlImageSku. */
    public static final SqlImageSku EXPRESS = fromString("Express");

    /** Static value Standard for SqlImageSku. */
    public static final SqlImageSku STANDARD = fromString("Standard");

    /** Static value Enterprise for SqlImageSku. */
    public static final SqlImageSku ENTERPRISE = fromString("Enterprise");

    /** Static value Web for SqlImageSku. */
    public static final SqlImageSku WEB = fromString("Web");

    /**
     * Creates a new instance of SqlImageSku value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlImageSku() {
    }

    /**
     * Creates or finds a SqlImageSku from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlImageSku.
     */
    @JsonCreator
    public static SqlImageSku fromString(String name) {
        return fromString(name, SqlImageSku.class);
    }

    /**
     * Gets known SqlImageSku values.
     *
     * @return known SqlImageSku values.
     */
    public static Collection<SqlImageSku> values() {
        return values(SqlImageSku.class);
    }
}
