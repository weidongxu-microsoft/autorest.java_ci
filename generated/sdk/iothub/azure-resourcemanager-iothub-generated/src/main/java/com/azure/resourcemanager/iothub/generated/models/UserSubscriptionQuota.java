// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User subscription quota response.
 */
@Fluent
public final class UserSubscriptionQuota {
    /*
     * IotHub type id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Response type
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Unit of IotHub type
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Current number of IotHub type
     */
    @JsonProperty(value = "currentValue")
    private Integer currentValue;

    /*
     * Numerical limit on IotHub type
     */
    @JsonProperty(value = "limit")
    private Integer limit;

    /*
     * IotHub type
     */
    @JsonProperty(value = "name")
    private Name name;

    /**
     * Creates an instance of UserSubscriptionQuota class.
     */
    public UserSubscriptionQuota() {
    }

    /**
     * Get the id property: IotHub type id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: IotHub type id.
     * 
     * @param id the id value to set.
     * @return the UserSubscriptionQuota object itself.
     */
    public UserSubscriptionQuota withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Response type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Response type.
     * 
     * @param type the type value to set.
     * @return the UserSubscriptionQuota object itself.
     */
    public UserSubscriptionQuota withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the unit property: Unit of IotHub type.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Unit of IotHub type.
     * 
     * @param unit the unit value to set.
     * @return the UserSubscriptionQuota object itself.
     */
    public UserSubscriptionQuota withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue property: Current number of IotHub type.
     * 
     * @return the currentValue value.
     */
    public Integer currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: Current number of IotHub type.
     * 
     * @param currentValue the currentValue value to set.
     * @return the UserSubscriptionQuota object itself.
     */
    public UserSubscriptionQuota withCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: Numerical limit on IotHub type.
     * 
     * @return the limit value.
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Set the limit property: Numerical limit on IotHub type.
     * 
     * @param limit the limit value to set.
     * @return the UserSubscriptionQuota object itself.
     */
    public UserSubscriptionQuota withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: IotHub type.
     * 
     * @return the name value.
     */
    public Name name() {
        return this.name;
    }

    /**
     * Set the name property: IotHub type.
     * 
     * @param name the name value to set.
     * @return the UserSubscriptionQuota object itself.
     */
    public UserSubscriptionQuota withName(Name name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
