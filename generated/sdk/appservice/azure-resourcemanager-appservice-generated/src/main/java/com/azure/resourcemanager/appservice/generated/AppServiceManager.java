// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

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
import com.azure.resourcemanager.appservice.generated.fluent.WebSiteManagementClient;
import com.azure.resourcemanager.appservice.generated.implementation.AppServiceCertificateOrdersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.AppServiceEnvironmentsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.AppServicePlansImpl;
import com.azure.resourcemanager.appservice.generated.implementation.CertificateOrdersDiagnosticsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.CertificateRegistrationProvidersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.CertificatesImpl;
import com.azure.resourcemanager.appservice.generated.implementation.ContainerAppsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.ContainerAppsRevisionsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DeletedWebAppsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DiagnosticsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DomainRegistrationProvidersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.DomainsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.GetUsagesInLocationsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.GlobalsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.KubeEnvironmentsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.ProvidersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.RecommendationsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.ResourceHealthMetadatasImpl;
import com.azure.resourcemanager.appservice.generated.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.StaticSitesImpl;
import com.azure.resourcemanager.appservice.generated.implementation.TopLevelDomainsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WebAppsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WebSiteManagementClientBuilder;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowRunActionRepetitionsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowRunActionRepetitionsRequestHistoriesImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowRunActionScopeRepetitionsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowRunActionsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowRunsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowsImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowTriggerHistoriesImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowTriggersImpl;
import com.azure.resourcemanager.appservice.generated.implementation.WorkflowVersionsImpl;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrders;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironments;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlans;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrdersDiagnostics;
import com.azure.resourcemanager.appservice.generated.models.CertificateRegistrationProviders;
import com.azure.resourcemanager.appservice.generated.models.Certificates;
import com.azure.resourcemanager.appservice.generated.models.ContainerApps;
import com.azure.resourcemanager.appservice.generated.models.ContainerAppsRevisions;
import com.azure.resourcemanager.appservice.generated.models.DeletedWebApps;
import com.azure.resourcemanager.appservice.generated.models.Diagnostics;
import com.azure.resourcemanager.appservice.generated.models.DomainRegistrationProviders;
import com.azure.resourcemanager.appservice.generated.models.Domains;
import com.azure.resourcemanager.appservice.generated.models.GetUsagesInLocations;
import com.azure.resourcemanager.appservice.generated.models.Globals;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironments;
import com.azure.resourcemanager.appservice.generated.models.Providers;
import com.azure.resourcemanager.appservice.generated.models.Recommendations;
import com.azure.resourcemanager.appservice.generated.models.ResourceHealthMetadatas;
import com.azure.resourcemanager.appservice.generated.models.ResourceProviders;
import com.azure.resourcemanager.appservice.generated.models.StaticSites;
import com.azure.resourcemanager.appservice.generated.models.TopLevelDomains;
import com.azure.resourcemanager.appservice.generated.models.WebApps;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunActionRepetitions;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunActionRepetitionsRequestHistories;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunActions;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunActionScopeRepetitions;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRuns;
import com.azure.resourcemanager.appservice.generated.models.Workflows;
import com.azure.resourcemanager.appservice.generated.models.WorkflowTriggerHistories;
import com.azure.resourcemanager.appservice.generated.models.WorkflowTriggers;
import com.azure.resourcemanager.appservice.generated.models.WorkflowVersions;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to AppServiceManager.
 * WebSite Management Client.
 */
public final class AppServiceManager {
    private AppServiceCertificateOrders appServiceCertificateOrders;

    private CertificateOrdersDiagnostics certificateOrdersDiagnostics;

    private CertificateRegistrationProviders certificateRegistrationProviders;

    private Domains domains;

    private TopLevelDomains topLevelDomains;

    private DomainRegistrationProviders domainRegistrationProviders;

    private AppServiceEnvironments appServiceEnvironments;

    private AppServicePlans appServicePlans;

    private Certificates certificates;

    private ContainerApps containerApps;

    private ContainerAppsRevisions containerAppsRevisions;

    private DeletedWebApps deletedWebApps;

    private Diagnostics diagnostics;

    private Globals globals;

    private KubeEnvironments kubeEnvironments;

    private Providers providers;

    private Recommendations recommendations;

    private ResourceHealthMetadatas resourceHealthMetadatas;

    private ResourceProviders resourceProviders;

    private GetUsagesInLocations getUsagesInLocations;

    private StaticSites staticSites;

    private WebApps webApps;

    private Workflows workflows;

    private WorkflowRuns workflowRuns;

    private WorkflowRunActions workflowRunActions;

    private WorkflowRunActionRepetitions workflowRunActionRepetitions;

