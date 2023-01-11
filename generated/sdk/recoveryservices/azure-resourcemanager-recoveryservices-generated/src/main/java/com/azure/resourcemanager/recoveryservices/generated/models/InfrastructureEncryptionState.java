// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enabling/Disabling the Double Encryption state. */
public final class InfrastructureEncryptionState extends ExpandableStringEnum<InfrastructureEncryptionState> {
    /** Static value Enabled for InfrastructureEncryptionState. */
    public static final InfrastructureEncryptionState ENABLED = fromString("Enabled");

    /** Static value Disabled for InfrastructureEncryptionState. */
    public static final InfrastructureEncryptionState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of InfrastructureEncryptionState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InfrastructureEncryptionState() {
    }

    /**
     * Creates or finds a InfrastructureEncryptionState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InfrastructureEncryptionState.
     */
    @JsonCreator
    public static InfrastructureEncryptionState fromString(String name) {
        return fromString(name, InfrastructureEncryptionState.class);
    }

    /**
     * Gets known InfrastructureEncryptionState values.
     *
     * @return known InfrastructureEncryptionState values.
     */
    public static Collection<InfrastructureEncryptionState> values() {
        return values(InfrastructureEncryptionState.class);
    }
}
