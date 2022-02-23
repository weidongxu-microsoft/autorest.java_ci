// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A hostname and its assigned sites. */
@Fluent
public final class CustomHostnameSitesInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomHostnameSitesInner.class);

    /*
     * CustomHostnameSites resource specific properties
     */
    @JsonProperty(value = "properties")
    private CustomHostnameSitesProperties innerProperties;

    /**
     * Get the innerProperties property: CustomHostnameSites resource specific properties.
     *
     * @return the innerProperties value.
     */
    private CustomHostnameSitesProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CustomHostnameSitesInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the customHostname property: The customHostname property.
     *
     * @return the customHostname value.
     */
    public String customHostname() {
        return this.innerProperties() == null ? null : this.innerProperties().customHostname();
    }

    /**
     * Set the customHostname property: The customHostname property.
     *
     * @param customHostname the customHostname value to set.
     * @return the CustomHostnameSitesInner object itself.
     */
    public CustomHostnameSitesInner withCustomHostname(String customHostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameSitesProperties();
        }
        this.innerProperties().withCustomHostname(customHostname);
        return this;
    }

    /**
     * Get the region property: The region property.
     *
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Set the region property: The region property.
     *
     * @param region the region value to set.
     * @return the CustomHostnameSitesInner object itself.
     */
    public CustomHostnameSitesInner withRegion(String region) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameSitesProperties();
        }
        this.innerProperties().withRegion(region);
        return this;
    }

    /**
     * Get the siteResourceIds property: The siteResourceIds property.
     *
     * @return the siteResourceIds value.
     */
    public List<IdentifierInner> siteResourceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().siteResourceIds();
    }

    /**
     * Set the siteResourceIds property: The siteResourceIds property.
     *
     * @param siteResourceIds the siteResourceIds value to set.
     * @return the CustomHostnameSitesInner object itself.
     */
    public CustomHostnameSitesInner withSiteResourceIds(List<IdentifierInner> siteResourceIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomHostnameSitesProperties();
        }
        this.innerProperties().withSiteResourceIds(siteResourceIds);
        return this;
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
