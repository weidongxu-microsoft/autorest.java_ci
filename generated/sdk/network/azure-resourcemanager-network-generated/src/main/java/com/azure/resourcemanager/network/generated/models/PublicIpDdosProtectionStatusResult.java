// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.PublicIpDdosProtectionStatusResultInner;

/**
 * An immutable client-side representation of PublicIpDdosProtectionStatusResult.
 */
public interface PublicIpDdosProtectionStatusResult {
    /**
     * Gets the publicIpAddressId property: Public IP ARM resource ID.
     * 
     * @return the publicIpAddressId value.
     */
    String publicIpAddressId();

    /**
     * Gets the publicIpAddress property: IP Address of the Public IP Resource.
     * 
     * @return the publicIpAddress value.
     */
    String publicIpAddress();

    /**
     * Gets the isWorkloadProtected property: Value indicating whether the IP address is DDoS workload protected or not.
     * 
     * @return the isWorkloadProtected value.
     */
    IsWorkloadProtected isWorkloadProtected();

    /**
     * Gets the ddosProtectionPlanId property:  DDoS protection plan Resource Id of a if IP address is protected through a plan.
     * 
     * @return the ddosProtectionPlanId value.
     */
    String ddosProtectionPlanId();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.PublicIpDdosProtectionStatusResultInner object.
     * 
     * @return the inner object.
     */
    PublicIpDdosProtectionStatusResultInner innerModel();
}
