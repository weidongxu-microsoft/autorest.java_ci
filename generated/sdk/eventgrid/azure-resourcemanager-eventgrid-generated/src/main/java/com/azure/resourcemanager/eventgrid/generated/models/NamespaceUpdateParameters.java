// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceUpdateParameterProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Properties to update namespace.
 */
@Fluent
public final class NamespaceUpdateParameters {
    /*
     * Tags of the namespace resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Namespace resource identity information.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /*
     * Represents available Sku pricing tiers.
     */
    @JsonProperty(value = "sku")
    private NamespaceSku sku;

    /*
     * Properties of the namespace resource.
     */
    @JsonProperty(value = "properties")
    private NamespaceUpdateParameterProperties innerProperties;

    /**
     * Creates an instance of NamespaceUpdateParameters class.
     */
    public NamespaceUpdateParameters() {
    }

    /**
     * Get the tags property: Tags of the namespace resource.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the namespace resource.
     * 
     * @param tags the tags value to set.
     * @return the NamespaceUpdateParameters object itself.
     */
    public NamespaceUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Namespace resource identity information.
     * 
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Namespace resource identity information.
     * 
     * @param identity the identity value to set.
     * @return the NamespaceUpdateParameters object itself.
     */
    public NamespaceUpdateParameters withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: Represents available Sku pricing tiers.
     * 
     * @return the sku value.
     */
    public NamespaceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Represents available Sku pricing tiers.
     * 
     * @param sku the sku value to set.
     * @return the NamespaceUpdateParameters object itself.
     */
    public NamespaceUpdateParameters withSku(NamespaceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the namespace resource.
     * 
     * @return the innerProperties value.
     */
    private NamespaceUpdateParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the topicSpacesConfiguration property: Topic spaces configuration properties that can be updated.
     * 
     * @return the topicSpacesConfiguration value.
     */
    public UpdateTopicSpacesConfigurationInfo topicSpacesConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().topicSpacesConfiguration();
    }

    /**
     * Set the topicSpacesConfiguration property: Topic spaces configuration properties that can be updated.
     * 
     * @param topicSpacesConfiguration the topicSpacesConfiguration value to set.
     * @return the NamespaceUpdateParameters object itself.
     */
    public NamespaceUpdateParameters
        withTopicSpacesConfiguration(UpdateTopicSpacesConfigurationInfo topicSpacesConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceUpdateParameterProperties();
        }
        this.innerProperties().withTopicSpacesConfiguration(topicSpacesConfiguration);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is enabled. 
     * You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceUpdateParameterProperties.InboundIpRules" /&gt;.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is enabled. 
     * You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceUpdateParameterProperties.InboundIpRules" /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NamespaceUpdateParameters object itself.
     */
    public NamespaceUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceUpdateParameterProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundIpRules();
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the NamespaceUpdateParameters object itself.
     */
    public NamespaceUpdateParameters withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceUpdateParameterProperties();
        }
        this.innerProperties().withInboundIpRules(inboundIpRules);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
