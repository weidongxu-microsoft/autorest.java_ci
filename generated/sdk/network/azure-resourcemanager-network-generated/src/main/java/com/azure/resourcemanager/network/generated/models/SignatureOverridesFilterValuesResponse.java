// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.SignatureOverridesFilterValuesResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of SignatureOverridesFilterValuesResponse.
 */
public interface SignatureOverridesFilterValuesResponse {
    /**
     * Gets the filterValues property: Describes the possible values.
     * 
     * @return the filterValues value.
     */
    List<String> filterValues();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.SignatureOverridesFilterValuesResponseInner object.
     * 
     * @return the inner object.
     */
    SignatureOverridesFilterValuesResponseInner innerModel();
}
