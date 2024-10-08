// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * For changing or to initiate the resync to key-vault set the status to KeyVaultSyncPending, rest of the status will
 * not be applicable.
 */
public final class KeyVaultSyncStatus extends ExpandableStringEnum<KeyVaultSyncStatus> {
    /**
     * Static value KeyVaultSynced for KeyVaultSyncStatus.
     */
    public static final KeyVaultSyncStatus KEY_VAULT_SYNCED = fromString("KeyVaultSynced");

    /**
     * Static value KeyVaultSyncFailed for KeyVaultSyncStatus.
     */
    public static final KeyVaultSyncStatus KEY_VAULT_SYNC_FAILED = fromString("KeyVaultSyncFailed");

    /**
     * Static value KeyVaultNotConfigured for KeyVaultSyncStatus.
     */
    public static final KeyVaultSyncStatus KEY_VAULT_NOT_CONFIGURED = fromString("KeyVaultNotConfigured");

    /**
     * Static value KeyVaultSyncPending for KeyVaultSyncStatus.
     */
    public static final KeyVaultSyncStatus KEY_VAULT_SYNC_PENDING = fromString("KeyVaultSyncPending");

    /**
     * Static value KeyVaultSyncing for KeyVaultSyncStatus.
     */
    public static final KeyVaultSyncStatus KEY_VAULT_SYNCING = fromString("KeyVaultSyncing");

    /**
     * Static value KeyVaultNotSynced for KeyVaultSyncStatus.
     */
    public static final KeyVaultSyncStatus KEY_VAULT_NOT_SYNCED = fromString("KeyVaultNotSynced");

    /**
     * Creates a new instance of KeyVaultSyncStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyVaultSyncStatus() {
    }

    /**
     * Creates or finds a KeyVaultSyncStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyVaultSyncStatus.
     */
    public static KeyVaultSyncStatus fromString(String name) {
        return fromString(name, KeyVaultSyncStatus.class);
    }

    /**
     * Gets known KeyVaultSyncStatus values.
     * 
     * @return known KeyVaultSyncStatus values.
     */
    public static Collection<KeyVaultSyncStatus> values() {
        return values(KeyVaultSyncStatus.class);
    }
}
