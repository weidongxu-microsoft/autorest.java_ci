// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.generated.models.AzureEntityResource;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicyProperties;
import com.azure.resourcemanager.storage.generated.models.ImmutableStorageWithVersioning;
import com.azure.resourcemanager.storage.generated.models.LeaseDuration;
import com.azure.resourcemanager.storage.generated.models.LeaseState;
import com.azure.resourcemanager.storage.generated.models.LeaseStatus;
import com.azure.resourcemanager.storage.generated.models.LegalHoldProperties;
import com.azure.resourcemanager.storage.generated.models.PublicAccess;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The blob container properties be listed out. */
@Fluent
public final class ListContainerItemInner extends AzureEntityResource {
    /*
     * The blob container properties be listed out.
     */
    @JsonProperty(value = "properties")
    private ContainerProperties innerProperties;

    /** Creates an instance of ListContainerItemInner class. */
    public ListContainerItemInner() {
    }

    /**
     * Get the innerProperties property: The blob container properties be listed out.
     *
     * @return the innerProperties value.
     */
    private ContainerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the version property: The version of the deleted blob container.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the deleted property: Indicates whether the blob container was deleted.
     *
     * @return the deleted value.
     */
    public Boolean deleted() {
        return this.innerProperties() == null ? null : this.innerProperties().deleted();
    }

