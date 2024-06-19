// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Possible Intrusion Detection profile values.
 */
public final class FirewallPolicyIntrusionDetectionProfileType
    extends ExpandableStringEnum<FirewallPolicyIntrusionDetectionProfileType> {
    /**
     * Static value Basic for FirewallPolicyIntrusionDetectionProfileType.
     */
    public static final FirewallPolicyIntrusionDetectionProfileType BASIC = fromString("Basic");

    /**
     * Static value Standard for FirewallPolicyIntrusionDetectionProfileType.
     */
    public static final FirewallPolicyIntrusionDetectionProfileType STANDARD = fromString("Standard");

    /**
     * Static value Advanced for FirewallPolicyIntrusionDetectionProfileType.
     */
    public static final FirewallPolicyIntrusionDetectionProfileType ADVANCED = fromString("Advanced");

    /**
     * Static value Extended for FirewallPolicyIntrusionDetectionProfileType.
     */
    public static final FirewallPolicyIntrusionDetectionProfileType EXTENDED = fromString("Extended");

    /**
     * Creates a new instance of FirewallPolicyIntrusionDetectionProfileType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FirewallPolicyIntrusionDetectionProfileType() {
    }

    /**
     * Creates or finds a FirewallPolicyIntrusionDetectionProfileType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyIntrusionDetectionProfileType.
     */
    public static FirewallPolicyIntrusionDetectionProfileType fromString(String name) {
        return fromString(name, FirewallPolicyIntrusionDetectionProfileType.class);
    }

    /**
     * Gets known FirewallPolicyIntrusionDetectionProfileType values.
     * 
     * @return known FirewallPolicyIntrusionDetectionProfileType values.
     */
    public static Collection<FirewallPolicyIntrusionDetectionProfileType> values() {
        return values(FirewallPolicyIntrusionDetectionProfileType.class);
    }
}
