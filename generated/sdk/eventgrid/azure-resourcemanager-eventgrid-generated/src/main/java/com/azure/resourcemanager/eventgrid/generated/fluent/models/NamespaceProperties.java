// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.TlsVersion;
import com.azure.resourcemanager.eventgrid.generated.models.TopicSpacesConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.TopicsConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the namespace resource.
 */
@Fluent
public final class NamespaceProperties {
    /*
     * The privateEndpointConnections property.
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Provisioning state of the namespace resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private NamespaceProvisioningState provisioningState;

    /*
     * Topics configuration information for the namespace resource
     */
    @JsonProperty(value = "topicsConfiguration")
    private TopicsConfiguration topicsConfiguration;

    /*
     * Topic spaces configuration information for the namespace resource
     */
    @JsonProperty(value = "topicSpacesConfiguration")
    private TopicSpacesConfiguration topicSpacesConfiguration;

    /*
     * This is an optional property and it allows the user to specify if the namespace resource supports
     * zone-redundancy capability or not. If this
     * property is not specified explicitly by the user, its default value depends on the following conditions:
     * a. For Availability Zones enabled regions - The default property value would be true.
     * b. For non-Availability Zones enabled regions - The default property value would be false.
     * Once specified, this property cannot be updated.
     */
    @JsonProperty(value = "isZoneRedundant")
    private Boolean isZoneRedundant;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceProperties.InboundIpRules" />
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if
     * PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /*
     * Minimum TLS version of the publisher allowed to publish to this namespace. Only TLS version 1.2 is supported.
     */
    @JsonProperty(value = "minimumTlsVersionAllowed")
    private TlsVersion minimumTlsVersionAllowed;

    /**
     * Creates an instance of NamespaceProperties class.
     */
    public NamespaceProperties() {
    }

    /**
     * Get the privateEndpointConnections property: The privateEndpointConnections property.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: The privateEndpointConnections property.
     * 
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties
        withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace resource.
     * 
     * @return the provisioningState value.
     */
    public NamespaceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the topicsConfiguration property: Topics configuration information for the namespace resource.
     * 
     * @return the topicsConfiguration value.
     */
    public TopicsConfiguration topicsConfiguration() {
        return this.topicsConfiguration;
    }

    /**
     * Set the topicsConfiguration property: Topics configuration information for the namespace resource.
     * 
     * @param topicsConfiguration the topicsConfiguration value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withTopicsConfiguration(TopicsConfiguration topicsConfiguration) {
        this.topicsConfiguration = topicsConfiguration;
        return this;
    }

    /**
     * Get the topicSpacesConfiguration property: Topic spaces configuration information for the namespace resource.
     * 
     * @return the topicSpacesConfiguration value.
     */
    public TopicSpacesConfiguration topicSpacesConfiguration() {
        return this.topicSpacesConfiguration;
    }

    /**
     * Set the topicSpacesConfiguration property: Topic spaces configuration information for the namespace resource.
     * 
     * @param topicSpacesConfiguration the topicSpacesConfiguration value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withTopicSpacesConfiguration(TopicSpacesConfiguration topicSpacesConfiguration) {
        this.topicSpacesConfiguration = topicSpacesConfiguration;
        return this;
    }

    /**
     * Get the isZoneRedundant property: This is an optional property and it allows the user to specify if the
     * namespace resource supports zone-redundancy capability or not. If this
     * property is not specified explicitly by the user, its default value depends on the following conditions:
     * a. For Availability Zones enabled regions - The default property value would be true.
     * b. For non-Availability Zones enabled regions - The default property value would be false.
     * Once specified, this property cannot be updated.
     * 
     * @return the isZoneRedundant value.
     */
    public Boolean isZoneRedundant() {
        return this.isZoneRedundant;
    }

    /**
     * Set the isZoneRedundant property: This is an optional property and it allows the user to specify if the
     * namespace resource supports zone-redundancy capability or not. If this
     * property is not specified explicitly by the user, its default value depends on the following conditions:
     * a. For Availability Zones enabled regions - The default property value would be true.
     * b. For non-Availability Zones enabled regions - The default property value would be false.
     * Once specified, this property cannot be updated.
     * 
     * @param isZoneRedundant the isZoneRedundant value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withIsZoneRedundant(Boolean isZoneRedundant) {
        this.isZoneRedundant = isZoneRedundant;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceProperties.InboundIpRules"
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
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PubSub.NamespaceProperties.InboundIpRules"
     * /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
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
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * namespace. Only TLS version 1.2 is supported.
     * 
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.minimumTlsVersionAllowed;
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * namespace. Only TLS version 1.2 is supported.
     * 
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        this.minimumTlsVersionAllowed = minimumTlsVersionAllowed;
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
        if (topicsConfiguration() != null) {
            topicsConfiguration().validate();
        }
        if (topicSpacesConfiguration() != null) {
            topicSpacesConfiguration().validate();
        }
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
