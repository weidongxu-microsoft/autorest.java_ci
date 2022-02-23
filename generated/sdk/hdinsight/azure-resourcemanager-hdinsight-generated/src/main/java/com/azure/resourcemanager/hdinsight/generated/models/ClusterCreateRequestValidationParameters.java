// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The cluster create request specification. */
@Fluent
public final class ClusterCreateRequestValidationParameters extends ClusterCreateParametersExtended {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterCreateRequestValidationParameters.class);

    /*
     * The cluster name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The tenant id.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * This indicates whether fetch Aadds resource or not.
     */
    @JsonProperty(value = "fetchAaddsResource")
    private Boolean fetchAaddsResource;

    /**
     * Get the name property: The cluster name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The cluster name.
     *
     * @param name the name value to set.
     * @return the ClusterCreateRequestValidationParameters object itself.
     */
    public ClusterCreateRequestValidationParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type.
     *
     * @param type the type value to set.
     * @return the ClusterCreateRequestValidationParameters object itself.
     */
    public ClusterCreateRequestValidationParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id.
     *
     * @param tenantId the tenantId value to set.
     * @return the ClusterCreateRequestValidationParameters object itself.
     */
    public ClusterCreateRequestValidationParameters withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the fetchAaddsResource property: This indicates whether fetch Aadds resource or not.
     *
     * @return the fetchAaddsResource value.
     */
    public Boolean fetchAaddsResource() {
        return this.fetchAaddsResource;
    }

    /**
     * Set the fetchAaddsResource property: This indicates whether fetch Aadds resource or not.
     *
     * @param fetchAaddsResource the fetchAaddsResource value to set.
     * @return the ClusterCreateRequestValidationParameters object itself.
     */
    public ClusterCreateRequestValidationParameters withFetchAaddsResource(Boolean fetchAaddsResource) {
        this.fetchAaddsResource = fetchAaddsResource;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterCreateRequestValidationParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterCreateRequestValidationParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterCreateRequestValidationParameters withZones(List<String> zones) {
        super.withZones(zones);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterCreateRequestValidationParameters withProperties(ClusterCreateProperties properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterCreateRequestValidationParameters withIdentity(ClusterIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
