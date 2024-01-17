// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.MetricDefinitionsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricDefinitionInner;
import com.azure.resourcemanager.monitor.generated.models.MetricDefinition;
import com.azure.resourcemanager.monitor.generated.models.MetricDefinitions;

public final class MetricDefinitionsImpl implements MetricDefinitions {
    private static final ClientLogger LOGGER = new ClientLogger(MetricDefinitionsImpl.class);

    private final MetricDefinitionsClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public MetricDefinitionsImpl(MetricDefinitionsClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MetricDefinition> list(String resourceUri) {
        PagedIterable<MetricDefinitionInner> inner = this.serviceClient().list(resourceUri);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> list(String resourceUri, String metricnamespace, Context context) {
        PagedIterable<MetricDefinitionInner> inner = this.serviceClient().list(resourceUri, metricnamespace, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    private MetricDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
