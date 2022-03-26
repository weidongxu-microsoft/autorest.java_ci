// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.EventChannelDestination;
import com.azure.resourcemanager.eventgrid.generated.models.EventChannelFilter;
import com.azure.resourcemanager.eventgrid.generated.models.EventChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.EventChannelSource;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicReadinessState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Event Channel. */
@Fluent
public final class EventChannelInner extends ProxyResource {
    /*
     * Properties of the EventChannel.
     */
    @JsonProperty(value = "properties")
    private EventChannelProperties innerProperties;

    /*
     * The system metadata relating to Event Channel resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Properties of the EventChannel.
     *
     * @return the innerProperties value.
     */
    private EventChannelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Event Channel resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the source property: Source of the event channel. This represents a unique resource in the partner's resource
     * model.
     *
     * @return the source value.
     */
    public EventChannelSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Source of the event channel. This represents a unique resource in the partner's resource
     * model.
     *
     * @param source the source value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withSource(EventChannelSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventChannelProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the destination property: Represents the destination of an event channel.
     *
     * @return the destination value.
     */
    public EventChannelDestination destination() {
        return this.innerProperties() == null ? null : this.innerProperties().destination();
    }

    /**
     * Set the destination property: Represents the destination of an event channel.
     *
     * @param destination the destination value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withDestination(EventChannelDestination destination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventChannelProperties();
        }
        this.innerProperties().withDestination(destination);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the event channel.
     *
     * @return the provisioningState value.
     */
    public EventChannelProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the partnerTopicReadinessState property: The readiness state of the corresponding partner topic.
     *
     * @return the partnerTopicReadinessState value.
     */
    public PartnerTopicReadinessState partnerTopicReadinessState() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerTopicReadinessState();
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the event channel. If this timer expires
     * while the corresponding partner topic is never activated, the event channel and corresponding partner topic are
     * deleted.
     *
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTimeIfNotActivatedUtc();
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the event channel. If this timer expires
     * while the corresponding partner topic is never activated, the event channel and corresponding partner topic are
     * deleted.
     *
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventChannelProperties();
        }
        this.innerProperties().withExpirationTimeIfNotActivatedUtc(expirationTimeIfNotActivatedUtc);
        return this;
    }

    /**
     * Get the filter property: Information about the filter for the event channel.
     *
     * @return the filter value.
     */
    public EventChannelFilter filter() {
        return this.innerProperties() == null ? null : this.innerProperties().filter();
    }

    /**
     * Set the filter property: Information about the filter for the event channel.
     *
     * @param filter the filter value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withFilter(EventChannelFilter filter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventChannelProperties();
        }
        this.innerProperties().withFilter(filter);
        return this;
    }

    /**
     * Get the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic. This will be helpful to remove any
     * ambiguity of the origin of creation of the partner topic for the customer.
     *
     * @return the partnerTopicFriendlyDescription value.
     */
    public String partnerTopicFriendlyDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerTopicFriendlyDescription();
    }

    /**
     * Set the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic. This will be helpful to remove any
     * ambiguity of the origin of creation of the partner topic for the customer.
     *
     * @param partnerTopicFriendlyDescription the partnerTopicFriendlyDescription value to set.
     * @return the EventChannelInner object itself.
     */
    public EventChannelInner withPartnerTopicFriendlyDescription(String partnerTopicFriendlyDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventChannelProperties();
        }
        this.innerProperties().withPartnerTopicFriendlyDescription(partnerTopicFriendlyDescription);
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
