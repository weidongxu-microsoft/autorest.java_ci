// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.applicationinsights.generated.models.FavoriteType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties that define a favorite that is associated to an Application Insights component.
 */
@Fluent
public final class ApplicationInsightsComponentFavoriteInner {
    /*
     * The user-defined name of the favorite.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON
     */
    @JsonProperty(value = "Config")
    private String config;

    /*
     * This instance's version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Internally assigned unique id of the favorite definition.
     */
    @JsonProperty(value = "FavoriteId", access = JsonProperty.Access.WRITE_ONLY)
    private String favoriteId;

    /*
     * Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     */
    @JsonProperty(value = "FavoriteType")
    private FavoriteType favoriteType;

    /*
     * The source of the favorite definition.
     */
    @JsonProperty(value = "SourceType")
    private String sourceType;

    /*
     * Date and time in UTC of the last modification that was made to this favorite definition.
     */
    @JsonProperty(value = "TimeModified", access = JsonProperty.Access.WRITE_ONLY)
    private String timeModified;

    /*
     * A list of 0 or more tags that are associated with this favorite definition
     */
    @JsonProperty(value = "Tags")
    private List<String> tags;

    /*
     * Favorite category, as defined by the user at creation time.
     */
    @JsonProperty(value = "Category")
    private String category;

    /*
     * Flag denoting wether or not this favorite was generated from a template.
     */
    @JsonProperty(value = "IsGeneratedFromTemplate")
    private Boolean isGeneratedFromTemplate;

    /*
     * Unique user id of the specific user that owns this favorite.
     */
    @JsonProperty(value = "UserId", access = JsonProperty.Access.WRITE_ONLY)
    private String userId;

    /**
     * Creates an instance of ApplicationInsightsComponentFavoriteInner class.
     */
    public ApplicationInsightsComponentFavoriteInner() {
    }

    /**
     * Get the name property: The user-defined name of the favorite.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The user-defined name of the favorite.
     * 
     * @param name the name value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the config property: Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON.
     * 
     * @return the config value.
     */
    public String config() {
        return this.config;
    }

    /**
     * Set the config property: Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON.
     * 
     * @param config the config value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withConfig(String config) {
        this.config = config;
        return this;
    }

    /**
     * Get the version property: This instance's version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: This instance's version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     * 
     * @param version the version value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the favoriteId property: Internally assigned unique id of the favorite definition.
     * 
     * @return the favoriteId value.
     */
    public String favoriteId() {
        return this.favoriteId;
    }

    /**
     * Get the favoriteType property: Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     * @return the favoriteType value.
     */
    public FavoriteType favoriteType() {
        return this.favoriteType;
    }

    /**
     * Set the favoriteType property: Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     * @param favoriteType the favoriteType value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withFavoriteType(FavoriteType favoriteType) {
        this.favoriteType = favoriteType;
        return this;
    }

    /**
     * Get the sourceType property: The source of the favorite definition.
     * 
     * @return the sourceType value.
     */
    public String sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: The source of the favorite definition.
     * 
     * @param sourceType the sourceType value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the timeModified property: Date and time in UTC of the last modification that was made to this favorite definition.
     * 
     * @return the timeModified value.
     */
    public String timeModified() {
        return this.timeModified;
    }

    /**
     * Get the tags property: A list of 0 or more tags that are associated with this favorite definition.
     * 
     * @return the tags value.
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: A list of 0 or more tags that are associated with this favorite definition.
     * 
     * @param tags the tags value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the category property: Favorite category, as defined by the user at creation time.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Favorite category, as defined by the user at creation time.
     * 
     * @param category the category value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the isGeneratedFromTemplate property: Flag denoting wether or not this favorite was generated from a template.
     * 
     * @return the isGeneratedFromTemplate value.
     */
    public Boolean isGeneratedFromTemplate() {
        return this.isGeneratedFromTemplate;
    }

    /**
     * Set the isGeneratedFromTemplate property: Flag denoting wether or not this favorite was generated from a template.
     * 
     * @param isGeneratedFromTemplate the isGeneratedFromTemplate value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withIsGeneratedFromTemplate(Boolean isGeneratedFromTemplate) {
        this.isGeneratedFromTemplate = isGeneratedFromTemplate;
        return this;
    }

    /**
     * Get the userId property: Unique user id of the specific user that owns this favorite.
     * 
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
