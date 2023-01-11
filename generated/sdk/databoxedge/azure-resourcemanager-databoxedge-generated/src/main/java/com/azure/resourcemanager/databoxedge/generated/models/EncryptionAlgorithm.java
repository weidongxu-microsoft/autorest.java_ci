// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The algorithm used to encrypt "Value". */
public final class EncryptionAlgorithm extends ExpandableStringEnum<EncryptionAlgorithm> {
    /** Static value None for EncryptionAlgorithm. */
    public static final EncryptionAlgorithm NONE = fromString("None");

    /** Static value AES256 for EncryptionAlgorithm. */
    public static final EncryptionAlgorithm AES256 = fromString("AES256");

    /** Static value RSAES_PKCS1_v_1_5 for EncryptionAlgorithm. */
    public static final EncryptionAlgorithm RSAES_PKCS1_V_1_5 = fromString("RSAES_PKCS1_v_1_5");

    /**
     * Creates a new instance of EncryptionAlgorithm value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EncryptionAlgorithm() {
    }

    /**
     * Creates or finds a EncryptionAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EncryptionAlgorithm.
     */
    @JsonCreator
    public static EncryptionAlgorithm fromString(String name) {
        return fromString(name, EncryptionAlgorithm.class);
    }

    /**
     * Gets known EncryptionAlgorithm values.
     *
     * @return known EncryptionAlgorithm values.
     */
    public static Collection<EncryptionAlgorithm> values() {
        return values(EncryptionAlgorithm.class);
    }
}
