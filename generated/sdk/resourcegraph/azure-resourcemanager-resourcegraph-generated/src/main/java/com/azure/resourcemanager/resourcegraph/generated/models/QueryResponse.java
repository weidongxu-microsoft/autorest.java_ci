// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.resourcemanager.resourcegraph.generated.fluent.models.QueryResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of QueryResponse.
 */
public interface QueryResponse {
    /**
     * Gets the totalRecords property: Number of total records matching the query.
     * 
     * @return the totalRecords value.
     */
    long totalRecords();

    /**
     * Gets the count property: Number of records returned in the current response. In the case of paging, this is the number of records in the current page.
     * 
     * @return the count value.
     */
    long count();

    /**
     * Gets the resultTruncated property: Indicates whether the query results are truncated.
     * 
     * @return the resultTruncated value.
     */
    ResultTruncated resultTruncated();

    /**
     * Gets the skipToken property: When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     * @return the skipToken value.
     */
    String skipToken();

    /**
     * Gets the data property: Query output in JObject array or Table format.
     * 
     * @return the data value.
     */
    Object data();

    /**
     * Gets the facets property: Query facets.
     * 
     * @return the facets value.
     */
    List<Facet> facets();

    /**
     * Gets the inner com.azure.resourcemanager.resourcegraph.generated.fluent.models.QueryResponseInner object.
     * 
     * @return the inner object.
     */
    QueryResponseInner innerModel();
}
