// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.DefaultAdminPropertiesFormat;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Network default admin rule.
 */
@Fluent
public final class ActiveDefaultSecurityAdminRule extends ActiveBaseSecurityAdminRule {
    /*
     * Indicates the properties of the default security admin rule
     */
    private DefaultAdminPropertiesFormat innerProperties;

    /**
     * Creates an instance of ActiveDefaultSecurityAdminRule class.
     */
    public ActiveDefaultSecurityAdminRule() {
        this.kind = EffectiveAdminRuleKind.DEFAULT;
    }

    /**
     * Get the innerProperties property: Indicates the properties of the default security admin rule.
     * 
     * @return the innerProperties value.
     */
    private DefaultAdminPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withCommitTime(OffsetDateTime commitTime) {
        super.withCommitTime(commitTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withRegion(String region) {
        super.withRegion(region);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withConfigurationDescription(String configurationDescription) {
        super.withConfigurationDescription(configurationDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withRuleCollectionDescription(String ruleCollectionDescription) {
        super.withRuleCollectionDescription(ruleCollectionDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule
        withRuleCollectionAppliesToGroups(List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups) {
        super.withRuleCollectionAppliesToGroups(ruleCollectionAppliesToGroups);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withRuleGroups(List<ConfigurationGroup> ruleGroups) {
        super.withRuleGroups(ruleGroups);
        return this;
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
     * Get the flag property: Default rule flag.
     * 
     * @return the flag value.
     */
    public String flag() {
        return this.innerProperties() == null ? null : this.innerProperties().flag();
    }

    /**
     * Set the flag property: Default rule flag.
     * 
     * @param flag the flag value to set.
     * @return the ActiveDefaultSecurityAdminRule object itself.
     */
    public ActiveDefaultSecurityAdminRule withFlag(String flag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefaultAdminPropertiesFormat();
        }
        this.innerProperties().withFlag(flag);
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
     * Get the sources property: The CIDR or source IP ranges.
     * 
     * @return the sources value.
     */
    public List<AddressPrefixItem> sources() {
        return this.innerProperties() == null ? null : this.innerProperties().sources();
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
     * Get the sourcePortRanges property: The source port ranges.
     * 
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.innerProperties() == null ? null : this.innerProperties().sourcePortRanges();
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
     * Get the access property: Indicates the access allowed for this particular rule.
     * 
     * @return the access value.
     */
    public SecurityConfigurationRuleAccess access() {
        return this.innerProperties() == null ? null : this.innerProperties().access();
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
     * Get the direction property: Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     * @return the direction value.
     */
    public SecurityConfigurationRuleDirection direction() {
        return this.innerProperties() == null ? null : this.innerProperties().direction();
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
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (ruleCollectionAppliesToGroups() != null) {
            ruleCollectionAppliesToGroups().forEach(e -> e.validate());
        }
        if (ruleGroups() != null) {
            ruleGroups().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActiveDefaultSecurityAdminRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActiveDefaultSecurityAdminRule if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ActiveDefaultSecurityAdminRule.
     */
    public static ActiveDefaultSecurityAdminRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActiveDefaultSecurityAdminRule deserializedActiveDefaultSecurityAdminRule
                = new ActiveDefaultSecurityAdminRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedActiveDefaultSecurityAdminRule.withId(reader.getString());
                } else if ("commitTime".equals(fieldName)) {
                    deserializedActiveDefaultSecurityAdminRule.withCommitTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("region".equals(fieldName)) {
                    deserializedActiveDefaultSecurityAdminRule.withRegion(reader.getString());
                } else if ("configurationDescription".equals(fieldName)) {
                    deserializedActiveDefaultSecurityAdminRule.withConfigurationDescription(reader.getString());
                } else if ("ruleCollectionDescription".equals(fieldName)) {
                    deserializedActiveDefaultSecurityAdminRule.withRuleCollectionDescription(reader.getString());
                } else if ("ruleCollectionAppliesToGroups".equals(fieldName)) {
                    List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups
                        = reader.readArray(reader1 -> NetworkManagerSecurityGroupItem.fromJson(reader1));
                    deserializedActiveDefaultSecurityAdminRule
                        .withRuleCollectionAppliesToGroups(ruleCollectionAppliesToGroups);
                } else if ("ruleGroups".equals(fieldName)) {
                    List<ConfigurationGroup> ruleGroups
                        = reader.readArray(reader1 -> ConfigurationGroup.fromJson(reader1));
                    deserializedActiveDefaultSecurityAdminRule.withRuleGroups(ruleGroups);
                } else if ("kind".equals(fieldName)) {
                    deserializedActiveDefaultSecurityAdminRule.kind
                        = EffectiveAdminRuleKind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedActiveDefaultSecurityAdminRule.innerProperties
                        = DefaultAdminPropertiesFormat.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActiveDefaultSecurityAdminRule;
        });
    }
}
