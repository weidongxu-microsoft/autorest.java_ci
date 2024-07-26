// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains the IpTag associated with the public IP address.
 */
@Fluent
public final class IpTag implements JsonSerializable<IpTag> {
    /*
     * Gets or sets the ipTag type: Example FirstPartyUsage.
     */
    private String ipTagType;

    /*
     * Gets or sets value of the IpTag associated with the public IP. Example HDInsight, SQL, Storage etc
     */
    private String tag;

    /**
     * Creates an instance of IpTag class.
     */
    public IpTag() {
    }

    /**
     * Get the ipTagType property: Gets or sets the ipTag type: Example FirstPartyUsage.
     * 
     * @return the ipTagType value.
     */
    public String ipTagType() {
        return this.ipTagType;
    }

    /**
     * Set the ipTagType property: Gets or sets the ipTag type: Example FirstPartyUsage.
     * 
     * @param ipTagType the ipTagType value to set.
     * @return the IpTag object itself.
     */
    public IpTag withIpTagType(String ipTagType) {
        this.ipTagType = ipTagType;
        return this;
    }

    /**
     * Get the tag property: Gets or sets value of the IpTag associated with the public IP. Example HDInsight, SQL,
     * Storage etc.
     * 
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: Gets or sets value of the IpTag associated with the public IP. Example HDInsight, SQL,
     * Storage etc.
     * 
     * @param tag the tag value to set.
     * @return the IpTag object itself.
     */
    public IpTag withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipTagType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ipTagType in model IpTag"));
        }
        if (tag() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property tag in model IpTag"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpTag.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ipTagType", this.ipTagType);
        jsonWriter.writeStringField("tag", this.tag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpTag from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpTag if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IpTag.
     */
    public static IpTag fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpTag deserializedIpTag = new IpTag();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipTagType".equals(fieldName)) {
                    deserializedIpTag.ipTagType = reader.getString();
                } else if ("tag".equals(fieldName)) {
                    deserializedIpTag.tag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpTag;
        });
    }
}
