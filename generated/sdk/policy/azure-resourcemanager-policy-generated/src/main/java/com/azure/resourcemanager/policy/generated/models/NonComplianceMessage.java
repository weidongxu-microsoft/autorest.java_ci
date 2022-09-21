// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A message that describes why a resource is non-compliant with the policy. This is shown in 'deny' error messages and
 * on resource's non-compliant compliance results.
 */
@Fluent
public final class NonComplianceMessage {
    /*
     * A message that describes why a resource is non-compliant with the policy. This is shown in 'deny' error messages
     * and on resource's non-compliant compliance results.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * The policy definition reference ID within a policy set definition the message is intended for. This is only
     * applicable if the policy assignment assigns a policy set definition. If this is not provided the message applies
     * to all policies assigned by this policy assignment.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /** Creates an instance of NonComplianceMessage class. */
    public NonComplianceMessage() {
    }

    /**
     * Get the message property: A message that describes why a resource is non-compliant with the policy. This is shown
     * in 'deny' error messages and on resource's non-compliant compliance results.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: A message that describes why a resource is non-compliant with the policy. This is shown
     * in 'deny' error messages and on resource's non-compliant compliance results.
     *
     * @param message the message value to set.
     * @return the NonComplianceMessage object itself.
     */
    public NonComplianceMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: The policy definition reference ID within a policy set definition
     * the message is intended for. This is only applicable if the policy assignment assigns a policy set definition. If
     * this is not provided the message applies to all policies assigned by this policy assignment.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: The policy definition reference ID within a policy set definition
     * the message is intended for. This is only applicable if the policy assignment assigns a policy set definition. If
     * this is not provided the message applies to all policies assigned by this policy assignment.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the NonComplianceMessage object itself.
     */
    public NonComplianceMessage withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (message() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property message in model NonComplianceMessage"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NonComplianceMessage.class);
}
