// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentAvailableFeaturesInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentAvailableFeatures;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentFeature;
import java.util.Collections;
import java.util.List;

public final class ApplicationInsightsComponentAvailableFeaturesImpl
    implements ApplicationInsightsComponentAvailableFeatures {
    private ApplicationInsightsComponentAvailableFeaturesInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    ApplicationInsightsComponentAvailableFeaturesImpl(ApplicationInsightsComponentAvailableFeaturesInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ApplicationInsightsComponentFeature> result() {
        List<ApplicationInsightsComponentFeature> inner = this.innerModel().result();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationInsightsComponentAvailableFeaturesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
