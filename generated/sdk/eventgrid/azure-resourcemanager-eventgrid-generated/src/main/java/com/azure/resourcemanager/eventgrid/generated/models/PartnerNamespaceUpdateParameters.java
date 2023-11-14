// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerNamespaceUpdateParameterProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Properties of the Partner Namespace update.
 */
@Fluent
public final class PartnerNamespaceUpdateParameters {
    /*
     * Tags of the Partner Namespace.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Properties of the Partner Namespace.
     */
    @JsonProperty(value = "properties")
    private PartnerNamespaceUpdateParameterProperties innerProperties;

    /**
     * Creates an instance of PartnerNamespaceUpdateParameters class.
     */
    public PartnerNamespaceUpdateParameters() {
    }

    /**
     * Get the tags property: Tags of the Partner Namespace.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the Partner Namespace.
     * 
     * @param tags the tags value to set.
     * @return the PartnerNamespaceUpdateParameters object itself.
     */
    public PartnerNamespaceUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the Partner Namespace.
     * 
     * @return the innerProperties value.
     */
    private PartnerNamespaceUpdateParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the PartnerNamespaceUpdateParameters object itself.
     */
    public PartnerNamespaceUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceUpdateParameterProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundIpRules();
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the PartnerNamespaceUpdateParameters object itself.
     */
    public PartnerNamespaceUpdateParameters withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceUpdateParameterProperties();
        }
        this.innerProperties().withInboundIpRules(inboundIpRules);
        return this;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * domain.
     * 
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersionAllowed();
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * domain.
     * 
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the PartnerNamespaceUpdateParameters object itself.
     */
    public PartnerNamespaceUpdateParameters withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceUpdateParameterProperties();
        }
        this.innerProperties().withMinimumTlsVersionAllowed(minimumTlsVersionAllowed);
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
     * @return the PartnerNamespaceUpdateParameters object itself.
     */
    public PartnerNamespaceUpdateParameters withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerNamespaceUpdateParameterProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
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
