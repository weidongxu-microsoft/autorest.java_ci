// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.SecretsCollectionInner;
import com.azure.resourcemanager.appservice.generated.models.ContainerAppSecret;
import com.azure.resourcemanager.appservice.generated.models.SecretsCollection;
import java.util.Collections;
import java.util.List;

public final class SecretsCollectionImpl implements SecretsCollection {
    private SecretsCollectionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    SecretsCollectionImpl(SecretsCollectionInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ContainerAppSecret> value() {
        List<ContainerAppSecret> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SecretsCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
