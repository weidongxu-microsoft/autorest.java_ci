// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
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
import com.azure.resourcemanager.storage.generated.fluent.StorageManagementClient;
import com.azure.resourcemanager.storage.generated.implementation.BlobContainersImpl;
import com.azure.resourcemanager.storage.generated.implementation.BlobInventoryPoliciesImpl;
import com.azure.resourcemanager.storage.generated.implementation.BlobServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.DeletedAccountsImpl;
import com.azure.resourcemanager.storage.generated.implementation.EncryptionScopesImpl;
import com.azure.resourcemanager.storage.generated.implementation.FileServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.FileSharesImpl;
import com.azure.resourcemanager.storage.generated.implementation.LocalUsersOperationsImpl;
import com.azure.resourcemanager.storage.generated.implementation.ManagementPoliciesImpl;
import com.azure.resourcemanager.storage.generated.implementation.NetworkSecurityPerimeterConfigurationsImpl;
import com.azure.resourcemanager.storage.generated.implementation.ObjectReplicationPoliciesOperationsImpl;
import com.azure.resourcemanager.storage.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.storage.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.storage.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.storage.generated.implementation.QueueServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.QueuesImpl;
import com.azure.resourcemanager.storage.generated.implementation.SkusImpl;
import com.azure.resourcemanager.storage.generated.implementation.StorageAccountsImpl;
import com.azure.resourcemanager.storage.generated.implementation.StorageManagementClientBuilder;
import com.azure.resourcemanager.storage.generated.implementation.StorageTaskAssignmentInstancesReportsImpl;
import com.azure.resourcemanager.storage.generated.implementation.StorageTaskAssignmentsImpl;
import com.azure.resourcemanager.storage.generated.implementation.StorageTaskAssignmentsInstancesReportsImpl;
import com.azure.resourcemanager.storage.generated.implementation.TableServicesImpl;
import com.azure.resourcemanager.storage.generated.implementation.TablesImpl;
import com.azure.resourcemanager.storage.generated.implementation.UsagesImpl;
import com.azure.resourcemanager.storage.generated.models.BlobContainers;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicies;
import com.azure.resourcemanager.storage.generated.models.BlobServices;
import com.azure.resourcemanager.storage.generated.models.DeletedAccounts;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopes;
import com.azure.resourcemanager.storage.generated.models.FileServices;
import com.azure.resourcemanager.storage.generated.models.FileShares;
import com.azure.resourcemanager.storage.generated.models.LocalUsersOperations;
import com.azure.resourcemanager.storage.generated.models.ManagementPolicies;
import com.azure.resourcemanager.storage.generated.models.NetworkSecurityPerimeterConfigurations;
import com.azure.resourcemanager.storage.generated.models.ObjectReplicationPoliciesOperations;
import com.azure.resourcemanager.storage.generated.models.Operations;
import com.azure.resourcemanager.storage.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.storage.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.storage.generated.models.Queues;
import com.azure.resourcemanager.storage.generated.models.QueueServices;
import com.azure.resourcemanager.storage.generated.models.Skus;
import com.azure.resourcemanager.storage.generated.models.StorageAccounts;
import com.azure.resourcemanager.storage.generated.models.StorageTaskAssignmentInstancesReports;
import com.azure.resourcemanager.storage.generated.models.StorageTaskAssignments;
import com.azure.resourcemanager.storage.generated.models.StorageTaskAssignmentsInstancesReports;
import com.azure.resourcemanager.storage.generated.models.Tables;
import com.azure.resourcemanager.storage.generated.models.TableServices;
import com.azure.resourcemanager.storage.generated.models.Usages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to StorageManager.
 * The Azure Storage Management API.
 */
public final class StorageManager {
    private BlobServices blobServices;

    private BlobContainers blobContainers;

    private FileServices fileServices;

    private FileShares fileShares;

    private QueueServices queueServices;

    private Queues queues;

    private Operations operations;

    private Skus skus;

    private StorageAccounts storageAccounts;

    private DeletedAccounts deletedAccounts;

    private Usages usages;

    private ManagementPolicies managementPolicies;

    private BlobInventoryPolicies blobInventoryPolicies;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private ObjectReplicationPoliciesOperations objectReplicationPoliciesOperations;

    private LocalUsersOperations localUsersOperations;

    private EncryptionScopes encryptionScopes;

    private TableServices tableServices;

    private Tables tables;

    private NetworkSecurityPerimeterConfigurations networkSecurityPerimeterConfigurations;

