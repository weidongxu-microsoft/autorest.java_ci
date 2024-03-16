// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.resourcemanager.recoveryservices.generated.fluent.models.ClientDiscoveryValueForSingleApiInner;

/**
 * An immutable client-side representation of ClientDiscoveryValueForSingleApi.
 */
public interface ClientDiscoveryValueForSingleApi {
    /**
     * Gets the name property: Name of the Operation.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: Contains the localized display information for this particular operation.
     * 
     * @return the display value.
     */
    ClientDiscoveryDisplay display();

    /**
     * Gets the origin property: The intended executor of the operation;governs the display of the operation in the RBAC UX and the audit logs UX.
     * 
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the properties property: ShoeBox properties for the given operation.
     * 
     * @return the properties value.
     */
    ClientDiscoveryForProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservices.generated.fluent.models.ClientDiscoveryValueForSingleApiInner object.
     * 
     * @return the inner object.
     */
    ClientDiscoveryValueForSingleApiInner innerModel();
}
