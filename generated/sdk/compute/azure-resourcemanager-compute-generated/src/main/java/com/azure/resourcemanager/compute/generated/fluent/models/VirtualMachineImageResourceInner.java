// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import java.io.IOException;
import java.util.Map;

/**
 * Virtual machine image resource information.
 */
@Fluent
public class VirtualMachineImageResourceInner extends SubResource {
    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The supported Azure location of the resource.
     */
    private String location;

    /*
     * Specifies the tags that are assigned to the virtual machine. For more information about using tags, see [Using
     * tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     */
    private Map<String, String> tags;

    /*
     * The extended location of the Virtual Machine.
     */
    private ExtendedLocation extendedLocation;

    /**
     * Creates an instance of VirtualMachineImageResourceInner class.
     */
    public VirtualMachineImageResourceInner() {
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     * 
     * @param name the name value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: The supported Azure location of the resource.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The supported Azure location of the resource.
     * 
     * @param location the location value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Specifies the tags that are assigned to the virtual machine. For more information about
     * using tags, see [Using tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Specifies the tags that are assigned to the virtual machine. For more information about
     * using tags, see [Using tags to organize your Azure
     * resources](https://docs.microsoft.com/azure/azure-resource-manager/resource-group-using-tags.md).
     * 
     * @param tags the tags value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location of the Virtual Machine.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the Virtual Machine.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualMachineImageResourceInner object itself.
     */
    public VirtualMachineImageResourceInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineImageResourceInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model VirtualMachineImageResourceInner"));
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model VirtualMachineImageResourceInner"));
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineImageResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("extendedLocation", this.extendedLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineImageResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineImageResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualMachineImageResourceInner.
     */
    public static VirtualMachineImageResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineImageResourceInner deserializedVirtualMachineImageResourceInner
                = new VirtualMachineImageResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVirtualMachineImageResourceInner.withId(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedVirtualMachineImageResourceInner.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedVirtualMachineImageResourceInner.location = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVirtualMachineImageResourceInner.tags = tags;
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedVirtualMachineImageResourceInner.extendedLocation = ExtendedLocation.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineImageResourceInner;
        });
    }
}