    private StorageTaskAssignments storageTaskAssignments;

    private StorageTaskAssignmentsInstancesReports storageTaskAssignmentsInstancesReports;

    private StorageTaskAssignmentInstancesReports storageTaskAssignmentInstancesReports;

    private final StorageManagementClient clientObject;

    private StorageManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new StorageManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of Storage service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Storage service API instance.
     */
    public static StorageManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of Storage service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the Storage service API instance.
     */
    public static StorageManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new StorageManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create StorageManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new StorageManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
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
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
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
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Storage service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Storage service API instance.
         */
        public StorageManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.storage.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
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
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new StorageManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of BlobServices. It manages BlobServiceProperties.
     * 
     * @return Resource collection API of BlobServices.
     */
    public BlobServices blobServices() {
        if (this.blobServices == null) {
            this.blobServices = new BlobServicesImpl(clientObject.getBlobServices(), this);
        }
        return blobServices;
    }

    /**
     * Gets the resource collection API of BlobContainers. It manages BlobContainer, ImmutabilityPolicy.
     * 
     * @return Resource collection API of BlobContainers.
     */
    public BlobContainers blobContainers() {
        if (this.blobContainers == null) {
            this.blobContainers = new BlobContainersImpl(clientObject.getBlobContainers(), this);
        }
        return blobContainers;
    }

    /**
     * Gets the resource collection API of FileServices. It manages FileServiceProperties.
     * 
     * @return Resource collection API of FileServices.
     */
    public FileServices fileServices() {
        if (this.fileServices == null) {
            this.fileServices = new FileServicesImpl(clientObject.getFileServices(), this);
        }
        return fileServices;
    }

    /**
     * Gets the resource collection API of FileShares. It manages FileShare.
     * 
     * @return Resource collection API of FileShares.
     */
    public FileShares fileShares() {
        if (this.fileShares == null) {
            this.fileShares = new FileSharesImpl(clientObject.getFileShares(), this);
        }
        return fileShares;
    }

    /**
     * Gets the resource collection API of QueueServices. It manages QueueServiceProperties.
     * 
     * @return Resource collection API of QueueServices.
     */
    public QueueServices queueServices() {
        if (this.queueServices == null) {
            this.queueServices = new QueueServicesImpl(clientObject.getQueueServices(), this);
        }
        return queueServices;
    }

