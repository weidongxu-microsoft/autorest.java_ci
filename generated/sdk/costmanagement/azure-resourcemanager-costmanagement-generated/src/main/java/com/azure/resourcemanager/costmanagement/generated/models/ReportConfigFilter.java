// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The filter expression to be used in the report. */
@Fluent
public final class ReportConfigFilter {
    /*
     * The logical "AND" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "and")
    private List<ReportConfigFilter> and;

    /*
     * The logical "OR" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "or")
    private List<ReportConfigFilter> or;

    /*
     * Has comparison expression for a dimension
     */
    @JsonProperty(value = "dimensions")
    private ReportConfigComparisonExpression dimensions;

    /*
     * Has comparison expression for a tag
     */
    @JsonProperty(value = "tags")
    private ReportConfigComparisonExpression tags;

    /*
     * Has comparison expression for a tag key
     */
    @JsonProperty(value = "tagKey")
    private ReportConfigComparisonExpression tagKey;

    /*
     * Has comparison expression for a tag value
     */
    @JsonProperty(value = "tagValue")
    private ReportConfigComparisonExpression tagValue;

    /**
     * Get the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @return the and value.
     */
    public List<ReportConfigFilter> and() {
        return this.and;
    }

    /**
     * Set the and property: The logical "AND" expression. Must have at least 2 items.
     *
     * @param and the and value to set.
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withAnd(List<ReportConfigFilter> and) {
        this.and = and;
        return this;
    }

    /**
     * Get the or property: The logical "OR" expression. Must have at least 2 items.
     *
     * @return the or value.
     */
    public List<ReportConfigFilter> or() {
        return this.or;
    }

    /**
     * Set the or property: The logical "OR" expression. Must have at least 2 items.
     *
     * @param or the or value to set.
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withOr(List<ReportConfigFilter> or) {
        this.or = or;
        return this;
    }

    /**
     * Get the dimensions property: Has comparison expression for a dimension.
     *
     * @return the dimensions value.
     */
    public ReportConfigComparisonExpression dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Has comparison expression for a dimension.
     *
     * @param dimensions the dimensions value to set.
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withDimensions(ReportConfigComparisonExpression dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the tags property: Has comparison expression for a tag.
     *
     * @return the tags value.
     */
    public ReportConfigComparisonExpression tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Has comparison expression for a tag.
     *
     * @param tags the tags value to set.
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withTags(ReportConfigComparisonExpression tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the tagKey property: Has comparison expression for a tag key.
     *
     * @return the tagKey value.
     */
    public ReportConfigComparisonExpression tagKey() {
        return this.tagKey;
    }

    /**
     * Set the tagKey property: Has comparison expression for a tag key.
     *
     * @param tagKey the tagKey value to set.
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withTagKey(ReportConfigComparisonExpression tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * Get the tagValue property: Has comparison expression for a tag value.
     *
     * @return the tagValue value.
     */
    public ReportConfigComparisonExpression tagValue() {
        return this.tagValue;
    }

    /**
     * Set the tagValue property: Has comparison expression for a tag value.
     *
     * @param tagValue the tagValue value to set.
     * @return the ReportConfigFilter object itself.
     */
    public ReportConfigFilter withTagValue(ReportConfigComparisonExpression tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (and() != null) {
            and().forEach(e -> e.validate());
        }
        if (or() != null) {
            or().forEach(e -> e.validate());
        }
        if (dimensions() != null) {
            dimensions().validate();
        }
        if (tags() != null) {
            tags().validate();
        }
        if (tagKey() != null) {
            tagKey().validate();
        }
        if (tagValue() != null) {
            tagValue().validate();
        }
    }
}
