// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerNamespaceProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicRoutingMode;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * EventGrid Partner Namespace.
 */
@Fluent
public final class PartnerNamespaceInner extends Resource {
    /*
     * Properties of the Partner Namespace.
     */
    @JsonProperty(value = "properties")
    private PartnerNamespaceProperties innerProperties;

    /*
     * The system metadata relating to Partner Namespace resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of PartnerNamespaceInner class.
     */
    public PartnerNamespaceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Partner Namespace.
     * 
     * @return the innerProperties value.
     */
    private PartnerNamespaceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Partner Namespace resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnerNamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnerNamespaceInner withTags(Map<String, String> tags) {
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
     * Get the provisioningState property: Provisioning state of the partner namespace.
     * 
     * @return the provisioningState value.
     */
    public PartnerNamespaceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner registration that
     * should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     * @return the partnerRegistrationFullyQualifiedId value.
     */
    public String partnerRegistrationFullyQualifiedId() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRegistrationFullyQualifiedId();
    }

    /**
     * Set the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner registration that
     * should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     * @param partnerRegistrationFullyQualifiedId the partnerRegistrationFullyQualifiedId value to set.
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withPartnerRegistrationFullyQualifiedId(String partnerRegistrationFullyQualifiedId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceProperties();
        }
        this.innerProperties().withPartnerRegistrationFullyQualifiedId(partnerRegistrationFullyQualifiedId);
        return this;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * partner namespace.
     * 
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersionAllowed();
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * partner namespace.
     * 
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceProperties();
        }
        this.innerProperties().withMinimumTlsVersionAllowed(minimumTlsVersionAllowed);
        return this;
    }

    /**
     * Get the endpoint property: Endpoint for the partner namespace.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules"
     * /&gt;.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules"
     * /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceProperties();
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
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceProperties();
        }
        this.innerProperties().withInboundIpRules(inboundIpRules);
        return this;
    }

    /**
     * Get the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the partner namespace.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the partner namespace.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the partnerTopicRoutingMode property: This determines if events published to this partner namespace should
     * use the source attribute in the event payload
     * or use the channel name in the header when matching to the partner topic. If none is specified, source attribute
     * routing will be used to match the partner topic.
     * 
     * @return the partnerTopicRoutingMode value.
     */
    public PartnerTopicRoutingMode partnerTopicRoutingMode() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerTopicRoutingMode();
    }

    /**
     * Set the partnerTopicRoutingMode property: This determines if events published to this partner namespace should
     * use the source attribute in the event payload
     * or use the channel name in the header when matching to the partner topic. If none is specified, source attribute
     * routing will be used to match the partner topic.
     * 
     * @param partnerTopicRoutingMode the partnerTopicRoutingMode value to set.
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withPartnerTopicRoutingMode(PartnerTopicRoutingMode partnerTopicRoutingMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceProperties();
        }
        this.innerProperties().withPartnerTopicRoutingMode(partnerTopicRoutingMode);
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
    }
}