    /**
     * Gets the resource collection API of Queues. It manages StorageQueue.
     * 
     * @return Resource collection API of Queues.
     */
    public Queues queues() {
        if (this.queues == null) {
            this.queues = new QueuesImpl(clientObject.getQueues(), this);
        }
        return queues;
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
     * Gets the resource collection API of Skus.
     * 
     * @return Resource collection API of Skus.
     */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /**
     * Gets the resource collection API of StorageAccounts. It manages StorageAccount.
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
     * Gets the resource collection API of DeletedAccounts.
     * 
     * @return Resource collection API of DeletedAccounts.
     */
    public DeletedAccounts deletedAccounts() {
        if (this.deletedAccounts == null) {
            this.deletedAccounts = new DeletedAccountsImpl(clientObject.getDeletedAccounts(), this);
        }
        return deletedAccounts;
    }

    /**
     * Gets the resource collection API of Usages.
     * 
     * @return Resource collection API of Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /**
     * Gets the resource collection API of ManagementPolicies. It manages ManagementPolicy.
     * 
     * @return Resource collection API of ManagementPolicies.
     */
    public ManagementPolicies managementPolicies() {
        if (this.managementPolicies == null) {
            this.managementPolicies = new ManagementPoliciesImpl(clientObject.getManagementPolicies(), this);
        }
        return managementPolicies;
    }

    /**
     * Gets the resource collection API of BlobInventoryPolicies. It manages BlobInventoryPolicy.
     * 
     * @return Resource collection API of BlobInventoryPolicies.
     */
    public BlobInventoryPolicies blobInventoryPolicies() {
        if (this.blobInventoryPolicies == null) {
            this.blobInventoryPolicies = new BlobInventoryPoliciesImpl(clientObject.getBlobInventoryPolicies(), this);
        }
        return blobInventoryPolicies;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections. It manages PrivateEndpointConnection.
     * 
     * @return Resource collection API of PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections
                = new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /**
     * Gets the resource collection API of PrivateLinkResources.
     * 
     * @return Resource collection API of PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * Gets the resource collection API of ObjectReplicationPoliciesOperations. It manages ObjectReplicationPolicy.
     * 
     * @return Resource collection API of ObjectReplicationPoliciesOperations.
     */
    public ObjectReplicationPoliciesOperations objectReplicationPoliciesOperations() {
        if (this.objectReplicationPoliciesOperations == null) {
            this.objectReplicationPoliciesOperations = new ObjectReplicationPoliciesOperationsImpl(
                clientObject.getObjectReplicationPoliciesOperations(), this);
        }
        return objectReplicationPoliciesOperations;
    }

    /**
     * Gets the resource collection API of LocalUsersOperations. It manages LocalUser.
     * 
     * @return Resource collection API of LocalUsersOperations.
     */
    public LocalUsersOperations localUsersOperations() {
        if (this.localUsersOperations == null) {
            this.localUsersOperations = new LocalUsersOperationsImpl(clientObject.getLocalUsersOperations(), this);
        }
        return localUsersOperations;
    }

    /**
     * Gets the resource collection API of EncryptionScopes. It manages EncryptionScope.
     * 
     * @return Resource collection API of EncryptionScopes.
     */
    public EncryptionScopes encryptionScopes() {
        if (this.encryptionScopes == null) {
            this.encryptionScopes = new EncryptionScopesImpl(clientObject.getEncryptionScopes(), this);
        }
        return encryptionScopes;
    }

    /**
     * Gets the resource collection API of TableServices. It manages TableServiceProperties.
     * 
     * @return Resource collection API of TableServices.
     */
    public TableServices tableServices() {
        if (this.tableServices == null) {
            this.tableServices = new TableServicesImpl(clientObject.getTableServices(), this);
        }
        return tableServices;
    }

    /**
     * Gets the resource collection API of Tables. It manages Table.
     * 
     * @return Resource collection API of Tables.
     */
    public Tables tables() {
        if (this.tables == null) {
            this.tables = new TablesImpl(clientObject.getTables(), this);
        }
        return tables;
    }

    /**
     * Gets the resource collection API of NetworkSecurityPerimeterConfigurations.
     * 
     * @return Resource collection API of NetworkSecurityPerimeterConfigurations.
     */
    public NetworkSecurityPerimeterConfigurations networkSecurityPerimeterConfigurations() {
        if (this.networkSecurityPerimeterConfigurations == null) {
            this.networkSecurityPerimeterConfigurations = new NetworkSecurityPerimeterConfigurationsImpl(
                clientObject.getNetworkSecurityPerimeterConfigurations(), this);
        }
        return networkSecurityPerimeterConfigurations;
    }

    /**
     * Gets the resource collection API of StorageTaskAssignments. It manages StorageTaskAssignment.
     * 
     * @return Resource collection API of StorageTaskAssignments.
     */
    public StorageTaskAssignments storageTaskAssignments() {
        if (this.storageTaskAssignments == null) {
            this.storageTaskAssignments
                = new StorageTaskAssignmentsImpl(clientObject.getStorageTaskAssignments(), this);
        }
        return storageTaskAssignments;
    }

    /**
     * Gets the resource collection API of StorageTaskAssignmentsInstancesReports.
     * 
     * @return Resource collection API of StorageTaskAssignmentsInstancesReports.
     */
    public StorageTaskAssignmentsInstancesReports storageTaskAssignmentsInstancesReports() {
        if (this.storageTaskAssignmentsInstancesReports == null) {
            this.storageTaskAssignmentsInstancesReports = new StorageTaskAssignmentsInstancesReportsImpl(
                clientObject.getStorageTaskAssignmentsInstancesReports(), this);
        }
        return storageTaskAssignmentsInstancesReports;
    }

    /**
     * Gets the resource collection API of StorageTaskAssignmentInstancesReports.
     * 
     * @return Resource collection API of StorageTaskAssignmentInstancesReports.
     */
    public StorageTaskAssignmentInstancesReports storageTaskAssignmentInstancesReports() {
        if (this.storageTaskAssignmentInstancesReports == null) {
            this.storageTaskAssignmentInstancesReports = new StorageTaskAssignmentInstancesReportsImpl(
                clientObject.getStorageTaskAssignmentInstancesReports(), this);
        }
        return storageTaskAssignmentInstancesReports;
    }

    /**
     * Gets wrapped service client StorageManagementClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client StorageManagementClient.
     */
    public StorageManagementClient serviceClient() {
        return this.clientObject;
    }
}
