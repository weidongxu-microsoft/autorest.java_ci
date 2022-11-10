// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.compute.generated.fluent.CommunityGalleryImageVersionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageVersionInner;
import com.azure.resourcemanager.compute.generated.models.ApiErrorException;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImageVersionList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CommunityGalleryImageVersionsClient. */
public final class CommunityGalleryImageVersionsClientImpl implements CommunityGalleryImageVersionsClient {
    /** The proxy service used to perform REST calls. */
    private final CommunityGalleryImageVersionsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of CommunityGalleryImageVersionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CommunityGalleryImageVersionsClientImpl(ComputeManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    CommunityGalleryImageVersionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientCommunityGalleryImageVersions to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    public interface CommunityGalleryImageVersionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/communityGalleries"
                + "/{publicGalleryName}/images/{galleryImageName}/versions/{galleryImageVersionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CommunityGalleryImageVersionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("publicGalleryName") String publicGalleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @PathParam("galleryImageVersionName") String galleryImageVersionName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/communityGalleries"
                + "/{publicGalleryName}/images/{galleryImageName}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CommunityGalleryImageVersionList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("publicGalleryName") String publicGalleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CommunityGalleryImageVersionList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a community gallery image version.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param galleryImageVersionName The name of the community gallery image version. Needs to follow semantic version
     *     name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     *     integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image version along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CommunityGalleryImageVersionInner>> getWithResponseAsync(
        String location, String publicGalleryName, String galleryImageName, String galleryImageVersionName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        if (galleryImageVersionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter galleryImageVersionName is required and cannot be null."));
        }
        final String apiVersion = "2022-03-03";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            apiVersion,
                            publicGalleryName,
                            galleryImageName,
                            galleryImageVersionName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a community gallery image version.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param galleryImageVersionName The name of the community gallery image version. Needs to follow semantic version
     *     name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     *     integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image version along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CommunityGalleryImageVersionInner>> getWithResponseAsync(
        String location,
        String publicGalleryName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        if (galleryImageVersionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter galleryImageVersionName is required and cannot be null."));
        }
        final String apiVersion = "2022-03-03";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                apiVersion,
                publicGalleryName,
                galleryImageName,
                galleryImageVersionName,
                accept,
                context);
    }

    /**
     * Get a community gallery image version.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param galleryImageVersionName The name of the community gallery image version. Needs to follow semantic version
     *     name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     *     integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image version on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CommunityGalleryImageVersionInner> getAsync(
        String location, String publicGalleryName, String galleryImageName, String galleryImageVersionName) {
        return getWithResponseAsync(location, publicGalleryName, galleryImageName, galleryImageVersionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a community gallery image version.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param galleryImageVersionName The name of the community gallery image version. Needs to follow semantic version
     *     name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     *     integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunityGalleryImageVersionInner> getWithResponse(
        String location,
        String publicGalleryName,
        String galleryImageName,
        String galleryImageVersionName,
        Context context) {
        return getWithResponseAsync(location, publicGalleryName, galleryImageName, galleryImageVersionName, context)
            .block();
    }

    /**
     * Get a community gallery image version.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param galleryImageVersionName The name of the community gallery image version. Needs to follow semantic version
     *     name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit
     *     integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunityGalleryImageVersionInner get(
        String location, String publicGalleryName, String galleryImageName, String galleryImageVersionName) {
        return getWithResponse(location, publicGalleryName, galleryImageName, galleryImageVersionName, Context.NONE)
            .getValue();
    }

    /**
     * List community gallery image versions inside an image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageVersionInner>> listSinglePageAsync(
        String location, String publicGalleryName, String galleryImageName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String apiVersion = "2022-03-03";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            apiVersion,
                            publicGalleryName,
                            galleryImageName,
                            accept,
                            context))
            .<PagedResponse<CommunityGalleryImageVersionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List community gallery image versions inside an image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageVersionInner>> listSinglePageAsync(
        String location, String publicGalleryName, String galleryImageName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publicGalleryName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter publicGalleryName is required and cannot be null."));
        }
        if (galleryImageName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter galleryImageName is required and cannot be null."));
        }
        final String apiVersion = "2022-03-03";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                apiVersion,
                publicGalleryName,
                galleryImageName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List community gallery image versions inside an image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CommunityGalleryImageVersionInner> listAsync(
        String location, String publicGalleryName, String galleryImageName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, publicGalleryName, galleryImageName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List community gallery image versions inside an image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CommunityGalleryImageVersionInner> listAsync(
        String location, String publicGalleryName, String galleryImageName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, publicGalleryName, galleryImageName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List community gallery image versions inside an image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CommunityGalleryImageVersionInner> list(
        String location, String publicGalleryName, String galleryImageName) {
        return new PagedIterable<>(listAsync(location, publicGalleryName, galleryImageName));
    }

    /**
     * List community gallery image versions inside an image.
     *
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CommunityGalleryImageVersionInner> list(
        String location, String publicGalleryName, String galleryImageName, Context context) {
        return new PagedIterable<>(listAsync(location, publicGalleryName, galleryImageName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageVersionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<CommunityGalleryImageVersionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Image versions operation response along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CommunityGalleryImageVersionInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
