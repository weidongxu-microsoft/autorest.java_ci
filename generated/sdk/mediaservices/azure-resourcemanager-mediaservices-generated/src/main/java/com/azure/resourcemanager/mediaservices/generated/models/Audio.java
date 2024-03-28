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
 * Defines the common properties for all audio codecs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@odata.type", defaultImpl = Audio.class, visible = true)
@JsonTypeName("#Microsoft.Media.Audio")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AacAudio", value = AacAudio.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.DDAudio", value = DDAudio.class) })
@Fluent
public class Audio extends Codec {
    /*
     * The discriminator for derived types.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Media.Audio";

    /*
     * The number of channels in the audio.
     */
    @JsonProperty(value = "channels")
    private Integer channels;

    /*
     * The sampling rate to use for encoding in hertz.
     */
    @JsonProperty(value = "samplingRate")
    private Integer samplingRate;

    /*
     * The bitrate, in bits per second, of the output encoded audio.
     */
    @JsonProperty(value = "bitrate")
    private Integer bitrate;

    /**
     * Creates an instance of Audio class.
     */
    public Audio() {
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
     * Get the channels property: The number of channels in the audio.
     * 
     * @return the channels value.
     */
    public Integer channels() {
        return this.channels;
    }

    /**
     * Set the channels property: The number of channels in the audio.
     * 
     * @param channels the channels value to set.
     * @return the Audio object itself.
     */
    public Audio withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the samplingRate property: The sampling rate to use for encoding in hertz.
     * 
     * @return the samplingRate value.
     */
    public Integer samplingRate() {
        return this.samplingRate;
    }

    /**
     * Set the samplingRate property: The sampling rate to use for encoding in hertz.
     * 
     * @param samplingRate the samplingRate value to set.
     * @return the Audio object itself.
     */
    public Audio withSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }

    /**
     * Get the bitrate property: The bitrate, in bits per second, of the output encoded audio.
     * 
     * @return the bitrate value.
     */
    public Integer bitrate() {
        return this.bitrate;
    }

    /**
     * Set the bitrate property: The bitrate, in bits per second, of the output encoded audio.
     * 
     * @param bitrate the bitrate value to set.
     * @return the Audio object itself.
     */
    public Audio withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Audio withLabel(String label) {
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
