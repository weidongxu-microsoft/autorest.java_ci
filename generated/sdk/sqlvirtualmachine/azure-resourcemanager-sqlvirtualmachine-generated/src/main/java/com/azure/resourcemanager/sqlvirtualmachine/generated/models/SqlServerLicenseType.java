// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** SQL Server license type. */
public final class SqlServerLicenseType extends ExpandableStringEnum<SqlServerLicenseType> {
    /** Static value PAYG for SqlServerLicenseType. */
    public static final SqlServerLicenseType PAYG = fromString("PAYG");

    /** Static value AHUB for SqlServerLicenseType. */
    public static final SqlServerLicenseType AHUB = fromString("AHUB");

    /** Static value DR for SqlServerLicenseType. */
    public static final SqlServerLicenseType DR = fromString("DR");

    /**
     * Creates a new instance of SqlServerLicenseType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlServerLicenseType() {
    }

    /**
     * Creates or finds a SqlServerLicenseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlServerLicenseType.
     */
    @JsonCreator
    public static SqlServerLicenseType fromString(String name) {
        return fromString(name, SqlServerLicenseType.class);
    }

    /**
     * Gets known SqlServerLicenseType values.
     *
     * @return known SqlServerLicenseType values.
     */
    public static Collection<SqlServerLicenseType> values() {
        return values(SqlServerLicenseType.class);
    }
}
