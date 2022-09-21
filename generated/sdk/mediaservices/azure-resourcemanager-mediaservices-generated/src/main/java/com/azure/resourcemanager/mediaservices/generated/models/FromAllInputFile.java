// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * An InputDefinition that looks across all of the files provided to select tracks specified by the IncludedTracks
 * property. Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to allow selection of a single
 * track across a set of input files.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.FromAllInputFile")
@Fluent
public final class FromAllInputFile extends InputDefinition {
    /** Creates an instance of FromAllInputFile class. */
    public FromAllInputFile() {
    }

    /** {@inheritDoc} */
    @Override
    public FromAllInputFile withIncludedTracks(List<TrackDescriptor> includedTracks) {
        super.withIncludedTracks(includedTracks);
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
