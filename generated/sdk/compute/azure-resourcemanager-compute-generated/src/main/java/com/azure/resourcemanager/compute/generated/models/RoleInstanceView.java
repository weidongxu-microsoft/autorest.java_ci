// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.RoleInstanceViewInner;
import java.util.List;

/**
 * An immutable client-side representation of RoleInstanceView.
 */
public interface RoleInstanceView {
    /**
     * Gets the platformUpdateDomain property: The Update Domain.
     * 
     * @return the platformUpdateDomain value.
     */
    Integer platformUpdateDomain();

    /**
     * Gets the platformFaultDomain property: The Fault Domain.
     * 
     * @return the platformFaultDomain value.
     */
    Integer platformFaultDomain();

    /**
     * Gets the privateId property: Specifies a unique identifier generated internally for the cloud service associated
     * with this role instance. &lt;br /&gt;&lt;br /&gt; NOTE: If you are using Azure Diagnostics extension, this
     * property can be used as 'DeploymentId' for querying details.
     * 
     * @return the privateId value.
     */
    String privateId();

    /**
     * Gets the statuses property: The statuses property.
     * 
     * @return the statuses value.
     */
    List<ResourceInstanceViewStatus> statuses();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.RoleInstanceViewInner object.
     * 
     * @return the inner object.
     */
    RoleInstanceViewInner innerModel();
}
