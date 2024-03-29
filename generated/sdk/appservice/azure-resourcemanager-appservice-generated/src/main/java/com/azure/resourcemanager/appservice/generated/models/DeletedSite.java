// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.DeletedSiteInner;

/**
 * An immutable client-side representation of DeletedSite.
 */
public interface DeletedSite {
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
     * Gets the deletedSiteId property: Numeric id for the deleted site.
     * 
     * @return the deletedSiteId value.
     */
    Integer deletedSiteId();

    /**
     * Gets the deletedTimestamp property: Time in UTC when the app was deleted.
     * 
     * @return the deletedTimestamp value.
     */
    String deletedTimestamp();

    /**
     * Gets the subscription property: Subscription containing the deleted site.
     * 
     * @return the subscription value.
     */
    String subscription();

    /**
     * Gets the resourceGroup property: ResourceGroup that contained the deleted site.
     * 
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * Gets the deletedSiteName property: Name of the deleted site.
     * 
     * @return the deletedSiteName value.
     */
    String deletedSiteName();

    /**
     * Gets the slot property: Slot of the deleted site.
     * 
     * @return the slot value.
     */
    String slot();

    /**
     * Gets the kindPropertiesKind property: Kind of site that was deleted.
     * 
     * @return the kindPropertiesKind value.
     */
    String kindPropertiesKind();

    /**
     * Gets the geoRegionName property: Geo Region of the deleted site.
     * 
     * @return the geoRegionName value.
     */
    String geoRegionName();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DeletedSiteInner object.
     * 
     * @return the inner object.
     */
    DeletedSiteInner innerModel();
}
