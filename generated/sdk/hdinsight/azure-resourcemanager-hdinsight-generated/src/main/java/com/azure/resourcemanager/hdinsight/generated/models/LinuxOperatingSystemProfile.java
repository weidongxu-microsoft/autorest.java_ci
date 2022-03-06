// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ssh username, password, and ssh public key. */
@Fluent
public final class LinuxOperatingSystemProfile {
    /*
     * The username.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * The password.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * The SSH profile.
     */
    @JsonProperty(value = "sshProfile")
    private SshProfile sshProfile;

    /**
     * Get the username property: The username.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username.
     *
     * @param username the username value to set.
     * @return the LinuxOperatingSystemProfile object itself.
     */
    public LinuxOperatingSystemProfile withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password.
     *
     * @param password the password value to set.
     * @return the LinuxOperatingSystemProfile object itself.
     */
    public LinuxOperatingSystemProfile withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the sshProfile property: The SSH profile.
     *
     * @return the sshProfile value.
     */
    public SshProfile sshProfile() {
        return this.sshProfile;
    }

    /**
     * Set the sshProfile property: The SSH profile.
     *
     * @param sshProfile the sshProfile value to set.
     * @return the LinuxOperatingSystemProfile object itself.
     */
    public LinuxOperatingSystemProfile withSshProfile(SshProfile sshProfile) {
        this.sshProfile = sshProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sshProfile() != null) {
            sshProfile().validate();
        }
    }
}
