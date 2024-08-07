// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.resourcemanager.mysql.generated.fluent.models.GetPrivateDnsZoneSuffixResponseInner;

/**
 * An immutable client-side representation of GetPrivateDnsZoneSuffixResponse.
 */
public interface GetPrivateDnsZoneSuffixResponse {
    /**
     * Gets the privateDnsZoneSuffix property: Represents the private DNS zone suffix.
     * 
     * @return the privateDnsZoneSuffix value.
     */
    String privateDnsZoneSuffix();

    /**
     * Gets the inner com.azure.resourcemanager.mysql.generated.fluent.models.GetPrivateDnsZoneSuffixResponseInner
     * object.
     * 
     * @return the inner object.
     */
    GetPrivateDnsZoneSuffixResponseInner innerModel();
}
