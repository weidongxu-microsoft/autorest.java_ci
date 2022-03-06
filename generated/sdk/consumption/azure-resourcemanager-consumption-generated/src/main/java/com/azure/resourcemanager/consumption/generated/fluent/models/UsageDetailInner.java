// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.consumption.generated.models.LegacyUsageDetail;
import com.azure.resourcemanager.consumption.generated.models.ModernUsageDetail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** An usage detail resource. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = UsageDetailInner.class)
@JsonTypeName("UsageDetail")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "legacy", value = LegacyUsageDetail.class),
    @JsonSubTypes.Type(name = "modern", value = ModernUsageDetail.class)
})
@Immutable
public class UsageDetailInner extends ProxyResource {
    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
