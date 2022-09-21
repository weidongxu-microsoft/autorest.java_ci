// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes scaling information of a SKU. */
@Immutable
public final class ResourceSkuRestrictions {
    /*
     * The type of restrictions.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSkuRestrictionsType type;

    /*
     * The value of restrictions. If the restriction type is set to location. This would be different locations where
     * the SKU is restricted.
     */
    @JsonProperty(value = "values", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> values;

    /*
     * The information about the restriction where the SKU cannot be used.
     */
    @JsonProperty(value = "restrictionInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSkuRestrictionInfo restrictionInfo;

    /*
     * The reason for restriction.
     */
    @JsonProperty(value = "reasonCode", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSkuRestrictionsReasonCode reasonCode;

    /** Creates an instance of ResourceSkuRestrictions class. */
    public ResourceSkuRestrictions() {
    }

    /**
     * Get the type property: The type of restrictions.
     *
     * @return the type value.
     */
    public ResourceSkuRestrictionsType type() {
        return this.type;
    }

    /**
     * Get the values property: The value of restrictions. If the restriction type is set to location. This would be
     * different locations where the SKU is restricted.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Get the restrictionInfo property: The information about the restriction where the SKU cannot be used.
     *
     * @return the restrictionInfo value.
     */
    public ResourceSkuRestrictionInfo restrictionInfo() {
        return this.restrictionInfo;
    }

    /**
     * Get the reasonCode property: The reason for restriction.
     *
     * @return the reasonCode value.
     */
    public ResourceSkuRestrictionsReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restrictionInfo() != null) {
            restrictionInfo().validate();
        }
    }
}
