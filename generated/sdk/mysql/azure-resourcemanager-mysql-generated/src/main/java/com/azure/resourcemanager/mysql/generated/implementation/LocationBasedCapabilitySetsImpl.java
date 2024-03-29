// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.LocationBasedCapabilitySetsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.CapabilityInner;
import com.azure.resourcemanager.mysql.generated.models.Capability;
import com.azure.resourcemanager.mysql.generated.models.LocationBasedCapabilitySets;

public final class LocationBasedCapabilitySetsImpl implements LocationBasedCapabilitySets {
    private static final ClientLogger LOGGER = new ClientLogger(LocationBasedCapabilitySetsImpl.class);

    private final LocationBasedCapabilitySetsClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public LocationBasedCapabilitySetsImpl(LocationBasedCapabilitySetsClient innerClient,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Capability> list(String locationName) {
        PagedIterable<CapabilityInner> inner = this.serviceClient().list(locationName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CapabilityImpl(inner1, this.manager()));
    }

    public PagedIterable<Capability> list(String locationName, Context context) {
        PagedIterable<CapabilityInner> inner = this.serviceClient().list(locationName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CapabilityImpl(inner1, this.manager()));
    }

    public Response<Capability> getWithResponse(String locationName, String capabilitySetName, Context context) {
        Response<CapabilityInner> inner
            = this.serviceClient().getWithResponse(locationName, capabilitySetName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CapabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Capability get(String locationName, String capabilitySetName) {
        CapabilityInner inner = this.serviceClient().get(locationName, capabilitySetName);
        if (inner != null) {
            return new CapabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private LocationBasedCapabilitySetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
