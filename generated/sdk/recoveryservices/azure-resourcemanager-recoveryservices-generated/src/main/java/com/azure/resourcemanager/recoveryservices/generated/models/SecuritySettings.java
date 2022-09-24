// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Security Settings of the vault. */
@Fluent
public final class SecuritySettings {
    /*
     * Immutability Settings of a vault
     */
    @JsonProperty(value = "immutabilitySettings")
    private ImmutabilitySettings immutabilitySettings;

    /** Creates an instance of SecuritySettings class. */
    public SecuritySettings() {
    }

    /**
     * Get the immutabilitySettings property: Immutability Settings of a vault.
     *
     * @return the immutabilitySettings value.
     */
    public ImmutabilitySettings immutabilitySettings() {
        return this.immutabilitySettings;
    }

    /**
     * Set the immutabilitySettings property: Immutability Settings of a vault.
     *
     * @param immutabilitySettings the immutabilitySettings value to set.
     * @return the SecuritySettings object itself.
     */
    public SecuritySettings withImmutabilitySettings(ImmutabilitySettings immutabilitySettings) {
        this.immutabilitySettings = immutabilitySettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (immutabilitySettings() != null) {
            immutabilitySettings().validate();
        }
    }
}