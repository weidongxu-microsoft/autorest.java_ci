// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of Log Analytics workspaces associated with the cluster.
 */
@Immutable
public final class AssociatedWorkspace {
    /*
     * Associated workspace immutable id.
     */
    @JsonProperty(value = "workspaceId", access = JsonProperty.Access.WRITE_ONLY)
    private String workspaceId;

    /*
     * Associated workspace resource name.
     */
    @JsonProperty(value = "workspaceName", access = JsonProperty.Access.WRITE_ONLY)
    private String workspaceName;

    /*
     * Associated workspace arm resource id, in the form of: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * The time of workspace association.
     */
    @JsonProperty(value = "associateDate", access = JsonProperty.Access.WRITE_ONLY)
    private String associateDate;

    /**
     * Creates an instance of AssociatedWorkspace class.
     */
    public AssociatedWorkspace() {
    }

    /**
     * Get the workspaceId property: Associated workspace immutable id.
     * 
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Get the workspaceName property: Associated workspace resource name.
     * 
     * @return the workspaceName value.
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    /**
     * Get the resourceId property: Associated workspace arm resource id, in the form of: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the associateDate property: The time of workspace association.
     * 
     * @return the associateDate value.
     */
    public String associateDate() {
        return this.associateDate;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
