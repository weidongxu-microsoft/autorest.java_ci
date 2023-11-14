// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.fluent.OperationsClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.OperationCollectionInner;
import com.azure.resourcemanager.mediaservices.generated.models.OperationCollection;
import com.azure.resourcemanager.mediaservices.generated.models.Operations;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    public OperationsImpl(OperationsClient innerClient,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationCollection> listWithResponse(Context context) {
        Response<OperationCollectionInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new OperationCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationCollection list() {
        OperationCollectionInner inner = this.serviceClient().list();
        if (inner != null) {
            return new OperationCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
