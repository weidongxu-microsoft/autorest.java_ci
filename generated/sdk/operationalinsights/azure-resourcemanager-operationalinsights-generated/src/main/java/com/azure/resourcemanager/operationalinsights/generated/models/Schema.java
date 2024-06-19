// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Table's schema.
 */
@Fluent
public final class Schema implements JsonSerializable<Schema> {
    /*
     * Table name.
     */
    private String name;

    /*
     * Table display name.
     */
    private String displayName;

    /*
     * Table description.
     */
    private String description;

    /*
     * A list of table custom columns.
     */
    private List<Column> columns;

    /*
     * A list of table standard columns.
     */
    private List<Column> standardColumns;

    /*
     * Table category.
     */
    private List<String> categories;

    /*
     * Table labels.
     */
    private List<String> labels;

    /*
     * Table's creator.
     */
    private SourceEnum source;

    /*
     * Table's creator.
     */
    private TableTypeEnum tableType;

    /*
     * The subtype describes what APIs can be used to interact with the table, and what features are available against
     * it.
     */
    private TableSubTypeEnum tableSubType;

    /*
     * List of solutions the table is affiliated with
     */
    private List<String> solutions;

    /**
     * Creates an instance of Schema class.
     */
    public Schema() {
    }

    /**
     * Get the name property: Table name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Table name.
     * 
     * @param name the name value to set.
     * @return the Schema object itself.
     */
    public Schema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Table display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Table display name.
     * 
     * @param displayName the displayName value to set.
     * @return the Schema object itself.
     */
    public Schema withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: Table description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Table description.
     * 
     * @param description the description value to set.
     * @return the Schema object itself.
     */
    public Schema withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the columns property: A list of table custom columns.
     * 
     * @return the columns value.
     */
    public List<Column> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: A list of table custom columns.
     * 
     * @param columns the columns value to set.
     * @return the Schema object itself.
     */
    public Schema withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the standardColumns property: A list of table standard columns.
     * 
     * @return the standardColumns value.
     */
    public List<Column> standardColumns() {
        return this.standardColumns;
    }

    /**
     * Get the categories property: Table category.
     * 
     * @return the categories value.
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * Get the labels property: Table labels.
     * 
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Get the source property: Table's creator.
     * 
     * @return the source value.
     */
    public SourceEnum source() {
        return this.source;
    }

    /**
     * Get the tableType property: Table's creator.
     * 
     * @return the tableType value.
     */
    public TableTypeEnum tableType() {
        return this.tableType;
    }

    /**
     * Get the tableSubType property: The subtype describes what APIs can be used to interact with the table, and what
     * features are available against it.
     * 
     * @return the tableSubType value.
     */
    public TableSubTypeEnum tableSubType() {
        return this.tableSubType;
    }

    /**
     * Get the solutions property: List of solutions the table is affiliated with.
     * 
     * @return the solutions value.
     */
    public List<String> solutions() {
        return this.solutions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
        if (standardColumns() != null) {
            standardColumns().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("columns", this.columns, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Schema from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Schema if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Schema.
     */
    public static Schema fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Schema deserializedSchema = new Schema();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSchema.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedSchema.displayName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedSchema.description = reader.getString();
                } else if ("columns".equals(fieldName)) {
                    List<Column> columns = reader.readArray(reader1 -> Column.fromJson(reader1));
                    deserializedSchema.columns = columns;
                } else if ("standardColumns".equals(fieldName)) {
                    List<Column> standardColumns = reader.readArray(reader1 -> Column.fromJson(reader1));
                    deserializedSchema.standardColumns = standardColumns;
                } else if ("categories".equals(fieldName)) {
                    List<String> categories = reader.readArray(reader1 -> reader1.getString());
                    deserializedSchema.categories = categories;
                } else if ("labels".equals(fieldName)) {
                    List<String> labels = reader.readArray(reader1 -> reader1.getString());
                    deserializedSchema.labels = labels;
                } else if ("source".equals(fieldName)) {
                    deserializedSchema.source = SourceEnum.fromString(reader.getString());
                } else if ("tableType".equals(fieldName)) {
                    deserializedSchema.tableType = TableTypeEnum.fromString(reader.getString());
                } else if ("tableSubType".equals(fieldName)) {
                    deserializedSchema.tableSubType = TableSubTypeEnum.fromString(reader.getString());
                } else if ("solutions".equals(fieldName)) {
                    List<String> solutions = reader.readArray(reader1 -> reader1.getString());
                    deserializedSchema.solutions = solutions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSchema;
        });
    }
}
