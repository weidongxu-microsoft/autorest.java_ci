// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.generated.models.CacheItem;
import com.azure.resourcemanager.costmanagement.generated.models.SettingsPropertiesStartOn;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the setting. */
@Fluent
public final class SettingsProperties {
    /*
     * Sets the default scope the current user will see when they sign into Azure Cost Management in the Azure portal.
     */
    @JsonProperty(value = "scope", required = true)
    private String scope;

    /*
     * Indicates what scope Cost Management in the Azure portal should default to. Allowed values: LastUsed.
     */
    @JsonProperty(value = "startOn")
    private SettingsPropertiesStartOn startOn;

    /*
     * Array of scopes with additional details used by Cost Management in the Azure portal.
     */
    @JsonProperty(value = "cache")
    private List<CacheItem> cache;

    /** Creates an instance of SettingsProperties class. */
    public SettingsProperties() {
    }

    /**
     * Get the scope property: Sets the default scope the current user will see when they sign into Azure Cost
     * Management in the Azure portal.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Sets the default scope the current user will see when they sign into Azure Cost
     * Management in the Azure portal.
     *
     * @param scope the scope value to set.
     * @return the SettingsProperties object itself.
     */
    public SettingsProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the startOn property: Indicates what scope Cost Management in the Azure portal should default to. Allowed
     * values: LastUsed.
     *
     * @return the startOn value.
     */
    public SettingsPropertiesStartOn startOn() {
        return this.startOn;
    }

    /**
     * Set the startOn property: Indicates what scope Cost Management in the Azure portal should default to. Allowed
     * values: LastUsed.
     *
     * @param startOn the startOn value to set.
     * @return the SettingsProperties object itself.
     */
    public SettingsProperties withStartOn(SettingsPropertiesStartOn startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Get the cache property: Array of scopes with additional details used by Cost Management in the Azure portal.
     *
     * @return the cache value.
     */
    public List<CacheItem> cache() {
        return this.cache;
    }

    /**
     * Set the cache property: Array of scopes with additional details used by Cost Management in the Azure portal.
     *
     * @param cache the cache value to set.
     * @return the SettingsProperties object itself.
     */
    public SettingsProperties withCache(List<CacheItem> cache) {
        this.cache = cache;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scope() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property scope in model SettingsProperties"));
        }
        if (cache() != null) {
            cache().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SettingsProperties.class);
}
