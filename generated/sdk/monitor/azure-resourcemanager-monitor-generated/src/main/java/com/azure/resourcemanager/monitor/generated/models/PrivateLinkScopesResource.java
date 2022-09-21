// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import java.util.Map;

/** An azure resource object. */
@Fluent
public class PrivateLinkScopesResource extends Resource {
    /** Creates an instance of PrivateLinkScopesResource class. */
    public PrivateLinkScopesResource() {
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkScopesResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateLinkScopesResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
