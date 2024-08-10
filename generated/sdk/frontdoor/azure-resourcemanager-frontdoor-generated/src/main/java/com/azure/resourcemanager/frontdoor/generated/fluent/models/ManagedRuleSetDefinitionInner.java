// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.generated.models.ManagedRuleGroupDefinition;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Describes the a managed rule set definition.
 */
@Fluent
public final class ManagedRuleSetDefinitionInner extends Resource {
    /*
     * Properties for a managed rule set definition.
     */
    private ManagedRuleSetDefinitionProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ManagedRuleSetDefinitionInner class.
     */
    public ManagedRuleSetDefinitionInner() {
    }

    /**
     * Get the innerProperties property: Properties for a managed rule set definition.
     * 
     * @return the innerProperties value.
     */
    private ManagedRuleSetDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedRuleSetDefinitionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedRuleSetDefinitionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the managed rule set.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the ruleSetId property: Id of the managed rule set.
     * 
     * @return the ruleSetId value.
     */
    public String ruleSetId() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetId();
    }

    /**
     * Get the ruleSetType property: Type of the managed rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetType();
    }

    /**
     * Get the ruleSetVersion property: Version of the managed rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetVersion();
    }

    /**
     * Get the ruleGroups property: Rule groups of the managed rule set.
     * 
     * @return the ruleGroups value.
     */
    public List<ManagedRuleGroupDefinition> ruleGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleGroups();
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
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model ManagedRuleSetDefinitionInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedRuleSetDefinitionInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRuleSetDefinitionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRuleSetDefinitionInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedRuleSetDefinitionInner.
     */
    public static ManagedRuleSetDefinitionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRuleSetDefinitionInner deserializedManagedRuleSetDefinitionInner
                = new ManagedRuleSetDefinitionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedRuleSetDefinitionInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedManagedRuleSetDefinitionInner.innerProperties
                        = ManagedRuleSetDefinitionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRuleSetDefinitionInner;
        });
    }
}
