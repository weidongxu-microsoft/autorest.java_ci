// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dns.generated.fluent.RecordSetsClient;
import com.azure.resourcemanager.dns.generated.fluent.models.RecordSetInner;
import com.azure.resourcemanager.dns.generated.models.RecordSet;
import com.azure.resourcemanager.dns.generated.models.RecordSets;
import com.azure.resourcemanager.dns.generated.models.RecordType;

public final class RecordSetsImpl implements RecordSets {
    private static final ClientLogger LOGGER = new ClientLogger(RecordSetsImpl.class);

    private final RecordSetsClient innerClient;

    private final com.azure.resourcemanager.dns.generated.DnsManager serviceManager;

    public RecordSetsImpl(RecordSetsClient innerClient,
        com.azure.resourcemanager.dns.generated.DnsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<RecordSet> updateWithResponse(String resourceGroupName, String zoneName,
        String relativeRecordSetName, RecordType recordType, RecordSetInner parameters, String ifMatch,
        Context context) {
        Response<RecordSetInner> inner = this.serviceClient()
            .updateWithResponse(resourceGroupName, zoneName, relativeRecordSetName, recordType, parameters, ifMatch,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecordSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecordSet update(String resourceGroupName, String zoneName, String relativeRecordSetName,
        RecordType recordType, RecordSetInner parameters) {
        RecordSetInner inner
            = this.serviceClient().update(resourceGroupName, zoneName, relativeRecordSetName, recordType, parameters);
        if (inner != null) {
            return new RecordSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecordSet> createOrUpdateWithResponse(String resourceGroupName, String zoneName,
        String relativeRecordSetName, RecordType recordType, RecordSetInner parameters, String ifMatch,
        String ifNoneMatch, Context context) {
        Response<RecordSetInner> inner = this.serviceClient()
            .createOrUpdateWithResponse(resourceGroupName, zoneName, relativeRecordSetName, recordType, parameters,
                ifMatch, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecordSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecordSet createOrUpdate(String resourceGroupName, String zoneName, String relativeRecordSetName,
        RecordType recordType, RecordSetInner parameters) {
        RecordSetInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, zoneName, relativeRecordSetName, recordType, parameters);
        if (inner != null) {
            return new RecordSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String zoneName, String relativeRecordSetName,
        RecordType recordType, String ifMatch, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, zoneName, relativeRecordSetName, recordType, ifMatch, context);
    }

    public void delete(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType) {
        this.serviceClient().delete(resourceGroupName, zoneName, relativeRecordSetName, recordType);
    }

    public Response<RecordSet> getWithResponse(String resourceGroupName, String zoneName, String relativeRecordSetName,
        RecordType recordType, Context context) {
        Response<RecordSetInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, zoneName, relativeRecordSetName, recordType, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecordSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecordSet get(String resourceGroupName, String zoneName, String relativeRecordSetName,
        RecordType recordType) {
        RecordSetInner inner = this.serviceClient().get(resourceGroupName, zoneName, relativeRecordSetName, recordType);
        if (inner != null) {
            return new RecordSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<RecordSet> listByType(String resourceGroupName, String zoneName, RecordType recordType) {
        PagedIterable<RecordSetInner> inner = this.serviceClient().listByType(resourceGroupName, zoneName, recordType);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecordSetImpl(inner1, this.manager()));
    }

    public PagedIterable<RecordSet> listByType(String resourceGroupName, String zoneName, RecordType recordType,
        Integer top, String recordsetnamesuffix, Context context) {
        PagedIterable<RecordSetInner> inner = this.serviceClient()
            .listByType(resourceGroupName, zoneName, recordType, top, recordsetnamesuffix, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecordSetImpl(inner1, this.manager()));
    }

    public PagedIterable<RecordSet> listByDnsZone(String resourceGroupName, String zoneName) {
        PagedIterable<RecordSetInner> inner = this.serviceClient().listByDnsZone(resourceGroupName, zoneName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecordSetImpl(inner1, this.manager()));
    }

    public PagedIterable<RecordSet> listByDnsZone(String resourceGroupName, String zoneName, Integer top,
        String recordsetnamesuffix, Context context) {
        PagedIterable<RecordSetInner> inner
            = this.serviceClient().listByDnsZone(resourceGroupName, zoneName, top, recordsetnamesuffix, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecordSetImpl(inner1, this.manager()));
    }

    public PagedIterable<RecordSet> listAllByDnsZone(String resourceGroupName, String zoneName) {
        PagedIterable<RecordSetInner> inner = this.serviceClient().listAllByDnsZone(resourceGroupName, zoneName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecordSetImpl(inner1, this.manager()));
    }

    public PagedIterable<RecordSet> listAllByDnsZone(String resourceGroupName, String zoneName, Integer top,
        String recordSetNameSuffix, Context context) {
        PagedIterable<RecordSetInner> inner
            = this.serviceClient().listAllByDnsZone(resourceGroupName, zoneName, top, recordSetNameSuffix, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RecordSetImpl(inner1, this.manager()));
    }

    private RecordSetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dns.generated.DnsManager manager() {
        return this.serviceManager;
    }
}
