// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.resourcemanager.eventgrid.generated.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationIssues;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationProfile;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterInfo;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceAssociation;
import java.util.Collections;
import java.util.List;

public final class NetworkSecurityPerimeterConfigurationImpl implements NetworkSecurityPerimeterConfiguration {
    private NetworkSecurityPerimeterConfigurationInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    NetworkSecurityPerimeterConfigurationImpl(NetworkSecurityPerimeterConfigurationInner innerObject,
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

    public NetworkSecurityPerimeterConfigProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<NetworkSecurityPerimeterConfigurationIssues> provisioningIssues() {
        List<NetworkSecurityPerimeterConfigurationIssues> inner = this.innerModel().provisioningIssues();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSecurityPerimeterInfo networkSecurityPerimeter() {
        return this.innerModel().networkSecurityPerimeter();
    }

    public ResourceAssociation resourceAssociation() {
        return this.innerModel().resourceAssociation();
    }

    public NetworkSecurityPerimeterConfigurationProfile profile() {
        return this.innerModel().profile();
    }

    public NetworkSecurityPerimeterConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
