// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.SecuritySettingsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The security settings of a device. */
@Fluent
public final class SecuritySettings extends ArmBaseModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecuritySettings.class);

    /*
     * Properties of the security settings.
     */
    @JsonProperty(value = "properties", required = true)
    private SecuritySettingsProperties innerProperties = new SecuritySettingsProperties();

    /**
     * Get the innerProperties property: Properties of the security settings.
     *
     * @return the innerProperties value.
     */
    private SecuritySettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the deviceAdminPassword property: Device administrator password as an encrypted string (encrypted using RSA
     * PKCS #1) is used to sign into the local web UI of the device. The Actual password should have at least 8
     * characters that are a combination of uppercase, lowercase, numeric, and special characters.
     *
     * @return the deviceAdminPassword value.
     */
    public AsymmetricEncryptedSecret deviceAdminPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceAdminPassword();
    }

    /**
     * Set the deviceAdminPassword property: Device administrator password as an encrypted string (encrypted using RSA
     * PKCS #1) is used to sign into the local web UI of the device. The Actual password should have at least 8
     * characters that are a combination of uppercase, lowercase, numeric, and special characters.
     *
     * @param deviceAdminPassword the deviceAdminPassword value to set.
     * @return the SecuritySettings object itself.
     */
    public SecuritySettings withDeviceAdminPassword(AsymmetricEncryptedSecret deviceAdminPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecuritySettingsProperties();
        }
        this.innerProperties().withDeviceAdminPassword(deviceAdminPassword);
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
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model SecuritySettings"));
        } else {
            innerProperties().validate();
        }
    }
}
