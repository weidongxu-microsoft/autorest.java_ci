// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.AccountFilterInner;
import java.io.IOException;
import java.util.List;

/**
 * A collection of AccountFilter items.
 */
@Fluent
public final class AccountFilterCollection implements JsonSerializable<AccountFilterCollection> {
    /*
     * A collection of AccountFilter items.
     */
    private List<AccountFilterInner> value;

    /*
     * A link to the next page of the collection (when the collection contains too many results to return in one
     * response).
     */
    private String odataNextLink;

    /**
     * Creates an instance of AccountFilterCollection class.
     */
    public AccountFilterCollection() {
    }

    /**
     * Get the value property: A collection of AccountFilter items.
     * 
     * @return the value value.
     */
    public List<AccountFilterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of AccountFilter items.
     * 
     * @param value the value value to set.
     * @return the AccountFilterCollection object itself.
     */
    public AccountFilterCollection withValue(List<AccountFilterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: A link to the next page of the collection (when the collection contains too many
     * results to return in one response).
     * 
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: A link to the next page of the collection (when the collection contains too many
     * results to return in one response).
     * 
     * @param odataNextLink the odataNextLink value to set.
     * @return the AccountFilterCollection object itself.
     */
    public AccountFilterCollection withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
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
        jsonWriter.writeStringField("@odata.nextLink", this.odataNextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountFilterCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountFilterCollection if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountFilterCollection.
     */
    public static AccountFilterCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountFilterCollection deserializedAccountFilterCollection = new AccountFilterCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AccountFilterInner> value = reader.readArray(reader1 -> AccountFilterInner.fromJson(reader1));
                    deserializedAccountFilterCollection.value = value;
                } else if ("@odata.nextLink".equals(fieldName)) {
                    deserializedAccountFilterCollection.odataNextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountFilterCollection;
        });
    }
}
