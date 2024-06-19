// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.AdminRule;
import com.azure.resourcemanager.network.generated.models.AdminRuleKind;
import com.azure.resourcemanager.network.generated.models.ChildResource;
import com.azure.resourcemanager.network.generated.models.DefaultAdminRule;
import java.io.IOException;

/**
 * Network base admin rule.
 */
@Immutable
public class BaseAdminRuleInner extends ChildResource {
    /*
     * Whether the rule is custom or default.
     */
    private AdminRuleKind kind = AdminRuleKind.fromString("BaseAdminRule");

    /*
     * The system metadata related to this resource.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of BaseAdminRuleInner class.
     */
    public BaseAdminRuleInner() {
    }

    /**
     * Get the kind property: Whether the rule is custom or default.
     * 
     * @return the kind value.
     */
    public AdminRuleKind kind() {
        return this.kind;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: The system metadata related to this resource.
     * 
     * @param systemData the systemData value to set.
     * @return the BaseAdminRuleInner object itself.
     */
    BaseAdminRuleInner withSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    @Override
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BaseAdminRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BaseAdminRuleInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BaseAdminRuleInner.
     */
    public static BaseAdminRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Custom".equals(discriminatorValue)) {
                    return AdminRule.fromJson(readerToUse.reset());
                } else if ("Default".equals(discriminatorValue)) {
                    return DefaultAdminRule.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static BaseAdminRuleInner fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BaseAdminRuleInner deserializedBaseAdminRuleInner = new BaseAdminRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBaseAdminRuleInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBaseAdminRuleInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBaseAdminRuleInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedBaseAdminRuleInner.etag = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedBaseAdminRuleInner.kind = AdminRuleKind.fromString(reader.getString());
                } else if ("systemData".equals(fieldName)) {
                    deserializedBaseAdminRuleInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBaseAdminRuleInner;
        });
    }
}
