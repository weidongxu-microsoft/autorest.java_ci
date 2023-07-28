// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

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
import com.azure.resourcemanager.applicationinsights.generated.fluent.ApplicationInsightsManagementClient;
import com.azure.resourcemanager.applicationinsights.generated.implementation.AnalyticsItemsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.AnnotationsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ApiKeysImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ApplicationInsightsManagementClientBuilder;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ComponentAvailableFeaturesImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ComponentCurrentBillingFeaturesImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ComponentFeatureCapabilitiesImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ComponentLinkedStorageAccountsOperationsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ComponentQuotaStatusImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ComponentsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ExportConfigurationsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.FavoritesImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.MyWorkbooksImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.ProactiveDetectionConfigurationsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.WebTestLocationsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.WebTestsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.WorkItemConfigurationsImpl;
import com.azure.resourcemanager.applicationinsights.generated.implementation.WorkbooksImpl;
import com.azure.resourcemanager.applicationinsights.generated.models.AnalyticsItems;
import com.azure.resourcemanager.applicationinsights.generated.models.Annotations;
import com.azure.resourcemanager.applicationinsights.generated.models.ApiKeys;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentAvailableFeatures;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentCurrentBillingFeatures;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentFeatureCapabilities;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentLinkedStorageAccountsOperations;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentQuotaStatus;
import com.azure.resourcemanager.applicationinsights.generated.models.Components;
import com.azure.resourcemanager.applicationinsights.generated.models.ExportConfigurations;
import com.azure.resourcemanager.applicationinsights.generated.models.Favorites;
import com.azure.resourcemanager.applicationinsights.generated.models.MyWorkbooks;
import com.azure.resourcemanager.applicationinsights.generated.models.Operations;
import com.azure.resourcemanager.applicationinsights.generated.models.ProactiveDetectionConfigurations;
import com.azure.resourcemanager.applicationinsights.generated.models.WebTestLocations;
import com.azure.resourcemanager.applicationinsights.generated.models.WebTests;
import com.azure.resourcemanager.applicationinsights.generated.models.WorkItemConfigurations;
import com.azure.resourcemanager.applicationinsights.generated.models.Workbooks;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to ApplicationInsightsManager. Composite Swagger for Application Insights Management Client. */
public final class ApplicationInsightsManager {
    private Operations operations;

    private Annotations annotations;

    private ApiKeys apiKeys;

    private ExportConfigurations exportConfigurations;

    private ComponentCurrentBillingFeatures componentCurrentBillingFeatures;

    private ComponentQuotaStatus componentQuotaStatus;

    private ComponentFeatureCapabilities componentFeatureCapabilities;

    private ComponentAvailableFeatures componentAvailableFeatures;

    private ProactiveDetectionConfigurations proactiveDetectionConfigurations;

    private WorkItemConfigurations workItemConfigurations;

    private Favorites favorites;

    private WebTestLocations webTestLocations;

    private WebTests webTests;

    private AnalyticsItems analyticsItems;

    private Workbooks workbooks;

    private MyWorkbooks myWorkbooks;

    private Components components;

    private ComponentLinkedStorageAccountsOperations componentLinkedStorageAccountsOperations;

    private final ApplicationInsightsManagementClient clientObject;

    private ApplicationInsightsManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new ApplicationInsightsManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of ApplicationInsights service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the ApplicationInsights service API instance.
     */
    public static ApplicationInsightsManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of ApplicationInsights service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the ApplicationInsights service API instance.
     */
    public static ApplicationInsightsManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ApplicationInsightsManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create ApplicationInsightsManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ApplicationInsightsManager.Configurable();
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
         * Creates an instance of ApplicationInsights service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the ApplicationInsights service API instance.
         */
        public ApplicationInsightsManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.applicationinsights.generated")
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
            return new ApplicationInsightsManager(httpPipeline, profile, defaultPollInterval);
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
     * Gets the resource collection API of Annotations.
     *
     * @return Resource collection API of Annotations.
     */
    public Annotations annotations() {
        if (this.annotations == null) {
            this.annotations = new AnnotationsImpl(clientObject.getAnnotations(), this);
        }
        return annotations;
    }

    /**
     * Gets the resource collection API of ApiKeys.
     *
     * @return Resource collection API of ApiKeys.
     */
    public ApiKeys apiKeys() {
        if (this.apiKeys == null) {
            this.apiKeys = new ApiKeysImpl(clientObject.getApiKeys(), this);
        }
        return apiKeys;
    }

    /**
     * Gets the resource collection API of ExportConfigurations.
     *
     * @return Resource collection API of ExportConfigurations.
     */
    public ExportConfigurations exportConfigurations() {
        if (this.exportConfigurations == null) {
            this.exportConfigurations = new ExportConfigurationsImpl(clientObject.getExportConfigurations(), this);
        }
        return exportConfigurations;
    }

    /**
     * Gets the resource collection API of ComponentCurrentBillingFeatures.
     *
     * @return Resource collection API of ComponentCurrentBillingFeatures.
     */
    public ComponentCurrentBillingFeatures componentCurrentBillingFeatures() {
        if (this.componentCurrentBillingFeatures == null) {
            this.componentCurrentBillingFeatures =
                new ComponentCurrentBillingFeaturesImpl(clientObject.getComponentCurrentBillingFeatures(), this);
        }
        return componentCurrentBillingFeatures;
    }

