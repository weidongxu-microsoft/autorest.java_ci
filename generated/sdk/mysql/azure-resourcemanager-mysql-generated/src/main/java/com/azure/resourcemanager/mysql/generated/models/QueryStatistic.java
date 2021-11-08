// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.resourcemanager.mysql.generated.fluent.models.QueryStatisticInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of QueryStatistic. */
public interface QueryStatistic {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the queryId property: Database query identifier.
     *
     * @return the queryId value.
     */
    String queryId();

    /**
     * Gets the startTime property: Observation start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: Observation end time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the aggregationFunction property: Aggregation function name.
     *
     * @return the aggregationFunction value.
     */
    String aggregationFunction();

    /**
     * Gets the databaseNames property: The list of database names.
     *
     * @return the databaseNames value.
     */
    List<String> databaseNames();

    /**
     * Gets the queryExecutionCount property: Number of query executions in this time interval.
     *
     * @return the queryExecutionCount value.
     */
    Long queryExecutionCount();

    /**
     * Gets the metricName property: Metric name.
     *
     * @return the metricName value.
     */
    String metricName();

    /**
     * Gets the metricDisplayName property: Metric display name.
     *
     * @return the metricDisplayName value.
     */
    String metricDisplayName();

    /**
     * Gets the metricValue property: Metric value.
     *
     * @return the metricValue value.
     */
    Double metricValue();

    /**
     * Gets the metricValueUnit property: Metric value unit.
     *
     * @return the metricValueUnit value.
     */
    String metricValueUnit();

    /**
     * Gets the inner com.azure.resourcemanager.mysql.generated.fluent.models.QueryStatisticInner object.
     *
     * @return the inner object.
     */
    QueryStatisticInner innerModel();
}
