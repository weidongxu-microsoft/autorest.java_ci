// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a properties of a cluster that is part of a migration. */
@Immutable
public final class MigrationClusterProperties {
    /*
     * The resource ID of the cluster.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The public URL of the cluster.
     */
    @JsonProperty(value = "uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * The public data ingestion URL of the cluster.
     */
    @JsonProperty(value = "dataIngestionUri", access = JsonProperty.Access.WRITE_ONLY)
    private String dataIngestionUri;

    /*
     * The role of the cluster in the migration process.
     */
    @JsonProperty(value = "role", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationClusterRole role;

    /** Creates an instance of MigrationClusterProperties class. */
    public MigrationClusterProperties() {
    }

    /**
     * Get the id property: The resource ID of the cluster.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the uri property: The public URL of the cluster.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get the dataIngestionUri property: The public data ingestion URL of the cluster.
     *
     * @return the dataIngestionUri value.
     */
    public String dataIngestionUri() {
        return this.dataIngestionUri;
    }

    /**
     * Get the role property: The role of the cluster in the migration process.
     *
     * @return the role value.
     */
    public MigrationClusterRole role() {
        return this.role;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}