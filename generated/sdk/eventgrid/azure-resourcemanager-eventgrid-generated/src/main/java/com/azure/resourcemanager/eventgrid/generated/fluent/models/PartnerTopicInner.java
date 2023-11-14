// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.generated.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicActivationState;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * Event Grid Partner Topic.
 */
@Fluent
public final class PartnerTopicInner extends Resource {
    /*
     * Properties of the Partner Topic.
     */
    @JsonProperty(value = "properties")
    private PartnerTopicProperties innerProperties;

    /*
     * The system metadata relating to Partner Topic resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Identity information for the Partner Topic resource.
     */
    @JsonProperty(value = "identity")
    private IdentityInfo identity;

    /**
     * Creates an instance of PartnerTopicInner class.
     */
    public PartnerTopicInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Partner Topic.
     * 
     * @return the innerProperties value.
     */
    private PartnerTopicProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Partner Topic resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the identity property: Identity information for the Partner Topic resource.
     * 
     * @return the identity value.
     */
    public IdentityInfo identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity information for the Partner Topic resource.
     * 
     * @param identity the identity value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withIdentity(IdentityInfo identity) {
        this.identity = identity;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnerTopicInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnerTopicInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * 
     * @return the partnerRegistrationImmutableId value.
     */
    public UUID partnerRegistrationImmutableId() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRegistrationImmutableId();
    }

    /**
     * Set the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * 
     * @param partnerRegistrationImmutableId the partnerRegistrationImmutableId value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerTopicProperties();
        }
        this.innerProperties().withPartnerRegistrationImmutableId(partnerRegistrationImmutableId);
        return this;
    }

    /**
     * Get the source property: Source associated with this partner topic. This represents a unique partner resource.
     * 
     * @return the source value.
     */
    public String source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Source associated with this partner topic. This represents a unique partner resource.
     * 
     * @param source the source value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withSource(String source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerTopicProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the eventTypeInfo property: Event Type information from the corresponding event channel.
     * 
     * @return the eventTypeInfo value.
     */
    public EventTypeInfo eventTypeInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().eventTypeInfo();
    }

    /**
     * Set the eventTypeInfo property: Event Type information from the corresponding event channel.
     * 
     * @param eventTypeInfo the eventTypeInfo value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withEventTypeInfo(EventTypeInfo eventTypeInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerTopicProperties();
        }
        this.innerProperties().withEventTypeInfo(eventTypeInfo);
        return this;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the partner topic. If this timer expires
     * while the partner topic is still never activated,
     * the partner topic and corresponding event channel are deleted.
     * 
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTimeIfNotActivatedUtc();
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the partner topic. If this timer expires
     * while the partner topic is still never activated,
     * the partner topic and corresponding event channel are deleted.
     * 
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerTopicProperties();
        }
        this.innerProperties().withExpirationTimeIfNotActivatedUtc(expirationTimeIfNotActivatedUtc);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the partner topic.
     * 
     * @return the provisioningState value.
     */
    public PartnerTopicProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the activationState property: Activation state of the partner topic.
     * 
     * @return the activationState value.
     */
    public PartnerTopicActivationState activationState() {
        return this.innerProperties() == null ? null : this.innerProperties().activationState();
    }

    /**
     * Set the activationState property: Activation state of the partner topic.
     * 
     * @param activationState the activationState value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withActivationState(PartnerTopicActivationState activationState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerTopicProperties();
        }
        this.innerProperties().withActivationState(activationState);
        return this;
    }

    /**
     * Get the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
     * @return the partnerTopicFriendlyDescription value.
     */
    public String partnerTopicFriendlyDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerTopicFriendlyDescription();
    }

    /**
     * Set the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
     * @param partnerTopicFriendlyDescription the partnerTopicFriendlyDescription value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withPartnerTopicFriendlyDescription(String partnerTopicFriendlyDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerTopicProperties();
        }
        this.innerProperties().withPartnerTopicFriendlyDescription(partnerTopicFriendlyDescription);
        return this;
    }

    /**
     * Get the messageForActivation property: Context or helpful message that can be used during the approval process
     * by the subscriber.
     * 
     * @return the messageForActivation value.
     */
    public String messageForActivation() {
        return this.innerProperties() == null ? null : this.innerProperties().messageForActivation();
    }

    /**
     * Set the messageForActivation property: Context or helpful message that can be used during the approval process
     * by the subscriber.
     * 
     * @param messageForActivation the messageForActivation value to set.
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withMessageForActivation(String messageForActivation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerTopicProperties();
        }
        this.innerProperties().withMessageForActivation(messageForActivation);
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
