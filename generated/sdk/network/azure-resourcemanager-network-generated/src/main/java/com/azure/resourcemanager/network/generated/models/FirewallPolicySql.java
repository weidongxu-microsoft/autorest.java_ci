// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SQL Settings in Firewall Policy.
 */
@Fluent
public final class FirewallPolicySql {
    /*
     * A flag to indicate if SQL Redirect traffic filtering is enabled. Turning on the flag requires no rule using port 11000-11999.
     */
    @JsonProperty(value = "allowSqlRedirect")
    private Boolean allowSqlRedirect;

    /**
     * Creates an instance of FirewallPolicySql class.
     */
    public FirewallPolicySql() {
    }

    /**
     * Get the allowSqlRedirect property: A flag to indicate if SQL Redirect traffic filtering is enabled. Turning on
     * the flag requires no rule using port 11000-11999.
     * 
     * @return the allowSqlRedirect value.
     */
    public Boolean allowSqlRedirect() {
        return this.allowSqlRedirect;
    }

    /**
     * Set the allowSqlRedirect property: A flag to indicate if SQL Redirect traffic filtering is enabled. Turning on
     * the flag requires no rule using port 11000-11999.
     * 
     * @param allowSqlRedirect the allowSqlRedirect value to set.
     * @return the FirewallPolicySql object itself.
     */
    public FirewallPolicySql withAllowSqlRedirect(Boolean allowSqlRedirect) {
        this.allowSqlRedirect = allowSqlRedirect;
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
