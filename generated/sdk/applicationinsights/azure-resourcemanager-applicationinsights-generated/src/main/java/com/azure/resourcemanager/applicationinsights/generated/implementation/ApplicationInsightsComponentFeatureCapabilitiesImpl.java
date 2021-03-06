// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentFeatureCapabilitiesInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentFeatureCapabilities;

public final class ApplicationInsightsComponentFeatureCapabilitiesImpl
    implements ApplicationInsightsComponentFeatureCapabilities {
    private ApplicationInsightsComponentFeatureCapabilitiesInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    ApplicationInsightsComponentFeatureCapabilitiesImpl(
        ApplicationInsightsComponentFeatureCapabilitiesInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean supportExportData() {
        return this.innerModel().supportExportData();
    }

    public String burstThrottlePolicy() {
        return this.innerModel().burstThrottlePolicy();
    }

    public String metadataClass() {
        return this.innerModel().metadataClass();
    }

    public Boolean liveStreamMetrics() {
        return this.innerModel().liveStreamMetrics();
    }

    public Boolean applicationMap() {
        return this.innerModel().applicationMap();
    }

    public Boolean workItemIntegration() {
        return this.innerModel().workItemIntegration();
    }

    public Boolean powerBIIntegration() {
        return this.innerModel().powerBIIntegration();
    }

    public Boolean openSchema() {
        return this.innerModel().openSchema();
    }

    public Boolean proactiveDetection() {
        return this.innerModel().proactiveDetection();
    }

    public Boolean analyticsIntegration() {
        return this.innerModel().analyticsIntegration();
    }

    public Boolean multipleStepWebTest() {
        return this.innerModel().multipleStepWebTest();
    }

    public String apiAccessLevel() {
        return this.innerModel().apiAccessLevel();
    }

    public String trackingType() {
        return this.innerModel().trackingType();
    }

    public Float dailyCap() {
        return this.innerModel().dailyCap();
    }

    public Float dailyCapResetTime() {
        return this.innerModel().dailyCapResetTime();
    }

    public Float throttleRate() {
        return this.innerModel().throttleRate();
    }

    public ApplicationInsightsComponentFeatureCapabilitiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
