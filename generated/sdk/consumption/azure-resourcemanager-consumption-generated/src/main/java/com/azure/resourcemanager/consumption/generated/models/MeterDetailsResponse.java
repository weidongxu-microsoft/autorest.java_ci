// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the meter detail. */
@Immutable
public final class MeterDetailsResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MeterDetailsResponse.class);

    /*
     * The name of the meter, within the given meter category
     */
    @JsonProperty(value = "meterName", access = JsonProperty.Access.WRITE_ONLY)
    private String meterName;

    /*
     * The category of the meter, for example, 'Cloud services', 'Networking',
     * etc..
     */
    @JsonProperty(value = "meterCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterCategory;

    /*
     * The subcategory of the meter, for example, 'A6 Cloud services',
     * 'ExpressRoute (IXP)', etc..
     */
    @JsonProperty(value = "meterSubCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterSubCategory;

    /*
     * The unit in which the meter consumption is charged, for example,
     * 'Hours', 'GB', etc.
     */
    @JsonProperty(value = "unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /*
     * The service family.
     */
    @JsonProperty(value = "serviceFamily", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceFamily;

    /**
     * Get the meterName property: The name of the meter, within the given meter category.
     *
     * @return the meterName value.
     */
    public String meterName() {
        return this.meterName;
    }

    /**
     * Get the meterCategory property: The category of the meter, for example, 'Cloud services', 'Networking', etc..
     *
     * @return the meterCategory value.
     */
    public String meterCategory() {
        return this.meterCategory;
    }

    /**
     * Get the meterSubCategory property: The subcategory of the meter, for example, 'A6 Cloud services', 'ExpressRoute
     * (IXP)', etc..
     *
     * @return the meterSubCategory value.
     */
    public String meterSubCategory() {
        return this.meterSubCategory;
    }

    /**
     * Get the unitOfMeasure property: The unit in which the meter consumption is charged, for example, 'Hours', 'GB',
     * etc.
     *
     * @return the unitOfMeasure value.
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get the serviceFamily property: The service family.
     *
     * @return the serviceFamily value.
     */
    public String serviceFamily() {
        return this.serviceFamily;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
