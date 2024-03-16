// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.network.generated.fluent.models.BaseAdminRuleInner;

/**
 * An immutable client-side representation of BaseAdminRule.
 */
public interface BaseAdminRule {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the kind property: Whether the rule is custom or default.
     * 
     * @return the kind value.
     */
    AdminRuleKind kind();

    /**
     * Gets the systemData property: The system metadata related to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.BaseAdminRuleInner object.
     * 
     * @return the inner object.
     */
    BaseAdminRuleInner innerModel();
}
