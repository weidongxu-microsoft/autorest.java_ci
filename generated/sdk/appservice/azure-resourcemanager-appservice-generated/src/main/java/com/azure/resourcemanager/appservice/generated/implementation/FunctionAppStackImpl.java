// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.FunctionAppStackInner;
import com.azure.resourcemanager.appservice.generated.models.FunctionAppMajorVersion;
import com.azure.resourcemanager.appservice.generated.models.FunctionAppStack;
import com.azure.resourcemanager.appservice.generated.models.StackPreferredOs;
import java.util.Collections;
import java.util.List;

public final class FunctionAppStackImpl implements FunctionAppStack {
    private FunctionAppStackInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    FunctionAppStackImpl(FunctionAppStackInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String displayText() {
        return this.innerModel().displayText();
    }

    public String value() {
        return this.innerModel().value();
    }

    public List<FunctionAppMajorVersion> majorVersions() {
        List<FunctionAppMajorVersion> inner = this.innerModel().majorVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StackPreferredOs preferredOs() {
        return this.innerModel().preferredOs();
    }

    public FunctionAppStackInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
