// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.Contact;
import com.azure.resourcemanager.appservice.generated.models.DnsType;
import com.azure.resourcemanager.appservice.generated.models.DomainPurchaseConsent;
import com.azure.resourcemanager.appservice.generated.models.DomainStatus;
import com.azure.resourcemanager.appservice.generated.models.Hostname;
import com.azure.resourcemanager.appservice.generated.models.ProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.ResourceNotRenewableReason;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Domain resource specific properties.
 */
@Fluent
public final class DomainProperties implements JsonSerializable<DomainProperties> {
    /*
     * Administrative contact.
     */
    private Contact contactAdmin;

    /*
     * Billing contact.
     */
    private Contact contactBilling;

    /*
     * Registrant contact.
     */
    private Contact contactRegistrant;

    /*
     * Technical contact.
     */
    private Contact contactTech;

    /*
     * Domain registration status.
     */
    private DomainStatus registrationStatus;

    /*
     * Domain provisioning state.
     */
    private ProvisioningState provisioningState;

    /*
     * Name servers.
     */
    private List<String> nameServers;

    /*
     * <code>true</code> if domain privacy is enabled for this domain; otherwise, <code>false</code>.
     */
    private Boolean privacy;

    /*
     * Domain creation timestamp.
     */
    private OffsetDateTime createdTime;

    /*
     * Domain expiration timestamp.
     */
    private OffsetDateTime expirationTime;

    /*
     * Timestamp when the domain was renewed last time.
     */
    private OffsetDateTime lastRenewedTime;

    /*
     * <code>true</code> if the domain should be automatically renewed; otherwise, <code>false</code>.
     */
    private Boolean autoRenew;

    /*
     * <code>true</code> if Azure can assign this domain to App Service apps; otherwise, <code>false</code>. This value
     * will be <code>true</code> if domain registration status is active and
     * it is hosted on name servers Azure has programmatic access to.
     */
    private Boolean readyForDnsRecordManagement;

    /*
     * All hostnames derived from the domain and assigned to Azure resources.
     */
    private List<Hostname> managedHostNames;

    /*
     * Legal agreement consent.
     */
    private DomainPurchaseConsent consent;

    /*
     * Reasons why domain is not renewable.
     */
    private List<ResourceNotRenewableReason> domainNotRenewableReasons;

    /*
     * Current DNS type
     */
    private DnsType dnsType;

    /*
     * Azure DNS Zone to use
     */
    private String dnsZoneId;

    /*
     * Target DNS type (would be used for migration)
     */
    private DnsType targetDnsType;

    /*
     * The authCode property.
     */
    private String authCode;

    /**
     * Creates an instance of DomainProperties class.
     */
    public DomainProperties() {
    }

    /**
     * Get the contactAdmin property: Administrative contact.
     * 
     * @return the contactAdmin value.
     */
    public Contact contactAdmin() {
        return this.contactAdmin;
    }

    /**
     * Set the contactAdmin property: Administrative contact.
     * 
     * @param contactAdmin the contactAdmin value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withContactAdmin(Contact contactAdmin) {
        this.contactAdmin = contactAdmin;
        return this;
    }

    /**
     * Get the contactBilling property: Billing contact.
     * 
     * @return the contactBilling value.
     */
    public Contact contactBilling() {
        return this.contactBilling;
    }

    /**
     * Set the contactBilling property: Billing contact.
     * 
     * @param contactBilling the contactBilling value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withContactBilling(Contact contactBilling) {
        this.contactBilling = contactBilling;
        return this;
    }

    /**
     * Get the contactRegistrant property: Registrant contact.
     * 
     * @return the contactRegistrant value.
     */
    public Contact contactRegistrant() {
        return this.contactRegistrant;
    }

    /**
     * Set the contactRegistrant property: Registrant contact.
     * 
     * @param contactRegistrant the contactRegistrant value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withContactRegistrant(Contact contactRegistrant) {
        this.contactRegistrant = contactRegistrant;
        return this;
    }

    /**
     * Get the contactTech property: Technical contact.
     * 
     * @return the contactTech value.
     */
    public Contact contactTech() {
        return this.contactTech;
    }

