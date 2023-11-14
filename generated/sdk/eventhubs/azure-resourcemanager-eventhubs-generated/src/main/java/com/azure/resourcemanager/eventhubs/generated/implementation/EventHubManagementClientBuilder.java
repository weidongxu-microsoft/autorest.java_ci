// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/**
 * A builder for creating a new instance of the EventHubManagementClientImpl type.
 */
@ServiceClientBuilder(serviceClients = { EventHubManagementClientImpl.class })
public final class EventHubManagementClientBuilder {
    /*
     * Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part
     * of the URI for every service call.
     */
    private String subscriptionId;

    /**
     * Sets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the EventHubManagementClientBuilder.
     */
    public EventHubManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String endpoint;

    /**
     * Sets server parameter.
     * 
     * @param endpoint the endpoint value.
     * @return the EventHubManagementClientBuilder.
     */
    public EventHubManagementClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the EventHubManagementClientBuilder.
     */
    public EventHubManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the EventHubManagementClientBuilder.
     */
    public EventHubManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The default poll interval for long-running operation
     */
    private Duration defaultPollInterval;

    /**
     * Sets The default poll interval for long-running operation.
     * 
     * @param defaultPollInterval the defaultPollInterval value.
     * @return the EventHubManagementClientBuilder.
     */
    public EventHubManagementClientBuilder defaultPollInterval(Duration defaultPollInterval) {
        this.defaultPollInterval = defaultPollInterval;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     * 
     * @param serializerAdapter the serializerAdapter value.
     * @return the EventHubManagementClientBuilder.
     */
    public EventHubManagementClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of EventHubManagementClientImpl with the provided parameters.
     * 
     * @return an instance of EventHubManagementClientImpl.
     */
    public EventHubManagementClientImpl buildClient() {
        String localEndpoint = (endpoint != null) ? endpoint : "https://management.azure.com";
        AzureEnvironment localEnvironment = (environment != null) ? environment : AzureEnvironment.AZURE;
        HttpPipeline localPipeline = (pipeline != null) ? pipeline
            : new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build();
        Duration localDefaultPollInterval
            = (defaultPollInterval != null) ? defaultPollInterval : Duration.ofSeconds(30);
        SerializerAdapter localSerializerAdapter = (serializerAdapter != null) ? serializerAdapter
            : SerializerFactory.createDefaultManagementSerializerAdapter();
        EventHubManagementClientImpl client = new EventHubManagementClientImpl(localPipeline, localSerializerAdapter,
            localDefaultPollInterval, localEnvironment, this.subscriptionId, localEndpoint);
        return client;
    }
}
