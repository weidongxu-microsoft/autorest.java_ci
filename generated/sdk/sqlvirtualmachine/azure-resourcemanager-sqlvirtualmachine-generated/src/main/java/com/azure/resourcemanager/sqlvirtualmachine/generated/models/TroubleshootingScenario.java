// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** SQL VM troubleshooting scenario. */
public final class TroubleshootingScenario extends ExpandableStringEnum<TroubleshootingScenario> {
    /** Static value UnhealthyReplica for TroubleshootingScenario. */
    public static final TroubleshootingScenario UNHEALTHY_REPLICA = fromString("UnhealthyReplica");

    /**
     * Creates or finds a TroubleshootingScenario from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TroubleshootingScenario.
     */
    @JsonCreator
    public static TroubleshootingScenario fromString(String name) {
        return fromString(name, TroubleshootingScenario.class);
    }

    /**
     * Gets known TroubleshootingScenario values.
     *
     * @return known TroubleshootingScenario values.
     */
    public static Collection<TroubleshootingScenario> values() {
        return values(TroubleshootingScenario.class);
    }
}