    /**
     * Set the contactTech property: Technical contact.
     * 
     * @param contactTech the contactTech value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withContactTech(Contact contactTech) {
        this.contactTech = contactTech;
        return this;
    }

    /**
     * Get the registrationStatus property: Domain registration status.
     * 
     * @return the registrationStatus value.
     */
    public DomainStatus registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Get the provisioningState property: Domain provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the nameServers property: Name servers.
     * 
     * @return the nameServers value.
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Get the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the privacy value.
     */
    public Boolean privacy() {
        return this.privacy;
    }

    /**
     * Set the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param privacy the privacy value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withPrivacy(Boolean privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get the createdTime property: Domain creation timestamp.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the expirationTime property: Domain expiration timestamp.
     * 
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the lastRenewedTime property: Timestamp when the domain was renewed last time.
     * 
     * @return the lastRenewedTime value.
     */
    public OffsetDateTime lastRenewedTime() {
        return this.lastRenewedTime;
    }

    /**
     * Get the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param autoRenew the autoRenew value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the readyForDnsRecordManagement property: &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to
     * App Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will be &lt;code&gt;true&lt;/code&gt; if
     * domain registration status is active and
     * it is hosted on name servers Azure has programmatic access to.
     * 
     * @return the readyForDnsRecordManagement value.
     */
    public Boolean readyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }

    /**
     * Get the managedHostNames property: All hostnames derived from the domain and assigned to Azure resources.
     * 
     * @return the managedHostNames value.
     */
    public List<Hostname> managedHostNames() {
        return this.managedHostNames;
    }

    /**
     * Get the consent property: Legal agreement consent.
     * 
     * @return the consent value.
     */
    public DomainPurchaseConsent consent() {
        return this.consent;
    }

    /**
     * Set the consent property: Legal agreement consent.
     * 
     * @param consent the consent value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withConsent(DomainPurchaseConsent consent) {
        this.consent = consent;
        return this;
    }

    /**
     * Get the domainNotRenewableReasons property: Reasons why domain is not renewable.
     * 
     * @return the domainNotRenewableReasons value.
     */
    public List<ResourceNotRenewableReason> domainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }

    /**
     * Get the dnsType property: Current DNS type.
     * 
     * @return the dnsType value.
     */
    public DnsType dnsType() {
        return this.dnsType;
    }

    /**
     * Set the dnsType property: Current DNS type.
     * 
     * @param dnsType the dnsType value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withDnsType(DnsType dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /**
     * Get the dnsZoneId property: Azure DNS Zone to use.
     * 
     * @return the dnsZoneId value.
     */
    public String dnsZoneId() {
        return this.dnsZoneId;
    }

    /**
     * Set the dnsZoneId property: Azure DNS Zone to use.
     * 
     * @param dnsZoneId the dnsZoneId value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withDnsZoneId(String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
        return this;
    }

    /**
     * Get the targetDnsType property: Target DNS type (would be used for migration).
     * 
     * @return the targetDnsType value.
     */
    public DnsType targetDnsType() {
        return this.targetDnsType;
    }

    /**
     * Set the targetDnsType property: Target DNS type (would be used for migration).
     * 
     * @param targetDnsType the targetDnsType value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withTargetDnsType(DnsType targetDnsType) {
        this.targetDnsType = targetDnsType;
        return this;
    }

    /**
     * Get the authCode property: The authCode property.
     * 
     * @return the authCode value.
     */
    public String authCode() {
        return this.authCode;
    }

    /**
     * Set the authCode property: The authCode property.
     * 
     * @param authCode the authCode value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactAdmin() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property contactAdmin in model DomainProperties"));
        } else {
            contactAdmin().validate();
        }
        if (contactBilling() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property contactBilling in model DomainProperties"));
        } else {
            contactBilling().validate();
        }
        if (contactRegistrant() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property contactRegistrant in model DomainProperties"));
        } else {
            contactRegistrant().validate();
        }
        if (contactTech() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property contactTech in model DomainProperties"));
        } else {
            contactTech().validate();
        }
        if (managedHostNames() != null) {
            managedHostNames().forEach(e -> e.validate());
        }
        if (consent() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property consent in model DomainProperties"));
        } else {
            consent().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DomainProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("contactAdmin", this.contactAdmin);
        jsonWriter.writeJsonField("contactBilling", this.contactBilling);
        jsonWriter.writeJsonField("contactRegistrant", this.contactRegistrant);
        jsonWriter.writeJsonField("contactTech", this.contactTech);
        jsonWriter.writeJsonField("consent", this.consent);
        jsonWriter.writeBooleanField("privacy", this.privacy);
        jsonWriter.writeBooleanField("autoRenew", this.autoRenew);
        jsonWriter.writeStringField("dnsType", this.dnsType == null ? null : this.dnsType.toString());
        jsonWriter.writeStringField("dnsZoneId", this.dnsZoneId);
        jsonWriter.writeStringField("targetDnsType", this.targetDnsType == null ? null : this.targetDnsType.toString());
        jsonWriter.writeStringField("authCode", this.authCode);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DomainProperties.
     */
    public static DomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainProperties deserializedDomainProperties = new DomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("contactAdmin".equals(fieldName)) {
                    deserializedDomainProperties.contactAdmin = Contact.fromJson(reader);
                } else if ("contactBilling".equals(fieldName)) {
                    deserializedDomainProperties.contactBilling = Contact.fromJson(reader);
                } else if ("contactRegistrant".equals(fieldName)) {
                    deserializedDomainProperties.contactRegistrant = Contact.fromJson(reader);
                } else if ("contactTech".equals(fieldName)) {
                    deserializedDomainProperties.contactTech = Contact.fromJson(reader);
                } else if ("consent".equals(fieldName)) {
                    deserializedDomainProperties.consent = DomainPurchaseConsent.fromJson(reader);
                } else if ("registrationStatus".equals(fieldName)) {
                    deserializedDomainProperties.registrationStatus = DomainStatus.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDomainProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("nameServers".equals(fieldName)) {
                    List<String> nameServers = reader.readArray(reader1 -> reader1.getString());
                    deserializedDomainProperties.nameServers = nameServers;
                } else if ("privacy".equals(fieldName)) {
                    deserializedDomainProperties.privacy = reader.getNullable(JsonReader::getBoolean);
                } else if ("createdTime".equals(fieldName)) {
                    deserializedDomainProperties.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expirationTime".equals(fieldName)) {
                    deserializedDomainProperties.expirationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastRenewedTime".equals(fieldName)) {
                    deserializedDomainProperties.lastRenewedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("autoRenew".equals(fieldName)) {
                    deserializedDomainProperties.autoRenew = reader.getNullable(JsonReader::getBoolean);
                } else if ("readyForDnsRecordManagement".equals(fieldName)) {
                    deserializedDomainProperties.readyForDnsRecordManagement
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("managedHostNames".equals(fieldName)) {
                    List<Hostname> managedHostNames = reader.readArray(reader1 -> Hostname.fromJson(reader1));
                    deserializedDomainProperties.managedHostNames = managedHostNames;
                } else if ("domainNotRenewableReasons".equals(fieldName)) {
                    List<ResourceNotRenewableReason> domainNotRenewableReasons
                        = reader.readArray(reader1 -> ResourceNotRenewableReason.fromString(reader1.getString()));
                    deserializedDomainProperties.domainNotRenewableReasons = domainNotRenewableReasons;
                } else if ("dnsType".equals(fieldName)) {
                    deserializedDomainProperties.dnsType = DnsType.fromString(reader.getString());
                } else if ("dnsZoneId".equals(fieldName)) {
                    deserializedDomainProperties.dnsZoneId = reader.getString();
                } else if ("targetDnsType".equals(fieldName)) {
                    deserializedDomainProperties.targetDnsType = DnsType.fromString(reader.getString());
                } else if ("authCode".equals(fieldName)) {
                    deserializedDomainProperties.authCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainProperties;
        });
    }
}
