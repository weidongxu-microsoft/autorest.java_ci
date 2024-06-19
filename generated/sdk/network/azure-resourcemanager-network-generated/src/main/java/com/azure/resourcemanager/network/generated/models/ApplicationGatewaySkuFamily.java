// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Family of an application gateway SKU.
 */
public final class ApplicationGatewaySkuFamily extends ExpandableStringEnum<ApplicationGatewaySkuFamily> {
    /**
     * Static value Generation_1 for ApplicationGatewaySkuFamily.
     */
    public static final ApplicationGatewaySkuFamily GENERATION_1 = fromString("Generation_1");

    /**
     * Static value Generation_2 for ApplicationGatewaySkuFamily.
     */
    public static final ApplicationGatewaySkuFamily GENERATION_2 = fromString("Generation_2");

    /**
     * Creates a new instance of ApplicationGatewaySkuFamily value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewaySkuFamily() {
    }

    /**
     * Creates or finds a ApplicationGatewaySkuFamily from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewaySkuFamily.
     */
    public static ApplicationGatewaySkuFamily fromString(String name) {
        return fromString(name, ApplicationGatewaySkuFamily.class);
    }

    /**
     * Gets known ApplicationGatewaySkuFamily values.
     * 
     * @return known ApplicationGatewaySkuFamily values.
     */
    public static Collection<ApplicationGatewaySkuFamily> values() {
        return values(ApplicationGatewaySkuFamily.class);
    }
}
