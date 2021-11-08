// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Hybrid Connection for an App Service app. */
@Fluent
public final class RelayServiceConnectionEntityInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RelayServiceConnectionEntityInner.class);

    /*
     * RelayServiceConnectionEntity resource specific properties
     */
    @JsonProperty(value = "properties")
    private RelayServiceConnectionEntityProperties innerProperties;

    /**
     * Get the innerProperties property: RelayServiceConnectionEntity resource specific properties.
     *
     * @return the innerProperties value.
     */
    private RelayServiceConnectionEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RelayServiceConnectionEntityInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the entityName property: The entityName property.
     *
     * @return the entityName value.
     */
    public String entityName() {
        return this.innerProperties() == null ? null : this.innerProperties().entityName();
    }

    /**
     * Set the entityName property: The entityName property.
     *
     * @param entityName the entityName value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityName(String entityName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withEntityName(entityName);
        return this;
    }

    /**
     * Get the entityConnectionString property: The entityConnectionString property.
     *
     * @return the entityConnectionString value.
     */
    public String entityConnectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().entityConnectionString();
    }

    /**
     * Set the entityConnectionString property: The entityConnectionString property.
     *
     * @param entityConnectionString the entityConnectionString value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityConnectionString(String entityConnectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withEntityConnectionString(entityConnectionString);
        return this;
    }

    /**
     * Get the resourceType property: The resourceType property.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceType();
    }

    /**
     * Set the resourceType property: The resourceType property.
     *
     * @param resourceType the resourceType value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceType(String resourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withResourceType(resourceType);
        return this;
    }

    /**
     * Get the resourceConnectionString property: The resourceConnectionString property.
     *
     * @return the resourceConnectionString value.
     */
    public String resourceConnectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceConnectionString();
    }

    /**
     * Set the resourceConnectionString property: The resourceConnectionString property.
     *
     * @param resourceConnectionString the resourceConnectionString value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceConnectionString(String resourceConnectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withResourceConnectionString(resourceConnectionString);
        return this;
    }

    /**
     * Get the hostname property: The hostname property.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The hostname property.
     *
     * @param hostname the hostname value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the port property: The port property.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: The port property.
     *
     * @param port the port value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Get the biztalkUri property: The biztalkUri property.
     *
     * @return the biztalkUri value.
     */
    public String biztalkUri() {
        return this.innerProperties() == null ? null : this.innerProperties().biztalkUri();
    }

    /**
     * Set the biztalkUri property: The biztalkUri property.
     *
     * @param biztalkUri the biztalkUri value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withBiztalkUri(String biztalkUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RelayServiceConnectionEntityProperties();
        }
        this.innerProperties().withBiztalkUri(biztalkUri);
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
