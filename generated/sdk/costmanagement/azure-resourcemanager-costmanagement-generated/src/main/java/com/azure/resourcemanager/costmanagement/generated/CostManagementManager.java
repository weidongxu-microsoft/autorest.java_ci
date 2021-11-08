// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

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
import com.azure.resourcemanager.costmanagement.generated.fluent.CostManagementClient;
import com.azure.resourcemanager.costmanagement.generated.implementation.AlertsImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.CostManagementClientBuilder;
import com.azure.resourcemanager.costmanagement.generated.implementation.DimensionsImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.ExportsImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.ForecastsImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.GenerateReservationDetailsReportsImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.QueriesImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.SettingsImpl;
import com.azure.resourcemanager.costmanagement.generated.implementation.ViewsImpl;
import com.azure.resourcemanager.costmanagement.generated.models.Alerts;
import com.azure.resourcemanager.costmanagement.generated.models.Dimensions;
import com.azure.resourcemanager.costmanagement.generated.models.Exports;
import com.azure.resourcemanager.costmanagement.generated.models.Forecasts;
import com.azure.resourcemanager.costmanagement.generated.models.GenerateReservationDetailsReports;
import com.azure.resourcemanager.costmanagement.generated.models.Operations;
import com.azure.resourcemanager.costmanagement.generated.models.Queries;
import com.azure.resourcemanager.costmanagement.generated.models.Settings;
import com.azure.resourcemanager.costmanagement.generated.models.Views;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to CostManagementManager. */
public final class CostManagementManager {
    private Settings settings;

    private Views views;

    private Alerts alerts;

    private Forecasts forecasts;

    private Dimensions dimensions;

    private Queries queries;

    private GenerateReservationDetailsReports generateReservationDetailsReports;

    private Operations operations;

    private Exports exports;

    private final CostManagementClient clientObject;

    private CostManagementManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new CostManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of CostManagement service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the CostManagement service API instance.
     */
    public static CostManagementManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create CostManagementManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new CostManagementManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

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
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of CostManagement service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the CostManagement service API instance.
         */
        public CostManagementManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.costmanagement.generated")
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
            return new CostManagementManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Settings. */
    public Settings settings() {
        if (this.settings == null) {
            this.settings = new SettingsImpl(clientObject.getSettings(), this);
        }
        return settings;
    }

    /** @return Resource collection API of Views. */
    public Views views() {
        if (this.views == null) {
            this.views = new ViewsImpl(clientObject.getViews(), this);
        }
        return views;
    }

    /** @return Resource collection API of Alerts. */
    public Alerts alerts() {
        if (this.alerts == null) {
            this.alerts = new AlertsImpl(clientObject.getAlerts(), this);
        }
        return alerts;
    }

    /** @return Resource collection API of Forecasts. */
    public Forecasts forecasts() {
        if (this.forecasts == null) {
            this.forecasts = new ForecastsImpl(clientObject.getForecasts(), this);
        }
        return forecasts;
    }

    /** @return Resource collection API of Dimensions. */
    public Dimensions dimensions() {
        if (this.dimensions == null) {
            this.dimensions = new DimensionsImpl(clientObject.getDimensions(), this);
        }
        return dimensions;
    }

    /** @return Resource collection API of Queries. */
    public Queries queries() {
        if (this.queries == null) {
            this.queries = new QueriesImpl(clientObject.getQueries(), this);
        }
        return queries;
    }

    /** @return Resource collection API of GenerateReservationDetailsReports. */
    public GenerateReservationDetailsReports generateReservationDetailsReports() {
        if (this.generateReservationDetailsReports == null) {
            this.generateReservationDetailsReports =
                new GenerateReservationDetailsReportsImpl(clientObject.getGenerateReservationDetailsReports(), this);
        }
        return generateReservationDetailsReports;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Exports. */
    public Exports exports() {
        if (this.exports == null) {
            this.exports = new ExportsImpl(clientObject.getExports(), this);
        }
        return exports;
    }

    /**
     * @return Wrapped service client CostManagementClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public CostManagementClient serviceClient() {
        return this.clientObject;
    }
}
