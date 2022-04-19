// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/** A builder for creating a new instance of the RelayApiImpl type. */
@ServiceClientBuilder(serviceClients = {RelayApiImpl.class})
public final class RelayApiBuilder {
    /*
     * Subscription credentials which uniquely identify the Microsoft Azure
     * subscription. The subscription ID forms part of the URI for every
     * service call.
     */
    private String subscriptionId;

    /**
     * Sets Subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the RelayApiBuilder.
     */
    public RelayApiBuilder subscriptionId(String subscriptionId) {
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
     * @return the RelayApiBuilder.
     */
    public RelayApiBuilder endpoint(String endpoint) {
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
     * @return the RelayApiBuilder.
     */
    public RelayApiBuilder environment(AzureEnvironment environment) {
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
     * @return the RelayApiBuilder.
     */
    public RelayApiBuilder pipeline(HttpPipeline pipeline) {
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
     * @return the RelayApiBuilder.
     */
    public RelayApiBuilder defaultPollInterval(Duration defaultPollInterval) {
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
     * @return the RelayApiBuilder.
     */
    public RelayApiBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of RelayApiImpl with the provided parameters.
     *
     * @return an instance of RelayApiImpl.
     */
    public RelayApiImpl buildClient() {
        if (endpoint == null) {
            this.endpoint = "https://management.azure.com";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build();
        }
        if (defaultPollInterval == null) {
            this.defaultPollInterval = Duration.ofSeconds(30);
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = SerializerFactory.createDefaultManagementSerializerAdapter();
        }
        RelayApiImpl client =
            new RelayApiImpl(pipeline, serializerAdapter, defaultPollInterval, environment, subscriptionId, endpoint);
        return client;
    }
}
