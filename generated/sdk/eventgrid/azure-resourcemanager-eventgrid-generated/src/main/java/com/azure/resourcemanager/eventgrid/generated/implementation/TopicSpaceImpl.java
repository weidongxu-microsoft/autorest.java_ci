// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.TopicSpaceInner;
import com.azure.resourcemanager.eventgrid.generated.models.TopicSpace;
import com.azure.resourcemanager.eventgrid.generated.models.TopicSpaceProvisioningState;
import java.util.Collections;
import java.util.List;

public final class TopicSpaceImpl implements TopicSpace, TopicSpace.Definition, TopicSpace.Update {
    private TopicSpaceInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

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

    public List<String> topicTemplates() {
        List<String> inner = this.innerModel().topicTemplates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public TopicSpaceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public TopicSpaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String topicSpaceName;

    public TopicSpaceImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public TopicSpace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopicSpaces()
                .createOrUpdate(resourceGroupName, namespaceName, topicSpaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public TopicSpace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopicSpaces()
                .createOrUpdate(resourceGroupName, namespaceName, topicSpaceName, this.innerModel(), context);
        return this;
    }

    TopicSpaceImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new TopicSpaceInner();
        this.serviceManager = serviceManager;
        this.topicSpaceName = name;
    }

    public TopicSpaceImpl update() {
        return this;
    }

    public TopicSpace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopicSpaces()
                .createOrUpdate(resourceGroupName, namespaceName, topicSpaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public TopicSpace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopicSpaces()
                .createOrUpdate(resourceGroupName, namespaceName, topicSpaceName, this.innerModel(), context);
        return this;
    }

    TopicSpaceImpl(
        TopicSpaceInner innerObject, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.topicSpaceName = Utils.getValueFromIdByName(innerObject.id(), "topicSpaces");
    }

    public TopicSpace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopicSpaces()
                .getWithResponse(resourceGroupName, namespaceName, topicSpaceName, Context.NONE)
                .getValue();
        return this;
    }

    public TopicSpace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopicSpaces()
                .getWithResponse(resourceGroupName, namespaceName, topicSpaceName, context)
                .getValue();
        return this;
    }

    public TopicSpaceImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public TopicSpaceImpl withTopicTemplates(List<String> topicTemplates) {
        this.innerModel().withTopicTemplates(topicTemplates);
        return this;
    }
}
