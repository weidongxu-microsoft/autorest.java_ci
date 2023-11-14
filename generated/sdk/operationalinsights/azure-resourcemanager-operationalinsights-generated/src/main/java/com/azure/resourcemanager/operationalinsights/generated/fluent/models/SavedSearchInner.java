// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.models.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Value object for saved search results.
 */
@Fluent
public final class SavedSearchInner extends ProxyResource {
    /*
     * The ETag of the saved search. To override an existing saved search, use "*" or specify the current Etag
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The properties of the saved search.
     */
    @JsonProperty(value = "properties", required = true)
    private SavedSearchProperties innerProperties = new SavedSearchProperties();

    /**
     * Creates an instance of SavedSearchInner class.
     */
    public SavedSearchInner() {
    }

    /**
     * Get the etag property: The ETag of the saved search. To override an existing saved search, use "*" or specify
     * the current Etag.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the saved search. To override an existing saved search, use "*" or specify
     * the current Etag.
     * 
     * @param etag the etag value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the saved search.
     * 
     * @return the innerProperties value.
     */
    private SavedSearchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the category property: The category of the saved search. This helps the user to find a saved search faster.
     * 
     * @return the category value.
     */
    public String category() {
        return this.innerProperties() == null ? null : this.innerProperties().category();
    }

    /**
     * Set the category property: The category of the saved search. This helps the user to find a saved search faster.
     * 
     * @param category the category value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withCategory(String category) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavedSearchProperties();
        }
        this.innerProperties().withCategory(category);
        return this;
    }

    /**
     * Get the displayName property: Saved search display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Saved search display name.
     * 
     * @param displayName the displayName value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavedSearchProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the query property: The query expression for the saved search.
     * 
     * @return the query value.
     */
    public String query() {
        return this.innerProperties() == null ? null : this.innerProperties().query();
    }

    /**
     * Set the query property: The query expression for the saved search.
     * 
     * @param query the query value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withQuery(String query) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavedSearchProperties();
        }
        this.innerProperties().withQuery(query);
        return this;
    }

    /**
     * Get the functionAlias property: The function alias if query serves as a function.
     * 
     * @return the functionAlias value.
     */
    public String functionAlias() {
        return this.innerProperties() == null ? null : this.innerProperties().functionAlias();
    }

    /**
     * Set the functionAlias property: The function alias if query serves as a function.
     * 
     * @param functionAlias the functionAlias value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withFunctionAlias(String functionAlias) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavedSearchProperties();
        }
        this.innerProperties().withFunctionAlias(functionAlias);
        return this;
    }

    /**
     * Get the functionParameters property: The optional function parameters if query serves as a function. Value
     * should be in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'. For
     * more examples and proper syntax please refer to
     * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     * 
     * @return the functionParameters value.
     */
    public String functionParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().functionParameters();
    }

    /**
     * Set the functionParameters property: The optional function parameters if query serves as a function. Value
     * should be in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'. For
     * more examples and proper syntax please refer to
     * https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     * 
     * @param functionParameters the functionParameters value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withFunctionParameters(String functionParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavedSearchProperties();
        }
        this.innerProperties().withFunctionParameters(functionParameters);
        return this;
    }

    /**
     * Get the version property: The version number of the query language. The current version is 2 and is the default.
     * 
     * @return the version value.
     */
    public Long version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: The version number of the query language. The current version is 2 and is the default.
     * 
     * @param version the version value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withVersion(Long version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavedSearchProperties();
        }
        this.innerProperties().withVersion(version);
        return this;
    }

    /**
     * Get the tags property: The tags attached to the saved search.
     * 
     * @return the tags value.
     */
    public List<Tag> tags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: The tags attached to the saved search.
     * 
     * @param tags the tags value to set.
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withTags(List<Tag> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SavedSearchProperties();
        }
        this.innerProperties().withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerProperties in model SavedSearchInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SavedSearchInner.class);
}
