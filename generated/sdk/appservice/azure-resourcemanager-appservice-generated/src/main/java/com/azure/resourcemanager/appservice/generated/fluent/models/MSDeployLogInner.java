// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.MSDeployLogEntry;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** MSDeploy log. */
@Fluent
public final class MSDeployLogInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MSDeployLogInner.class);

    /*
     * MSDeployLog resource specific properties
     */
    @JsonProperty(value = "properties")
    private MSDeployLogProperties innerProperties;

    /**
     * Get the innerProperties property: MSDeployLog resource specific properties.
     *
     * @return the innerProperties value.
     */
    private MSDeployLogProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MSDeployLogInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the entries property: List of log entry messages.
     *
     * @return the entries value.
     */
    public List<MSDeployLogEntry> entries() {
        return this.innerProperties() == null ? null : this.innerProperties().entries();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
