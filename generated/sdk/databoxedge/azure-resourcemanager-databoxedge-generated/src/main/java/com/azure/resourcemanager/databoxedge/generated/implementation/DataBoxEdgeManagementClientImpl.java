// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

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
import com.azure.resourcemanager.databoxedge.generated.fluent.AddonsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.AlertsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.AvailableSkusClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.BandwidthSchedulesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.ContainersClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.DataBoxEdgeManagementClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.DeviceCapacityChecksClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.DeviceCapacityInfoesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.DevicesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.DiagnosticSettingsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.JobsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.MonitoringConfigsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.NodesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.OperationsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.OperationsStatusClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.OrdersClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.RolesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.SharesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.StorageAccountCredentialsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.StorageAccountsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.SupportPackagesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.TriggersClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.UsersClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the DataBoxEdgeManagementClientImpl type. */
@ServiceClient(builder = DataBoxEdgeManagementClientBuilder.class)
public final class DataBoxEdgeManagementClientImpl implements DataBoxEdgeManagementClient {
    /** The subscription ID. */
    private final String subscriptionId;

    /**
     * Gets The subscription ID.
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

    /** The AvailableSkusClient object to access its operations. */
    private final AvailableSkusClient availableSkus;

    /**
     * Gets the AvailableSkusClient object to access its operations.
     *
     * @return the AvailableSkusClient object.
     */
    public AvailableSkusClient getAvailableSkus() {
        return this.availableSkus;
    }

    /** The DevicesClient object to access its operations. */
    private final DevicesClient devices;

    /**
     * Gets the DevicesClient object to access its operations.
     *
     * @return the DevicesClient object.
     */
    public DevicesClient getDevices() {
        return this.devices;
    }

    /** The AlertsClient object to access its operations. */
    private final AlertsClient alerts;

    /**
     * Gets the AlertsClient object to access its operations.
     *
     * @return the AlertsClient object.
     */
    public AlertsClient getAlerts() {
        return this.alerts;
    }

    /** The BandwidthSchedulesClient object to access its operations. */
    private final BandwidthSchedulesClient bandwidthSchedules;

    /**
     * Gets the BandwidthSchedulesClient object to access its operations.
     *
     * @return the BandwidthSchedulesClient object.
     */
    public BandwidthSchedulesClient getBandwidthSchedules() {
        return this.bandwidthSchedules;
    }

    /** The DeviceCapacityChecksClient object to access its operations. */
    private final DeviceCapacityChecksClient deviceCapacityChecks;

    /**
     * Gets the DeviceCapacityChecksClient object to access its operations.
     *
     * @return the DeviceCapacityChecksClient object.
     */
    public DeviceCapacityChecksClient getDeviceCapacityChecks() {
        return this.deviceCapacityChecks;
    }

    /** The DeviceCapacityInfoesClient object to access its operations. */
    private final DeviceCapacityInfoesClient deviceCapacityInfoes;

    /**
     * Gets the DeviceCapacityInfoesClient object to access its operations.
     *
     * @return the DeviceCapacityInfoesClient object.
     */
    public DeviceCapacityInfoesClient getDeviceCapacityInfoes() {
        return this.deviceCapacityInfoes;
    }

    /** The DiagnosticSettingsClient object to access its operations. */
    private final DiagnosticSettingsClient diagnosticSettings;

    /**
     * Gets the DiagnosticSettingsClient object to access its operations.
     *
     * @return the DiagnosticSettingsClient object.
     */
    public DiagnosticSettingsClient getDiagnosticSettings() {
        return this.diagnosticSettings;
    }

    /** The JobsClient object to access its operations. */
    private final JobsClient jobs;

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    public JobsClient getJobs() {
        return this.jobs;
    }

    /** The NodesClient object to access its operations. */
    private final NodesClient nodes;

    /**
     * Gets the NodesClient object to access its operations.
     *
     * @return the NodesClient object.
     */
    public NodesClient getNodes() {
        return this.nodes;
    }

    /** The OperationsStatusClient object to access its operations. */
    private final OperationsStatusClient operationsStatus;

    /**
     * Gets the OperationsStatusClient object to access its operations.
     *
     * @return the OperationsStatusClient object.
     */
    public OperationsStatusClient getOperationsStatus() {
        return this.operationsStatus;
    }

    /** The OrdersClient object to access its operations. */
    private final OrdersClient orders;

    /**
     * Gets the OrdersClient object to access its operations.
     *
     * @return the OrdersClient object.
     */
    public OrdersClient getOrders() {
        return this.orders;
    }

