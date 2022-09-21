// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Preview for the Static Site Workflow to be generated. */
@Fluent
public final class StaticSitesWorkflowPreviewInner extends ProxyOnlyResource {
    /*
     * StaticSitesWorkflowPreview resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSitesWorkflowPreviewProperties innerProperties;

    /** Creates an instance of StaticSitesWorkflowPreviewInner class. */
    public StaticSitesWorkflowPreviewInner() {
    }

    /**
     * Get the innerProperties property: StaticSitesWorkflowPreview resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StaticSitesWorkflowPreviewProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSitesWorkflowPreviewInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the path property: The path for the workflow file to be generated.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Get the contents property: The contents for the workflow file to be generated.
     *
     * @return the contents value.
     */
    public String contents() {
        return this.innerProperties() == null ? null : this.innerProperties().contents();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
