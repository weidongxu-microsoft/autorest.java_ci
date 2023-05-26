// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dns.generated.fluent.DnssecConfigsClient;
import com.azure.resourcemanager.dns.generated.fluent.models.DnssecConfigInner;
import com.azure.resourcemanager.dns.generated.models.DnssecConfig;
import com.azure.resourcemanager.dns.generated.models.DnssecConfigs;

public final class DnssecConfigsImpl implements DnssecConfigs {
    private static final ClientLogger LOGGER = new ClientLogger(DnssecConfigsImpl.class);

    private final DnssecConfigsClient innerClient;

    private final com.azure.resourcemanager.dns.generated.DnsManager serviceManager;

    public DnssecConfigsImpl(
        DnssecConfigsClient innerClient, com.azure.resourcemanager.dns.generated.DnsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DnssecConfig createOrUpdate(String resourceGroupName, String zoneName) {
        DnssecConfigInner inner = this.serviceClient().createOrUpdate(resourceGroupName, zoneName);
        if (inner != null) {
            return new DnssecConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DnssecConfig createOrUpdate(
        String resourceGroupName, String zoneName, String ifMatch, String ifNoneMatch, Context context) {
        DnssecConfigInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, zoneName, ifMatch, ifNoneMatch, context);
        if (inner != null) {
            return new DnssecConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String zoneName) {
        this.serviceClient().delete(resourceGroupName, zoneName);
    }

    public void delete(String resourceGroupName, String zoneName, String ifMatch, Context context) {
        this.serviceClient().delete(resourceGroupName, zoneName, ifMatch, context);
    }

    public Response<DnssecConfig> getWithResponse(String resourceGroupName, String zoneName, Context context) {
        Response<DnssecConfigInner> inner = this.serviceClient().getWithResponse(resourceGroupName, zoneName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DnssecConfigImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DnssecConfig get(String resourceGroupName, String zoneName) {
        DnssecConfigInner inner = this.serviceClient().get(resourceGroupName, zoneName);
        if (inner != null) {
            return new DnssecConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DnssecConfig> listByDnsZone(String resourceGroupName, String zoneName) {
        PagedIterable<DnssecConfigInner> inner = this.serviceClient().listByDnsZone(resourceGroupName, zoneName);
        return Utils.mapPage(inner, inner1 -> new DnssecConfigImpl(inner1, this.manager()));
    }

    public PagedIterable<DnssecConfig> listByDnsZone(String resourceGroupName, String zoneName, Context context) {
        PagedIterable<DnssecConfigInner> inner =
            this.serviceClient().listByDnsZone(resourceGroupName, zoneName, context);
        return Utils.mapPage(inner, inner1 -> new DnssecConfigImpl(inner1, this.manager()));
    }

    private DnssecConfigsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dns.generated.DnsManager manager() {
        return this.serviceManager;
    }
}