// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Cookie based affinity. */
public final class ApplicationGatewayCookieBasedAffinity
    extends ExpandableStringEnum<ApplicationGatewayCookieBasedAffinity> {
    /** Static value Enabled for ApplicationGatewayCookieBasedAffinity. */
    public static final ApplicationGatewayCookieBasedAffinity ENABLED = fromString("Enabled");

    /** Static value Disabled for ApplicationGatewayCookieBasedAffinity. */
    public static final ApplicationGatewayCookieBasedAffinity DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ApplicationGatewayCookieBasedAffinity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewayCookieBasedAffinity() {
    }

    /**
     * Creates or finds a ApplicationGatewayCookieBasedAffinity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayCookieBasedAffinity.
     */
    @JsonCreator
    public static ApplicationGatewayCookieBasedAffinity fromString(String name) {
        return fromString(name, ApplicationGatewayCookieBasedAffinity.class);
    }

    /**
     * Gets known ApplicationGatewayCookieBasedAffinity values.
     *
     * @return known ApplicationGatewayCookieBasedAffinity values.
     */
    public static Collection<ApplicationGatewayCookieBasedAffinity> values() {
        return values(ApplicationGatewayCookieBasedAffinity.class);
    }
}
