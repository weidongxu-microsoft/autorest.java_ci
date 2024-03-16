// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.util.List;

/**
 * Describes the properties for producing a series of PNG images from the input video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@odata.type", defaultImpl = PngImage.class, visible = true)
@JsonTypeName("#Microsoft.Media.PngImage")
@Fluent
public final class PngImage extends Image {
    /*
     * A collection of output PNG image layers to be produced by the encoder.
     */
    @JsonProperty(value = "layers")
    private List<PngLayer> layers;

    /**
     * Creates an instance of PngImage class.
     */
    public PngImage() {
        withOdataType("#Microsoft.Media.PngImage");
    }

    /**
     * Get the layers property: A collection of output PNG image layers to be produced by the encoder.
     * 
     * @return the layers value.
     */
    public List<PngLayer> layers() {
        return this.layers;
    }

    /**
     * Set the layers property: A collection of output PNG image layers to be produced by the encoder.
     * 
     * @param layers the layers value to set.
     * @return the PngImage object itself.
     */
    public PngImage withLayers(List<PngLayer> layers) {
        this.layers = layers;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngImage withStart(String start) {
        super.withStart(start);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngImage withStep(String step) {
        super.withStep(step);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngImage withRange(String range) {
        super.withRange(range);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngImage withKeyFrameInterval(Duration keyFrameInterval) {
        super.withKeyFrameInterval(keyFrameInterval);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngImage withStretchMode(StretchMode stretchMode) {
        super.withStretchMode(stretchMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngImage withSyncMode(VideoSyncMode syncMode) {
        super.withSyncMode(syncMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PngImage withLabel(String label) {
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
        if (layers() != null) {
            layers().forEach(e -> e.validate());
        }
    }
}
