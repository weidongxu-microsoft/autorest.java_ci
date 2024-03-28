// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.models.AzureMonitorPrivateLinkScopeInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the list of Azure Monitor PrivateLinkScope resources.
 */
@Fluent
public final class AzureMonitorPrivateLinkScopeListResult {
    /*
     * List of Azure Monitor PrivateLinkScope definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<AzureMonitorPrivateLinkScopeInner> value;

    /*
     * The URI to get the next set of Azure Monitor PrivateLinkScope definitions if too many PrivateLinkScopes where returned in the result set.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of AzureMonitorPrivateLinkScopeListResult class.
     */
    public AzureMonitorPrivateLinkScopeListResult() {
    }

    /**
     * Get the value property: List of Azure Monitor PrivateLinkScope definitions.
     * 
     * @return the value value.
     */
    public List<AzureMonitorPrivateLinkScopeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Azure Monitor PrivateLinkScope definitions.
     * 
     * @param value the value value to set.
     * @return the AzureMonitorPrivateLinkScopeListResult object itself.
     */
    public AzureMonitorPrivateLinkScopeListResult withValue(List<AzureMonitorPrivateLinkScopeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of Azure Monitor PrivateLinkScope definitions if too many
     * PrivateLinkScopes where returned in the result set.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to get the next set of Azure Monitor PrivateLinkScope definitions if too many
     * PrivateLinkScopes where returned in the result set.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AzureMonitorPrivateLinkScopeListResult object itself.
     */
    public AzureMonitorPrivateLinkScopeListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model AzureMonitorPrivateLinkScopeListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureMonitorPrivateLinkScopeListResult.class);
}
