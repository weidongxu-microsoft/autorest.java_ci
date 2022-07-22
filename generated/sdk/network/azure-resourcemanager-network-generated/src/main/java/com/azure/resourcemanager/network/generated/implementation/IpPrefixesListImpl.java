// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.IpPrefixesListInner;
import com.azure.resourcemanager.network.generated.models.IpPrefixesList;
import java.util.Collections;
import java.util.List;

public final class IpPrefixesListImpl implements IpPrefixesList {
    private IpPrefixesListInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    IpPrefixesListImpl(
        IpPrefixesListInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> ipPrefixes() {
        List<String> inner = this.innerModel().ipPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IpPrefixesListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}