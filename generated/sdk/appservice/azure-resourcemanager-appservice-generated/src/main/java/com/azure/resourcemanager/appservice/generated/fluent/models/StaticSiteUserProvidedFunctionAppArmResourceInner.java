// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Static Site User Provided Function App ARM resource. */
@Fluent
public final class StaticSiteUserProvidedFunctionAppArmResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteUserProvidedFunctionAppARMResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSiteUserProvidedFunctionAppArmResourceProperties innerProperties;

    /** Creates an instance of StaticSiteUserProvidedFunctionAppArmResourceInner class. */
    public StaticSiteUserProvidedFunctionAppArmResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteUserProvidedFunctionAppARMResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StaticSiteUserProvidedFunctionAppArmResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteUserProvidedFunctionAppArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the functionAppResourceId property: The resource id of the function app registered with the static site.
     *
     * @return the functionAppResourceId value.
     */
    public String functionAppResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().functionAppResourceId();
    }

    /**
     * Set the functionAppResourceId property: The resource id of the function app registered with the static site.
     *
     * @param functionAppResourceId the functionAppResourceId value to set.
     * @return the StaticSiteUserProvidedFunctionAppArmResourceInner object itself.
     */
    public StaticSiteUserProvidedFunctionAppArmResourceInner withFunctionAppResourceId(String functionAppResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteUserProvidedFunctionAppArmResourceProperties();
        }
        this.innerProperties().withFunctionAppResourceId(functionAppResourceId);
        return this;
    }

    /**
     * Get the functionAppRegion property: The region of the function app registered with the static site.
     *
     * @return the functionAppRegion value.
     */
    public String functionAppRegion() {
        return this.innerProperties() == null ? null : this.innerProperties().functionAppRegion();
    }

    /**
     * Set the functionAppRegion property: The region of the function app registered with the static site.
     *
     * @param functionAppRegion the functionAppRegion value to set.
     * @return the StaticSiteUserProvidedFunctionAppArmResourceInner object itself.
     */
    public StaticSiteUserProvidedFunctionAppArmResourceInner withFunctionAppRegion(String functionAppRegion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteUserProvidedFunctionAppArmResourceProperties();
        }
        this.innerProperties().withFunctionAppRegion(functionAppRegion);
        return this;
    }

    /**
     * Get the createdOn property: The date and time on which the function app was registered with the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
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
