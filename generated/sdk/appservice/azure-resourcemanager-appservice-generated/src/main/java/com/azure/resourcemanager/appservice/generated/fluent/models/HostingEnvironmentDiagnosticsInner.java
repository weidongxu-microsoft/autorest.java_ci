// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Diagnostics for an App Service Environment. */
@Fluent
public final class HostingEnvironmentDiagnosticsInner {
    /*
     * Name/identifier of the diagnostics.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Diagnostics output.
     */
    @JsonProperty(value = "diagnosticsOutput")
    private String diagnosticsOutput;

    /** Creates an instance of HostingEnvironmentDiagnosticsInner class. */
    public HostingEnvironmentDiagnosticsInner() {
    }

    /**
     * Get the name property: Name/identifier of the diagnostics.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name/identifier of the diagnostics.
     *
     * @param name the name value to set.
     * @return the HostingEnvironmentDiagnosticsInner object itself.
     */
    public HostingEnvironmentDiagnosticsInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the diagnosticsOutput property: Diagnostics output.
     *
     * @return the diagnosticsOutput value.
     */
    public String diagnosticsOutput() {
        return this.diagnosticsOutput;
    }

    /**
     * Set the diagnosticsOutput property: Diagnostics output.
     *
     * @param diagnosticsOutput the diagnosticsOutput value to set.
     * @return the HostingEnvironmentDiagnosticsInner object itself.
     */
    public HostingEnvironmentDiagnosticsInner withDiagnosticsOutput(String diagnosticsOutput) {
        this.diagnosticsOutput = diagnosticsOutput;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
