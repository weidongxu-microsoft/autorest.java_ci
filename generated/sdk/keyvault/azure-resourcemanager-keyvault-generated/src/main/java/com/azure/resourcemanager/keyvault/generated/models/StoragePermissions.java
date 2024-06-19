// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for StoragePermissions.
 */
public final class StoragePermissions extends ExpandableStringEnum<StoragePermissions> {
    /**
     * Static value all for StoragePermissions.
     */
    public static final StoragePermissions ALL = fromString("all");

    /**
     * Static value get for StoragePermissions.
     */
    public static final StoragePermissions GET = fromString("get");

    /**
     * Static value list for StoragePermissions.
     */
    public static final StoragePermissions LIST = fromString("list");

    /**
     * Static value delete for StoragePermissions.
     */
    public static final StoragePermissions DELETE = fromString("delete");

    /**
     * Static value set for StoragePermissions.
     */
    public static final StoragePermissions SET = fromString("set");

    /**
     * Static value update for StoragePermissions.
     */
    public static final StoragePermissions UPDATE = fromString("update");

    /**
     * Static value regeneratekey for StoragePermissions.
     */
    public static final StoragePermissions REGENERATEKEY = fromString("regeneratekey");

    /**
     * Static value recover for StoragePermissions.
     */
    public static final StoragePermissions RECOVER = fromString("recover");

    /**
     * Static value purge for StoragePermissions.
     */
    public static final StoragePermissions PURGE = fromString("purge");

    /**
     * Static value backup for StoragePermissions.
     */
    public static final StoragePermissions BACKUP = fromString("backup");

    /**
     * Static value restore for StoragePermissions.
     */
    public static final StoragePermissions RESTORE = fromString("restore");

    /**
     * Static value setsas for StoragePermissions.
     */
    public static final StoragePermissions SETSAS = fromString("setsas");

    /**
     * Static value listsas for StoragePermissions.
     */
    public static final StoragePermissions LISTSAS = fromString("listsas");

    /**
     * Static value getsas for StoragePermissions.
     */
    public static final StoragePermissions GETSAS = fromString("getsas");

    /**
     * Static value deletesas for StoragePermissions.
     */
    public static final StoragePermissions DELETESAS = fromString("deletesas");

    /**
     * Creates a new instance of StoragePermissions value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StoragePermissions() {
    }

    /**
     * Creates or finds a StoragePermissions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StoragePermissions.
     */
    public static StoragePermissions fromString(String name) {
        return fromString(name, StoragePermissions.class);
    }

    /**
     * Gets known StoragePermissions values.
     * 
     * @return known StoragePermissions values.
     */
    public static Collection<StoragePermissions> values() {
        return values(StoragePermissions.class);
    }
}
