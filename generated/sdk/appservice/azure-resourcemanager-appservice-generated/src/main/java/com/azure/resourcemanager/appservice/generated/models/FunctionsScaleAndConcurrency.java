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
 * Scale and concurrency settings for the function app.
 */
@Fluent
public final class FunctionsScaleAndConcurrency implements JsonSerializable<FunctionsScaleAndConcurrency> {
    /*
     * 'Always Ready' configuration for the function app.
     */
    private List<FunctionsAlwaysReadyConfig> alwaysReady;

    /*
     * The maximum number of instances for the function app.
     */
    private Integer maximumInstanceCount;

    /*
     * Set the amount of memory allocated to each instance of the function app in MB. CPU and network bandwidth are
     * allocated proportionally.
     */
    private Integer instanceMemoryMB;

    /*
     * Scale and concurrency settings for the function app triggers.
     */
    private FunctionsScaleAndConcurrencyTriggers triggers;

    /**
     * Creates an instance of FunctionsScaleAndConcurrency class.
     */
    public FunctionsScaleAndConcurrency() {
    }

    /**
     * Get the alwaysReady property: 'Always Ready' configuration for the function app.
     * 
     * @return the alwaysReady value.
     */
    public List<FunctionsAlwaysReadyConfig> alwaysReady() {
        return this.alwaysReady;
    }

    /**
     * Set the alwaysReady property: 'Always Ready' configuration for the function app.
     * 
     * @param alwaysReady the alwaysReady value to set.
     * @return the FunctionsScaleAndConcurrency object itself.
     */
    public FunctionsScaleAndConcurrency withAlwaysReady(List<FunctionsAlwaysReadyConfig> alwaysReady) {
        this.alwaysReady = alwaysReady;
        return this;
    }

    /**
     * Get the maximumInstanceCount property: The maximum number of instances for the function app.
     * 
     * @return the maximumInstanceCount value.
     */
    public Integer maximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    /**
     * Set the maximumInstanceCount property: The maximum number of instances for the function app.
     * 
     * @param maximumInstanceCount the maximumInstanceCount value to set.
     * @return the FunctionsScaleAndConcurrency object itself.
     */
    public FunctionsScaleAndConcurrency withMaximumInstanceCount(Integer maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }

    /**
     * Get the instanceMemoryMB property: Set the amount of memory allocated to each instance of the function app in MB.
     * CPU and network bandwidth are allocated proportionally.
     * 
     * @return the instanceMemoryMB value.
     */
    public Integer instanceMemoryMB() {
        return this.instanceMemoryMB;
    }

    /**
     * Set the instanceMemoryMB property: Set the amount of memory allocated to each instance of the function app in MB.
     * CPU and network bandwidth are allocated proportionally.
     * 
     * @param instanceMemoryMB the instanceMemoryMB value to set.
     * @return the FunctionsScaleAndConcurrency object itself.
     */
    public FunctionsScaleAndConcurrency withInstanceMemoryMB(Integer instanceMemoryMB) {
        this.instanceMemoryMB = instanceMemoryMB;
        return this;
    }

    /**
     * Get the triggers property: Scale and concurrency settings for the function app triggers.
     * 
     * @return the triggers value.
     */
    public FunctionsScaleAndConcurrencyTriggers triggers() {
        return this.triggers;
    }

    /**
     * Set the triggers property: Scale and concurrency settings for the function app triggers.
     * 
     * @param triggers the triggers value to set.
     * @return the FunctionsScaleAndConcurrency object itself.
     */
    public FunctionsScaleAndConcurrency withTriggers(FunctionsScaleAndConcurrencyTriggers triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alwaysReady() != null) {
            alwaysReady().forEach(e -> e.validate());
        }
        if (triggers() != null) {
            triggers().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("alwaysReady", this.alwaysReady, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("maximumInstanceCount", this.maximumInstanceCount);
        jsonWriter.writeNumberField("instanceMemoryMB", this.instanceMemoryMB);
        jsonWriter.writeJsonField("triggers", this.triggers);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionsScaleAndConcurrency from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionsScaleAndConcurrency if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionsScaleAndConcurrency.
     */
    public static FunctionsScaleAndConcurrency fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionsScaleAndConcurrency deserializedFunctionsScaleAndConcurrency = new FunctionsScaleAndConcurrency();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alwaysReady".equals(fieldName)) {
                    List<FunctionsAlwaysReadyConfig> alwaysReady
                        = reader.readArray(reader1 -> FunctionsAlwaysReadyConfig.fromJson(reader1));
                    deserializedFunctionsScaleAndConcurrency.alwaysReady = alwaysReady;
                } else if ("maximumInstanceCount".equals(fieldName)) {
                    deserializedFunctionsScaleAndConcurrency.maximumInstanceCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("instanceMemoryMB".equals(fieldName)) {
                    deserializedFunctionsScaleAndConcurrency.instanceMemoryMB = reader.getNullable(JsonReader::getInt);
                } else if ("triggers".equals(fieldName)) {
                    deserializedFunctionsScaleAndConcurrency.triggers
                        = FunctionsScaleAndConcurrencyTriggers.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFunctionsScaleAndConcurrency;
        });
    }
}
