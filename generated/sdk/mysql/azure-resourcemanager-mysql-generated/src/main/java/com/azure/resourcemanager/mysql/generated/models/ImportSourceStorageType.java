// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Storage type of import source. */
public final class ImportSourceStorageType extends ExpandableStringEnum<ImportSourceStorageType> {
    /** Static value AzureBlob for ImportSourceStorageType. */
    public static final ImportSourceStorageType AZURE_BLOB = fromString("AzureBlob");

    /**
     * Creates a new instance of ImportSourceStorageType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ImportSourceStorageType() {
    }

    /**
     * Creates or finds a ImportSourceStorageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImportSourceStorageType.
     */
    @JsonCreator
    public static ImportSourceStorageType fromString(String name) {
        return fromString(name, ImportSourceStorageType.class);
    }

    /**
     * Gets known ImportSourceStorageType values.
     *
     * @return known ImportSourceStorageType values.
     */
    public static Collection<ImportSourceStorageType> values() {
        return values(ImportSourceStorageType.class);
    }
}
