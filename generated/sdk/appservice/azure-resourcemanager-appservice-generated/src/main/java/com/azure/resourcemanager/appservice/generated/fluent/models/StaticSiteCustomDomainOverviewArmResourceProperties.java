// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.CustomDomainStatus;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * StaticSiteCustomDomainOverviewARMResource resource specific properties.
 */
@Immutable
public final class StaticSiteCustomDomainOverviewArmResourceProperties
    implements JsonSerializable<StaticSiteCustomDomainOverviewArmResourceProperties> {
    /*
     * The domain name for the static site custom domain.
     */
    private String domainName;

    /*
     * The date and time on which the custom domain was created for the static site.
     */
    private OffsetDateTime createdOn;

    /*
     * The status of the custom domain
     */
    private CustomDomainStatus status;

    /*
     * The TXT record validation token
     */
    private String validationToken;

    /*
     * The errorMessage property.
     */
    private String errorMessage;

    /**
     * Creates an instance of StaticSiteCustomDomainOverviewArmResourceProperties class.
     */
    public StaticSiteCustomDomainOverviewArmResourceProperties() {
    }

    /**
     * Get the domainName property: The domain name for the static site custom domain.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get the createdOn property: The date and time on which the custom domain was created for the static site.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the status property: The status of the custom domain.
     * 
     * @return the status value.
     */
    public CustomDomainStatus status() {
        return this.status;
    }

    /**
     * Get the validationToken property: The TXT record validation token.
     * 
     * @return the validationToken value.
     */
    public String validationToken() {
        return this.validationToken;
    }

    /**
     * Get the errorMessage property: The errorMessage property.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteCustomDomainOverviewArmResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteCustomDomainOverviewArmResourceProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticSiteCustomDomainOverviewArmResourceProperties.
     */
    public static StaticSiteCustomDomainOverviewArmResourceProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteCustomDomainOverviewArmResourceProperties deserializedStaticSiteCustomDomainOverviewArmResourceProperties
                = new StaticSiteCustomDomainOverviewArmResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domainName".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceProperties.domainName = reader.getString();
                } else if ("createdOn".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceProperties.createdOn = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("status".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceProperties.status
                        = CustomDomainStatus.fromString(reader.getString());
                } else if ("validationToken".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceProperties.validationToken
                        = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedStaticSiteCustomDomainOverviewArmResourceProperties.errorMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteCustomDomainOverviewArmResourceProperties;
        });
    }
}
