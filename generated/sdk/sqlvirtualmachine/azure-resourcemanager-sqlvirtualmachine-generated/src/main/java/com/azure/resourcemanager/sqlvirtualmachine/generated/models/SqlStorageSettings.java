// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Set disk storage settings for SQL Server. */
@Fluent
public final class SqlStorageSettings {
    /*
     * Logical Unit Numbers for the disks.
     */
    @JsonProperty(value = "luns")
    private List<Integer> luns;

    /*
     * SQL Server default file path
     */
    @JsonProperty(value = "defaultFilePath")
    private String defaultFilePath;

    /*
     * Use storage pool to build a drive if true or not provided
     */
    @JsonProperty(value = "useStoragePool")
    private Boolean useStoragePool;

    /** Creates an instance of SqlStorageSettings class. */
    public SqlStorageSettings() {
    }

    /**
     * Get the luns property: Logical Unit Numbers for the disks.
     *
     * @return the luns value.
     */
    public List<Integer> luns() {
        return this.luns;
    }

    /**
     * Set the luns property: Logical Unit Numbers for the disks.
     *
     * @param luns the luns value to set.
     * @return the SqlStorageSettings object itself.
     */
    public SqlStorageSettings withLuns(List<Integer> luns) {
        this.luns = luns;
        return this;
    }

    /**
     * Get the defaultFilePath property: SQL Server default file path.
     *
     * @return the defaultFilePath value.
     */
    public String defaultFilePath() {
        return this.defaultFilePath;
    }

    /**
     * Set the defaultFilePath property: SQL Server default file path.
     *
     * @param defaultFilePath the defaultFilePath value to set.
     * @return the SqlStorageSettings object itself.
     */
    public SqlStorageSettings withDefaultFilePath(String defaultFilePath) {
        this.defaultFilePath = defaultFilePath;
        return this;
    }

    /**
     * Get the useStoragePool property: Use storage pool to build a drive if true or not provided.
     *
     * @return the useStoragePool value.
     */
    public Boolean useStoragePool() {
        return this.useStoragePool;
    }

    /**
     * Set the useStoragePool property: Use storage pool to build a drive if true or not provided.
     *
     * @param useStoragePool the useStoragePool value to set.
     * @return the SqlStorageSettings object itself.
     */
    public SqlStorageSettings withUseStoragePool(Boolean useStoragePool) {
        this.useStoragePool = useStoragePool;
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
