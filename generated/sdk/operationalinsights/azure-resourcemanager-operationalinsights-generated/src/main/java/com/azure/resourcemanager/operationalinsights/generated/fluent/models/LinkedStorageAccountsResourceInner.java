// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.models.DataSourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Linked storage accounts top level resource container. */
@Fluent
public final class LinkedStorageAccountsResourceInner extends ProxyResource {
    /*
     * Linked storage accounts properties.
     */
    @JsonProperty(value = "properties", required = true)
    private LinkedStorageAccountsProperties innerProperties = new LinkedStorageAccountsProperties();

    /** Creates an instance of LinkedStorageAccountsResourceInner class. */
    public LinkedStorageAccountsResourceInner() {
    }

    /**
     * Get the innerProperties property: Linked storage accounts properties.
     *
     * @return the innerProperties value.
     */
    private LinkedStorageAccountsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the dataSourceType property: Linked storage accounts type.
     *
     * @return the dataSourceType value.
     */
    public DataSourceType dataSourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().dataSourceType();
    }

    /**
     * Get the storageAccountIds property: Linked storage accounts resources ids.
     *
     * @return the storageAccountIds value.
     */
    public List<String> storageAccountIds() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountIds();
    }

    /**
     * Set the storageAccountIds property: Linked storage accounts resources ids.
     *
     * @param storageAccountIds the storageAccountIds value to set.
     * @return the LinkedStorageAccountsResourceInner object itself.
     */
    public LinkedStorageAccountsResourceInner withStorageAccountIds(List<String> storageAccountIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkedStorageAccountsProperties();
        }
        this.innerProperties().withStorageAccountIds(storageAccountIds);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model LinkedStorageAccountsResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LinkedStorageAccountsResourceInner.class);
}
