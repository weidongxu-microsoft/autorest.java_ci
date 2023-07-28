// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

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
import com.azure.resourcemanager.keyvault.generated.fluent.KeyVaultManagementClient;
import com.azure.resourcemanager.keyvault.generated.implementation.KeyVaultManagementClientBuilder;
import com.azure.resourcemanager.keyvault.generated.implementation.KeysImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.ManagedHsmKeysImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.ManagedHsmsImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.MhsmPrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.MhsmPrivateLinkResourcesImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.MhsmRegionsImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.SecretsImpl;
import com.azure.resourcemanager.keyvault.generated.implementation.VaultsImpl;
import com.azure.resourcemanager.keyvault.generated.models.Keys;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmKeys;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsms;
import com.azure.resourcemanager.keyvault.generated.models.MhsmPrivateEndpointConnections;
import com.azure.resourcemanager.keyvault.generated.models.MhsmPrivateLinkResources;
import com.azure.resourcemanager.keyvault.generated.models.MhsmRegions;
import com.azure.resourcemanager.keyvault.generated.models.Operations;
import com.azure.resourcemanager.keyvault.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.keyvault.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.keyvault.generated.models.Secrets;
import com.azure.resourcemanager.keyvault.generated.models.Vaults;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to KeyVaultManager. The Azure management API provides a RESTful set of web services that interact with
 * Azure Key Vault.
 */
public final class KeyVaultManager {
    private Keys keys;

    private ManagedHsmKeys managedHsmKeys;

    private Vaults vaults;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private ManagedHsms managedHsms;

    private MhsmPrivateEndpointConnections mhsmPrivateEndpointConnections;

    private MhsmPrivateLinkResources mhsmPrivateLinkResources;

    private MhsmRegions mhsmRegions;

    private Operations operations;

    private Secrets secrets;

    private final KeyVaultManagementClient clientObject;

    private KeyVaultManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new KeyVaultManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of KeyVault service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the KeyVault service API instance.
     */
    public static KeyVaultManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of KeyVault service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the KeyVault service API instance.
     */
    public static KeyVaultManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new KeyVaultManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create KeyVaultManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new KeyVaultManager.Configurable();
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
         * Creates an instance of KeyVault service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the KeyVault service API instance.
         */
        public KeyVaultManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.keyvault.generated")
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
            return new KeyVaultManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Keys. It manages Key.
     *
     * @return Resource collection API of Keys.
     */
    public Keys keys() {
        if (this.keys == null) {
            this.keys = new KeysImpl(clientObject.getKeys(), this);
        }
        return keys;
    }

    /**
     * Gets the resource collection API of ManagedHsmKeys. It manages ManagedHsmKey.
     *
     * @return Resource collection API of ManagedHsmKeys.
     */
    public ManagedHsmKeys managedHsmKeys() {
        if (this.managedHsmKeys == null) {
            this.managedHsmKeys = new ManagedHsmKeysImpl(clientObject.getManagedHsmKeys(), this);
        }
        return managedHsmKeys;
    }

    /**
     * Gets the resource collection API of Vaults. It manages Vault.
     *
     * @return Resource collection API of Vaults.
     */
    public Vaults vaults() {
        if (this.vaults == null) {
            this.vaults = new VaultsImpl(clientObject.getVaults(), this);
        }
        return vaults;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections. It manages PrivateEndpointConnection.
     *
     * @return Resource collection API of PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
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
     * Gets the resource collection API of ManagedHsms. It manages ManagedHsm.
     *
     * @return Resource collection API of ManagedHsms.
     */
    public ManagedHsms managedHsms() {
        if (this.managedHsms == null) {
            this.managedHsms = new ManagedHsmsImpl(clientObject.getManagedHsms(), this);
        }
        return managedHsms;
    }

    /**
     * Gets the resource collection API of MhsmPrivateEndpointConnections. It manages MhsmPrivateEndpointConnection.
     *
     * @return Resource collection API of MhsmPrivateEndpointConnections.
     */
    public MhsmPrivateEndpointConnections mhsmPrivateEndpointConnections() {
        if (this.mhsmPrivateEndpointConnections == null) {
            this.mhsmPrivateEndpointConnections =
                new MhsmPrivateEndpointConnectionsImpl(clientObject.getMhsmPrivateEndpointConnections(), this);
        }
        return mhsmPrivateEndpointConnections;
    }

    /**
     * Gets the resource collection API of MhsmPrivateLinkResources.
     *
     * @return Resource collection API of MhsmPrivateLinkResources.
     */
    public MhsmPrivateLinkResources mhsmPrivateLinkResources() {
        if (this.mhsmPrivateLinkResources == null) {
            this.mhsmPrivateLinkResources =
                new MhsmPrivateLinkResourcesImpl(clientObject.getMhsmPrivateLinkResources(), this);
        }
        return mhsmPrivateLinkResources;
    }

    /**
     * Gets the resource collection API of MhsmRegions.
     *
     * @return Resource collection API of MhsmRegions.
     */
    public MhsmRegions mhsmRegions() {
        if (this.mhsmRegions == null) {
            this.mhsmRegions = new MhsmRegionsImpl(clientObject.getMhsmRegions(), this);
        }
        return mhsmRegions;
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
     * Gets the resource collection API of Secrets. It manages Secret.
     *
     * @return Resource collection API of Secrets.
     */
    public Secrets secrets() {
        if (this.secrets == null) {
            this.secrets = new SecretsImpl(clientObject.getSecrets(), this);
        }
        return secrets;
    }

    /**
     * Gets wrapped service client KeyVaultManagementClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     *
     * @return Wrapped service client KeyVaultManagementClient.
     */
    public KeyVaultManagementClient serviceClient() {
        return this.clientObject;
    }
}
