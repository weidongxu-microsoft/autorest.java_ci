// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.resourcemanager.mediaservices.generated.fluent.models.StreamingEndpointSkuInfoListResultInner;
import java.util.List;

/**
 * An immutable client-side representation of StreamingEndpointSkuInfoListResult.
 */
public interface StreamingEndpointSkuInfoListResult {
    /**
     * Gets the value property: The result of the List StreamingEndpoint skus.
     * 
     * @return the value value.
     */
    List<ArmStreamingEndpointSkuInfo> value();

    /**
     * Gets the inner
     * com.azure.resourcemanager.mediaservices.generated.fluent.models.StreamingEndpointSkuInfoListResultInner object.
     * 
     * @return the inner object.
     */
    StreamingEndpointSkuInfoListResultInner innerModel();
}
