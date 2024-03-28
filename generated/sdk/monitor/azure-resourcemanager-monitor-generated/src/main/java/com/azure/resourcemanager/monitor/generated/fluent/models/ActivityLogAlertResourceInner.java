// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertActionList;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertAllOfCondition;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * An activity log alert resource.
 */
@Fluent
public final class ActivityLogAlertResourceInner extends Resource {
    /*
     * The activity log alert properties of the resource.
     */
    @JsonProperty(value = "properties")
    private ActivityLogAlert innerProperties;

    /**
     * Creates an instance of ActivityLogAlertResourceInner class.
     */
    public ActivityLogAlertResourceInner() {
    }

    /**
     * Get the innerProperties property: The activity log alert properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private ActivityLogAlert innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActivityLogAlertResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActivityLogAlertResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the scopes property: A list of resourceIds that will be used as prefixes. The alert will only apply to
     * activityLogs with resourceIds that fall under one of these prefixes. This list must include at least one item.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.innerProperties() == null ? null : this.innerProperties().scopes();
    }

    /**
     * Set the scopes property: A list of resourceIds that will be used as prefixes. The alert will only apply to
     * activityLogs with resourceIds that fall under one of these prefixes. This list must include at least one item.
     * 
     * @param scopes the scopes value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withScopes(List<String> scopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityLogAlert();
        }
        this.innerProperties().withScopes(scopes);
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this activity log alert is enabled. If an activity log alert is not
     * enabled, then none of its actions will be activated.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Indicates whether this activity log alert is enabled. If an activity log alert is not
     * enabled, then none of its actions will be activated.
     * 
     * @param enabled the enabled value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityLogAlert();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the condition property: The condition that will cause this alert to activate.
     * 
     * @return the condition value.
     */
    public ActivityLogAlertAllOfCondition condition() {
        return this.innerProperties() == null ? null : this.innerProperties().condition();
    }

    /**
     * Set the condition property: The condition that will cause this alert to activate.
     * 
     * @param condition the condition value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withCondition(ActivityLogAlertAllOfCondition condition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityLogAlert();
        }
        this.innerProperties().withCondition(condition);
        return this;
    }

    /**
     * Get the actions property: The actions that will activate when the condition is met.
     * 
     * @return the actions value.
     */
    public ActivityLogAlertActionList actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: The actions that will activate when the condition is met.
     * 
     * @param actions the actions value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withActions(ActivityLogAlertActionList actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityLogAlert();
        }
        this.innerProperties().withActions(actions);
        return this;
    }

    /**
     * Get the description property: A description of this activity log alert.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of this activity log alert.
     * 
     * @param description the description value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityLogAlert();
        }
        this.innerProperties().withDescription(description);
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
