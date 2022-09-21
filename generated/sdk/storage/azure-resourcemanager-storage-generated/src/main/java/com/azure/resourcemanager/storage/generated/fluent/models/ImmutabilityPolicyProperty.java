// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicyState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an ImmutabilityPolicy of a blob container. */
@Fluent
public final class ImmutabilityPolicyProperty {
    /*
     * The immutability period for the blobs in the container since the policy creation, in days.
     */
    @JsonProperty(value = "immutabilityPeriodSinceCreationInDays")
    private Integer immutabilityPeriodSinceCreationInDays;

    /*
     * The ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyState state;

    /*
     * This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be
     * written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added
     * and any existing blocks cannot be modified or deleted. This property cannot be changed with
     * ExtendImmutabilityPolicy API.
     */
    @JsonProperty(value = "allowProtectedAppendWrites")
    private Boolean allowProtectedAppendWrites;

    /*
     * This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be
     * written to both 'Append and Bock Blobs' while maintaining immutability protection and compliance. Only new
     * blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with
     * ExtendImmutabilityPolicy API. The 'allowProtectedAppendWrites' and 'allowProtectedAppendWritesAll' properties
     * are mutually exclusive.
     */
    @JsonProperty(value = "allowProtectedAppendWritesAll")
    private Boolean allowProtectedAppendWritesAll;

    /** Creates an instance of ImmutabilityPolicyProperty class. */
    public ImmutabilityPolicyProperty() {
    }

    /**
     * Get the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Set the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set.
     * @return the ImmutabilityPolicyProperty object itself.
     */
    public ImmutabilityPolicyProperty withImmutabilityPeriodSinceCreationInDays(
        Integer immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        return this;
    }

    /**
     * Get the state property: The ImmutabilityPolicy state of a blob container, possible values include: Locked and
     * Unlocked.
     *
     * @return the state value.
     */
    public ImmutabilityPolicyState state() {
        return this.state;
    }

    /**
     * Get the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @return the allowProtectedAppendWrites value.
     */
    public Boolean allowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    /**
     * Set the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @param allowProtectedAppendWrites the allowProtectedAppendWrites value to set.
     * @return the ImmutabilityPolicyProperty object itself.
     */
    public ImmutabilityPolicyProperty withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites = allowProtectedAppendWrites;
        return this;
    }

    /**
     * Get the allowProtectedAppendWritesAll property: This property can only be changed for unlocked time-based
     * retention policies. When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted. This property cannot be changed with ExtendImmutabilityPolicy API. The 'allowProtectedAppendWrites'
     * and 'allowProtectedAppendWritesAll' properties are mutually exclusive.
     *
     * @return the allowProtectedAppendWritesAll value.
     */
    public Boolean allowProtectedAppendWritesAll() {
        return this.allowProtectedAppendWritesAll;
    }

    /**
     * Set the allowProtectedAppendWritesAll property: This property can only be changed for unlocked time-based
     * retention policies. When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining
     * immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified
     * or deleted. This property cannot be changed with ExtendImmutabilityPolicy API. The 'allowProtectedAppendWrites'
     * and 'allowProtectedAppendWritesAll' properties are mutually exclusive.
     *
     * @param allowProtectedAppendWritesAll the allowProtectedAppendWritesAll value to set.
     * @return the ImmutabilityPolicyProperty object itself.
     */
    public ImmutabilityPolicyProperty withAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        this.allowProtectedAppendWritesAll = allowProtectedAppendWritesAll;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
