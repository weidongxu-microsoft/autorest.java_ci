// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.generated.models.ShareAccessRight;
import com.azure.resourcemanager.databoxedge.generated.models.UserType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The user properties. */
@Fluent
public final class UserProperties {
    /*
     * The password details.
     */
    @JsonProperty(value = "encryptedPassword")
    private AsymmetricEncryptedSecret encryptedPassword;

    /*
     * List of shares that the user has rights on. This field should not be specified during user creation.
     */
    @JsonProperty(value = "shareAccessRights", access = JsonProperty.Access.WRITE_ONLY)
    private List<ShareAccessRight> shareAccessRights;

    /*
     * Type of the user.
     */
    @JsonProperty(value = "userType", required = true)
    private UserType userType;

    /** Creates an instance of UserProperties class. */
    public UserProperties() {
    }

    /**
     * Get the encryptedPassword property: The password details.
     *
     * @return the encryptedPassword value.
     */
    public AsymmetricEncryptedSecret encryptedPassword() {
        return this.encryptedPassword;
    }

    /**
     * Set the encryptedPassword property: The password details.
     *
     * @param encryptedPassword the encryptedPassword value to set.
     * @return the UserProperties object itself.
     */
    public UserProperties withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }

    /**
     * Get the shareAccessRights property: List of shares that the user has rights on. This field should not be
     * specified during user creation.
     *
     * @return the shareAccessRights value.
     */
    public List<ShareAccessRight> shareAccessRights() {
        return this.shareAccessRights;
    }

    /**
     * Get the userType property: Type of the user.
     *
     * @return the userType value.
     */
    public UserType userType() {
        return this.userType;
    }

    /**
     * Set the userType property: Type of the user.
     *
     * @param userType the userType value to set.
     * @return the UserProperties object itself.
     */
    public UserProperties withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptedPassword() != null) {
            encryptedPassword().validate();
        }
        if (shareAccessRights() != null) {
            shareAccessRights().forEach(e -> e.validate());
        }
        if (userType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property userType in model UserProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserProperties.class);
}
