// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.resourcemanager.costmanagement.generated.fluent.models.SettingInner;
import java.util.List;

/** An immutable client-side representation of Setting. */
public interface Setting {
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
     * Gets the kind property: Resource kind.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the scope property: Sets the default scope the current user will see when they sign into Azure Cost
     * Management in the Azure portal.
     *
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the startOn property: Indicates what scope Cost Management in the Azure portal should default to. Allowed
     * values: LastUsed.
     *
     * @return the startOn value.
     */
    SettingsPropertiesStartOn startOn();

    /**
     * Gets the cache property: Array of scopes with additional details used by Cost Management in the Azure portal.
     *
     * @return the cache value.
     */
    List<CacheItem> cache();

    /**
     * Gets the inner com.azure.resourcemanager.costmanagement.generated.fluent.models.SettingInner object.
     *
     * @return the inner object.
     */
    SettingInner innerModel();
}
