// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.MSDeployLogInner;
import java.util.List;

/**
 * An immutable client-side representation of MSDeployLog.
 */
public interface MSDeployLog {
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
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the entries property: List of log entry messages.
     * 
     * @return the entries value.
     */
    List<MSDeployLogEntry> entries();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.MSDeployLogInner object.
     * 
     * @return the inner object.
     */
    MSDeployLogInner innerModel();
}
