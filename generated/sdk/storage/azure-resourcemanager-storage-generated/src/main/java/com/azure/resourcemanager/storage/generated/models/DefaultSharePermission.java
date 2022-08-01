// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Default share permission for users using Kerberos authentication if RBAC role is not assigned. */
public final class DefaultSharePermission extends ExpandableStringEnum<DefaultSharePermission> {
    /** Static value None for DefaultSharePermission. */
    public static final DefaultSharePermission NONE = fromString("None");

    /** Static value StorageFileDataSmbShareReader for DefaultSharePermission. */
    public static final DefaultSharePermission STORAGE_FILE_DATA_SMB_SHARE_READER =
        fromString("StorageFileDataSmbShareReader");

    /** Static value StorageFileDataSmbShareContributor for DefaultSharePermission. */
    public static final DefaultSharePermission STORAGE_FILE_DATA_SMB_SHARE_CONTRIBUTOR =
        fromString("StorageFileDataSmbShareContributor");

    /** Static value StorageFileDataSmbShareElevatedContributor for DefaultSharePermission. */
    public static final DefaultSharePermission STORAGE_FILE_DATA_SMB_SHARE_ELEVATED_CONTRIBUTOR =
        fromString("StorageFileDataSmbShareElevatedContributor");

    /**
     * Creates or finds a DefaultSharePermission from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DefaultSharePermission.
     */
    @JsonCreator
    public static DefaultSharePermission fromString(String name) {
        return fromString(name, DefaultSharePermission.class);
    }

    /**
     * Gets known DefaultSharePermission values.
     *
     * @return known DefaultSharePermission values.
     */
    public static Collection<DefaultSharePermission> values() {
        return values(DefaultSharePermission.class);
    }
}
