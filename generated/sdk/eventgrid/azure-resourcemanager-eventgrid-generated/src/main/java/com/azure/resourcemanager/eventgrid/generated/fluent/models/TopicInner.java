// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.generated.models.ExtendedLocation;
import com.azure.resourcemanager.eventgrid.generated.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.InputSchema;
import com.azure.resourcemanager.eventgrid.generated.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceKind;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceSku;
import com.azure.resourcemanager.eventgrid.generated.models.TopicProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** EventGrid Topic. */
@Fluent
public final class TopicInner extends Resource {
    /*
     * Properties of the topic.
     */
    @JsonProperty(value = "properties")
    private TopicProperties innerProperties;

    /*
     * The Sku pricing tier for the topic.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * Identity information for the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /*
     * Kind of the resource.
     */
    @JsonProperty(value = "kind")
    private ResourceKind kind;

    /*
     * Extended location of the resource.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * The system metadata relating to Topic resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Properties of the topic.
     *
     * @return the innerProperties value.
     */
    private TopicProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: The Sku pricing tier for the topic.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Sku pricing tier for the topic.
     *
     * @param sku the sku value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Identity information for the resource.
     *
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity information for the resource.
     *
     * @param identity the identity value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the kind property: Kind of the resource.
     *
     * @return the kind value.
     */
    public ResourceKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withKind(ResourceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the extendedLocation property: Extended location of the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Extended location of the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to Topic resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public TopicInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TopicInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The privateEndpointConnections property.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the provisioningState property: Provisioning state of the topic.
     *
     * @return the provisioningState value.
     */
    public TopicProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the endpoint property: Endpoint for the topic.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Get the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the topic.
     *
     * @return the inputSchema value.
     */
    public InputSchema inputSchema() {
        return this.innerProperties() == null ? null : this.innerProperties().inputSchema();
    }

    /**
     * Set the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the topic.
     *
     * @param inputSchema the inputSchema value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withInputSchema(InputSchema inputSchema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicProperties();
        }
        this.innerProperties().withInputSchema(inputSchema);
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
        return this.innerProperties() == null ? null : this.innerProperties().inputSchemaMapping();
    }

    /**
     * Set the inputSchemaMapping property: This enables publishing using custom event schemas. An InputSchemaMapping
     * can be specified to map various properties of a source schema to various required properties of the
     * EventGridEvent schema.
     *
     * @param inputSchemaMapping the inputSchemaMapping value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicProperties();
        }
        this.innerProperties().withInputSchemaMapping(inputSchemaMapping);
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the topic.
     *
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().metricResourceId();
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.TopicProperties.InboundIpRules" /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundIpRules();
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicProperties();
        }
        this.innerProperties().withInboundIpRules(inboundIpRules);
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
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the topic.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @return the dataResidencyBoundary value.
     */
    public DataResidencyBoundary dataResidencyBoundary() {
        return this.innerProperties() == null ? null : this.innerProperties().dataResidencyBoundary();
    }

    /**
     * Set the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @param dataResidencyBoundary the dataResidencyBoundary value to set.
     * @return the TopicInner object itself.
     */
    public TopicInner withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicProperties();
        }
        this.innerProperties().withDataResidencyBoundary(dataResidencyBoundary);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
