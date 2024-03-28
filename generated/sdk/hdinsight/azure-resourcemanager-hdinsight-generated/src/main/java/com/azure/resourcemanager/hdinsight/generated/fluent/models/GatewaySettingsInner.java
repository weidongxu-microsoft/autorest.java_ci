// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gateway settings.
 */
@Immutable
public final class GatewaySettingsInner {
    /*
     * Indicates whether or not the gateway settings based authorization is enabled.
     */
    @JsonProperty(value = "restAuthCredential.isEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private String isCredentialEnabled;

    /*
     * The gateway settings user name.
     */
    @JsonProperty(value = "restAuthCredential.username", access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    /*
     * The gateway settings user password.
     */
    @JsonProperty(value = "restAuthCredential.password", access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /**
     * Creates an instance of GatewaySettingsInner class.
     */
    public GatewaySettingsInner() {
    }

    /**
     * Get the isCredentialEnabled property: Indicates whether or not the gateway settings based authorization is
     * enabled.
     * 
     * @return the isCredentialEnabled value.
     */
    public String isCredentialEnabled() {
        return this.isCredentialEnabled;
    }

    /**
     * Get the username property: The gateway settings user name.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Get the password property: The gateway settings user password.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