    private WorkflowRunActionRepetitionsRequestHistories workflowRunActionRepetitionsRequestHistories;

    private WorkflowRunActionScopeRepetitions workflowRunActionScopeRepetitions;

    private WorkflowTriggers workflowTriggers;

    private WorkflowTriggerHistories workflowTriggerHistories;

    private WorkflowVersions workflowVersions;

    private final WebSiteManagementClient clientObject;

    private AppServiceManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new WebSiteManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of AppService service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the AppService service API instance.
     */
    public static AppServiceManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of AppService service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the AppService service API instance.
     */
    public static AppServiceManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new AppServiceManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create AppServiceManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new AppServiceManager.Configurable();
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
         * Creates an instance of AppService service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the AppService service API instance.
         */
        public AppServiceManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.appservice.generated")
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
            return new AppServiceManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of AppServiceCertificateOrders. It manages AppServiceCertificateOrder,
     * AppServiceCertificateResource.
     * 
     * @return Resource collection API of AppServiceCertificateOrders.
     */
    public AppServiceCertificateOrders appServiceCertificateOrders() {
        if (this.appServiceCertificateOrders == null) {
            this.appServiceCertificateOrders
                = new AppServiceCertificateOrdersImpl(clientObject.getAppServiceCertificateOrders(), this);
        }
        return appServiceCertificateOrders;
    }

    /**
     * Gets the resource collection API of CertificateOrdersDiagnostics.
     * 
     * @return Resource collection API of CertificateOrdersDiagnostics.
     */
    public CertificateOrdersDiagnostics certificateOrdersDiagnostics() {
        if (this.certificateOrdersDiagnostics == null) {
            this.certificateOrdersDiagnostics
                = new CertificateOrdersDiagnosticsImpl(clientObject.getCertificateOrdersDiagnostics(), this);
        }
        return certificateOrdersDiagnostics;
    }

    /**
     * Gets the resource collection API of CertificateRegistrationProviders.
     * 
     * @return Resource collection API of CertificateRegistrationProviders.
     */
    public CertificateRegistrationProviders certificateRegistrationProviders() {
        if (this.certificateRegistrationProviders == null) {
            this.certificateRegistrationProviders
                = new CertificateRegistrationProvidersImpl(clientObject.getCertificateRegistrationProviders(), this);
        }
        return certificateRegistrationProviders;
    }

    /**
     * Gets the resource collection API of Domains. It manages Domain, DomainOwnershipIdentifier.
     * 
     * @return Resource collection API of Domains.
     */
    public Domains domains() {
        if (this.domains == null) {
            this.domains = new DomainsImpl(clientObject.getDomains(), this);
        }
        return domains;
    }

    /**
     * Gets the resource collection API of TopLevelDomains.
     * 
     * @return Resource collection API of TopLevelDomains.
     */
    public TopLevelDomains topLevelDomains() {
        if (this.topLevelDomains == null) {
            this.topLevelDomains = new TopLevelDomainsImpl(clientObject.getTopLevelDomains(), this);
        }
        return topLevelDomains;
    }

    /**
     * Gets the resource collection API of DomainRegistrationProviders.
     * 
     * @return Resource collection API of DomainRegistrationProviders.
     */
    public DomainRegistrationProviders domainRegistrationProviders() {
        if (this.domainRegistrationProviders == null) {
            this.domainRegistrationProviders
                = new DomainRegistrationProvidersImpl(clientObject.getDomainRegistrationProviders(), this);
        }
        return domainRegistrationProviders;
    }

    /**
     * Gets the resource collection API of AppServiceEnvironments. It manages AppServiceEnvironmentResource,
     * RemotePrivateEndpointConnectionArmResource, WorkerPoolResource.
     * 
     * @return Resource collection API of AppServiceEnvironments.
     */
    public AppServiceEnvironments appServiceEnvironments() {
        if (this.appServiceEnvironments == null) {
            this.appServiceEnvironments
                = new AppServiceEnvironmentsImpl(clientObject.getAppServiceEnvironments(), this);
        }
        return appServiceEnvironments;
    }

    /**
     * Gets the resource collection API of AppServicePlans. It manages AppServicePlan, VnetRoute.
     * 
     * @return Resource collection API of AppServicePlans.
     */
    public AppServicePlans appServicePlans() {
        if (this.appServicePlans == null) {
            this.appServicePlans = new AppServicePlansImpl(clientObject.getAppServicePlans(), this);
        }
        return appServicePlans;
    }

