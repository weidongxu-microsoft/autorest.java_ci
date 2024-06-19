// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

/**
 * The domain name label scope. If a domain name label and a domain name label scope are specified, an A DNS record is
 * created for the public IP in the Microsoft Azure DNS system with a hashed value includes in FQDN.
 */
public enum PublicIpAddressDnsSettingsDomainNameLabelScope {
    /**
     * Enum value TenantReuse.
     */
    TENANT_REUSE("TenantReuse"),

    /**
     * Enum value SubscriptionReuse.
     */
    SUBSCRIPTION_REUSE("SubscriptionReuse"),

    /**
     * Enum value ResourceGroupReuse.
     */
    RESOURCE_GROUP_REUSE("ResourceGroupReuse"),

    /**
     * Enum value NoReuse.
     */
    NO_REUSE("NoReuse");

    /**
     * The actual serialized value for a PublicIpAddressDnsSettingsDomainNameLabelScope instance.
     */
    private final String value;

    PublicIpAddressDnsSettingsDomainNameLabelScope(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PublicIpAddressDnsSettingsDomainNameLabelScope instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed PublicIpAddressDnsSettingsDomainNameLabelScope object, or null if unable to parse.
     */
    public static PublicIpAddressDnsSettingsDomainNameLabelScope fromString(String value) {
        if (value == null) {
            return null;
        }
        PublicIpAddressDnsSettingsDomainNameLabelScope[] items
            = PublicIpAddressDnsSettingsDomainNameLabelScope.values();
        for (PublicIpAddressDnsSettingsDomainNameLabelScope item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
