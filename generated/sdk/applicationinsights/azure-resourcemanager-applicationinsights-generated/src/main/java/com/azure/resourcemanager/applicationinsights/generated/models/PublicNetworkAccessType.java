// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The network access type for operating on the Application Insights Component. By default it is Enabled.
 */
public final class PublicNetworkAccessType extends ExpandableStringEnum<PublicNetworkAccessType> {
    /**
     * Static value Enabled for PublicNetworkAccessType.
     */
    public static final PublicNetworkAccessType ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for PublicNetworkAccessType.
     */
    public static final PublicNetworkAccessType DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of PublicNetworkAccessType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicNetworkAccessType() {
    }

    /**
     * Creates or finds a PublicNetworkAccessType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccessType.
     */
    public static PublicNetworkAccessType fromString(String name) {
        return fromString(name, PublicNetworkAccessType.class);
    }

    /**
     * Gets known PublicNetworkAccessType values.
     * 
     * @return known PublicNetworkAccessType values.
     */
    public static Collection<PublicNetworkAccessType> values() {
        return values(PublicNetworkAccessType.class);
    }
}
