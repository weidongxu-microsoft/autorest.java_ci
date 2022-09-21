// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Filters limit rule actions to a subset of blobs within the storage account. If multiple filters are defined, a
 * logical AND is performed on all filters.
 */
@Fluent
public final class ManagementPolicyFilter {
    /*
     * An array of strings for prefixes to be match.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /*
     * An array of predefined enum values. Currently blockBlob supports all tiering and delete actions. Only delete
     * actions are supported for appendBlob.
     */
    @JsonProperty(value = "blobTypes", required = true)
    private List<String> blobTypes;

    /*
     * An array of blob index tag based filters, there can be at most 10 tag filters
     */
    @JsonProperty(value = "blobIndexMatch")
    private List<TagFilter> blobIndexMatch;

    /** Creates an instance of ManagementPolicyFilter class. */
    public ManagementPolicyFilter() {
    }

    /**
     * Get the prefixMatch property: An array of strings for prefixes to be match.
     *
     * @return the prefixMatch value.
     */
    public List<String> prefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set the prefixMatch property: An array of strings for prefixes to be match.
     *
     * @param prefixMatch the prefixMatch value to set.
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter withPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get the blobTypes property: An array of predefined enum values. Currently blockBlob supports all tiering and
     * delete actions. Only delete actions are supported for appendBlob.
     *
     * @return the blobTypes value.
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }

    /**
     * Set the blobTypes property: An array of predefined enum values. Currently blockBlob supports all tiering and
     * delete actions. Only delete actions are supported for appendBlob.
     *
     * @param blobTypes the blobTypes value to set.
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter withBlobTypes(List<String> blobTypes) {
        this.blobTypes = blobTypes;
        return this;
    }

    /**
     * Get the blobIndexMatch property: An array of blob index tag based filters, there can be at most 10 tag filters.
     *
     * @return the blobIndexMatch value.
     */
    public List<TagFilter> blobIndexMatch() {
        return this.blobIndexMatch;
    }

    /**
     * Set the blobIndexMatch property: An array of blob index tag based filters, there can be at most 10 tag filters.
     *
     * @param blobIndexMatch the blobIndexMatch value to set.
     * @return the ManagementPolicyFilter object itself.
     */
    public ManagementPolicyFilter withBlobIndexMatch(List<TagFilter> blobIndexMatch) {
        this.blobIndexMatch = blobIndexMatch;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blobTypes() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property blobTypes in model ManagementPolicyFilter"));
        }
        if (blobIndexMatch() != null) {
            blobIndexMatch().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagementPolicyFilter.class);
}
