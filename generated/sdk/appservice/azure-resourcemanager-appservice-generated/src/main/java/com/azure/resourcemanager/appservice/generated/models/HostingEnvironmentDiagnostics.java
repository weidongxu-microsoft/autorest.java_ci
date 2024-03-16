// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.HostingEnvironmentDiagnosticsInner;

/**
 * An immutable client-side representation of HostingEnvironmentDiagnostics.
 */
public interface HostingEnvironmentDiagnostics {
    /**
     * Gets the name property: Name/identifier of the diagnostics.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the diagnosticsOutput property: Diagnostics output.
     * 
     * @return the diagnosticsOutput value.
     */
    String diagnosticsOutput();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.HostingEnvironmentDiagnosticsInner object.
     * 
     * @return the inner object.
     */
    HostingEnvironmentDiagnosticsInner innerModel();
}
