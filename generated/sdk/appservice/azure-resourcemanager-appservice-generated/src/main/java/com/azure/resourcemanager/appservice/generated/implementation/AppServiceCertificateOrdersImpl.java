// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.AppServiceCertificateOrdersClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateOrderInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificateResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateEmailInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateOrderActionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.NameIdentifierInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteSealInner;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrder;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrders;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateResource;
import com.azure.resourcemanager.appservice.generated.models.CertificateEmail;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderAction;
import com.azure.resourcemanager.appservice.generated.models.ReissueCertificateOrderRequest;
import com.azure.resourcemanager.appservice.generated.models.RenewCertificateOrderRequest;
import com.azure.resourcemanager.appservice.generated.models.SiteSeal;
import com.azure.resourcemanager.appservice.generated.models.SiteSealRequest;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class AppServiceCertificateOrdersImpl implements AppServiceCertificateOrders {
    private static final ClientLogger LOGGER = new ClientLogger(AppServiceCertificateOrdersImpl.class);

    private final AppServiceCertificateOrdersClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public AppServiceCertificateOrdersImpl(AppServiceCertificateOrdersClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AppServiceCertificateOrder> list() {
        PagedIterable<AppServiceCertificateOrderInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new AppServiceCertificateOrderImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServiceCertificateOrder> list(Context context) {
        PagedIterable<AppServiceCertificateOrderInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new AppServiceCertificateOrderImpl(inner1, this.manager()));
    }

    public Response<Void> validatePurchaseInformationWithResponse(
        AppServiceCertificateOrderInner appServiceCertificateOrder, Context context) {
        return this.serviceClient().validatePurchaseInformationWithResponse(appServiceCertificateOrder, context);
    }

    public void validatePurchaseInformation(AppServiceCertificateOrderInner appServiceCertificateOrder) {
        this.serviceClient().validatePurchaseInformation(appServiceCertificateOrder);
    }

    public PagedIterable<AppServiceCertificateOrder> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AppServiceCertificateOrderInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new AppServiceCertificateOrderImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServiceCertificateOrder> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AppServiceCertificateOrderInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new AppServiceCertificateOrderImpl(inner1, this.manager()));
    }

    public Response<AppServiceCertificateOrder> getByResourceGroupWithResponse(String resourceGroupName,
        String certificateOrderName, Context context) {
        Response<AppServiceCertificateOrderInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, certificateOrderName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AppServiceCertificateOrderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AppServiceCertificateOrder getByResourceGroup(String resourceGroupName, String certificateOrderName) {
        AppServiceCertificateOrderInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, certificateOrderName);
        if (inner != null) {
            return new AppServiceCertificateOrderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String certificateOrderName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, certificateOrderName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String certificateOrderName) {
        this.serviceClient().delete(resourceGroupName, certificateOrderName);
    }

    public PagedIterable<AppServiceCertificateResource> listCertificates(String resourceGroupName,
        String certificateOrderName) {
        PagedIterable<AppServiceCertificateResourceInner> inner
            = this.serviceClient().listCertificates(resourceGroupName, certificateOrderName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new AppServiceCertificateResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServiceCertificateResource> listCertificates(String resourceGroupName,
        String certificateOrderName, Context context) {
        PagedIterable<AppServiceCertificateResourceInner> inner
            = this.serviceClient().listCertificates(resourceGroupName, certificateOrderName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new AppServiceCertificateResourceImpl(inner1, this.manager()));
    }

    public Response<AppServiceCertificateResource> getCertificateWithResponse(String resourceGroupName,
        String certificateOrderName, String name, Context context) {
        Response<AppServiceCertificateResourceInner> inner
            = this.serviceClient().getCertificateWithResponse(resourceGroupName, certificateOrderName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AppServiceCertificateResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AppServiceCertificateResource getCertificate(String resourceGroupName, String certificateOrderName,
        String name) {
        AppServiceCertificateResourceInner inner
            = this.serviceClient().getCertificate(resourceGroupName, certificateOrderName, name);
        if (inner != null) {
            return new AppServiceCertificateResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteCertificateWithResponse(String resourceGroupName, String certificateOrderName,
        String name, Context context) {
        return this.serviceClient()
            .deleteCertificateWithResponse(resourceGroupName, certificateOrderName, name, context);
    }

    public void deleteCertificate(String resourceGroupName, String certificateOrderName, String name) {
        this.serviceClient().deleteCertificate(resourceGroupName, certificateOrderName, name);
    }

    public Response<Void> reissueWithResponse(String resourceGroupName, String certificateOrderName,
        ReissueCertificateOrderRequest reissueCertificateOrderRequest, Context context) {
        return this.serviceClient()
            .reissueWithResponse(resourceGroupName, certificateOrderName, reissueCertificateOrderRequest, context);
    }

    public void reissue(String resourceGroupName, String certificateOrderName,
        ReissueCertificateOrderRequest reissueCertificateOrderRequest) {
        this.serviceClient().reissue(resourceGroupName, certificateOrderName, reissueCertificateOrderRequest);
    }

    public Response<Void> renewWithResponse(String resourceGroupName, String certificateOrderName,
        RenewCertificateOrderRequest renewCertificateOrderRequest, Context context) {
        return this.serviceClient()
            .renewWithResponse(resourceGroupName, certificateOrderName, renewCertificateOrderRequest, context);
    }

    public void renew(String resourceGroupName, String certificateOrderName,
        RenewCertificateOrderRequest renewCertificateOrderRequest) {
        this.serviceClient().renew(resourceGroupName, certificateOrderName, renewCertificateOrderRequest);
    }

    public Response<Void> resendEmailWithResponse(String resourceGroupName, String certificateOrderName,
        Context context) {
        return this.serviceClient().resendEmailWithResponse(resourceGroupName, certificateOrderName, context);
    }

    public void resendEmail(String resourceGroupName, String certificateOrderName) {
        this.serviceClient().resendEmail(resourceGroupName, certificateOrderName);
    }

    public Response<Void> resendRequestEmailsWithResponse(String resourceGroupName, String certificateOrderName,
        NameIdentifierInner nameIdentifier, Context context) {
        return this.serviceClient()
            .resendRequestEmailsWithResponse(resourceGroupName, certificateOrderName, nameIdentifier, context);
    }

    public void resendRequestEmails(String resourceGroupName, String certificateOrderName,
        NameIdentifierInner nameIdentifier) {
        this.serviceClient().resendRequestEmails(resourceGroupName, certificateOrderName, nameIdentifier);
    }

    public Response<SiteSeal> retrieveSiteSealWithResponse(String resourceGroupName, String certificateOrderName,
        SiteSealRequest siteSealRequest, Context context) {
        Response<SiteSealInner> inner = this.serviceClient()
            .retrieveSiteSealWithResponse(resourceGroupName, certificateOrderName, siteSealRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SiteSealImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SiteSeal retrieveSiteSeal(String resourceGroupName, String certificateOrderName,
        SiteSealRequest siteSealRequest) {
        SiteSealInner inner
            = this.serviceClient().retrieveSiteSeal(resourceGroupName, certificateOrderName, siteSealRequest);
        if (inner != null) {
            return new SiteSealImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> verifyDomainOwnershipWithResponse(String resourceGroupName, String certificateOrderName,
        Context context) {
        return this.serviceClient().verifyDomainOwnershipWithResponse(resourceGroupName, certificateOrderName, context);
    }

    public void verifyDomainOwnership(String resourceGroupName, String certificateOrderName) {
        this.serviceClient().verifyDomainOwnership(resourceGroupName, certificateOrderName);
    }

    public Response<List<CertificateOrderAction>> retrieveCertificateActionsWithResponse(String resourceGroupName,
        String name, Context context) {
        Response<List<CertificateOrderActionInner>> inner
            = this.serviceClient().retrieveCertificateActionsWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                inner.getValue()
                    .stream()
                    .map(inner1 -> new CertificateOrderActionImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<CertificateOrderAction> retrieveCertificateActions(String resourceGroupName, String name) {
        List<CertificateOrderActionInner> inner
            = this.serviceClient().retrieveCertificateActions(resourceGroupName, name);
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new CertificateOrderActionImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<CertificateEmail>> retrieveCertificateEmailHistoryWithResponse(String resourceGroupName,
        String name, Context context) {
        Response<List<CertificateEmailInner>> inner
            = this.serviceClient().retrieveCertificateEmailHistoryWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                inner.getValue()
                    .stream()
                    .map(inner1 -> new CertificateEmailImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<CertificateEmail> retrieveCertificateEmailHistory(String resourceGroupName, String name) {
        List<CertificateEmailInner> inner
            = this.serviceClient().retrieveCertificateEmailHistory(resourceGroupName, name);
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new CertificateEmailImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public AppServiceCertificateOrder getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, certificateOrderName, Context.NONE).getValue();
    }

    public Response<AppServiceCertificateOrder> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, certificateOrderName, context);
    }

    public AppServiceCertificateResource getCertificateById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getCertificateWithResponse(resourceGroupName, certificateOrderName, name, Context.NONE).getValue();
    }

    public Response<AppServiceCertificateResource> getCertificateByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getCertificateWithResponse(resourceGroupName, certificateOrderName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, certificateOrderName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, certificateOrderName, context);
    }

    public void deleteCertificateById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        this.deleteCertificateWithResponse(resourceGroupName, certificateOrderName, name, Context.NONE);
    }

    public Response<Void> deleteCertificateByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String certificateOrderName = ResourceManagerUtils.getValueFromIdByName(id, "certificateOrders");
        if (certificateOrderName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificateOrders'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.deleteCertificateWithResponse(resourceGroupName, certificateOrderName, name, context);
    }

    private AppServiceCertificateOrdersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    public AppServiceCertificateOrderImpl define(String name) {
        return new AppServiceCertificateOrderImpl(name, this.manager());
    }

    public AppServiceCertificateResourceImpl defineCertificate(String name) {
        return new AppServiceCertificateResourceImpl(name, this.manager());
    }
}