    /** The RolesClient object to access its operations. */
    private final RolesClient roles;

    /**
     * Gets the RolesClient object to access its operations.
     *
     * @return the RolesClient object.
     */
    public RolesClient getRoles() {
        return this.roles;
    }

    /** The AddonsClient object to access its operations. */
    private final AddonsClient addons;

    /**
     * Gets the AddonsClient object to access its operations.
     *
     * @return the AddonsClient object.
     */
    public AddonsClient getAddons() {
        return this.addons;
    }

    /** The MonitoringConfigsClient object to access its operations. */
    private final MonitoringConfigsClient monitoringConfigs;

    /**
     * Gets the MonitoringConfigsClient object to access its operations.
     *
     * @return the MonitoringConfigsClient object.
     */
    public MonitoringConfigsClient getMonitoringConfigs() {
        return this.monitoringConfigs;
    }

    /** The SharesClient object to access its operations. */
    private final SharesClient shares;

    /**
     * Gets the SharesClient object to access its operations.
     *
     * @return the SharesClient object.
     */
    public SharesClient getShares() {
        return this.shares;
    }

    /** The StorageAccountCredentialsClient object to access its operations. */
    private final StorageAccountCredentialsClient storageAccountCredentials;

    /**
     * Gets the StorageAccountCredentialsClient object to access its operations.
     *
     * @return the StorageAccountCredentialsClient object.
     */
    public StorageAccountCredentialsClient getStorageAccountCredentials() {
        return this.storageAccountCredentials;
    }

    /** The StorageAccountsClient object to access its operations. */
    private final StorageAccountsClient storageAccounts;

    /**
     * Gets the StorageAccountsClient object to access its operations.
     *
     * @return the StorageAccountsClient object.
     */
    public StorageAccountsClient getStorageAccounts() {
        return this.storageAccounts;
    }

    /** The ContainersClient object to access its operations. */
    private final ContainersClient containers;

    /**
     * Gets the ContainersClient object to access its operations.
     *
     * @return the ContainersClient object.
     */
    public ContainersClient getContainers() {
        return this.containers;
    }

    /** The TriggersClient object to access its operations. */
    private final TriggersClient triggers;

    /**
     * Gets the TriggersClient object to access its operations.
     *
     * @return the TriggersClient object.
     */
    public TriggersClient getTriggers() {
        return this.triggers;
    }

    /** The SupportPackagesClient object to access its operations. */
    private final SupportPackagesClient supportPackages;

    /**
     * Gets the SupportPackagesClient object to access its operations.
     *
     * @return the SupportPackagesClient object.
     */
    public SupportPackagesClient getSupportPackages() {
        return this.supportPackages;
    }

    /** The UsersClient object to access its operations. */
    private final UsersClient users;

    /**
     * Gets the UsersClient object to access its operations.
     *
     * @return the UsersClient object.
     */
    public UsersClient getUsers() {
        return this.users;
    }

    /**
     * Initializes an instance of DataBoxEdgeManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription ID.
     * @param endpoint server parameter.
     */
    DataBoxEdgeManagementClientImpl(
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
        this.apiVersion = "2022-03-01";
        this.operations = new OperationsClientImpl(this);
        this.availableSkus = new AvailableSkusClientImpl(this);
        this.devices = new DevicesClientImpl(this);
        this.alerts = new AlertsClientImpl(this);
        this.bandwidthSchedules = new BandwidthSchedulesClientImpl(this);
        this.deviceCapacityChecks = new DeviceCapacityChecksClientImpl(this);
        this.deviceCapacityInfoes = new DeviceCapacityInfoesClientImpl(this);
        this.diagnosticSettings = new DiagnosticSettingsClientImpl(this);
        this.jobs = new JobsClientImpl(this);
        this.nodes = new NodesClientImpl(this);
        this.operationsStatus = new OperationsStatusClientImpl(this);
        this.orders = new OrdersClientImpl(this);
        this.roles = new RolesClientImpl(this);
        this.addons = new AddonsClientImpl(this);
        this.monitoringConfigs = new MonitoringConfigsClientImpl(this);
        this.shares = new SharesClientImpl(this);
        this.storageAccountCredentials = new StorageAccountCredentialsClientImpl(this);
        this.storageAccounts = new StorageAccountsClientImpl(this);
        this.containers = new ContainersClientImpl(this);
        this.triggers = new TriggersClientImpl(this);
        this.supportPackages = new SupportPackagesClientImpl(this);
        this.users = new UsersClientImpl(this);
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

    private static final ClientLogger LOGGER = new ClientLogger(DataBoxEdgeManagementClientImpl.class);
}
