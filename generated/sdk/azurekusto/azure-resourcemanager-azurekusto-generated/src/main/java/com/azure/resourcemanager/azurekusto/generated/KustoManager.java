// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated;

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
import com.azure.resourcemanager.azurekusto.generated.fluent.KustoManagementClient;
import com.azure.resourcemanager.azurekusto.generated.implementation.AttachedDatabaseConfigurationsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.ClusterPrincipalAssignmentsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.ClustersImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.DataConnectionsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.DatabasePrincipalAssignmentsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.DatabasesImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.KustoManagementClientBuilder;
import com.azure.resourcemanager.azurekusto.generated.implementation.ManagedPrivateEndpointsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.OperationsResultsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.OperationsResultsLocationsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.azurekusto.generated.implementation.ScriptsImpl;
import com.azure.resourcemanager.azurekusto.generated.models.AttachedDatabaseConfigurations;
import com.azure.resourcemanager.azurekusto.generated.models.ClusterPrincipalAssignments;
import com.azure.resourcemanager.azurekusto.generated.models.Clusters;
import com.azure.resourcemanager.azurekusto.generated.models.DataConnections;
import com.azure.resourcemanager.azurekusto.generated.models.DatabasePrincipalAssignments;
import com.azure.resourcemanager.azurekusto.generated.models.Databases;
import com.azure.resourcemanager.azurekusto.generated.models.ManagedPrivateEndpoints;
import com.azure.resourcemanager.azurekusto.generated.models.Operations;
import com.azure.resourcemanager.azurekusto.generated.models.OperationsResults;
import com.azure.resourcemanager.azurekusto.generated.models.OperationsResultsLocations;
import com.azure.resourcemanager.azurekusto.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.azurekusto.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.azurekusto.generated.models.Scripts;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to KustoManager. The Azure Kusto management API provides a RESTful set of web services that interact with
 * Azure Kusto services to manage your clusters and databases. The API enables you to create, update, and delete
 * clusters and databases.
 */
public final class KustoManager {
    private Clusters clusters;

    private ClusterPrincipalAssignments clusterPrincipalAssignments;

    private Databases databases;

    private AttachedDatabaseConfigurations attachedDatabaseConfigurations;

    private ManagedPrivateEndpoints managedPrivateEndpoints;

    private DatabasePrincipalAssignments databasePrincipalAssignments;

    private Scripts scripts;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private DataConnections dataConnections;

    private Operations operations;

    private OperationsResults operationsResults;

    private OperationsResultsLocations operationsResultsLocations;

    private final KustoManagementClient clientObject;

    private KustoManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new KustoManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Kusto service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Kusto service API instance.
     */
    public static KustoManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create KustoManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new KustoManager.Configurable();
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
         * Creates an instance of Kusto service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Kusto service API instance.
         */
        public KustoManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.azurekusto.generated")
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
            return new KustoManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Clusters. */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(clientObject.getClusters(), this);
        }
        return clusters;
    }

    /** @return Resource collection API of ClusterPrincipalAssignments. */
    public ClusterPrincipalAssignments clusterPrincipalAssignments() {
        if (this.clusterPrincipalAssignments == null) {
            this.clusterPrincipalAssignments =
                new ClusterPrincipalAssignmentsImpl(clientObject.getClusterPrincipalAssignments(), this);
        }
        return clusterPrincipalAssignments;
    }

    /** @return Resource collection API of Databases. */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /** @return Resource collection API of AttachedDatabaseConfigurations. */
    public AttachedDatabaseConfigurations attachedDatabaseConfigurations() {
        if (this.attachedDatabaseConfigurations == null) {
            this.attachedDatabaseConfigurations =
                new AttachedDatabaseConfigurationsImpl(clientObject.getAttachedDatabaseConfigurations(), this);
        }
        return attachedDatabaseConfigurations;
    }

    /** @return Resource collection API of ManagedPrivateEndpoints. */
    public ManagedPrivateEndpoints managedPrivateEndpoints() {
        if (this.managedPrivateEndpoints == null) {
            this.managedPrivateEndpoints =
                new ManagedPrivateEndpointsImpl(clientObject.getManagedPrivateEndpoints(), this);
        }
        return managedPrivateEndpoints;
    }

    /** @return Resource collection API of DatabasePrincipalAssignments. */
    public DatabasePrincipalAssignments databasePrincipalAssignments() {
        if (this.databasePrincipalAssignments == null) {
            this.databasePrincipalAssignments =
                new DatabasePrincipalAssignmentsImpl(clientObject.getDatabasePrincipalAssignments(), this);
        }
        return databasePrincipalAssignments;
    }

    /** @return Resource collection API of Scripts. */
    public Scripts scripts() {
        if (this.scripts == null) {
            this.scripts = new ScriptsImpl(clientObject.getScripts(), this);
        }
        return scripts;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /** @return Resource collection API of DataConnections. */
    public DataConnections dataConnections() {
        if (this.dataConnections == null) {
            this.dataConnections = new DataConnectionsImpl(clientObject.getDataConnections(), this);
        }
        return dataConnections;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of OperationsResults. */
    public OperationsResults operationsResults() {
        if (this.operationsResults == null) {
            this.operationsResults = new OperationsResultsImpl(clientObject.getOperationsResults(), this);
        }
        return operationsResults;
    }

    /** @return Resource collection API of OperationsResultsLocations. */
    public OperationsResultsLocations operationsResultsLocations() {
        if (this.operationsResultsLocations == null) {
            this.operationsResultsLocations =
                new OperationsResultsLocationsImpl(clientObject.getOperationsResultsLocations(), this);
        }
        return operationsResultsLocations;
    }

    /**
     * @return Wrapped service client KustoManagementClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public KustoManagementClient serviceClient() {
        return this.clientObject;
    }
}
