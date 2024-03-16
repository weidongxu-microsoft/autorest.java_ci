// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A codec flag, which tells the encoder to copy the input audio bitstream.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@odata.type", defaultImpl = CopyAudio.class, visible = true)
@JsonTypeName("#Microsoft.Media.CopyAudio")
@Fluent
public final class CopyAudio extends Codec {
    /**
     * Creates an instance of CopyAudio class.
     */
    public CopyAudio() {
        withOdataType("#Microsoft.Media.CopyAudio");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyAudio withLabel(String label) {
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
