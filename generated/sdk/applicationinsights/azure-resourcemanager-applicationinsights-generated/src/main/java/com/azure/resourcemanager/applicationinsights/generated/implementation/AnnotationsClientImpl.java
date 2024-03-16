// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.applicationinsights.generated.fluent.AnnotationsClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.AnnotationInner;
import com.azure.resourcemanager.applicationinsights.generated.models.AnnotationErrorException;
import com.azure.resourcemanager.applicationinsights.generated.models.AnnotationsListResult;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in AnnotationsClient.
 */
public final class AnnotationsClientImpl implements AnnotationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AnnotationsService service;

    /**
     * The service client containing this operation class.
     */
    private final ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of AnnotationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AnnotationsClientImpl(ApplicationInsightsManagementClientImpl client) {
        this.service
            = RestProxy.create(AnnotationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApplicationInsightsManagementClientAnnotations to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApplicationInsightsM")
    public interface AnnotationsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/Annotations")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(AnnotationErrorException.class)
        Mono<Response<AnnotationsListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceName") String resourceName,
            @QueryParam("start") String start, @QueryParam("end") String end, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/Annotations")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(AnnotationErrorException.class)
        Mono<Response<List<AnnotationInner>>> create(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceName") String resourceName,
            @BodyParam("application/json") AnnotationInner annotationProperties, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/Annotations/{annotationId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceName") String resourceName,
            @PathParam("annotationId") String annotationId, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/Annotations/{annotationId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(AnnotationErrorException.class)
        Mono<Response<List<AnnotationInner>>> get(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceName") String resourceName,
            @PathParam("annotationId") String annotationId, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the list of annotations for a component for given time range.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AnnotationInner>> listSinglePageAsync(String resourceGroupName, String resourceName,
        String start, String end) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (start == null) {
            return Mono.error(new IllegalArgumentException("Parameter start is required and cannot be null."));
        }
        if (end == null) {
            return Mono.error(new IllegalArgumentException("Parameter end is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceGroupName, apiVersion,
                this.client.getSubscriptionId(), resourceName, start, end, accept, context))
            .<PagedResponse<AnnotationInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of annotations for a component for given time range.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AnnotationInner>> listSinglePageAsync(String resourceGroupName, String resourceName,
        String start, String end, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (start == null) {
            return Mono.error(new IllegalArgumentException("Parameter start is required and cannot be null."));
        }
        if (end == null) {
            return Mono.error(new IllegalArgumentException("Parameter end is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), resourceGroupName, apiVersion, this.client.getSubscriptionId(),
                resourceName, start, end, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), null, null));
    }

    /**
     * Gets the list of annotations for a component for given time range.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AnnotationInner> listAsync(String resourceGroupName, String resourceName, String start,
        String end) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, resourceName, start, end));
    }

    /**
     * Gets the list of annotations for a component for given time range.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AnnotationInner> listAsync(String resourceGroupName, String resourceName, String start,
        String end, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, resourceName, start, end, context));
    }

    /**
     * Gets the list of annotations for a component for given time range.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AnnotationInner> list(String resourceGroupName, String resourceName, String start,
        String end) {
        return new PagedIterable<>(listAsync(resourceGroupName, resourceName, start, end));
    }

    /**
     * Gets the list of annotations for a component for given time range.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AnnotationInner> list(String resourceGroupName, String resourceName, String start, String end,
        Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, resourceName, start, end, context));
    }

    /**
     * Create an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationProperties Properties that need to be specified to create an annotation of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AnnotationInner>>> createWithResponseAsync(String resourceGroupName, String resourceName,
        AnnotationInner annotationProperties) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (annotationProperties == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter annotationProperties is required and cannot be null."));
        } else {
            annotationProperties.validate();
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.create(this.client.getEndpoint(), resourceGroupName, apiVersion,
                this.client.getSubscriptionId(), resourceName, annotationProperties, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationProperties Properties that need to be specified to create an annotation of a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AnnotationInner>>> createWithResponseAsync(String resourceGroupName, String resourceName,
        AnnotationInner annotationProperties, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (annotationProperties == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter annotationProperties is required and cannot be null."));
        } else {
            annotationProperties.validate();
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.create(this.client.getEndpoint(), resourceGroupName, apiVersion, this.client.getSubscriptionId(),
            resourceName, annotationProperties, accept, context);
    }

    /**
     * Create an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationProperties Properties that need to be specified to create an annotation of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<AnnotationInner>> createAsync(String resourceGroupName, String resourceName,
        AnnotationInner annotationProperties) {
        return createWithResponseAsync(resourceGroupName, resourceName, annotationProperties)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationProperties Properties that need to be specified to create an annotation of a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<AnnotationInner>> createWithResponse(String resourceGroupName, String resourceName,
        AnnotationInner annotationProperties, Context context) {
        return createWithResponseAsync(resourceGroupName, resourceName, annotationProperties, context).block();
    }

    /**
     * Create an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationProperties Properties that need to be specified to create an annotation of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<AnnotationInner> create(String resourceGroupName, String resourceName,
        AnnotationInner annotationProperties) {
        return createWithResponse(resourceGroupName, resourceName, annotationProperties, Context.NONE).getValue();
    }

    /**
     * Delete an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String resourceName,
        String annotationId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (annotationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter annotationId is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), resourceGroupName, apiVersion,
                this.client.getSubscriptionId(), resourceName, annotationId, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Delete an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String resourceName,
        String annotationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (annotationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter annotationId is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), resourceGroupName, apiVersion, this.client.getSubscriptionId(),
            resourceName, annotationId, context);
    }

    /**
     * Delete an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String resourceName, String annotationId) {
        return deleteWithResponseAsync(resourceGroupName, resourceName, annotationId).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, String annotationId,
        Context context) {
        return deleteWithResponseAsync(resourceGroupName, resourceName, annotationId, context).block();
    }

    /**
     * Delete an Annotation of an Application Insights component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String resourceName, String annotationId) {
        deleteWithResponse(resourceGroupName, resourceName, annotationId, Context.NONE);
    }

    /**
     * Get the annotation for given id.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the annotation for given id along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AnnotationInner>>> getWithResponseAsync(String resourceGroupName, String resourceName,
        String annotationId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (annotationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter annotationId is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), resourceGroupName, apiVersion,
                this.client.getSubscriptionId(), resourceName, annotationId, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the annotation for given id.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the annotation for given id along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AnnotationInner>>> getWithResponseAsync(String resourceGroupName, String resourceName,
        String annotationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (annotationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter annotationId is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceGroupName, apiVersion, this.client.getSubscriptionId(),
            resourceName, annotationId, accept, context);
    }

    /**
     * Get the annotation for given id.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the annotation for given id on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<AnnotationInner>> getAsync(String resourceGroupName, String resourceName, String annotationId) {
        return getWithResponseAsync(resourceGroupName, resourceName, annotationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the annotation for given id.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the annotation for given id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<AnnotationInner>> getWithResponse(String resourceGroupName, String resourceName,
        String annotationId, Context context) {
        return getWithResponseAsync(resourceGroupName, resourceName, annotationId, context).block();
    }

    /**
     * Get the annotation for given id.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AnnotationErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the annotation for given id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<AnnotationInner> get(String resourceGroupName, String resourceName, String annotationId) {
        return getWithResponse(resourceGroupName, resourceName, annotationId, Context.NONE).getValue();
    }
}
