// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.operationalinsights.generated.models.StorageAccount;
import com.azure.resourcemanager.operationalinsights.generated.models.StorageInsightStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The top level storage insight resource container. */
@Fluent
public final class StorageInsightInner extends ProxyResource {
    /*
     * Storage insight properties.
     */
    @JsonProperty(value = "properties")
    private StorageInsightProperties innerProperties;

    /*
     * The ETag of the storage insight.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: Storage insight properties.
     *
     * @return the innerProperties value.
     */
    private StorageInsightProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: The ETag of the storage insight.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the storage insight.
     *
     * @param etag the etag value to set.
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the containers property: The names of the blob containers that the workspace should read.
     *
     * @return the containers value.
     */
    public List<String> containers() {
        return this.innerProperties() == null ? null : this.innerProperties().containers();
    }

    /**
     * Set the containers property: The names of the blob containers that the workspace should read.
     *
     * @param containers the containers value to set.
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withContainers(List<String> containers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageInsightProperties();
        }
        this.innerProperties().withContainers(containers);
        return this;
    }

    /**
     * Get the tables property: The names of the Azure tables that the workspace should read.
     *
     * @return the tables value.
     */
    public List<String> tables() {
        return this.innerProperties() == null ? null : this.innerProperties().tables();
    }

    /**
     * Set the tables property: The names of the Azure tables that the workspace should read.
     *
     * @param tables the tables value to set.
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withTables(List<String> tables) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageInsightProperties();
        }
        this.innerProperties().withTables(tables);
        return this;
    }

    /**
     * Get the storageAccount property: The storage account connection details.
     *
     * @return the storageAccount value.
     */
    public StorageAccount storageAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccount();
    }

    /**
     * Set the storageAccount property: The storage account connection details.
     *
     * @param storageAccount the storageAccount value to set.
     * @return the StorageInsightInner object itself.
     */
    public StorageInsightInner withStorageAccount(StorageAccount storageAccount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageInsightProperties();
        }
        this.innerProperties().withStorageAccount(storageAccount);
        return this;
    }

    /**
     * Get the status property: The status of the storage insight.
     *
     * @return the status value.
     */
    public StorageInsightStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
