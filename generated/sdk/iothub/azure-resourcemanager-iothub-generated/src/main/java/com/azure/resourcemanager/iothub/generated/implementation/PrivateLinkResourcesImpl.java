// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

import com.azure.resourcemanager.iothub.generated.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.iothub.generated.fluent.models.PrivateLinkResourcesInner;
import com.azure.resourcemanager.iothub.generated.models.GroupIdInformation;
import com.azure.resourcemanager.iothub.generated.models.PrivateLinkResources;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private PrivateLinkResourcesInner innerObject;

    private final com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager;

    PrivateLinkResourcesImpl(PrivateLinkResourcesInner innerObject,
        com.azure.resourcemanager.iothub.generated.IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<GroupIdInformation> value() {
        List<GroupIdInformationInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new GroupIdInformationImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourcesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iothub.generated.IotHubManager manager() {
        return this.serviceManager;
    }
}
