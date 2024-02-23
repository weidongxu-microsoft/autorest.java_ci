// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.models.ExemptionCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The policy exemption.
 */
@Fluent
public final class PolicyExemptionInner extends ProxyResource {
    /*
     * Properties for the policy exemption.
     */
    @JsonProperty(value = "properties", required = true)
    private PolicyExemptionProperties innerProperties = new PolicyExemptionProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of PolicyExemptionInner class.
     */
    public PolicyExemptionInner() {
    }

    /**
     * Get the innerProperties property: Properties for the policy exemption.
     * 
     * @return the innerProperties value.
     */
    private PolicyExemptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     * 
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().policyAssignmentId();
    }

    /**
     * Set the policyAssignmentId property: The ID of the policy assignment that is being exempted.
     * 
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withPolicyAssignmentId(String policyAssignmentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withPolicyAssignmentId(policyAssignmentId);
        return this;
    }

    /**
     * Get the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     * 
     * @return the policyDefinitionReferenceIds value.
     */
    public List<String> policyDefinitionReferenceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().policyDefinitionReferenceIds();
    }

    /**
     * Set the policyDefinitionReferenceIds property: The policy definition reference ID list when the associated policy
     * assignment is an assignment of a policy set definition.
     * 
     * @param policyDefinitionReferenceIds the policyDefinitionReferenceIds value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withPolicyDefinitionReferenceIds(List<String> policyDefinitionReferenceIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withPolicyDefinitionReferenceIds(policyDefinitionReferenceIds);
        return this;
    }

    /**
     * Get the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     * @return the exemptionCategory value.
     */
    public ExemptionCategory exemptionCategory() {
        return this.innerProperties() == null ? null : this.innerProperties().exemptionCategory();
    }

    /**
     * Set the exemptionCategory property: The policy exemption category. Possible values are Waiver and Mitigated.
     * 
     * @param exemptionCategory the exemptionCategory value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withExemptionCategory(ExemptionCategory exemptionCategory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withExemptionCategory(exemptionCategory);
        return this;
    }

    /**
     * Get the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     * 
     * @return the expiresOn value.
     */
    public OffsetDateTime expiresOn() {
        return this.innerProperties() == null ? null : this.innerProperties().expiresOn();
    }

    /**
     * Set the expiresOn property: The expiration date and time (in UTC ISO 8601 format yyyy-MM-ddTHH:mm:ssZ) of the
     * policy exemption.
     * 
     * @param expiresOn the expiresOn value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withExpiresOn(OffsetDateTime expiresOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withExpiresOn(expiresOn);
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy exemption.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the policy exemption.
     * 
     * @param displayName the displayName value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: The description of the policy exemption.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the policy exemption.
     * 
     * @param description the description value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The policy exemption metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     * 
     * @param metadata the metadata value to set.
     * @return the PolicyExemptionInner object itself.
     */
    public PolicyExemptionInner withMetadata(Object metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyExemptionProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model PolicyExemptionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicyExemptionInner.class);
}
