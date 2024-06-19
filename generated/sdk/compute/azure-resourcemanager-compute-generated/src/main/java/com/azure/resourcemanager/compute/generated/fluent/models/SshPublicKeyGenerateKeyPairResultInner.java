// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response from generation of an SSH key pair.
 */
@Fluent
public final class SshPublicKeyGenerateKeyPairResultInner
    implements JsonSerializable<SshPublicKeyGenerateKeyPairResultInner> {
    /*
     * Private key portion of the key pair used to authenticate to a virtual machine through ssh. The private key is
     * returned in RFC3447 format and should be treated as a secret.
     */
    private String privateKey;

    /*
     * Public key portion of the key pair used to authenticate to a virtual machine through ssh. The public key is in
     * ssh-rsa format.
     */
    private String publicKey;

    /*
     * The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{
     * SshPublicKeyName}
     */
    private String id;

    /**
     * Creates an instance of SshPublicKeyGenerateKeyPairResultInner class.
     */
    public SshPublicKeyGenerateKeyPairResultInner() {
    }

    /**
     * Get the privateKey property: Private key portion of the key pair used to authenticate to a virtual machine
     * through ssh. The private key is returned in RFC3447 format and should be treated as a secret.
     * 
     * @return the privateKey value.
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: Private key portion of the key pair used to authenticate to a virtual machine
     * through ssh. The private key is returned in RFC3447 format and should be treated as a secret.
     * 
     * @param privateKey the privateKey value to set.
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the publicKey property: Public key portion of the key pair used to authenticate to a virtual machine through
     * ssh. The public key is in ssh-rsa format.
     * 
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: Public key portion of the key pair used to authenticate to a virtual machine through
     * ssh. The public key is in ssh-rsa format.
     * 
     * @param publicKey the publicKey value to set.
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the id property: The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}.
     * 
     * @param id the id value to set.
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateKey() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property privateKey in model SshPublicKeyGenerateKeyPairResultInner"));
        }
        if (publicKey() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publicKey in model SshPublicKeyGenerateKeyPairResultInner"));
        }
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property id in model SshPublicKeyGenerateKeyPairResultInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SshPublicKeyGenerateKeyPairResultInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("privateKey", this.privateKey);
        jsonWriter.writeStringField("publicKey", this.publicKey);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SshPublicKeyGenerateKeyPairResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SshPublicKeyGenerateKeyPairResultInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SshPublicKeyGenerateKeyPairResultInner.
     */
    public static SshPublicKeyGenerateKeyPairResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SshPublicKeyGenerateKeyPairResultInner deserializedSshPublicKeyGenerateKeyPairResultInner
                = new SshPublicKeyGenerateKeyPairResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateKey".equals(fieldName)) {
                    deserializedSshPublicKeyGenerateKeyPairResultInner.privateKey = reader.getString();
                } else if ("publicKey".equals(fieldName)) {
                    deserializedSshPublicKeyGenerateKeyPairResultInner.publicKey = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedSshPublicKeyGenerateKeyPairResultInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSshPublicKeyGenerateKeyPairResultInner;
        });
    }
}
