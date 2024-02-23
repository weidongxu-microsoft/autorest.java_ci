// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/**
 * Caching settings for a caching-type route. To disable caching, do not provide a cacheConfiguration object.
 */
@Fluent
public final class CacheConfiguration {
    /*
     * Treatment of URL query terms when forming the cache key.
     */
    @JsonProperty(value = "queryParameterStripDirective")
    private FrontDoorQuery queryParameterStripDirective;

    /*
     * query parameters to include or exclude (comma separated).
     */
    @JsonProperty(value = "queryParameters")
    private String queryParameters;

    /*
     * Whether to use dynamic compression for cached content
     */
    @JsonProperty(value = "dynamicCompression")
    private DynamicCompressionEnabled dynamicCompression;

    /*
     * The duration for which the content needs to be cached. Allowed format is in ISO 8601 format
     * (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year
     */
    @JsonProperty(value = "cacheDuration")
    private Duration cacheDuration;

    /**
     * Creates an instance of CacheConfiguration class.
     */
    public CacheConfiguration() {
    }

    /**
     * Get the queryParameterStripDirective property: Treatment of URL query terms when forming the cache key.
     * 
     * @return the queryParameterStripDirective value.
     */
    public FrontDoorQuery queryParameterStripDirective() {
        return this.queryParameterStripDirective;
    }

    /**
     * Set the queryParameterStripDirective property: Treatment of URL query terms when forming the cache key.
     * 
     * @param queryParameterStripDirective the queryParameterStripDirective value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withQueryParameterStripDirective(FrontDoorQuery queryParameterStripDirective) {
        this.queryParameterStripDirective = queryParameterStripDirective;
        return this;
    }

    /**
     * Get the queryParameters property: query parameters to include or exclude (comma separated).
     * 
     * @return the queryParameters value.
     */
    public String queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set the queryParameters property: query parameters to include or exclude (comma separated).
     * 
     * @param queryParameters the queryParameters value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Get the dynamicCompression property: Whether to use dynamic compression for cached content.
     * 
     * @return the dynamicCompression value.
     */
    public DynamicCompressionEnabled dynamicCompression() {
        return this.dynamicCompression;
    }

    /**
     * Set the dynamicCompression property: Whether to use dynamic compression for cached content.
     * 
     * @param dynamicCompression the dynamicCompression value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withDynamicCompression(DynamicCompressionEnabled dynamicCompression) {
        this.dynamicCompression = dynamicCompression;
        return this;
    }

    /**
     * Get the cacheDuration property: The duration for which the content needs to be cached. Allowed format is in ISO
     * 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year.
     * 
     * @return the cacheDuration value.
     */
    public Duration cacheDuration() {
        return this.cacheDuration;
    }

    /**
     * Set the cacheDuration property: The duration for which the content needs to be cached. Allowed format is in ISO
     * 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year.
     * 
     * @param cacheDuration the cacheDuration value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withCacheDuration(Duration cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
