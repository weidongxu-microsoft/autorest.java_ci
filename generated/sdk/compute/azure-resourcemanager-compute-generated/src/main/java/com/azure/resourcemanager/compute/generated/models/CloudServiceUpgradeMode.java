// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Update mode for the cloud service. Role instances are allocated to update domains when the service is deployed.
 * Updates can be initiated manually in each update domain or initiated automatically in all update domains.
 * Possible Values are &lt;br /&gt;&lt;br /&gt;**Auto**&lt;br /&gt;&lt;br /&gt;**Manual** &lt;br /&gt;&lt;br
 * /&gt;**Simultaneous**&lt;br /&gt;&lt;br /&gt;
 * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the update.
 * If set to Auto, the update is automatically applied to each update domain in sequence.
 */
public final class CloudServiceUpgradeMode extends ExpandableStringEnum<CloudServiceUpgradeMode> {
    /**
     * Static value Auto for CloudServiceUpgradeMode.
     */
    public static final CloudServiceUpgradeMode AUTO = fromString("Auto");

    /**
     * Static value Manual for CloudServiceUpgradeMode.
     */
    public static final CloudServiceUpgradeMode MANUAL = fromString("Manual");

    /**
     * Static value Simultaneous for CloudServiceUpgradeMode.
     */
    public static final CloudServiceUpgradeMode SIMULTANEOUS = fromString("Simultaneous");

    /**
     * Creates a new instance of CloudServiceUpgradeMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CloudServiceUpgradeMode() {
    }

    /**
     * Creates or finds a CloudServiceUpgradeMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CloudServiceUpgradeMode.
     */
    public static CloudServiceUpgradeMode fromString(String name) {
        return fromString(name, CloudServiceUpgradeMode.class);
    }

    /**
     * Gets known CloudServiceUpgradeMode values.
     * 
     * @return known CloudServiceUpgradeMode values.
     */
    public static Collection<CloudServiceUpgradeMode> values() {
        return values(CloudServiceUpgradeMode.class);
    }
}
