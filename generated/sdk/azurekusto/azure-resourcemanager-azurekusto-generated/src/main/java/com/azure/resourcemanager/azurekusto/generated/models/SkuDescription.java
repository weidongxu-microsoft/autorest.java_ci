// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.resourcemanager.azurekusto.generated.fluent.models.SkuDescriptionInner;
import java.util.List;

/** An immutable client-side representation of SkuDescription. */
public interface SkuDescription {
    /**
     * Gets the resourceType property: The resource type.
     *
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the name property: The name of the SKU.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the tier property: The tier of the SKU.
     *
     * @return the tier value.
     */
    String tier();

    /**
     * Gets the locations property: The set of locations that the SKU is available.
     *
     * @return the locations value.
     */
    List<String> locations();

    /**
     * Gets the locationInfo property: Locations and zones.
     *
     * @return the locationInfo value.
     */
    List<SkuLocationInfoItem> locationInfo();

    /**
     * Gets the restrictions property: The restrictions because of which SKU cannot be used.
     *
     * @return the restrictions value.
     */
    List<Object> restrictions();

    /**
     * Gets the inner com.azure.resourcemanager.azurekusto.generated.fluent.models.SkuDescriptionInner object.
     *
     * @return the inner object.
     */
    SkuDescriptionInner innerModel();
}
