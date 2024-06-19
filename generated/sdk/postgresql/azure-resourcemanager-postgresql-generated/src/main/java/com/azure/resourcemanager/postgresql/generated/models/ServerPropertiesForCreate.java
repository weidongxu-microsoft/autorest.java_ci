// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties used to create a new server.
 */
@Fluent
public class ServerPropertiesForCreate implements JsonSerializable<ServerPropertiesForCreate> {
    /*
     * The mode to create a new server.
     */
    private CreateMode createMode = CreateMode.fromString("ServerPropertiesForCreate");

    /*
     * Server version.
     */
    private ServerVersion version;

    /*
     * Enable ssl enforcement or not when connect to server.
     */
    private SslEnforcementEnum sslEnforcement;

    /*
     * Enforce a minimal Tls version for the server.
     */
    private MinimalTlsVersionEnum minimalTlsVersion;

    /*
     * Status showing whether the server enabled infrastructure encryption.
     */
    private InfrastructureEncryption infrastructureEncryption;

    /*
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be
     * 'Enabled' or 'Disabled'
     */
    private PublicNetworkAccessEnum publicNetworkAccess;

    /*
     * Storage profile of a server.
     */
    private StorageProfile storageProfile;

    /**
     * Creates an instance of ServerPropertiesForCreate class.
     */
    public ServerPropertiesForCreate() {
    }

    /**
     * Get the createMode property: The mode to create a new server.
     * 
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Get the version property: Server version.
     * 
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: Server version.
     * 
     * @param version the version value to set.
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     * 
     * @return the sslEnforcement value.
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     * 
     * @param sslEnforcement the sslEnforcement value to set.
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     * 
     * @return the minimalTlsVersion value.
     */
    public MinimalTlsVersionEnum minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     * 
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Get the infrastructureEncryption property: Status showing whether the server enabled infrastructure encryption.
     * 
     * @return the infrastructureEncryption value.
     */
    public InfrastructureEncryption infrastructureEncryption() {
        return this.infrastructureEncryption;
    }

    /**
     * Set the infrastructureEncryption property: Status showing whether the server enabled infrastructure encryption.
     * 
     * @param infrastructureEncryption the infrastructureEncryption value to set.
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withInfrastructureEncryption(InfrastructureEncryption infrastructureEncryption) {
        this.infrastructureEncryption = infrastructureEncryption;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessEnum publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the storageProfile property: Storage profile of a server.
     * 
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Storage profile of a server.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("createMode", this.createMode == null ? null : this.createMode.toString());
        jsonWriter.writeStringField("version", this.version == null ? null : this.version.toString());
        jsonWriter.writeStringField("sslEnforcement",
            this.sslEnforcement == null ? null : this.sslEnforcement.toString());
        jsonWriter.writeStringField("minimalTlsVersion",
            this.minimalTlsVersion == null ? null : this.minimalTlsVersion.toString());
        jsonWriter.writeStringField("infrastructureEncryption",
            this.infrastructureEncryption == null ? null : this.infrastructureEncryption.toString());
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        jsonWriter.writeJsonField("storageProfile", this.storageProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerPropertiesForCreate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerPropertiesForCreate if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServerPropertiesForCreate.
     */
    public static ServerPropertiesForCreate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("createMode".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Default".equals(discriminatorValue)) {
                    return ServerPropertiesForDefaultCreate.fromJson(readerToUse.reset());
                } else if ("PointInTimeRestore".equals(discriminatorValue)) {
                    return ServerPropertiesForRestore.fromJson(readerToUse.reset());
                } else if ("GeoRestore".equals(discriminatorValue)) {
                    return ServerPropertiesForGeoRestore.fromJson(readerToUse.reset());
                } else if ("Replica".equals(discriminatorValue)) {
                    return ServerPropertiesForReplica.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static ServerPropertiesForCreate fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerPropertiesForCreate deserializedServerPropertiesForCreate = new ServerPropertiesForCreate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createMode".equals(fieldName)) {
                    deserializedServerPropertiesForCreate.createMode = CreateMode.fromString(reader.getString());
                } else if ("version".equals(fieldName)) {
                    deserializedServerPropertiesForCreate.version = ServerVersion.fromString(reader.getString());
                } else if ("sslEnforcement".equals(fieldName)) {
                    deserializedServerPropertiesForCreate.sslEnforcement
                        = SslEnforcementEnum.fromString(reader.getString());
                } else if ("minimalTlsVersion".equals(fieldName)) {
                    deserializedServerPropertiesForCreate.minimalTlsVersion
                        = MinimalTlsVersionEnum.fromString(reader.getString());
                } else if ("infrastructureEncryption".equals(fieldName)) {
                    deserializedServerPropertiesForCreate.infrastructureEncryption
                        = InfrastructureEncryption.fromString(reader.getString());
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedServerPropertiesForCreate.publicNetworkAccess
                        = PublicNetworkAccessEnum.fromString(reader.getString());
                } else if ("storageProfile".equals(fieldName)) {
                    deserializedServerPropertiesForCreate.storageProfile = StorageProfile.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerPropertiesForCreate;
        });
    }
}
