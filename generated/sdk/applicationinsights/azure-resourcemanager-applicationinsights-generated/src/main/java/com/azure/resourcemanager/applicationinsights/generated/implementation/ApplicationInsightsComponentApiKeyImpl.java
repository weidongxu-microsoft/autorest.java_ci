// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentApiKeyInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentApiKey;
import java.util.Collections;
import java.util.List;

public final class ApplicationInsightsComponentApiKeyImpl implements ApplicationInsightsComponentApiKey {
    private ApplicationInsightsComponentApiKeyInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    ApplicationInsightsComponentApiKeyImpl(ApplicationInsightsComponentApiKeyInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String apiKey() {
        return this.innerModel().apiKey();
    }

    public String createdDate() {
        return this.innerModel().createdDate();
    }

    public String name() {
        return this.innerModel().name();
    }

    public List<String> linkedReadProperties() {
        List<String> inner = this.innerModel().linkedReadProperties();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> linkedWriteProperties() {
        List<String> inner = this.innerModel().linkedWriteProperties();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationInsightsComponentApiKeyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
