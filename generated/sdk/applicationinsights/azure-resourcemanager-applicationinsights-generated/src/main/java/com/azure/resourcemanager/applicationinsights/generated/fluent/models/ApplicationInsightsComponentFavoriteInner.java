// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.applicationinsights.generated.models.FavoriteType;
import java.io.IOException;
import java.util.List;

/**
 * Properties that define a favorite that is associated to an Application Insights component.
 */
@Fluent
public final class ApplicationInsightsComponentFavoriteInner
    implements JsonSerializable<ApplicationInsightsComponentFavoriteInner> {
    /*
     * The user-defined name of the favorite.
     */
    private String name;

    /*
     * Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a
     * string containing valid JSON
     */
    private String config;

    /*
     * This instance's version of the data model. This can change as new features are added that can be marked favorite.
     * Current examples include MetricsExplorer (ME) and Search.
     */
    private String version;

    /*
     * Internally assigned unique id of the favorite definition.
     */
    private String favoriteId;

    /*
     * Enum indicating if this favorite definition is owned by a specific user or is shared between all users with
     * access to the Application Insights component.
     */
    private FavoriteType favoriteType;

    /*
     * The source of the favorite definition.
     */
    private String sourceType;

    /*
     * Date and time in UTC of the last modification that was made to this favorite definition.
     */
    private String timeModified;

    /*
     * A list of 0 or more tags that are associated with this favorite definition
     */
    private List<String> tags;

    /*
     * Favorite category, as defined by the user at creation time.
     */
    private String category;

    /*
     * Flag denoting wether or not this favorite was generated from a template.
     */
    private Boolean isGeneratedFromTemplate;

    /*
     * Unique user id of the specific user that owns this favorite.
     */
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
     * Get the config property: Configuration of this particular favorite, which are driven by the Azure portal UX.
     * Configuration data is a string containing valid JSON.
     * 
     * @return the config value.
     */
    public String config() {
        return this.config;
    }

    /**
     * Set the config property: Configuration of this particular favorite, which are driven by the Azure portal UX.
     * Configuration data is a string containing valid JSON.
     * 
     * @param config the config value to set.
     * @return the ApplicationInsightsComponentFavoriteInner object itself.
     */
    public ApplicationInsightsComponentFavoriteInner withConfig(String config) {
        this.config = config;
        return this;
    }

    /**
     * Get the version property: This instance's version of the data model. This can change as new features are added
     * that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: This instance's version of the data model. This can change as new features are added
     * that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
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
     * Get the favoriteType property: Enum indicating if this favorite definition is owned by a specific user or is
     * shared between all users with access to the Application Insights component.
     * 
     * @return the favoriteType value.
     */
    public FavoriteType favoriteType() {
        return this.favoriteType;
    }

    /**
     * Set the favoriteType property: Enum indicating if this favorite definition is owned by a specific user or is
     * shared between all users with access to the Application Insights component.
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
     * Get the timeModified property: Date and time in UTC of the last modification that was made to this favorite
     * definition.
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
     * Get the isGeneratedFromTemplate property: Flag denoting wether or not this favorite was generated from a
     * template.
     * 
     * @return the isGeneratedFromTemplate value.
     */
    public Boolean isGeneratedFromTemplate() {
        return this.isGeneratedFromTemplate;
    }

    /**
     * Set the isGeneratedFromTemplate property: Flag denoting wether or not this favorite was generated from a
     * template.
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("Name", this.name);
        jsonWriter.writeStringField("Config", this.config);
        jsonWriter.writeStringField("Version", this.version);
        jsonWriter.writeStringField("FavoriteType", this.favoriteType == null ? null : this.favoriteType.toString());
        jsonWriter.writeStringField("SourceType", this.sourceType);
        jsonWriter.writeArrayField("Tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("Category", this.category);
        jsonWriter.writeBooleanField("IsGeneratedFromTemplate", this.isGeneratedFromTemplate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationInsightsComponentFavoriteInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationInsightsComponentFavoriteInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationInsightsComponentFavoriteInner.
     */
    public static ApplicationInsightsComponentFavoriteInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationInsightsComponentFavoriteInner deserializedApplicationInsightsComponentFavoriteInner
                = new ApplicationInsightsComponentFavoriteInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("Name".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.name = reader.getString();
                } else if ("Config".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.config = reader.getString();
                } else if ("Version".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.version = reader.getString();
                } else if ("FavoriteId".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.favoriteId = reader.getString();
                } else if ("FavoriteType".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.favoriteType
                        = FavoriteType.fromString(reader.getString());
                } else if ("SourceType".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.sourceType = reader.getString();
                } else if ("TimeModified".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.timeModified = reader.getString();
                } else if ("Tags".equals(fieldName)) {
                    List<String> tags = reader.readArray(reader1 -> reader1.getString());
                    deserializedApplicationInsightsComponentFavoriteInner.tags = tags;
                } else if ("Category".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.category = reader.getString();
                } else if ("IsGeneratedFromTemplate".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.isGeneratedFromTemplate
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("UserId".equals(fieldName)) {
                    deserializedApplicationInsightsComponentFavoriteInner.userId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationInsightsComponentFavoriteInner;
        });
    }
}
