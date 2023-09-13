// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a logFile. */
@Fluent
public final class LogFileInner extends ProxyResource {
    /*
     * The properties of a logFile.
     */
    @JsonProperty(value = "properties")
    private LogFileProperties innerProperties;

    /** Creates an instance of LogFileInner class. */
    public LogFileInner() {
    }

    /**
     * Get the innerProperties property: The properties of a logFile.
     *
     * @return the innerProperties value.
     */
    private LogFileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sizeInKB property: The size in kb of the logFile.
     *
     * @return the sizeInKB value.
     */
    public Long sizeInKB() {
        return this.innerProperties() == null ? null : this.innerProperties().sizeInKB();
    }

    /**
     * Set the sizeInKB property: The size in kb of the logFile.
     *
     * @param sizeInKB the sizeInKB value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withSizeInKB(Long sizeInKB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogFileProperties();
        }
        this.innerProperties().withSizeInKB(sizeInKB);
        return this;
    }

    /**
     * Get the createdTime property: Creation timestamp of the log file.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Set the createdTime property: Creation timestamp of the log file.
     *
     * @param createdTime the createdTime value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withCreatedTime(OffsetDateTime createdTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogFileProperties();
        }
        this.innerProperties().withCreatedTime(createdTime);
        return this;
    }

    /**
     * Get the type property: Type of the log file.
     *
     * @return the type value.
     */
    public String typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Type of the log file.
     *
     * @param type the type value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withTypePropertiesType(String type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogFileProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the lastModifiedTime property: Last modified timestamp of the log file.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Set the lastModifiedTime property: Last modified timestamp of the log file.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogFileProperties();
        }
        this.innerProperties().withLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * Get the url property: The url to download the log file from.
     *
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Set the url property: The url to download the log file from.
     *
     * @param url the url value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withUrl(String url) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogFileProperties();
        }
        this.innerProperties().withUrl(url);
        return this;
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
