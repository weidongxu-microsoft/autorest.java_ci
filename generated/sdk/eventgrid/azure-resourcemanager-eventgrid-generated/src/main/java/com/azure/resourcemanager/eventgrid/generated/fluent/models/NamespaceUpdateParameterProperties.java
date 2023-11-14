// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.UpdateTopicSpacesConfigurationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Information of namespace update parameter properties.
 */
@Fluent
public final class NamespaceUpdateParameterProperties {
    /*
     * Topic spaces configuration properties that can be updated.
     */
    @JsonProperty(value = "topicSpacesConfiguration")
    private UpdateTopicSpacesConfigurationInfo topicSpacesConfiguration;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref=
     * "P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceUpdateParameterProperties.InboundIpRules"
     * />
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if
     * PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /**
     * Creates an instance of NamespaceUpdateParameterProperties class.
     */
    public NamespaceUpdateParameterProperties() {
    }

    /**
     * Get the topicSpacesConfiguration property: Topic spaces configuration properties that can be updated.
     * 
     * @return the topicSpacesConfiguration value.
     */
    public UpdateTopicSpacesConfigurationInfo topicSpacesConfiguration() {
        return this.topicSpacesConfiguration;
    }

    /**
     * Set the topicSpacesConfiguration property: Topic spaces configuration properties that can be updated.
     * 
     * @param topicSpacesConfiguration the topicSpacesConfiguration value to set.
     * @return the NamespaceUpdateParameterProperties object itself.
     */
    public NamespaceUpdateParameterProperties
        withTopicSpacesConfiguration(UpdateTopicSpacesConfigurationInfo topicSpacesConfiguration) {
        this.topicSpacesConfiguration = topicSpacesConfiguration;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NamespaceUpdateParameterProperties object itself.
     */
    public NamespaceUpdateParameterProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the NamespaceUpdateParameterProperties object itself.
     */
    public NamespaceUpdateParameterProperties withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (topicSpacesConfiguration() != null) {
            topicSpacesConfiguration().validate();
        }
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
