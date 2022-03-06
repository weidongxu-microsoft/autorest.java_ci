// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a storage account’s Queue service. */
@Fluent
public final class QueueServicePropertiesProperties {
    /*
     * Specifies CORS rules for the Queue service. You can include up to five
     * CorsRule elements in the request. If no CorsRule elements are included
     * in the request body, all CORS rules will be deleted, and CORS will be
     * disabled for the Queue service.
     */
    @JsonProperty(value = "cors")
    private CorsRules cors;

    /**
     * Get the cors property: Specifies CORS rules for the Queue service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Queue service.
     *
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Specifies CORS rules for the Queue service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Queue service.
     *
     * @param cors the cors value to set.
     * @return the QueueServicePropertiesProperties object itself.
     */
    public QueueServicePropertiesProperties withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cors() != null) {
            cors().validate();
        }
    }
}
