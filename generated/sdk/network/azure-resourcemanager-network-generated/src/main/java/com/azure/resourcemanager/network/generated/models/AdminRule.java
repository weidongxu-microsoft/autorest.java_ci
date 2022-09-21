// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.AdminPropertiesFormat;
import com.azure.resourcemanager.network.generated.fluent.models.BaseAdminRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Network admin rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Custom")
@Fluent
public final class AdminRule extends BaseAdminRuleInner {
    /*
     * Indicates the properties of the security admin rule
     */
    @JsonProperty(value = "properties")
    private AdminPropertiesFormat innerProperties;

    /** Creates an instance of AdminRule class. */
    public AdminRule() {
    }

    /**
     * Get the innerProperties property: Indicates the properties of the security admin rule.
     *
     * @return the innerProperties value.
     */
    private AdminPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the protocol property: Network protocol this rule applies to.
     *
     * @return the protocol value.
     */
    public SecurityConfigurationRuleProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: Network protocol this rule applies to.
     *
     * @param protocol the protocol value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withProtocol(SecurityConfigurationRuleProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the sources property: The CIDR or source IP ranges.
     *
     * @return the sources value.
     */
    public List<AddressPrefixItem> sources() {
        return this.innerProperties() == null ? null : this.innerProperties().sources();
    }

    /**
     * Set the sources property: The CIDR or source IP ranges.
     *
     * @param sources the sources value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withSources(List<AddressPrefixItem> sources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withSources(sources);
        return this;
    }

    /**
     * Get the destinations property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @return the destinations value.
     */
    public List<AddressPrefixItem> destinations() {
        return this.innerProperties() == null ? null : this.innerProperties().destinations();
    }

    /**
     * Set the destinations property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @param destinations the destinations value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withDestinations(List<AddressPrefixItem> destinations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withDestinations(destinations);
        return this;
    }

    /**
     * Get the sourcePortRanges property: The source port ranges.
     *
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.innerProperties() == null ? null : this.innerProperties().sourcePortRanges();
    }

    /**
     * Set the sourcePortRanges property: The source port ranges.
     *
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withSourcePortRanges(List<String> sourcePortRanges) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withSourcePortRanges(sourcePortRanges);
        return this;
    }

    /**
     * Get the destinationPortRanges property: The destination port ranges.
     *
     * @return the destinationPortRanges value.
     */
    public List<String> destinationPortRanges() {
        return this.innerProperties() == null ? null : this.innerProperties().destinationPortRanges();
    }

    /**
     * Set the destinationPortRanges property: The destination port ranges.
     *
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withDestinationPortRanges(List<String> destinationPortRanges) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withDestinationPortRanges(destinationPortRanges);
        return this;
    }

    /**
     * Get the access property: Indicates the access allowed for this particular rule.
     *
     * @return the access value.
     */
    public SecurityConfigurationRuleAccess access() {
        return this.innerProperties() == null ? null : this.innerProperties().access();
    }

    /**
     * Set the access property: Indicates the access allowed for this particular rule.
     *
     * @param access the access value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withAccess(SecurityConfigurationRuleAccess access) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withAccess(access);
        return this;
    }

    /**
     * Get the priority property: The priority of the rule. The value can be between 1 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: The priority of the rule. The value can be between 1 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @param priority the priority value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the direction property: Indicates if the traffic matched against the rule in inbound or outbound.
     *
     * @return the direction value.
     */
    public SecurityConfigurationRuleDirection direction() {
        return this.innerProperties() == null ? null : this.innerProperties().direction();
    }

    /**
     * Set the direction property: Indicates if the traffic matched against the rule in inbound or outbound.
     *
     * @param direction the direction value to set.
     * @return the AdminRule object itself.
     */
    public AdminRule withDirection(SecurityConfigurationRuleDirection direction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminPropertiesFormat();
        }
        this.innerProperties().withDirection(direction);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
