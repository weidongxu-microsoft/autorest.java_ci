// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.network.generated.fluent.ApplicationGatewayWafDynamicManifestsDefaultsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayWafDynamicManifestResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ApplicationGatewayWafDynamicManifestsDefaultsClient.
 */
public final class ApplicationGatewayWafDynamicManifestsDefaultsClientImpl
    implements ApplicationGatewayWafDynamicManifestsDefaultsClient {
    /** The proxy service used to perform REST calls. */
    private final ApplicationGatewayWafDynamicManifestsDefaultsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ApplicationGatewayWafDynamicManifestsDefaultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ApplicationGatewayWafDynamicManifestsDefaultsClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ApplicationGatewayWafDynamicManifestsDefaultsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientApplicationGatewayWafDynamicManifestsDefaults
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface ApplicationGatewayWafDynamicManifestsDefaultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/applicationGatewayWafDynamicManifests/dafault")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApplicationGatewayWafDynamicManifestResultInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationGatewayWafDynamicManifestResultInner>> getWithResponseAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            location,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationGatewayWafDynamicManifestResultInner>> getWithResponseAsync(
        String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), location, apiVersion, this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApplicationGatewayWafDynamicManifestResultInner> getAsync(String location) {
        return getWithResponseAsync(location).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationGatewayWafDynamicManifestResultInner> getWithResponse(String location, Context context) {
        return getWithResponseAsync(location, context).block();
    }

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationGatewayWafDynamicManifestResultInner get(String location) {
        return getWithResponse(location, Context.NONE).getValue();
    }
}
