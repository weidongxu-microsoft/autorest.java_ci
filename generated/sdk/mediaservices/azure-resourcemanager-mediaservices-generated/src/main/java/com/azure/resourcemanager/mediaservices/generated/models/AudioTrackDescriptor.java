// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A TrackSelection to select audio tracks.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "@odata.type",
    defaultImpl = AudioTrackDescriptor.class,
    visible = true)
@JsonTypeName("#Microsoft.Media.AudioTrackDescriptor")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "#Microsoft.Media.SelectAudioTrackByAttribute",
        value = SelectAudioTrackByAttribute.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.SelectAudioTrackById", value = SelectAudioTrackById.class) })
@Fluent
public class AudioTrackDescriptor extends TrackDescriptor {
    /*
     * The discriminator for derived types.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Media.AudioTrackDescriptor";

    /*
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     */
    @JsonProperty(value = "channelMapping")
    private ChannelMapping channelMapping;

    /**
     * Creates an instance of AudioTrackDescriptor class.
     */
    public AudioTrackDescriptor() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the channelMapping property: Optional designation for single channel audio tracks. Can be used to combine the
     * tracks into stereo or multi-channel audio tracks.
     * 
     * @return the channelMapping value.
     */
    public ChannelMapping channelMapping() {
        return this.channelMapping;
    }

    /**
     * Set the channelMapping property: Optional designation for single channel audio tracks. Can be used to combine the
     * tracks into stereo or multi-channel audio tracks.
     * 
     * @param channelMapping the channelMapping value to set.
     * @return the AudioTrackDescriptor object itself.
     */
    public AudioTrackDescriptor withChannelMapping(ChannelMapping channelMapping) {
        this.channelMapping = channelMapping;
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
