// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

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
import com.azure.resourcemanager.mediaservices.generated.fluent.AzureMediaServices;
import com.azure.resourcemanager.mediaservices.generated.implementation.AccountFiltersImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.AssetFiltersImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.AssetsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.AzureMediaServicesBuilder;
import com.azure.resourcemanager.mediaservices.generated.implementation.ContentKeyPoliciesImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.JobsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.LiveEventsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.LiveOutputsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.LocationsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.MediaServicesOperationResultsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.MediaServicesOperationStatusesImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.MediaservicesImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.OperationResultsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.OperationStatusesImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.StreamingEndpointsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.StreamingLocatorsImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.StreamingPoliciesImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.TracksImpl;
import com.azure.resourcemanager.mediaservices.generated.implementation.TransformsImpl;
import com.azure.resourcemanager.mediaservices.generated.models.AccountFilters;
import com.azure.resourcemanager.mediaservices.generated.models.AssetFilters;
import com.azure.resourcemanager.mediaservices.generated.models.Assets;
import com.azure.resourcemanager.mediaservices.generated.models.ContentKeyPolicies;
import com.azure.resourcemanager.mediaservices.generated.models.Jobs;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEvents;
import com.azure.resourcemanager.mediaservices.generated.models.LiveOutputs;
import com.azure.resourcemanager.mediaservices.generated.models.Locations;
import com.azure.resourcemanager.mediaservices.generated.models.MediaServicesOperationResults;
import com.azure.resourcemanager.mediaservices.generated.models.MediaServicesOperationStatuses;
import com.azure.resourcemanager.mediaservices.generated.models.Mediaservices;
import com.azure.resourcemanager.mediaservices.generated.models.OperationResults;
import com.azure.resourcemanager.mediaservices.generated.models.OperationStatuses;
import com.azure.resourcemanager.mediaservices.generated.models.Operations;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingEndpoints;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingLocators;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingPolicies;
import com.azure.resourcemanager.mediaservices.generated.models.Tracks;
import com.azure.resourcemanager.mediaservices.generated.models.Transforms;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to MediaServicesManager. This Swagger was generated by the API Framework. */
public final class MediaServicesManager {
    private AccountFilters accountFilters;

    private Operations operations;

    private Mediaservices mediaservices;

    private PrivateLinkResources privateLinkResources;

    private PrivateEndpointConnections privateEndpointConnections;

    private Locations locations;

    private MediaServicesOperationStatuses mediaServicesOperationStatuses;

    private MediaServicesOperationResults mediaServicesOperationResults;

    private Assets assets;

    private AssetFilters assetFilters;

    private Tracks tracks;

    private OperationStatuses operationStatuses;

    private OperationResults operationResults;

    private ContentKeyPolicies contentKeyPolicies;

    private Transforms transforms;

    private Jobs jobs;

    private StreamingPolicies streamingPolicies;

    private StreamingLocators streamingLocators;

    private LiveEvents liveEvents;

    private LiveOutputs liveOutputs;

    private StreamingEndpoints streamingEndpoints;

    private final AzureMediaServices clientObject;

    private MediaServicesManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AzureMediaServicesBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of MediaServices service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the MediaServices service API instance.
     */
    public static MediaServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of MediaServices service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the MediaServices service API instance.
     */
    public static MediaServicesManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new MediaServicesManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create MediaServicesManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MediaServicesManager.Configurable();
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
         * Creates an instance of MediaServices service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the MediaServices service API instance.
         */
        public MediaServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.mediaservices.generated")
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
            return new MediaServicesManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of AccountFilters. It manages AccountFilter.
     *
     * @return Resource collection API of AccountFilters.
     */
    public AccountFilters accountFilters() {
        if (this.accountFilters == null) {
            this.accountFilters = new AccountFiltersImpl(clientObject.getAccountFilters(), this);
        }
        return accountFilters;
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
     * Gets the resource collection API of Mediaservices. It manages MediaService.
     *
     * @return Resource collection API of Mediaservices.
     */
    public Mediaservices mediaservices() {
        if (this.mediaservices == null) {
            this.mediaservices = new MediaservicesImpl(clientObject.getMediaservices(), this);
        }
        return mediaservices;
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
     * Gets the resource collection API of Locations.
     *
     * @return Resource collection API of Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(clientObject.getLocations(), this);
        }
        return locations;
    }

    /**
     * Gets the resource collection API of MediaServicesOperationStatuses.
     *
     * @return Resource collection API of MediaServicesOperationStatuses.
     */
    public MediaServicesOperationStatuses mediaServicesOperationStatuses() {
        if (this.mediaServicesOperationStatuses == null) {
            this.mediaServicesOperationStatuses =
                new MediaServicesOperationStatusesImpl(clientObject.getMediaServicesOperationStatuses(), this);
        }
        return mediaServicesOperationStatuses;
    }

