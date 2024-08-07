// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificate;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateOrderInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrder;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrderPatchResource;
import com.azure.resourcemanager.appservice.generated.models.CertificateDetails;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderContact;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderStatus;
import com.azure.resourcemanager.appservice.generated.models.CertificateProductType;
import com.azure.resourcemanager.appservice.generated.models.ProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.ReissueCertificateOrderRequest;
import com.azure.resourcemanager.appservice.generated.models.RenewCertificateOrderRequest;
import com.azure.resourcemanager.appservice.generated.models.ResourceNotRenewableReason;
import com.azure.resourcemanager.appservice.generated.models.SiteSeal;
import com.azure.resourcemanager.appservice.generated.models.SiteSealRequest;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AppServiceCertificateOrderImpl
    implements AppServiceCertificateOrder, AppServiceCertificateOrder.Definition, AppServiceCertificateOrder.Update {
    private AppServiceCertificateOrderInner innerObject;

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

    public Map<String, AppServiceCertificate> certificates() {
        Map<String, AppServiceCertificate> inner = this.innerModel().certificates();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String distinguishedName() {
        return this.innerModel().distinguishedName();
    }

    public String domainVerificationToken() {
        return this.innerModel().domainVerificationToken();
    }

    public Integer validityInYears() {
        return this.innerModel().validityInYears();
    }

    public Integer keySize() {
        return this.innerModel().keySize();
    }

    public CertificateProductType productType() {
        return this.innerModel().productType();
    }

    public Boolean autoRenew() {
        return this.innerModel().autoRenew();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public CertificateOrderStatus status() {
        return this.innerModel().status();
    }

    public CertificateDetails signedCertificate() {
        return this.innerModel().signedCertificate();
    }

    public String csr() {
        return this.innerModel().csr();
    }

    public CertificateDetails intermediate() {
        return this.innerModel().intermediate();
    }

    public CertificateDetails root() {
        return this.innerModel().root();
    }

    public String serialNumber() {
        return this.innerModel().serialNumber();
    }

    public OffsetDateTime lastCertificateIssuanceTime() {
        return this.innerModel().lastCertificateIssuanceTime();
    }

    public OffsetDateTime expirationTime() {
        return this.innerModel().expirationTime();
    }

    public Boolean isPrivateKeyExternal() {
        return this.innerModel().isPrivateKeyExternal();
    }

    public List<ResourceNotRenewableReason> appServiceCertificateNotRenewableReasons() {
        List<ResourceNotRenewableReason> inner = this.innerModel().appServiceCertificateNotRenewableReasons();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime nextAutoRenewalTimestamp() {
        return this.innerModel().nextAutoRenewalTimestamp();
    }

    public CertificateOrderContact contact() {
        return this.innerModel().contact();
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

    public AppServiceCertificateOrderInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String certificateOrderName;

    private AppServiceCertificateOrderPatchResource updateCertificateDistinguishedName;

    public AppServiceCertificateOrderImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AppServiceCertificateOrder create() {
        this.innerObject = serviceManager.serviceClient()
            .getAppServiceCertificateOrders()
            .createOrUpdate(resourceGroupName, certificateOrderName, this.innerModel(), Context.NONE);
        return this;
    }

    public AppServiceCertificateOrder create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppServiceCertificateOrders()
            .createOrUpdate(resourceGroupName, certificateOrderName, this.innerModel(), context);
        return this;
    }

    AppServiceCertificateOrderImpl(String name,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new AppServiceCertificateOrderInner();
        this.serviceManager = serviceManager;
        this.certificateOrderName = name;
    }

    public AppServiceCertificateOrderImpl update() {
        this.updateCertificateDistinguishedName = new AppServiceCertificateOrderPatchResource();
        return this;
    }

    public AppServiceCertificateOrder apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAppServiceCertificateOrders()
            .updateWithResponse(resourceGroupName, certificateOrderName, updateCertificateDistinguishedName,
                Context.NONE)
            .getValue();
        return this;
    }

    public AppServiceCertificateOrder apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppServiceCertificateOrders()
            .updateWithResponse(resourceGroupName, certificateOrderName, updateCertificateDistinguishedName, context)
            .getValue();
        return this;
    }

    AppServiceCertificateOrderImpl(AppServiceCertificateOrderInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.certificateOrderName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "certificateOrders");
    }

    public AppServiceCertificateOrder refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAppServiceCertificateOrders()
            .getByResourceGroupWithResponse(resourceGroupName, certificateOrderName, Context.NONE)
            .getValue();
        return this;
    }

    public AppServiceCertificateOrder refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppServiceCertificateOrders()
            .getByResourceGroupWithResponse(resourceGroupName, certificateOrderName, context)
            .getValue();
        return this;
    }

    public Response<Void> reissueWithResponse(ReissueCertificateOrderRequest reissueCertificateOrderRequest,
        Context context) {
        return serviceManager.appServiceCertificateOrders()
            .reissueWithResponse(resourceGroupName, certificateOrderName, reissueCertificateOrderRequest, context);
    }

    public void reissue(ReissueCertificateOrderRequest reissueCertificateOrderRequest) {
        serviceManager.appServiceCertificateOrders()
            .reissue(resourceGroupName, certificateOrderName, reissueCertificateOrderRequest);
    }

    public Response<Void> renewWithResponse(RenewCertificateOrderRequest renewCertificateOrderRequest,
        Context context) {
        return serviceManager.appServiceCertificateOrders()
            .renewWithResponse(resourceGroupName, certificateOrderName, renewCertificateOrderRequest, context);
    }

    public void renew(RenewCertificateOrderRequest renewCertificateOrderRequest) {
        serviceManager.appServiceCertificateOrders()
            .renew(resourceGroupName, certificateOrderName, renewCertificateOrderRequest);
    }

    public Response<Void> resendEmailWithResponse(Context context) {
        return serviceManager.appServiceCertificateOrders()
            .resendEmailWithResponse(resourceGroupName, certificateOrderName, context);
    }

    public void resendEmail() {
        serviceManager.appServiceCertificateOrders().resendEmail(resourceGroupName, certificateOrderName);
    }

    public Response<Void> resendRequestEmailsWithResponse(NameIdentifierInner nameIdentifier, Context context) {
        return serviceManager.appServiceCertificateOrders()
            .resendRequestEmailsWithResponse(resourceGroupName, certificateOrderName, nameIdentifier, context);
    }

    public void resendRequestEmails(NameIdentifierInner nameIdentifier) {
        serviceManager.appServiceCertificateOrders()
            .resendRequestEmails(resourceGroupName, certificateOrderName, nameIdentifier);
    }

    public Response<SiteSeal> retrieveSiteSealWithResponse(SiteSealRequest siteSealRequest, Context context) {
        return serviceManager.appServiceCertificateOrders()
            .retrieveSiteSealWithResponse(resourceGroupName, certificateOrderName, siteSealRequest, context);
    }

    public SiteSeal retrieveSiteSeal(SiteSealRequest siteSealRequest) {
        return serviceManager.appServiceCertificateOrders()
            .retrieveSiteSeal(resourceGroupName, certificateOrderName, siteSealRequest);
    }

    public Response<Void> verifyDomainOwnershipWithResponse(Context context) {
        return serviceManager.appServiceCertificateOrders()
            .verifyDomainOwnershipWithResponse(resourceGroupName, certificateOrderName, context);
    }

    public void verifyDomainOwnership() {
        serviceManager.appServiceCertificateOrders().verifyDomainOwnership(resourceGroupName, certificateOrderName);
    }

    public AppServiceCertificateOrderImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AppServiceCertificateOrderImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AppServiceCertificateOrderImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AppServiceCertificateOrderImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateCertificateDistinguishedName.withKind(kind);
            return this;
        }
    }

    public AppServiceCertificateOrderImpl withCertificates(Map<String, AppServiceCertificate> certificates) {
        if (isInCreateMode()) {
            this.innerModel().withCertificates(certificates);
            return this;
        } else {
            this.updateCertificateDistinguishedName.withCertificates(certificates);
            return this;
        }
    }

    public AppServiceCertificateOrderImpl withDistinguishedName(String distinguishedName) {
        this.innerModel().withDistinguishedName(distinguishedName);
        return this;
    }

    public AppServiceCertificateOrderImpl withValidityInYears(Integer validityInYears) {
        this.innerModel().withValidityInYears(validityInYears);
        return this;
    }

    public AppServiceCertificateOrderImpl withKeySize(Integer keySize) {
        this.innerModel().withKeySize(keySize);
        return this;
    }

    public AppServiceCertificateOrderImpl withProductType(CertificateProductType productType) {
        this.innerModel().withProductType(productType);
        return this;
    }

    public AppServiceCertificateOrderImpl withAutoRenew(Boolean autoRenew) {
        if (isInCreateMode()) {
            this.innerModel().withAutoRenew(autoRenew);
            return this;
        } else {
            this.updateCertificateDistinguishedName.withAutoRenew(autoRenew);
            return this;
        }
    }

    public AppServiceCertificateOrderImpl withCsr(String csr) {
        this.innerModel().withCsr(csr);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
