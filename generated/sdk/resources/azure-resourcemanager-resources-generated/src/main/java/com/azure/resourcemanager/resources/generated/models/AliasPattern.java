// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type of the pattern for an alias path.
 */
@Fluent
public final class AliasPattern {
    /*
     * The alias pattern phrase.
     */
    @JsonProperty(value = "phrase")
    private String phrase;

    /*
     * The alias pattern variable.
     */
    @JsonProperty(value = "variable")
    private String variable;

    /*
     * The type of alias pattern
     */
    @JsonProperty(value = "type")
    private AliasPatternType type;

    /**
     * Creates an instance of AliasPattern class.
     */
    public AliasPattern() {
    }

    /**
     * Get the phrase property: The alias pattern phrase.
     * 
     * @return the phrase value.
     */
    public String phrase() {
        return this.phrase;
    }

    /**
     * Set the phrase property: The alias pattern phrase.
     * 
     * @param phrase the phrase value to set.
     * @return the AliasPattern object itself.
     */
    public AliasPattern withPhrase(String phrase) {
        this.phrase = phrase;
        return this;
    }

    /**
     * Get the variable property: The alias pattern variable.
     * 
     * @return the variable value.
     */
    public String variable() {
        return this.variable;
    }

    /**
     * Set the variable property: The alias pattern variable.
     * 
     * @param variable the variable value to set.
     * @return the AliasPattern object itself.
     */
    public AliasPattern withVariable(String variable) {
        this.variable = variable;
        return this;
    }

    /**
     * Get the type property: The type of alias pattern.
     * 
     * @return the type value.
     */
    public AliasPatternType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of alias pattern.
     * 
     * @param type the type value to set.
     * @return the AliasPattern object itself.
     */
    public AliasPattern withType(AliasPatternType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
