// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
 */
public final class LoadBalancingMode extends ExpandableStringEnum<LoadBalancingMode> {
    /**
     * Static value None for LoadBalancingMode.
     */
    public static final LoadBalancingMode NONE = fromString("None");

    /**
     * Static value Web for LoadBalancingMode.
     */
    public static final LoadBalancingMode WEB = fromString("Web");

    /**
     * Static value Publishing for LoadBalancingMode.
     */
    public static final LoadBalancingMode PUBLISHING = fromString("Publishing");

    /**
     * Static value Web, Publishing for LoadBalancingMode.
     */
    public static final LoadBalancingMode WEB_PUBLISHING = fromString("Web, Publishing");

    /**
     * Creates a new instance of LoadBalancingMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LoadBalancingMode() {
    }

    /**
     * Creates or finds a LoadBalancingMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LoadBalancingMode.
     */
    public static LoadBalancingMode fromString(String name) {
        return fromString(name, LoadBalancingMode.class);
    }

    /**
     * Gets known LoadBalancingMode values.
     * 
     * @return known LoadBalancingMode values.
     */
    public static Collection<LoadBalancingMode> values() {
        return values(LoadBalancingMode.class);
    }
}
