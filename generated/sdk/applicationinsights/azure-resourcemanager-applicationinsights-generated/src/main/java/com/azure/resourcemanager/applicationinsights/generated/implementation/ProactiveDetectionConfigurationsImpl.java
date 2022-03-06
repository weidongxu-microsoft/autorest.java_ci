// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.ProactiveDetectionConfigurationsClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentProactiveDetectionConfigurationInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentProactiveDetectionConfiguration;
import com.azure.resourcemanager.applicationinsights.generated.models.ProactiveDetectionConfigurations;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ProactiveDetectionConfigurationsImpl implements ProactiveDetectionConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(ProactiveDetectionConfigurationsImpl.class);

    private final ProactiveDetectionConfigurationsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public ProactiveDetectionConfigurationsImpl(
        ProactiveDetectionConfigurationsClient innerClient,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public List<ApplicationInsightsComponentProactiveDetectionConfiguration> list(
        String resourceGroupName, String resourceName) {
        List<ApplicationInsightsComponentProactiveDetectionConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(
                            inner1 ->
                                new ApplicationInsightsComponentProactiveDetectionConfigurationImpl(
                                    inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<ApplicationInsightsComponentProactiveDetectionConfiguration>> listWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> inner =
            this.serviceClient().listWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(
                        inner1 ->
                            new ApplicationInsightsComponentProactiveDetectionConfigurationImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public ApplicationInsightsComponentProactiveDetectionConfiguration get(
        String resourceGroupName, String resourceName, String configurationId) {
        ApplicationInsightsComponentProactiveDetectionConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, resourceName, configurationId);
        if (inner != null) {
            return new ApplicationInsightsComponentProactiveDetectionConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentProactiveDetectionConfiguration> getWithResponse(
        String resourceGroupName, String resourceName, String configurationId, Context context) {
        Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, configurationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentProactiveDetectionConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationInsightsComponentProactiveDetectionConfiguration update(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties) {
        ApplicationInsightsComponentProactiveDetectionConfigurationInner inner =
            this.serviceClient().update(resourceGroupName, resourceName, configurationId, proactiveDetectionProperties);
        if (inner != null) {
            return new ApplicationInsightsComponentProactiveDetectionConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentProactiveDetectionConfiguration> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties,
        Context context) {
        Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner> inner =
            this
                .serviceClient()
                .updateWithResponse(
                    resourceGroupName, resourceName, configurationId, proactiveDetectionProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentProactiveDetectionConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProactiveDetectionConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
