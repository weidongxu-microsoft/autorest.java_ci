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

/**
 * Scale and concurrency settings for the HTTP trigger.
 */
@Fluent
public final class FunctionsScaleAndConcurrencyTriggersHttp
    implements JsonSerializable<FunctionsScaleAndConcurrencyTriggersHttp> {
    /*
     * The maximum number of concurrent HTTP trigger invocations per instance.
     */
    private Integer perInstanceConcurrency;

    /**
     * Creates an instance of FunctionsScaleAndConcurrencyTriggersHttp class.
     */
    public FunctionsScaleAndConcurrencyTriggersHttp() {
    }

    /**
     * Get the perInstanceConcurrency property: The maximum number of concurrent HTTP trigger invocations per instance.
     * 
     * @return the perInstanceConcurrency value.
     */
    public Integer perInstanceConcurrency() {
        return this.perInstanceConcurrency;
    }

    /**
     * Set the perInstanceConcurrency property: The maximum number of concurrent HTTP trigger invocations per instance.
     * 
     * @param perInstanceConcurrency the perInstanceConcurrency value to set.
     * @return the FunctionsScaleAndConcurrencyTriggersHttp object itself.
     */
    public FunctionsScaleAndConcurrencyTriggersHttp withPerInstanceConcurrency(Integer perInstanceConcurrency) {
        this.perInstanceConcurrency = perInstanceConcurrency;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("perInstanceConcurrency", this.perInstanceConcurrency);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionsScaleAndConcurrencyTriggersHttp from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionsScaleAndConcurrencyTriggersHttp if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionsScaleAndConcurrencyTriggersHttp.
     */
    public static FunctionsScaleAndConcurrencyTriggersHttp fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionsScaleAndConcurrencyTriggersHttp deserializedFunctionsScaleAndConcurrencyTriggersHttp
                = new FunctionsScaleAndConcurrencyTriggersHttp();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("perInstanceConcurrency".equals(fieldName)) {
                    deserializedFunctionsScaleAndConcurrencyTriggersHttp.perInstanceConcurrency
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFunctionsScaleAndConcurrencyTriggersHttp;
        });
    }
}
