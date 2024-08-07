// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of a NAT rule.
 */
@Fluent
public final class AzureFirewallNatRule implements JsonSerializable<AzureFirewallNatRule> {
    /*
     * Name of the NAT rule.
     */
    private String name;

    /*
     * Description of the rule.
     */
    private String description;

    /*
     * List of source IP addresses for this rule.
     */
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
     */
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    private List<String> destinationPorts;

    /*
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     */
    private List<AzureFirewallNetworkRuleProtocol> protocols;

    /*
     * The translated address for this NAT rule.
     */
    private String translatedAddress;

    /*
     * The translated port for this NAT rule.
     */
    private String translatedPort;

    /*
     * The translated FQDN for this NAT rule.
     */
    private String translatedFqdn;

    /*
     * List of source IpGroups for this rule.
     */
    private List<String> sourceIpGroups;

    /**
     * Creates an instance of AzureFirewallNatRule class.
     */
    public AzureFirewallNatRule() {
    }

    /**
     * Get the name property: Name of the NAT rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the NAT rule.
     * 
     * @param name the name value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the rule.
     * 
     * @param description the description value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses for this rule.
     * 
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this rule.
     * 
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses for this rule. Supports IP ranges,
     * prefixes, and service tags.
     * 
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses for this rule. Supports IP ranges,
     * prefixes, and service tags.
     * 
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports.
     * 
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports.
     * 
     * @param destinationPorts the destinationPorts value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the protocols property: Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     * @return the protocols value.
     */
    public List<AzureFirewallNetworkRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     * @param protocols the protocols value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withProtocols(List<AzureFirewallNetworkRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the translatedAddress property: The translated address for this NAT rule.
     * 
     * @return the translatedAddress value.
     */
    public String translatedAddress() {
        return this.translatedAddress;
    }

    /**
     * Set the translatedAddress property: The translated address for this NAT rule.
     * 
     * @param translatedAddress the translatedAddress value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedAddress(String translatedAddress) {
        this.translatedAddress = translatedAddress;
        return this;
    }

    /**
     * Get the translatedPort property: The translated port for this NAT rule.
     * 
     * @return the translatedPort value.
     */
    public String translatedPort() {
        return this.translatedPort;
    }

    /**
     * Set the translatedPort property: The translated port for this NAT rule.
     * 
     * @param translatedPort the translatedPort value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
        return this;
    }

    /**
     * Get the translatedFqdn property: The translated FQDN for this NAT rule.
     * 
     * @return the translatedFqdn value.
     */
    public String translatedFqdn() {
        return this.translatedFqdn;
    }

    /**
     * Set the translatedFqdn property: The translated FQDN for this NAT rule.
     * 
     * @param translatedFqdn the translatedFqdn value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedFqdn(String translatedFqdn) {
        this.translatedFqdn = translatedFqdn;
        return this;
    }

    /**
     * Get the sourceIpGroups property: List of source IpGroups for this rule.
     * 
     * @return the sourceIpGroups value.
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set the sourceIpGroups property: List of source IpGroups for this rule.
     * 
     * @param sourceIpGroups the sourceIpGroups value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("sourceAddresses", this.sourceAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinationAddresses", this.destinationAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinationPorts", this.destinationPorts,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("protocols", this.protocols,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeStringField("translatedAddress", this.translatedAddress);
        jsonWriter.writeStringField("translatedPort", this.translatedPort);
        jsonWriter.writeStringField("translatedFqdn", this.translatedFqdn);
        jsonWriter.writeArrayField("sourceIpGroups", this.sourceIpGroups,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFirewallNatRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallNatRule if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallNatRule.
     */
    public static AzureFirewallNatRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallNatRule deserializedAzureFirewallNatRule = new AzureFirewallNatRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAzureFirewallNatRule.name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedAzureFirewallNatRule.description = reader.getString();
                } else if ("sourceAddresses".equals(fieldName)) {
                    List<String> sourceAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureFirewallNatRule.sourceAddresses = sourceAddresses;
                } else if ("destinationAddresses".equals(fieldName)) {
                    List<String> destinationAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureFirewallNatRule.destinationAddresses = destinationAddresses;
                } else if ("destinationPorts".equals(fieldName)) {
                    List<String> destinationPorts = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureFirewallNatRule.destinationPorts = destinationPorts;
                } else if ("protocols".equals(fieldName)) {
                    List<AzureFirewallNetworkRuleProtocol> protocols
                        = reader.readArray(reader1 -> AzureFirewallNetworkRuleProtocol.fromString(reader1.getString()));
                    deserializedAzureFirewallNatRule.protocols = protocols;
                } else if ("translatedAddress".equals(fieldName)) {
                    deserializedAzureFirewallNatRule.translatedAddress = reader.getString();
                } else if ("translatedPort".equals(fieldName)) {
                    deserializedAzureFirewallNatRule.translatedPort = reader.getString();
                } else if ("translatedFqdn".equals(fieldName)) {
                    deserializedAzureFirewallNatRule.translatedFqdn = reader.getString();
                } else if ("sourceIpGroups".equals(fieldName)) {
                    List<String> sourceIpGroups = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureFirewallNatRule.sourceIpGroups = sourceIpGroups;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallNatRule;
        });
    }
}
