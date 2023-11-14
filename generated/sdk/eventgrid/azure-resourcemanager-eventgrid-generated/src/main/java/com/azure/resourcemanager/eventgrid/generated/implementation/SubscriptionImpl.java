// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.SubscriptionInner;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeListResult;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.DeliverySchema;
import com.azure.resourcemanager.eventgrid.generated.models.FiltersConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.Subscription;
import com.azure.resourcemanager.eventgrid.generated.models.SubscriptionProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.SubscriptionUpdateParameters;

public final class SubscriptionImpl implements Subscription, Subscription.Definition, Subscription.Update {
    private SubscriptionInner innerObject;

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

    public SubscriptionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DeliveryConfiguration deliveryConfiguration() {
        return this.innerModel().deliveryConfiguration();
    }

    public DeliverySchema eventDeliverySchema() {
        return this.innerModel().eventDeliverySchema();
    }

    public FiltersConfiguration filtersConfiguration() {
        return this.innerModel().filtersConfiguration();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SubscriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String topicName;

    private String eventSubscriptionName;

    private SubscriptionUpdateParameters updateEventSubscriptionUpdateParameters;

    public SubscriptionImpl withExistingTopic(String resourceGroupName, String namespaceName, String topicName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.topicName = topicName;
        return this;
    }

    public Subscription create() {
        this.innerObject = serviceManager.serviceClient().getNamespaceTopicEventSubscriptions().createOrUpdate(
            resourceGroupName, namespaceName, topicName, eventSubscriptionName, this.innerModel(), Context.NONE);
        return this;
    }

    public Subscription create(Context context) {
        this.innerObject = serviceManager.serviceClient().getNamespaceTopicEventSubscriptions().createOrUpdate(
            resourceGroupName, namespaceName, topicName, eventSubscriptionName, this.innerModel(), context);
        return this;
    }

    SubscriptionImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new SubscriptionInner();
        this.serviceManager = serviceManager;
        this.eventSubscriptionName = name;
    }

    public SubscriptionImpl update() {
        this.updateEventSubscriptionUpdateParameters = new SubscriptionUpdateParameters();
        return this;
    }

    public Subscription apply() {
        this.innerObject
            = serviceManager.serviceClient().getNamespaceTopicEventSubscriptions().update(resourceGroupName,
                namespaceName, topicName, eventSubscriptionName, updateEventSubscriptionUpdateParameters, Context.NONE);
        return this;
    }

    public Subscription apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getNamespaceTopicEventSubscriptions().update(resourceGroupName,
                namespaceName, topicName, eventSubscriptionName, updateEventSubscriptionUpdateParameters, context);
        return this;
    }

    SubscriptionImpl(SubscriptionInner innerObject,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.topicName = Utils.getValueFromIdByName(innerObject.id(), "topics");
        this.eventSubscriptionName = Utils.getValueFromIdByName(innerObject.id(), "eventSubscriptions");
    }

    public Subscription refresh() {
        this.innerObject = serviceManager.serviceClient().getNamespaceTopicEventSubscriptions()
            .getWithResponse(resourceGroupName, namespaceName, topicName, eventSubscriptionName, Context.NONE)
            .getValue();
        return this;
    }

    public Subscription refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getNamespaceTopicEventSubscriptions()
            .getWithResponse(resourceGroupName, namespaceName, topicName, eventSubscriptionName, context).getValue();
        return this;
    }

    public Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(Context context) {
        return serviceManager.namespaceTopicEventSubscriptions().getDeliveryAttributesWithResponse(resourceGroupName,
            namespaceName, topicName, eventSubscriptionName, context);
    }

    public DeliveryAttributeListResult getDeliveryAttributes() {
        return serviceManager.namespaceTopicEventSubscriptions().getDeliveryAttributes(resourceGroupName, namespaceName,
            topicName, eventSubscriptionName);
    }

    public SubscriptionImpl withDeliveryConfiguration(DeliveryConfiguration deliveryConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withDeliveryConfiguration(deliveryConfiguration);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withDeliveryConfiguration(deliveryConfiguration);
            return this;
        }
    }

    public SubscriptionImpl withEventDeliverySchema(DeliverySchema eventDeliverySchema) {
        if (isInCreateMode()) {
            this.innerModel().withEventDeliverySchema(eventDeliverySchema);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withEventDeliverySchema(eventDeliverySchema);
            return this;
        }
    }

    public SubscriptionImpl withFiltersConfiguration(FiltersConfiguration filtersConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withFiltersConfiguration(filtersConfiguration);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withFiltersConfiguration(filtersConfiguration);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
