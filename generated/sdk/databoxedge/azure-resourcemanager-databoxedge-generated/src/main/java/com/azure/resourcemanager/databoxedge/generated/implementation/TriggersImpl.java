// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.TriggersClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.TriggerInner;
import com.azure.resourcemanager.databoxedge.generated.models.Trigger;
import com.azure.resourcemanager.databoxedge.generated.models.Triggers;

public final class TriggersImpl implements Triggers {
    private static final ClientLogger LOGGER = new ClientLogger(TriggersImpl.class);

    private final TriggersClient innerClient;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    public TriggersImpl(TriggersClient innerClient,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Trigger> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<TriggerInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new TriggerImpl(inner1, this.manager()));
    }

    public PagedIterable<Trigger> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, String filter,
        Context context) {
        PagedIterable<TriggerInner> inner
            = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new TriggerImpl(inner1, this.manager()));
    }

    public Response<Trigger> getWithResponse(String deviceName, String name, String resourceGroupName,
        Context context) {
        Response<TriggerInner> inner
            = this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new TriggerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Trigger get(String deviceName, String name, String resourceGroupName) {
        TriggerInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new TriggerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Trigger createOrUpdate(String deviceName, String name, String resourceGroupName, TriggerInner trigger) {
        TriggerInner inner = this.serviceClient().createOrUpdate(deviceName, name, resourceGroupName, trigger);
        if (inner != null) {
            return new TriggerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Trigger createOrUpdate(String deviceName, String name, String resourceGroupName, TriggerInner trigger,
        Context context) {
        TriggerInner inner = this.serviceClient().createOrUpdate(deviceName, name, resourceGroupName, trigger, context);
        if (inner != null) {
            return new TriggerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String name, String resourceGroupName) {
        this.serviceClient().delete(deviceName, name, resourceGroupName);
    }

    public void delete(String deviceName, String name, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, name, resourceGroupName, context);
    }

    private TriggersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
