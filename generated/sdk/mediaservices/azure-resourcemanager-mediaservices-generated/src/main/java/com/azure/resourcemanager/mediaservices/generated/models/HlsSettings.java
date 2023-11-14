// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The HLS setting for a track.
 */
@Fluent
public final class HlsSettings {
    /*
     * The default for the HLS setting.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /*
     * The forced for the HLS setting.
     */
    @JsonProperty(value = "forced")
    private Boolean forced;

    /*
     * The characteristics for the HLS setting.
     */
    @JsonProperty(value = "characteristics")
    private String characteristics;

    /**
     * Creates an instance of HlsSettings class.
     */
    public HlsSettings() {
    }

    /**
     * Get the defaultProperty property: The default for the HLS setting.
     * 
     * @return the defaultProperty value.
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The default for the HLS setting.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the HlsSettings object itself.
     */
    public HlsSettings withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the forced property: The forced for the HLS setting.
     * 
     * @return the forced value.
     */
    public Boolean forced() {
        return this.forced;
    }

    /**
     * Set the forced property: The forced for the HLS setting.
     * 
     * @param forced the forced value to set.
     * @return the HlsSettings object itself.
     */
    public HlsSettings withForced(Boolean forced) {
        this.forced = forced;
        return this;
    }

    /**
     * Get the characteristics property: The characteristics for the HLS setting.
     * 
     * @return the characteristics value.
     */
    public String characteristics() {
        return this.characteristics;
    }

    /**
     * Set the characteristics property: The characteristics for the HLS setting.
     * 
     * @param characteristics the characteristics value to set.
     * @return the HlsSettings object itself.
     */
    public HlsSettings withCharacteristics(String characteristics) {
        this.characteristics = characteristics;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
