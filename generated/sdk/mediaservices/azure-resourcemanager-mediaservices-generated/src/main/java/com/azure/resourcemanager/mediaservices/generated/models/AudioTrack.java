// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents an audio track in the asset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@odata.type", defaultImpl = AudioTrack.class, visible = true)
@JsonTypeName("#Microsoft.Media.AudioTrack")
@Fluent
public final class AudioTrack extends TrackBase {
    /*
     * The file name to the source file. This file is located in the storage container of the asset.
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * The display name of the audio track on a video player. In HLS, this maps to the NAME attribute of EXT-X-MEDIA.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The RFC5646 language code for the audio track.
     */
    @JsonProperty(value = "languageCode")
    private String languageCode;

    /*
     * The HLS specific setting for the audio track.
     */
    @JsonProperty(value = "hlsSettings")
    private HlsSettings hlsSettings;

    /*
     * The DASH specific setting for the audio track.
     */
    @JsonProperty(value = "dashSettings")
    private DashSettings dashSettings;

    /*
     * The MPEG-4 audio track ID for the audio track.
     */
    @JsonProperty(value = "mpeg4TrackId")
    private Integer mpeg4TrackId;

    /*
     * The stream bit rate for the audio track.
     */
    @JsonProperty(value = "bitRate", access = JsonProperty.Access.WRITE_ONLY)
    private Integer bitRate;

    /**
     * Creates an instance of AudioTrack class.
     */
    public AudioTrack() {
        withOdataType("#Microsoft.Media.AudioTrack");
    }

    /**
     * Get the fileName property: The file name to the source file. This file is located in the storage container of the asset.
     * 
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The file name to the source file. This file is located in the storage container of the asset.
     * 
     * @param fileName the fileName value to set.
     * @return the AudioTrack object itself.
     */
    public AudioTrack withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the displayName property: The display name of the audio track on a video player. In HLS, this maps to the NAME attribute of EXT-X-MEDIA.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the audio track on a video player. In HLS, this maps to the NAME attribute of EXT-X-MEDIA.
     * 
     * @param displayName the displayName value to set.
     * @return the AudioTrack object itself.
     */
    public AudioTrack withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the languageCode property: The RFC5646 language code for the audio track.
     * 
     * @return the languageCode value.
     */
    public String languageCode() {
        return this.languageCode;
    }

    /**
     * Set the languageCode property: The RFC5646 language code for the audio track.
     * 
     * @param languageCode the languageCode value to set.
     * @return the AudioTrack object itself.
     */
    public AudioTrack withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Get the hlsSettings property: The HLS specific setting for the audio track.
     * 
     * @return the hlsSettings value.
     */
    public HlsSettings hlsSettings() {
        return this.hlsSettings;
    }

    /**
     * Set the hlsSettings property: The HLS specific setting for the audio track.
     * 
     * @param hlsSettings the hlsSettings value to set.
     * @return the AudioTrack object itself.
     */
    public AudioTrack withHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
        return this;
    }

    /**
     * Get the dashSettings property: The DASH specific setting for the audio track.
     * 
     * @return the dashSettings value.
     */
    public DashSettings dashSettings() {
        return this.dashSettings;
    }

    /**
     * Set the dashSettings property: The DASH specific setting for the audio track.
     * 
     * @param dashSettings the dashSettings value to set.
     * @return the AudioTrack object itself.
     */
    public AudioTrack withDashSettings(DashSettings dashSettings) {
        this.dashSettings = dashSettings;
        return this;
    }

    /**
     * Get the mpeg4TrackId property: The MPEG-4 audio track ID for the audio track.
     * 
     * @return the mpeg4TrackId value.
     */
    public Integer mpeg4TrackId() {
        return this.mpeg4TrackId;
    }

    /**
     * Set the mpeg4TrackId property: The MPEG-4 audio track ID for the audio track.
     * 
     * @param mpeg4TrackId the mpeg4TrackId value to set.
     * @return the AudioTrack object itself.
     */
    public AudioTrack withMpeg4TrackId(Integer mpeg4TrackId) {
        this.mpeg4TrackId = mpeg4TrackId;
        return this;
    }

    /**
     * Get the bitRate property: The stream bit rate for the audio track.
     * 
     * @return the bitRate value.
     */
    public Integer bitRate() {
        return this.bitRate;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (hlsSettings() != null) {
            hlsSettings().validate();
        }
        if (dashSettings() != null) {
            dashSettings().validate();
        }
    }
}
