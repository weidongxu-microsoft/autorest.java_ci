// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import java.util.Map;

/** An azure resource object. */
@Fluent
public class WorkbookResource extends Resource {
    /** Creates an instance of WorkbookResource class. */
    public WorkbookResource() {
    }

    /** {@inheritDoc} */
    @Override
    public WorkbookResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkbookResource withTags(Map<String, String> tags) {
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
