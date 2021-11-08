// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.AppServiceCertificateOrderPropertiesAppServiceCertificateNotRenewableReasonsItem;
import com.azure.resourcemanager.appservice.generated.models.CertificateDetails;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderContact;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderStatus;
import com.azure.resourcemanager.appservice.generated.models.CertificateProductType;
import com.azure.resourcemanager.appservice.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** SSL certificate purchase order. */
@Fluent
public final class AppServiceCertificateOrderInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServiceCertificateOrderInner.class);

    /*
     * AppServiceCertificateOrder resource specific properties
     */
    @JsonProperty(value = "properties")
    private AppServiceCertificateOrderProperties innerProperties;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the innerProperties property: AppServiceCertificateOrder resource specific properties.
     *
     * @return the innerProperties value.
     */
    private AppServiceCertificateOrderProperties innerProperties() {
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
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceCertificateOrderInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceCertificateOrderInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the certificates property: State of the Key Vault secret.
     *
     * @return the certificates value.
     */
    public Map<String, AppServiceCertificate> certificates() {
        return this.innerProperties() == null ? null : this.innerProperties().certificates();
    }

    /**
     * Set the certificates property: State of the Key Vault secret.
     *
     * @param certificates the certificates value to set.
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withCertificates(Map<String, AppServiceCertificate> certificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateOrderProperties();
        }
        this.innerProperties().withCertificates(certificates);
        return this;
    }

    /**
     * Get the distinguishedName property: Certificate distinguished name.
     *
     * @return the distinguishedName value.
     */
    public String distinguishedName() {
        return this.innerProperties() == null ? null : this.innerProperties().distinguishedName();
    }

    /**
     * Set the distinguishedName property: Certificate distinguished name.
     *
     * @param distinguishedName the distinguishedName value to set.
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withDistinguishedName(String distinguishedName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateOrderProperties();
        }
        this.innerProperties().withDistinguishedName(distinguishedName);
        return this;
    }

    /**
     * Get the domainVerificationToken property: Domain verification token.
     *
     * @return the domainVerificationToken value.
     */
    public String domainVerificationToken() {
        return this.innerProperties() == null ? null : this.innerProperties().domainVerificationToken();
    }

    /**
     * Get the validityInYears property: Duration in years (must be 1).
     *
     * @return the validityInYears value.
     */
    public Integer validityInYears() {
        return this.innerProperties() == null ? null : this.innerProperties().validityInYears();
    }

    /**
     * Set the validityInYears property: Duration in years (must be 1).
     *
     * @param validityInYears the validityInYears value to set.
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withValidityInYears(Integer validityInYears) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateOrderProperties();
        }
        this.innerProperties().withValidityInYears(validityInYears);
        return this;
    }

    /**
     * Get the keySize property: Certificate key size.
     *
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.innerProperties() == null ? null : this.innerProperties().keySize();
    }

    /**
     * Set the keySize property: Certificate key size.
     *
     * @param keySize the keySize value to set.
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withKeySize(Integer keySize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateOrderProperties();
        }
        this.innerProperties().withKeySize(keySize);
        return this;
    }

    /**
     * Get the productType property: Certificate product type.
     *
     * @return the productType value.
     */
    public CertificateProductType productType() {
        return this.innerProperties() == null ? null : this.innerProperties().productType();
    }

    /**
     * Set the productType property: Certificate product type.
     *
     * @param productType the productType value to set.
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withProductType(CertificateProductType productType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateOrderProperties();
        }
        this.innerProperties().withProductType(productType);
        return this;
    }

    /**
     * Get the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when
     * it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.innerProperties() == null ? null : this.innerProperties().autoRenew();
    }

    /**
     * Set the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when
     * it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withAutoRenew(Boolean autoRenew) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateOrderProperties();
        }
        this.innerProperties().withAutoRenew(autoRenew);
        return this;
    }

    /**
     * Get the provisioningState property: Status of certificate order.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: Current order status.
     *
     * @return the status value.
     */
    public CertificateOrderStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the signedCertificate property: Signed certificate.
     *
     * @return the signedCertificate value.
     */
    public CertificateDetails signedCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().signedCertificate();
    }

    /**
     * Get the csr property: Last CSR that was created for this order.
     *
     * @return the csr value.
     */
    public String csr() {
        return this.innerProperties() == null ? null : this.innerProperties().csr();
    }

    /**
     * Set the csr property: Last CSR that was created for this order.
     *
     * @param csr the csr value to set.
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withCsr(String csr) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateOrderProperties();
        }
        this.innerProperties().withCsr(csr);
        return this;
    }

    /**
     * Get the intermediate property: Intermediate certificate.
     *
     * @return the intermediate value.
     */
    public CertificateDetails intermediate() {
        return this.innerProperties() == null ? null : this.innerProperties().intermediate();
    }

    /**
     * Get the root property: Root certificate.
     *
     * @return the root value.
     */
    public CertificateDetails root() {
        return this.innerProperties() == null ? null : this.innerProperties().root();
    }

    /**
     * Get the serialNumber property: Current serial number of the certificate.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().serialNumber();
    }

    /**
     * Get the lastCertificateIssuanceTime property: Certificate last issuance time.
     *
     * @return the lastCertificateIssuanceTime value.
     */
    public OffsetDateTime lastCertificateIssuanceTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastCertificateIssuanceTime();
    }

    /**
     * Get the expirationTime property: Certificate expiration time.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTime();
    }

    /**
     * Get the isPrivateKeyExternal property: &lt;code&gt;true&lt;/code&gt; if private key is external; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isPrivateKeyExternal value.
     */
    public Boolean isPrivateKeyExternal() {
        return this.innerProperties() == null ? null : this.innerProperties().isPrivateKeyExternal();
    }

    /**
     * Get the appServiceCertificateNotRenewableReasons property: Reasons why App Service Certificate is not renewable
     * at the current moment.
     *
     * @return the appServiceCertificateNotRenewableReasons value.
     */
    public List<AppServiceCertificateOrderPropertiesAppServiceCertificateNotRenewableReasonsItem>
        appServiceCertificateNotRenewableReasons() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().appServiceCertificateNotRenewableReasons();
    }

    /**
     * Get the nextAutoRenewalTimestamp property: Time stamp when the certificate would be auto renewed next.
     *
     * @return the nextAutoRenewalTimestamp value.
     */
    public OffsetDateTime nextAutoRenewalTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().nextAutoRenewalTimestamp();
    }

    /**
     * Get the contact property: Contact info.
     *
     * @return the contact value.
     */
    public CertificateOrderContact contact() {
        return this.innerProperties() == null ? null : this.innerProperties().contact();
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
    }
}
