// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcegraph.generated.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.resourcegraph.generated.fluent.models.QueryResponseInner;
import com.azure.resourcemanager.resourcegraph.generated.models.QueryRequest;
import com.azure.resourcemanager.resourcegraph.generated.models.QueryResponse;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourceProviders;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourcesHistoryRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.resourcegraph.generated.ResourceGraphManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient,
        com.azure.resourcemanager.resourcegraph.generated.ResourceGraphManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QueryResponse resources(QueryRequest query) {
        QueryResponseInner inner = this.serviceClient().resources(query);
        if (inner != null) {
            return new QueryResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryResponse> resourcesWithResponse(QueryRequest query, Context context) {
        Response<QueryResponseInner> inner = this.serviceClient().resourcesWithResponse(query, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Object resourcesHistory(ResourcesHistoryRequest request) {
        return this.serviceClient().resourcesHistory(request);
    }

    public Response<Object> resourcesHistoryWithResponse(ResourcesHistoryRequest request, Context context) {
        return this.serviceClient().resourcesHistoryWithResponse(request, context);
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resourcegraph.generated.ResourceGraphManager manager() {
        return this.serviceManager;
    }
}
