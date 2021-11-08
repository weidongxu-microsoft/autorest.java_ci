// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingLocatorContentKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** A Streaming Locator resource. */
@Fluent
public final class StreamingLocatorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingLocatorInner.class);

    /*
     * Properties of the Streaming Locator.
     */
    @JsonProperty(value = "properties")
    private StreamingLocatorProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Properties of the Streaming Locator.
     *
     * @return the innerProperties value.
     */
    private StreamingLocatorProperties innerProperties() {
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
     * Get the assetName property: Asset Name.
     *
     * @return the assetName value.
     */
    public String assetName() {
        return this.innerProperties() == null ? null : this.innerProperties().assetName();
    }

    /**
     * Set the assetName property: Asset Name.
     *
     * @param assetName the assetName value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withAssetName(String assetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withAssetName(assetName);
        return this;
    }

    /**
     * Get the created property: The creation time of the Streaming Locator.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the startTime property: The start time of the Streaming Locator.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: The start time of the Streaming Locator.
     *
     * @param startTime the startTime value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: The end time of the Streaming Locator.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: The end time of the Streaming Locator.
     *
     * @param endTime the endTime value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the streamingLocatorId property: The StreamingLocatorId of the Streaming Locator.
     *
     * @return the streamingLocatorId value.
     */
    public UUID streamingLocatorId() {
        return this.innerProperties() == null ? null : this.innerProperties().streamingLocatorId();
    }

    /**
     * Set the streamingLocatorId property: The StreamingLocatorId of the Streaming Locator.
     *
     * @param streamingLocatorId the streamingLocatorId value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStreamingLocatorId(UUID streamingLocatorId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withStreamingLocatorId(streamingLocatorId);
        return this;
    }

    /**
     * Get the streamingPolicyName property: Name of the Streaming Policy used by this Streaming Locator. Either specify
     * the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined
     * Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly',
     * 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and
     * 'Predefined_MultiDrmStreaming'.
     *
     * @return the streamingPolicyName value.
     */
    public String streamingPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().streamingPolicyName();
    }

    /**
     * Set the streamingPolicyName property: Name of the Streaming Policy used by this Streaming Locator. Either specify
     * the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined
     * Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly',
     * 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and
     * 'Predefined_MultiDrmStreaming'.
     *
     * @param streamingPolicyName the streamingPolicyName value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStreamingPolicyName(String streamingPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withStreamingPolicyName(streamingPolicyName);
        return this;
    }

    /**
     * Get the defaultContentKeyPolicyName property: Name of the default ContentKeyPolicy used by this Streaming
     * Locator.
     *
     * @return the defaultContentKeyPolicyName value.
     */
    public String defaultContentKeyPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultContentKeyPolicyName();
    }

    /**
     * Set the defaultContentKeyPolicyName property: Name of the default ContentKeyPolicy used by this Streaming
     * Locator.
     *
     * @param defaultContentKeyPolicyName the defaultContentKeyPolicyName value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withDefaultContentKeyPolicyName(defaultContentKeyPolicyName);
        return this;
    }

    /**
     * Get the contentKeys property: The ContentKeys used by this Streaming Locator.
     *
     * @return the contentKeys value.
     */
    public List<StreamingLocatorContentKey> contentKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().contentKeys();
    }

    /**
     * Set the contentKeys property: The ContentKeys used by this Streaming Locator.
     *
     * @param contentKeys the contentKeys value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withContentKeys(List<StreamingLocatorContentKey> contentKeys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withContentKeys(contentKeys);
        return this;
    }

    /**
     * Get the alternativeMediaId property: Alternative Media ID of this Streaming Locator.
     *
     * @return the alternativeMediaId value.
     */
    public String alternativeMediaId() {
        return this.innerProperties() == null ? null : this.innerProperties().alternativeMediaId();
    }

    /**
     * Set the alternativeMediaId property: Alternative Media ID of this Streaming Locator.
     *
     * @param alternativeMediaId the alternativeMediaId value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withAlternativeMediaId(String alternativeMediaId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withAlternativeMediaId(alternativeMediaId);
        return this;
    }

    /**
     * Get the filters property: A list of asset or account filters which apply to this streaming locator.
     *
     * @return the filters value.
     */
    public List<String> filters() {
        return this.innerProperties() == null ? null : this.innerProperties().filters();
    }

    /**
     * Set the filters property: A list of asset or account filters which apply to this streaming locator.
     *
     * @param filters the filters value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withFilters(List<String> filters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StreamingLocatorProperties();
        }
        this.innerProperties().withFilters(filters);
        return this;
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
