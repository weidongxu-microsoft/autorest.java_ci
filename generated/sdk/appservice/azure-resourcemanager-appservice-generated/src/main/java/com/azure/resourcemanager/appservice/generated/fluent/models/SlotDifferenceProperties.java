// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SlotDifference resource specific properties. */
@Immutable
public final class SlotDifferenceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SlotDifferenceProperties.class);

    /*
     * Level of the difference: Information, Warning or Error.
     */
    @JsonProperty(value = "level", access = JsonProperty.Access.WRITE_ONLY)
    private String level;

    /*
     * The type of the setting: General, AppSetting or ConnectionString.
     */
    @JsonProperty(value = "settingType", access = JsonProperty.Access.WRITE_ONLY)
    private String settingType;

    /*
     * Rule that describes how to process the setting difference during a slot
     * swap.
     */
    @JsonProperty(value = "diffRule", access = JsonProperty.Access.WRITE_ONLY)
    private String diffRule;

    /*
     * Name of the setting.
     */
    @JsonProperty(value = "settingName", access = JsonProperty.Access.WRITE_ONLY)
    private String settingName;

    /*
     * Value of the setting in the current slot.
     */
    @JsonProperty(value = "valueInCurrentSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String valueInCurrentSlot;

    /*
     * Value of the setting in the target slot.
     */
    @JsonProperty(value = "valueInTargetSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String valueInTargetSlot;

    /*
     * Description of the setting difference.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the level property: Level of the difference: Information, Warning or Error.
     *
     * @return the level value.
     */
    public String level() {
        return this.level;
    }

    /**
     * Get the settingType property: The type of the setting: General, AppSetting or ConnectionString.
     *
     * @return the settingType value.
     */
    public String settingType() {
        return this.settingType;
    }

    /**
     * Get the diffRule property: Rule that describes how to process the setting difference during a slot swap.
     *
     * @return the diffRule value.
     */
    public String diffRule() {
        return this.diffRule;
    }

    /**
     * Get the settingName property: Name of the setting.
     *
     * @return the settingName value.
     */
    public String settingName() {
        return this.settingName;
    }

    /**
     * Get the valueInCurrentSlot property: Value of the setting in the current slot.
     *
     * @return the valueInCurrentSlot value.
     */
    public String valueInCurrentSlot() {
        return this.valueInCurrentSlot;
    }

    /**
     * Get the valueInTargetSlot property: Value of the setting in the target slot.
     *
     * @return the valueInTargetSlot value.
     */
    public String valueInTargetSlot() {
        return this.valueInTargetSlot;
    }

    /**
     * Get the description property: Description of the setting difference.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
