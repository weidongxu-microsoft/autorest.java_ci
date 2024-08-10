// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Rule of type nat.
 */
@Fluent
public final class NatRule extends FirewallPolicyRule {
    /*
     * Rule Type.
     */
    private FirewallPolicyRuleType ruleType = FirewallPolicyRuleType.NAT_RULE;

    /*
     * Array of FirewallPolicyRuleNetworkProtocols.
     */
    private List<FirewallPolicyRuleNetworkProtocol> ipProtocols;

    /*
     * List of source IP addresses for this rule.
     */
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses or Service Tags.
     */
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    private List<String> destinationPorts;

    /*
     * The translated address for this NAT rule.
     */
    private String translatedAddress;

    /*
     * The translated port for this NAT rule.
     */
    private String translatedPort;

    /*
     * List of source IpGroups for this rule.
     */
    private List<String> sourceIpGroups;

    /*
     * The translated FQDN for this NAT rule.
     */
    private String translatedFqdn;

    /**
     * Creates an instance of NatRule class.
     */
    public NatRule() {
    }

    /**
     * Get the ruleType property: Rule Type.
     * 
     * @return the ruleType value.
     */
    @Override
    public FirewallPolicyRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Get the ipProtocols property: Array of FirewallPolicyRuleNetworkProtocols.
     * 
     * @return the ipProtocols value.
     */
    public List<FirewallPolicyRuleNetworkProtocol> ipProtocols() {
        return this.ipProtocols;
    }

    /**
     * Set the ipProtocols property: Array of FirewallPolicyRuleNetworkProtocols.
     * 
     * @param ipProtocols the ipProtocols value to set.
     * @return the NatRule object itself.
     */
    public NatRule withIpProtocols(List<FirewallPolicyRuleNetworkProtocol> ipProtocols) {
        this.ipProtocols = ipProtocols;
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
     * @return the NatRule object itself.
     */
    public NatRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses or Service Tags.
     * 
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses or Service Tags.
     * 
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the NatRule object itself.
     */
    public NatRule withDestinationAddresses(List<String> destinationAddresses) {
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
     * @return the NatRule object itself.
     */
    public NatRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
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
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedAddress(String translatedAddress) {
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
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
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
     * @return the NatRule object itself.
     */
    public NatRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
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
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedFqdn(String translatedFqdn) {
        this.translatedFqdn = translatedFqdn;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NatRule withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NatRule withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("ruleType", this.ruleType == null ? null : this.ruleType.toString());
        jsonWriter.writeArrayField("ipProtocols", this.ipProtocols,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("sourceAddresses", this.sourceAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinationAddresses", this.destinationAddresses,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinationPorts", this.destinationPorts,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("translatedAddress", this.translatedAddress);
        jsonWriter.writeStringField("translatedPort", this.translatedPort);
        jsonWriter.writeArrayField("sourceIpGroups", this.sourceIpGroups,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("translatedFqdn", this.translatedFqdn);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NatRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NatRule if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the NatRule.
     */
    public static NatRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NatRule deserializedNatRule = new NatRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNatRule.withName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedNatRule.withDescription(reader.getString());
                } else if ("ruleType".equals(fieldName)) {
                    deserializedNatRule.ruleType = FirewallPolicyRuleType.fromString(reader.getString());
                } else if ("ipProtocols".equals(fieldName)) {
                    List<FirewallPolicyRuleNetworkProtocol> ipProtocols = reader
                        .readArray(reader1 -> FirewallPolicyRuleNetworkProtocol.fromString(reader1.getString()));
                    deserializedNatRule.ipProtocols = ipProtocols;
                } else if ("sourceAddresses".equals(fieldName)) {
                    List<String> sourceAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedNatRule.sourceAddresses = sourceAddresses;
                } else if ("destinationAddresses".equals(fieldName)) {
                    List<String> destinationAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedNatRule.destinationAddresses = destinationAddresses;
                } else if ("destinationPorts".equals(fieldName)) {
                    List<String> destinationPorts = reader.readArray(reader1 -> reader1.getString());
                    deserializedNatRule.destinationPorts = destinationPorts;
                } else if ("translatedAddress".equals(fieldName)) {
                    deserializedNatRule.translatedAddress = reader.getString();
                } else if ("translatedPort".equals(fieldName)) {
                    deserializedNatRule.translatedPort = reader.getString();
                } else if ("sourceIpGroups".equals(fieldName)) {
                    List<String> sourceIpGroups = reader.readArray(reader1 -> reader1.getString());
                    deserializedNatRule.sourceIpGroups = sourceIpGroups;
                } else if ("translatedFqdn".equals(fieldName)) {
                    deserializedNatRule.translatedFqdn = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNatRule;
        });
    }
}
