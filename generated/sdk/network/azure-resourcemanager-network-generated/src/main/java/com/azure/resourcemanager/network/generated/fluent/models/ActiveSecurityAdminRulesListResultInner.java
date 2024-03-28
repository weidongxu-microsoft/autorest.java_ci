// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.ActiveBaseSecurityAdminRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list active security admin rules. It contains a list of active security admin rules and a
 * skiptoken to get the next set of results.
 */
@Fluent
public final class ActiveSecurityAdminRulesListResultInner {
    /*
     * Gets a page of active security admin rules.
     */
    @JsonProperty(value = "value")
    private List<ActiveBaseSecurityAdminRule> value;

    /*
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     */
    @JsonProperty(value = "skipToken")
    private String skipToken;

    /**
     * Creates an instance of ActiveSecurityAdminRulesListResultInner class.
     */
    public ActiveSecurityAdminRulesListResultInner() {
    }

    /**
     * Get the value property: Gets a page of active security admin rules.
     * 
     * @return the value value.
     */
    public List<ActiveBaseSecurityAdminRule> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a page of active security admin rules.
     * 
     * @param value the value value to set.
     * @return the ActiveSecurityAdminRulesListResultInner object itself.
     */
    public ActiveSecurityAdminRulesListResultInner withValue(List<ActiveBaseSecurityAdminRule> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     * 
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     * 
     * @param skipToken the skipToken value to set.
     * @return the ActiveSecurityAdminRulesListResultInner object itself.
     */
    public ActiveSecurityAdminRulesListResultInner withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
