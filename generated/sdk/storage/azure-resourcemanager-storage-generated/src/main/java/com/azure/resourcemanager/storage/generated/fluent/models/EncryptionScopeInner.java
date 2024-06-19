// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeKeyVaultProperties;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeSource;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeState;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The Encryption Scope resource.
 */
@Fluent
public final class EncryptionScopeInner extends ProxyResource {
    /*
     * Properties of the encryption scope.
     */
    private EncryptionScopeProperties innerEncryptionScopeProperties;

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

    /**
     * Creates an instance of EncryptionScopeInner class.
     */
    public EncryptionScopeInner() {
    }

    /**
     * Get the innerEncryptionScopeProperties property: Properties of the encryption scope.
     * 
     * @return the innerEncryptionScopeProperties value.
     */
    private EncryptionScopeProperties innerEncryptionScopeProperties() {
        return this.innerEncryptionScopeProperties;
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
     * Get the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     * 
     * @return the source value.
     */
    public EncryptionScopeSource source() {
        return this.innerEncryptionScopeProperties() == null ? null : this.innerEncryptionScopeProperties().source();
    }

    /**
     * Set the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     * 
     * @param source the source value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withSource(EncryptionScopeSource source) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withSource(source);
        return this;
    }

    /**
     * Get the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     * 
     * @return the state value.
     */
    public EncryptionScopeState state() {
        return this.innerEncryptionScopeProperties() == null ? null : this.innerEncryptionScopeProperties().state();
    }

    /**
     * Set the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     * 
     * @param state the state value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withState(EncryptionScopeState state) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withState(state);
        return this;
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the encryption scope in UTC.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().creationTime();
    }

    /**
     * Get the lastModifiedTime property: Gets the last modification date and time of the encryption scope in UTC.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().lastModifiedTime();
    }

    /**
     * Get the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     * @return the keyVaultProperties value.
     */
    public EncryptionScopeKeyVaultProperties keyVaultProperties() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().keyVaultProperties();
    }

    /**
     * Set the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withKeyVaultProperties(keyVaultProperties);
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     * 
     * @return the requireInfrastructureEncryption value.
     */
    public Boolean requireInfrastructureEncryption() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().requireInfrastructureEncryption();
    }

    /**
     * Set the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     * 
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withRequireInfrastructureEncryption(requireInfrastructureEncryption);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerEncryptionScopeProperties() != null) {
            innerEncryptionScopeProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerEncryptionScopeProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionScopeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionScopeInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EncryptionScopeInner.
     */
    public static EncryptionScopeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionScopeInner deserializedEncryptionScopeInner = new EncryptionScopeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedEncryptionScopeInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedEncryptionScopeInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedEncryptionScopeInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedEncryptionScopeInner.innerEncryptionScopeProperties
                        = EncryptionScopeProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionScopeInner;
        });
    }
}
