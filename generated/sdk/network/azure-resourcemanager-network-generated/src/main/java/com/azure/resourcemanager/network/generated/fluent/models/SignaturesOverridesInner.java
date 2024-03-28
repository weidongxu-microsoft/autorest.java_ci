// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.network.generated.models.SignaturesOverridesProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains all specific policy signatures overrides for the IDPS.
 */
@Fluent
public final class SignaturesOverridesInner extends ProxyResource {
    /*
     * Contains the name of the resource (default)
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Will contain the resource id of the signature override resource
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Will contain the type of the resource: Microsoft.Network/firewallPolicies/intrusionDetectionSignaturesOverrides
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Will contain the properties of the resource (the actual signature overrides)
     */
    @JsonProperty(value = "properties")
    private SignaturesOverridesProperties properties;

    /**
     * Creates an instance of SignaturesOverridesInner class.
     */
    public SignaturesOverridesInner() {
    }

    /**
     * Get the name property: Contains the name of the resource (default).
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Contains the name of the resource (default).
     * 
     * @param name the name value to set.
     * @return the SignaturesOverridesInner object itself.
     */
    public SignaturesOverridesInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: Will contain the resource id of the signature override resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Will contain the resource id of the signature override resource.
     * 
     * @param id the id value to set.
     * @return the SignaturesOverridesInner object itself.
     */
    public SignaturesOverridesInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Will contain the type of the resource:
     * Microsoft.Network/firewallPolicies/intrusionDetectionSignaturesOverrides.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Will contain the type of the resource:
     * Microsoft.Network/firewallPolicies/intrusionDetectionSignaturesOverrides.
     * 
     * @param type the type value to set.
     * @return the SignaturesOverridesInner object itself.
     */
    public SignaturesOverridesInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: Will contain the properties of the resource (the actual signature overrides).
     * 
     * @return the properties value.
     */
    public SignaturesOverridesProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Will contain the properties of the resource (the actual signature overrides).
     * 
     * @param properties the properties value to set.
     * @return the SignaturesOverridesInner object itself.
     */
    public SignaturesOverridesInner withProperties(SignaturesOverridesProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
