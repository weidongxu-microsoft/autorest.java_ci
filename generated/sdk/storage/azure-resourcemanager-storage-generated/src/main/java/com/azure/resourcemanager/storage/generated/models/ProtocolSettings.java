// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Protocol settings for file service. */
@Fluent
public final class ProtocolSettings {
    /*
     * Setting for SMB protocol
     */
    @JsonProperty(value = "smb")
    private SmbSetting smb;

    /** Creates an instance of ProtocolSettings class. */
    public ProtocolSettings() {
    }

    /**
     * Get the smb property: Setting for SMB protocol.
     *
     * @return the smb value.
     */
    public SmbSetting smb() {
        return this.smb;
    }

    /**
     * Set the smb property: Setting for SMB protocol.
     *
     * @param smb the smb value to set.
     * @return the ProtocolSettings object itself.
     */
    public ProtocolSettings withSmb(SmbSetting smb) {
        this.smb = smb;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (smb() != null) {
            smb().validate();
        }
    }
}
