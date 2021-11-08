// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.models.ProvisioningStateDR;
import com.azure.resourcemanager.eventhubs.generated.models.RoleDisasterRecovery;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties required to the Create Or Update Alias(Disaster Recovery configurations). */
@Fluent
public final class ArmDisasterRecoveryProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArmDisasterRecoveryProperties.class);

    /*
     * Provisioning state of the Alias(Disaster Recovery configuration) -
     * possible values 'Accepted' or 'Succeeded' or 'Failed'
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStateDR provisioningState;

    /*
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part
     * of GEO DR pairing
     */
    @JsonProperty(value = "partnerNamespace")
    private String partnerNamespace;

    /*
     * Alternate name specified when alias and namespace names are same.
     */
    @JsonProperty(value = "alternateName")
    private String alternateName;

    /*
     * role of namespace in GEO DR - possible values 'Primary' or
     * 'PrimaryNotReplicating' or 'Secondary'
     */
    @JsonProperty(value = "role", access = JsonProperty.Access.WRITE_ONLY)
    private RoleDisasterRecovery role;

    /*
     * Number of entities pending to be replicated.
     */
    @JsonProperty(value = "pendingReplicationOperationsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long pendingReplicationOperationsCount;

    /**
     * Get the provisioningState property: Provisioning state of the Alias(Disaster Recovery configuration) - possible
     * values 'Accepted' or 'Succeeded' or 'Failed'.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateDR provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     *
     * @return the partnerNamespace value.
     */
    public String partnerNamespace() {
        return this.partnerNamespace;
    }

    /**
     * Set the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     *
     * @param partnerNamespace the partnerNamespace value to set.
     * @return the ArmDisasterRecoveryProperties object itself.
     */
    public ArmDisasterRecoveryProperties withPartnerNamespace(String partnerNamespace) {
        this.partnerNamespace = partnerNamespace;
        return this;
    }

    /**
     * Get the alternateName property: Alternate name specified when alias and namespace names are same.
     *
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.alternateName;
    }

    /**
     * Set the alternateName property: Alternate name specified when alias and namespace names are same.
     *
     * @param alternateName the alternateName value to set.
     * @return the ArmDisasterRecoveryProperties object itself.
     */
    public ArmDisasterRecoveryProperties withAlternateName(String alternateName) {
        this.alternateName = alternateName;
        return this;
    }

    /**
     * Get the role property: role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or
     * 'Secondary'.
     *
     * @return the role value.
     */
    public RoleDisasterRecovery role() {
        return this.role;
    }

    /**
     * Get the pendingReplicationOperationsCount property: Number of entities pending to be replicated.
     *
     * @return the pendingReplicationOperationsCount value.
     */
    public Long pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
