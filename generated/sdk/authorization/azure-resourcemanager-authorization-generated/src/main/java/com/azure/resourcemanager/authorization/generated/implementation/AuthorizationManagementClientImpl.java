// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.authorization.generated.fluent.AuthorizationManagementClient;
import com.azure.resourcemanager.authorization.generated.fluent.ClassicAdministratorsClient;
import com.azure.resourcemanager.authorization.generated.fluent.DenyAssignmentsClient;
import com.azure.resourcemanager.authorization.generated.fluent.GlobalAdministratorsClient;
import com.azure.resourcemanager.authorization.generated.fluent.PermissionsClient;
import com.azure.resourcemanager.authorization.generated.fluent.ProviderOperationsMetadatasClient;
import com.azure.resourcemanager.authorization.generated.fluent.RoleAssignmentsClient;
import com.azure.resourcemanager.authorization.generated.fluent.RoleDefinitionsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AuthorizationManagementClientImpl type. */
@ServiceClient(builder = AuthorizationManagementClientBuilder.class)
public final class AuthorizationManagementClientImpl implements AuthorizationManagementClient {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The ClassicAdministratorsClient object to access its operations. */
    private final ClassicAdministratorsClient classicAdministrators;

    /**
     * Gets the ClassicAdministratorsClient object to access its operations.
     *
     * @return the ClassicAdministratorsClient object.
     */
    public ClassicAdministratorsClient getClassicAdministrators() {
        return this.classicAdministrators;
    }

    /** The GlobalAdministratorsClient object to access its operations. */
    private final GlobalAdministratorsClient globalAdministrators;

    /**
     * Gets the GlobalAdministratorsClient object to access its operations.
     *
     * @return the GlobalAdministratorsClient object.
     */
    public GlobalAdministratorsClient getGlobalAdministrators() {
        return this.globalAdministrators;
    }

    /** The ProviderOperationsMetadatasClient object to access its operations. */
    private final ProviderOperationsMetadatasClient providerOperationsMetadatas;

    /**
     * Gets the ProviderOperationsMetadatasClient object to access its operations.
     *
     * @return the ProviderOperationsMetadatasClient object.
     */
    public ProviderOperationsMetadatasClient getProviderOperationsMetadatas() {
        return this.providerOperationsMetadatas;
    }

    /** The RoleAssignmentsClient object to access its operations. */
    private final RoleAssignmentsClient roleAssignments;

    /**
     * Gets the RoleAssignmentsClient object to access its operations.
     *
     * @return the RoleAssignmentsClient object.
     */
    public RoleAssignmentsClient getRoleAssignments() {
        return this.roleAssignments;
    }

    /** The PermissionsClient object to access its operations. */
    private final PermissionsClient permissions;

    /**
     * Gets the PermissionsClient object to access its operations.
     *
     * @return the PermissionsClient object.
     */
    public PermissionsClient getPermissions() {
        return this.permissions;
    }

    /** The RoleDefinitionsClient object to access its operations. */
    private final RoleDefinitionsClient roleDefinitions;

    /**
     * Gets the RoleDefinitionsClient object to access its operations.
     *
     * @return the RoleDefinitionsClient object.
     */
    public RoleDefinitionsClient getRoleDefinitions() {
        return this.roleDefinitions;
    }

    /** The DenyAssignmentsClient object to access its operations. */
    private final DenyAssignmentsClient denyAssignments;

    /**
     * Gets the DenyAssignmentsClient object to access its operations.
     *
     * @return the DenyAssignmentsClient object.
     */
    public DenyAssignmentsClient getDenyAssignments() {
        return this.denyAssignments;
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    AuthorizationManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.classicAdministrators = new ClassicAdministratorsClientImpl(this);
        this.globalAdministrators = new GlobalAdministratorsClientImpl(this);
        this.providerOperationsMetadatas = new ProviderOperationsMetadatasClientImpl(this);
        this.roleAssignments = new RoleAssignmentsClientImpl(this);
        this.permissions = new PermissionsClientImpl(this);
        this.roleDefinitions = new RoleDefinitionsClientImpl(this);
        this.denyAssignments = new DenyAssignmentsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AuthorizationManagementClientImpl.class);
}
