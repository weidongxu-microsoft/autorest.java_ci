// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mysql.generated.models.BackupType;
import com.azure.resourcemanager.mysql.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Server backup properties.
 */
@Fluent
public final class ServerBackupV2Inner extends ProxyResource {
    /*
     * The properties of a server backup.
     */
    @JsonProperty(value = "properties")
    private ServerBackupPropertiesV2 innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ServerBackupV2Inner class.
     */
    public ServerBackupV2Inner() {
    }

    /**
     * Get the innerProperties property: The properties of a server backup.
     * 
     * @return the innerProperties value.
     */
    private ServerBackupPropertiesV2 innerProperties() {
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
     * Get the backupNameV2 property: Backup name.
     * 
     * @return the backupNameV2 value.
     */
    public String backupNameV2() {
        return this.innerProperties() == null ? null : this.innerProperties().backupNameV2();
    }

    /**
     * Set the backupNameV2 property: Backup name.
     * 
     * @param backupNameV2 the backupNameV2 value to set.
     * @return the ServerBackupV2Inner object itself.
     */
    public ServerBackupV2Inner withBackupNameV2(String backupNameV2) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerBackupPropertiesV2();
        }
        this.innerProperties().withBackupNameV2(backupNameV2);
        return this;
    }

    /**
     * Get the backupType property: The backupType property.
     * 
     * @return the backupType value.
     */
    public BackupType backupType() {
        return this.innerProperties() == null ? null : this.innerProperties().backupType();
    }

    /**
     * Set the backupType property: The backupType property.
     * 
     * @param backupType the backupType value to set.
     * @return the ServerBackupV2Inner object itself.
     */
    public ServerBackupV2Inner withBackupType(BackupType backupType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerBackupPropertiesV2();
        }
        this.innerProperties().withBackupType(backupType);
        return this;
    }

    /**
     * Get the completedTime property: Backup completed time (ISO8601 format).
     * 
     * @return the completedTime value.
     */
    public OffsetDateTime completedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().completedTime();
    }

    /**
     * Set the completedTime property: Backup completed time (ISO8601 format).
     * 
     * @param completedTime the completedTime value to set.
     * @return the ServerBackupV2Inner object itself.
     */
    public ServerBackupV2Inner withCompletedTime(OffsetDateTime completedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerBackupPropertiesV2();
        }
        this.innerProperties().withCompletedTime(completedTime);
        return this;
    }

    /**
     * Get the source property: Backup source.
     * 
     * @return the source value.
     */
    public String source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Backup source.
     * 
     * @param source the source value to set.
     * @return the ServerBackupV2Inner object itself.
     */
    public ServerBackupV2Inner withSource(String source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerBackupPropertiesV2();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of backup resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
