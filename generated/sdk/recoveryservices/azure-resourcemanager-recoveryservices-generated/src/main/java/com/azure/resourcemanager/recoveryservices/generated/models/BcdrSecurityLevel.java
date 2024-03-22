// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Security levels of Recovery Services Vault for business continuity and disaster recovery.
 */
public final class BcdrSecurityLevel extends ExpandableStringEnum<BcdrSecurityLevel> {
    /**
     * Static value Poor for BcdrSecurityLevel.
     */
    public static final BcdrSecurityLevel POOR = fromString("Poor");

    /**
     * Static value Fair for BcdrSecurityLevel.
     */
    public static final BcdrSecurityLevel FAIR = fromString("Fair");

    /**
     * Static value Good for BcdrSecurityLevel.
     */
    public static final BcdrSecurityLevel GOOD = fromString("Good");

    /**
     * Static value Excellent for BcdrSecurityLevel.
     */
    public static final BcdrSecurityLevel EXCELLENT = fromString("Excellent");

    /**
     * Creates a new instance of BcdrSecurityLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BcdrSecurityLevel() {
    }

    /**
     * Creates or finds a BcdrSecurityLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BcdrSecurityLevel.
     */
    @JsonCreator
    public static BcdrSecurityLevel fromString(String name) {
        return fromString(name, BcdrSecurityLevel.class);
    }

    /**
     * Gets known BcdrSecurityLevel values.
     * 
     * @return known BcdrSecurityLevel values.
     */
    public static Collection<BcdrSecurityLevel> values() {
        return values(BcdrSecurityLevel.class);
    }
}
