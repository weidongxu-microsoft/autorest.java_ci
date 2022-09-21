// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IoT edge agent details is optional, this will be used for download system Agent module while bootstrapping IoT Role
 * if specified.
 */
@Fluent
public final class IoTEdgeAgentInfo {
    /*
     * Name of the IoT edge agent image.
     */
    @JsonProperty(value = "imageName", required = true)
    private String imageName;

    /*
     * Image Tag.
     */
    @JsonProperty(value = "tag", required = true)
    private String tag;

    /*
     * Image repository details.
     */
    @JsonProperty(value = "imageRepository")
    private ImageRepositoryCredential imageRepository;

    /** Creates an instance of IoTEdgeAgentInfo class. */
    public IoTEdgeAgentInfo() {
    }

    /**
     * Get the imageName property: Name of the IoT edge agent image.
     *
     * @return the imageName value.
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set the imageName property: Name of the IoT edge agent image.
     *
     * @param imageName the imageName value to set.
     * @return the IoTEdgeAgentInfo object itself.
     */
    public IoTEdgeAgentInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get the tag property: Image Tag.
     *
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: Image Tag.
     *
     * @param tag the tag value to set.
     * @return the IoTEdgeAgentInfo object itself.
     */
    public IoTEdgeAgentInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the imageRepository property: Image repository details.
     *
     * @return the imageRepository value.
     */
    public ImageRepositoryCredential imageRepository() {
        return this.imageRepository;
    }

    /**
     * Set the imageRepository property: Image repository details.
     *
     * @param imageRepository the imageRepository value to set.
     * @return the IoTEdgeAgentInfo object itself.
     */
    public IoTEdgeAgentInfo withImageRepository(ImageRepositoryCredential imageRepository) {
        this.imageRepository = imageRepository;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property imageName in model IoTEdgeAgentInfo"));
        }
        if (tag() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tag in model IoTEdgeAgentInfo"));
        }
        if (imageRepository() != null) {
            imageRepository().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IoTEdgeAgentInfo.class);
}
