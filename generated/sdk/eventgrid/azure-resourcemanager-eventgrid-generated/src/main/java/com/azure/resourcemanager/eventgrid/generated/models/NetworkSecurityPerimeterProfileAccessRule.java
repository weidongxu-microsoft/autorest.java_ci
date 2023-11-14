// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NetworkSecurityPerimeterProfileAccessRuleProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network security perimeter profile access rule.
 */
@Fluent
public final class NetworkSecurityPerimeterProfileAccessRule {
    /*
     * Fully Qualified Arm id for network security perimeter profile access rule.
     */
    @JsonProperty(value = "fullyQualifiedArmId")
    private String fullyQualifiedArmId;

    /*
     * Name for nsp access rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * nsp access rule type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * NSP access rule properties.
     */
    @JsonProperty(value = "properties")
    private NetworkSecurityPerimeterProfileAccessRuleProperties innerProperties;

    /**
     * Creates an instance of NetworkSecurityPerimeterProfileAccessRule class.
     */
    public NetworkSecurityPerimeterProfileAccessRule() {
    }

    /**
     * Get the fullyQualifiedArmId property: Fully Qualified Arm id for network security perimeter profile access rule.
     * 
     * @return the fullyQualifiedArmId value.
     */
    public String fullyQualifiedArmId() {
        return this.fullyQualifiedArmId;
    }

    /**
     * Set the fullyQualifiedArmId property: Fully Qualified Arm id for network security perimeter profile access rule.
     * 
     * @param fullyQualifiedArmId the fullyQualifiedArmId value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule withFullyQualifiedArmId(String fullyQualifiedArmId) {
        this.fullyQualifiedArmId = fullyQualifiedArmId;
        return this;
    }

    /**
     * Get the name property: Name for nsp access rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name for nsp access rule.
     * 
     * @param name the name value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: nsp access rule type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: nsp access rule type.
     * 
     * @param type the type value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerProperties property: NSP access rule properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkSecurityPerimeterProfileAccessRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the direction property: NSP access rule direction.
     * 
     * @return the direction value.
     */
    public NetworkSecurityPerimeterProfileAccessRuleDirection direction() {
        return this.innerProperties() == null ? null : this.innerProperties().direction();
    }

    /**
     * Set the direction property: NSP access rule direction.
     * 
     * @param direction the direction value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule
        withDirection(NetworkSecurityPerimeterProfileAccessRuleDirection direction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterProfileAccessRuleProperties();
        }
        this.innerProperties().withDirection(direction);
        return this;
    }

    /**
     * Get the addressPrefixes property: Address prefixes.
     * 
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefixes();
    }

    /**
     * Set the addressPrefixes property: Address prefixes.
     * 
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule withAddressPrefixes(List<String> addressPrefixes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterProfileAccessRuleProperties();
        }
        this.innerProperties().withAddressPrefixes(addressPrefixes);
        return this;
    }

    /**
     * Get the subscriptions property: List of subscriptions.
     * 
     * @return the subscriptions value.
     */
    public List<String> subscriptions() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptions();
    }

    /**
     * Set the subscriptions property: List of subscriptions.
     * 
     * @param subscriptions the subscriptions value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule withSubscriptions(List<String> subscriptions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterProfileAccessRuleProperties();
        }
        this.innerProperties().withSubscriptions(subscriptions);
        return this;
    }

    /**
     * Get the networkSecurityPerimeters property: Network security perimeters.
     * 
     * @return the networkSecurityPerimeters value.
     */
    public List<NetworkSecurityPerimeterInfo> networkSecurityPerimeters() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityPerimeters();
    }

    /**
     * Set the networkSecurityPerimeters property: Network security perimeters.
     * 
     * @param networkSecurityPerimeters the networkSecurityPerimeters value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule
        withNetworkSecurityPerimeters(List<NetworkSecurityPerimeterInfo> networkSecurityPerimeters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterProfileAccessRuleProperties();
        }
        this.innerProperties().withNetworkSecurityPerimeters(networkSecurityPerimeters);
        return this;
    }

    /**
     * Get the fullyQualifiedDomainNames property: Fully qualified domain names.
     * 
     * @return the fullyQualifiedDomainNames value.
     */
    public List<String> fullyQualifiedDomainNames() {
        return this.innerProperties() == null ? null : this.innerProperties().fullyQualifiedDomainNames();
    }

    /**
     * Set the fullyQualifiedDomainNames property: Fully qualified domain names.
     * 
     * @param fullyQualifiedDomainNames the fullyQualifiedDomainNames value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule
        withFullyQualifiedDomainNames(List<String> fullyQualifiedDomainNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterProfileAccessRuleProperties();
        }
        this.innerProperties().withFullyQualifiedDomainNames(fullyQualifiedDomainNames);
        return this;
    }

    /**
     * Get the emailAddresses property: List of email addresses.
     * 
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().emailAddresses();
    }

    /**
     * Set the emailAddresses property: List of email addresses.
     * 
     * @param emailAddresses the emailAddresses value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule withEmailAddresses(List<String> emailAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterProfileAccessRuleProperties();
        }
        this.innerProperties().withEmailAddresses(emailAddresses);
        return this;
    }

    /**
     * Get the phoneNumbers property: List of phone numbers.
     * 
     * @return the phoneNumbers value.
     */
    public List<String> phoneNumbers() {
        return this.innerProperties() == null ? null : this.innerProperties().phoneNumbers();
    }

    /**
     * Set the phoneNumbers property: List of phone numbers.
     * 
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the NetworkSecurityPerimeterProfileAccessRule object itself.
     */
    public NetworkSecurityPerimeterProfileAccessRule withPhoneNumbers(List<String> phoneNumbers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterProfileAccessRuleProperties();
        }
        this.innerProperties().withPhoneNumbers(phoneNumbers);
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
