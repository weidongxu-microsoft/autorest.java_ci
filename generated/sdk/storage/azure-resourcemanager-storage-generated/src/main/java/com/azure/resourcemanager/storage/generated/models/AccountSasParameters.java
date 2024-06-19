// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The parameters to list SAS credentials of a storage account.
 */
@Fluent
public final class AccountSasParameters implements JsonSerializable<AccountSasParameters> {
    /*
     * The signed services accessible with the account SAS. Possible values include: Blob (b), Queue (q), Table (t),
     * File (f).
     */
    private Services services;

    /*
     * The signed resource types that are accessible with the account SAS. Service (s): Access to service-level APIs;
     * Container (c): Access to container-level APIs; Object (o): Access to object-level APIs for blobs, queue messages,
     * table entities, and files.
     */
    private SignedResourceTypes resourceTypes;

    /*
     * The signed permissions for the account SAS. Possible values include: Read (r), Write (w), Delete (d), List (l),
     * Add (a), Create (c), Update (u) and Process (p).
     */
    private Permissions permissions;

    /*
     * An IP address or a range of IP addresses from which to accept requests.
     */
    private String ipAddressOrRange;

    /*
     * The protocol permitted for a request made with the account SAS.
     */
    private HttpProtocol protocols;

    /*
     * The time at which the SAS becomes valid.
     */
    private OffsetDateTime sharedAccessStartTime;

    /*
     * The time at which the shared access signature becomes invalid.
     */
    private OffsetDateTime sharedAccessExpiryTime;

    /*
     * The key to sign the account SAS token with.
     */
    private String keyToSign;

    /**
     * Creates an instance of AccountSasParameters class.
     */
    public AccountSasParameters() {
    }

    /**
     * Get the services property: The signed services accessible with the account SAS. Possible values include: Blob
     * (b), Queue (q), Table (t), File (f).
     * 
     * @return the services value.
     */
    public Services services() {
        return this.services;
    }

