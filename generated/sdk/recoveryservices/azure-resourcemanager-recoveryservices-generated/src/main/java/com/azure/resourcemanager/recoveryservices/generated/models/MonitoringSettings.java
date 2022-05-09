// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Monitoring Settings of the vault. */
@Fluent
public final class MonitoringSettings {
    /*
     * Settings for Azure Monitor based alerts
     */
    @JsonProperty(value = "azureMonitorAlertSettings")
    private AzureMonitorAlertSettings azureMonitorAlertSettings;

    /*
     * Settings for classic alerts
     */
    @JsonProperty(value = "classicAlertSettings")
    private ClassicAlertSettings classicAlertSettings;

    /**
     * Get the azureMonitorAlertSettings property: Settings for Azure Monitor based alerts.
     *
     * @return the azureMonitorAlertSettings value.
     */
    public AzureMonitorAlertSettings azureMonitorAlertSettings() {
        return this.azureMonitorAlertSettings;
    }

    /**
     * Set the azureMonitorAlertSettings property: Settings for Azure Monitor based alerts.
     *
     * @param azureMonitorAlertSettings the azureMonitorAlertSettings value to set.
     * @return the MonitoringSettings object itself.
     */
    public MonitoringSettings withAzureMonitorAlertSettings(AzureMonitorAlertSettings azureMonitorAlertSettings) {
        this.azureMonitorAlertSettings = azureMonitorAlertSettings;
        return this;
    }

    /**
     * Get the classicAlertSettings property: Settings for classic alerts.
     *
     * @return the classicAlertSettings value.
     */
    public ClassicAlertSettings classicAlertSettings() {
        return this.classicAlertSettings;
    }

    /**
     * Set the classicAlertSettings property: Settings for classic alerts.
     *
     * @param classicAlertSettings the classicAlertSettings value to set.
     * @return the MonitoringSettings object itself.
     */
    public MonitoringSettings withClassicAlertSettings(ClassicAlertSettings classicAlertSettings) {
        this.classicAlertSettings = classicAlertSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureMonitorAlertSettings() != null) {
            azureMonitorAlertSettings().validate();
        }
        if (classicAlertSettings() != null) {
            classicAlertSettings().validate();
        }
    }
}
