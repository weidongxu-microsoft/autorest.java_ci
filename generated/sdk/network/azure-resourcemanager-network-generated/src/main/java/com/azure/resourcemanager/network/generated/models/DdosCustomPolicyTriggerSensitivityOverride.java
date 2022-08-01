// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t.
 * normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with
 * less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
 */
public final class DdosCustomPolicyTriggerSensitivityOverride
    extends ExpandableStringEnum<DdosCustomPolicyTriggerSensitivityOverride> {
    /** Static value Relaxed for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride RELAXED = fromString("Relaxed");

    /** Static value Low for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride LOW = fromString("Low");

    /** Static value Default for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride DEFAULT = fromString("Default");

    /** Static value High for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride HIGH = fromString("High");

    /**
     * Creates or finds a DdosCustomPolicyTriggerSensitivityOverride from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DdosCustomPolicyTriggerSensitivityOverride.
     */
    @JsonCreator
    public static DdosCustomPolicyTriggerSensitivityOverride fromString(String name) {
        return fromString(name, DdosCustomPolicyTriggerSensitivityOverride.class);
    }

    /**
     * Gets known DdosCustomPolicyTriggerSensitivityOverride values.
     *
     * @return known DdosCustomPolicyTriggerSensitivityOverride values.
     */
    public static Collection<DdosCustomPolicyTriggerSensitivityOverride> values() {
        return values(DdosCustomPolicyTriggerSensitivityOverride.class);
    }
}
