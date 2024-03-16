// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

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
import com.azure.resourcemanager.frontdoor.generated.fluent.FrontDoorManagementClient;
import com.azure.resourcemanager.frontdoor.generated.implementation.EndpointsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.ExperimentsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.FrontDoorManagementClientBuilder;
import com.azure.resourcemanager.frontdoor.generated.implementation.FrontDoorNameAvailabilitiesImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.FrontDoorNameAvailabilityWithSubscriptionsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.FrontDoorsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.FrontendEndpointsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.ManagedRuleSetsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.NetworkExperimentProfilesImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.PoliciesImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.PreconfiguredEndpointsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.ReportsImpl;
import com.azure.resourcemanager.frontdoor.generated.implementation.RulesEnginesImpl;
import com.azure.resourcemanager.frontdoor.generated.models.Endpoints;
import com.azure.resourcemanager.frontdoor.generated.models.Experiments;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorNameAvailabilities;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorNameAvailabilityWithSubscriptions;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoors;
import com.azure.resourcemanager.frontdoor.generated.models.FrontendEndpoints;
import com.azure.resourcemanager.frontdoor.generated.models.ManagedRuleSets;
import com.azure.resourcemanager.frontdoor.generated.models.NetworkExperimentProfiles;
import com.azure.resourcemanager.frontdoor.generated.models.Policies;
import com.azure.resourcemanager.frontdoor.generated.models.PreconfiguredEndpoints;
import com.azure.resourcemanager.frontdoor.generated.models.Reports;
import com.azure.resourcemanager.frontdoor.generated.models.RulesEngines;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to FrontDoorManager.
 * FrontDoor Client.
 */
public final class FrontDoorManager {
    private Policies policies;

    private ManagedRuleSets managedRuleSets;

    private FrontDoorNameAvailabilities frontDoorNameAvailabilities;

    private FrontDoorNameAvailabilityWithSubscriptions frontDoorNameAvailabilityWithSubscriptions;

    private FrontDoors frontDoors;

    private FrontendEndpoints frontendEndpoints;

    private Endpoints endpoints;

    private RulesEngines rulesEngines;

    private NetworkExperimentProfiles networkExperimentProfiles;

    private PreconfiguredEndpoints preconfiguredEndpoints;

    private Experiments experiments;

    private Reports reports;

    private final FrontDoorManagementClient clientObject;

