// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.resourcemanager.mysql.generated.fluent.models.AdvisorInner;
import com.azure.resourcemanager.mysql.generated.models.Advisor;

public final class AdvisorImpl implements Advisor {
    private AdvisorInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    AdvisorImpl(AdvisorInner innerObject, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public AdvisorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
