// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlanRestrictions;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;

/**
 * Premier add-on offer.
 */
@Fluent
public final class PremierAddOnOfferInner extends ProxyOnlyResource {
    /*
     * PremierAddOnOffer resource specific properties
     */
    private PremierAddOnOfferProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of PremierAddOnOfferInner class.
     */
    public PremierAddOnOfferInner() {
    }

    /**
     * Get the innerProperties property: PremierAddOnOffer resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private PremierAddOnOfferProperties innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public PremierAddOnOfferInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the sku property: Premier add on SKU.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: Premier add on SKU.
     * 
     * @param sku the sku value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withSku(String sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the product property: Premier add on offer Product.
     * 
     * @return the product value.
     */
    public String product() {
        return this.innerProperties() == null ? null : this.innerProperties().product();
    }

    /**
     * Set the product property: Premier add on offer Product.
     * 
     * @param product the product value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withProduct(String product) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withProduct(product);
        return this;
    }

    /**
     * Get the vendor property: Premier add on offer Vendor.
     * 
     * @return the vendor value.
     */
    public String vendor() {
        return this.innerProperties() == null ? null : this.innerProperties().vendor();
    }

    /**
     * Set the vendor property: Premier add on offer Vendor.
     * 
     * @param vendor the vendor value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withVendor(String vendor) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withVendor(vendor);
        return this;
    }

    /**
     * Get the promoCodeRequired property: &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the promoCodeRequired value.
     */
    public Boolean promoCodeRequired() {
        return this.innerProperties() == null ? null : this.innerProperties().promoCodeRequired();
    }

    /**
     * Set the promoCodeRequired property: &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param promoCodeRequired the promoCodeRequired value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withPromoCodeRequired(Boolean promoCodeRequired) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withPromoCodeRequired(promoCodeRequired);
        return this;
    }

    /**
     * Get the quota property: Premier add on offer Quota.
     * 
     * @return the quota value.
     */
    public Integer quota() {
        return this.innerProperties() == null ? null : this.innerProperties().quota();
    }

    /**
     * Set the quota property: Premier add on offer Quota.
     * 
     * @param quota the quota value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withQuota(Integer quota) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withQuota(quota);
        return this;
    }

    /**
     * Get the webHostingPlanRestrictions property: App Service plans this offer is restricted to.
     * 
     * @return the webHostingPlanRestrictions value.
     */
    public AppServicePlanRestrictions webHostingPlanRestrictions() {
        return this.innerProperties() == null ? null : this.innerProperties().webHostingPlanRestrictions();
    }

    /**
     * Set the webHostingPlanRestrictions property: App Service plans this offer is restricted to.
     * 
     * @param webHostingPlanRestrictions the webHostingPlanRestrictions value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner
        withWebHostingPlanRestrictions(AppServicePlanRestrictions webHostingPlanRestrictions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withWebHostingPlanRestrictions(webHostingPlanRestrictions);
        return this;
    }

    /**
     * Get the privacyPolicyUrl property: Privacy policy URL.
     * 
     * @return the privacyPolicyUrl value.
     */
    public String privacyPolicyUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().privacyPolicyUrl();
    }

    /**
     * Set the privacyPolicyUrl property: Privacy policy URL.
     * 
     * @param privacyPolicyUrl the privacyPolicyUrl value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withPrivacyPolicyUrl(String privacyPolicyUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withPrivacyPolicyUrl(privacyPolicyUrl);
        return this;
    }

    /**
     * Get the legalTermsUrl property: Legal terms URL.
     * 
     * @return the legalTermsUrl value.
     */
    public String legalTermsUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().legalTermsUrl();
    }

    /**
     * Set the legalTermsUrl property: Legal terms URL.
     * 
     * @param legalTermsUrl the legalTermsUrl value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withLegalTermsUrl(String legalTermsUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withLegalTermsUrl(legalTermsUrl);
        return this;
    }

    /**
     * Get the marketplacePublisher property: Marketplace publisher.
     * 
     * @return the marketplacePublisher value.
     */
    public String marketplacePublisher() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplacePublisher();
    }

    /**
     * Set the marketplacePublisher property: Marketplace publisher.
     * 
     * @param marketplacePublisher the marketplacePublisher value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withMarketplacePublisher(String marketplacePublisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withMarketplacePublisher(marketplacePublisher);
        return this;
    }

    /**
     * Get the marketplaceOffer property: Marketplace offer.
     * 
     * @return the marketplaceOffer value.
     */
    public String marketplaceOffer() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplaceOffer();
    }

    /**
     * Set the marketplaceOffer property: Marketplace offer.
     * 
     * @param marketplaceOffer the marketplaceOffer value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withMarketplaceOffer(String marketplaceOffer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PremierAddOnOfferProperties();
        }
        this.innerProperties().withMarketplaceOffer(marketplaceOffer);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PremierAddOnOfferInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PremierAddOnOfferInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PremierAddOnOfferInner.
     */
    public static PremierAddOnOfferInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PremierAddOnOfferInner deserializedPremierAddOnOfferInner = new PremierAddOnOfferInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPremierAddOnOfferInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPremierAddOnOfferInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPremierAddOnOfferInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedPremierAddOnOfferInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedPremierAddOnOfferInner.innerProperties = PremierAddOnOfferProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPremierAddOnOfferInner;
        });
    }
}