    /**
     * Gets the resource collection API of ComponentQuotaStatus.
     *
     * @return Resource collection API of ComponentQuotaStatus.
     */
    public ComponentQuotaStatus componentQuotaStatus() {
        if (this.componentQuotaStatus == null) {
            this.componentQuotaStatus = new ComponentQuotaStatusImpl(clientObject.getComponentQuotaStatus(), this);
        }
        return componentQuotaStatus;
    }

    /**
     * Gets the resource collection API of ComponentFeatureCapabilities.
     *
     * @return Resource collection API of ComponentFeatureCapabilities.
     */
    public ComponentFeatureCapabilities componentFeatureCapabilities() {
        if (this.componentFeatureCapabilities == null) {
            this.componentFeatureCapabilities =
                new ComponentFeatureCapabilitiesImpl(clientObject.getComponentFeatureCapabilities(), this);
        }
        return componentFeatureCapabilities;
    }

    /**
     * Gets the resource collection API of ComponentAvailableFeatures.
     *
     * @return Resource collection API of ComponentAvailableFeatures.
     */
    public ComponentAvailableFeatures componentAvailableFeatures() {
        if (this.componentAvailableFeatures == null) {
            this.componentAvailableFeatures =
                new ComponentAvailableFeaturesImpl(clientObject.getComponentAvailableFeatures(), this);
        }
        return componentAvailableFeatures;
    }

    /**
     * Gets the resource collection API of ProactiveDetectionConfigurations.
     *
     * @return Resource collection API of ProactiveDetectionConfigurations.
     */
    public ProactiveDetectionConfigurations proactiveDetectionConfigurations() {
        if (this.proactiveDetectionConfigurations == null) {
            this.proactiveDetectionConfigurations =
                new ProactiveDetectionConfigurationsImpl(clientObject.getProactiveDetectionConfigurations(), this);
        }
        return proactiveDetectionConfigurations;
    }

    /**
     * Gets the resource collection API of WorkItemConfigurations.
     *
     * @return Resource collection API of WorkItemConfigurations.
     */
    public WorkItemConfigurations workItemConfigurations() {
        if (this.workItemConfigurations == null) {
            this.workItemConfigurations =
                new WorkItemConfigurationsImpl(clientObject.getWorkItemConfigurations(), this);
        }
        return workItemConfigurations;
    }

    /**
     * Gets the resource collection API of Favorites.
     *
     * @return Resource collection API of Favorites.
     */
    public Favorites favorites() {
        if (this.favorites == null) {
            this.favorites = new FavoritesImpl(clientObject.getFavorites(), this);
        }
        return favorites;
    }

    /**
     * Gets the resource collection API of WebTestLocations.
     *
     * @return Resource collection API of WebTestLocations.
     */
    public WebTestLocations webTestLocations() {
        if (this.webTestLocations == null) {
            this.webTestLocations = new WebTestLocationsImpl(clientObject.getWebTestLocations(), this);
        }
        return webTestLocations;
    }

    /**
     * Gets the resource collection API of WebTests. It manages WebTest.
     *
     * @return Resource collection API of WebTests.
     */
    public WebTests webTests() {
        if (this.webTests == null) {
            this.webTests = new WebTestsImpl(clientObject.getWebTests(), this);
        }
        return webTests;
    }

    /**
     * Gets the resource collection API of AnalyticsItems.
     *
     * @return Resource collection API of AnalyticsItems.
     */
    public AnalyticsItems analyticsItems() {
        if (this.analyticsItems == null) {
            this.analyticsItems = new AnalyticsItemsImpl(clientObject.getAnalyticsItems(), this);
        }
        return analyticsItems;
    }

    /**
     * Gets the resource collection API of Workbooks. It manages Workbook.
     *
     * @return Resource collection API of Workbooks.
     */
    public Workbooks workbooks() {
        if (this.workbooks == null) {
            this.workbooks = new WorkbooksImpl(clientObject.getWorkbooks(), this);
        }
        return workbooks;
    }

    /**
     * Gets the resource collection API of MyWorkbooks. It manages MyWorkbook.
     *
     * @return Resource collection API of MyWorkbooks.
     */
    public MyWorkbooks myWorkbooks() {
        if (this.myWorkbooks == null) {
            this.myWorkbooks = new MyWorkbooksImpl(clientObject.getMyWorkbooks(), this);
        }
        return myWorkbooks;
    }

    /**
     * Gets the resource collection API of Components. It manages ApplicationInsightsComponent.
     *
     * @return Resource collection API of Components.
     */
    public Components components() {
        if (this.components == null) {
            this.components = new ComponentsImpl(clientObject.getComponents(), this);
        }
        return components;
    }

    /**
     * Gets the resource collection API of ComponentLinkedStorageAccountsOperations. It manages
     * ComponentLinkedStorageAccounts.
     *
     * @return Resource collection API of ComponentLinkedStorageAccountsOperations.
     */
    public ComponentLinkedStorageAccountsOperations componentLinkedStorageAccountsOperations() {
        if (this.componentLinkedStorageAccountsOperations == null) {
            this.componentLinkedStorageAccountsOperations =
                new ComponentLinkedStorageAccountsOperationsImpl(
                    clientObject.getComponentLinkedStorageAccountsOperations(), this);
        }
        return componentLinkedStorageAccountsOperations;
    }

    /**
     * Gets wrapped service client ApplicationInsightsManagementClient providing direct access to the underlying
     * auto-generated API implementation, based on Azure REST API.
     *
     * @return Wrapped service client ApplicationInsightsManagementClient.
     */
    public ApplicationInsightsManagementClient serviceClient() {
        return this.clientObject;
    }
}
