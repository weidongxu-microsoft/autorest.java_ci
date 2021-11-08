// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The properties of a recommendation action. */
@Fluent
public final class RecommendationActionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendationActionProperties.class);

    /*
     * Advisor name.
     */
    @JsonProperty(value = "advisorName")
    private String advisorName;

    /*
     * Recommendation action session identifier.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * Recommendation action identifier.
     */
    @JsonProperty(value = "actionId")
    private Integer actionId;

    /*
     * Recommendation action creation time.
     */
    @JsonProperty(value = "createdTime")
    private OffsetDateTime createdTime;

    /*
     * Recommendation action expiration time.
     */
    @JsonProperty(value = "expirationTime")
    private OffsetDateTime expirationTime;

    /*
     * Recommendation action reason.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /*
     * Recommendation action type.
     */
    @JsonProperty(value = "recommendationType")
    private String recommendationType;

    /*
     * Recommendation action details.
     */
    @JsonProperty(value = "details")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> details;

    /**
     * Get the advisorName property: Advisor name.
     *
     * @return the advisorName value.
     */
    public String advisorName() {
        return this.advisorName;
    }

    /**
     * Set the advisorName property: Advisor name.
     *
     * @param advisorName the advisorName value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withAdvisorName(String advisorName) {
        this.advisorName = advisorName;
        return this;
    }

    /**
     * Get the sessionId property: Recommendation action session identifier.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: Recommendation action session identifier.
     *
     * @param sessionId the sessionId value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the actionId property: Recommendation action identifier.
     *
     * @return the actionId value.
     */
    public Integer actionId() {
        return this.actionId;
    }

    /**
     * Set the actionId property: Recommendation action identifier.
     *
     * @param actionId the actionId value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withActionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Get the createdTime property: Recommendation action creation time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: Recommendation action creation time.
     *
     * @param createdTime the createdTime value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the expirationTime property: Recommendation action expiration time.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime property: Recommendation action expiration time.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get the reason property: Recommendation action reason.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Recommendation action reason.
     *
     * @param reason the reason value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the recommendationType property: Recommendation action type.
     *
     * @return the recommendationType value.
     */
    public String recommendationType() {
        return this.recommendationType;
    }

    /**
     * Set the recommendationType property: Recommendation action type.
     *
     * @param recommendationType the recommendationType value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withRecommendationType(String recommendationType) {
        this.recommendationType = recommendationType;
        return this;
    }

    /**
     * Get the details property: Recommendation action details.
     *
     * @return the details value.
     */
    public Map<String, String> details() {
        return this.details;
    }

    /**
     * Set the details property: Recommendation action details.
     *
     * @param details the details value to set.
     * @return the RecommendationActionProperties object itself.
     */
    public RecommendationActionProperties withDetails(Map<String, String> details) {
        this.details = details;
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
