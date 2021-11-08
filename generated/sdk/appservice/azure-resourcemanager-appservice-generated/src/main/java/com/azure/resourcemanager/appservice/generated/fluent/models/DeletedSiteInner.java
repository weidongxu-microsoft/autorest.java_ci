// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A deleted app. */
@Fluent
public final class DeletedSiteInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedSiteInner.class);

    /*
     * DeletedSite resource specific properties
     */
    @JsonProperty(value = "properties")
    private DeletedSiteProperties innerProperties;

    /**
     * Get the innerProperties property: DeletedSite resource specific properties.
     *
     * @return the innerProperties value.
     */
    private DeletedSiteProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DeletedSiteInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the deletedSiteId property: Numeric id for the deleted site.
     *
     * @return the deletedSiteId value.
     */
    public Integer deletedSiteId() {
        return this.innerProperties() == null ? null : this.innerProperties().deletedSiteId();
    }

    /**
     * Get the deletedTimestamp property: Time in UTC when the app was deleted.
     *
     * @return the deletedTimestamp value.
     */
    public String deletedTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().deletedTimestamp();
    }

    /**
     * Get the subscription property: Subscription containing the deleted site.
     *
     * @return the subscription value.
     */
    public String subscription() {
        return this.innerProperties() == null ? null : this.innerProperties().subscription();
    }

    /**
     * Get the resourceGroup property: ResourceGroup that contained the deleted site.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroup();
    }

    /**
     * Get the deletedSiteName property: Name of the deleted site.
     *
     * @return the deletedSiteName value.
     */
    public String deletedSiteName() {
        return this.innerProperties() == null ? null : this.innerProperties().deletedSiteName();
    }

    /**
     * Get the slot property: Slot of the deleted site.
     *
     * @return the slot value.
     */
    public String slot() {
        return this.innerProperties() == null ? null : this.innerProperties().slot();
    }

    /**
     * Get the kind property: Kind of site that was deleted.
     *
     * @return the kind value.
     */
    public String kindPropertiesKind() {
        return this.innerProperties() == null ? null : this.innerProperties().kind();
    }

    /**
     * Get the geoRegionName property: Geo Region of the deleted site.
     *
     * @return the geoRegionName value.
     */
    public String geoRegionName() {
        return this.innerProperties() == null ? null : this.innerProperties().geoRegionName();
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
