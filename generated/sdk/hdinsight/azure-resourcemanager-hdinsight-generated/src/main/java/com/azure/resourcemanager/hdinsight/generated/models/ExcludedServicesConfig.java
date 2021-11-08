// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration that services will be excluded when creating cluster. */
@Fluent
public final class ExcludedServicesConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExcludedServicesConfig.class);

    /*
     * The config id of excluded services.
     */
    @JsonProperty(value = "excludedServicesConfigId")
    private String excludedServicesConfigId;

    /*
     * The list of excluded services.
     */
    @JsonProperty(value = "excludedServicesList")
    private String excludedServicesList;

    /**
     * Get the excludedServicesConfigId property: The config id of excluded services.
     *
     * @return the excludedServicesConfigId value.
     */
    public String excludedServicesConfigId() {
        return this.excludedServicesConfigId;
    }

    /**
     * Set the excludedServicesConfigId property: The config id of excluded services.
     *
     * @param excludedServicesConfigId the excludedServicesConfigId value to set.
     * @return the ExcludedServicesConfig object itself.
     */
    public ExcludedServicesConfig withExcludedServicesConfigId(String excludedServicesConfigId) {
        this.excludedServicesConfigId = excludedServicesConfigId;
        return this;
    }

    /**
     * Get the excludedServicesList property: The list of excluded services.
     *
     * @return the excludedServicesList value.
     */
    public String excludedServicesList() {
        return this.excludedServicesList;
    }

    /**
     * Set the excludedServicesList property: The list of excluded services.
     *
     * @param excludedServicesList the excludedServicesList value to set.
     * @return the ExcludedServicesConfig object itself.
     */
    public ExcludedServicesConfig withExcludedServicesList(String excludedServicesList) {
        this.excludedServicesList = excludedServicesList;
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
