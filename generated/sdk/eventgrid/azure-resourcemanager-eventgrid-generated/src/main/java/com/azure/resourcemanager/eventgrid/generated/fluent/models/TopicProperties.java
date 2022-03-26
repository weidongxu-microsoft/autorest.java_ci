// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.InputSchema;
import com.azure.resourcemanager.eventgrid.generated.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.TopicProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the Topic. */
@Fluent
public final class TopicProperties {
    /*
     * The privateEndpointConnections property.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Provisioning state of the topic.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private TopicProvisioningState provisioningState;

    /*
     * Endpoint for the topic.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * This determines the format that Event Grid should expect for incoming
     * events published to the topic.
     */
    @JsonProperty(value = "inputSchema")
    private InputSchema inputSchema;

    /*
     * This enables publishing using custom event schemas. An
     * InputSchemaMapping can be specified to map various properties of a
     * source schema to various required properties of the EventGridEvent
     * schema.
     */
    @JsonProperty(value = "inputSchemaMapping")
    private InputSchemaMapping inputSchemaMapping;

    /*
     * Metric resource id for the topic.
     */
    @JsonProperty(value = "metricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricResourceId;

    /*
     * This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules"
     * />
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all
     * IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /*
     * This boolean is used to enable or disable local auth. Default value is
     * false. When the property is set to true, only AAD token will be used to
     * authenticate if user is allowed to publish to the topic.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * Data Residency Boundary of the resource.
     */
    @JsonProperty(value = "dataResidencyBoundary")
    private DataResidencyBoundary dataResidencyBoundary;

    /**
     * Get the privateEndpointConnections property: The privateEndpointConnections property.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the provisioningState property: Provisioning state of the topic.
     *
     * @return the provisioningState value.
     */
    public TopicProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the endpoint property: Endpoint for the topic.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the topic.
     *
     * @return the inputSchema value.
     */
    public InputSchema inputSchema() {
        return this.inputSchema;
    }

    /**
     * Set the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the topic.
     *
     * @param inputSchema the inputSchema value to set.
     * @return the TopicProperties object itself.
     */
    public TopicProperties withInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * Get the inputSchemaMapping property: This enables publishing using custom event schemas. An InputSchemaMapping
     * can be specified to map various properties of a source schema to various required properties of the
     * EventGridEvent schema.
     *
     * @return the inputSchemaMapping value.
     */
    public InputSchemaMapping inputSchemaMapping() {
        return this.inputSchemaMapping;
    }

    /**
     * Set the inputSchemaMapping property: This enables publishing using custom event schemas. An InputSchemaMapping
     * can be specified to map various properties of a source schema to various required properties of the
     * EventGridEvent schema.
     *
     * @param inputSchemaMapping the inputSchemaMapping value to set.
     * @return the TopicProperties object itself.
     */
    public TopicProperties withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inputSchemaMapping = inputSchemaMapping;
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the topic.
     *
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the TopicProperties object itself.
     */
    public TopicProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the TopicProperties object itself.
     */
    public TopicProperties withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /**
     * Get the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the topic.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the topic.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the TopicProperties object itself.
     */
    public TopicProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @return the dataResidencyBoundary value.
     */
    public DataResidencyBoundary dataResidencyBoundary() {
        return this.dataResidencyBoundary;
    }

    /**
     * Set the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @param dataResidencyBoundary the dataResidencyBoundary value to set.
     * @return the TopicProperties object itself.
     */
    public TopicProperties withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary) {
        this.dataResidencyBoundary = dataResidencyBoundary;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (inputSchemaMapping() != null) {
            inputSchemaMapping().validate();
        }
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
