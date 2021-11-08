// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.models.DataSourceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Linked storage accounts properties. */
@Fluent
public final class LinkedStorageAccountsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedStorageAccountsProperties.class);

    /*
     * Linked storage accounts type.
     */
    @JsonProperty(value = "dataSourceType", access = JsonProperty.Access.WRITE_ONLY)
    private DataSourceType dataSourceType;

    /*
     * Linked storage accounts resources ids.
     */
    @JsonProperty(value = "storageAccountIds")
    private List<String> storageAccountIds;

    /**
     * Get the dataSourceType property: Linked storage accounts type.
     *
     * @return the dataSourceType value.
     */
    public DataSourceType dataSourceType() {
        return this.dataSourceType;
    }

    /**
     * Get the storageAccountIds property: Linked storage accounts resources ids.
     *
     * @return the storageAccountIds value.
     */
    public List<String> storageAccountIds() {
        return this.storageAccountIds;
    }

    /**
     * Set the storageAccountIds property: Linked storage accounts resources ids.
     *
     * @param storageAccountIds the storageAccountIds value to set.
     * @return the LinkedStorageAccountsProperties object itself.
     */
    public LinkedStorageAccountsProperties withStorageAccountIds(List<String> storageAccountIds) {
        this.storageAccountIds = storageAccountIds;
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
