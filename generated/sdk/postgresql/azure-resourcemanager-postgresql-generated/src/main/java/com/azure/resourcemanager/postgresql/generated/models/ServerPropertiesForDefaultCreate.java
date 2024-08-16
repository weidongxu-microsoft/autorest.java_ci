// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties used to create a new server.
 */
@Fluent
public final class ServerPropertiesForDefaultCreate extends ServerPropertiesForCreate {
    /*
     * The administrator's login name of a server. Can only be specified when the server is being created (and is
     * required for creation).
     */
    private String administratorLogin;

    /*
     * The password of the administrator login.
     */
    private String administratorLoginPassword;

    /**
     * Creates an instance of ServerPropertiesForDefaultCreate class.
     */
    public ServerPropertiesForDefaultCreate() {
        this.createMode = CreateMode.DEFAULT;
    }

    /**
     * Get the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     * 
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     * 
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerPropertiesForDefaultCreate object itself.
     */
    public ServerPropertiesForDefaultCreate withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     * 
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     * 
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerPropertiesForDefaultCreate object itself.
     */
    public ServerPropertiesForDefaultCreate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForDefaultCreate withVersion(ServerVersion version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForDefaultCreate withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        super.withSslEnforcement(sslEnforcement);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForDefaultCreate withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        super.withMinimalTlsVersion(minimalTlsVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForDefaultCreate
        withInfrastructureEncryption(InfrastructureEncryption infrastructureEncryption) {
        super.withInfrastructureEncryption(infrastructureEncryption);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForDefaultCreate withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerPropertiesForDefaultCreate withStorageProfile(StorageProfile storageProfile) {
        super.withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (administratorLogin() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property administratorLogin in model ServerPropertiesForDefaultCreate"));
        }
        if (administratorLoginPassword() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property administratorLoginPassword in model ServerPropertiesForDefaultCreate"));
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerPropertiesForDefaultCreate.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeStringField("administratorLogin", this.administratorLogin);
        jsonWriter.writeStringField("administratorLoginPassword", this.administratorLoginPassword);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerPropertiesForDefaultCreate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerPropertiesForDefaultCreate if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerPropertiesForDefaultCreate.
     */
    public static ServerPropertiesForDefaultCreate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerPropertiesForDefaultCreate deserializedServerPropertiesForDefaultCreate
                = new ServerPropertiesForDefaultCreate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate
                        .withVersion(ServerVersion.fromString(reader.getString()));
                } else if ("sslEnforcement".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate
                        .withSslEnforcement(SslEnforcementEnum.fromString(reader.getString()));
                } else if ("minimalTlsVersion".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate
                        .withMinimalTlsVersion(MinimalTlsVersionEnum.fromString(reader.getString()));
                } else if ("infrastructureEncryption".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate
                        .withInfrastructureEncryption(InfrastructureEncryption.fromString(reader.getString()));
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate
                        .withPublicNetworkAccess(PublicNetworkAccessEnum.fromString(reader.getString()));
                } else if ("storageProfile".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate.withStorageProfile(StorageProfile.fromJson(reader));
                } else if ("administratorLogin".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate.administratorLogin = reader.getString();
                } else if ("administratorLoginPassword".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate.administratorLoginPassword = reader.getString();
                } else if ("createMode".equals(fieldName)) {
                    deserializedServerPropertiesForDefaultCreate.createMode = CreateMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerPropertiesForDefaultCreate;
        });
    }
}
