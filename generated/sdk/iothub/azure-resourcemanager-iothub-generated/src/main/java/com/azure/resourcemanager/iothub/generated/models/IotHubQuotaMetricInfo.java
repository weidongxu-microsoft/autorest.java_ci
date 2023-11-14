// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.resourcemanager.iothub.generated.fluent.models.IotHubQuotaMetricInfoInner;

/**
 * An immutable client-side representation of IotHubQuotaMetricInfo.
 */
public interface IotHubQuotaMetricInfo {
    /**
     * Gets the name property: The name of the quota metric.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the currentValue property: The current value for the quota metric.
     * 
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the maxValue property: The maximum value of the quota metric.
     * 
     * @return the maxValue value.
     */
    Long maxValue();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.generated.fluent.models.IotHubQuotaMetricInfoInner object.
     * 
     * @return the inner object.
     */
    IotHubQuotaMetricInfoInner innerModel();
}
