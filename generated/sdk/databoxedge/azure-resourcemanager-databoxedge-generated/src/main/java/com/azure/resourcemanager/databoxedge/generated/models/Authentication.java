// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authentication mechanism for IoT devices. */
@Fluent
public final class Authentication {
    /*
     * Symmetric key for authentication.
     */
    @JsonProperty(value = "symmetricKey")
    private SymmetricKey symmetricKey;

    /**
     * Get the symmetricKey property: Symmetric key for authentication.
     *
     * @return the symmetricKey value.
     */
    public SymmetricKey symmetricKey() {
        return this.symmetricKey;
    }

    /**
     * Set the symmetricKey property: Symmetric key for authentication.
     *
     * @param symmetricKey the symmetricKey value to set.
     * @return the Authentication object itself.
     */
    public Authentication withSymmetricKey(SymmetricKey symmetricKey) {
        this.symmetricKey = symmetricKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (symmetricKey() != null) {
            symmetricKey().validate();
        }
    }
}
