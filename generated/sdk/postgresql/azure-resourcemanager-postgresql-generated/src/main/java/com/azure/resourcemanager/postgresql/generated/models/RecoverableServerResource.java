// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.resourcemanager.postgresql.generated.fluent.models.RecoverableServerResourceInner;

/**
 * An immutable client-side representation of RecoverableServerResource.
 */
public interface RecoverableServerResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the lastAvailableBackupDateTime property: The last available backup date time.
     * 
     * @return the lastAvailableBackupDateTime value.
     */
    String lastAvailableBackupDateTime();

    /**
     * Gets the serviceLevelObjective property: The service level objective.
     * 
     * @return the serviceLevelObjective value.
     */
    String serviceLevelObjective();

    /**
     * Gets the edition property: Edition of the performance tier.
     * 
     * @return the edition value.
     */
    String edition();

    /**
     * Gets the vCore property: vCore associated with the service level objective.
     * 
     * @return the vCore value.
     */
    Integer vCore();

    /**
     * Gets the hardwareGeneration property: Hardware generation associated with the service level objective.
     * 
     * @return the hardwareGeneration value.
     */
    String hardwareGeneration();

    /**
     * Gets the version property: The PostgreSQL version.
     * 
     * @return the version value.
     */
    String version();

    /**
     * Gets the inner com.azure.resourcemanager.postgresql.generated.fluent.models.RecoverableServerResourceInner object.
     * 
     * @return the inner object.
     */
    RecoverableServerResourceInner innerModel();
}
