// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object that defines the blob inventory rule. */
@Fluent
public final class BlobInventoryPolicyDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobInventoryPolicyDefinition.class);

    /*
     * An object that defines the filter set.
     */
    @JsonProperty(value = "filters")
    private BlobInventoryPolicyFilter filters;

    /*
     * This is a required field, it specifies the format for the inventory
     * files.
     */
    @JsonProperty(value = "format", required = true)
    private Format format;

    /*
     * This is a required field. This field is used to schedule an inventory
     * formation.
     */
    @JsonProperty(value = "schedule", required = true)
    private Schedule schedule;

    /*
     * This is a required field. This field specifies the scope of the
     * inventory created either at the blob or container level.
     */
    @JsonProperty(value = "objectType", required = true)
    private ObjectType objectType;

    /*
     * This is a required field. This field specifies the fields and properties
     * of the object to be included in the inventory. The Schema field value
     * 'Name' is always required. The valid values for this field for the
     * 'Blob' definition.objectType include 'Name, Creation-Time,
     * Last-Modified, Content-Length, Content-MD5, BlobType, AccessTier,
     * AccessTierChangeTime, Expiry-Time, hdi_isfolder, Owner, Group,
     * Permissions, Acl, Snapshot, VersionId, IsCurrentVersion, Metadata,
     * LastAccessTime'. The valid values for 'Container' definition.objectType
     * include 'Name, Last-Modified, Metadata, LeaseStatus, LeaseState,
     * LeaseDuration, PublicAccess, HasImmutabilityPolicy, HasLegalHold'.
     * Schema field values 'Expiry-Time, hdi_isfolder, Owner, Group,
     * Permissions, Acl' are valid only for Hns enabled accounts.
     */
    @JsonProperty(value = "schemaFields", required = true)
    private List<String> schemaFields;

    /**
     * Get the filters property: An object that defines the filter set.
     *
     * @return the filters value.
     */
    public BlobInventoryPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set the filters property: An object that defines the filter set.
     *
     * @param filters the filters value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withFilters(BlobInventoryPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the format property: This is a required field, it specifies the format for the inventory files.
     *
     * @return the format value.
     */
    public Format format() {
        return this.format;
    }

    /**
     * Set the format property: This is a required field, it specifies the format for the inventory files.
     *
     * @param format the format value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withFormat(Format format) {
        this.format = format;
        return this;
    }

    /**
     * Get the schedule property: This is a required field. This field is used to schedule an inventory formation.
     *
     * @return the schedule value.
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: This is a required field. This field is used to schedule an inventory formation.
     *
     * @param schedule the schedule value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the objectType property: This is a required field. This field specifies the scope of the inventory created
     * either at the blob or container level.
     *
     * @return the objectType value.
     */
    public ObjectType objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: This is a required field. This field specifies the scope of the inventory created
     * either at the blob or container level.
     *
     * @param objectType the objectType value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the schemaFields property: This is a required field. This field specifies the fields and properties of the
     * object to be included in the inventory. The Schema field value 'Name' is always required. The valid values for
     * this field for the 'Blob' definition.objectType include 'Name, Creation-Time, Last-Modified, Content-Length,
     * Content-MD5, BlobType, AccessTier, AccessTierChangeTime, Expiry-Time, hdi_isfolder, Owner, Group, Permissions,
     * Acl, Snapshot, VersionId, IsCurrentVersion, Metadata, LastAccessTime'. The valid values for 'Container'
     * definition.objectType include 'Name, Last-Modified, Metadata, LeaseStatus, LeaseState, LeaseDuration,
     * PublicAccess, HasImmutabilityPolicy, HasLegalHold'. Schema field values 'Expiry-Time, hdi_isfolder, Owner, Group,
     * Permissions, Acl' are valid only for Hns enabled accounts.
     *
     * @return the schemaFields value.
     */
    public List<String> schemaFields() {
        return this.schemaFields;
    }

    /**
     * Set the schemaFields property: This is a required field. This field specifies the fields and properties of the
     * object to be included in the inventory. The Schema field value 'Name' is always required. The valid values for
     * this field for the 'Blob' definition.objectType include 'Name, Creation-Time, Last-Modified, Content-Length,
     * Content-MD5, BlobType, AccessTier, AccessTierChangeTime, Expiry-Time, hdi_isfolder, Owner, Group, Permissions,
     * Acl, Snapshot, VersionId, IsCurrentVersion, Metadata, LastAccessTime'. The valid values for 'Container'
     * definition.objectType include 'Name, Last-Modified, Metadata, LeaseStatus, LeaseState, LeaseDuration,
     * PublicAccess, HasImmutabilityPolicy, HasLegalHold'. Schema field values 'Expiry-Time, hdi_isfolder, Owner, Group,
     * Permissions, Acl' are valid only for Hns enabled accounts.
     *
     * @param schemaFields the schemaFields value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withSchemaFields(List<String> schemaFields) {
        this.schemaFields = schemaFields;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filters() != null) {
            filters().validate();
        }
        if (format() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property format in model BlobInventoryPolicyDefinition"));
        }
        if (schedule() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schedule in model BlobInventoryPolicyDefinition"));
        }
        if (objectType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property objectType in model BlobInventoryPolicyDefinition"));
        }
        if (schemaFields() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schemaFields in model BlobInventoryPolicyDefinition"));
        }
    }
}
