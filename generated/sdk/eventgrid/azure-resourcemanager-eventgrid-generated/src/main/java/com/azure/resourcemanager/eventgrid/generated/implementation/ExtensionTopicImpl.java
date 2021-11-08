// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.ExtensionTopicInner;
import com.azure.resourcemanager.eventgrid.generated.models.ExtensionTopic;

public final class ExtensionTopicImpl implements ExtensionTopic {
    private ExtensionTopicInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    ExtensionTopicImpl(
        ExtensionTopicInner innerObject,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String systemTopic() {
        return this.innerModel().systemTopic();
    }

    public ExtensionTopicInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
