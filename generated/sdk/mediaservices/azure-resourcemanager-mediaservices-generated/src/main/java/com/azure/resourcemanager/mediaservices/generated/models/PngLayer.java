// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the settings to produce a PNG image from the input video. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.PngLayer")
@Fluent
public final class PngLayer extends Layer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PngLayer.class);

    /** {@inheritDoc} */
    @Override
    public PngLayer withWidth(String width) {
        super.withWidth(width);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PngLayer withHeight(String height) {
        super.withHeight(height);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PngLayer withLabel(String label) {
        super.withLabel(label);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
