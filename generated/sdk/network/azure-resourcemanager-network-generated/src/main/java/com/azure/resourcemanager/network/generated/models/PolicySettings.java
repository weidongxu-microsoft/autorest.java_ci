// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines contents of a web application firewall global configuration.
 */
@Fluent
public final class PolicySettings {
    /*
     * The state of the policy.
     */
    @JsonProperty(value = "state")
    private WebApplicationFirewallEnabledState state;

    /*
     * The mode of the policy.
     */
    @JsonProperty(value = "mode")
    private WebApplicationFirewallMode mode;

    /*
     * Whether to allow WAF to check request Body.
     */
    @JsonProperty(value = "requestBodyCheck")
    private Boolean requestBodyCheck;

    /*
     * Max inspection limit in KB for request body inspection for WAF.
     */
    @JsonProperty(value = "requestBodyInspectLimitInKB")
    private Integer requestBodyInspectLimitInKB;

    /*
     * Whether allow WAF to enforce request body limits.
     */
    @JsonProperty(value = "requestBodyEnforcement")
    private Boolean requestBodyEnforcement;

    /*
     * Maximum request body size in Kb for WAF.
     */
    @JsonProperty(value = "maxRequestBodySizeInKb")
    private Integer maxRequestBodySizeInKb;

    /*
     * Whether allow WAF to enforce file upload limits.
     */
    @JsonProperty(value = "fileUploadEnforcement")
    private Boolean fileUploadEnforcement;

    /*
     * Maximum file upload size in Mb for WAF.
     */
    @JsonProperty(value = "fileUploadLimitInMb")
    private Integer fileUploadLimitInMb;

    /*
     * If the action type is block, customer can override the response status code.
     */
    @JsonProperty(value = "customBlockResponseStatusCode")
    private Integer customBlockResponseStatusCode;

    /*
     * If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     */
    @JsonProperty(value = "customBlockResponseBody")
    private String customBlockResponseBody;

    /*
     * To scrub sensitive log fields
     */
    @JsonProperty(value = "logScrubbing")
    private PolicySettingsLogScrubbing logScrubbing;

    /*
     * Web Application Firewall JavaScript Challenge Cookie Expiration time in minutes.
     */
    @JsonProperty(value = "jsChallengeCookieExpirationInMins")
    private Integer jsChallengeCookieExpirationInMins;

    /**
     * Creates an instance of PolicySettings class.
     */
    public PolicySettings() {
    }

