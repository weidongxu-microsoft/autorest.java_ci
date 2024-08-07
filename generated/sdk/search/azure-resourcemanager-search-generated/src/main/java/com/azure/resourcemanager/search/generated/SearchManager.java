// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

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
import com.azure.resourcemanager.search.generated.fluent.SearchManagementClient;
import com.azure.resourcemanager.search.generated.implementation.AdminKeysImpl;
import com.azure.resourcemanager.search.generated.implementation.NetworkSecurityPerimeterConfigurationsImpl;
import com.azure.resourcemanager.search.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.search.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.search.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.search.generated.implementation.QueryKeysImpl;
import com.azure.resourcemanager.search.generated.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.search.generated.implementation.SearchManagementClientBuilder;
import com.azure.resourcemanager.search.generated.implementation.ServicesImpl;
import com.azure.resourcemanager.search.generated.implementation.SharedPrivateLinkResourcesImpl;
import com.azure.resourcemanager.search.generated.implementation.UsagesImpl;
import com.azure.resourcemanager.search.generated.models.AdminKeys;
import com.azure.resourcemanager.search.generated.models.NetworkSecurityPerimeterConfigurations;
import com.azure.resourcemanager.search.generated.models.Operations;
import com.azure.resourcemanager.search.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.search.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.search.generated.models.QueryKeys;
import com.azure.resourcemanager.search.generated.models.ResourceProviders;
import com.azure.resourcemanager.search.generated.models.Services;
import com.azure.resourcemanager.search.generated.models.SharedPrivateLinkResources;
import com.azure.resourcemanager.search.generated.models.Usages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to SearchManager.
 * Client that can be used to manage Azure AI Search services and API keys.
 */
public final class SearchManager {
    private Operations operations;

    private AdminKeys adminKeys;

    private QueryKeys queryKeys;

    private Services services;

    private PrivateLinkResources privateLinkResources;

    private PrivateEndpointConnections privateEndpointConnections;

    private SharedPrivateLinkResources sharedPrivateLinkResources;

    private Usages usages;

    private ResourceProviders resourceProviders;

    private NetworkSecurityPerimeterConfigurations networkSecurityPerimeterConfigurations;

    private final SearchManagementClient clientObject;

    private SearchManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new SearchManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of Search service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Search service API instance.
     */
    public static SearchManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of Search service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the Search service API instance.
     */
    public static SearchManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new SearchManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create SearchManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new SearchManager.Configurable();
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
         * Creates an instance of Search service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Search service API instance.
         */
        public SearchManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.search.generated")
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
            return new SearchManager(httpPipeline, profile, defaultPollInterval);
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
     * Gets the resource collection API of AdminKeys.
     * 
     * @return Resource collection API of AdminKeys.
     */
    public AdminKeys adminKeys() {
        if (this.adminKeys == null) {
            this.adminKeys = new AdminKeysImpl(clientObject.getAdminKeys(), this);
        }
        return adminKeys;
    }

    /**
     * Gets the resource collection API of QueryKeys.
     * 
     * @return Resource collection API of QueryKeys.
     */
    public QueryKeys queryKeys() {
        if (this.queryKeys == null) {
            this.queryKeys = new QueryKeysImpl(clientObject.getQueryKeys(), this);
        }
        return queryKeys;
    }

    /**
     * Gets the resource collection API of Services. It manages SearchService.
     * 
     * @return Resource collection API of Services.
     */
    public Services services() {
        if (this.services == null) {
            this.services = new ServicesImpl(clientObject.getServices(), this);
        }
        return services;
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
     * Gets the resource collection API of PrivateEndpointConnections.
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
     * Gets the resource collection API of SharedPrivateLinkResources. It manages SharedPrivateLinkResource.
     * 
     * @return Resource collection API of SharedPrivateLinkResources.
     */
    public SharedPrivateLinkResources sharedPrivateLinkResources() {
        if (this.sharedPrivateLinkResources == null) {
            this.sharedPrivateLinkResources
                = new SharedPrivateLinkResourcesImpl(clientObject.getSharedPrivateLinkResources(), this);
        }
        return sharedPrivateLinkResources;
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
     * Gets the resource collection API of ResourceProviders.
     * 
     * @return Resource collection API of ResourceProviders.
     */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
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
     * Gets wrapped service client SearchManagementClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client SearchManagementClient.
     */
    public SearchManagementClient serviceClient() {
        return this.clientObject;
    }
}
