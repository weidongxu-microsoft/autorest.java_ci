// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

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
import com.azure.resourcemanager.operationalinsights.generated.fluent.AvailableServiceTiersClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.ClustersClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.DataExportsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.DataSourcesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.DeletedWorkspacesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.GatewaysClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.IntelligencePacksClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.LinkedServicesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.LinkedStorageAccountsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.ManagementGroupsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.OperationStatusesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.OperationalInsightsManagementClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.OperationsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.SavedSearchesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.SchemasClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.SharedKeysOperationsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.StorageInsightConfigsClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.TablesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.UsagesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.WorkspacePurgesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.WorkspacesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the OperationalInsightsManagementClientImpl type. */
@ServiceClient(builder = OperationalInsightsManagementClientBuilder.class)
public final class OperationalInsightsManagementClientImpl implements OperationalInsightsManagementClient {
    private final ClientLogger logger = new ClientLogger(OperationalInsightsManagementClientImpl.class);

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

    /** The DataExportsClient object to access its operations. */
    private final DataExportsClient dataExports;

    /**
     * Gets the DataExportsClient object to access its operations.
     *
     * @return the DataExportsClient object.
     */
    public DataExportsClient getDataExports() {
        return this.dataExports;
    }

    /** The DataSourcesClient object to access its operations. */
    private final DataSourcesClient dataSources;

    /**
     * Gets the DataSourcesClient object to access its operations.
     *
     * @return the DataSourcesClient object.
     */
    public DataSourcesClient getDataSources() {
        return this.dataSources;
    }

    /** The IntelligencePacksClient object to access its operations. */
    private final IntelligencePacksClient intelligencePacks;

    /**
     * Gets the IntelligencePacksClient object to access its operations.
     *
     * @return the IntelligencePacksClient object.
     */
    public IntelligencePacksClient getIntelligencePacks() {
        return this.intelligencePacks;
    }

    /** The LinkedServicesClient object to access its operations. */
    private final LinkedServicesClient linkedServices;

    /**
     * Gets the LinkedServicesClient object to access its operations.
     *
     * @return the LinkedServicesClient object.
     */
    public LinkedServicesClient getLinkedServices() {
        return this.linkedServices;
    }

    /** The LinkedStorageAccountsClient object to access its operations. */
    private final LinkedStorageAccountsClient linkedStorageAccounts;

    /**
     * Gets the LinkedStorageAccountsClient object to access its operations.
     *
     * @return the LinkedStorageAccountsClient object.
     */
    public LinkedStorageAccountsClient getLinkedStorageAccounts() {
        return this.linkedStorageAccounts;
    }

    /** The ManagementGroupsClient object to access its operations. */
    private final ManagementGroupsClient managementGroups;

    /**
     * Gets the ManagementGroupsClient object to access its operations.
     *
     * @return the ManagementGroupsClient object.
     */
    public ManagementGroupsClient getManagementGroups() {
        return this.managementGroups;
    }

    /** The OperationStatusesClient object to access its operations. */
    private final OperationStatusesClient operationStatuses;

    /**
     * Gets the OperationStatusesClient object to access its operations.
     *
     * @return the OperationStatusesClient object.
     */
    public OperationStatusesClient getOperationStatuses() {
        return this.operationStatuses;
    }

    /** The SharedKeysOperationsClient object to access its operations. */
    private final SharedKeysOperationsClient sharedKeysOperations;

