// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The recoverable server's properties. */
@Immutable
public final class RecoverableServerProperties {
    /*
     * The last available backup date time.
     */
    @JsonProperty(value = "lastAvailableBackupDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastAvailableBackupDateTime;

    /*
     * The service level objective
     */
    @JsonProperty(value = "serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /*
     * Edition of the performance tier.
     */
    @JsonProperty(value = "edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /*
     * vCore associated with the service level objective
     */
    @JsonProperty(value = "vCore", access = JsonProperty.Access.WRITE_ONLY)
    private Integer vCore;

    /*
     * Hardware generation associated with the service level objective
     */
    @JsonProperty(value = "hardwareGeneration", access = JsonProperty.Access.WRITE_ONLY)
    private String hardwareGeneration;

    /*
     * The PostgreSQL version
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /** Creates an instance of RecoverableServerProperties class. */
    public RecoverableServerProperties() {
    }

    /**
     * Get the lastAvailableBackupDateTime property: The last available backup date time.
     *
     * @return the lastAvailableBackupDateTime value.
     */
    public String lastAvailableBackupDateTime() {
        return this.lastAvailableBackupDateTime;
    }

    /**
     * Get the serviceLevelObjective property: The service level objective.
     *
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the edition property: Edition of the performance tier.
     *
     * @return the edition value.
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the vCore property: vCore associated with the service level objective.
     *
     * @return the vCore value.
     */
    public Integer vCore() {
        return this.vCore;
    }

    /**
     * Get the hardwareGeneration property: Hardware generation associated with the service level objective.
     *
     * @return the hardwareGeneration value.
     */
    public String hardwareGeneration() {
        return this.hardwareGeneration;
    }

    /**
     * Get the version property: The PostgreSQL version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
