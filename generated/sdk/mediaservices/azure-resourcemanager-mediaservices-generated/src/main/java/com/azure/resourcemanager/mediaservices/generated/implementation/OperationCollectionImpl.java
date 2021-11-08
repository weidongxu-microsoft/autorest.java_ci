// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.OperationCollectionInner;
import com.azure.resourcemanager.mediaservices.generated.models.Operation;
import com.azure.resourcemanager.mediaservices.generated.models.OperationCollection;
import java.util.Collections;
import java.util.List;

public final class OperationCollectionImpl implements OperationCollection {
    private OperationCollectionInner innerObject;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    OperationCollectionImpl(
        OperationCollectionInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Operation> value() {
        List<Operation> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OperationCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
