// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information of domain update parameter properties. */
@Fluent
public final class DomainUpdateParameterProperties {
    /*
     * This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties.InboundIpRules"
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
     * authenticate if user is allowed to publish to the domain.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * This Boolean is used to specify the creation mechanism for 'all' the
     * Event Grid Domain Topics associated with this Event Grid Domain
     * resource.
     * In this context, creation of domain topic can be auto-managed (when
     * true) or self-managed (when false). The default value for this property
     * is true.
     * When this property is null or set to true, Event Grid is responsible of
     * automatically creating the domain topic when the first event
     * subscription is
     * created at the scope of the domain topic. If this property is set to
     * false, then creating the first event subscription will require creating
     * a domain topic
     * by the user. The self-management mode can be used if the user wants full
     * control of when the domain topic is created, while auto-managed mode
     * provides the
     * flexibility to perform less operations and manage fewer resources by the
     * user. Also, note that in auto-managed creation mode, user is allowed to
     * create the
     * domain topic on demand if needed.
     */
    @JsonProperty(value = "autoCreateTopicWithFirstSubscription")
    private Boolean autoCreateTopicWithFirstSubscription;

    /*
     * This Boolean is used to specify the deletion mechanism for 'all' the
     * Event Grid Domain Topics associated with this Event Grid Domain
     * resource.
     * In this context, deletion of domain topic can be auto-managed (when
     * true) or self-managed (when false). The default value for this property
     * is true.
     * When this property is set to true, Event Grid is responsible of
     * automatically deleting the domain topic when the last event subscription
     * at the scope
     * of the domain topic is deleted. If this property is set to false, then
     * the user needs to manually delete the domain topic when it is no longer
     * needed
     * (e.g., when last event subscription is deleted and the resource needs to
     * be cleaned up). The self-management mode can be used if the user wants
     * full
     * control of when the domain topic needs to be deleted, while auto-managed
     * mode provides the flexibility to perform less operations and manage
     * fewer
     * resources by the user.
     */
    @JsonProperty(value = "autoDeleteTopicWithLastSubscription")
    private Boolean autoDeleteTopicWithLastSubscription;

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DomainUpdateParameterProperties object itself.
     */
    public DomainUpdateParameterProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
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
     * @return the DomainUpdateParameterProperties object itself.
     */
    public DomainUpdateParameterProperties withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /**
     * Get the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the domain.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the domain.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DomainUpdateParameterProperties object itself.
     */
    public DomainUpdateParameterProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, creation of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is null or set to true, Event Grid is responsible of automatically creating the domain
     * topic when the first event subscription is created at the scope of the domain topic. If this property is set to
     * false, then creating the first event subscription will require creating a domain topic by the user. The
     * self-management mode can be used if the user wants full control of when the domain topic is created, while
     * auto-managed mode provides the flexibility to perform less operations and manage fewer resources by the user.
     * Also, note that in auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
     *
     * @return the autoCreateTopicWithFirstSubscription value.
     */
    public Boolean autoCreateTopicWithFirstSubscription() {
        return this.autoCreateTopicWithFirstSubscription;
    }

    /**
     * Set the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, creation of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is null or set to true, Event Grid is responsible of automatically creating the domain
     * topic when the first event subscription is created at the scope of the domain topic. If this property is set to
     * false, then creating the first event subscription will require creating a domain topic by the user. The
     * self-management mode can be used if the user wants full control of when the domain topic is created, while
     * auto-managed mode provides the flexibility to perform less operations and manage fewer resources by the user.
     * Also, note that in auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
     *
     * @param autoCreateTopicWithFirstSubscription the autoCreateTopicWithFirstSubscription value to set.
     * @return the DomainUpdateParameterProperties object itself.
     */
    public DomainUpdateParameterProperties withAutoCreateTopicWithFirstSubscription(
        Boolean autoCreateTopicWithFirstSubscription) {
        this.autoCreateTopicWithFirstSubscription = autoCreateTopicWithFirstSubscription;
        return this;
    }

    /**
     * Get the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, deletion of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is set to true, Event Grid is responsible of automatically deleting the domain topic
     * when the last event subscription at the scope of the domain topic is deleted. If this property is set to false,
     * then the user needs to manually delete the domain topic when it is no longer needed (e.g., when last event
     * subscription is deleted and the resource needs to be cleaned up). The self-management mode can be used if the
     * user wants full control of when the domain topic needs to be deleted, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user.
     *
     * @return the autoDeleteTopicWithLastSubscription value.
     */
    public Boolean autoDeleteTopicWithLastSubscription() {
        return this.autoDeleteTopicWithLastSubscription;
    }

    /**
     * Set the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, deletion of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is set to true, Event Grid is responsible of automatically deleting the domain topic
     * when the last event subscription at the scope of the domain topic is deleted. If this property is set to false,
     * then the user needs to manually delete the domain topic when it is no longer needed (e.g., when last event
     * subscription is deleted and the resource needs to be cleaned up). The self-management mode can be used if the
     * user wants full control of when the domain topic needs to be deleted, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user.
     *
     * @param autoDeleteTopicWithLastSubscription the autoDeleteTopicWithLastSubscription value to set.
     * @return the DomainUpdateParameterProperties object itself.
     */
    public DomainUpdateParameterProperties withAutoDeleteTopicWithLastSubscription(
        Boolean autoDeleteTopicWithLastSubscription) {
        this.autoDeleteTopicWithLastSubscription = autoDeleteTopicWithLastSubscription;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
