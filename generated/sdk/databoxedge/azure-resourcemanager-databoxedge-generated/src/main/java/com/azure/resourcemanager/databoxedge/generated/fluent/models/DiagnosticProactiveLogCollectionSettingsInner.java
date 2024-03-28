// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.ProactiveDiagnosticsConsent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The diagnostic proactive log collection settings of a device.
 */
@Fluent
public final class DiagnosticProactiveLogCollectionSettingsInner extends ArmBaseModel {
    /*
     * Properties of the diagnostic proactive log collection settings.
     */
    @JsonProperty(value = "properties", required = true)
    private ProactiveLogCollectionSettingsProperties innerProperties = new ProactiveLogCollectionSettingsProperties();

    /*
     * Metadata pertaining to creation and last modification of DiagnosticProactiveLogCollectionSettings
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of DiagnosticProactiveLogCollectionSettingsInner class.
     */
    public DiagnosticProactiveLogCollectionSettingsInner() {
    }

    /**
     * Get the innerProperties property: Properties of the diagnostic proactive log collection settings.
     * 
     * @return the innerProperties value.
     */
    private ProactiveLogCollectionSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of
     * DiagnosticProactiveLogCollectionSettings.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the userConsent property: Proactive diagnostic collection consent flag.
     * 
     * @return the userConsent value.
     */
    public ProactiveDiagnosticsConsent userConsent() {
        return this.innerProperties() == null ? null : this.innerProperties().userConsent();
    }

    /**
     * Set the userConsent property: Proactive diagnostic collection consent flag.
     * 
     * @param userConsent the userConsent value to set.
     * @return the DiagnosticProactiveLogCollectionSettingsInner object itself.
     */
    public DiagnosticProactiveLogCollectionSettingsInner withUserConsent(ProactiveDiagnosticsConsent userConsent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProactiveLogCollectionSettingsProperties();
        }
        this.innerProperties().withUserConsent(userConsent);
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
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model DiagnosticProactiveLogCollectionSettingsInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticProactiveLogCollectionSettingsInner.class);
}
