// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

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
import com.azure.resourcemanager.azurekusto.generated.fluent.DatabaseOperationsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DatabaseInviteFollowerResultInner;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseInviteFollowerRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DatabaseOperationsClient. */
public final class DatabaseOperationsClientImpl implements DatabaseOperationsClient {
    /** The proxy service used to perform REST calls. */
    private final DatabaseOperationsService service;

    /** The service client containing this operation class. */
    private final KustoManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DatabaseOperationsClientImpl(KustoManagementClientImpl client) {
        this.service =
            RestProxy.create(DatabaseOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for KustoManagementClientDatabaseOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "KustoManagementClien")
    public interface DatabaseOperationsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Kusto/clusters/{clusterName}/databases/{databaseName}/inviteFollower")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseInviteFollowerResultInner>> inviteFollower(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @PathParam("databaseName") String databaseName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DatabaseInviteFollowerRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Generates an invitation token that allows attaching a follower database to this database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The follower invitation request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a follower invitation generation request along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseInviteFollowerResultInner>> inviteFollowerWithResponseAsync(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInviteFollowerRequest parameters) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .inviteFollower(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            databaseName,
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Generates an invitation token that allows attaching a follower database to this database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The follower invitation request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a follower invitation generation request along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseInviteFollowerResultInner>> inviteFollowerWithResponseAsync(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabaseInviteFollowerRequest parameters,
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .inviteFollower(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                databaseName,
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Generates an invitation token that allows attaching a follower database to this database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The follower invitation request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a follower invitation generation request on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DatabaseInviteFollowerResultInner> inviteFollowerAsync(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInviteFollowerRequest parameters) {
        return inviteFollowerWithResponseAsync(resourceGroupName, clusterName, databaseName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Generates an invitation token that allows attaching a follower database to this database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The follower invitation request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a follower invitation generation request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatabaseInviteFollowerResultInner> inviteFollowerWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabaseInviteFollowerRequest parameters,
        Context context) {
        return inviteFollowerWithResponseAsync(resourceGroupName, clusterName, databaseName, parameters, context)
            .block();
    }

    /**
     * Generates an invitation token that allows attaching a follower database to this database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The follower invitation request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a follower invitation generation request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseInviteFollowerResultInner inviteFollower(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInviteFollowerRequest parameters) {
        return inviteFollowerWithResponse(resourceGroupName, clusterName, databaseName, parameters, Context.NONE)
            .getValue();
    }
}