    /**
     * Get the deletedTime property: Blob container deletion time.
     *
     * @return the deletedTime value.
     */
    public OffsetDateTime deletedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().deletedTime();
    }

    /**
     * Get the remainingRetentionDays property: Remaining retention days for soft deleted blob container.
     *
     * @return the remainingRetentionDays value.
     */
    public Integer remainingRetentionDays() {
        return this.innerProperties() == null ? null : this.innerProperties().remainingRetentionDays();
    }

    /**
     * Get the defaultEncryptionScope property: Default the container to use specified encryption scope for all writes.
     *
     * @return the defaultEncryptionScope value.
     */
    public String defaultEncryptionScope() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultEncryptionScope();
    }

    /**
     * Set the defaultEncryptionScope property: Default the container to use specified encryption scope for all writes.
     *
     * @param defaultEncryptionScope the defaultEncryptionScope value to set.
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withDefaultEncryptionScope(String defaultEncryptionScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withDefaultEncryptionScope(defaultEncryptionScope);
        return this;
    }

    /**
     * Get the denyEncryptionScopeOverride property: Block override of encryption scope from the container default.
     *
     * @return the denyEncryptionScopeOverride value.
     */
    public Boolean denyEncryptionScopeOverride() {
        return this.innerProperties() == null ? null : this.innerProperties().denyEncryptionScopeOverride();
    }

    /**
     * Set the denyEncryptionScopeOverride property: Block override of encryption scope from the container default.
     *
     * @param denyEncryptionScopeOverride the denyEncryptionScopeOverride value to set.
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withDenyEncryptionScopeOverride(denyEncryptionScopeOverride);
        return this;
    }

    /**
     * Get the publicAccess property: Specifies whether data in the container may be accessed publicly and the level of
     * access.
     *
     * @return the publicAccess value.
     */
    public PublicAccess publicAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicAccess();
    }

    /**
     * Set the publicAccess property: Specifies whether data in the container may be accessed publicly and the level of
     * access.
     *
     * @param publicAccess the publicAccess value to set.
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withPublicAccess(PublicAccess publicAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withPublicAccess(publicAccess);
        return this;
    }

    /**
     * Get the lastModifiedTime property: Returns the date and time the container was last modified.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the leaseStatus property: The lease status of the container.
     *
     * @return the leaseStatus value.
     */
    public LeaseStatus leaseStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().leaseStatus();
    }

    /**
     * Get the leaseState property: Lease state of the container.
     *
     * @return the leaseState value.
     */
    public LeaseState leaseState() {
        return this.innerProperties() == null ? null : this.innerProperties().leaseState();
    }

    /**
     * Get the leaseDuration property: Specifies whether the lease on a container is of infinite or fixed duration, only
     * when the container is leased.
     *
     * @return the leaseDuration value.
     */
    public LeaseDuration leaseDuration() {
        return this.innerProperties() == null ? null : this.innerProperties().leaseDuration();
    }

    /**
     * Get the metadata property: A name-value pair to associate with the container as metadata.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: A name-value pair to associate with the container as metadata.
     *
     * @param metadata the metadata value to set.
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withMetadata(Map<String, String> metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the immutabilityPolicy property: The ImmutabilityPolicy property of the container.
     *
     * @return the immutabilityPolicy value.
     */
    public ImmutabilityPolicyProperties immutabilityPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().immutabilityPolicy();
    }

    /**
     * Get the legalHold property: The LegalHold property of the container.
     *
     * @return the legalHold value.
     */
    public LegalHoldProperties legalHold() {
        return this.innerProperties() == null ? null : this.innerProperties().legalHold();
    }

    /**
     * Get the hasLegalHold property: The hasLegalHold public property is set to true by SRP if there are at least one
     * existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared
     * out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     *
     * @return the hasLegalHold value.
     */
    public Boolean hasLegalHold() {
        return this.innerProperties() == null ? null : this.innerProperties().hasLegalHold();
    }

    /**
     * Get the hasImmutabilityPolicy property: The hasImmutabilityPolicy public property is set to true by SRP if
     * ImmutabilityPolicy has been created for this container. The hasImmutabilityPolicy public property is set to false
     * by SRP if ImmutabilityPolicy has not been created for this container.
     *
     * @return the hasImmutabilityPolicy value.
     */
    public Boolean hasImmutabilityPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().hasImmutabilityPolicy();
    }

    /**
     * Get the immutableStorageWithVersioning property: The object level immutability property of the container. The
     * property is immutable and can only be set to true at the container creation time. Existing containers must
     * undergo a migration process.
     *
     * @return the immutableStorageWithVersioning value.
     */
    public ImmutableStorageWithVersioning immutableStorageWithVersioning() {
        return this.innerProperties() == null ? null : this.innerProperties().immutableStorageWithVersioning();
    }

    /**
     * Set the immutableStorageWithVersioning property: The object level immutability property of the container. The
     * property is immutable and can only be set to true at the container creation time. Existing containers must
     * undergo a migration process.
     *
     * @param immutableStorageWithVersioning the immutableStorageWithVersioning value to set.
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withImmutableStorageWithVersioning(
        ImmutableStorageWithVersioning immutableStorageWithVersioning) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withImmutableStorageWithVersioning(immutableStorageWithVersioning);
        return this;
    }

    /**
     * Get the enableNfsV3RootSquash property: Enable NFSv3 root squash on blob container.
     *
     * @return the enableNfsV3RootSquash value.
     */
    public Boolean enableNfsV3RootSquash() {
        return this.innerProperties() == null ? null : this.innerProperties().enableNfsV3RootSquash();
    }

    /**
     * Set the enableNfsV3RootSquash property: Enable NFSv3 root squash on blob container.
     *
     * @param enableNfsV3RootSquash the enableNfsV3RootSquash value to set.
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withEnableNfsV3RootSquash(Boolean enableNfsV3RootSquash) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withEnableNfsV3RootSquash(enableNfsV3RootSquash);
        return this;
    }

    /**
     * Get the enableNfsV3AllSquash property: Enable NFSv3 all squash on blob container.
     *
     * @return the enableNfsV3AllSquash value.
     */
    public Boolean enableNfsV3AllSquash() {
        return this.innerProperties() == null ? null : this.innerProperties().enableNfsV3AllSquash();
    }

    /**
     * Set the enableNfsV3AllSquash property: Enable NFSv3 all squash on blob container.
     *
     * @param enableNfsV3AllSquash the enableNfsV3AllSquash value to set.
     * @return the ListContainerItemInner object itself.
     */
    public ListContainerItemInner withEnableNfsV3AllSquash(Boolean enableNfsV3AllSquash) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withEnableNfsV3AllSquash(enableNfsV3AllSquash);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
