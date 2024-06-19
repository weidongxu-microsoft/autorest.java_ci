// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyCurveName;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyOperation;
import com.azure.resourcemanager.keyvault.generated.models.JsonWebKeyType;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmKeyAttributes;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmKeyReleasePolicy;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsmRotationPolicy;
import java.io.IOException;
import java.util.List;

/**
 * The properties of the key.
 */
@Fluent
public final class ManagedHsmKeyProperties implements JsonSerializable<ManagedHsmKeyProperties> {
    /*
     * The attributes of the key.
     */
    private ManagedHsmKeyAttributes attributes;

    /*
     * The type of the key. For valid values, see JsonWebKeyType.
     */
    private JsonWebKeyType kty;

    /*
     * The keyOps property.
     */
    private List<JsonWebKeyOperation> keyOps;

    /*
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     */
    private Integer keySize;

    /*
     * The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     */
    private JsonWebKeyCurveName curveName;

    /*
     * The URI to retrieve the current version of the key.
     */
    private String keyUri;

    /*
     * The URI to retrieve the specific version of the key.
     */
    private String keyUriWithVersion;

    /*
     * Key rotation policy in response. It will be used for both output and input. Omitted if empty
     */
    private ManagedHsmRotationPolicy rotationPolicy;

    /*
     * Key release policy in response. It will be used for both output and input. Omitted if empty
     */
    private ManagedHsmKeyReleasePolicy releasePolicy;

    /**
     * Creates an instance of ManagedHsmKeyProperties class.
     */
    public ManagedHsmKeyProperties() {
    }

    /**
     * Get the attributes property: The attributes of the key.
     * 
     * @return the attributes value.
     */
    public ManagedHsmKeyAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The attributes of the key.
     * 
     * @param attributes the attributes value to set.
     * @return the ManagedHsmKeyProperties object itself.
     */
    public ManagedHsmKeyProperties withAttributes(ManagedHsmKeyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the kty property: The type of the key. For valid values, see JsonWebKeyType.
     * 
     * @return the kty value.
     */
    public JsonWebKeyType kty() {
        return this.kty;
    }

    /**
     * Set the kty property: The type of the key. For valid values, see JsonWebKeyType.
     * 
     * @param kty the kty value to set.
     * @return the ManagedHsmKeyProperties object itself.
     */
    public ManagedHsmKeyProperties withKty(JsonWebKeyType kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get the keyOps property: The keyOps property.
     * 
     * @return the keyOps value.
     */
    public List<JsonWebKeyOperation> keyOps() {
        return this.keyOps;
    }

    /**
     * Set the keyOps property: The keyOps property.
     * 
     * @param keyOps the keyOps value to set.
     * @return the ManagedHsmKeyProperties object itself.
     */
    public ManagedHsmKeyProperties withKeyOps(List<JsonWebKeyOperation> keyOps) {
        this.keyOps = keyOps;
        return this;
    }

    /**
     * Get the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     * @param keySize the keySize value to set.
     * @return the ManagedHsmKeyProperties object itself.
     */
    public ManagedHsmKeyProperties withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the curveName property: The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     * @return the curveName value.
     */
    public JsonWebKeyCurveName curveName() {
        return this.curveName;
    }

    /**
     * Set the curveName property: The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     * @param curveName the curveName value to set.
     * @return the ManagedHsmKeyProperties object itself.
     */
    public ManagedHsmKeyProperties withCurveName(JsonWebKeyCurveName curveName) {
        this.curveName = curveName;
        return this;
    }

    /**
     * Get the keyUri property: The URI to retrieve the current version of the key.
     * 
     * @return the keyUri value.
     */
    public String keyUri() {
        return this.keyUri;
    }

    /**
     * Get the keyUriWithVersion property: The URI to retrieve the specific version of the key.
     * 
     * @return the keyUriWithVersion value.
     */
    public String keyUriWithVersion() {
        return this.keyUriWithVersion;
    }

    /**
     * Get the rotationPolicy property: Key rotation policy in response. It will be used for both output and input.
     * Omitted if empty.
     * 
     * @return the rotationPolicy value.
     */
    public ManagedHsmRotationPolicy rotationPolicy() {
        return this.rotationPolicy;
    }

    /**
     * Set the rotationPolicy property: Key rotation policy in response. It will be used for both output and input.
     * Omitted if empty.
     * 
     * @param rotationPolicy the rotationPolicy value to set.
     * @return the ManagedHsmKeyProperties object itself.
     */
    public ManagedHsmKeyProperties withRotationPolicy(ManagedHsmRotationPolicy rotationPolicy) {
        this.rotationPolicy = rotationPolicy;
        return this;
    }

    /**
     * Get the releasePolicy property: Key release policy in response. It will be used for both output and input.
     * Omitted if empty.
     * 
     * @return the releasePolicy value.
     */
    public ManagedHsmKeyReleasePolicy releasePolicy() {
        return this.releasePolicy;
    }

    /**
     * Set the releasePolicy property: Key release policy in response. It will be used for both output and input.
     * Omitted if empty.
     * 
     * @param releasePolicy the releasePolicy value to set.
     * @return the ManagedHsmKeyProperties object itself.
     */
    public ManagedHsmKeyProperties withReleasePolicy(ManagedHsmKeyReleasePolicy releasePolicy) {
        this.releasePolicy = releasePolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attributes() != null) {
            attributes().validate();
        }
        if (rotationPolicy() != null) {
            rotationPolicy().validate();
        }
        if (releasePolicy() != null) {
            releasePolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("attributes", this.attributes);
        jsonWriter.writeStringField("kty", this.kty == null ? null : this.kty.toString());
        jsonWriter.writeArrayField("keyOps", this.keyOps,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeNumberField("keySize", this.keySize);
        jsonWriter.writeStringField("curveName", this.curveName == null ? null : this.curveName.toString());
        jsonWriter.writeJsonField("rotationPolicy", this.rotationPolicy);
        jsonWriter.writeJsonField("release_policy", this.releasePolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedHsmKeyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedHsmKeyProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedHsmKeyProperties.
     */
    public static ManagedHsmKeyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedHsmKeyProperties deserializedManagedHsmKeyProperties = new ManagedHsmKeyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("attributes".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.attributes = ManagedHsmKeyAttributes.fromJson(reader);
                } else if ("kty".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.kty = JsonWebKeyType.fromString(reader.getString());
                } else if ("keyOps".equals(fieldName)) {
                    List<JsonWebKeyOperation> keyOps
                        = reader.readArray(reader1 -> JsonWebKeyOperation.fromString(reader1.getString()));
                    deserializedManagedHsmKeyProperties.keyOps = keyOps;
                } else if ("keySize".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.keySize = reader.getNullable(JsonReader::getInt);
                } else if ("curveName".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.curveName = JsonWebKeyCurveName.fromString(reader.getString());
                } else if ("keyUri".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.keyUri = reader.getString();
                } else if ("keyUriWithVersion".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.keyUriWithVersion = reader.getString();
                } else if ("rotationPolicy".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.rotationPolicy = ManagedHsmRotationPolicy.fromJson(reader);
                } else if ("release_policy".equals(fieldName)) {
                    deserializedManagedHsmKeyProperties.releasePolicy = ManagedHsmKeyReleasePolicy.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedHsmKeyProperties;
        });
    }
}
