// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.AddonInner;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ArcAddonProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Arc Addon. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ArcForKubernetes")
@Fluent
public final class ArcAddon extends AddonInner {
    /*
     * Properties specific to Arc addon.
     */
    @JsonProperty(value = "properties", required = true)
    private ArcAddonProperties innerProperties = new ArcAddonProperties();

    /**
     * Get the innerProperties property: Properties specific to Arc addon.
     *
     * @return the innerProperties value.
     */
    private ArcAddonProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the subscriptionId property: Arc resource subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionId();
    }

    /**
     * Set the subscriptionId property: Arc resource subscription Id.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withSubscriptionId(String subscriptionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * Get the resourceGroupName property: Arc resource group name.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroupName();
    }

    /**
     * Set the resourceGroupName property: Arc resource group name.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withResourceGroupName(String resourceGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * Get the resourceName property: Arc resource Name.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceName();
    }

    /**
     * Set the resourceName property: Arc resource Name.
     *
     * @param resourceName the resourceName value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withResourceName(String resourceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withResourceName(resourceName);
        return this;
    }

    /**
     * Get the resourceLocation property: Arc resource location.
     *
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceLocation();
    }

    /**
     * Set the resourceLocation property: Arc resource location.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the ArcAddon object itself.
     */
    public ArcAddon withResourceLocation(String resourceLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcAddonProperties();
        }
        this.innerProperties().withResourceLocation(resourceLocation);
        return this;
    }

    /**
     * Get the version property: Arc resource version.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the hostPlatform property: Host OS supported by the Arc addon.
     *
     * @return the hostPlatform value.
     */
    public PlatformType hostPlatform() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatform();
    }

    /**
     * Get the hostPlatformType property: Platform where the runtime is hosted.
     *
     * @return the hostPlatformType value.
     */
    public HostPlatformType hostPlatformType() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatformType();
    }

    /**
     * Get the provisioningState property: Addon Provisioning State.
     *
     * @return the provisioningState value.
     */
    public AddonState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model ArcAddon"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ArcAddon.class);
}
