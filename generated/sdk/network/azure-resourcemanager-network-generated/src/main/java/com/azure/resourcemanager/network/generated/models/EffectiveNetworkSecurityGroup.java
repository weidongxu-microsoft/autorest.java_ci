// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Effective network security group.
 */
@Fluent
public final class EffectiveNetworkSecurityGroup implements JsonSerializable<EffectiveNetworkSecurityGroup> {
    /*
     * The ID of network security group that is applied.
     */
    private SubResource networkSecurityGroup;

    /*
     * Associated resources.
     */
    private EffectiveNetworkSecurityGroupAssociation association;

    /*
     * A collection of effective security rules.
     */
    private List<EffectiveNetworkSecurityRule> effectiveSecurityRules;

    /*
     * Mapping of tags to list of IP Addresses included within the tag.
     */
    private String tagMap;

    /**
     * Creates an instance of EffectiveNetworkSecurityGroup class.
     */
    public EffectiveNetworkSecurityGroup() {
    }

    /**
     * Get the networkSecurityGroup property: The ID of network security group that is applied.
     * 
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The ID of network security group that is applied.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the association property: Associated resources.
     * 
     * @return the association value.
     */
    public EffectiveNetworkSecurityGroupAssociation association() {
        return this.association;
    }

    /**
     * Set the association property: Associated resources.
     * 
     * @param association the association value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup withAssociation(EffectiveNetworkSecurityGroupAssociation association) {
        this.association = association;
        return this;
    }

    /**
     * Get the effectiveSecurityRules property: A collection of effective security rules.
     * 
     * @return the effectiveSecurityRules value.
     */
    public List<EffectiveNetworkSecurityRule> effectiveSecurityRules() {
        return this.effectiveSecurityRules;
    }

    /**
     * Set the effectiveSecurityRules property: A collection of effective security rules.
     * 
     * @param effectiveSecurityRules the effectiveSecurityRules value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup
        withEffectiveSecurityRules(List<EffectiveNetworkSecurityRule> effectiveSecurityRules) {
        this.effectiveSecurityRules = effectiveSecurityRules;
        return this;
    }

    /**
     * Get the tagMap property: Mapping of tags to list of IP Addresses included within the tag.
     * 
     * @return the tagMap value.
     */
    public String tagMap() {
        return this.tagMap;
    }

    /**
     * Set the tagMap property: Mapping of tags to list of IP Addresses included within the tag.
     * 
     * @param tagMap the tagMap value to set.
     * @return the EffectiveNetworkSecurityGroup object itself.
     */
    public EffectiveNetworkSecurityGroup withTagMap(String tagMap) {
        this.tagMap = tagMap;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (association() != null) {
            association().validate();
        }
        if (effectiveSecurityRules() != null) {
            effectiveSecurityRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("networkSecurityGroup", this.networkSecurityGroup);
        jsonWriter.writeJsonField("association", this.association);
        jsonWriter.writeArrayField("effectiveSecurityRules", this.effectiveSecurityRules,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("tagMap", this.tagMap);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EffectiveNetworkSecurityGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EffectiveNetworkSecurityGroup if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EffectiveNetworkSecurityGroup.
     */
    public static EffectiveNetworkSecurityGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EffectiveNetworkSecurityGroup deserializedEffectiveNetworkSecurityGroup
                = new EffectiveNetworkSecurityGroup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkSecurityGroup".equals(fieldName)) {
                    deserializedEffectiveNetworkSecurityGroup.networkSecurityGroup = SubResource.fromJson(reader);
                } else if ("association".equals(fieldName)) {
                    deserializedEffectiveNetworkSecurityGroup.association
                        = EffectiveNetworkSecurityGroupAssociation.fromJson(reader);
                } else if ("effectiveSecurityRules".equals(fieldName)) {
                    List<EffectiveNetworkSecurityRule> effectiveSecurityRules
                        = reader.readArray(reader1 -> EffectiveNetworkSecurityRule.fromJson(reader1));
                    deserializedEffectiveNetworkSecurityGroup.effectiveSecurityRules = effectiveSecurityRules;
                } else if ("tagMap".equals(fieldName)) {
                    deserializedEffectiveNetworkSecurityGroup.tagMap = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEffectiveNetworkSecurityGroup;
        });
    }
}
