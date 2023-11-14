// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerNamespaceProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicRoutingMode;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the partner namespace.
 */
@Fluent
public final class PartnerNamespaceProperties {
    /*
     * The privateEndpointConnections property.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Provisioning state of the partner namespace.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PartnerNamespaceProvisioningState provisioningState;

    /*
     * The fully qualified ARM Id of the partner registration that should be associated with this partner namespace.
     * This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/
     * partnerRegistrations/{partnerRegistrationName}.
     */
    @JsonProperty(value = "partnerRegistrationFullyQualifiedId")
    private String partnerRegistrationFullyQualifiedId;

    /*
     * Minimum TLS version of the publisher allowed to publish to this partner namespace
     */
    @JsonProperty(value = "minimumTlsVersionAllowed")
    private TlsVersion minimumTlsVersionAllowed;

    /*
     * Endpoint for the partner namespace.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules" />
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
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true,
     * only AAD token will be used to authenticate if user is allowed to publish to the partner namespace.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * This determines if events published to this partner namespace should use the source attribute in the event
     * payload
     * or use the channel name in the header when matching to the partner topic. If none is specified, source attribute
     * routing will be used to match the partner topic.
     */
    @JsonProperty(value = "partnerTopicRoutingMode")
    private PartnerTopicRoutingMode partnerTopicRoutingMode;

    /**
     * Creates an instance of PartnerNamespaceProperties class.
     */
    public PartnerNamespaceProperties() {
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
     * Get the provisioningState property: Provisioning state of the partner namespace.
     * 
     * @return the provisioningState value.
     */
    public PartnerNamespaceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner registration
     * that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     * @return the partnerRegistrationFullyQualifiedId value.
     */
    public String partnerRegistrationFullyQualifiedId() {
        return this.partnerRegistrationFullyQualifiedId;
    }

    /**
     * Set the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner registration
     * that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     * @param partnerRegistrationFullyQualifiedId the partnerRegistrationFullyQualifiedId value to set.
     * @return the PartnerNamespaceProperties object itself.
     */
    public PartnerNamespaceProperties
        withPartnerRegistrationFullyQualifiedId(String partnerRegistrationFullyQualifiedId) {
        this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
        return this;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * partner namespace.
     * 
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.minimumTlsVersionAllowed;
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * partner namespace.
     * 
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the PartnerNamespaceProperties object itself.
     */
    public PartnerNamespaceProperties withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        this.minimumTlsVersionAllowed = minimumTlsVersionAllowed;
        return this;
    }

    /**
     * Get the endpoint property: Endpoint for the partner namespace.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules"
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
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules"
     * /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the PartnerNamespaceProperties object itself.
     */
    public PartnerNamespaceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
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
     * @return the PartnerNamespaceProperties object itself.
     */
    public PartnerNamespaceProperties withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
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
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the partner namespace.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the PartnerNamespaceProperties object itself.
     */
    public PartnerNamespaceProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
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
        return this.partnerTopicRoutingMode;
    }

    /**
     * Set the partnerTopicRoutingMode property: This determines if events published to this partner namespace should
     * use the source attribute in the event payload
     * or use the channel name in the header when matching to the partner topic. If none is specified, source attribute
     * routing will be used to match the partner topic.
     * 
     * @param partnerTopicRoutingMode the partnerTopicRoutingMode value to set.
     * @return the PartnerNamespaceProperties object itself.
     */
    public PartnerNamespaceProperties withPartnerTopicRoutingMode(PartnerTopicRoutingMode partnerTopicRoutingMode) {
        this.partnerTopicRoutingMode = partnerTopicRoutingMode;
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
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
