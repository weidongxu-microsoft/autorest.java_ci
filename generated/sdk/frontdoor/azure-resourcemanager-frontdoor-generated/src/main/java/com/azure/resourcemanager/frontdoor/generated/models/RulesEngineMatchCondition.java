// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Define a match condition. */
@Fluent
public final class RulesEngineMatchCondition {
    /*
     * Match Variable
     */
    @JsonProperty(value = "rulesEngineMatchVariable", required = true)
    private RulesEngineMatchVariable rulesEngineMatchVariable;

    /*
     * Name of selector in RequestHeader or RequestBody to be matched
     */
    @JsonProperty(value = "selector")
    private String selector;

    /*
     * Describes operator to apply to the match condition.
     */
    @JsonProperty(value = "rulesEngineOperator", required = true)
    private RulesEngineOperator rulesEngineOperator;

    /*
     * Describes if this is negate condition or not
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /*
     * Match values to match against. The operator will apply to each value in
     * here with OR semantics. If any of them match the variable with the given
     * operator this match condition is considered a match.
     */
    @JsonProperty(value = "rulesEngineMatchValue", required = true)
    private List<String> rulesEngineMatchValue;

    /*
     * List of transforms
     */
    @JsonProperty(value = "transforms")
    private List<Transform> transforms;

    /**
     * Get the rulesEngineMatchVariable property: Match Variable.
     *
     * @return the rulesEngineMatchVariable value.
     */
    public RulesEngineMatchVariable rulesEngineMatchVariable() {
        return this.rulesEngineMatchVariable;
    }

    /**
     * Set the rulesEngineMatchVariable property: Match Variable.
     *
     * @param rulesEngineMatchVariable the rulesEngineMatchVariable value to set.
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withRulesEngineMatchVariable(RulesEngineMatchVariable rulesEngineMatchVariable) {
        this.rulesEngineMatchVariable = rulesEngineMatchVariable;
        return this;
    }

    /**
     * Get the selector property: Name of selector in RequestHeader or RequestBody to be matched.
     *
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: Name of selector in RequestHeader or RequestBody to be matched.
     *
     * @param selector the selector value to set.
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the rulesEngineOperator property: Describes operator to apply to the match condition.
     *
     * @return the rulesEngineOperator value.
     */
    public RulesEngineOperator rulesEngineOperator() {
        return this.rulesEngineOperator;
    }

    /**
     * Set the rulesEngineOperator property: Describes operator to apply to the match condition.
     *
     * @param rulesEngineOperator the rulesEngineOperator value to set.
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withRulesEngineOperator(RulesEngineOperator rulesEngineOperator) {
        this.rulesEngineOperator = rulesEngineOperator;
        return this;
    }

    /**
     * Get the negateCondition property: Describes if this is negate condition or not.
     *
     * @return the negateCondition value.
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set the negateCondition property: Describes if this is negate condition or not.
     *
     * @param negateCondition the negateCondition value to set.
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the rulesEngineMatchValue property: Match values to match against. The operator will apply to each value in
     * here with OR semantics. If any of them match the variable with the given operator this match condition is
     * considered a match.
     *
     * @return the rulesEngineMatchValue value.
     */
    public List<String> rulesEngineMatchValue() {
        return this.rulesEngineMatchValue;
    }

    /**
     * Set the rulesEngineMatchValue property: Match values to match against. The operator will apply to each value in
     * here with OR semantics. If any of them match the variable with the given operator this match condition is
     * considered a match.
     *
     * @param rulesEngineMatchValue the rulesEngineMatchValue value to set.
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withRulesEngineMatchValue(List<String> rulesEngineMatchValue) {
        this.rulesEngineMatchValue = rulesEngineMatchValue;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     *
     * @return the transforms value.
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     *
     * @param transforms the transforms value to set.
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rulesEngineMatchVariable() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rulesEngineMatchVariable in model RulesEngineMatchCondition"));
        }
        if (rulesEngineOperator() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rulesEngineOperator in model RulesEngineMatchCondition"));
        }
        if (rulesEngineMatchValue() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rulesEngineMatchValue in model RulesEngineMatchCondition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RulesEngineMatchCondition.class);
}
