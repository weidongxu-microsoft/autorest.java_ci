// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.CloudEdgeManagementRoleProperties;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.RoleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The preview of Virtual Machine Cloud Management from the Azure supports deploying and managing VMs on your Azure
 * Stack Edge device from Azure Portal.
 * For more information, refer to:
 * https://docs.microsoft.com/en-us/azure/databox-online/azure-stack-edge-gpu-virtual-machine-overview
 * By using this feature, you agree to the preview legal terms. See the
 * https://azure.microsoft.com/en-us/support/legal/preview-supplemental-terms/ for additional details.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = CloudEdgeManagementRole.class,
    visible = true)
@JsonTypeName("CloudEdgeManagement")
@Fluent
public final class CloudEdgeManagementRole extends RoleInner {
    /*
     * Role type.
     */
    @JsonTypeId
    @JsonProperty(value = "kind", required = true)
    private RoleTypes kind = RoleTypes.CLOUD_EDGE_MANAGEMENT;

    /*
     * Properties specific to CloudEdgeManagementRole role.
     */
    @JsonProperty(value = "properties")
    private CloudEdgeManagementRoleProperties innerProperties;

    /**
     * Creates an instance of CloudEdgeManagementRole class.
     */
    public CloudEdgeManagementRole() {
    }

    /**
     * Get the kind property: Role type.
     * 
     * @return the kind value.
     */
    @Override
    public RoleTypes kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Properties specific to CloudEdgeManagementRole role.
     * 
     * @return the innerProperties value.
     */
    private CloudEdgeManagementRoleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the localManagementStatus property: Local Edge Management Status.
     * 
     * @return the localManagementStatus value.
     */
    public RoleStatus localManagementStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().localManagementStatus();
    }

    /**
     * Get the edgeProfile property: Edge Profile of the resource.
     * 
     * @return the edgeProfile value.
     */
    public EdgeProfile edgeProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().edgeProfile();
    }

    /**
     * Get the roleStatus property: Role status.
     * 
     * @return the roleStatus value.
     */
    public RoleStatus roleStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().roleStatus();
    }

    /**
     * Set the roleStatus property: Role status.
     * 
     * @param roleStatus the roleStatus value to set.
     * @return the CloudEdgeManagementRole object itself.
     */
    public CloudEdgeManagementRole withRoleStatus(RoleStatus roleStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CloudEdgeManagementRoleProperties();
        }
        this.innerProperties().withRoleStatus(roleStatus);
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
