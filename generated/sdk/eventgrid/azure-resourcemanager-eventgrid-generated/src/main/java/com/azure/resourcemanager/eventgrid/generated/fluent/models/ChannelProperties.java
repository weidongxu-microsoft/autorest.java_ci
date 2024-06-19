// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.models.ChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.ChannelType;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerDestinationInfo;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicInfo;
import com.azure.resourcemanager.eventgrid.generated.models.ReadinessState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Properties of the Channel.
 */
@Fluent
public final class ChannelProperties implements JsonSerializable<ChannelProperties> {
    /*
     * The type of the event channel which represents the direction flow of events.
     */
    private ChannelType channelType;

    /*
     * This property should be populated when channelType is PartnerTopic and represents information about the partner
     * topic resource corresponding to the channel.
     */
    private PartnerTopicInfo partnerTopicInfo;

    /*
     * This property should be populated when channelType is PartnerDestination and represents information about the
     * partner destination resource corresponding to the channel.
     */
    private PartnerDestinationInfo partnerDestinationInfo;

    /*
     * Context or helpful message that can be used during the approval process by the subscriber.
     */
    private String messageForActivation;

    /*
     * Provisioning state of the channel.
     */
    private ChannelProvisioningState provisioningState;

    /*
     * The readiness state of the corresponding partner topic.
     */
    private ReadinessState readinessState;

    /*
     * Expiration time of the channel. If this timer expires while the corresponding partner topic is never activated,
     * the channel and corresponding partner topic are deleted.
     */
    private OffsetDateTime expirationTimeIfNotActivatedUtc;

    /**
     * Creates an instance of ChannelProperties class.
     */
    public ChannelProperties() {
    }

    /**
     * Get the channelType property: The type of the event channel which represents the direction flow of events.
     * 
     * @return the channelType value.
     */
    public ChannelType channelType() {
        return this.channelType;
    }

    /**
     * Set the channelType property: The type of the event channel which represents the direction flow of events.
     * 
     * @param channelType the channelType value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withChannelType(ChannelType channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Get the partnerTopicInfo property: This property should be populated when channelType is PartnerTopic and
     * represents information about the partner topic resource corresponding to the channel.
     * 
     * @return the partnerTopicInfo value.
     */
    public PartnerTopicInfo partnerTopicInfo() {
        return this.partnerTopicInfo;
    }

    /**
     * Set the partnerTopicInfo property: This property should be populated when channelType is PartnerTopic and
     * represents information about the partner topic resource corresponding to the channel.
     * 
     * @param partnerTopicInfo the partnerTopicInfo value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withPartnerTopicInfo(PartnerTopicInfo partnerTopicInfo) {
        this.partnerTopicInfo = partnerTopicInfo;
        return this;
    }

    /**
     * Get the partnerDestinationInfo property: This property should be populated when channelType is PartnerDestination
     * and represents information about the partner destination resource corresponding to the channel.
     * 
     * @return the partnerDestinationInfo value.
     */
    public PartnerDestinationInfo partnerDestinationInfo() {
        return this.partnerDestinationInfo;
    }

    /**
     * Set the partnerDestinationInfo property: This property should be populated when channelType is PartnerDestination
     * and represents information about the partner destination resource corresponding to the channel.
     * 
     * @param partnerDestinationInfo the partnerDestinationInfo value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withPartnerDestinationInfo(PartnerDestinationInfo partnerDestinationInfo) {
        this.partnerDestinationInfo = partnerDestinationInfo;
        return this;
    }

    /**
     * Get the messageForActivation property: Context or helpful message that can be used during the approval process by
     * the subscriber.
     * 
     * @return the messageForActivation value.
     */
    public String messageForActivation() {
        return this.messageForActivation;
    }

    /**
     * Set the messageForActivation property: Context or helpful message that can be used during the approval process by
     * the subscriber.
     * 
     * @param messageForActivation the messageForActivation value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withMessageForActivation(String messageForActivation) {
        this.messageForActivation = messageForActivation;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the channel.
     * 
     * @return the provisioningState value.
     */
    public ChannelProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the channel.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withProvisioningState(ChannelProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the readinessState property: The readiness state of the corresponding partner topic.
     * 
     * @return the readinessState value.
     */
    public ReadinessState readinessState() {
        return this.readinessState;
    }

    /**
     * Set the readinessState property: The readiness state of the corresponding partner topic.
     * 
     * @param readinessState the readinessState value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withReadinessState(ReadinessState readinessState) {
        this.readinessState = readinessState;
        return this;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while the
     * corresponding partner topic is never activated,
     * the channel and corresponding partner topic are deleted.
     * 
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.expirationTimeIfNotActivatedUtc;
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while the
     * corresponding partner topic is never activated,
     * the channel and corresponding partner topic are deleted.
     * 
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (partnerTopicInfo() != null) {
            partnerTopicInfo().validate();
        }
        if (partnerDestinationInfo() != null) {
            partnerDestinationInfo().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("channelType", this.channelType == null ? null : this.channelType.toString());
        jsonWriter.writeJsonField("partnerTopicInfo", this.partnerTopicInfo);
        jsonWriter.writeJsonField("partnerDestinationInfo", this.partnerDestinationInfo);
        jsonWriter.writeStringField("messageForActivation", this.messageForActivation);
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        jsonWriter.writeStringField("readinessState",
            this.readinessState == null ? null : this.readinessState.toString());
        jsonWriter.writeStringField("expirationTimeIfNotActivatedUtc",
            this.expirationTimeIfNotActivatedUtc == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expirationTimeIfNotActivatedUtc));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChannelProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChannelProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChannelProperties.
     */
    public static ChannelProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChannelProperties deserializedChannelProperties = new ChannelProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("channelType".equals(fieldName)) {
                    deserializedChannelProperties.channelType = ChannelType.fromString(reader.getString());
                } else if ("partnerTopicInfo".equals(fieldName)) {
                    deserializedChannelProperties.partnerTopicInfo = PartnerTopicInfo.fromJson(reader);
                } else if ("partnerDestinationInfo".equals(fieldName)) {
                    deserializedChannelProperties.partnerDestinationInfo = PartnerDestinationInfo.fromJson(reader);
                } else if ("messageForActivation".equals(fieldName)) {
                    deserializedChannelProperties.messageForActivation = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedChannelProperties.provisioningState
                        = ChannelProvisioningState.fromString(reader.getString());
                } else if ("readinessState".equals(fieldName)) {
                    deserializedChannelProperties.readinessState = ReadinessState.fromString(reader.getString());
                } else if ("expirationTimeIfNotActivatedUtc".equals(fieldName)) {
                    deserializedChannelProperties.expirationTimeIfNotActivatedUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChannelProperties;
        });
    }
}
