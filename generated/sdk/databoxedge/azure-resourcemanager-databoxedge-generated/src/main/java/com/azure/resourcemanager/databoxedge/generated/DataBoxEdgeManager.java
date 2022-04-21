// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.DataBoxEdgeManagementClient;
import com.azure.resourcemanager.databoxedge.generated.implementation.AddonsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.AlertsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.AvailableSkusImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.BandwidthSchedulesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.ContainersImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.DataBoxEdgeManagementClientBuilder;
import com.azure.resourcemanager.databoxedge.generated.implementation.DeviceCapacityChecksImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.DeviceCapacityInfoesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.DevicesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.DiagnosticSettingsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.JobsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.MonitoringConfigsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.NodesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.OperationsStatusImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.OrdersImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.RolesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.SharesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.StorageAccountCredentialsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.StorageAccountsImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.SupportPackagesImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.TriggersImpl;
import com.azure.resourcemanager.databoxedge.generated.implementation.UsersImpl;
import com.azure.resourcemanager.databoxedge.generated.models.Addons;
import com.azure.resourcemanager.databoxedge.generated.models.Alerts;
import com.azure.resourcemanager.databoxedge.generated.models.AvailableSkus;
import com.azure.resourcemanager.databoxedge.generated.models.BandwidthSchedules;
import com.azure.resourcemanager.databoxedge.generated.models.Containers;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceCapacityChecks;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceCapacityInfoes;
import com.azure.resourcemanager.databoxedge.generated.models.Devices;
import com.azure.resourcemanager.databoxedge.generated.models.DiagnosticSettings;
import com.azure.resourcemanager.databoxedge.generated.models.Jobs;
import com.azure.resourcemanager.databoxedge.generated.models.MonitoringConfigs;
import com.azure.resourcemanager.databoxedge.generated.models.Nodes;
import com.azure.resourcemanager.databoxedge.generated.models.Operations;
import com.azure.resourcemanager.databoxedge.generated.models.OperationsStatus;
import com.azure.resourcemanager.databoxedge.generated.models.Orders;
import com.azure.resourcemanager.databoxedge.generated.models.Roles;
import com.azure.resourcemanager.databoxedge.generated.models.Shares;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccountCredentials;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccounts;
import com.azure.resourcemanager.databoxedge.generated.models.SupportPackages;
import com.azure.resourcemanager.databoxedge.generated.models.Triggers;
import com.azure.resourcemanager.databoxedge.generated.models.Users;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to DataBoxEdgeManager. */
public final class DataBoxEdgeManager {
    private Operations operations;

    private AvailableSkus availableSkus;

    private Devices devices;

    private Alerts alerts;

    private BandwidthSchedules bandwidthSchedules;

    private DeviceCapacityChecks deviceCapacityChecks;

    private DeviceCapacityInfoes deviceCapacityInfoes;

    private DiagnosticSettings diagnosticSettings;

    private Jobs jobs;

    private Nodes nodes;

    private OperationsStatus operationsStatus;

    private Orders orders;

    private Roles roles;

    private Addons addons;

    private MonitoringConfigs monitoringConfigs;

    private Shares shares;

    private StorageAccountCredentials storageAccountCredentials;

    private StorageAccounts storageAccounts;

    private Containers containers;

    private Triggers triggers;

    private SupportPackages supportPackages;

    private Users users;

    private final DataBoxEdgeManagementClient clientObject;

    private DataBoxEdgeManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DataBoxEdgeManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DataBoxEdge service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DataBoxEdge service API instance.
     */
    public static DataBoxEdgeManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of DataBoxEdge service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the DataBoxEdge service API instance.
     */
    public static DataBoxEdgeManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new DataBoxEdgeManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create DataBoxEdgeManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DataBoxEdgeManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of DataBoxEdge service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DataBoxEdge service API instance.
         */
        public DataBoxEdgeManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.databoxedge.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new DataBoxEdgeManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of AvailableSkus.
     *
     * @return Resource collection API of AvailableSkus.
     */
    public AvailableSkus availableSkus() {
        if (this.availableSkus == null) {
            this.availableSkus = new AvailableSkusImpl(clientObject.getAvailableSkus(), this);
        }
        return availableSkus;
    }

    /**
     * Gets the resource collection API of Devices.
     *
     * @return Resource collection API of Devices.
     */
    public Devices devices() {
        if (this.devices == null) {
            this.devices = new DevicesImpl(clientObject.getDevices(), this);
        }
        return devices;
    }

    /**
     * Gets the resource collection API of Alerts.
     *
     * @return Resource collection API of Alerts.
     */
    public Alerts alerts() {
        if (this.alerts == null) {
            this.alerts = new AlertsImpl(clientObject.getAlerts(), this);
        }
        return alerts;
    }

    /**
     * Gets the resource collection API of BandwidthSchedules.
     *
     * @return Resource collection API of BandwidthSchedules.
     */
    public BandwidthSchedules bandwidthSchedules() {
        if (this.bandwidthSchedules == null) {
            this.bandwidthSchedules = new BandwidthSchedulesImpl(clientObject.getBandwidthSchedules(), this);
        }
        return bandwidthSchedules;
    }

