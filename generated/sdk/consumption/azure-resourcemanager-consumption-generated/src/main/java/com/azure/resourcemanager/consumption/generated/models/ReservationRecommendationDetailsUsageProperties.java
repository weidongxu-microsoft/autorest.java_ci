// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Details about historical usage data that has been used for computing the recommendation.
 */
@Immutable
public final class ReservationRecommendationDetailsUsageProperties {
    /*
     * The first usage date used for looking back for computing the recommendation.
     */
    @JsonProperty(value = "firstConsumptionDate", access = JsonProperty.Access.WRITE_ONLY)
    private String firstConsumptionDate;

    /*
     * The last usage date used for looking back for computing the recommendation.
     */
    @JsonProperty(value = "lastConsumptionDate", access = JsonProperty.Access.WRITE_ONLY)
    private String lastConsumptionDate;

    /*
     * What the usage data values represent ex: virtual machine instance.
     */
    @JsonProperty(value = "lookBackUnitType", access = JsonProperty.Access.WRITE_ONLY)
    private String lookBackUnitType;

    /*
     * The breakdown of historical resource usage.  The values are in the order of usage between the firstConsumptionDate and the lastConsumptionDate.
     */
    @JsonProperty(value = "usageData", access = JsonProperty.Access.WRITE_ONLY)
    private List<Float> usageData;

    /*
     * The grain of the values represented in the usage data ex: hourly.
     */
    @JsonProperty(value = "usageGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String usageGrain;

    /**
     * Creates an instance of ReservationRecommendationDetailsUsageProperties class.
     */
    public ReservationRecommendationDetailsUsageProperties() {
    }

    /**
     * Get the firstConsumptionDate property: The first usage date used for looking back for computing the recommendation.
     * 
     * @return the firstConsumptionDate value.
     */
    public String firstConsumptionDate() {
        return this.firstConsumptionDate;
    }

    /**
     * Get the lastConsumptionDate property: The last usage date used for looking back for computing the recommendation.
     * 
     * @return the lastConsumptionDate value.
     */
    public String lastConsumptionDate() {
        return this.lastConsumptionDate;
    }

    /**
     * Get the lookBackUnitType property: What the usage data values represent ex: virtual machine instance.
     * 
     * @return the lookBackUnitType value.
     */
    public String lookBackUnitType() {
        return this.lookBackUnitType;
    }

    /**
     * Get the usageData property: The breakdown of historical resource usage.  The values are in the order of usage between the firstConsumptionDate and the lastConsumptionDate.
     * 
     * @return the usageData value.
     */
    public List<Float> usageData() {
        return this.usageData;
    }

    /**
     * Get the usageGrain property: The grain of the values represented in the usage data ex: hourly.
     * 
     * @return the usageGrain value.
     */
    public String usageGrain() {
        return this.usageGrain;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
