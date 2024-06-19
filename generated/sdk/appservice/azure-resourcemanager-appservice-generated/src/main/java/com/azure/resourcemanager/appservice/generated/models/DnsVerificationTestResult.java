// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

/**
 * DNS verification test result.
 */
public enum DnsVerificationTestResult {
    /**
     * Enum value Passed.
     */
    PASSED("Passed"),

    /**
     * Enum value Failed.
     */
    FAILED("Failed"),

    /**
     * Enum value Skipped.
     */
    SKIPPED("Skipped");

    /**
     * The actual serialized value for a DnsVerificationTestResult instance.
     */
    private final String value;

    DnsVerificationTestResult(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DnsVerificationTestResult instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed DnsVerificationTestResult object, or null if unable to parse.
     */
    public static DnsVerificationTestResult fromString(String value) {
        if (value == null) {
            return null;
        }
        DnsVerificationTestResult[] items = DnsVerificationTestResult.values();
        for (DnsVerificationTestResult item : items) {
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