    /**
     * Gets the resource collection API of MediaServicesOperationResults.
     *
     * @return Resource collection API of MediaServicesOperationResults.
     */
    public MediaServicesOperationResults mediaServicesOperationResults() {
        if (this.mediaServicesOperationResults == null) {
            this.mediaServicesOperationResults =
                new MediaServicesOperationResultsImpl(clientObject.getMediaServicesOperationResults(), this);
        }
        return mediaServicesOperationResults;
    }

    /**
     * Gets the resource collection API of Assets. It manages Asset.
     *
     * @return Resource collection API of Assets.
     */
    public Assets assets() {
        if (this.assets == null) {
            this.assets = new AssetsImpl(clientObject.getAssets(), this);
        }
        return assets;
    }

    /**
     * Gets the resource collection API of AssetFilters. It manages AssetFilter.
     *
     * @return Resource collection API of AssetFilters.
     */
    public AssetFilters assetFilters() {
        if (this.assetFilters == null) {
            this.assetFilters = new AssetFiltersImpl(clientObject.getAssetFilters(), this);
        }
        return assetFilters;
    }

    /**
     * Gets the resource collection API of Tracks. It manages AssetTrack.
     *
     * @return Resource collection API of Tracks.
     */
    public Tracks tracks() {
        if (this.tracks == null) {
            this.tracks = new TracksImpl(clientObject.getTracks(), this);
        }
        return tracks;
    }

    /**
     * Gets the resource collection API of OperationStatuses.
     *
     * @return Resource collection API of OperationStatuses.
     */
    public OperationStatuses operationStatuses() {
        if (this.operationStatuses == null) {
            this.operationStatuses = new OperationStatusesImpl(clientObject.getOperationStatuses(), this);
        }
        return operationStatuses;
    }

    /**
     * Gets the resource collection API of OperationResults.
     *
     * @return Resource collection API of OperationResults.
     */
    public OperationResults operationResults() {
        if (this.operationResults == null) {
            this.operationResults = new OperationResultsImpl(clientObject.getOperationResults(), this);
        }
        return operationResults;
    }

    /**
     * Gets the resource collection API of ContentKeyPolicies. It manages ContentKeyPolicy.
     *
     * @return Resource collection API of ContentKeyPolicies.
     */
    public ContentKeyPolicies contentKeyPolicies() {
        if (this.contentKeyPolicies == null) {
            this.contentKeyPolicies = new ContentKeyPoliciesImpl(clientObject.getContentKeyPolicies(), this);
        }
        return contentKeyPolicies;
    }

    /**
     * Gets the resource collection API of Transforms. It manages Transform.
     *
     * @return Resource collection API of Transforms.
     */
    public Transforms transforms() {
        if (this.transforms == null) {
            this.transforms = new TransformsImpl(clientObject.getTransforms(), this);
        }
        return transforms;
    }

    /**
     * Gets the resource collection API of Jobs. It manages Job.
     *
     * @return Resource collection API of Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /**
     * Gets the resource collection API of StreamingPolicies. It manages StreamingPolicy.
     *
     * @return Resource collection API of StreamingPolicies.
     */
    public StreamingPolicies streamingPolicies() {
        if (this.streamingPolicies == null) {
            this.streamingPolicies = new StreamingPoliciesImpl(clientObject.getStreamingPolicies(), this);
        }
        return streamingPolicies;
    }

    /**
     * Gets the resource collection API of StreamingLocators. It manages StreamingLocator.
     *
     * @return Resource collection API of StreamingLocators.
     */
    public StreamingLocators streamingLocators() {
        if (this.streamingLocators == null) {
            this.streamingLocators = new StreamingLocatorsImpl(clientObject.getStreamingLocators(), this);
        }
        return streamingLocators;
    }

    /**
     * Gets the resource collection API of LiveEvents. It manages LiveEvent.
     *
     * @return Resource collection API of LiveEvents.
     */
    public LiveEvents liveEvents() {
        if (this.liveEvents == null) {
            this.liveEvents = new LiveEventsImpl(clientObject.getLiveEvents(), this);
        }
        return liveEvents;
    }

    /**
     * Gets the resource collection API of LiveOutputs. It manages LiveOutput.
     *
     * @return Resource collection API of LiveOutputs.
     */
    public LiveOutputs liveOutputs() {
        if (this.liveOutputs == null) {
            this.liveOutputs = new LiveOutputsImpl(clientObject.getLiveOutputs(), this);
        }
        return liveOutputs;
    }

    /**
     * Gets the resource collection API of StreamingEndpoints. It manages StreamingEndpoint.
     *
     * @return Resource collection API of StreamingEndpoints.
     */
    public StreamingEndpoints streamingEndpoints() {
        if (this.streamingEndpoints == null) {
            this.streamingEndpoints = new StreamingEndpointsImpl(clientObject.getStreamingEndpoints(), this);
        }
        return streamingEndpoints;
    }

    /**
     * Gets wrapped service client AzureMediaServices providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     *
     * @return Wrapped service client AzureMediaServices.
     */
    public AzureMediaServices serviceClient() {
        return this.clientObject;
    }
}
