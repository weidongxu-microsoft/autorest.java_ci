// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import java.util.Map;

/** An azure resource object. */
@Fluent
public class QueryPacksResource extends Resource {
    /** {@inheritDoc} */
    @Override
    public QueryPacksResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QueryPacksResource withTags(Map<String, String> tags) {
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
