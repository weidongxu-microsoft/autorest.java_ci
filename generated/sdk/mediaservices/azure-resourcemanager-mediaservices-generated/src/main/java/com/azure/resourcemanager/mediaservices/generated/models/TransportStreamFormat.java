// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes the properties for generating an MPEG-2 Transport Stream (ISO/IEC 13818-1) output video file(s).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.TransportStreamFormat")
@Fluent
public final class TransportStreamFormat extends MultiBitrateFormat {
    /**
     * Creates an instance of TransportStreamFormat class.
     */
    public TransportStreamFormat() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransportStreamFormat withOutputFiles(List<OutputFile> outputFiles) {
        super.withOutputFiles(outputFiles);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransportStreamFormat withFilenamePattern(String filenamePattern) {
        super.withFilenamePattern(filenamePattern);
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
