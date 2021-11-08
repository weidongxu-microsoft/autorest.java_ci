// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.resourcemanager.costmanagement.generated.fluent.models.AlertInner;
import com.azure.resourcemanager.costmanagement.generated.models.Alert;
import com.azure.resourcemanager.costmanagement.generated.models.AlertPropertiesDefinition;
import com.azure.resourcemanager.costmanagement.generated.models.AlertPropertiesDetails;
import com.azure.resourcemanager.costmanagement.generated.models.AlertSource;
import com.azure.resourcemanager.costmanagement.generated.models.AlertStatus;
import java.util.Collections;
import java.util.Map;

public final class AlertImpl implements Alert {
    private AlertInner innerObject;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    AlertImpl(
        AlertInner innerObject,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public AlertPropertiesDefinition definition() {
        return this.innerModel().definition();
    }

    public String description() {
        return this.innerModel().description();
    }

    public AlertSource source() {
        return this.innerModel().source();
    }

    public AlertPropertiesDetails details() {
        return this.innerModel().details();
    }

    public String costEntityId() {
        return this.innerModel().costEntityId();
    }

    public AlertStatus status() {
        return this.innerModel().status();
    }

    public String creationTime() {
        return this.innerModel().creationTime();
    }

    public String closeTime() {
        return this.innerModel().closeTime();
    }

    public String modificationTime() {
        return this.innerModel().modificationTime();
    }

    public String statusModificationUsername() {
        return this.innerModel().statusModificationUsername();
    }

    public String statusModificationTime() {
        return this.innerModel().statusModificationTime();
    }

    public AlertInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }
}
