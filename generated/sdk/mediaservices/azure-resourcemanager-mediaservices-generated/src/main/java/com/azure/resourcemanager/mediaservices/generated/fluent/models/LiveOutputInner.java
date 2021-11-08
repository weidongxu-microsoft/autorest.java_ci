// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.Hls;
import com.azure.resourcemanager.mediaservices.generated.models.LiveOutputResourceState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** The Live Output. */
@Fluent
public final class LiveOutputInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LiveOutputInner.class);

    /*
     * Live output properties.
     */
    @JsonProperty(value = "properties")
    private LiveOutputProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Live output properties.
     *
     * @return the innerProperties value.
     */
    private LiveOutputProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: The description of the live output.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the live output.
     *
     * @param description the description value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveOutputProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the assetName property: The asset that the live output will write to.
     *
     * @return the assetName value.
     */
    public String assetName() {
        return this.innerProperties() == null ? null : this.innerProperties().assetName();
    }

    /**
     * Set the assetName property: The asset that the live output will write to.
     *
     * @param assetName the assetName value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withAssetName(String assetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveOutputProperties();
        }
        this.innerProperties().withAssetName(assetName);
        return this;
    }

    /**
     * Get the archiveWindowLength property: ISO 8601 time between 1 minute to 25 hours to indicate the maximum content
     * length that can be archived in the asset for this live output. This also sets the maximum content length for the
     * rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     *
     * @return the archiveWindowLength value.
     */
    public Duration archiveWindowLength() {
        return this.innerProperties() == null ? null : this.innerProperties().archiveWindowLength();
    }

    /**
     * Set the archiveWindowLength property: ISO 8601 time between 1 minute to 25 hours to indicate the maximum content
     * length that can be archived in the asset for this live output. This also sets the maximum content length for the
     * rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     *
     * @param archiveWindowLength the archiveWindowLength value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withArchiveWindowLength(Duration archiveWindowLength) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveOutputProperties();
        }
        this.innerProperties().withArchiveWindowLength(archiveWindowLength);
        return this;
    }

    /**
     * Get the manifestName property: The manifest file name. If not provided, the service will generate one
     * automatically.
     *
     * @return the manifestName value.
     */
    public String manifestName() {
        return this.innerProperties() == null ? null : this.innerProperties().manifestName();
    }

    /**
     * Set the manifestName property: The manifest file name. If not provided, the service will generate one
     * automatically.
     *
     * @param manifestName the manifestName value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withManifestName(String manifestName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveOutputProperties();
        }
        this.innerProperties().withManifestName(manifestName);
        return this;
    }

    /**
     * Get the hls property: HTTP Live Streaming (HLS) packing setting for the live output.
     *
     * @return the hls value.
     */
    public Hls hls() {
        return this.innerProperties() == null ? null : this.innerProperties().hls();
    }

    /**
     * Set the hls property: HTTP Live Streaming (HLS) packing setting for the live output.
     *
     * @param hls the hls value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withHls(Hls hls) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveOutputProperties();
        }
        this.innerProperties().withHls(hls);
        return this;
    }

    /**
     * Get the outputSnapTime property: The initial timestamp that the live output will start at, any content before
     * this value will not be archived.
     *
     * @return the outputSnapTime value.
     */
    public Long outputSnapTime() {
        return this.innerProperties() == null ? null : this.innerProperties().outputSnapTime();
    }

    /**
     * Set the outputSnapTime property: The initial timestamp that the live output will start at, any content before
     * this value will not be archived.
     *
     * @param outputSnapTime the outputSnapTime value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withOutputSnapTime(Long outputSnapTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveOutputProperties();
        }
        this.innerProperties().withOutputSnapTime(outputSnapTime);
        return this;
    }

    /**
     * Get the created property: The creation time the live output.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the lastModified property: The time the live output was last modified.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModified();
    }

    /**
     * Get the provisioningState property: The provisioning state of the live output.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceState property: The resource state of the live output.
     *
     * @return the resourceState value.
     */
    public LiveOutputResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
