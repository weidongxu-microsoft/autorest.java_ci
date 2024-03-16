// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.resourcemanager.storage.generated.fluent.models.LeaseShareResponseInner;

/**
 * An immutable client-side representation of LeaseShareResponse.
 */
public interface LeaseShareResponse {
    /**
     * Gets the leaseId property: Returned unique lease ID that must be included with any request to delete the share, or to renew, change, or release the lease.
     * 
     * @return the leaseId value.
     */
    String leaseId();

    /**
     * Gets the leaseTimeSeconds property: Approximate time remaining in the lease period, in seconds.
     * 
     * @return the leaseTimeSeconds value.
     */
    String leaseTimeSeconds();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.LeaseShareResponseInner object.
     * 
     * @return the inner object.
     */
    LeaseShareResponseInner innerModel();
}
