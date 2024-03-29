// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.CertificateRegistrationProvidersClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmOperationDescriptionInner;
import com.azure.resourcemanager.appservice.generated.models.CertificateRegistrationProviders;
import com.azure.resourcemanager.appservice.generated.models.CsmOperationDescription;

public final class CertificateRegistrationProvidersImpl implements CertificateRegistrationProviders {
    private static final ClientLogger LOGGER = new ClientLogger(CertificateRegistrationProvidersImpl.class);

    private final CertificateRegistrationProvidersClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public CertificateRegistrationProvidersImpl(CertificateRegistrationProvidersClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CsmOperationDescription> listOperations() {
        PagedIterable<CsmOperationDescriptionInner> inner = this.serviceClient().listOperations();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CsmOperationDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmOperationDescription> listOperations(Context context) {
        PagedIterable<CsmOperationDescriptionInner> inner = this.serviceClient().listOperations(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CsmOperationDescriptionImpl(inner1, this.manager()));
    }

    private CertificateRegistrationProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
