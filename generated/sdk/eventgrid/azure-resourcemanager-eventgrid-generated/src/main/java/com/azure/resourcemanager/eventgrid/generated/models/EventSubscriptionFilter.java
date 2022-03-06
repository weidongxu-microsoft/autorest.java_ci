// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Filter for the Event Subscription. */
@Fluent
public final class EventSubscriptionFilter {
    /*
     * An optional string to filter events for an event subscription based on a
     * resource path prefix.
     * The format of this depends on the publisher of the events.
     * Wildcard characters are not supported in this path.
     */
    @JsonProperty(value = "subjectBeginsWith")
    private String subjectBeginsWith;

    /*
     * An optional string to filter events for an event subscription based on a
     * resource path suffix.
     * Wildcard characters are not supported in this path.
     */
    @JsonProperty(value = "subjectEndsWith")
    private String subjectEndsWith;

    /*
     * A list of applicable event types that need to be part of the event
     * subscription. If it is desired to subscribe to all default event types,
     * set the IncludedEventTypes to null.
     */
    @JsonProperty(value = "includedEventTypes")
    private List<String> includedEventTypes;

    /*
     * Specifies if the SubjectBeginsWith and SubjectEndsWith properties of the
     * filter
     * should be compared in a case sensitive manner.
     */
    @JsonProperty(value = "isSubjectCaseSensitive")
    private Boolean isSubjectCaseSensitive;

    /*
     * Allows advanced filters to be evaluated against an array of values
     * instead of expecting a singular value.
     */
    @JsonProperty(value = "enableAdvancedFilteringOnArrays")
    private Boolean enableAdvancedFilteringOnArrays;

    /*
     * An array of advanced filters that are used for filtering event
     * subscriptions.
     */
    @JsonProperty(value = "advancedFilters")
    private List<AdvancedFilter> advancedFilters;

    /**
     * Get the subjectBeginsWith property: An optional string to filter events for an event subscription based on a
     * resource path prefix. The format of this depends on the publisher of the events. Wildcard characters are not
     * supported in this path.
     *
     * @return the subjectBeginsWith value.
     */
    public String subjectBeginsWith() {
        return this.subjectBeginsWith;
    }

    /**
     * Set the subjectBeginsWith property: An optional string to filter events for an event subscription based on a
     * resource path prefix. The format of this depends on the publisher of the events. Wildcard characters are not
     * supported in this path.
     *
     * @param subjectBeginsWith the subjectBeginsWith value to set.
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withSubjectBeginsWith(String subjectBeginsWith) {
        this.subjectBeginsWith = subjectBeginsWith;
        return this;
    }

    /**
     * Get the subjectEndsWith property: An optional string to filter events for an event subscription based on a
     * resource path suffix. Wildcard characters are not supported in this path.
     *
     * @return the subjectEndsWith value.
     */
    public String subjectEndsWith() {
        return this.subjectEndsWith;
    }

    /**
     * Set the subjectEndsWith property: An optional string to filter events for an event subscription based on a
     * resource path suffix. Wildcard characters are not supported in this path.
     *
     * @param subjectEndsWith the subjectEndsWith value to set.
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withSubjectEndsWith(String subjectEndsWith) {
        this.subjectEndsWith = subjectEndsWith;
        return this;
    }

    /**
     * Get the includedEventTypes property: A list of applicable event types that need to be part of the event
     * subscription. If it is desired to subscribe to all default event types, set the IncludedEventTypes to null.
     *
     * @return the includedEventTypes value.
     */
    public List<String> includedEventTypes() {
        return this.includedEventTypes;
    }

    /**
     * Set the includedEventTypes property: A list of applicable event types that need to be part of the event
     * subscription. If it is desired to subscribe to all default event types, set the IncludedEventTypes to null.
     *
     * @param includedEventTypes the includedEventTypes value to set.
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withIncludedEventTypes(List<String> includedEventTypes) {
        this.includedEventTypes = includedEventTypes;
        return this;
    }

    /**
     * Get the isSubjectCaseSensitive property: Specifies if the SubjectBeginsWith and SubjectEndsWith properties of the
     * filter should be compared in a case sensitive manner.
     *
     * @return the isSubjectCaseSensitive value.
     */
    public Boolean isSubjectCaseSensitive() {
        return this.isSubjectCaseSensitive;
    }

    /**
     * Set the isSubjectCaseSensitive property: Specifies if the SubjectBeginsWith and SubjectEndsWith properties of the
     * filter should be compared in a case sensitive manner.
     *
     * @param isSubjectCaseSensitive the isSubjectCaseSensitive value to set.
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withIsSubjectCaseSensitive(Boolean isSubjectCaseSensitive) {
        this.isSubjectCaseSensitive = isSubjectCaseSensitive;
        return this;
    }

    /**
     * Get the enableAdvancedFilteringOnArrays property: Allows advanced filters to be evaluated against an array of
     * values instead of expecting a singular value.
     *
     * @return the enableAdvancedFilteringOnArrays value.
     */
    public Boolean enableAdvancedFilteringOnArrays() {
        return this.enableAdvancedFilteringOnArrays;
    }

    /**
     * Set the enableAdvancedFilteringOnArrays property: Allows advanced filters to be evaluated against an array of
     * values instead of expecting a singular value.
     *
     * @param enableAdvancedFilteringOnArrays the enableAdvancedFilteringOnArrays value to set.
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withEnableAdvancedFilteringOnArrays(Boolean enableAdvancedFilteringOnArrays) {
        this.enableAdvancedFilteringOnArrays = enableAdvancedFilteringOnArrays;
        return this;
    }

    /**
     * Get the advancedFilters property: An array of advanced filters that are used for filtering event subscriptions.
     *
     * @return the advancedFilters value.
     */
    public List<AdvancedFilter> advancedFilters() {
        return this.advancedFilters;
    }

    /**
     * Set the advancedFilters property: An array of advanced filters that are used for filtering event subscriptions.
     *
     * @param advancedFilters the advancedFilters value to set.
     * @return the EventSubscriptionFilter object itself.
     */
    public EventSubscriptionFilter withAdvancedFilters(List<AdvancedFilter> advancedFilters) {
        this.advancedFilters = advancedFilters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (advancedFilters() != null) {
            advancedFilters().forEach(e -> e.validate());
        }
    }
}
