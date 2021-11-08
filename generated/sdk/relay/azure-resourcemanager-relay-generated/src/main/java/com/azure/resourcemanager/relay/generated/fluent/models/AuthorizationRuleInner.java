// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.generated.models.AccessRights;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a namespace authorization rule. */
@Fluent
public final class AuthorizationRuleInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AuthorizationRuleInner.class);

    /*
     * Authorization rule properties.
     */
    @JsonProperty(value = "properties", required = true)
    private AuthorizationRuleProperties innerProperties = new AuthorizationRuleProperties();

    /**
     * Get the innerProperties property: Authorization rule properties.
     *
     * @return the innerProperties value.
     */
    private AuthorizationRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the rights property: The rights associated with the rule.
     *
     * @return the rights value.
     */
    public List<AccessRights> rights() {
        return this.innerProperties() == null ? null : this.innerProperties().rights();
    }

    /**
     * Set the rights property: The rights associated with the rule.
     *
     * @param rights the rights value to set.
     * @return the AuthorizationRuleInner object itself.
     */
    public AuthorizationRuleInner withRights(List<AccessRights> rights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationRuleProperties();
        }
        this.innerProperties().withRights(rights);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model AuthorizationRuleInner"));
        } else {
            innerProperties().validate();
        }
    }
}
