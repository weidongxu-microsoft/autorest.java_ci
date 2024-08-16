// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Certificate details representing the Vault credentials for AAD.
 */
@Fluent
public final class ResourceCertificateAndAadDetails extends ResourceCertificateDetails {
    /*
     * AAD tenant authority.
     */
    private String aadAuthority;

    /*
     * AAD tenant Id.
     */
    private String aadTenantId;

    /*
     * AAD service principal clientId.
     */
    private String servicePrincipalClientId;

    /*
     * AAD service principal ObjectId.
     */
    private String servicePrincipalObjectId;

    /*
     * Azure Management Endpoint Audience.
     */
    private String azureManagementEndpointAudience;

    /*
     * Service Resource Id.
     */
    private String serviceResourceId;

    /*
     * AAD audience for the resource
     */
    private String aadAudience;

    /**
     * Creates an instance of ResourceCertificateAndAadDetails class.
     */
    public ResourceCertificateAndAadDetails() {
        this.authType = "AzureActiveDirectory";
    }

    /**
     * Get the aadAuthority property: AAD tenant authority.
     * 
     * @return the aadAuthority value.
     */
    public String aadAuthority() {
        return this.aadAuthority;
    }

    /**
     * Set the aadAuthority property: AAD tenant authority.
     * 
     * @param aadAuthority the aadAuthority value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withAadAuthority(String aadAuthority) {
        this.aadAuthority = aadAuthority;
        return this;
    }

    /**
     * Get the aadTenantId property: AAD tenant Id.
     * 
     * @return the aadTenantId value.
     */
    public String aadTenantId() {
        return this.aadTenantId;
    }

    /**
     * Set the aadTenantId property: AAD tenant Id.
     * 
     * @param aadTenantId the aadTenantId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withAadTenantId(String aadTenantId) {
        this.aadTenantId = aadTenantId;
        return this;
    }

    /**
     * Get the servicePrincipalClientId property: AAD service principal clientId.
     * 
     * @return the servicePrincipalClientId value.
     */
    public String servicePrincipalClientId() {
        return this.servicePrincipalClientId;
    }

    /**
     * Set the servicePrincipalClientId property: AAD service principal clientId.
     * 
     * @param servicePrincipalClientId the servicePrincipalClientId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withServicePrincipalClientId(String servicePrincipalClientId) {
        this.servicePrincipalClientId = servicePrincipalClientId;
        return this;
    }

    /**
     * Get the servicePrincipalObjectId property: AAD service principal ObjectId.
     * 
     * @return the servicePrincipalObjectId value.
     */
    public String servicePrincipalObjectId() {
        return this.servicePrincipalObjectId;
    }

    /**
     * Set the servicePrincipalObjectId property: AAD service principal ObjectId.
     * 
     * @param servicePrincipalObjectId the servicePrincipalObjectId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withServicePrincipalObjectId(String servicePrincipalObjectId) {
        this.servicePrincipalObjectId = servicePrincipalObjectId;
        return this;
    }

    /**
     * Get the azureManagementEndpointAudience property: Azure Management Endpoint Audience.
     * 
     * @return the azureManagementEndpointAudience value.
     */
    public String azureManagementEndpointAudience() {
        return this.azureManagementEndpointAudience;
    }

    /**
     * Set the azureManagementEndpointAudience property: Azure Management Endpoint Audience.
     * 
     * @param azureManagementEndpointAudience the azureManagementEndpointAudience value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails
        withAzureManagementEndpointAudience(String azureManagementEndpointAudience) {
        this.azureManagementEndpointAudience = azureManagementEndpointAudience;
        return this;
    }

    /**
     * Get the serviceResourceId property: Service Resource Id.
     * 
     * @return the serviceResourceId value.
     */
    public String serviceResourceId() {
        return this.serviceResourceId;
    }

