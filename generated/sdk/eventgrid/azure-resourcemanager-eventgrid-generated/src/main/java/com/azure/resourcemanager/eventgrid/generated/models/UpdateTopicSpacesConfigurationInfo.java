// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the topic spaces configuration info of a namespace.
 */
@Fluent
public final class UpdateTopicSpacesConfigurationInfo {
    /*
     * Indicate if Topic Spaces Configuration is enabled for the namespace. Default is Disabled.
     */
    @JsonProperty(value = "state")
    private TopicSpacesConfigurationState state;

    /*
     * This property is used to specify custom topic to which events will be routed to from topic spaces configuration under namespace.
     */
    @JsonProperty(value = "routeTopicResourceId")
    private String routeTopicResourceId;

    /*
     * Routing enrichments for topic spaces configuration.
     */
    @JsonProperty(value = "routingEnrichments")
    private RoutingEnrichments routingEnrichments;

    /*
     * Client authentication settings for topic spaces configuration.
     */
    @JsonProperty(value = "clientAuthentication")
    private ClientAuthenticationSettings clientAuthentication;

    /*
     * The maximum session expiry in hours. The property default value is 1 hour.
     * Min allowed value is 1 hour and max allowed value is 8 hours.
     */
    @JsonProperty(value = "maximumSessionExpiryInHours")
    private Integer maximumSessionExpiryInHours;

    /*
     * The maximum number of sessions per authentication name. The property default value is 1.
     * Min allowed value is 1 and max allowed value is 100.
     */
    @JsonProperty(value = "maximumClientSessionsPerAuthenticationName")
    private Integer maximumClientSessionsPerAuthenticationName;

    /*
     * Routing identity info for topic spaces configuration.
     */
    @JsonProperty(value = "routingIdentityInfo")
    private RoutingIdentityInfo routingIdentityInfo;

    /**
     * Creates an instance of UpdateTopicSpacesConfigurationInfo class.
     */
    public UpdateTopicSpacesConfigurationInfo() {
    }

    /**
     * Get the state property: Indicate if Topic Spaces Configuration is enabled for the namespace. Default is Disabled.
     * 
     * @return the state value.
     */
    public TopicSpacesConfigurationState state() {
        return this.state;
    }

    /**
     * Set the state property: Indicate if Topic Spaces Configuration is enabled for the namespace. Default is Disabled.
     * 
     * @param state the state value to set.
     * @return the UpdateTopicSpacesConfigurationInfo object itself.
     */
    public UpdateTopicSpacesConfigurationInfo withState(TopicSpacesConfigurationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the routeTopicResourceId property: This property is used to specify custom topic to which events will be routed to from topic spaces configuration under namespace.
     * 
     * @return the routeTopicResourceId value.
     */
    public String routeTopicResourceId() {
        return this.routeTopicResourceId;
    }

    /**
     * Set the routeTopicResourceId property: This property is used to specify custom topic to which events will be routed to from topic spaces configuration under namespace.
     * 
     * @param routeTopicResourceId the routeTopicResourceId value to set.
     * @return the UpdateTopicSpacesConfigurationInfo object itself.
     */
    public UpdateTopicSpacesConfigurationInfo withRouteTopicResourceId(String routeTopicResourceId) {
        this.routeTopicResourceId = routeTopicResourceId;
        return this;
    }

    /**
     * Get the routingEnrichments property: Routing enrichments for topic spaces configuration.
     * 
     * @return the routingEnrichments value.
     */
    public RoutingEnrichments routingEnrichments() {
        return this.routingEnrichments;
    }

    /**
     * Set the routingEnrichments property: Routing enrichments for topic spaces configuration.
     * 
     * @param routingEnrichments the routingEnrichments value to set.
     * @return the UpdateTopicSpacesConfigurationInfo object itself.
     */
    public UpdateTopicSpacesConfigurationInfo withRoutingEnrichments(RoutingEnrichments routingEnrichments) {
        this.routingEnrichments = routingEnrichments;
        return this;
    }

    /**
     * Get the clientAuthentication property: Client authentication settings for topic spaces configuration.
     * 
     * @return the clientAuthentication value.
     */
    public ClientAuthenticationSettings clientAuthentication() {
        return this.clientAuthentication;
    }

    /**
     * Set the clientAuthentication property: Client authentication settings for topic spaces configuration.
     * 
     * @param clientAuthentication the clientAuthentication value to set.
     * @return the UpdateTopicSpacesConfigurationInfo object itself.
     */
    public UpdateTopicSpacesConfigurationInfo
        withClientAuthentication(ClientAuthenticationSettings clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
        return this;
    }

    /**
     * Get the maximumSessionExpiryInHours property: The maximum session expiry in hours. The property default value is 1 hour.
     * Min allowed value is 1 hour and max allowed value is 8 hours.
     * 
     * @return the maximumSessionExpiryInHours value.
     */
    public Integer maximumSessionExpiryInHours() {
        return this.maximumSessionExpiryInHours;
    }

    /**
     * Set the maximumSessionExpiryInHours property: The maximum session expiry in hours. The property default value is 1 hour.
     * Min allowed value is 1 hour and max allowed value is 8 hours.
     * 
     * @param maximumSessionExpiryInHours the maximumSessionExpiryInHours value to set.
     * @return the UpdateTopicSpacesConfigurationInfo object itself.
     */
    public UpdateTopicSpacesConfigurationInfo withMaximumSessionExpiryInHours(Integer maximumSessionExpiryInHours) {
        this.maximumSessionExpiryInHours = maximumSessionExpiryInHours;
        return this;
    }

    /**
     * Get the maximumClientSessionsPerAuthenticationName property: The maximum number of sessions per authentication name. The property default value is 1.
     * Min allowed value is 1 and max allowed value is 100.
     * 
     * @return the maximumClientSessionsPerAuthenticationName value.
     */
    public Integer maximumClientSessionsPerAuthenticationName() {
        return this.maximumClientSessionsPerAuthenticationName;
    }

    /**
     * Set the maximumClientSessionsPerAuthenticationName property: The maximum number of sessions per authentication name. The property default value is 1.
     * Min allowed value is 1 and max allowed value is 100.
     * 
     * @param maximumClientSessionsPerAuthenticationName the maximumClientSessionsPerAuthenticationName value to set.
     * @return the UpdateTopicSpacesConfigurationInfo object itself.
     */
    public UpdateTopicSpacesConfigurationInfo
        withMaximumClientSessionsPerAuthenticationName(Integer maximumClientSessionsPerAuthenticationName) {
        this.maximumClientSessionsPerAuthenticationName = maximumClientSessionsPerAuthenticationName;
        return this;
    }

    /**
     * Get the routingIdentityInfo property: Routing identity info for topic spaces configuration.
     * 
     * @return the routingIdentityInfo value.
     */
    public RoutingIdentityInfo routingIdentityInfo() {
        return this.routingIdentityInfo;
    }

    /**
     * Set the routingIdentityInfo property: Routing identity info for topic spaces configuration.
     * 
     * @param routingIdentityInfo the routingIdentityInfo value to set.
     * @return the UpdateTopicSpacesConfigurationInfo object itself.
     */
    public UpdateTopicSpacesConfigurationInfo withRoutingIdentityInfo(RoutingIdentityInfo routingIdentityInfo) {
        this.routingIdentityInfo = routingIdentityInfo;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routingEnrichments() != null) {
            routingEnrichments().validate();
        }
        if (clientAuthentication() != null) {
            clientAuthentication().validate();
        }
        if (routingIdentityInfo() != null) {
            routingIdentityInfo().validate();
        }
    }
}
