// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Sku can be signed up by customer or not. */
public final class SkuSignupOption extends ExpandableStringEnum<SkuSignupOption> {
    /** Static value None for SkuSignupOption. */
    public static final SkuSignupOption NONE = fromString("None");

    /** Static value Available for SkuSignupOption. */
    public static final SkuSignupOption AVAILABLE = fromString("Available");

    /**
     * Creates or finds a SkuSignupOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuSignupOption.
     */
    @JsonCreator
    public static SkuSignupOption fromString(String name) {
        return fromString(name, SkuSignupOption.class);
    }

    /**
     * Gets known SkuSignupOption values.
     *
     * @return known SkuSignupOption values.
     */
    public static Collection<SkuSignupOption> values() {
        return values(SkuSignupOption.class);
    }
}
