// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentApiKeyInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the list of API Keys of an Application Insights Component. */
@Fluent
public final class ApplicationInsightsComponentApiKeyListResult {
    /*
     * List of API Key definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<ApplicationInsightsComponentApiKeyInner> value;

    /** Creates an instance of ApplicationInsightsComponentApiKeyListResult class. */
    public ApplicationInsightsComponentApiKeyListResult() {
    }

    /**
     * Get the value property: List of API Key definitions.
     *
     * @return the value value.
     */
    public List<ApplicationInsightsComponentApiKeyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of API Key definitions.
     *
     * @param value the value value to set.
     * @return the ApplicationInsightsComponentApiKeyListResult object itself.
     */
    public ApplicationInsightsComponentApiKeyListResult withValue(List<ApplicationInsightsComponentApiKeyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ApplicationInsightsComponentApiKeyListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationInsightsComponentApiKeyListResult.class);
}
