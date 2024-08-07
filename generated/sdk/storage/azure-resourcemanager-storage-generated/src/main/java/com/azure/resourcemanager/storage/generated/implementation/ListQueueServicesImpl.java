// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.fluent.models.ListQueueServicesInner;
import com.azure.resourcemanager.storage.generated.fluent.models.QueueServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.ListQueueServices;
import com.azure.resourcemanager.storage.generated.models.QueueServiceProperties;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ListQueueServicesImpl implements ListQueueServices {
    private ListQueueServicesInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    ListQueueServicesImpl(ListQueueServicesInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<QueueServiceProperties> value() {
        List<QueueServicePropertiesInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new QueueServicePropertiesImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ListQueueServicesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}
