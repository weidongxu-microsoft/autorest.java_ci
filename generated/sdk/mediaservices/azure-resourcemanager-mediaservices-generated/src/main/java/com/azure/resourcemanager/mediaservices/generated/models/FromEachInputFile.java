// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * An InputDefinition that looks at each input file provided to select tracks specified by the IncludedTracks property. Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to select tracks from each file given.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "@odata.type",
    defaultImpl = FromEachInputFile.class,
    visible = true)
@JsonTypeName("#Microsoft.Media.FromEachInputFile")
@Fluent
public final class FromEachInputFile extends InputDefinition {
    /**
     * Creates an instance of FromEachInputFile class.
     */
    public FromEachInputFile() {
        withOdataType("#Microsoft.Media.FromEachInputFile");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FromEachInputFile withIncludedTracks(List<TrackDescriptor> includedTracks) {
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