    /**
     * Gets the SharedKeysOperationsClient object to access its operations.
     *
     * @return the SharedKeysOperationsClient object.
     */
    public SharedKeysOperationsClient getSharedKeysOperations() {
        return this.sharedKeysOperations;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /** The StorageInsightConfigsClient object to access its operations. */
    private final StorageInsightConfigsClient storageInsightConfigs;

    /**
     * Gets the StorageInsightConfigsClient object to access its operations.
     *
     * @return the StorageInsightConfigsClient object.
     */
    public StorageInsightConfigsClient getStorageInsightConfigs() {
        return this.storageInsightConfigs;
    }

    /** The SavedSearchesClient object to access its operations. */
    private final SavedSearchesClient savedSearches;

    /**
     * Gets the SavedSearchesClient object to access its operations.
     *
     * @return the SavedSearchesClient object.
     */
    public SavedSearchesClient getSavedSearches() {
        return this.savedSearches;
    }

    /** The AvailableServiceTiersClient object to access its operations. */
    private final AvailableServiceTiersClient availableServiceTiers;

    /**
     * Gets the AvailableServiceTiersClient object to access its operations.
     *
     * @return the AvailableServiceTiersClient object.
     */
    public AvailableServiceTiersClient getAvailableServiceTiers() {
        return this.availableServiceTiers;
    }

    /** The GatewaysClient object to access its operations. */
    private final GatewaysClient gateways;

    /**
     * Gets the GatewaysClient object to access its operations.
     *
     * @return the GatewaysClient object.
     */
    public GatewaysClient getGateways() {
        return this.gateways;
    }

    /** The SchemasClient object to access its operations. */
    private final SchemasClient schemas;

    /**
     * Gets the SchemasClient object to access its operations.
     *
     * @return the SchemasClient object.
     */
    public SchemasClient getSchemas() {
        return this.schemas;
    }

    /** The WorkspacePurgesClient object to access its operations. */
    private final WorkspacePurgesClient workspacePurges;

    /**
     * Gets the WorkspacePurgesClient object to access its operations.
     *
     * @return the WorkspacePurgesClient object.
     */
    public WorkspacePurgesClient getWorkspacePurges() {
        return this.workspacePurges;
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

    /** The TablesClient object to access its operations. */
    private final TablesClient tables;

    /**
     * Gets the TablesClient object to access its operations.
     *
     * @return the TablesClient object.
     */
    public TablesClient getTables() {
        return this.tables;
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

    /** The WorkspacesClient object to access its operations. */
    private final WorkspacesClient workspaces;

    /**
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    public WorkspacesClient getWorkspaces() {
        return this.workspaces;
    }

    /** The DeletedWorkspacesClient object to access its operations. */
    private final DeletedWorkspacesClient deletedWorkspaces;

    /**
     * Gets the DeletedWorkspacesClient object to access its operations.
     *
     * @return the DeletedWorkspacesClient object.
     */
    public DeletedWorkspacesClient getDeletedWorkspaces() {
        return this.deletedWorkspaces;
    }

    /**
     * Initializes an instance of OperationalInsightsManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    OperationalInsightsManagementClientImpl(
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
        this.dataExports = new DataExportsClientImpl(this);
        this.dataSources = new DataSourcesClientImpl(this);
        this.intelligencePacks = new IntelligencePacksClientImpl(this);
        this.linkedServices = new LinkedServicesClientImpl(this);
        this.linkedStorageAccounts = new LinkedStorageAccountsClientImpl(this);
        this.managementGroups = new ManagementGroupsClientImpl(this);
        this.operationStatuses = new OperationStatusesClientImpl(this);
        this.sharedKeysOperations = new SharedKeysOperationsClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.storageInsightConfigs = new StorageInsightConfigsClientImpl(this);
        this.savedSearches = new SavedSearchesClientImpl(this);
        this.availableServiceTiers = new AvailableServiceTiersClientImpl(this);
        this.gateways = new GatewaysClientImpl(this);
        this.schemas = new SchemasClientImpl(this);
        this.workspacePurges = new WorkspacePurgesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.tables = new TablesClientImpl(this);
        this.clusters = new ClustersClientImpl(this);
        this.workspaces = new WorkspacesClientImpl(this);
        this.deletedWorkspaces = new DeletedWorkspacesClientImpl(this);
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
                        logger.logThrowableAsWarning(ioe);
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
}
