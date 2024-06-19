// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Exclude variables from managed rule evaluation.
 */
@Fluent
public final class ManagedRuleExclusion implements JsonSerializable<ManagedRuleExclusion> {
    /*
     * The variable type to be excluded.
     */
    private ManagedRuleExclusionMatchVariable matchVariable;

    /*
     * Comparison operator to apply to the selector when specifying which elements in the collection this exclusion
     * applies to.
     */
    private ManagedRuleExclusionSelectorMatchOperator selectorMatchOperator;

    /*
     * Selector value for which elements in the collection this exclusion applies to.
     */
    private String selector;

    /**
     * Creates an instance of ManagedRuleExclusion class.
     */
    public ManagedRuleExclusion() {
    }

    /**
     * Get the matchVariable property: The variable type to be excluded.
     * 
     * @return the matchVariable value.
     */
    public ManagedRuleExclusionMatchVariable matchVariable() {
        return this.matchVariable;
    }

    /**
     * Set the matchVariable property: The variable type to be excluded.
     * 
     * @param matchVariable the matchVariable value to set.
     * @return the ManagedRuleExclusion object itself.
     */
    public ManagedRuleExclusion withMatchVariable(ManagedRuleExclusionMatchVariable matchVariable) {
        this.matchVariable = matchVariable;
        return this;
    }

    /**
     * Get the selectorMatchOperator property: Comparison operator to apply to the selector when specifying which
     * elements in the collection this exclusion applies to.
     * 
     * @return the selectorMatchOperator value.
     */
    public ManagedRuleExclusionSelectorMatchOperator selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    /**
     * Set the selectorMatchOperator property: Comparison operator to apply to the selector when specifying which
     * elements in the collection this exclusion applies to.
     * 
     * @param selectorMatchOperator the selectorMatchOperator value to set.
     * @return the ManagedRuleExclusion object itself.
     */
    public ManagedRuleExclusion
        withSelectorMatchOperator(ManagedRuleExclusionSelectorMatchOperator selectorMatchOperator) {
        this.selectorMatchOperator = selectorMatchOperator;
        return this;
    }

    /**
     * Get the selector property: Selector value for which elements in the collection this exclusion applies to.
     * 
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: Selector value for which elements in the collection this exclusion applies to.
     * 
     * @param selector the selector value to set.
     * @return the ManagedRuleExclusion object itself.
     */
    public ManagedRuleExclusion withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchVariable() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property matchVariable in model ManagedRuleExclusion"));
        }
        if (selectorMatchOperator() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property selectorMatchOperator in model ManagedRuleExclusion"));
        }
        if (selector() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property selector in model ManagedRuleExclusion"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedRuleExclusion.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("matchVariable", this.matchVariable == null ? null : this.matchVariable.toString());
        jsonWriter.writeStringField("selectorMatchOperator",
            this.selectorMatchOperator == null ? null : this.selectorMatchOperator.toString());
        jsonWriter.writeStringField("selector", this.selector);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRuleExclusion from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRuleExclusion if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedRuleExclusion.
     */
    public static ManagedRuleExclusion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRuleExclusion deserializedManagedRuleExclusion = new ManagedRuleExclusion();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("matchVariable".equals(fieldName)) {
                    deserializedManagedRuleExclusion.matchVariable
                        = ManagedRuleExclusionMatchVariable.fromString(reader.getString());
                } else if ("selectorMatchOperator".equals(fieldName)) {
                    deserializedManagedRuleExclusion.selectorMatchOperator
                        = ManagedRuleExclusionSelectorMatchOperator.fromString(reader.getString());
                } else if ("selector".equals(fieldName)) {
                    deserializedManagedRuleExclusion.selector = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRuleExclusion;
        });
    }
}
