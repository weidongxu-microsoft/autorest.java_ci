// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActionGroupPatch;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * An action group object for the body of patch operations.
 */
@Fluent
public final class ActionGroupPatchBody {
    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The action group settings for an update operation.
     */
    @JsonProperty(value = "properties")
    private ActionGroupPatch innerProperties;

    /**
     * Creates an instance of ActionGroupPatchBody class.
     */
    public ActionGroupPatchBody() {
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the ActionGroupPatchBody object itself.
     */
    public ActionGroupPatchBody withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The action group settings for an update operation.
     * 
     * @return the innerProperties value.
     */
    private ActionGroupPatch innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then none of its actions will be activated.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then none of its actions will be activated.
     * 
     * @param enabled the enabled value to set.
     * @return the ActionGroupPatchBody object itself.
     */
    public ActionGroupPatchBody withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroupPatch();
        }
        this.innerProperties().withEnabled(enabled);
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