    private FrontDoorManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new FrontDoorManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of FrontDoor service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the FrontDoor service API instance.
     */
    public static FrontDoorManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of FrontDoor service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the FrontDoor service API instance.
     */
    public static FrontDoorManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new FrontDoorManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create FrontDoorManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new FrontDoorManager.Configurable();
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
         * Creates an instance of FrontDoor service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the FrontDoor service API instance.
         */
        public FrontDoorManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.frontdoor.generated")
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
            return new FrontDoorManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Policies. It manages WebApplicationFirewallPolicy.
     * 
     * @return Resource collection API of Policies.
     */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(clientObject.getPolicies(), this);
        }
        return policies;
    }

    /**
     * Gets the resource collection API of ManagedRuleSets.
     * 
     * @return Resource collection API of ManagedRuleSets.
     */
    public ManagedRuleSets managedRuleSets() {
        if (this.managedRuleSets == null) {
            this.managedRuleSets = new ManagedRuleSetsImpl(clientObject.getManagedRuleSets(), this);
        }
        return managedRuleSets;
    }

    /**
     * Gets the resource collection API of FrontDoorNameAvailabilities.
     * 
     * @return Resource collection API of FrontDoorNameAvailabilities.
     */
    public FrontDoorNameAvailabilities frontDoorNameAvailabilities() {
        if (this.frontDoorNameAvailabilities == null) {
            this.frontDoorNameAvailabilities
                = new FrontDoorNameAvailabilitiesImpl(clientObject.getFrontDoorNameAvailabilities(), this);
        }
        return frontDoorNameAvailabilities;
    }

    /**
     * Gets the resource collection API of FrontDoorNameAvailabilityWithSubscriptions.
     * 
     * @return Resource collection API of FrontDoorNameAvailabilityWithSubscriptions.
     */
    public FrontDoorNameAvailabilityWithSubscriptions frontDoorNameAvailabilityWithSubscriptions() {
        if (this.frontDoorNameAvailabilityWithSubscriptions == null) {
            this.frontDoorNameAvailabilityWithSubscriptions = new FrontDoorNameAvailabilityWithSubscriptionsImpl(
                clientObject.getFrontDoorNameAvailabilityWithSubscriptions(), this);
        }
        return frontDoorNameAvailabilityWithSubscriptions;
    }

    /**
     * Gets the resource collection API of FrontDoors. It manages FrontDoor.
     * 
     * @return Resource collection API of FrontDoors.
     */
    public FrontDoors frontDoors() {
        if (this.frontDoors == null) {
            this.frontDoors = new FrontDoorsImpl(clientObject.getFrontDoors(), this);
        }
        return frontDoors;
    }

    /**
     * Gets the resource collection API of FrontendEndpoints.
     * 
     * @return Resource collection API of FrontendEndpoints.
     */
    public FrontendEndpoints frontendEndpoints() {
        if (this.frontendEndpoints == null) {
            this.frontendEndpoints = new FrontendEndpointsImpl(clientObject.getFrontendEndpoints(), this);
        }
        return frontendEndpoints;
    }

    /**
     * Gets the resource collection API of Endpoints.
     * 
     * @return Resource collection API of Endpoints.
     */
    public Endpoints endpoints() {
        if (this.endpoints == null) {
            this.endpoints = new EndpointsImpl(clientObject.getEndpoints(), this);
        }
        return endpoints;
    }

    /**
     * Gets the resource collection API of RulesEngines. It manages RulesEngine.
     * 
     * @return Resource collection API of RulesEngines.
     */
    public RulesEngines rulesEngines() {
        if (this.rulesEngines == null) {
            this.rulesEngines = new RulesEnginesImpl(clientObject.getRulesEngines(), this);
        }
        return rulesEngines;
    }

    /**
     * Gets the resource collection API of NetworkExperimentProfiles. It manages Profile.
     * 
     * @return Resource collection API of NetworkExperimentProfiles.
     */
    public NetworkExperimentProfiles networkExperimentProfiles() {
        if (this.networkExperimentProfiles == null) {
            this.networkExperimentProfiles
                = new NetworkExperimentProfilesImpl(clientObject.getNetworkExperimentProfiles(), this);
        }
        return networkExperimentProfiles;
    }

    /**
     * Gets the resource collection API of PreconfiguredEndpoints.
     * 
     * @return Resource collection API of PreconfiguredEndpoints.
     */
    public PreconfiguredEndpoints preconfiguredEndpoints() {
        if (this.preconfiguredEndpoints == null) {
            this.preconfiguredEndpoints
                = new PreconfiguredEndpointsImpl(clientObject.getPreconfiguredEndpoints(), this);
        }
        return preconfiguredEndpoints;
    }

    /**
     * Gets the resource collection API of Experiments. It manages Experiment.
     * 
     * @return Resource collection API of Experiments.
     */
    public Experiments experiments() {
        if (this.experiments == null) {
            this.experiments = new ExperimentsImpl(clientObject.getExperiments(), this);
        }
        return experiments;
    }

    /**
     * Gets the resource collection API of Reports.
     * 
     * @return Resource collection API of Reports.
     */
    public Reports reports() {
        if (this.reports == null) {
            this.reports = new ReportsImpl(clientObject.getReports(), this);
        }
        return reports;
    }

    /**
     * Gets wrapped service client FrontDoorManagementClient providing direct access to the underlying auto-generated API implementation, based on Azure REST API.
     * 
     * @return Wrapped service client FrontDoorManagementClient.
     */
    public FrontDoorManagementClient serviceClient() {
        return this.clientObject;
    }
}
