// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * State indicating the status of the enterprise grade CDN serving traffic to the static web app.
 */
public final class EnterpriseGradeCdnStatus extends ExpandableStringEnum<EnterpriseGradeCdnStatus> {
    /**
     * Static value Enabled for EnterpriseGradeCdnStatus.
     */
    public static final EnterpriseGradeCdnStatus ENABLED = fromString("Enabled");

    /**
     * Static value Enabling for EnterpriseGradeCdnStatus.
     */
    public static final EnterpriseGradeCdnStatus ENABLING = fromString("Enabling");

    /**
     * Static value Disabled for EnterpriseGradeCdnStatus.
     */
    public static final EnterpriseGradeCdnStatus DISABLED = fromString("Disabled");

    /**
     * Static value Disabling for EnterpriseGradeCdnStatus.
     */
    public static final EnterpriseGradeCdnStatus DISABLING = fromString("Disabling");

    /**
     * Creates a new instance of EnterpriseGradeCdnStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnterpriseGradeCdnStatus() {
    }

    /**
     * Creates or finds a EnterpriseGradeCdnStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EnterpriseGradeCdnStatus.
     */
    public static EnterpriseGradeCdnStatus fromString(String name) {
        return fromString(name, EnterpriseGradeCdnStatus.class);
    }

    /**
     * Gets known EnterpriseGradeCdnStatus values.
     * 
     * @return known EnterpriseGradeCdnStatus values.
     */
    public static Collection<EnterpriseGradeCdnStatus> values() {
        return values(EnterpriseGradeCdnStatus.class);
    }
}