    /**
     * Set the services property: The signed services accessible with the account SAS. Possible values include: Blob
     * (b), Queue (q), Table (t), File (f).
     * 
     * @param services the services value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withServices(Services services) {
        this.services = services;
        return this;
    }

    /**
     * Get the resourceTypes property: The signed resource types that are accessible with the account SAS. Service (s):
     * Access to service-level APIs; Container (c): Access to container-level APIs; Object (o): Access to object-level
     * APIs for blobs, queue messages, table entities, and files.
     * 
     * @return the resourceTypes value.
     */
    public SignedResourceTypes resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes property: The signed resource types that are accessible with the account SAS. Service (s):
     * Access to service-level APIs; Container (c): Access to container-level APIs; Object (o): Access to object-level
     * APIs for blobs, queue messages, table entities, and files.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withResourceTypes(SignedResourceTypes resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the permissions property: The signed permissions for the account SAS. Possible values include: Read (r),
     * Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     * 
     * @return the permissions value.
     */
    public Permissions permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The signed permissions for the account SAS. Possible values include: Read (r),
     * Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     * 
     * @param permissions the permissions value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withPermissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the ipAddressOrRange property: An IP address or a range of IP addresses from which to accept requests.
     * 
     * @return the ipAddressOrRange value.
     */
    public String ipAddressOrRange() {
        return this.ipAddressOrRange;
    }

    /**
     * Set the ipAddressOrRange property: An IP address or a range of IP addresses from which to accept requests.
     * 
     * @param ipAddressOrRange the ipAddressOrRange value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withIpAddressOrRange(String ipAddressOrRange) {
        this.ipAddressOrRange = ipAddressOrRange;
        return this;
    }

    /**
     * Get the protocols property: The protocol permitted for a request made with the account SAS.
     * 
     * @return the protocols value.
     */
    public HttpProtocol protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: The protocol permitted for a request made with the account SAS.
     * 
     * @param protocols the protocols value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withProtocols(HttpProtocol protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the sharedAccessStartTime property: The time at which the SAS becomes valid.
     * 
     * @return the sharedAccessStartTime value.
     */
    public OffsetDateTime sharedAccessStartTime() {
        return this.sharedAccessStartTime;
    }

    /**
     * Set the sharedAccessStartTime property: The time at which the SAS becomes valid.
     * 
     * @param sharedAccessStartTime the sharedAccessStartTime value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withSharedAccessStartTime(OffsetDateTime sharedAccessStartTime) {
        this.sharedAccessStartTime = sharedAccessStartTime;
        return this;
    }

    /**
     * Get the sharedAccessExpiryTime property: The time at which the shared access signature becomes invalid.
     * 
     * @return the sharedAccessExpiryTime value.
     */
    public OffsetDateTime sharedAccessExpiryTime() {
        return this.sharedAccessExpiryTime;
    }

    /**
     * Set the sharedAccessExpiryTime property: The time at which the shared access signature becomes invalid.
     * 
     * @param sharedAccessExpiryTime the sharedAccessExpiryTime value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withSharedAccessExpiryTime(OffsetDateTime sharedAccessExpiryTime) {
        this.sharedAccessExpiryTime = sharedAccessExpiryTime;
        return this;
    }

    /**
     * Get the keyToSign property: The key to sign the account SAS token with.
     * 
     * @return the keyToSign value.
     */
    public String keyToSign() {
        return this.keyToSign;
    }

    /**
     * Set the keyToSign property: The key to sign the account SAS token with.
     * 
     * @param keyToSign the keyToSign value to set.
     * @return the AccountSasParameters object itself.
     */
    public AccountSasParameters withKeyToSign(String keyToSign) {
        this.keyToSign = keyToSign;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (services() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property services in model AccountSasParameters"));
        }
        if (resourceTypes() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resourceTypes in model AccountSasParameters"));
        }
        if (permissions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property permissions in model AccountSasParameters"));
        }
        if (sharedAccessExpiryTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sharedAccessExpiryTime in model AccountSasParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AccountSasParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("signedServices", this.services == null ? null : this.services.toString());
        jsonWriter.writeStringField("signedResourceTypes",
            this.resourceTypes == null ? null : this.resourceTypes.toString());
        jsonWriter.writeStringField("signedPermission", this.permissions == null ? null : this.permissions.toString());
        jsonWriter.writeStringField("signedExpiry",
            this.sharedAccessExpiryTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.sharedAccessExpiryTime));
        jsonWriter.writeStringField("signedIp", this.ipAddressOrRange);
        jsonWriter.writeStringField("signedProtocol", this.protocols == null ? null : this.protocols.toString());
        jsonWriter.writeStringField("signedStart",
            this.sharedAccessStartTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.sharedAccessStartTime));
        jsonWriter.writeStringField("keyToSign", this.keyToSign);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountSasParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountSasParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AccountSasParameters.
     */
    public static AccountSasParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountSasParameters deserializedAccountSasParameters = new AccountSasParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("signedServices".equals(fieldName)) {
                    deserializedAccountSasParameters.services = Services.fromString(reader.getString());
                } else if ("signedResourceTypes".equals(fieldName)) {
                    deserializedAccountSasParameters.resourceTypes = SignedResourceTypes.fromString(reader.getString());
                } else if ("signedPermission".equals(fieldName)) {
                    deserializedAccountSasParameters.permissions = Permissions.fromString(reader.getString());
                } else if ("signedExpiry".equals(fieldName)) {
                    deserializedAccountSasParameters.sharedAccessExpiryTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("signedIp".equals(fieldName)) {
                    deserializedAccountSasParameters.ipAddressOrRange = reader.getString();
                } else if ("signedProtocol".equals(fieldName)) {
                    deserializedAccountSasParameters.protocols = HttpProtocol.fromString(reader.getString());
                } else if ("signedStart".equals(fieldName)) {
                    deserializedAccountSasParameters.sharedAccessStartTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("keyToSign".equals(fieldName)) {
                    deserializedAccountSasParameters.keyToSign = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountSasParameters;
        });
    }
}
