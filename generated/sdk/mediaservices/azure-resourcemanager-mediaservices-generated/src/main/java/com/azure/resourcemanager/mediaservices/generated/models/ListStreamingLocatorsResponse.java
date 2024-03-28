// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.ListStreamingLocatorsResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of ListStreamingLocatorsResponse.
 */
public interface ListStreamingLocatorsResponse {
    /**
     * Gets the streamingLocators property: The list of Streaming Locators.
     * 
     * @return the streamingLocators value.
     */
    List<AssetStreamingLocator> streamingLocators();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.generated.fluent.models.ListStreamingLocatorsResponseInner
     * object.
     * 
     * @return the inner object.
     */
    ListStreamingLocatorsResponseInner innerModel();
}
