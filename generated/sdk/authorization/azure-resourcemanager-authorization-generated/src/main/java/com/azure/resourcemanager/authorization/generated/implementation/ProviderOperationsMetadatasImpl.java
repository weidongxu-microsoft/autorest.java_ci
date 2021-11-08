// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.ProviderOperationsMetadatasClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.ProviderOperationsMetadataInner;
import com.azure.resourcemanager.authorization.generated.models.ProviderOperationsMetadata;
import com.azure.resourcemanager.authorization.generated.models.ProviderOperationsMetadatas;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProviderOperationsMetadatasImpl implements ProviderOperationsMetadatas {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderOperationsMetadatasImpl.class);

    private final ProviderOperationsMetadatasClient innerClient;

    private final com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager;

    public ProviderOperationsMetadatasImpl(
        ProviderOperationsMetadatasClient innerClient,
        com.azure.resourcemanager.authorization.generated.AuthorizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProviderOperationsMetadata get(String resourceProviderNamespace) {
        ProviderOperationsMetadataInner inner = this.serviceClient().get(resourceProviderNamespace);
        if (inner != null) {
            return new ProviderOperationsMetadataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProviderOperationsMetadata> getWithResponse(
        String resourceProviderNamespace, String expand, Context context) {
        Response<ProviderOperationsMetadataInner> inner =
            this.serviceClient().getWithResponse(resourceProviderNamespace, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProviderOperationsMetadataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ProviderOperationsMetadata> list() {
        PagedIterable<ProviderOperationsMetadataInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ProviderOperationsMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<ProviderOperationsMetadata> list(String expand, Context context) {
        PagedIterable<ProviderOperationsMetadataInner> inner = this.serviceClient().list(expand, context);
        return Utils.mapPage(inner, inner1 -> new ProviderOperationsMetadataImpl(inner1, this.manager()));
    }

    private ProviderOperationsMetadatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.authorization.generated.AuthorizationManager manager() {
        return this.serviceManager;
    }
}
