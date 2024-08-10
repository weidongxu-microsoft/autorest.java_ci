// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
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
import java.util.Map;

/**
 * Information about a domain.
 */
@Fluent
public final class DomainInner extends Resource {
    /*
     * Domain resource specific properties
     */
    private DomainProperties innerProperties;

    /*
     * Kind of resource.
     */
    private String kind;

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
     * Creates an instance of DomainInner class.
     */
    public DomainInner() {
    }

    /**
     * Get the innerProperties property: Domain resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private DomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     * 
     * @param kind the kind value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withKind(String kind) {
        this.kind = kind;
        return this;
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
    public DomainInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the contactAdmin property: Administrative contact.
     * 
     * @return the contactAdmin value.
     */
    public Contact contactAdmin() {
        return this.innerProperties() == null ? null : this.innerProperties().contactAdmin();
    }

    /**
     * Set the contactAdmin property: Administrative contact.
     * 
     * @param contactAdmin the contactAdmin value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withContactAdmin(Contact contactAdmin) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withContactAdmin(contactAdmin);
        return this;
    }

    /**
     * Get the contactBilling property: Billing contact.
     * 
     * @return the contactBilling value.
     */
    public Contact contactBilling() {
        return this.innerProperties() == null ? null : this.innerProperties().contactBilling();
    }

    /**
     * Set the contactBilling property: Billing contact.
     * 
     * @param contactBilling the contactBilling value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withContactBilling(Contact contactBilling) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withContactBilling(contactBilling);
        return this;
    }

    /**
     * Get the contactRegistrant property: Registrant contact.
     * 
     * @return the contactRegistrant value.
     */
    public Contact contactRegistrant() {
        return this.innerProperties() == null ? null : this.innerProperties().contactRegistrant();
    }

    /**
     * Set the contactRegistrant property: Registrant contact.
     * 
     * @param contactRegistrant the contactRegistrant value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withContactRegistrant(Contact contactRegistrant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withContactRegistrant(contactRegistrant);
        return this;
    }

    /**
     * Get the contactTech property: Technical contact.
     * 
     * @return the contactTech value.
     */
    public Contact contactTech() {
        return this.innerProperties() == null ? null : this.innerProperties().contactTech();
    }

    /**
     * Set the contactTech property: Technical contact.
     * 
     * @param contactTech the contactTech value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withContactTech(Contact contactTech) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withContactTech(contactTech);
        return this;
    }

    /**
     * Get the registrationStatus property: Domain registration status.
     * 
     * @return the registrationStatus value.
     */
    public DomainStatus registrationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationStatus();
    }

    /**
     * Get the provisioningState property: Domain provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the nameServers property: Name servers.
     * 
     * @return the nameServers value.
     */
    public List<String> nameServers() {
        return this.innerProperties() == null ? null : this.innerProperties().nameServers();
    }

    /**
     * Get the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the privacy value.
     */
    public Boolean privacy() {
        return this.innerProperties() == null ? null : this.innerProperties().privacy();
    }

    /**
     * Set the privacy property: &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param privacy the privacy value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withPrivacy(Boolean privacy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withPrivacy(privacy);
        return this;
    }

    /**
     * Get the createdTime property: Domain creation timestamp.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Get the expirationTime property: Domain expiration timestamp.
     * 
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTime();
    }

    /**
     * Get the lastRenewedTime property: Timestamp when the domain was renewed last time.
     * 
     * @return the lastRenewedTime value.
     */
    public OffsetDateTime lastRenewedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastRenewedTime();
    }

    /**
     * Get the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.innerProperties() == null ? null : this.innerProperties().autoRenew();
    }

    /**
     * Set the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param autoRenew the autoRenew value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withAutoRenew(Boolean autoRenew) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withAutoRenew(autoRenew);
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
        return this.innerProperties() == null ? null : this.innerProperties().readyForDnsRecordManagement();
    }

    /**
     * Get the managedHostNames property: All hostnames derived from the domain and assigned to Azure resources.
     * 
     * @return the managedHostNames value.
     */
    public List<Hostname> managedHostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().managedHostNames();
    }

    /**
     * Get the consent property: Legal agreement consent.
     * 
     * @return the consent value.
     */
    public DomainPurchaseConsent consent() {
        return this.innerProperties() == null ? null : this.innerProperties().consent();
    }

    /**
     * Set the consent property: Legal agreement consent.
     * 
     * @param consent the consent value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withConsent(DomainPurchaseConsent consent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withConsent(consent);
        return this;
    }

    /**
     * Get the domainNotRenewableReasons property: Reasons why domain is not renewable.
     * 
     * @return the domainNotRenewableReasons value.
     */
    public List<ResourceNotRenewableReason> domainNotRenewableReasons() {
        return this.innerProperties() == null ? null : this.innerProperties().domainNotRenewableReasons();
    }

    /**
     * Get the dnsType property: Current DNS type.
     * 
     * @return the dnsType value.
     */
    public DnsType dnsType() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsType();
    }

    /**
     * Set the dnsType property: Current DNS type.
     * 
     * @param dnsType the dnsType value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withDnsType(DnsType dnsType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withDnsType(dnsType);
        return this;
    }

    /**
     * Get the dnsZoneId property: Azure DNS Zone to use.
     * 
     * @return the dnsZoneId value.
     */
    public String dnsZoneId() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsZoneId();
    }

    /**
     * Set the dnsZoneId property: Azure DNS Zone to use.
     * 
     * @param dnsZoneId the dnsZoneId value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withDnsZoneId(String dnsZoneId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withDnsZoneId(dnsZoneId);
        return this;
    }

    /**
     * Get the targetDnsType property: Target DNS type (would be used for migration).
     * 
     * @return the targetDnsType value.
     */
    public DnsType targetDnsType() {
        return this.innerProperties() == null ? null : this.innerProperties().targetDnsType();
    }

    /**
     * Set the targetDnsType property: Target DNS type (would be used for migration).
     * 
     * @param targetDnsType the targetDnsType value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withTargetDnsType(DnsType targetDnsType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withTargetDnsType(targetDnsType);
        return this;
    }

    /**
     * Get the authCode property: The authCode property.
     * 
     * @return the authCode value.
     */
    public String authCode() {
        return this.innerProperties() == null ? null : this.innerProperties().authCode();
    }

    /**
     * Set the authCode property: The authCode property.
     * 
     * @param authCode the authCode value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withAuthCode(String authCode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withAuthCode(authCode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property location in model DomainInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DomainInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("kind", this.kind);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DomainInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DomainInner.
     */
    public static DomainInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainInner deserializedDomainInner = new DomainInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDomainInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDomainInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDomainInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDomainInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDomainInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedDomainInner.innerProperties = DomainProperties.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedDomainInner.kind = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainInner;
        });
    }
}
