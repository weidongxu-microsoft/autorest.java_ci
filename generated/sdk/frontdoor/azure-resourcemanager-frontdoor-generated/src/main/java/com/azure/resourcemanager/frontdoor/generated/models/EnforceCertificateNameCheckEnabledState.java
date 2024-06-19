// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Whether to enforce certificate name check on HTTPS requests to all backend pools. No effect on non-HTTPS requests.
 */
public final class EnforceCertificateNameCheckEnabledState
    extends ExpandableStringEnum<EnforceCertificateNameCheckEnabledState> {
    /**
     * Static value Enabled for EnforceCertificateNameCheckEnabledState.
     */
    public static final EnforceCertificateNameCheckEnabledState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for EnforceCertificateNameCheckEnabledState.
     */
    public static final EnforceCertificateNameCheckEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of EnforceCertificateNameCheckEnabledState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnforceCertificateNameCheckEnabledState() {
    }

    /**
     * Creates or finds a EnforceCertificateNameCheckEnabledState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EnforceCertificateNameCheckEnabledState.
     */
    public static EnforceCertificateNameCheckEnabledState fromString(String name) {
        return fromString(name, EnforceCertificateNameCheckEnabledState.class);
    }

    /**
     * Gets known EnforceCertificateNameCheckEnabledState values.
     * 
     * @return known EnforceCertificateNameCheckEnabledState values.
     */
    public static Collection<EnforceCertificateNameCheckEnabledState> values() {
        return values(EnforceCertificateNameCheckEnabledState.class);
    }
}
