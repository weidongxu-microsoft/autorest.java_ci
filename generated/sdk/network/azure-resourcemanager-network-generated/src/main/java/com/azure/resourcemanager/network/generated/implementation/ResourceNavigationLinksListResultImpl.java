// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ResourceNavigationLinksListResultInner;
import com.azure.resourcemanager.network.generated.models.ResourceNavigationLink;
import com.azure.resourcemanager.network.generated.models.ResourceNavigationLinksListResult;
import java.util.Collections;
import java.util.List;

public final class ResourceNavigationLinksListResultImpl implements ResourceNavigationLinksListResult {
    private ResourceNavigationLinksListResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ResourceNavigationLinksListResultImpl(ResourceNavigationLinksListResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ResourceNavigationLink> value() {
        List<ResourceNavigationLink> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ResourceNavigationLinksListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
