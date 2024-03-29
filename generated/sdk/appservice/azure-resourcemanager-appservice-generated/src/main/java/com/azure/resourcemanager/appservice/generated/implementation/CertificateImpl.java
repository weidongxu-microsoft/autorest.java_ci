// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateInner;
import com.azure.resourcemanager.appservice.generated.models.Certificate;
import com.azure.resourcemanager.appservice.generated.models.CertificatePatchResource;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.generated.models.KeyVaultSecretStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CertificateImpl implements Certificate, Certificate.Definition, Certificate.Update {
    private CertificateInner innerObject;

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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String password() {
        return this.innerModel().password();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String subjectName() {
        return this.innerModel().subjectName();
    }

    public List<String> hostNames() {
        List<String> inner = this.innerModel().hostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public byte[] pfxBlob() {
        return this.innerModel().pfxBlob();
    }

    public String siteName() {
        return this.innerModel().siteName();
    }

    public String selfLink() {
        return this.innerModel().selfLink();
    }

    public String issuer() {
        return this.innerModel().issuer();
    }

    public OffsetDateTime issueDate() {
        return this.innerModel().issueDate();
    }

    public OffsetDateTime expirationDate() {
        return this.innerModel().expirationDate();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public Boolean valid() {
        return this.innerModel().valid();
    }

    public byte[] cerBlob() {
        return this.innerModel().cerBlob();
    }

    public String publicKeyHash() {
        return this.innerModel().publicKeyHash();
    }

    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerModel().hostingEnvironmentProfile();
    }

    public String keyVaultId() {
        return this.innerModel().keyVaultId();
    }

    public String keyVaultSecretName() {
        return this.innerModel().keyVaultSecretName();
    }

    public KeyVaultSecretStatus keyVaultSecretStatus() {
        return this.innerModel().keyVaultSecretStatus();
    }

    public String serverFarmId() {
        return this.innerModel().serverFarmId();
    }

    public String canonicalName() {
        return this.innerModel().canonicalName();
    }

    public String domainValidationMethod() {
        return this.innerModel().domainValidationMethod();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CertificateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private CertificatePatchResource updateCertificateEnvelope;

    public CertificateImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Certificate create() {
        this.innerObject = serviceManager.serviceClient()
            .getCertificates()
            .createOrUpdateWithResponse(resourceGroupName, name, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public Certificate create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCertificates()
            .createOrUpdateWithResponse(resourceGroupName, name, this.innerModel(), context)
            .getValue();
        return this;
    }

    CertificateImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new CertificateInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public CertificateImpl update() {
        this.updateCertificateEnvelope = new CertificatePatchResource();
        return this;
    }

    public Certificate apply() {
        this.innerObject = serviceManager.serviceClient()
            .getCertificates()
            .updateWithResponse(resourceGroupName, name, updateCertificateEnvelope, Context.NONE)
            .getValue();
        return this;
    }

    public Certificate apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCertificates()
            .updateWithResponse(resourceGroupName, name, updateCertificateEnvelope, context)
            .getValue();
        return this;
    }

    CertificateImpl(CertificateInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "certificates");
    }

    public Certificate refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getCertificates()
            .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
            .getValue();
        return this;
    }

    public Certificate refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getCertificates()
            .getByResourceGroupWithResponse(resourceGroupName, name, context)
            .getValue();
        return this;
    }

    public CertificateImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CertificateImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CertificateImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public CertificateImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateCertificateEnvelope.withKind(kind);
            return this;
        }
    }

    public CertificateImpl withPassword(String password) {
        this.innerModel().withPassword(password);
        return this;
    }

    public CertificateImpl withHostNames(List<String> hostNames) {
        if (isInCreateMode()) {
            this.innerModel().withHostNames(hostNames);
            return this;
        } else {
            this.updateCertificateEnvelope.withHostNames(hostNames);
            return this;
        }
    }

    public CertificateImpl withPfxBlob(byte[] pfxBlob) {
        if (isInCreateMode()) {
            this.innerModel().withPfxBlob(pfxBlob);
            return this;
        } else {
            this.updateCertificateEnvelope.withPfxBlob(pfxBlob);
            return this;
        }
    }

    public CertificateImpl withKeyVaultId(String keyVaultId) {
        if (isInCreateMode()) {
            this.innerModel().withKeyVaultId(keyVaultId);
            return this;
        } else {
            this.updateCertificateEnvelope.withKeyVaultId(keyVaultId);
            return this;
        }
    }

    public CertificateImpl withKeyVaultSecretName(String keyVaultSecretName) {
        if (isInCreateMode()) {
            this.innerModel().withKeyVaultSecretName(keyVaultSecretName);
            return this;
        } else {
            this.updateCertificateEnvelope.withKeyVaultSecretName(keyVaultSecretName);
            return this;
        }
    }

    public CertificateImpl withServerFarmId(String serverFarmId) {
        if (isInCreateMode()) {
            this.innerModel().withServerFarmId(serverFarmId);
            return this;
        } else {
            this.updateCertificateEnvelope.withServerFarmId(serverFarmId);
            return this;
        }
    }

    public CertificateImpl withCanonicalName(String canonicalName) {
        if (isInCreateMode()) {
            this.innerModel().withCanonicalName(canonicalName);
            return this;
        } else {
            this.updateCertificateEnvelope.withCanonicalName(canonicalName);
            return this;
        }
    }

    public CertificateImpl withDomainValidationMethod(String domainValidationMethod) {
        if (isInCreateMode()) {
            this.innerModel().withDomainValidationMethod(domainValidationMethod);
            return this;
        } else {
            this.updateCertificateEnvelope.withDomainValidationMethod(domainValidationMethod);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
