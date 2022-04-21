// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

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
import com.azure.resourcemanager.recoveryservices.generated.fluent.RecoveryServicesManagementClient;
import com.azure.resourcemanager.recoveryservices.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.PrivateLinkResourcesOperationsImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.RecoveryServicesManagementClientBuilder;
import com.azure.resourcemanager.recoveryservices.generated.implementation.RegisteredIdentitiesImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.ReplicationUsagesImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.UsagesImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.VaultCertificatesImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.VaultExtendedInfoesImpl;
import com.azure.resourcemanager.recoveryservices.generated.implementation.VaultsImpl;
import com.azure.resourcemanager.recoveryservices.generated.models.Operations;
import com.azure.resourcemanager.recoveryservices.generated.models.PrivateLinkResourcesOperations;
import com.azure.resourcemanager.recoveryservices.generated.models.RecoveryServices;
import com.azure.resourcemanager.recoveryservices.generated.models.RegisteredIdentities;
import com.azure.resourcemanager.recoveryservices.generated.models.ReplicationUsages;
import com.azure.resourcemanager.recoveryservices.generated.models.ResourceProviders;
import com.azure.resourcemanager.recoveryservices.generated.models.Usages;
import com.azure.resourcemanager.recoveryservices.generated.models.VaultCertificates;
import com.azure.resourcemanager.recoveryservices.generated.models.VaultExtendedInfoes;
import com.azure.resourcemanager.recoveryservices.generated.models.Vaults;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to RecoveryServicesManager. Recovery Services Client. */
public final class RecoveryServicesManager {
    private VaultCertificates vaultCertificates;

    private RegisteredIdentities registeredIdentities;

    private ReplicationUsages replicationUsages;

    private PrivateLinkResourcesOperations privateLinkResourcesOperations;

    private RecoveryServices recoveryServices;

    private Vaults vaults;

    private Operations operations;

    private VaultExtendedInfoes vaultExtendedInfoes;

    private ResourceProviders resourceProviders;

    private Usages usages;

    private final RecoveryServicesManagementClient clientObject;

    private RecoveryServicesManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new RecoveryServicesManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of RecoveryServices service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the RecoveryServices service API instance.
     */
    public static RecoveryServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of RecoveryServices service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the RecoveryServices service API instance.
     */
    public static RecoveryServicesManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new RecoveryServicesManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create RecoveryServicesManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new RecoveryServicesManager.Configurable();
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
         * Creates an instance of RecoveryServices service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the RecoveryServices service API instance.
         */
        public RecoveryServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.recoveryservices.generated")
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
            return new RecoveryServicesManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of VaultCertificates.
     *
     * @return Resource collection API of VaultCertificates.
     */
    public VaultCertificates vaultCertificates() {
        if (this.vaultCertificates == null) {
            this.vaultCertificates = new VaultCertificatesImpl(clientObject.getVaultCertificates(), this);
        }
        return vaultCertificates;
    }

    /**
     * Gets the resource collection API of RegisteredIdentities.
     *
     * @return Resource collection API of RegisteredIdentities.
     */
    public RegisteredIdentities registeredIdentities() {
        if (this.registeredIdentities == null) {
            this.registeredIdentities = new RegisteredIdentitiesImpl(clientObject.getRegisteredIdentities(), this);
        }
        return registeredIdentities;
    }

    /**
     * Gets the resource collection API of ReplicationUsages.
     *
     * @return Resource collection API of ReplicationUsages.
     */
    public ReplicationUsages replicationUsages() {
        if (this.replicationUsages == null) {
            this.replicationUsages = new ReplicationUsagesImpl(clientObject.getReplicationUsages(), this);
        }
        return replicationUsages;
    }

    /**
     * Gets the resource collection API of PrivateLinkResourcesOperations.
     *
     * @return Resource collection API of PrivateLinkResourcesOperations.
     */
    public PrivateLinkResourcesOperations privateLinkResourcesOperations() {
        if (this.privateLinkResourcesOperations == null) {
            this.privateLinkResourcesOperations =
                new PrivateLinkResourcesOperationsImpl(clientObject.getPrivateLinkResourcesOperations(), this);
        }
        return privateLinkResourcesOperations;
    }

    /**
     * Gets the resource collection API of RecoveryServices.
     *
     * @return Resource collection API of RecoveryServices.
     */
    public RecoveryServices recoveryServices() {
        if (this.recoveryServices == null) {
            this.recoveryServices = new RecoveryServicesImpl(clientObject.getRecoveryServices(), this);
        }
        return recoveryServices;
    }

    /**
     * Gets the resource collection API of Vaults.
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
     * Gets the resource collection API of VaultExtendedInfoes.
     *
     * @return Resource collection API of VaultExtendedInfoes.
     */
    public VaultExtendedInfoes vaultExtendedInfoes() {
        if (this.vaultExtendedInfoes == null) {
            this.vaultExtendedInfoes = new VaultExtendedInfoesImpl(clientObject.getVaultExtendedInfoes(), this);
        }
        return vaultExtendedInfoes;
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
     * @return Wrapped service client RecoveryServicesManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public RecoveryServicesManagementClient serviceClient() {
        return this.clientObject;
    }
}
