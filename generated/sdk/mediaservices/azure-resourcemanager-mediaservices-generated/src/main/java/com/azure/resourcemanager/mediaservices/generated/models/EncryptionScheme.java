// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Encryption scheme.
 */
public final class EncryptionScheme extends ExpandableStringEnum<EncryptionScheme> {
    /**
     * Static value NoEncryption for EncryptionScheme.
     */
    public static final EncryptionScheme NO_ENCRYPTION = fromString("NoEncryption");

    /**
     * Static value EnvelopeEncryption for EncryptionScheme.
     */
    public static final EncryptionScheme ENVELOPE_ENCRYPTION = fromString("EnvelopeEncryption");

    /**
     * Static value CommonEncryptionCenc for EncryptionScheme.
     */
    public static final EncryptionScheme COMMON_ENCRYPTION_CENC = fromString("CommonEncryptionCenc");

    /**
     * Static value CommonEncryptionCbcs for EncryptionScheme.
     */
    public static final EncryptionScheme COMMON_ENCRYPTION_CBCS = fromString("CommonEncryptionCbcs");

    /**
     * Creates a new instance of EncryptionScheme value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EncryptionScheme() {
    }

    /**
     * Creates or finds a EncryptionScheme from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EncryptionScheme.
     */
    @JsonCreator
    public static EncryptionScheme fromString(String name) {
        return fromString(name, EncryptionScheme.class);
    }

    /**
     * Gets known EncryptionScheme values.
     * 
     * @return known EncryptionScheme values.
     */
    public static Collection<EncryptionScheme> values() {
        return values(EncryptionScheme.class);
    }
}
