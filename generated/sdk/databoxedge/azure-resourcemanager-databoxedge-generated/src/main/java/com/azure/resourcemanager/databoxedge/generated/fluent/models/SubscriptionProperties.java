// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.SubscriptionRegisteredFeatures;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SubscriptionProperties model. */
@Fluent
public final class SubscriptionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionProperties.class);

    /*
     * The tenantId property.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The locationPlacementId property.
     */
    @JsonProperty(value = "locationPlacementId")
    private String locationPlacementId;

    /*
     * The quotaId property.
     */
    @JsonProperty(value = "quotaId")
    private String quotaId;

    /*
     * The serializedDetails property.
     */
    @JsonProperty(value = "serializedDetails")
    private String serializedDetails;

    /*
     * The registeredFeatures property.
     */
    @JsonProperty(value = "registeredFeatures")
    private List<SubscriptionRegisteredFeatures> registeredFeatures;

    /**
     * Get the tenantId property: The tenantId property.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId property.
     *
     * @param tenantId the tenantId value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the locationPlacementId property: The locationPlacementId property.
     *
     * @return the locationPlacementId value.
     */
    public String locationPlacementId() {
        return this.locationPlacementId;
    }

    /**
     * Set the locationPlacementId property: The locationPlacementId property.
     *
     * @param locationPlacementId the locationPlacementId value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withLocationPlacementId(String locationPlacementId) {
        this.locationPlacementId = locationPlacementId;
        return this;
    }

    /**
     * Get the quotaId property: The quotaId property.
     *
     * @return the quotaId value.
     */
    public String quotaId() {
        return this.quotaId;
    }

    /**
     * Set the quotaId property: The quotaId property.
     *
     * @param quotaId the quotaId value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /**
     * Get the serializedDetails property: The serializedDetails property.
     *
     * @return the serializedDetails value.
     */
    public String serializedDetails() {
        return this.serializedDetails;
    }

    /**
     * Set the serializedDetails property: The serializedDetails property.
     *
     * @param serializedDetails the serializedDetails value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withSerializedDetails(String serializedDetails) {
        this.serializedDetails = serializedDetails;
        return this;
    }

    /**
     * Get the registeredFeatures property: The registeredFeatures property.
     *
     * @return the registeredFeatures value.
     */
    public List<SubscriptionRegisteredFeatures> registeredFeatures() {
        return this.registeredFeatures;
    }

    /**
     * Set the registeredFeatures property: The registeredFeatures property.
     *
     * @param registeredFeatures the registeredFeatures value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withRegisteredFeatures(List<SubscriptionRegisteredFeatures> registeredFeatures) {
        this.registeredFeatures = registeredFeatures;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registeredFeatures() != null) {
            registeredFeatures().forEach(e -> e.validate());
        }
    }
}
