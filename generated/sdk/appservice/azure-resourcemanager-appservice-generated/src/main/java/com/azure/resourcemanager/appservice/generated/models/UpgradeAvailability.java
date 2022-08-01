// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Whether an upgrade is available for this App Service Environment. */
public final class UpgradeAvailability extends ExpandableStringEnum<UpgradeAvailability> {
    /** Static value None for UpgradeAvailability. */
    public static final UpgradeAvailability NONE = fromString("None");

    /** Static value Ready for UpgradeAvailability. */
    public static final UpgradeAvailability READY = fromString("Ready");

    /**
     * Creates or finds a UpgradeAvailability from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeAvailability.
     */
    @JsonCreator
    public static UpgradeAvailability fromString(String name) {
        return fromString(name, UpgradeAvailability.class);
    }

    /**
     * Gets known UpgradeAvailability values.
     *
     * @return known UpgradeAvailability values.
     */
    public static Collection<UpgradeAvailability> values() {
        return values(UpgradeAvailability.class);
    }
}
