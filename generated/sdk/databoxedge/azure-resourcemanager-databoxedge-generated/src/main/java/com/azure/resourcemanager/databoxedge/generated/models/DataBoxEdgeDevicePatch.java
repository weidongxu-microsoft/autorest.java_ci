// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeDevicePropertiesPatch;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The Data Box Edge/Gateway device patch.
 */
@Fluent
public final class DataBoxEdgeDevicePatch {
    /*
     * The tags attached to the Data Box Edge/Gateway resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Msi identity of the resource
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The properties associated with the Data Box Edge/Gateway resource
     */
    @JsonProperty(value = "properties")
    private DataBoxEdgeDevicePropertiesPatch innerProperties;

    /**
     * Creates an instance of DataBoxEdgeDevicePatch class.
     */
    public DataBoxEdgeDevicePatch() {
    }

    /**
     * Get the tags property: The tags attached to the Data Box Edge/Gateway resource.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags attached to the Data Box Edge/Gateway resource.
     * 
     * @param tags the tags value to set.
     * @return the DataBoxEdgeDevicePatch object itself.
     */
    public DataBoxEdgeDevicePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Msi identity of the resource.
     * 
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Msi identity of the resource.
     * 
     * @param identity the identity value to set.
     * @return the DataBoxEdgeDevicePatch object itself.
     */
    public DataBoxEdgeDevicePatch withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The properties associated with the Data Box Edge/Gateway resource.
     * 
     * @return the innerProperties value.
     */
    private DataBoxEdgeDevicePropertiesPatch innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the edgeProfile property: Edge Profile property of the Data Box Edge/Gateway device.
     * 
     * @return the edgeProfile value.
     */
    public EdgeProfilePatch edgeProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().edgeProfile();
    }

    /**
     * Set the edgeProfile property: Edge Profile property of the Data Box Edge/Gateway device.
     * 
     * @param edgeProfile the edgeProfile value to set.
     * @return the DataBoxEdgeDevicePatch object itself.
     */
    public DataBoxEdgeDevicePatch withEdgeProfile(EdgeProfilePatch edgeProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDevicePropertiesPatch();
        }
        this.innerProperties().withEdgeProfile(edgeProfile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