    /**
     * Set the serviceResourceId property: Service Resource Id.
     * 
     * @param serviceResourceId the serviceResourceId value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withServiceResourceId(String serviceResourceId) {
        this.serviceResourceId = serviceResourceId;
        return this;
    }

    /**
     * Get the aadAudience property: AAD audience for the resource.
     * 
     * @return the aadAudience value.
     */
    public String aadAudience() {
        return this.aadAudience;
    }

    /**
     * Set the aadAudience property: AAD audience for the resource.
     * 
     * @param aadAudience the aadAudience value to set.
     * @return the ResourceCertificateAndAadDetails object itself.
     */
    public ResourceCertificateAndAadDetails withAadAudience(String aadAudience) {
        this.aadAudience = aadAudience;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withCertificate(byte[] certificate) {
        super.withCertificate(certificate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withIssuer(String issuer) {
        super.withIssuer(issuer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withResourceId(Long resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withSubject(String subject) {
        super.withSubject(subject);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withThumbprint(String thumbprint) {
        super.withThumbprint(thumbprint);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withValidFrom(OffsetDateTime validFrom) {
        super.withValidFrom(validFrom);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceCertificateAndAadDetails withValidTo(OffsetDateTime validTo) {
        super.withValidTo(validTo);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (aadAuthority() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property aadAuthority in model ResourceCertificateAndAadDetails"));
        }
        if (aadTenantId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property aadTenantId in model ResourceCertificateAndAadDetails"));
        }
        if (servicePrincipalClientId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property servicePrincipalClientId in model ResourceCertificateAndAadDetails"));
        }
        if (servicePrincipalObjectId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property servicePrincipalObjectId in model ResourceCertificateAndAadDetails"));
        }
        if (azureManagementEndpointAudience() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property azureManagementEndpointAudience in model ResourceCertificateAndAadDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceCertificateAndAadDetails.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeStringField("aadAuthority", this.aadAuthority);
        jsonWriter.writeStringField("aadTenantId", this.aadTenantId);
        jsonWriter.writeStringField("servicePrincipalClientId", this.servicePrincipalClientId);
        jsonWriter.writeStringField("servicePrincipalObjectId", this.servicePrincipalObjectId);
        jsonWriter.writeStringField("azureManagementEndpointAudience", this.azureManagementEndpointAudience);
        jsonWriter.writeStringField("serviceResourceId", this.serviceResourceId);
        jsonWriter.writeStringField("aadAudience", this.aadAudience);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceCertificateAndAadDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceCertificateAndAadDetails if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceCertificateAndAadDetails.
     */
    public static ResourceCertificateAndAadDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceCertificateAndAadDetails deserializedResourceCertificateAndAadDetails
                = new ResourceCertificateAndAadDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificate".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.withCertificate(reader.getBinary());
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.withFriendlyName(reader.getString());
                } else if ("issuer".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.withIssuer(reader.getString());
                } else if ("resourceId".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails
                        .withResourceId(reader.getNullable(JsonReader::getLong));
                } else if ("subject".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.withSubject(reader.getString());
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.withThumbprint(reader.getString());
                } else if ("validFrom".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.withValidFrom(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("validTo".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.withValidTo(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("aadAuthority".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.aadAuthority = reader.getString();
                } else if ("aadTenantId".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.aadTenantId = reader.getString();
                } else if ("servicePrincipalClientId".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.servicePrincipalClientId = reader.getString();
                } else if ("servicePrincipalObjectId".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.servicePrincipalObjectId = reader.getString();
                } else if ("azureManagementEndpointAudience".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.azureManagementEndpointAudience = reader.getString();
                } else if ("authType".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.authType = reader.getString();
                } else if ("serviceResourceId".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.serviceResourceId = reader.getString();
                } else if ("aadAudience".equals(fieldName)) {
                    deserializedResourceCertificateAndAadDetails.aadAudience = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceCertificateAndAadDetails;
        });
    }
}
