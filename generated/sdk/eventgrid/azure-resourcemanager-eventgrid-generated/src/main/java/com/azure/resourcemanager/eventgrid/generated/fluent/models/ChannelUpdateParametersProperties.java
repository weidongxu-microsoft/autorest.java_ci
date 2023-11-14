// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerUpdateDestinationInfo;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerUpdateTopicInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Properties of the channel update parameters.
 */
@Fluent
public final class ChannelUpdateParametersProperties {
    /*
     * Expiration time of the channel. If this timer expires while the corresponding partner topic or partner
     * destination is never activated,
     * the channel and corresponding partner topic or partner destination are deleted.
     */
    @JsonProperty(value = "expirationTimeIfNotActivatedUtc")
    private OffsetDateTime expirationTimeIfNotActivatedUtc;

    /*
     * Partner destination properties which can be updated if the channel is of type PartnerDestination.
     */
    @JsonProperty(value = "partnerDestinationInfo")
    private PartnerUpdateDestinationInfo partnerDestinationInfo;

    /*
     * Partner topic properties which can be updated if the channel is of type PartnerTopic.
     */
    @JsonProperty(value = "partnerTopicInfo")
    private PartnerUpdateTopicInfo partnerTopicInfo;

    /**
     * Creates an instance of ChannelUpdateParametersProperties class.
     */
    public ChannelUpdateParametersProperties() {
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while
     * the corresponding partner topic or partner destination is never activated,
     * the channel and corresponding partner topic or partner destination are deleted.
     * 
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.expirationTimeIfNotActivatedUtc;
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while
     * the corresponding partner topic or partner destination is never activated,
     * the channel and corresponding partner topic or partner destination are deleted.
     * 
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the ChannelUpdateParametersProperties object itself.
     */
    public ChannelUpdateParametersProperties
        withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
        return this;
    }

    /**
     * Get the partnerDestinationInfo property: Partner destination properties which can be updated if the channel is
     * of type PartnerDestination.
     * 
     * @return the partnerDestinationInfo value.
     */
    public PartnerUpdateDestinationInfo partnerDestinationInfo() {
        return this.partnerDestinationInfo;
    }

    /**
     * Set the partnerDestinationInfo property: Partner destination properties which can be updated if the channel is
     * of type PartnerDestination.
     * 
     * @param partnerDestinationInfo the partnerDestinationInfo value to set.
     * @return the ChannelUpdateParametersProperties object itself.
     */
    public ChannelUpdateParametersProperties
        withPartnerDestinationInfo(PartnerUpdateDestinationInfo partnerDestinationInfo) {
        this.partnerDestinationInfo = partnerDestinationInfo;
        return this;
    }

    /**
     * Get the partnerTopicInfo property: Partner topic properties which can be updated if the channel is of type
     * PartnerTopic.
     * 
     * @return the partnerTopicInfo value.
     */
    public PartnerUpdateTopicInfo partnerTopicInfo() {
        return this.partnerTopicInfo;
    }

    /**
     * Set the partnerTopicInfo property: Partner topic properties which can be updated if the channel is of type
     * PartnerTopic.
     * 
     * @param partnerTopicInfo the partnerTopicInfo value to set.
     * @return the ChannelUpdateParametersProperties object itself.
     */
    public ChannelUpdateParametersProperties withPartnerTopicInfo(PartnerUpdateTopicInfo partnerTopicInfo) {
        this.partnerTopicInfo = partnerTopicInfo;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (partnerDestinationInfo() != null) {
            partnerDestinationInfo().validate();
        }
        if (partnerTopicInfo() != null) {
            partnerTopicInfo().validate();
        }
    }
}
