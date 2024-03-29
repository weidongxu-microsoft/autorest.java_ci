// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.HostnameBindingInner;
import com.azure.resourcemanager.appservice.generated.models.AzureResourceType;
import com.azure.resourcemanager.appservice.generated.models.CustomHostnameDnsRecordType;
import com.azure.resourcemanager.appservice.generated.models.HostnameBinding;
import com.azure.resourcemanager.appservice.generated.models.HostnameType;
import com.azure.resourcemanager.appservice.generated.models.SslState;

public final class HostnameBindingImpl implements HostnameBinding, HostnameBinding.Definition, HostnameBinding.Update {
    private HostnameBindingInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

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

    public String siteName() {
        return this.innerModel().siteName();
    }

    public String domainId() {
        return this.innerModel().domainId();
    }

    public String azureResourceName() {
        return this.innerModel().azureResourceName();
    }

    public AzureResourceType azureResourceType() {
        return this.innerModel().azureResourceType();
    }

    public CustomHostnameDnsRecordType customHostnameDnsRecordType() {
        return this.innerModel().customHostnameDnsRecordType();
    }

    public HostnameType hostnameType() {
        return this.innerModel().hostnameType();
    }

    public SslState sslState() {
        return this.innerModel().sslState();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public String virtualIp() {
        return this.innerModel().virtualIp();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public HostnameBindingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String hostname;

    public HostnameBindingImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public HostnameBinding create() {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .createOrUpdateHostnameBindingWithResponse(resourceGroupName, name, hostname, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public HostnameBinding create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .createOrUpdateHostnameBindingWithResponse(resourceGroupName, name, hostname, this.innerModel(), context)
            .getValue();
        return this;
    }

    HostnameBindingImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new HostnameBindingInner();
        this.serviceManager = serviceManager;
        this.hostname = name;
    }

    public HostnameBindingImpl update() {
        return this;
    }

    public HostnameBinding apply() {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .createOrUpdateHostnameBindingWithResponse(resourceGroupName, name, hostname, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public HostnameBinding apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .createOrUpdateHostnameBindingWithResponse(resourceGroupName, name, hostname, this.innerModel(), context)
            .getValue();
        return this;
    }

    HostnameBindingImpl(HostnameBindingInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "sites");
        this.hostname = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "hostNameBindings");
    }

    public HostnameBinding refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .getHostnameBindingWithResponse(resourceGroupName, name, hostname, Context.NONE)
            .getValue();
        return this;
    }

    public HostnameBinding refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWebApps()
            .getHostnameBindingWithResponse(resourceGroupName, name, hostname, context)
            .getValue();
        return this;
    }

    public HostnameBindingImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public HostnameBindingImpl withSiteName(String siteName) {
        this.innerModel().withSiteName(siteName);
        return this;
    }

    public HostnameBindingImpl withDomainId(String domainId) {
        this.innerModel().withDomainId(domainId);
        return this;
    }

    public HostnameBindingImpl withAzureResourceName(String azureResourceName) {
        this.innerModel().withAzureResourceName(azureResourceName);
        return this;
    }

    public HostnameBindingImpl withAzureResourceType(AzureResourceType azureResourceType) {
        this.innerModel().withAzureResourceType(azureResourceType);
        return this;
    }

    public HostnameBindingImpl
        withCustomHostnameDnsRecordType(CustomHostnameDnsRecordType customHostnameDnsRecordType) {
        this.innerModel().withCustomHostnameDnsRecordType(customHostnameDnsRecordType);
        return this;
    }

    public HostnameBindingImpl withHostnameType(HostnameType hostnameType) {
        this.innerModel().withHostnameType(hostnameType);
        return this;
    }

    public HostnameBindingImpl withSslState(SslState sslState) {
        this.innerModel().withSslState(sslState);
        return this;
    }

    public HostnameBindingImpl withThumbprint(String thumbprint) {
        this.innerModel().withThumbprint(thumbprint);
        return this;
    }
}
