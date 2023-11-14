// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentBillingFeaturesInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentBillingFeatures;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentDataVolumeCap;
import java.util.Collections;
import java.util.List;

public final class ApplicationInsightsComponentBillingFeaturesImpl
    implements ApplicationInsightsComponentBillingFeatures {
    private ApplicationInsightsComponentBillingFeaturesInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    ApplicationInsightsComponentBillingFeaturesImpl(ApplicationInsightsComponentBillingFeaturesInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ApplicationInsightsComponentDataVolumeCap dataVolumeCap() {
        return this.innerModel().dataVolumeCap();
    }

    public List<String> currentBillingFeatures() {
        List<String> inner = this.innerModel().currentBillingFeatures();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationInsightsComponentBillingFeaturesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
