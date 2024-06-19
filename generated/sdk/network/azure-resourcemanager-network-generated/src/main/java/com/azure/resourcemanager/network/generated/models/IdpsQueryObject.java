// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Will describe the query to run against the IDPS signatures DB.
 */
@Fluent
public final class IdpsQueryObject implements JsonSerializable<IdpsQueryObject> {
    /*
     * Contain all filters names and values
     */
    private List<FilterItems> filters;

    /*
     * Search term in all columns
     */
    private String search;

    /*
     * Column to sort response by
     */
    private OrderBy orderBy;

    /*
     * The number of the results to return in each page
     */
    private Integer resultsPerPage;

    /*
     * The number of records matching the filter to skip
     */
    private Integer skip;

    /**
     * Creates an instance of IdpsQueryObject class.
     */
    public IdpsQueryObject() {
    }

    /**
     * Get the filters property: Contain all filters names and values.
     * 
     * @return the filters value.
     */
    public List<FilterItems> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: Contain all filters names and values.
     * 
     * @param filters the filters value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withFilters(List<FilterItems> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the search property: Search term in all columns.
     * 
     * @return the search value.
     */
    public String search() {
        return this.search;
    }

    /**
     * Set the search property: Search term in all columns.
     * 
     * @param search the search value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * Get the orderBy property: Column to sort response by.
     * 
     * @return the orderBy value.
     */
    public OrderBy orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: Column to sort response by.
     * 
     * @param orderBy the orderBy value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the resultsPerPage property: The number of the results to return in each page.
     * 
     * @return the resultsPerPage value.
     */
    public Integer resultsPerPage() {
        return this.resultsPerPage;
    }

    /**
     * Set the resultsPerPage property: The number of the results to return in each page.
     * 
     * @param resultsPerPage the resultsPerPage value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
        return this;
    }

    /**
     * Get the skip property: The number of records matching the filter to skip.
     * 
     * @return the skip value.
     */
    public Integer skip() {
        return this.skip;
    }

    /**
     * Set the skip property: The number of records matching the filter to skip.
     * 
     * @param skip the skip value to set.
     * @return the IdpsQueryObject object itself.
     */
    public IdpsQueryObject withSkip(Integer skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filters() != null) {
            filters().forEach(e -> e.validate());
        }
        if (orderBy() != null) {
            orderBy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("filters", this.filters, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("search", this.search);
        jsonWriter.writeJsonField("orderBy", this.orderBy);
        jsonWriter.writeNumberField("resultsPerPage", this.resultsPerPage);
        jsonWriter.writeNumberField("skip", this.skip);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IdpsQueryObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IdpsQueryObject if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IdpsQueryObject.
     */
    public static IdpsQueryObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IdpsQueryObject deserializedIdpsQueryObject = new IdpsQueryObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filters".equals(fieldName)) {
                    List<FilterItems> filters = reader.readArray(reader1 -> FilterItems.fromJson(reader1));
                    deserializedIdpsQueryObject.filters = filters;
                } else if ("search".equals(fieldName)) {
                    deserializedIdpsQueryObject.search = reader.getString();
                } else if ("orderBy".equals(fieldName)) {
                    deserializedIdpsQueryObject.orderBy = OrderBy.fromJson(reader);
                } else if ("resultsPerPage".equals(fieldName)) {
                    deserializedIdpsQueryObject.resultsPerPage = reader.getNullable(JsonReader::getInt);
                } else if ("skip".equals(fieldName)) {
                    deserializedIdpsQueryObject.skip = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIdpsQueryObject;
        });
    }
}
