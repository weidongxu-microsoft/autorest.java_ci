// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

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
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.azurekusto.generated.fluent.AttachedDatabaseConfigurationsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.ClusterPrincipalAssignmentsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.ClustersClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.DataConnectionsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.DatabasePrincipalAssignmentsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.DatabasesClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.KustoManagementClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.ManagedPrivateEndpointsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.OperationsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.OperationsResultsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.OperationsResultsLocationsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.ScriptsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.SkusClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the KustoManagementClientImpl type. */
@ServiceClient(builder = KustoManagementClientBuilder.class)
public final class KustoManagementClientImpl implements KustoManagementClient {
    /**
     * Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID
     * forms part of the URI for every service call.
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

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
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

    /** The ClustersClient object to access its operations. */
    private final ClustersClient clusters;

    /**
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    public ClustersClient getClusters() {
        return this.clusters;
    }

    /** The ClusterPrincipalAssignmentsClient object to access its operations. */
    private final ClusterPrincipalAssignmentsClient clusterPrincipalAssignments;

    /**
     * Gets the ClusterPrincipalAssignmentsClient object to access its operations.
     *
     * @return the ClusterPrincipalAssignmentsClient object.
     */
    public ClusterPrincipalAssignmentsClient getClusterPrincipalAssignments() {
        return this.clusterPrincipalAssignments;
    }

    /** The SkusClient object to access its operations. */
    private final SkusClient skus;

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    public SkusClient getSkus() {
        return this.skus;
    }

    /** The DatabasesClient object to access its operations. */
    private final DatabasesClient databases;

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    public DatabasesClient getDatabases() {
        return this.databases;
    }

    /** The AttachedDatabaseConfigurationsClient object to access its operations. */
    private final AttachedDatabaseConfigurationsClient attachedDatabaseConfigurations;

    /**
     * Gets the AttachedDatabaseConfigurationsClient object to access its operations.
     *
     * @return the AttachedDatabaseConfigurationsClient object.
     */
    public AttachedDatabaseConfigurationsClient getAttachedDatabaseConfigurations() {
        return this.attachedDatabaseConfigurations;
    }

    /** The ManagedPrivateEndpointsClient object to access its operations. */
    private final ManagedPrivateEndpointsClient managedPrivateEndpoints;

    /**
     * Gets the ManagedPrivateEndpointsClient object to access its operations.
     *
     * @return the ManagedPrivateEndpointsClient object.
     */
    public ManagedPrivateEndpointsClient getManagedPrivateEndpoints() {
        return this.managedPrivateEndpoints;
    }

    /** The DatabasePrincipalAssignmentsClient object to access its operations. */
    private final DatabasePrincipalAssignmentsClient databasePrincipalAssignments;

    /**
     * Gets the DatabasePrincipalAssignmentsClient object to access its operations.
     *
     * @return the DatabasePrincipalAssignmentsClient object.
     */
    public DatabasePrincipalAssignmentsClient getDatabasePrincipalAssignments() {
        return this.databasePrincipalAssignments;
    }

    /** The ScriptsClient object to access its operations. */
    private final ScriptsClient scripts;

    /**
     * Gets the ScriptsClient object to access its operations.
     *
     * @return the ScriptsClient object.
     */
    public ScriptsClient getScripts() {
        return this.scripts;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The DataConnectionsClient object to access its operations. */
    private final DataConnectionsClient dataConnections;

    /**
     * Gets the DataConnectionsClient object to access its operations.
     *
     * @return the DataConnectionsClient object.
     */
    public DataConnectionsClient getDataConnections() {
        return this.dataConnections;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The OperationsResultsClient object to access its operations. */
    private final OperationsResultsClient operationsResults;

    /**
     * Gets the OperationsResultsClient object to access its operations.
     *
     * @return the OperationsResultsClient object.
     */
    public OperationsResultsClient getOperationsResults() {
        return this.operationsResults;
    }

    /** The OperationsResultsLocationsClient object to access its operations. */
    private final OperationsResultsLocationsClient operationsResultsLocations;

    /**
     * Gets the OperationsResultsLocationsClient object to access its operations.
     *
     * @return the OperationsResultsLocationsClient object.
     */
    public OperationsResultsLocationsClient getOperationsResultsLocations() {
        return this.operationsResultsLocations;
    }

    /**
     * Initializes an instance of KustoManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Gets subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    KustoManagementClientImpl(
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
        this.apiVersion = "2022-12-29";
        this.clusters = new ClustersClientImpl(this);
        this.clusterPrincipalAssignments = new ClusterPrincipalAssignmentsClientImpl(this);
        this.skus = new SkusClientImpl(this);
        this.databases = new DatabasesClientImpl(this);
        this.attachedDatabaseConfigurations = new AttachedDatabaseConfigurationsClientImpl(this);
        this.managedPrivateEndpoints = new ManagedPrivateEndpointsClientImpl(this);
        this.databasePrincipalAssignments = new DatabasePrincipalAssignmentsClientImpl(this);
        this.scripts = new ScriptsClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.dataConnections = new DataConnectionsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.operationsResults = new OperationsResultsClientImpl(this);
        this.operationsResultsLocations = new OperationsResultsLocationsClientImpl(this);
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

    private static final ClientLogger LOGGER = new ClientLogger(KustoManagementClientImpl.class);
}
