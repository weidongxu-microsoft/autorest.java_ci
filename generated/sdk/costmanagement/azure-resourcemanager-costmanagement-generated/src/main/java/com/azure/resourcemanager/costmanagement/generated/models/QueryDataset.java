// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The definition of data present in the query. */
@Fluent
public final class QueryDataset {
    /*
     * The granularity of rows in the query.
     */
    @JsonProperty(value = "granularity")
    private GranularityType granularity;

    /*
     * Dictionary of aggregation expression to use in the query. The key of
     * each item in the dictionary is the alias for the aggregated column.
     * Query can have up to 2 aggregation clauses.
     */
    @JsonProperty(value = "aggregation")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, QueryAggregation> aggregation;

    /*
     * Array of group by expression to use in the query. Query can have up to 2
     * group by clauses.
     */
    @JsonProperty(value = "grouping")
    private List<QueryGrouping> grouping;

    /*
     * The filter expression to use in the query. Please reference our Query
     * API REST documentation for how to properly format the filter.
     */
    @JsonProperty(value = "filter")
    private QueryFilter filter;

    /**
     * Get the granularity property: The granularity of rows in the query.
     *
     * @return the granularity value.
     */
    public GranularityType granularity() {
        return this.granularity;
    }

    /**
     * Set the granularity property: The granularity of rows in the query.
     *
     * @param granularity the granularity value to set.
     * @return the QueryDataset object itself.
     */
    public QueryDataset withGranularity(GranularityType granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get the aggregation property: Dictionary of aggregation expression to use in the query. The key of each item in
     * the dictionary is the alias for the aggregated column. Query can have up to 2 aggregation clauses.
     *
     * @return the aggregation value.
     */
    public Map<String, QueryAggregation> aggregation() {
        return this.aggregation;
    }

    /**
     * Set the aggregation property: Dictionary of aggregation expression to use in the query. The key of each item in
     * the dictionary is the alias for the aggregated column. Query can have up to 2 aggregation clauses.
     *
     * @param aggregation the aggregation value to set.
     * @return the QueryDataset object itself.
     */
    public QueryDataset withAggregation(Map<String, QueryAggregation> aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get the grouping property: Array of group by expression to use in the query. Query can have up to 2 group by
     * clauses.
     *
     * @return the grouping value.
     */
    public List<QueryGrouping> grouping() {
        return this.grouping;
    }

    /**
     * Set the grouping property: Array of group by expression to use in the query. Query can have up to 2 group by
     * clauses.
     *
     * @param grouping the grouping value to set.
     * @return the QueryDataset object itself.
     */
    public QueryDataset withGrouping(List<QueryGrouping> grouping) {
        this.grouping = grouping;
        return this;
    }

    /**
     * Get the filter property: The filter expression to use in the query. Please reference our Query API REST
     * documentation for how to properly format the filter.
     *
     * @return the filter value.
     */
    public QueryFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: The filter expression to use in the query. Please reference our Query API REST
     * documentation for how to properly format the filter.
     *
     * @param filter the filter value to set.
     * @return the QueryDataset object itself.
     */
    public QueryDataset withFilter(QueryFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aggregation() != null) {
            aggregation()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (grouping() != null) {
            grouping().forEach(e -> e.validate());
        }
        if (filter() != null) {
            filter().validate();
        }
    }
}
