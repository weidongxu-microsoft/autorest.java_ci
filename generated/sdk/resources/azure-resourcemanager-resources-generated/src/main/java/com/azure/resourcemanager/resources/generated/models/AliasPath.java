// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The type of the paths for alias.
 */
@Fluent
public final class AliasPath implements JsonSerializable<AliasPath> {
    /*
     * The path of an alias.
     */
    private String path;

    /*
     * The API versions.
     */
    private List<String> apiVersions;

    /*
     * The pattern for an alias path.
     */
    private AliasPattern pattern;

    /*
     * The metadata of the alias path. If missing, fall back to the default metadata of the alias.
     */
    private AliasPathMetadata metadata;

    /**
     * Creates an instance of AliasPath class.
     */
    public AliasPath() {
    }

    /**
     * Get the path property: The path of an alias.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path of an alias.
     * 
     * @param path the path value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the apiVersions property: The API versions.
     * 
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The API versions.
     * 
     * @param apiVersions the apiVersions value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Get the pattern property: The pattern for an alias path.
     * 
     * @return the pattern value.
     */
    public AliasPattern pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: The pattern for an alias path.
     * 
     * @param pattern the pattern value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withPattern(AliasPattern pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the metadata property: The metadata of the alias path. If missing, fall back to the default metadata of the
     * alias.
     * 
     * @return the metadata value.
     */
    public AliasPathMetadata metadata() {
        return this.metadata;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pattern() != null) {
            pattern().validate();
        }
        if (metadata() != null) {
            metadata().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeArrayField("apiVersions", this.apiVersions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("pattern", this.pattern);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AliasPath from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AliasPath if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the AliasPath.
     */
    public static AliasPath fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AliasPath deserializedAliasPath = new AliasPath();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("path".equals(fieldName)) {
                    deserializedAliasPath.path = reader.getString();
                } else if ("apiVersions".equals(fieldName)) {
                    List<String> apiVersions = reader.readArray(reader1 -> reader1.getString());
                    deserializedAliasPath.apiVersions = apiVersions;
                } else if ("pattern".equals(fieldName)) {
                    deserializedAliasPath.pattern = AliasPattern.fromJson(reader);
                } else if ("metadata".equals(fieldName)) {
                    deserializedAliasPath.metadata = AliasPathMetadata.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAliasPath;
        });
    }
}
