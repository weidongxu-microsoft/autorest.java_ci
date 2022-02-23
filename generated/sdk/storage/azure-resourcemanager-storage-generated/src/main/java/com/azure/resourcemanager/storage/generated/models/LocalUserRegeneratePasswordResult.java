// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.resourcemanager.storage.generated.fluent.models.LocalUserRegeneratePasswordResultInner;

/** An immutable client-side representation of LocalUserRegeneratePasswordResult. */
public interface LocalUserRegeneratePasswordResult {
    /**
     * Gets the sshPassword property: Auto generated password by the server for SSH authentication if hasSshPassword is
     * set to true on the creation of local user.
     *
     * @return the sshPassword value.
     */
    String sshPassword();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.LocalUserRegeneratePasswordResultInner
     * object.
     *
     * @return the inner object.
     */
    LocalUserRegeneratePasswordResultInner innerModel();
}
