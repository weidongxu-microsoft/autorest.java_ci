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
 * Body of the error response returned from the API.
 */
@Fluent
public final class ErrorEntity implements JsonSerializable<ErrorEntity> {
    /*
     * Type of error.
     */
    private String extendedCode;

    /*
     * Message template.
     */
    private String messageTemplate;

    /*
     * Parameters for the template.
     */
    private List<String> parameters;

    /*
     * Inner errors.
     */
    private List<ErrorEntity> innerErrors;

    /*
     * Error Details.
     */
    private List<ErrorEntity> details;

    /*
     * The error target.
     */
    private String target;

    /*
     * Basic error code.
     */
    private String code;

    /*
     * Any details of the error.
     */
    private String message;

    /**
     * Creates an instance of ErrorEntity class.
     */
    public ErrorEntity() {
    }

    /**
     * Get the extendedCode property: Type of error.
     * 
     * @return the extendedCode value.
     */
    public String extendedCode() {
        return this.extendedCode;
    }

    /**
     * Set the extendedCode property: Type of error.
     * 
     * @param extendedCode the extendedCode value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withExtendedCode(String extendedCode) {
        this.extendedCode = extendedCode;
        return this;
    }

    /**
     * Get the messageTemplate property: Message template.
     * 
     * @return the messageTemplate value.
     */
    public String messageTemplate() {
        return this.messageTemplate;
    }

    /**
     * Set the messageTemplate property: Message template.
     * 
     * @param messageTemplate the messageTemplate value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withMessageTemplate(String messageTemplate) {
        this.messageTemplate = messageTemplate;
        return this;
    }

    /**
     * Get the parameters property: Parameters for the template.
     * 
     * @return the parameters value.
     */
    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters for the template.
     * 
     * @param parameters the parameters value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withParameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the innerErrors property: Inner errors.
     * 
     * @return the innerErrors value.
     */
    public List<ErrorEntity> innerErrors() {
        return this.innerErrors;
    }

    /**
     * Set the innerErrors property: Inner errors.
     * 
     * @param innerErrors the innerErrors value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withInnerErrors(List<ErrorEntity> innerErrors) {
        this.innerErrors = innerErrors;
        return this;
    }

    /**
     * Get the details property: Error Details.
     * 
     * @return the details value.
     */
    public List<ErrorEntity> details() {
        return this.details;
    }

    /**
     * Set the details property: Error Details.
     * 
     * @param details the details value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withDetails(List<ErrorEntity> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the target property: The error target.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The error target.
     * 
     * @param target the target value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the code property: Basic error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Basic error code.
     * 
     * @param code the code value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Any details of the error.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Any details of the error.
     * 
     * @param message the message value to set.
     * @return the ErrorEntity object itself.
     */
    public ErrorEntity withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerErrors() != null) {
            innerErrors().forEach(e -> e.validate());
        }
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("extendedCode", this.extendedCode);
        jsonWriter.writeStringField("messageTemplate", this.messageTemplate);
        jsonWriter.writeArrayField("parameters", this.parameters, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("innerErrors", this.innerErrors, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("details", this.details, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("target", this.target);
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ErrorEntity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorEntity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ErrorEntity.
     */
    public static ErrorEntity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorEntity deserializedErrorEntity = new ErrorEntity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("extendedCode".equals(fieldName)) {
                    deserializedErrorEntity.extendedCode = reader.getString();
                } else if ("messageTemplate".equals(fieldName)) {
                    deserializedErrorEntity.messageTemplate = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    List<String> parameters = reader.readArray(reader1 -> reader1.getString());
                    deserializedErrorEntity.parameters = parameters;
                } else if ("innerErrors".equals(fieldName)) {
                    List<ErrorEntity> innerErrors = reader.readArray(reader1 -> ErrorEntity.fromJson(reader1));
                    deserializedErrorEntity.innerErrors = innerErrors;
                } else if ("details".equals(fieldName)) {
                    List<ErrorEntity> details = reader.readArray(reader1 -> ErrorEntity.fromJson(reader1));
                    deserializedErrorEntity.details = details;
                } else if ("target".equals(fieldName)) {
                    deserializedErrorEntity.target = reader.getString();
                } else if ("code".equals(fieldName)) {
                    deserializedErrorEntity.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedErrorEntity.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorEntity;
        });
    }
}
