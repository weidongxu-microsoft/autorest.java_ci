// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.AsymmetricEncryptedSecret;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of security settings.
 */
@Fluent
public final class SecuritySettingsProperties {
    /*
     * Device administrator password as an encrypted string (encrypted using RSA PKCS #1) is used to sign into the local
     * web UI of the device. The Actual password should have at least 8 characters that are a combination of uppercase,
     * lowercase, numeric, and special characters.
     */
    @JsonProperty(value = "deviceAdminPassword", required = true)
    private AsymmetricEncryptedSecret deviceAdminPassword;

    /**
     * Creates an instance of SecuritySettingsProperties class.
     */
    public SecuritySettingsProperties() {
    }

    /**
     * Get the deviceAdminPassword property: Device administrator password as an encrypted string (encrypted using RSA
     * PKCS #1) is used to sign into the local web UI of the device. The Actual password should have at least 8
     * characters that are a combination of uppercase, lowercase, numeric, and special characters.
     * 
     * @return the deviceAdminPassword value.
     */
    public AsymmetricEncryptedSecret deviceAdminPassword() {
        return this.deviceAdminPassword;
    }

    /**
     * Set the deviceAdminPassword property: Device administrator password as an encrypted string (encrypted using RSA
     * PKCS #1) is used to sign into the local web UI of the device. The Actual password should have at least 8
     * characters that are a combination of uppercase, lowercase, numeric, and special characters.
     * 
     * @param deviceAdminPassword the deviceAdminPassword value to set.
     * @return the SecuritySettingsProperties object itself.
     */
    public SecuritySettingsProperties withDeviceAdminPassword(AsymmetricEncryptedSecret deviceAdminPassword) {
        this.deviceAdminPassword = deviceAdminPassword;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deviceAdminPassword() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property deviceAdminPassword in model SecuritySettingsProperties"));
        } else {
            deviceAdminPassword().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecuritySettingsProperties.class);
}
