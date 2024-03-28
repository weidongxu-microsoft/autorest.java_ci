// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.resourcemanager.recoveryservices.generated.fluent.models.PrivateLinkResourceInner;
import java.util.List;

/**
 * An immutable client-side representation of PrivateLinkResource.
 */
public interface PrivateLinkResource {
    /**
     * Gets the id property: Fully qualified identifier of the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: e.g. Microsoft.RecoveryServices/vaults/privateLinkResources.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the groupId property: e.g. f9ad6492-33d4-4690-9999-6bfd52a0d081 (Backup) or
     * f9ad6492-33d4-4690-9999-6bfd52a0d082 (SiteRecovery).
     * 
     * @return the groupId value.
     */
    String groupId();

    /**
     * Gets the requiredMembers property: [backup-ecs1, backup-prot1, backup-prot1b, backup-prot1c, backup-id1].
     * 
     * @return the requiredMembers value.
     */
    List<String> requiredMembers();

    /**
     * Gets the requiredZoneNames property: The private link resource Private link DNS zone name.
     * 
     * @return the requiredZoneNames value.
     */
    List<String> requiredZoneNames();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservices.generated.fluent.models.PrivateLinkResourceInner
     * object.
     * 
     * @return the inner object.
     */
    PrivateLinkResourceInner innerModel();
}
