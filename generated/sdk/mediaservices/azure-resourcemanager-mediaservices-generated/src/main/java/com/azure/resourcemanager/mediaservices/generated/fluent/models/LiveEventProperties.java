// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.CrossSiteAccessPolicies;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventEncoding;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventInput;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventPreview;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventResourceState;
import com.azure.resourcemanager.mediaservices.generated.models.LiveEventTranscription;
import com.azure.resourcemanager.mediaservices.generated.models.StreamOptionsFlag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The live event properties.
 */
@Fluent
public final class LiveEventProperties {
    /*
     * A description for the live event.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Live event input settings. It defines how the live event receives input from a contribution encoder.
     */
    @JsonProperty(value = "input", required = true)
    private LiveEventInput input;

    /*
     * Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     */
    @JsonProperty(value = "preview")
    private LiveEventPreview preview;

    /*
     * Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     */
    @JsonProperty(value = "encoding")
    private LiveEventEncoding encoding;

    /*
     * Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     */
    @JsonProperty(value = "transcriptions")
    private List<LiveEventTranscription> transcriptions;

    /*
     * The provisioning state of the live event.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private LiveEventResourceState resourceState;

    /*
     * Live event cross site access policies.
     */
    @JsonProperty(value = "crossSiteAccessPolicies")
    private CrossSiteAccessPolicies crossSiteAccessPolicies;

    /*
     * Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state
     */
    @JsonProperty(value = "useStaticHostname")
    private Boolean useStaticHostname;

    /*
     * When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     */
    @JsonProperty(value = "hostnamePrefix")
    private String hostnamePrefix;

    /*
     * The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     */
    @JsonProperty(value = "streamOptions")
    private List<StreamOptionsFlag> streamOptions;

    /*
     * The creation time for the live event
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The last modified time of the live event.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /**
     * Creates an instance of LiveEventProperties class.
     */
    public LiveEventProperties() {
    }

    /**
     * Get the description property: A description for the live event.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the live event.
     * 
     * @param description the description value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the input property: Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     * @return the input value.
     */
    public LiveEventInput input() {
        return this.input;
    }

    /**
     * Set the input property: Live event input settings. It defines how the live event receives input from a contribution encoder.
     * 
     * @param input the input value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withInput(LiveEventInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the preview property: Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     * @return the preview value.
     */
    public LiveEventPreview preview() {
        return this.preview;
    }

    /**
     * Set the preview property: Live event preview settings. Preview allows live event producers to preview the live streaming content without creating any live output.
     * 
     * @param preview the preview value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withPreview(LiveEventPreview preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Get the encoding property: Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     * @return the encoding value.
     */
    public LiveEventEncoding encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding property: Encoding settings for the live event. It configures whether a live encoder is used for the live event and settings for the live encoder if it is used.
     * 
     * @param encoding the encoding value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withEncoding(LiveEventEncoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the transcriptions property: Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     * @return the transcriptions value.
     */
    public List<LiveEventTranscription> transcriptions() {
        return this.transcriptions;
    }

    /**
     * Set the transcriptions property: Live transcription settings for the live event. See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     * 
     * @param transcriptions the transcriptions value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withTranscriptions(List<LiveEventTranscription> transcriptions) {
        this.transcriptions = transcriptions;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the live event.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: The resource state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     * 
     * @return the resourceState value.
     */
    public LiveEventResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the crossSiteAccessPolicies property: Live event cross site access policies.
     * 
     * @return the crossSiteAccessPolicies value.
     */
    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.crossSiteAccessPolicies;
    }

    /**
     * Set the crossSiteAccessPolicies property: Live event cross site access policies.
     * 
     * @param crossSiteAccessPolicies the crossSiteAccessPolicies value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        this.crossSiteAccessPolicies = crossSiteAccessPolicies;
        return this;
    }

    /**
     * Get the useStaticHostname property: Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state.
     * 
     * @return the useStaticHostname value.
     */
    public Boolean useStaticHostname() {
        return this.useStaticHostname;
    }

    /**
     * Set the useStaticHostname property: Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. This value can only be updated if the live event is in Standby state.
     * 
     * @param useStaticHostname the useStaticHostname value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withUseStaticHostname(Boolean useStaticHostname) {
        this.useStaticHostname = useStaticHostname;
        return this;
    }

    /**
     * Get the hostnamePrefix property: When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     * @return the hostnamePrefix value.
     */
    public String hostnamePrefix() {
        return this.hostnamePrefix;
    }

    /**
     * Set the hostnamePrefix property: When useStaticHostname is set to true, the hostnamePrefix specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
     * 
     * @param hostnamePrefix the hostnamePrefix value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withHostnamePrefix(String hostnamePrefix) {
        this.hostnamePrefix = hostnamePrefix;
        return this;
    }

    /**
     * Get the streamOptions property: The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     * 
     * @return the streamOptions value.
     */
    public List<StreamOptionsFlag> streamOptions() {
        return this.streamOptions;
    }

    /**
     * Set the streamOptions property: The options to use for the LiveEvent. This value is specified at creation time and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     * 
     * @param streamOptions the streamOptions value to set.
     * @return the LiveEventProperties object itself.
     */
    public LiveEventProperties withStreamOptions(List<StreamOptionsFlag> streamOptions) {
        this.streamOptions = streamOptions;
        return this;
    }

    /**
     * Get the created property: The creation time for the live event.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The last modified time of the live event.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (input() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property input in model LiveEventProperties"));
        } else {
            input().validate();
        }
        if (preview() != null) {
            preview().validate();
        }
        if (encoding() != null) {
            encoding().validate();
        }
        if (transcriptions() != null) {
            transcriptions().forEach(e -> e.validate());
        }
        if (crossSiteAccessPolicies() != null) {
            crossSiteAccessPolicies().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LiveEventProperties.class);
}
