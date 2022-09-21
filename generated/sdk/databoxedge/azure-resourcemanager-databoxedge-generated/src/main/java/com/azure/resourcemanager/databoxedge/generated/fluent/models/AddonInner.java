// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.databoxedge.generated.models.ArcAddon;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.IoTAddon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Role Addon. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = AddonInner.class)
@JsonTypeName("Addon")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ArcForKubernetes", value = ArcAddon.class),
    @JsonSubTypes.Type(name = "IotEdge", value = IoTAddon.class)
})
@Immutable
public class AddonInner extends ArmBaseModel {
    /*
     * Metadata pertaining to creation and last modification of Addon
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AddonInner class. */
    public AddonInner() {
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of Addon.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
