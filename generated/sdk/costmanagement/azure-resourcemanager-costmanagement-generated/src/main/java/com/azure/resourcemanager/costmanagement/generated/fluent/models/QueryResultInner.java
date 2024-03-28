// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.costmanagement.generated.models.QueryColumn;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Result of query. It contains all columns listed under groupings and aggregation.
 */
@Fluent
public final class QueryResultInner extends ProxyResource {
    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /*
     * Resource location
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Resource SKU
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private String sku;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private QueryProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Creates an instance of QueryResultInner class.
     */
    public QueryResultInner() {
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @param etag the etag value to set.
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the sku property: Resource SKU.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private QueryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.innerProperties() == null ? null : this.innerProperties().nextLink();
    }

    /**
     * Set the nextLink property: The link (url) to the next page of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withNextLink(String nextLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryProperties();
        }
        this.innerProperties().withNextLink(nextLink);
        return this;
    }

    /**
     * Get the columns property: Array of columns.
     * 
     * @return the columns value.
     */
    public List<QueryColumn> columns() {
        return this.innerProperties() == null ? null : this.innerProperties().columns();
    }

    /**
     * Set the columns property: Array of columns.
     * 
     * @param columns the columns value to set.
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withColumns(List<QueryColumn> columns) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryProperties();
        }
        this.innerProperties().withColumns(columns);
        return this;
    }

    /**
     * Get the rows property: Array of rows.
     * 
     * @return the rows value.
     */
    public List<List<Object>> rows() {
        return this.innerProperties() == null ? null : this.innerProperties().rows();
    }

    /**
     * Set the rows property: Array of rows.
     * 
     * @param rows the rows value to set.
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withRows(List<List<Object>> rows) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryProperties();
        }
        this.innerProperties().withRows(rows);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
