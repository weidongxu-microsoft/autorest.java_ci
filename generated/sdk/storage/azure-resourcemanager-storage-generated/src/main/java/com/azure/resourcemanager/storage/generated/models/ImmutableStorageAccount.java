// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This property enables and defines account-level immutability. Enabling the feature auto-enables Blob Versioning.
 */
@Fluent
public final class ImmutableStorageAccount {
    /*
     * A boolean flag which enables account-level immutability. All the containers under such an account have
     * object-level immutability enabled by default.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Specifies the default account-level immutability policy which is inherited and applied to objects that do not
     * possess an explicit immutability policy at the object level. The object-level immutability policy has higher
     * precedence than the container-level immutability policy, which has a higher precedence than the account-level
     * immutability policy.
     */
    @JsonProperty(value = "immutabilityPolicy")
    private AccountImmutabilityPolicyProperties immutabilityPolicy;

    /**
     * Creates an instance of ImmutableStorageAccount class.
     */
    public ImmutableStorageAccount() {
    }

    /**
     * Get the enabled property: A boolean flag which enables account-level immutability. All the containers under such
     * an account have object-level immutability enabled by default.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: A boolean flag which enables account-level immutability. All the containers under such
     * an account have object-level immutability enabled by default.
     * 
     * @param enabled the enabled value to set.
     * @return the ImmutableStorageAccount object itself.
     */
    public ImmutableStorageAccount withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the immutabilityPolicy property: Specifies the default account-level immutability policy which is inherited
     * and applied to objects that do not possess an explicit immutability policy at the object level. The object-level
     * immutability policy has higher precedence than the container-level immutability policy, which has a higher
     * precedence than the account-level immutability policy.
     * 
     * @return the immutabilityPolicy value.
     */
    public AccountImmutabilityPolicyProperties immutabilityPolicy() {
        return this.immutabilityPolicy;
    }

    /**
     * Set the immutabilityPolicy property: Specifies the default account-level immutability policy which is inherited
     * and applied to objects that do not possess an explicit immutability policy at the object level. The object-level
     * immutability policy has higher precedence than the container-level immutability policy, which has a higher
     * precedence than the account-level immutability policy.
     * 
     * @param immutabilityPolicy the immutabilityPolicy value to set.
     * @return the ImmutableStorageAccount object itself.
     */
    public ImmutableStorageAccount withImmutabilityPolicy(AccountImmutabilityPolicyProperties immutabilityPolicy) {
        this.immutabilityPolicy = immutabilityPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (immutabilityPolicy() != null) {
            immutabilityPolicy().validate();
        }
    }
}
