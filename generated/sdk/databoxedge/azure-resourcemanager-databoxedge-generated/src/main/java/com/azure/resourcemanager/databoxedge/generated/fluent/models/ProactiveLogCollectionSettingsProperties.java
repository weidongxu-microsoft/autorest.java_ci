// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ProactiveDiagnosticsConsent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of proactive log collection settings. */
@Fluent
public final class ProactiveLogCollectionSettingsProperties {
    /*
     * Proactive diagnostic collection consent flag
     */
    @JsonProperty(value = "userConsent", required = true)
    private ProactiveDiagnosticsConsent userConsent;

    /**
     * Get the userConsent property: Proactive diagnostic collection consent flag.
     *
     * @return the userConsent value.
     */
    public ProactiveDiagnosticsConsent userConsent() {
        return this.userConsent;
    }

    /**
     * Set the userConsent property: Proactive diagnostic collection consent flag.
     *
     * @param userConsent the userConsent value to set.
     * @return the ProactiveLogCollectionSettingsProperties object itself.
     */
    public ProactiveLogCollectionSettingsProperties withUserConsent(ProactiveDiagnosticsConsent userConsent) {
        this.userConsent = userConsent;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userConsent() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property userConsent in model ProactiveLogCollectionSettingsProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProactiveLogCollectionSettingsProperties.class);
}
