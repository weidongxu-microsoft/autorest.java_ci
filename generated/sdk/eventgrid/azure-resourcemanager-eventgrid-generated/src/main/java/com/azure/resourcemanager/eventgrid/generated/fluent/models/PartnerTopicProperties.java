// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicActivationState;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of the Partner Topic. */
@Fluent
public final class PartnerTopicProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PartnerTopicProperties.class);

    /*
     * Source associated with this partner topic. This represents a unique
     * partner resource.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Expiration time of the partner topic. If this timer expires while the
     * partner topic is still never activated,
     * the partner topic and corresponding event channel are deleted.
     */
    @JsonProperty(value = "expirationTimeIfNotActivatedUtc")
    private OffsetDateTime expirationTimeIfNotActivatedUtc;

    /*
     * Provisioning state of the partner topic.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PartnerTopicProvisioningState provisioningState;

    /*
     * Activation state of the partner topic.
     */
    @JsonProperty(value = "activationState")
    private PartnerTopicActivationState activationState;

    /*
     * Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner
     * topic.
     * This will be helpful to remove any ambiguity of the origin of creation
     * of the partner topic for the customer.
     */
    @JsonProperty(value = "partnerTopicFriendlyDescription")
    private String partnerTopicFriendlyDescription;

    /**
     * Get the source property: Source associated with this partner topic. This represents a unique partner resource.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Source associated with this partner topic. This represents a unique partner resource.
     *
     * @param source the source value to set.
     * @return the PartnerTopicProperties object itself.
     */
    public PartnerTopicProperties withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the partner topic. If this timer expires
     * while the partner topic is still never activated, the partner topic and corresponding event channel are deleted.
     *
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.expirationTimeIfNotActivatedUtc;
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the partner topic. If this timer expires
     * while the partner topic is still never activated, the partner topic and corresponding event channel are deleted.
     *
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the PartnerTopicProperties object itself.
     */
    public PartnerTopicProperties withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the partner topic.
     *
     * @return the provisioningState value.
     */
    public PartnerTopicProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the activationState property: Activation state of the partner topic.
     *
     * @return the activationState value.
     */
    public PartnerTopicActivationState activationState() {
        return this.activationState;
    }

    /**
     * Set the activationState property: Activation state of the partner topic.
     *
     * @param activationState the activationState value to set.
     * @return the PartnerTopicProperties object itself.
     */
    public PartnerTopicProperties withActivationState(PartnerTopicActivationState activationState) {
        this.activationState = activationState;
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
        return this.partnerTopicFriendlyDescription;
    }

    /**
     * Set the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic. This will be helpful to remove any
     * ambiguity of the origin of creation of the partner topic for the customer.
     *
     * @param partnerTopicFriendlyDescription the partnerTopicFriendlyDescription value to set.
     * @return the PartnerTopicProperties object itself.
     */
    public PartnerTopicProperties withPartnerTopicFriendlyDescription(String partnerTopicFriendlyDescription) {
        this.partnerTopicFriendlyDescription = partnerTopicFriendlyDescription;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
