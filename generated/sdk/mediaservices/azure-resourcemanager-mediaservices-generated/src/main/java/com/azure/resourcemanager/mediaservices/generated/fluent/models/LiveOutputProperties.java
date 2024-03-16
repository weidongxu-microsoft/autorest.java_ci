// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.Hls;
import com.azure.resourcemanager.mediaservices.generated.models.LiveOutputResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/**
 * The JSON object that contains the properties required to create a live output.
 */
@Fluent
public final class LiveOutputProperties {
    /*
     * The description of the live output.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The asset that the live output will write to.
     */
    @JsonProperty(value = "assetName", required = true)
    private String assetName;

    /*
     * ISO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     */
    @JsonProperty(value = "archiveWindowLength", required = true)
    private Duration archiveWindowLength;

    /*
     * ISO 8601 time between 1 minute to the duration of archiveWindowLength to control seek-able window length during Live. The service won't use this property once LiveOutput stops. The archived VOD will have full content with original ArchiveWindowLength. For example, use PT1H30M to indicate 1 hour and 30 minutes of rewind window length. Service will use implicit default value 30m only if Live Event enables LL.
     */
    @JsonProperty(value = "rewindWindowLength")
    private Duration rewindWindowLength;

    /*
     * The manifest file name. If not provided, the service will generate one automatically.
     */
    @JsonProperty(value = "manifestName")
    private String manifestName;

    /*
     * HTTP Live Streaming (HLS) packing setting for the live output.
     */
    @JsonProperty(value = "hls")
    private Hls hls;

    /*
     * The initial timestamp that the live output will start at, any content before this value will not be archived.
     */
    @JsonProperty(value = "outputSnapTime")
    private Long outputSnapTime;

    /*
     * The creation time the live output.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The time the live output was last modified.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The provisioning state of the live output.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The resource state of the live output.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private LiveOutputResourceState resourceState;

    /**
     * Creates an instance of LiveOutputProperties class.
     */
    public LiveOutputProperties() {
    }

    /**
     * Get the description property: The description of the live output.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the live output.
     * 
     * @param description the description value to set.
     * @return the LiveOutputProperties object itself.
     */
    public LiveOutputProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the assetName property: The asset that the live output will write to.
     * 
     * @return the assetName value.
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set the assetName property: The asset that the live output will write to.
     * 
     * @param assetName the assetName value to set.
     * @return the LiveOutputProperties object itself.
     */
    public LiveOutputProperties withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * Get the archiveWindowLength property: ISO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     * 
     * @return the archiveWindowLength value.
     */
    public Duration archiveWindowLength() {
        return this.archiveWindowLength;
    }

    /**
     * Set the archiveWindowLength property: ISO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     * 
     * @param archiveWindowLength the archiveWindowLength value to set.
     * @return the LiveOutputProperties object itself.
     */
    public LiveOutputProperties withArchiveWindowLength(Duration archiveWindowLength) {
        this.archiveWindowLength = archiveWindowLength;
        return this;
    }

    /**
     * Get the rewindWindowLength property: ISO 8601 time between 1 minute to the duration of archiveWindowLength to control seek-able window length during Live. The service won't use this property once LiveOutput stops. The archived VOD will have full content with original ArchiveWindowLength. For example, use PT1H30M to indicate 1 hour and 30 minutes of rewind window length. Service will use implicit default value 30m only if Live Event enables LL.
     * 
     * @return the rewindWindowLength value.
     */
    public Duration rewindWindowLength() {
        return this.rewindWindowLength;
    }

    /**
     * Set the rewindWindowLength property: ISO 8601 time between 1 minute to the duration of archiveWindowLength to control seek-able window length during Live. The service won't use this property once LiveOutput stops. The archived VOD will have full content with original ArchiveWindowLength. For example, use PT1H30M to indicate 1 hour and 30 minutes of rewind window length. Service will use implicit default value 30m only if Live Event enables LL.
     * 
     * @param rewindWindowLength the rewindWindowLength value to set.
     * @return the LiveOutputProperties object itself.
     */
    public LiveOutputProperties withRewindWindowLength(Duration rewindWindowLength) {
        this.rewindWindowLength = rewindWindowLength;
        return this;
    }

    /**
     * Get the manifestName property: The manifest file name. If not provided, the service will generate one automatically.
     * 
     * @return the manifestName value.
     */
    public String manifestName() {
        return this.manifestName;
    }

    /**
     * Set the manifestName property: The manifest file name. If not provided, the service will generate one automatically.
     * 
     * @param manifestName the manifestName value to set.
     * @return the LiveOutputProperties object itself.
     */
    public LiveOutputProperties withManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    /**
     * Get the hls property: HTTP Live Streaming (HLS) packing setting for the live output.
     * 
     * @return the hls value.
     */
    public Hls hls() {
        return this.hls;
    }

    /**
     * Set the hls property: HTTP Live Streaming (HLS) packing setting for the live output.
     * 
     * @param hls the hls value to set.
     * @return the LiveOutputProperties object itself.
     */
    public LiveOutputProperties withHls(Hls hls) {
        this.hls = hls;
        return this;
    }

    /**
     * Get the outputSnapTime property: The initial timestamp that the live output will start at, any content before this value will not be archived.
     * 
     * @return the outputSnapTime value.
     */
    public Long outputSnapTime() {
        return this.outputSnapTime;
    }

    /**
     * Set the outputSnapTime property: The initial timestamp that the live output will start at, any content before this value will not be archived.
     * 
     * @param outputSnapTime the outputSnapTime value to set.
     * @return the LiveOutputProperties object itself.
     */
    public LiveOutputProperties withOutputSnapTime(Long outputSnapTime) {
        this.outputSnapTime = outputSnapTime;
        return this;
    }

    /**
     * Get the created property: The creation time the live output.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The time the live output was last modified.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the provisioningState property: The provisioning state of the live output.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: The resource state of the live output.
     * 
     * @return the resourceState value.
     */
    public LiveOutputResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (assetName() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property assetName in model LiveOutputProperties"));
        }
        if (archiveWindowLength() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property archiveWindowLength in model LiveOutputProperties"));
        }
        if (hls() != null) {
            hls().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LiveOutputProperties.class);
}
