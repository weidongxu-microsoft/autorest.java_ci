// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Secure Score of Recovery Services Vault.
 */
public final class SecureScoreLevel extends ExpandableStringEnum<SecureScoreLevel> {
    /**
     * Static value None for SecureScoreLevel.
     */
    public static final SecureScoreLevel NONE = fromString("None");

    /**
     * Static value Minimum for SecureScoreLevel.
     */
    public static final SecureScoreLevel MINIMUM = fromString("Minimum");

    /**
     * Static value Adequate for SecureScoreLevel.
     */
    public static final SecureScoreLevel ADEQUATE = fromString("Adequate");

    /**
     * Static value Maximum for SecureScoreLevel.
     */
    public static final SecureScoreLevel MAXIMUM = fromString("Maximum");

    /**
     * Creates a new instance of SecureScoreLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecureScoreLevel() {
    }

    /**
     * Creates or finds a SecureScoreLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SecureScoreLevel.
     */
    public static SecureScoreLevel fromString(String name) {
        return fromString(name, SecureScoreLevel.class);
    }

    /**
     * Gets known SecureScoreLevel values.
     * 
     * @return known SecureScoreLevel values.
     */
    public static Collection<SecureScoreLevel> values() {
        return values(SecureScoreLevel.class);
    }
}