    /**
     * Gets the resource collection API of DeviceCapacityChecks.
     *
     * @return Resource collection API of DeviceCapacityChecks.
     */
    public DeviceCapacityChecks deviceCapacityChecks() {
        if (this.deviceCapacityChecks == null) {
            this.deviceCapacityChecks = new DeviceCapacityChecksImpl(clientObject.getDeviceCapacityChecks(), this);
        }
        return deviceCapacityChecks;
    }

    /**
     * Gets the resource collection API of DeviceCapacityInfoes.
     *
     * @return Resource collection API of DeviceCapacityInfoes.
     */
    public DeviceCapacityInfoes deviceCapacityInfoes() {
        if (this.deviceCapacityInfoes == null) {
            this.deviceCapacityInfoes = new DeviceCapacityInfoesImpl(clientObject.getDeviceCapacityInfoes(), this);
        }
        return deviceCapacityInfoes;
    }

    /**
     * Gets the resource collection API of DiagnosticSettings.
     *
     * @return Resource collection API of DiagnosticSettings.
     */
    public DiagnosticSettings diagnosticSettings() {
        if (this.diagnosticSettings == null) {
            this.diagnosticSettings = new DiagnosticSettingsImpl(clientObject.getDiagnosticSettings(), this);
        }
        return diagnosticSettings;
    }

    /**
     * Gets the resource collection API of Jobs.
     *
     * @return Resource collection API of Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /**
     * Gets the resource collection API of Nodes.
     *
     * @return Resource collection API of Nodes.
     */
    public Nodes nodes() {
        if (this.nodes == null) {
            this.nodes = new NodesImpl(clientObject.getNodes(), this);
        }
        return nodes;
    }

    /**
     * Gets the resource collection API of OperationsStatus.
     *
     * @return Resource collection API of OperationsStatus.
     */
    public OperationsStatus operationsStatus() {
        if (this.operationsStatus == null) {
            this.operationsStatus = new OperationsStatusImpl(clientObject.getOperationsStatus(), this);
        }
        return operationsStatus;
    }

    /**
     * Gets the resource collection API of Orders.
     *
     * @return Resource collection API of Orders.
     */
    public Orders orders() {
        if (this.orders == null) {
            this.orders = new OrdersImpl(clientObject.getOrders(), this);
        }
        return orders;
    }

    /**
     * Gets the resource collection API of Roles.
     *
     * @return Resource collection API of Roles.
     */
    public Roles roles() {
        if (this.roles == null) {
            this.roles = new RolesImpl(clientObject.getRoles(), this);
        }
        return roles;
    }

    /**
     * Gets the resource collection API of Addons.
     *
     * @return Resource collection API of Addons.
     */
    public Addons addons() {
        if (this.addons == null) {
            this.addons = new AddonsImpl(clientObject.getAddons(), this);
        }
        return addons;
    }

    /**
     * Gets the resource collection API of MonitoringConfigs.
     *
     * @return Resource collection API of MonitoringConfigs.
     */
    public MonitoringConfigs monitoringConfigs() {
        if (this.monitoringConfigs == null) {
            this.monitoringConfigs = new MonitoringConfigsImpl(clientObject.getMonitoringConfigs(), this);
        }
        return monitoringConfigs;
    }

    /**
     * Gets the resource collection API of Shares.
     *
     * @return Resource collection API of Shares.
     */
    public Shares shares() {
        if (this.shares == null) {
            this.shares = new SharesImpl(clientObject.getShares(), this);
        }
        return shares;
    }

    /**
     * Gets the resource collection API of StorageAccountCredentials.
     *
     * @return Resource collection API of StorageAccountCredentials.
     */
    public StorageAccountCredentials storageAccountCredentials() {
        if (this.storageAccountCredentials == null) {
            this.storageAccountCredentials =
                new StorageAccountCredentialsImpl(clientObject.getStorageAccountCredentials(), this);
        }
        return storageAccountCredentials;
    }

    /**
     * Gets the resource collection API of StorageAccounts.
     *
     * @return Resource collection API of StorageAccounts.
     */
    public StorageAccounts storageAccounts() {
        if (this.storageAccounts == null) {
            this.storageAccounts = new StorageAccountsImpl(clientObject.getStorageAccounts(), this);
        }
        return storageAccounts;
    }

    /**
     * Gets the resource collection API of Containers.
     *
     * @return Resource collection API of Containers.
     */
    public Containers containers() {
        if (this.containers == null) {
            this.containers = new ContainersImpl(clientObject.getContainers(), this);
        }
        return containers;
    }

    /**
     * Gets the resource collection API of Triggers.
     *
     * @return Resource collection API of Triggers.
     */
    public Triggers triggers() {
        if (this.triggers == null) {
            this.triggers = new TriggersImpl(clientObject.getTriggers(), this);
        }
        return triggers;
    }

    /**
     * Gets the resource collection API of SupportPackages.
     *
     * @return Resource collection API of SupportPackages.
     */
    public SupportPackages supportPackages() {
        if (this.supportPackages == null) {
            this.supportPackages = new SupportPackagesImpl(clientObject.getSupportPackages(), this);
        }
        return supportPackages;
    }

    /**
     * Gets the resource collection API of Users.
     *
     * @return Resource collection API of Users.
     */
    public Users users() {
        if (this.users == null) {
            this.users = new UsersImpl(clientObject.getUsers(), this);
        }
        return users;
    }

    /**
     * @return Wrapped service client DataBoxEdgeManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public DataBoxEdgeManagementClient serviceClient() {
        return this.clientObject;
    }
}
