// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A voice receiver.
 */
@Fluent
public final class VoiceReceiver {
    /*
     * The name of the voice receiver. Names must be unique across all receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The country code of the voice receiver.
     */
    @JsonProperty(value = "countryCode", required = true)
    private String countryCode;

    /*
     * The phone number of the voice receiver.
     */
    @JsonProperty(value = "phoneNumber", required = true)
    private String phoneNumber;

    /**
     * Creates an instance of VoiceReceiver class.
     */
    public VoiceReceiver() {
    }

    /**
     * Get the name property: The name of the voice receiver. Names must be unique across all receivers within an action
     * group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the voice receiver. Names must be unique across all receivers within an action
     * group.
     * 
     * @param name the name value to set.
     * @return the VoiceReceiver object itself.
     */
    public VoiceReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the countryCode property: The country code of the voice receiver.
     * 
     * @return the countryCode value.
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode property: The country code of the voice receiver.
     * 
     * @param countryCode the countryCode value to set.
     * @return the VoiceReceiver object itself.
     */
    public VoiceReceiver withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the phoneNumber property: The phone number of the voice receiver.
     * 
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: The phone number of the voice receiver.
     * 
     * @param phoneNumber the phoneNumber value to set.
     * @return the VoiceReceiver object itself.
     */
    public VoiceReceiver withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model VoiceReceiver"));
        }
        if (countryCode() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property countryCode in model VoiceReceiver"));
        }
        if (phoneNumber() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property phoneNumber in model VoiceReceiver"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VoiceReceiver.class);
}
