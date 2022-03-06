// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.commerce.generated.models.InfoField;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Describes a sample of the usageAggregation. */
@Fluent
public final class UsageSample {
    /*
     * The subscription identifier for the Azure user.
     */
    @JsonProperty(value = "subscriptionId")
    private UUID subscriptionId;

    /*
     * Unique ID for the resource that was consumed (aka ResourceID).
     */
    @JsonProperty(value = "meterId")
    private String meterId;

    /*
     * UTC start time for the usage bucket to which this usage aggregate
     * belongs.
     */
    @JsonProperty(value = "usageStartTime")
    private OffsetDateTime usageStartTime;

    /*
     * UTC end time for the usage bucket to which this usage aggregate belongs.
     */
    @JsonProperty(value = "usageEndTime")
    private OffsetDateTime usageEndTime;

    /*
     * The amount of the resource consumption that occurred in this time frame.
     */
    @JsonProperty(value = "quantity")
    private Float quantity;

    /*
     * The unit in which the usage for this resource is being counted, e.g.
     * Hours, GB.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Friendly name of the resource being consumed.
     */
    @JsonProperty(value = "meterName")
    private String meterName;

    /*
     * Category of the consumed resource.
     */
    @JsonProperty(value = "meterCategory")
    private String meterCategory;

    /*
     * Sub-category of the consumed resource.
     */
    @JsonProperty(value = "meterSubCategory")
    private String meterSubCategory;

    /*
     * Region of the meterId used for billing purposes
     */
    @JsonProperty(value = "meterRegion")
    private String meterRegion;

    /*
     * Key-value pairs of instance details (legacy format).
     */
    @JsonProperty(value = "infoFields")
    private InfoField infoFields;

    /*
     * Key-value pairs of instance details represented as a string.
     */
    @JsonProperty(value = "instanceData")
    private String instanceData;

    /**
     * Get the subscriptionId property: The subscription identifier for the Azure user.
     *
     * @return the subscriptionId value.
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription identifier for the Azure user.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the meterId property: Unique ID for the resource that was consumed (aka ResourceID).
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Set the meterId property: Unique ID for the resource that was consumed (aka ResourceID).
     *
     * @param meterId the meterId value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withMeterId(String meterId) {
        this.meterId = meterId;
        return this;
    }

    /**
     * Get the usageStartTime property: UTC start time for the usage bucket to which this usage aggregate belongs.
     *
     * @return the usageStartTime value.
     */
    public OffsetDateTime usageStartTime() {
        return this.usageStartTime;
    }

    /**
     * Set the usageStartTime property: UTC start time for the usage bucket to which this usage aggregate belongs.
     *
     * @param usageStartTime the usageStartTime value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withUsageStartTime(OffsetDateTime usageStartTime) {
        this.usageStartTime = usageStartTime;
        return this;
    }

    /**
     * Get the usageEndTime property: UTC end time for the usage bucket to which this usage aggregate belongs.
     *
     * @return the usageEndTime value.
     */
    public OffsetDateTime usageEndTime() {
        return this.usageEndTime;
    }

    /**
     * Set the usageEndTime property: UTC end time for the usage bucket to which this usage aggregate belongs.
     *
     * @param usageEndTime the usageEndTime value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withUsageEndTime(OffsetDateTime usageEndTime) {
        this.usageEndTime = usageEndTime;
        return this;
    }

    /**
     * Get the quantity property: The amount of the resource consumption that occurred in this time frame.
     *
     * @return the quantity value.
     */
    public Float quantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The amount of the resource consumption that occurred in this time frame.
     *
     * @param quantity the quantity value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withQuantity(Float quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the unit property: The unit in which the usage for this resource is being counted, e.g. Hours, GB.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit in which the usage for this resource is being counted, e.g. Hours, GB.
     *
     * @param unit the unit value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the meterName property: Friendly name of the resource being consumed.
     *
     * @return the meterName value.
     */
    public String meterName() {
        return this.meterName;
    }

    /**
     * Set the meterName property: Friendly name of the resource being consumed.
     *
     * @param meterName the meterName value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withMeterName(String meterName) {
        this.meterName = meterName;
        return this;
    }

    /**
     * Get the meterCategory property: Category of the consumed resource.
     *
     * @return the meterCategory value.
     */
    public String meterCategory() {
        return this.meterCategory;
    }

    /**
     * Set the meterCategory property: Category of the consumed resource.
     *
     * @param meterCategory the meterCategory value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withMeterCategory(String meterCategory) {
        this.meterCategory = meterCategory;
        return this;
    }

    /**
     * Get the meterSubCategory property: Sub-category of the consumed resource.
     *
     * @return the meterSubCategory value.
     */
    public String meterSubCategory() {
        return this.meterSubCategory;
    }

    /**
     * Set the meterSubCategory property: Sub-category of the consumed resource.
     *
     * @param meterSubCategory the meterSubCategory value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withMeterSubCategory(String meterSubCategory) {
        this.meterSubCategory = meterSubCategory;
        return this;
    }

    /**
     * Get the meterRegion property: Region of the meterId used for billing purposes.
     *
     * @return the meterRegion value.
     */
    public String meterRegion() {
        return this.meterRegion;
    }

    /**
     * Set the meterRegion property: Region of the meterId used for billing purposes.
     *
     * @param meterRegion the meterRegion value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withMeterRegion(String meterRegion) {
        this.meterRegion = meterRegion;
        return this;
    }

    /**
     * Get the infoFields property: Key-value pairs of instance details (legacy format).
     *
     * @return the infoFields value.
     */
    public InfoField infoFields() {
        return this.infoFields;
    }

    /**
     * Set the infoFields property: Key-value pairs of instance details (legacy format).
     *
     * @param infoFields the infoFields value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withInfoFields(InfoField infoFields) {
        this.infoFields = infoFields;
        return this;
    }

    /**
     * Get the instanceData property: Key-value pairs of instance details represented as a string.
     *
     * @return the instanceData value.
     */
    public String instanceData() {
        return this.instanceData;
    }

    /**
     * Set the instanceData property: Key-value pairs of instance details represented as a string.
     *
     * @param instanceData the instanceData value to set.
     * @return the UsageSample object itself.
     */
    public UsageSample withInstanceData(String instanceData) {
        this.instanceData = instanceData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (infoFields() != null) {
            infoFields().validate();
        }
    }
}
