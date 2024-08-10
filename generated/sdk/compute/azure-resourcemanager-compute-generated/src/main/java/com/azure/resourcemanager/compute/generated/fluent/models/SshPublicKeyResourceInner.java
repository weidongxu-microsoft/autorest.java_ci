// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Specifies information about the SSH public key.
 */
@Fluent
public final class SshPublicKeyResourceInner extends Resource {
    /*
     * Properties of the SSH public key.
     */
    private SshPublicKeyResourceProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SshPublicKeyResourceInner class.
     */
    public SshPublicKeyResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the SSH public key.
     * 
     * @return the innerProperties value.
     */
    private SshPublicKeyResourceProperties innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public SshPublicKeyResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SshPublicKeyResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the publicKey property: SSH public key used to authenticate to a virtual machine through ssh. If this
     * property is not initially provided when the resource is created, the publicKey property will be populated when
     * generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to
     * be at least 2048-bit and in ssh-rsa format.
     * 
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.innerProperties() == null ? null : this.innerProperties().publicKey();
    }

    /**
     * Set the publicKey property: SSH public key used to authenticate to a virtual machine through ssh. If this
     * property is not initially provided when the resource is created, the publicKey property will be populated when
     * generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to
     * be at least 2048-bit and in ssh-rsa format.
     * 
     * @param publicKey the publicKey value to set.
     * @return the SshPublicKeyResourceInner object itself.
     */
    public SshPublicKeyResourceInner withPublicKey(String publicKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SshPublicKeyResourceProperties();
        }
        this.innerProperties().withPublicKey(publicKey);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model SshPublicKeyResourceInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SshPublicKeyResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SshPublicKeyResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SshPublicKeyResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SshPublicKeyResourceInner.
     */
    public static SshPublicKeyResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SshPublicKeyResourceInner deserializedSshPublicKeyResourceInner = new SshPublicKeyResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSshPublicKeyResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSshPublicKeyResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSshPublicKeyResourceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSshPublicKeyResourceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSshPublicKeyResourceInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedSshPublicKeyResourceInner.innerProperties
                        = SshPublicKeyResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSshPublicKeyResourceInner;
        });
    }
}
