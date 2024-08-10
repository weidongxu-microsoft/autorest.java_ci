// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.IotHubConnectionProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Class representing an iot hub data connection.
 */
@Fluent
public final class IotHubDataConnection extends DataConnectionInner {
    /*
     * Kind of the endpoint for the data connection
     */
    private DataConnectionKind kind = DataConnectionKind.IOT_HUB;

    /*
     * The Iot Hub data connection properties.
     */
    private IotHubConnectionProperties innerProperties;

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
     * Creates an instance of IotHubDataConnection class.
     */
    public IotHubDataConnection() {
    }

    /**
     * Get the kind property: Kind of the endpoint for the data connection.
     * 
     * @return the kind value.
     */
    @Override
    public DataConnectionKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: The Iot Hub data connection properties.
     * 
     * @return the innerProperties value.
     */
    private IotHubConnectionProperties innerProperties() {
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
    public IotHubDataConnection withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the iotHubResourceId property: The resource ID of the Iot hub to be used to create a data connection.
     * 
     * @return the iotHubResourceId value.
     */
    public String iotHubResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().iotHubResourceId();
    }

    /**
     * Set the iotHubResourceId property: The resource ID of the Iot hub to be used to create a data connection.
     * 
     * @param iotHubResourceId the iotHubResourceId value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withIotHubResourceId(String iotHubResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withIotHubResourceId(iotHubResourceId);
        return this;
    }

    /**
     * Get the consumerGroup property: The iot hub consumer group.
     * 
     * @return the consumerGroup value.
     */
    public String consumerGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().consumerGroup();
    }

    /**
     * Set the consumerGroup property: The iot hub consumer group.
     * 
     * @param consumerGroup the consumerGroup value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withConsumerGroup(String consumerGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withConsumerGroup(consumerGroup);
        return this;
    }

    /**
     * Get the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     * 
     * @return the tableName value.
     */
    public String tableName() {
        return this.innerProperties() == null ? null : this.innerProperties().tableName();
    }

    /**
     * Set the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     * 
     * @param tableName the tableName value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withTableName(String tableName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     * 
     * @return the mappingRuleName value.
     */
    public String mappingRuleName() {
        return this.innerProperties() == null ? null : this.innerProperties().mappingRuleName();
    }

    /**
     * Set the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     * 
     * @param mappingRuleName the mappingRuleName value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withMappingRuleName(String mappingRuleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withMappingRuleName(mappingRuleName);
        return this;
    }

    /**
     * Get the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     * 
     * @return the dataFormat value.
     */
    public IotHubDataFormat dataFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().dataFormat();
    }

    /**
     * Set the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     * 
     * @param dataFormat the dataFormat value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withDataFormat(IotHubDataFormat dataFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withDataFormat(dataFormat);
        return this;
    }

    /**
     * Get the eventSystemProperties property: System properties of the iot hub.
     * 
     * @return the eventSystemProperties value.
     */
    public List<String> eventSystemProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().eventSystemProperties();
    }

    /**
     * Set the eventSystemProperties property: System properties of the iot hub.
     * 
     * @param eventSystemProperties the eventSystemProperties value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withEventSystemProperties(List<String> eventSystemProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withEventSystemProperties(eventSystemProperties);
        return this;
    }

    /**
     * Get the sharedAccessPolicyName property: The name of the share access policy.
     * 
     * @return the sharedAccessPolicyName value.
     */
    public String sharedAccessPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedAccessPolicyName();
    }

    /**
     * Set the sharedAccessPolicyName property: The name of the share access policy.
     * 
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withSharedAccessPolicyName(String sharedAccessPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withSharedAccessPolicyName(sharedAccessPolicyName);
        return this;
    }

    /**
     * Get the databaseRouting property: Indication for database routing information from the data connection, by
     * default only database routing information is allowed.
     * 
     * @return the databaseRouting value.
     */
    public DatabaseRouting databaseRouting() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseRouting();
    }

    /**
     * Set the databaseRouting property: Indication for database routing information from the data connection, by
     * default only database routing information is allowed.
     * 
     * @param databaseRouting the databaseRouting value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withDatabaseRouting(DatabaseRouting databaseRouting) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withDatabaseRouting(databaseRouting);
        return this;
    }

    /**
     * Get the retrievalStartDate property: When defined, the data connection retrieves existing Event hub events
     * created since the Retrieval start date. It can only retrieve events retained by the Event hub, based on its
     * retention period.
     * 
     * @return the retrievalStartDate value.
     */
    public OffsetDateTime retrievalStartDate() {
        return this.innerProperties() == null ? null : this.innerProperties().retrievalStartDate();
    }

    /**
     * Set the retrievalStartDate property: When defined, the data connection retrieves existing Event hub events
     * created since the Retrieval start date. It can only retrieve events retained by the Event hub, based on its
     * retention period.
     * 
     * @param retrievalStartDate the retrievalStartDate value to set.
     * @return the IotHubDataConnection object itself.
     */
    public IotHubDataConnection withRetrievalStartDate(OffsetDateTime retrievalStartDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IotHubConnectionProperties();
        }
        this.innerProperties().withRetrievalStartDate(retrievalStartDate);
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
     * Reads an instance of IotHubDataConnection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IotHubDataConnection if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IotHubDataConnection.
     */
    public static IotHubDataConnection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IotHubDataConnection deserializedIotHubDataConnection = new IotHubDataConnection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedIotHubDataConnection.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedIotHubDataConnection.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIotHubDataConnection.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedIotHubDataConnection.withLocation(reader.getString());
                } else if ("kind".equals(fieldName)) {
                    deserializedIotHubDataConnection.kind = DataConnectionKind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedIotHubDataConnection.innerProperties = IotHubConnectionProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIotHubDataConnection;
        });
    }
}
