// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iothub.generated.models.TestResultStatus;
import com.azure.resourcemanager.iothub.generated.models.TestRouteResultDetails;
import java.io.IOException;

/**
 * Result of testing one route.
 */
@Fluent
public final class TestRouteResultInner implements JsonSerializable<TestRouteResultInner> {
    /*
     * Result of testing route
     */
    private TestResultStatus result;

    /*
     * Detailed result of testing route
     */
    private TestRouteResultDetails details;

    /**
     * Creates an instance of TestRouteResultInner class.
     */
    public TestRouteResultInner() {
    }

    /**
     * Get the result property: Result of testing route.
     * 
     * @return the result value.
     */
    public TestResultStatus result() {
        return this.result;
    }

    /**
     * Set the result property: Result of testing route.
     * 
     * @param result the result value to set.
     * @return the TestRouteResultInner object itself.
     */
    public TestRouteResultInner withResult(TestResultStatus result) {
        this.result = result;
        return this;
    }

    /**
     * Get the details property: Detailed result of testing route.
     * 
     * @return the details value.
     */
    public TestRouteResultDetails details() {
        return this.details;
    }

    /**
     * Set the details property: Detailed result of testing route.
     * 
     * @param details the details value to set.
     * @return the TestRouteResultInner object itself.
     */
    public TestRouteResultInner withDetails(TestRouteResultDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("result", this.result == null ? null : this.result.toString());
        jsonWriter.writeJsonField("details", this.details);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TestRouteResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TestRouteResultInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TestRouteResultInner.
     */
    public static TestRouteResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TestRouteResultInner deserializedTestRouteResultInner = new TestRouteResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("result".equals(fieldName)) {
                    deserializedTestRouteResultInner.result = TestResultStatus.fromString(reader.getString());
                } else if ("details".equals(fieldName)) {
                    deserializedTestRouteResultInner.details = TestRouteResultDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTestRouteResultInner;
        });
    }
}
