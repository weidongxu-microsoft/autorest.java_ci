// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.fluent.HDInsightManagementClient;
import com.azure.resourcemanager.hdinsight.generated.implementation.ApplicationsImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.ClustersImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.ConfigurationsImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.ExtensionsImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.HDInsightManagementClientBuilder;
import com.azure.resourcemanager.hdinsight.generated.implementation.LocationsImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.ScriptActionsImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.ScriptExecutionHistoriesImpl;
import com.azure.resourcemanager.hdinsight.generated.implementation.VirtualMachinesImpl;
import com.azure.resourcemanager.hdinsight.generated.models.Applications;
import com.azure.resourcemanager.hdinsight.generated.models.Clusters;
import com.azure.resourcemanager.hdinsight.generated.models.Configurations;
import com.azure.resourcemanager.hdinsight.generated.models.Extensions;
import com.azure.resourcemanager.hdinsight.generated.models.Locations;
import com.azure.resourcemanager.hdinsight.generated.models.Operations;
import com.azure.resourcemanager.hdinsight.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.hdinsight.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.hdinsight.generated.models.ScriptActions;
import com.azure.resourcemanager.hdinsight.generated.models.ScriptExecutionHistories;
import com.azure.resourcemanager.hdinsight.generated.models.VirtualMachines;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to HDInsightManager. HDInsight Management Client. */
public final class HDInsightManager {
    private Clusters clusters;

    private Applications applications;

    private Locations locations;

    private Configurations configurations;

    private Extensions extensions;

    private ScriptActions scriptActions;

    private ScriptExecutionHistories scriptExecutionHistories;

    private Operations operations;

    private VirtualMachines virtualMachines;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private final HDInsightManagementClient clientObject;

    private HDInsightManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new HDInsightManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of HDInsight service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the HDInsight service API instance.
     */
    public static HDInsightManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create HDInsightManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new HDInsightManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
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
         * Creates an instance of HDInsight service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the HDInsight service API instance.
         */
        public HDInsightManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.hdinsight.generated")
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
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
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
            return new HDInsightManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Clusters. */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(clientObject.getClusters(), this);
        }
        return clusters;
    }

    /** @return Resource collection API of Applications. */
    public Applications applications() {
        if (this.applications == null) {
            this.applications = new ApplicationsImpl(clientObject.getApplications(), this);
        }
        return applications;
    }

    /** @return Resource collection API of Locations. */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(clientObject.getLocations(), this);
        }
        return locations;
    }

    /** @return Resource collection API of Configurations. */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(clientObject.getConfigurations(), this);
        }
        return configurations;
    }

    /** @return Resource collection API of Extensions. */
    public Extensions extensions() {
        if (this.extensions == null) {
            this.extensions = new ExtensionsImpl(clientObject.getExtensions(), this);
        }
        return extensions;
    }

    /** @return Resource collection API of ScriptActions. */
    public ScriptActions scriptActions() {
        if (this.scriptActions == null) {
            this.scriptActions = new ScriptActionsImpl(clientObject.getScriptActions(), this);
        }
        return scriptActions;
    }

    /** @return Resource collection API of ScriptExecutionHistories. */
    public ScriptExecutionHistories scriptExecutionHistories() {
        if (this.scriptExecutionHistories == null) {
            this.scriptExecutionHistories =
                new ScriptExecutionHistoriesImpl(clientObject.getScriptExecutionHistories(), this);
        }
        return scriptExecutionHistories;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of VirtualMachines. */
    public VirtualMachines virtualMachines() {
        if (this.virtualMachines == null) {
            this.virtualMachines = new VirtualMachinesImpl(clientObject.getVirtualMachines(), this);
        }
        return virtualMachines;
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

    /**
     * @return Wrapped service client HDInsightManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public HDInsightManagementClient serviceClient() {
        return this.clientObject;
    }
}
