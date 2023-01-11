// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provider for the encryption scope. Possible values (case-insensitive): Microsoft.Storage, Microsoft.KeyVault. */
public final class EncryptionScopeSource extends ExpandableStringEnum<EncryptionScopeSource> {
    /** Static value Microsoft.Storage for EncryptionScopeSource. */
    public static final EncryptionScopeSource MICROSOFT_STORAGE = fromString("Microsoft.Storage");

    /** Static value Microsoft.KeyVault for EncryptionScopeSource. */
    public static final EncryptionScopeSource MICROSOFT_KEY_VAULT = fromString("Microsoft.KeyVault");

    /**
     * Creates a new instance of EncryptionScopeSource value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EncryptionScopeSource() {
    }

    /**
     * Creates or finds a EncryptionScopeSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EncryptionScopeSource.
     */
    @JsonCreator
    public static EncryptionScopeSource fromString(String name) {
        return fromString(name, EncryptionScopeSource.class);
    }

    /**
     * Gets known EncryptionScopeSource values.
     *
     * @return known EncryptionScopeSource values.
     */
    public static Collection<EncryptionScopeSource> values() {
        return values(EncryptionScopeSource.class);
    }
}