    /**
     * Get the state property: The state of the policy.
     * 
     * @return the state value.
     */
    public WebApplicationFirewallEnabledState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the policy.
     * 
     * @param state the state value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withState(WebApplicationFirewallEnabledState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the mode property: The mode of the policy.
     * 
     * @return the mode value.
     */
    public WebApplicationFirewallMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The mode of the policy.
     * 
     * @param mode the mode value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMode(WebApplicationFirewallMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the requestBodyCheck property: Whether to allow WAF to check request Body.
     * 
     * @return the requestBodyCheck value.
     */
    public Boolean requestBodyCheck() {
        return this.requestBodyCheck;
    }

    /**
     * Set the requestBodyCheck property: Whether to allow WAF to check request Body.
     * 
     * @param requestBodyCheck the requestBodyCheck value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withRequestBodyCheck(Boolean requestBodyCheck) {
        this.requestBodyCheck = requestBodyCheck;
        return this;
    }

    /**
     * Get the requestBodyInspectLimitInKB property: Max inspection limit in KB for request body inspection for WAF.
     * 
     * @return the requestBodyInspectLimitInKB value.
     */
    public Integer requestBodyInspectLimitInKB() {
        return this.requestBodyInspectLimitInKB;
    }

    /**
     * Set the requestBodyInspectLimitInKB property: Max inspection limit in KB for request body inspection for WAF.
     * 
     * @param requestBodyInspectLimitInKB the requestBodyInspectLimitInKB value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withRequestBodyInspectLimitInKB(Integer requestBodyInspectLimitInKB) {
        this.requestBodyInspectLimitInKB = requestBodyInspectLimitInKB;
        return this;
    }

    /**
     * Get the requestBodyEnforcement property: Whether allow WAF to enforce request body limits.
     * 
     * @return the requestBodyEnforcement value.
     */
    public Boolean requestBodyEnforcement() {
        return this.requestBodyEnforcement;
    }

    /**
     * Set the requestBodyEnforcement property: Whether allow WAF to enforce request body limits.
     * 
     * @param requestBodyEnforcement the requestBodyEnforcement value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withRequestBodyEnforcement(Boolean requestBodyEnforcement) {
        this.requestBodyEnforcement = requestBodyEnforcement;
        return this;
    }

    /**
     * Get the maxRequestBodySizeInKb property: Maximum request body size in Kb for WAF.
     * 
     * @return the maxRequestBodySizeInKb value.
     */
    public Integer maxRequestBodySizeInKb() {
        return this.maxRequestBodySizeInKb;
    }

    /**
     * Set the maxRequestBodySizeInKb property: Maximum request body size in Kb for WAF.
     * 
     * @param maxRequestBodySizeInKb the maxRequestBodySizeInKb value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMaxRequestBodySizeInKb(Integer maxRequestBodySizeInKb) {
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        return this;
    }

    /**
     * Get the fileUploadEnforcement property: Whether allow WAF to enforce file upload limits.
     * 
     * @return the fileUploadEnforcement value.
     */
    public Boolean fileUploadEnforcement() {
        return this.fileUploadEnforcement;
    }

    /**
     * Set the fileUploadEnforcement property: Whether allow WAF to enforce file upload limits.
     * 
     * @param fileUploadEnforcement the fileUploadEnforcement value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withFileUploadEnforcement(Boolean fileUploadEnforcement) {
        this.fileUploadEnforcement = fileUploadEnforcement;
        return this;
    }

    /**
     * Get the fileUploadLimitInMb property: Maximum file upload size in Mb for WAF.
     * 
     * @return the fileUploadLimitInMb value.
     */
    public Integer fileUploadLimitInMb() {
        return this.fileUploadLimitInMb;
    }

    /**
     * Set the fileUploadLimitInMb property: Maximum file upload size in Mb for WAF.
     * 
     * @param fileUploadLimitInMb the fileUploadLimitInMb value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withFileUploadLimitInMb(Integer fileUploadLimitInMb) {
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        return this;
    }

    /**
     * Get the customBlockResponseStatusCode property: If the action type is block, customer can override the response
     * status code.
     * 
     * @return the customBlockResponseStatusCode value.
     */
    public Integer customBlockResponseStatusCode() {
        return this.customBlockResponseStatusCode;
    }

    /**
     * Set the customBlockResponseStatusCode property: If the action type is block, customer can override the response
     * status code.
     * 
     * @param customBlockResponseStatusCode the customBlockResponseStatusCode value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withCustomBlockResponseStatusCode(Integer customBlockResponseStatusCode) {
        this.customBlockResponseStatusCode = customBlockResponseStatusCode;
        return this;
    }

    /**
     * Get the customBlockResponseBody property: If the action type is block, customer can override the response body.
     * The body must be specified in base64 encoding.
     * 
     * @return the customBlockResponseBody value.
     */
    public String customBlockResponseBody() {
        return this.customBlockResponseBody;
    }

    /**
     * Set the customBlockResponseBody property: If the action type is block, customer can override the response body.
     * The body must be specified in base64 encoding.
     * 
     * @param customBlockResponseBody the customBlockResponseBody value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withCustomBlockResponseBody(String customBlockResponseBody) {
        this.customBlockResponseBody = customBlockResponseBody;
        return this;
    }

    /**
     * Get the logScrubbing property: To scrub sensitive log fields.
     * 
     * @return the logScrubbing value.
     */
    public PolicySettingsLogScrubbing logScrubbing() {
        return this.logScrubbing;
    }

    /**
     * Set the logScrubbing property: To scrub sensitive log fields.
     * 
     * @param logScrubbing the logScrubbing value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withLogScrubbing(PolicySettingsLogScrubbing logScrubbing) {
        this.logScrubbing = logScrubbing;
        return this;
    }

    /**
     * Get the jsChallengeCookieExpirationInMins property: Web Application Firewall JavaScript Challenge Cookie
     * Expiration time in minutes.
     * 
     * @return the jsChallengeCookieExpirationInMins value.
     */
    public Integer jsChallengeCookieExpirationInMins() {
        return this.jsChallengeCookieExpirationInMins;
    }

    /**
     * Set the jsChallengeCookieExpirationInMins property: Web Application Firewall JavaScript Challenge Cookie
     * Expiration time in minutes.
     * 
     * @param jsChallengeCookieExpirationInMins the jsChallengeCookieExpirationInMins value to set.
     * @return the PolicySettings object itself.
     */
    public PolicySettings withJsChallengeCookieExpirationInMins(Integer jsChallengeCookieExpirationInMins) {
        this.jsChallengeCookieExpirationInMins = jsChallengeCookieExpirationInMins;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logScrubbing() != null) {
            logScrubbing().validate();
        }
    }
}
