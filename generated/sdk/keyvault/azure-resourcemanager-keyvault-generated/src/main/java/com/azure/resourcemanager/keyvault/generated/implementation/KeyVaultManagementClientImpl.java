// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.keyvault.generated.fluent.KeysClient;
import com.azure.resourcemanager.keyvault.generated.fluent.KeyVaultManagementClient;
import com.azure.resourcemanager.keyvault.generated.fluent.ManagedHsmKeysClient;
import com.azure.resourcemanager.keyvault.generated.fluent.ManagedHsmsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.MhsmPrivateEndpointConnectionsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.MhsmPrivateLinkResourcesClient;
import com.azure.resourcemanager.keyvault.generated.fluent.MhsmRegionsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.OperationsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.keyvault.generated.fluent.SecretsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.VaultsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the KeyVaultManagementClientImpl type.
 */
@ServiceClient(builder = KeyVaultManagementClientBuilder.class)
public final class KeyVaultManagementClientImpl implements KeyVaultManagementClient {
    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The KeysClient object to access its operations.
     */
    private final KeysClient keys;

    /**
     * Gets the KeysClient object to access its operations.
     * 
     * @return the KeysClient object.
     */
    public KeysClient getKeys() {
        return this.keys;
    }

    /**
     * The ManagedHsmKeysClient object to access its operations.
     */
    private final ManagedHsmKeysClient managedHsmKeys;

    /**
     * Gets the ManagedHsmKeysClient object to access its operations.
     * 
     * @return the ManagedHsmKeysClient object.
     */
    public ManagedHsmKeysClient getManagedHsmKeys() {
        return this.managedHsmKeys;
    }

    /**
     * The VaultsClient object to access its operations.
     */
    private final VaultsClient vaults;

    /**
     * Gets the VaultsClient object to access its operations.
     * 
     * @return the VaultsClient object.
     */
    public VaultsClient getVaults() {
        return this.vaults;
    }

    /**
     * The PrivateEndpointConnectionsClient object to access its operations.
     */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The PrivateLinkResourcesClient object to access its operations.
     */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The ManagedHsmsClient object to access its operations.
     */
    private final ManagedHsmsClient managedHsms;

    /**
     * Gets the ManagedHsmsClient object to access its operations.
     * 
     * @return the ManagedHsmsClient object.
     */
    public ManagedHsmsClient getManagedHsms() {
        return this.managedHsms;
    }

    /**
     * The MhsmPrivateEndpointConnectionsClient object to access its operations.
     */
    private final MhsmPrivateEndpointConnectionsClient mhsmPrivateEndpointConnections;

    /**
     * Gets the MhsmPrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the MhsmPrivateEndpointConnectionsClient object.
     */
    public MhsmPrivateEndpointConnectionsClient getMhsmPrivateEndpointConnections() {
        return this.mhsmPrivateEndpointConnections;
    }

    /**
     * The MhsmPrivateLinkResourcesClient object to access its operations.
     */
    private final MhsmPrivateLinkResourcesClient mhsmPrivateLinkResources;

    /**
     * Gets the MhsmPrivateLinkResourcesClient object to access its operations.
     * 
     * @return the MhsmPrivateLinkResourcesClient object.
     */
    public MhsmPrivateLinkResourcesClient getMhsmPrivateLinkResources() {
        return this.mhsmPrivateLinkResources;
    }

    /**
     * The MhsmRegionsClient object to access its operations.
     */
    private final MhsmRegionsClient mhsmRegions;

    /**
     * Gets the MhsmRegionsClient object to access its operations.
     * 
     * @return the MhsmRegionsClient object.
     */
    public MhsmRegionsClient getMhsmRegions() {
        return this.mhsmRegions;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The SecretsClient object to access its operations.
     */
    private final SecretsClient secrets;

    /**
     * Gets the SecretsClient object to access its operations.
     * 
     * @return the SecretsClient object.
     */
    public SecretsClient getSecrets() {
        return this.secrets;
    }

    /**
     * Initializes an instance of KeyVaultManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    KeyVaultManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-07-01";
        this.keys = new KeysClientImpl(this);
        this.managedHsmKeys = new ManagedHsmKeysClientImpl(this);
        this.vaults = new VaultsClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.managedHsms = new ManagedHsmsClientImpl(this);
        this.mhsmPrivateEndpointConnections = new MhsmPrivateEndpointConnectionsClientImpl(this);
        this.mhsmPrivateLinkResources = new MhsmPrivateLinkResourcesClientImpl(this);
        this.mhsmRegions = new MhsmRegionsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.secrets = new SecretsClientImpl(this);
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
        return CoreUtils.mergeContexts(this.getContext(), context);
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
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline, Type pollResultType, Type finalResultType, Context context) {
        return PollerFactory.create(serializerAdapter, httpPipeline, pollResultType, finalResultType,
            defaultPollInterval, activationResponse, context);
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
                errorResponse = new HttpResponseImpl(lroError.getResponseStatusCode(), lroError.getResponseHeaders(),
                    lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError = this.getSerializerAdapter()
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
            return httpHeaders.getValue(HttpHeaderName.fromString(s));
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

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultManagementClientImpl.class);
}
