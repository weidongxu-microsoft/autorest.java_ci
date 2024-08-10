// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DatabaseInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ReadOnlyFollowingDatabaseProperties;
import java.io.IOException;
import java.time.Duration;

/**
 * Class representing a read only following database.
 */
@Fluent
public final class ReadOnlyFollowingDatabase extends DatabaseInner {
    /*
     * Kind of the database
     */
    private Kind kind = Kind.READ_ONLY_FOLLOWING;

    /*
     * The database properties.
     */
    private ReadOnlyFollowingDatabaseProperties innerProperties;

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
     * Creates an instance of ReadOnlyFollowingDatabase class.
     */
    public ReadOnlyFollowingDatabase() {
    }

    /**
     * Get the kind property: Kind of the database.
     * 
     * @return the kind value.
     */
    @Override
    public Kind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: The database properties.
     * 
     * @return the innerProperties value.
     */
    private ReadOnlyFollowingDatabaseProperties innerProperties() {
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
    public ReadOnlyFollowingDatabase withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the softDeletePeriod property: The time the data should be kept before it stops being accessible to queries
     * in TimeSpan.
     * 
     * @return the softDeletePeriod value.
     */
    public Duration softDeletePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().softDeletePeriod();
    }

    /**
     * Get the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     * @return the hotCachePeriod value.
     */
    public Duration hotCachePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().hotCachePeriod();
    }

    /**
     * Set the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     * @param hotCachePeriod the hotCachePeriod value to set.
     * @return the ReadOnlyFollowingDatabase object itself.
     */
    public ReadOnlyFollowingDatabase withHotCachePeriod(Duration hotCachePeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReadOnlyFollowingDatabaseProperties();
        }
        this.innerProperties().withHotCachePeriod(hotCachePeriod);
        return this;
    }

    /**
     * Get the statistics property: The statistics of the database.
     * 
     * @return the statistics value.
     */
    public DatabaseStatistics statistics() {
        return this.innerProperties() == null ? null : this.innerProperties().statistics();
    }

    /**
     * Get the leaderClusterResourceId property: The name of the leader cluster.
     * 
     * @return the leaderClusterResourceId value.
     */
    public String leaderClusterResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().leaderClusterResourceId();
    }

    /**
     * Get the attachedDatabaseConfigurationName property: The name of the attached database configuration cluster.
     * 
     * @return the attachedDatabaseConfigurationName value.
     */
    public String attachedDatabaseConfigurationName() {
        return this.innerProperties() == null ? null : this.innerProperties().attachedDatabaseConfigurationName();
    }

    /**
     * Get the principalsModificationKind property: The principals modification kind of the database.
     * 
     * @return the principalsModificationKind value.
     */
    public PrincipalsModificationKind principalsModificationKind() {
        return this.innerProperties() == null ? null : this.innerProperties().principalsModificationKind();
    }

    /**
     * Get the tableLevelSharingProperties property: Table level sharing specifications.
     * 
     * @return the tableLevelSharingProperties value.
     */
    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().tableLevelSharingProperties();
    }

    /**
     * Get the originalDatabaseName property: The original database name, before databaseNameOverride or
     * databaseNamePrefix where applied.
     * 
     * @return the originalDatabaseName value.
     */
    public String originalDatabaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().originalDatabaseName();
    }

    /**
     * Get the databaseShareOrigin property: The origin of the following setup.
     * 
     * @return the databaseShareOrigin value.
     */
    public DatabaseShareOrigin databaseShareOrigin() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseShareOrigin();
    }

    /**
     * Get the suspensionDetails property: The database suspension details. If the database is suspended, this object
     * contains information related to the database's suspension state.
     * 
     * @return the suspensionDetails value.
     */
    public SuspensionDetails suspensionDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().suspensionDetails();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReadOnlyFollowingDatabase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReadOnlyFollowingDatabase if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReadOnlyFollowingDatabase.
     */
    public static ReadOnlyFollowingDatabase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReadOnlyFollowingDatabase deserializedReadOnlyFollowingDatabase = new ReadOnlyFollowingDatabase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedReadOnlyFollowingDatabase.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedReadOnlyFollowingDatabase.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedReadOnlyFollowingDatabase.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedReadOnlyFollowingDatabase.withLocation(reader.getString());
                } else if ("kind".equals(fieldName)) {
                    deserializedReadOnlyFollowingDatabase.kind = Kind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedReadOnlyFollowingDatabase.innerProperties
                        = ReadOnlyFollowingDatabaseProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReadOnlyFollowingDatabase;
        });
    }
}
