// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The expression.
 */
@Fluent
public class Expression implements JsonSerializable<Expression> {
    /*
     * The text.
     */
    private String text;

    /*
     * Anything
     */
    private Object value;

    /*
     * The sub expressions.
     */
    private List<Expression> subexpressions;

    /*
     * The azure resource error info.
     */
    private AzureResourceErrorInfo error;

    /**
     * Creates an instance of Expression class.
     */
    public Expression() {
    }

    /**
     * Get the text property: The text.
     * 
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: The text.
     * 
     * @param text the text value to set.
     * @return the Expression object itself.
     */
    public Expression withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the value property: Anything.
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Anything.
     * 
     * @param value the value value to set.
     * @return the Expression object itself.
     */
    public Expression withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the subexpressions property: The sub expressions.
     * 
     * @return the subexpressions value.
     */
    public List<Expression> subexpressions() {
        return this.subexpressions;
    }

    /**
     * Set the subexpressions property: The sub expressions.
     * 
     * @param subexpressions the subexpressions value to set.
     * @return the Expression object itself.
     */
    public Expression withSubexpressions(List<Expression> subexpressions) {
        this.subexpressions = subexpressions;
        return this;
    }

    /**
     * Get the error property: The azure resource error info.
     * 
     * @return the error value.
     */
    public AzureResourceErrorInfo error() {
        return this.error;
    }

    /**
     * Set the error property: The azure resource error info.
     * 
     * @param error the error value to set.
     * @return the Expression object itself.
     */
    public Expression withError(AzureResourceErrorInfo error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subexpressions() != null) {
            subexpressions().forEach(e -> e.validate());
        }
        if (error() != null) {
            error().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeUntypedField("value", this.value);
        jsonWriter.writeArrayField("subexpressions", this.subexpressions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Expression from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Expression if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Expression.
     */
    public static Expression fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Expression deserializedExpression = new Expression();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    deserializedExpression.text = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedExpression.value = reader.readUntyped();
                } else if ("subexpressions".equals(fieldName)) {
                    List<Expression> subexpressions = reader.readArray(reader1 -> Expression.fromJson(reader1));
                    deserializedExpression.subexpressions = subexpressions;
                } else if ("error".equals(fieldName)) {
                    deserializedExpression.error = AzureResourceErrorInfo.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpression;
        });
    }
}
