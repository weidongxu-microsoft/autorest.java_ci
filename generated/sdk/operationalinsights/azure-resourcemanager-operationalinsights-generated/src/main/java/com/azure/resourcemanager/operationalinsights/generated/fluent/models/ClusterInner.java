// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.operationalinsights.generated.models.AssociatedWorkspace;
import com.azure.resourcemanager.operationalinsights.generated.models.BillingType;
import com.azure.resourcemanager.operationalinsights.generated.models.CapacityReservationProperties;
import com.azure.resourcemanager.operationalinsights.generated.models.ClusterEntityStatus;
import com.azure.resourcemanager.operationalinsights.generated.models.ClusterSku;
import com.azure.resourcemanager.operationalinsights.generated.models.Identity;
import com.azure.resourcemanager.operationalinsights.generated.models.KeyVaultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The top level Log Analytics cluster resource container. */
@Fluent
public final class ClusterInner extends Resource {
    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The sku properties.
     */
    @JsonProperty(value = "sku")
    private ClusterSku sku;

    /*
     * Log Analytics cluster properties.
     */
    @JsonProperty(value = "properties")
    private ClusterProperties innerProperties;

    /** Creates an instance of ClusterInner class. */
    public ClusterInner() {
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The sku properties.
     *
     * @return the sku value.
     */
    public ClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku properties.
     *
     * @param sku the sku value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(ClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Log Analytics cluster properties.
     *
     * @return the innerProperties value.
     */
    private ClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the clusterId property: The ID associated with the cluster.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the provisioningState property: The provisioning state of the cluster.
     *
     * @return the provisioningState value.
     */
    public ClusterEntityStatus provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the isDoubleEncryptionEnabled property: Configures whether cluster will use double encryption. This Property
     * can not be modified after cluster creation. Default value is 'true'.
     *
     * @return the isDoubleEncryptionEnabled value.
     */
    public Boolean isDoubleEncryptionEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isDoubleEncryptionEnabled();
    }

    /**
     * Set the isDoubleEncryptionEnabled property: Configures whether cluster will use double encryption. This Property
     * can not be modified after cluster creation. Default value is 'true'.
     *
     * @param isDoubleEncryptionEnabled the isDoubleEncryptionEnabled value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIsDoubleEncryptionEnabled(Boolean isDoubleEncryptionEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withIsDoubleEncryptionEnabled(isDoubleEncryptionEnabled);
        return this;
    }

    /**
     * Get the isAvailabilityZonesEnabled property: Sets whether the cluster will support availability zones. This can
     * be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be
     * modified after cluster creation. Default value is 'true' if region supports Availability Zones.
     *
     * @return the isAvailabilityZonesEnabled value.
     */
    public Boolean isAvailabilityZonesEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isAvailabilityZonesEnabled();
    }

    /**
     * Set the isAvailabilityZonesEnabled property: Sets whether the cluster will support availability zones. This can
     * be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be
     * modified after cluster creation. Default value is 'true' if region supports Availability Zones.
     *
     * @param isAvailabilityZonesEnabled the isAvailabilityZonesEnabled value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIsAvailabilityZonesEnabled(Boolean isAvailabilityZonesEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withIsAvailabilityZonesEnabled(isAvailabilityZonesEnabled);
        return this;
    }

    /**
     * Get the billingType property: The cluster's billing type.
     *
     * @return the billingType value.
     */
    public BillingType billingType() {
        return this.innerProperties() == null ? null : this.innerProperties().billingType();
    }

    /**
     * Set the billingType property: The cluster's billing type.
     *
     * @param billingType the billingType value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withBillingType(BillingType billingType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withBillingType(billingType);
        return this;
    }

    /**
     * Get the keyVaultProperties property: The associated key properties.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultProperties();
    }

    /**
     * Set the keyVaultProperties property: The associated key properties.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withKeyVaultProperties(keyVaultProperties);
        return this;
    }

    /**
     * Get the lastModifiedDate property: The last time the cluster was updated.
     *
     * @return the lastModifiedDate value.
     */
    public String lastModifiedDate() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedDate();
    }

    /**
     * Get the createdDate property: The cluster creation time.
     *
     * @return the createdDate value.
     */
    public String createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Get the associatedWorkspaces property: The list of Log Analytics workspaces associated with the cluster.
     *
     * @return the associatedWorkspaces value.
     */
    public List<AssociatedWorkspace> associatedWorkspaces() {
        return this.innerProperties() == null ? null : this.innerProperties().associatedWorkspaces();
    }

    /**
     * Set the associatedWorkspaces property: The list of Log Analytics workspaces associated with the cluster.
     *
     * @param associatedWorkspaces the associatedWorkspaces value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAssociatedWorkspaces(List<AssociatedWorkspace> associatedWorkspaces) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withAssociatedWorkspaces(associatedWorkspaces);
        return this;
    }

    /**
     * Get the capacityReservationProperties property: Additional properties for capacity reservation.
     *
     * @return the capacityReservationProperties value.
     */
    public CapacityReservationProperties capacityReservationProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().capacityReservationProperties();
    }

    /**
     * Set the capacityReservationProperties property: Additional properties for capacity reservation.
     *
     * @param capacityReservationProperties the capacityReservationProperties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCapacityReservationProperties(CapacityReservationProperties capacityReservationProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withCapacityReservationProperties(capacityReservationProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
