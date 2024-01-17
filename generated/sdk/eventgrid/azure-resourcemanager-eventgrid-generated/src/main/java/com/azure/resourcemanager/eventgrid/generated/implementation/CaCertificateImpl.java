// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.CaCertificateInner;
import com.azure.resourcemanager.eventgrid.generated.models.CaCertificate;
import com.azure.resourcemanager.eventgrid.generated.models.CaCertificateProvisioningState;
import java.time.OffsetDateTime;

public final class CaCertificateImpl implements CaCertificate, CaCertificate.Definition, CaCertificate.Update {
    private CaCertificateInner innerObject;

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

    public String encodedCertificate() {
        return this.innerModel().encodedCertificate();
    }

    public OffsetDateTime issueTimeInUtc() {
        return this.innerModel().issueTimeInUtc();
    }

    public OffsetDateTime expiryTimeInUtc() {
        return this.innerModel().expiryTimeInUtc();
    }

    public CaCertificateProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CaCertificateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String caCertificateName;

    public CaCertificateImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public CaCertificate create() {
        this.innerObject = serviceManager.serviceClient().getCaCertificates().createOrUpdate(resourceGroupName,
            namespaceName, caCertificateName, this.innerModel(), Context.NONE);
        return this;
    }

    public CaCertificate create(Context context) {
        this.innerObject = serviceManager.serviceClient().getCaCertificates().createOrUpdate(resourceGroupName,
            namespaceName, caCertificateName, this.innerModel(), context);
        return this;
    }

    CaCertificateImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new CaCertificateInner();
        this.serviceManager = serviceManager;
        this.caCertificateName = name;
    }

    public CaCertificateImpl update() {
        return this;
    }

    public CaCertificate apply() {
        this.innerObject = serviceManager.serviceClient().getCaCertificates().createOrUpdate(resourceGroupName,
            namespaceName, caCertificateName, this.innerModel(), Context.NONE);
        return this;
    }

    public CaCertificate apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getCaCertificates().createOrUpdate(resourceGroupName,
            namespaceName, caCertificateName, this.innerModel(), context);
        return this;
    }

    CaCertificateImpl(CaCertificateInner innerObject,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.caCertificateName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "caCertificates");
    }

    public CaCertificate refresh() {
        this.innerObject = serviceManager.serviceClient().getCaCertificates()
            .getWithResponse(resourceGroupName, namespaceName, caCertificateName, Context.NONE).getValue();
        return this;
    }

    public CaCertificate refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getCaCertificates()
            .getWithResponse(resourceGroupName, namespaceName, caCertificateName, context).getValue();
        return this;
    }

    public CaCertificateImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public CaCertificateImpl withEncodedCertificate(String encodedCertificate) {
        this.innerModel().withEncodedCertificate(encodedCertificate);
        return this;
    }
}
