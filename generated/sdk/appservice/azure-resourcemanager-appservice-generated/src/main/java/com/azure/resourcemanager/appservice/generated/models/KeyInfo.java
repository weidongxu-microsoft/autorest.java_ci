// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.KeyInfoInner;

/**
 * An immutable client-side representation of KeyInfo.
 */
public interface KeyInfo {
    /**
     * Gets the name property: Key name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the value property: Key value.
     * 
     * @return the value value.
     */
    String value();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.KeyInfoInner object.
     * 
     * @return the inner object.
     */
    KeyInfoInner innerModel();
}
