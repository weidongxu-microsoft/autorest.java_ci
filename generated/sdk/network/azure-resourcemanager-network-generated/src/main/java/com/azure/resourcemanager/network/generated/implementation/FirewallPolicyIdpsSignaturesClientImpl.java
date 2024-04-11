// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.network.generated.fluent.FirewallPolicyIdpsSignaturesClient;
import com.azure.resourcemanager.network.generated.fluent.models.QueryResultsInner;
import com.azure.resourcemanager.network.generated.models.IdpsQueryObject;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in FirewallPolicyIdpsSignaturesClient.
 */
public final class FirewallPolicyIdpsSignaturesClientImpl implements FirewallPolicyIdpsSignaturesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FirewallPolicyIdpsSignaturesService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of FirewallPolicyIdpsSignaturesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    FirewallPolicyIdpsSignaturesClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(FirewallPolicyIdpsSignaturesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientFirewallPolicyIdpsSignatures to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface FirewallPolicyIdpsSignaturesService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/listIdpsSignatures")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QueryResultsInner>> list(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") IdpsQueryObject parameters, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves the current status of IDPS signatures for the relevant policy. Maximal amount of returned signatures is
     * 1000.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will describe the query to run against the IDPS signatures DB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResultsInner>> listWithResponseAsync(String resourceGroupName, String firewallPolicyName,
        IdpsQueryObject parameters) {
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
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                this.client.getSubscriptionId(), apiVersion, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the current status of IDPS signatures for the relevant policy. Maximal amount of returned signatures is
     * 1000.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will describe the query to run against the IDPS signatures DB.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResultsInner>> listWithResponseAsync(String resourceGroupName, String firewallPolicyName,
        IdpsQueryObject parameters, Context context) {
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
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
            this.client.getSubscriptionId(), apiVersion, parameters, accept, context);
    }

    /**
     * Retrieves the current status of IDPS signatures for the relevant policy. Maximal amount of returned signatures is
     * 1000.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will describe the query to run against the IDPS signatures DB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QueryResultsInner> listAsync(String resourceGroupName, String firewallPolicyName,
        IdpsQueryObject parameters) {
        return listWithResponseAsync(resourceGroupName, firewallPolicyName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves the current status of IDPS signatures for the relevant policy. Maximal amount of returned signatures is
     * 1000.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will describe the query to run against the IDPS signatures DB.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueryResultsInner> listWithResponse(String resourceGroupName, String firewallPolicyName,
        IdpsQueryObject parameters, Context context) {
        return listWithResponseAsync(resourceGroupName, firewallPolicyName, parameters, context).block();
    }

    /**
     * Retrieves the current status of IDPS signatures for the relevant policy. Maximal amount of returned signatures is
     * 1000.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Will describe the query to run against the IDPS signatures DB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueryResultsInner list(String resourceGroupName, String firewallPolicyName, IdpsQueryObject parameters) {
        return listWithResponse(resourceGroupName, firewallPolicyName, parameters, Context.NONE).getValue();
    }
}
