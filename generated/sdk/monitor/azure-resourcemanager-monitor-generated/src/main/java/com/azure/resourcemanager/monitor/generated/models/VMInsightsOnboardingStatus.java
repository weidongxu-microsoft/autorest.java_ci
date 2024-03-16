// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.resourcemanager.monitor.generated.fluent.models.VMInsightsOnboardingStatusInner;
import java.util.List;

/**
 * An immutable client-side representation of VMInsightsOnboardingStatus.
 */
public interface VMInsightsOnboardingStatus {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the resourceId property: Azure Resource Manager identifier of the resource whose onboarding status is being represented.
     * 
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the onboardingStatus property: The onboarding status for the resource. Note that, a higher level scope, e.g., resource group or subscription, is considered onboarded if at least one resource under it is onboarded.
     * 
     * @return the onboardingStatus value.
     */
    OnboardingStatus onboardingStatus();

    /**
     * Gets the dataStatus property: The status of VM Insights data from the resource. When reported as `present` the data array will contain information about the data containers to which data for the specified resource is being routed.
     * 
     * @return the dataStatus value.
     */
    DataStatus dataStatus();

    /**
     * Gets the data property: Containers that currently store VM Insights data for the specified resource.
     * 
     * @return the data value.
     */
    List<DataContainer> data();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.VMInsightsOnboardingStatusInner object.
     * 
     * @return the inner object.
     */
    VMInsightsOnboardingStatusInner innerModel();
}
