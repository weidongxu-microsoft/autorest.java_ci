// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This determines if traffic is allowed over public network. By default it is enabled. You can further restrict to
 * specific IPs by configuring &lt;seealso
 * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
 */
public final class PublicNetworkAccess extends ExpandableStringEnum<PublicNetworkAccess> {
    /** Static value Enabled for PublicNetworkAccess. */
    public static final PublicNetworkAccess ENABLED = fromString("Enabled");

    /** Static value Disabled for PublicNetworkAccess. */
    public static final PublicNetworkAccess DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of PublicNetworkAccess value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicNetworkAccess() {
    }

    /**
     * Creates or finds a PublicNetworkAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccess.
     */
    @JsonCreator
    public static PublicNetworkAccess fromString(String name) {
        return fromString(name, PublicNetworkAccess.class);
    }

    /**
     * Gets known PublicNetworkAccess values.
     *
     * @return known PublicNetworkAccess values.
     */
    public static Collection<PublicNetworkAccess> values() {
        return values(PublicNetworkAccess.class);
    }
}
