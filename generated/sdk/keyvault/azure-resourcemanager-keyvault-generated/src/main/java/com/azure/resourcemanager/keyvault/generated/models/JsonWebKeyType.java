// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the key. For valid values, see JsonWebKeyType.
 */
public final class JsonWebKeyType extends ExpandableStringEnum<JsonWebKeyType> {
    /**
     * Static value EC for JsonWebKeyType.
     */
    public static final JsonWebKeyType EC = fromString("EC");

    /**
     * Static value EC-HSM for JsonWebKeyType.
     */
    public static final JsonWebKeyType EC_HSM = fromString("EC-HSM");

    /**
     * Static value RSA for JsonWebKeyType.
     */
    public static final JsonWebKeyType RSA = fromString("RSA");

    /**
     * Static value RSA-HSM for JsonWebKeyType.
     */
    public static final JsonWebKeyType RSA_HSM = fromString("RSA-HSM");

    /**
     * Creates a new instance of JsonWebKeyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JsonWebKeyType() {
    }

    /**
     * Creates or finds a JsonWebKeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JsonWebKeyType.
     */
    public static JsonWebKeyType fromString(String name) {
        return fromString(name, JsonWebKeyType.class);
    }

    /**
     * Gets known JsonWebKeyType values.
     * 
     * @return known JsonWebKeyType values.
     */
    public static Collection<JsonWebKeyType> values() {
        return values(JsonWebKeyType.class);
    }
}
