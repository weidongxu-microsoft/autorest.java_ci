// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.TriggeredJobRun;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Triggered Web Job History. List of Triggered Web Job Run Information elements. */
@Fluent
public final class TriggeredJobHistoryInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggeredJobHistoryInner.class);

    /*
     * TriggeredJobHistory resource specific properties
     */
    @JsonProperty(value = "properties")
    private TriggeredJobHistoryProperties innerProperties;

    /**
     * Get the innerProperties property: TriggeredJobHistory resource specific properties.
     *
     * @return the innerProperties value.
     */
    private TriggeredJobHistoryProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public TriggeredJobHistoryInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the runs property: List of triggered web job runs.
     *
     * @return the runs value.
     */
    public List<TriggeredJobRun> runs() {
        return this.innerProperties() == null ? null : this.innerProperties().runs();
    }

    /**
     * Set the runs property: List of triggered web job runs.
     *
     * @param runs the runs value to set.
     * @return the TriggeredJobHistoryInner object itself.
     */
    public TriggeredJobHistoryInner withRuns(List<TriggeredJobRun> runs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredJobHistoryProperties();
        }
        this.innerProperties().withRuns(runs);
        return this;
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
