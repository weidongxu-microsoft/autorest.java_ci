// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image repository credential.
 */
@Fluent
public final class ImageRepositoryCredential {
    /*
     * Image repository url (e.g.: mcr.microsoft.com).
     */
    @JsonProperty(value = "imageRepositoryUrl", required = true)
    private String imageRepositoryUrl;

    /*
     * Repository user name.
     */
    @JsonProperty(value = "userName", required = true)
    private String username;

    /*
     * Repository user password.
     */
    @JsonProperty(value = "password")
    private AsymmetricEncryptedSecret password;

    /**
     * Creates an instance of ImageRepositoryCredential class.
     */
    public ImageRepositoryCredential() {
    }

    /**
     * Get the imageRepositoryUrl property: Image repository url (e.g.: mcr.microsoft.com).
     * 
     * @return the imageRepositoryUrl value.
     */
    public String imageRepositoryUrl() {
        return this.imageRepositoryUrl;
    }

    /**
     * Set the imageRepositoryUrl property: Image repository url (e.g.: mcr.microsoft.com).
     * 
     * @param imageRepositoryUrl the imageRepositoryUrl value to set.
     * @return the ImageRepositoryCredential object itself.
     */
    public ImageRepositoryCredential withImageRepositoryUrl(String imageRepositoryUrl) {
        this.imageRepositoryUrl = imageRepositoryUrl;
        return this;
    }

    /**
     * Get the username property: Repository user name.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Repository user name.
     * 
     * @param username the username value to set.
     * @return the ImageRepositoryCredential object itself.
     */
    public ImageRepositoryCredential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Repository user password.
     * 
     * @return the password value.
     */
    public AsymmetricEncryptedSecret password() {
        return this.password;
    }

    /**
     * Set the password property: Repository user password.
     * 
     * @param password the password value to set.
     * @return the ImageRepositoryCredential object itself.
     */
    public ImageRepositoryCredential withPassword(AsymmetricEncryptedSecret password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageRepositoryUrl() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property imageRepositoryUrl in model ImageRepositoryCredential"));
        }
        if (username() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property username in model ImageRepositoryCredential"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageRepositoryCredential.class);
}
