// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A recoverable server resource. */
@Immutable
public final class RecoverableServerResourceInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private RecoverableServerProperties innerProperties;

    /** Creates an instance of RecoverableServerResourceInner class. */
    public RecoverableServerResourceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private RecoverableServerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the lastAvailableBackupDateTime property: The last available backup date time.
     *
     * @return the lastAvailableBackupDateTime value.
     */
    public String lastAvailableBackupDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastAvailableBackupDateTime();
    }

    /**
     * Get the serviceLevelObjective property: The service level objective.
     *
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevelObjective();
    }

    /**
     * Get the edition property: Edition of the performance tier.
     *
     * @return the edition value.
     */
    public String edition() {
        return this.innerProperties() == null ? null : this.innerProperties().edition();
    }

    /**
     * Get the vCore property: vCore associated with the service level objective.
     *
     * @return the vCore value.
     */
    public Integer vCore() {
        return this.innerProperties() == null ? null : this.innerProperties().vCore();
    }

    /**
     * Get the hardwareGeneration property: Hardware generation associated with the service level objective.
     *
     * @return the hardwareGeneration value.
     */
    public String hardwareGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareGeneration();
    }

    /**
     * Get the version property: The MySQL version.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
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
