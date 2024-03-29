// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.CertificateOrdersDiagnosticsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrdersDiagnostics;
import com.azure.resourcemanager.appservice.generated.models.DetectorResponse;
import java.time.OffsetDateTime;

public final class CertificateOrdersDiagnosticsImpl implements CertificateOrdersDiagnostics {
    private static final ClientLogger LOGGER = new ClientLogger(CertificateOrdersDiagnosticsImpl.class);

    private final CertificateOrdersDiagnosticsClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public CertificateOrdersDiagnosticsImpl(CertificateOrdersDiagnosticsClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DetectorResponse> listAppServiceCertificateOrderDetectorResponse(String resourceGroupName,
        String certificateOrderName) {
        PagedIterable<DetectorResponseInner> inner = this.serviceClient()
            .listAppServiceCertificateOrderDetectorResponse(resourceGroupName, certificateOrderName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<DetectorResponse> listAppServiceCertificateOrderDetectorResponse(String resourceGroupName,
        String certificateOrderName, Context context) {
        PagedIterable<DetectorResponseInner> inner = this.serviceClient()
            .listAppServiceCertificateOrderDetectorResponse(resourceGroupName, certificateOrderName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public Response<DetectorResponse> getAppServiceCertificateOrderDetectorResponseWithResponse(
        String resourceGroupName, String certificateOrderName, String detectorName, OffsetDateTime startTime,
        OffsetDateTime endTime, String timeGrain, Context context) {
        Response<DetectorResponseInner> inner = this.serviceClient()
            .getAppServiceCertificateOrderDetectorResponseWithResponse(resourceGroupName, certificateOrderName,
                detectorName, startTime, endTime, timeGrain, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DetectorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DetectorResponse getAppServiceCertificateOrderDetectorResponse(String resourceGroupName,
        String certificateOrderName, String detectorName) {
        DetectorResponseInner inner = this.serviceClient()
            .getAppServiceCertificateOrderDetectorResponse(resourceGroupName, certificateOrderName, detectorName);
        if (inner != null) {
            return new DetectorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CertificateOrdersDiagnosticsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