    /**
     * Gets the resource collection API of Certificates. It manages Certificate.
     * 
     * @return Resource collection API of Certificates.
     */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(clientObject.getCertificates(), this);
        }
        return certificates;
    }

    /**
     * Gets the resource collection API of ContainerApps. It manages ContainerApp.
     * 
     * @return Resource collection API of ContainerApps.
     */
    public ContainerApps containerApps() {
        if (this.containerApps == null) {
            this.containerApps = new ContainerAppsImpl(clientObject.getContainerApps(), this);
        }
        return containerApps;
    }

    /**
     * Gets the resource collection API of ContainerAppsRevisions.
     * 
     * @return Resource collection API of ContainerAppsRevisions.
     */
    public ContainerAppsRevisions containerAppsRevisions() {
        if (this.containerAppsRevisions == null) {
            this.containerAppsRevisions
                = new ContainerAppsRevisionsImpl(clientObject.getContainerAppsRevisions(), this);
        }
        return containerAppsRevisions;
    }

    /**
     * Gets the resource collection API of DeletedWebApps.
     * 
     * @return Resource collection API of DeletedWebApps.
     */
    public DeletedWebApps deletedWebApps() {
        if (this.deletedWebApps == null) {
            this.deletedWebApps = new DeletedWebAppsImpl(clientObject.getDeletedWebApps(), this);
        }
        return deletedWebApps;
    }

    /**
     * Gets the resource collection API of Diagnostics.
     * 
     * @return Resource collection API of Diagnostics.
     */
    public Diagnostics diagnostics() {
        if (this.diagnostics == null) {
            this.diagnostics = new DiagnosticsImpl(clientObject.getDiagnostics(), this);
        }
        return diagnostics;
    }

    /**
     * Gets the resource collection API of Globals.
     * 
     * @return Resource collection API of Globals.
     */
    public Globals globals() {
        if (this.globals == null) {
            this.globals = new GlobalsImpl(clientObject.getGlobals(), this);
        }
        return globals;
    }

    /**
     * Gets the resource collection API of KubeEnvironments. It manages KubeEnvironment.
     * 
     * @return Resource collection API of KubeEnvironments.
     */
    public KubeEnvironments kubeEnvironments() {
        if (this.kubeEnvironments == null) {
            this.kubeEnvironments = new KubeEnvironmentsImpl(clientObject.getKubeEnvironments(), this);
        }
        return kubeEnvironments;
    }

    /**
     * Gets the resource collection API of Providers.
     * 
     * @return Resource collection API of Providers.
     */
    public Providers providers() {
        if (this.providers == null) {
            this.providers = new ProvidersImpl(clientObject.getProviders(), this);
        }
        return providers;
    }

    /**
     * Gets the resource collection API of Recommendations.
     * 
     * @return Resource collection API of Recommendations.
     */
    public Recommendations recommendations() {
        if (this.recommendations == null) {
            this.recommendations = new RecommendationsImpl(clientObject.getRecommendations(), this);
        }
        return recommendations;
    }

    /**
     * Gets the resource collection API of ResourceHealthMetadatas.
     * 
     * @return Resource collection API of ResourceHealthMetadatas.
     */
    public ResourceHealthMetadatas resourceHealthMetadatas() {
        if (this.resourceHealthMetadatas == null) {
            this.resourceHealthMetadatas
                = new ResourceHealthMetadatasImpl(clientObject.getResourceHealthMetadatas(), this);
        }
        return resourceHealthMetadatas;
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
     * Gets the resource collection API of GetUsagesInLocations.
     * 
     * @return Resource collection API of GetUsagesInLocations.
     */
    public GetUsagesInLocations getUsagesInLocations() {
        if (this.getUsagesInLocations == null) {
            this.getUsagesInLocations = new GetUsagesInLocationsImpl(clientObject.getGetUsagesInLocations(), this);
        }
        return getUsagesInLocations;
    }

    /**
     * Gets the resource collection API of StaticSites. It manages StaticSiteArmResource, DatabaseConnection,
     * StaticSiteUserProvidedFunctionAppArmResource, StaticSiteBasicAuthPropertiesArmResource,
     * StaticSiteCustomDomainOverviewArmResource, StaticSiteLinkedBackendArmResource.
     * 
     * @return Resource collection API of StaticSites.
     */
    public StaticSites staticSites() {
        if (this.staticSites == null) {
            this.staticSites = new StaticSitesImpl(clientObject.getStaticSites(), this);
        }
        return staticSites;
    }

    /**
     * Gets the resource collection API of WebApps. It manages Site, Deployment, Identifier, FunctionEnvelope,
     * HostnameBinding, HybridConnection, RelayServiceConnectionEntity, PremierAddOn, PublicCertificate, SiteContainer,
     * VnetInfoResource, VnetGateway.
     * 
     * @return Resource collection API of WebApps.
     */
    public WebApps webApps() {
        if (this.webApps == null) {
            this.webApps = new WebAppsImpl(clientObject.getWebApps(), this);
        }
        return webApps;
    }

    /**
     * Gets the resource collection API of Workflows.
     * 
     * @return Resource collection API of Workflows.
     */
    public Workflows workflows() {
        if (this.workflows == null) {
            this.workflows = new WorkflowsImpl(clientObject.getWorkflows(), this);
        }
        return workflows;
    }

    /**
     * Gets the resource collection API of WorkflowRuns.
     * 
     * @return Resource collection API of WorkflowRuns.
     */
    public WorkflowRuns workflowRuns() {
        if (this.workflowRuns == null) {
            this.workflowRuns = new WorkflowRunsImpl(clientObject.getWorkflowRuns(), this);
        }
        return workflowRuns;
    }

    /**
     * Gets the resource collection API of WorkflowRunActions.
     * 
     * @return Resource collection API of WorkflowRunActions.
     */
    public WorkflowRunActions workflowRunActions() {
        if (this.workflowRunActions == null) {
            this.workflowRunActions = new WorkflowRunActionsImpl(clientObject.getWorkflowRunActions(), this);
        }
        return workflowRunActions;
    }

    /**
     * Gets the resource collection API of WorkflowRunActionRepetitions.
     * 
     * @return Resource collection API of WorkflowRunActionRepetitions.
     */
    public WorkflowRunActionRepetitions workflowRunActionRepetitions() {
        if (this.workflowRunActionRepetitions == null) {
            this.workflowRunActionRepetitions
                = new WorkflowRunActionRepetitionsImpl(clientObject.getWorkflowRunActionRepetitions(), this);
        }
        return workflowRunActionRepetitions;
    }

    /**
     * Gets the resource collection API of WorkflowRunActionRepetitionsRequestHistories.
     * 
     * @return Resource collection API of WorkflowRunActionRepetitionsRequestHistories.
     */
    public WorkflowRunActionRepetitionsRequestHistories workflowRunActionRepetitionsRequestHistories() {
        if (this.workflowRunActionRepetitionsRequestHistories == null) {
            this.workflowRunActionRepetitionsRequestHistories = new WorkflowRunActionRepetitionsRequestHistoriesImpl(
                clientObject.getWorkflowRunActionRepetitionsRequestHistories(), this);
        }
        return workflowRunActionRepetitionsRequestHistories;
    }

    /**
     * Gets the resource collection API of WorkflowRunActionScopeRepetitions.
     * 
     * @return Resource collection API of WorkflowRunActionScopeRepetitions.
     */
    public WorkflowRunActionScopeRepetitions workflowRunActionScopeRepetitions() {
        if (this.workflowRunActionScopeRepetitions == null) {
            this.workflowRunActionScopeRepetitions
                = new WorkflowRunActionScopeRepetitionsImpl(clientObject.getWorkflowRunActionScopeRepetitions(), this);
        }
        return workflowRunActionScopeRepetitions;
    }

    /**
     * Gets the resource collection API of WorkflowTriggers.
     * 
     * @return Resource collection API of WorkflowTriggers.
     */
    public WorkflowTriggers workflowTriggers() {
        if (this.workflowTriggers == null) {
            this.workflowTriggers = new WorkflowTriggersImpl(clientObject.getWorkflowTriggers(), this);
        }
        return workflowTriggers;
    }

    /**
     * Gets the resource collection API of WorkflowTriggerHistories.
     * 
     * @return Resource collection API of WorkflowTriggerHistories.
     */
    public WorkflowTriggerHistories workflowTriggerHistories() {
        if (this.workflowTriggerHistories == null) {
            this.workflowTriggerHistories
                = new WorkflowTriggerHistoriesImpl(clientObject.getWorkflowTriggerHistories(), this);
        }
        return workflowTriggerHistories;
    }

    /**
     * Gets the resource collection API of WorkflowVersions.
     * 
     * @return Resource collection API of WorkflowVersions.
     */
    public WorkflowVersions workflowVersions() {
        if (this.workflowVersions == null) {
            this.workflowVersions = new WorkflowVersionsImpl(clientObject.getWorkflowVersions(), this);
        }
        return workflowVersions;
    }

    /**
     * Gets wrapped service client WebSiteManagementClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client WebSiteManagementClient.
     */
    public WebSiteManagementClient serviceClient() {
        return this.clientObject;
    }
}
