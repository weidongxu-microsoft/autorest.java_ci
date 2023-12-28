// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.network.generated.fluent.FirewallPolicyIdpsSignaturesOverridesClient;
import com.azure.resourcemanager.network.generated.fluent.models.SignaturesOverridesInner;
import com.azure.resourcemanager.network.generated.fluent.models.SignaturesOverridesListInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * FirewallPolicyIdpsSignaturesOverridesClient.
 */
public final class FirewallPolicyIdpsSignaturesOverridesClientImpl
    implements FirewallPolicyIdpsSignaturesOverridesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FirewallPolicyIdpsSignaturesOverridesService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of FirewallPolicyIdpsSignaturesOverridesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    FirewallPolicyIdpsSignaturesOverridesClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(FirewallPolicyIdpsSignaturesOverridesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientFirewallPolicyIdpsSignaturesOverrides to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface FirewallPolicyIdpsSignaturesOverridesService {
        @Headers({ "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/signatureOverrides/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SignaturesOverridesInner>> patch(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SignaturesOverridesInner parameters, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/signatureOverrides/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SignaturesOverridesInner>> put(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SignaturesOverridesInner parameters, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/signatureOverrides/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SignaturesOverridesInner>> get(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/signatureOverrides")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SignaturesOverridesListInner>> list(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Will update the status of policy's signature overrides for IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesInner>> patchWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, SignaturesOverridesInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.patch(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                this.client.getSubscriptionId(), apiVersion, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Will update the status of policy's signature overrides for IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesInner>> patchWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, SignaturesOverridesInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.patch(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
            this.client.getSubscriptionId(), apiVersion, parameters, accept, context);
    }

    /**
     * Will update the status of policy's signature overrides for IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignaturesOverridesInner> patchAsync(String resourceGroupName, String firewallPolicyName,
        SignaturesOverridesInner parameters) {
        return patchWithResponseAsync(resourceGroupName, firewallPolicyName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Will update the status of policy's signature overrides for IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SignaturesOverridesInner> patchWithResponse(String resourceGroupName, String firewallPolicyName,
        SignaturesOverridesInner parameters, Context context) {
        return patchWithResponseAsync(resourceGroupName, firewallPolicyName, parameters, context).block();
    }

    /**
     * Will update the status of policy's signature overrides for IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SignaturesOverridesInner patch(String resourceGroupName, String firewallPolicyName,
        SignaturesOverridesInner parameters) {
        return patchWithResponse(resourceGroupName, firewallPolicyName, parameters, Context.NONE).getValue();
    }

    /**
     * Will override/create a new signature overrides for the policy's IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesInner>> putWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, SignaturesOverridesInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.put(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                this.client.getSubscriptionId(), apiVersion, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Will override/create a new signature overrides for the policy's IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesInner>> putWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, SignaturesOverridesInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.put(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
            this.client.getSubscriptionId(), apiVersion, parameters, accept, context);
    }

    /**
     * Will override/create a new signature overrides for the policy's IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignaturesOverridesInner> putAsync(String resourceGroupName, String firewallPolicyName,
        SignaturesOverridesInner parameters) {
        return putWithResponseAsync(resourceGroupName, firewallPolicyName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Will override/create a new signature overrides for the policy's IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SignaturesOverridesInner> putWithResponse(String resourceGroupName, String firewallPolicyName,
        SignaturesOverridesInner parameters, Context context) {
        return putWithResponseAsync(resourceGroupName, firewallPolicyName, parameters, context).block();
    }

    /**
     * Will override/create a new signature overrides for the policy's IDPS.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will contain all properties of the object to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SignaturesOverridesInner put(String resourceGroupName, String firewallPolicyName,
        SignaturesOverridesInner parameters) {
        return putWithResponse(resourceGroupName, firewallPolicyName, parameters, Context.NONE).getValue();
    }

    /**
     * Returns all signatures overrides for a specific policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesInner>> getWithResponseAsync(String resourceGroupName,
        String firewallPolicyName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                this.client.getSubscriptionId(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns all signatures overrides for a specific policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesInner>> getWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
            this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Returns all signatures overrides for a specific policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignaturesOverridesInner> getAsync(String resourceGroupName, String firewallPolicyName) {
        return getWithResponseAsync(resourceGroupName, firewallPolicyName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns all signatures overrides for a specific policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SignaturesOverridesInner> getWithResponse(String resourceGroupName, String firewallPolicyName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, firewallPolicyName, context).block();
    }

    /**
     * Returns all signatures overrides for a specific policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all specific policy signatures overrides for the IDPS.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SignaturesOverridesInner get(String resourceGroupName, String firewallPolicyName) {
        return getWithResponse(resourceGroupName, firewallPolicyName, Context.NONE).getValue();
    }

    /**
     * Returns all signatures overrides objects for a specific policy as a list containing a single value.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an object containing an array with a single item along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesListInner>> listWithResponseAsync(String resourceGroupName,
        String firewallPolicyName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                this.client.getSubscriptionId(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns all signatures overrides objects for a specific policy as a list containing a single value.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an object containing an array with a single item along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignaturesOverridesListInner>> listWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
            this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Returns all signatures overrides objects for a specific policy as a list containing a single value.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an object containing an array with a single item on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SignaturesOverridesListInner> listAsync(String resourceGroupName, String firewallPolicyName) {
        return listWithResponseAsync(resourceGroupName, firewallPolicyName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns all signatures overrides objects for a specific policy as a list containing a single value.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an object containing an array with a single item along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SignaturesOverridesListInner> listWithResponse(String resourceGroupName, String firewallPolicyName,
        Context context) {
        return listWithResponseAsync(resourceGroupName, firewallPolicyName, context).block();
    }

    /**
     * Returns all signatures overrides objects for a specific policy as a list containing a single value.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an object containing an array with a single item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SignaturesOverridesListInner list(String resourceGroupName, String firewallPolicyName) {
        return listWithResponse(resourceGroupName, firewallPolicyName, Context.NONE).getValue();
    }
}
