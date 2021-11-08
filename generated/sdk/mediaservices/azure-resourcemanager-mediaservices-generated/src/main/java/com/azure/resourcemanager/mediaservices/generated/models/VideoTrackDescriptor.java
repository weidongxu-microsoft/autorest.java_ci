// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A TrackSelection to select video tracks. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = VideoTrackDescriptor.class)
@JsonTypeName("#Microsoft.Media.VideoTrackDescriptor")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.SelectVideoTrackByAttribute",
        value = SelectVideoTrackByAttribute.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.SelectVideoTrackById", value = SelectVideoTrackById.class)
})
@Immutable
public class VideoTrackDescriptor extends TrackDescriptor {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoTrackDescriptor.class);

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
