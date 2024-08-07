// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnectionRoutesTableSummary;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListRoutesTable associated with the Express Route Cross Connections.
 */
@Fluent
public final class ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner
    implements JsonSerializable<ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner> {
    /*
     * A list of the routes table.
     */
    private List<ExpressRouteCrossConnectionRoutesTableSummary> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner class.
     */
    public ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner() {
    }

    /**
     * Get the value property: A list of the routes table.
     * 
     * @return the value value.
     */
    public List<ExpressRouteCrossConnectionRoutesTableSummary> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of the routes table.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner object itself.
     */
    public ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner
        withValue(List<ExpressRouteCrossConnectionRoutesTableSummary> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner.
     */
    public static ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner deserializedExpressRouteCrossConnectionsRoutesTableSummaryListResultInner
                = new ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ExpressRouteCrossConnectionRoutesTableSummary> value
                        = reader.readArray(reader1 -> ExpressRouteCrossConnectionRoutesTableSummary.fromJson(reader1));
                    deserializedExpressRouteCrossConnectionsRoutesTableSummaryListResultInner.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionsRoutesTableSummaryListResultInner.nextLink
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCrossConnectionsRoutesTableSummaryListResultInner;
        });
    }
}
