// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.AnnotationsClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.AnnotationInner;
import com.azure.resourcemanager.applicationinsights.generated.models.Annotation;
import com.azure.resourcemanager.applicationinsights.generated.models.Annotations;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class AnnotationsImpl implements Annotations {
    private static final ClientLogger LOGGER = new ClientLogger(AnnotationsImpl.class);

    private final AnnotationsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public AnnotationsImpl(
        AnnotationsClient innerClient,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Annotation> list(String resourceGroupName, String resourceName, String start, String end) {
        PagedIterable<AnnotationInner> inner = this.serviceClient().list(resourceGroupName, resourceName, start, end);
        return Utils.mapPage(inner, inner1 -> new AnnotationImpl(inner1, this.manager()));
    }

    public PagedIterable<Annotation> list(
        String resourceGroupName, String resourceName, String start, String end, Context context) {
        PagedIterable<AnnotationInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, start, end, context);
        return Utils.mapPage(inner, inner1 -> new AnnotationImpl(inner1, this.manager()));
    }

    public List<Annotation> create(
        String resourceGroupName, String resourceName, AnnotationInner annotationProperties) {
        List<AnnotationInner> inner =
            this.serviceClient().create(resourceGroupName, resourceName, annotationProperties);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new AnnotationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<Annotation>> createWithResponse(
        String resourceGroupName, String resourceName, AnnotationInner annotationProperties, Context context) {
        Response<List<AnnotationInner>> inner =
            this.serviceClient().createWithResponse(resourceGroupName, resourceName, annotationProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new AnnotationImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourceName, String annotationId) {
        this.serviceClient().delete(resourceGroupName, resourceName, annotationId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String annotationId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, annotationId, context);
    }

    public List<Annotation> get(String resourceGroupName, String resourceName, String annotationId) {
        List<AnnotationInner> inner = this.serviceClient().get(resourceGroupName, resourceName, annotationId);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new AnnotationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<Annotation>> getWithResponse(
        String resourceGroupName, String resourceName, String annotationId, Context context) {
        Response<List<AnnotationInner>> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, annotationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new AnnotationImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    private AnnotationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
