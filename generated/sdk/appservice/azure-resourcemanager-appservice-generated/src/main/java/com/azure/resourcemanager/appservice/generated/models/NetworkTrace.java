// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.NetworkTraceInner;

/**
 * An immutable client-side representation of NetworkTrace.
 */
public interface NetworkTrace {
    /**
     * Gets the path property: Local file path for the captured network trace file.
     * 
     * @return the path value.
     */
    String path();

    /**
     * Gets the status property: Current status of the network trace operation, same as Operation.Status
     * (InProgress/Succeeded/Failed).
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the message property: Detailed message of a network trace operation, e.g. error message in case of failure.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.NetworkTraceInner object.
     * 
     * @return the inner object.
     */
    NetworkTraceInner innerModel();
}
