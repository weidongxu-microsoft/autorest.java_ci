// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.applicationinsights.generated.models.MyWorkbookResource;
import com.azure.resourcemanager.applicationinsights.generated.models.SharedTypeKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An Application Insights private workbook definition. */
@Fluent
public final class MyWorkbookInner extends MyWorkbookResource {
    /*
     * The kind of workbook. Choices are user and shared.
     */
    @JsonProperty(value = "kind")
    private SharedTypeKind kind;

    /*
     * Metadata describing a workbook for an Azure resource.
     */
    @JsonProperty(value = "properties")
    private MyWorkbookProperties innerProperties;

    /** Creates an instance of MyWorkbookInner class. */
    public MyWorkbookInner() {
    }

    /**
     * Get the kind property: The kind of workbook. Choices are user and shared.
     *
     * @return the kind value.
     */
    public SharedTypeKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of workbook. Choices are user and shared.
     *
     * @param kind the kind value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withKind(SharedTypeKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the innerProperties property: Metadata describing a workbook for an Azure resource.
     *
     * @return the innerProperties value.
     */
    private MyWorkbookProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withType(String type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the displayName property: The user-defined name of the private workbook.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The user-defined name of the private workbook.
     *
     * @param displayName the displayName value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MyWorkbookProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the serializedData property: Configuration of this particular private workbook. Configuration data is a
     * string containing valid JSON.
     *
     * @return the serializedData value.
     */
    public String serializedData() {
        return this.innerProperties() == null ? null : this.innerProperties().serializedData();
    }

    /**
     * Set the serializedData property: Configuration of this particular private workbook. Configuration data is a
     * string containing valid JSON.
     *
     * @param serializedData the serializedData value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withSerializedData(String serializedData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MyWorkbookProperties();
        }
        this.innerProperties().withSerializedData(serializedData);
        return this;
    }

    /**
     * Get the version property: This instance's version of the data model. This can change as new features are added
     * that can be marked private workbook.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: This instance's version of the data model. This can change as new features are added
     * that can be marked private workbook.
     *
     * @param version the version value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MyWorkbookProperties();
        }
        this.innerProperties().withVersion(version);
        return this;
    }

    /**
     * Get the timeModified property: Date and time in UTC of the last modification that was made to this private
     * workbook definition.
     *
     * @return the timeModified value.
     */
    public String timeModified() {
        return this.innerProperties() == null ? null : this.innerProperties().timeModified();
    }

    /**
     * Get the category property: Workbook category, as defined by the user at creation time.
     *
     * @return the category value.
     */
    public String category() {
        return this.innerProperties() == null ? null : this.innerProperties().category();
    }

    /**
     * Set the category property: Workbook category, as defined by the user at creation time.
     *
     * @param category the category value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withCategory(String category) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MyWorkbookProperties();
        }
        this.innerProperties().withCategory(category);
        return this;
    }

    /**
     * Get the tags property: A list of 0 or more tags that are associated with this private workbook definition.
     *
     * @return the tags value.
     */
    public List<String> tagsPropertiesTags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: A list of 0 or more tags that are associated with this private workbook definition.
     *
     * @param tags the tags value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withTagsPropertiesTags(List<String> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MyWorkbookProperties();
        }
        this.innerProperties().withTags(tags);
        return this;
    }

    /**
     * Get the userId property: Unique user id of the specific user that owns this private workbook.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.innerProperties() == null ? null : this.innerProperties().userId();
    }

    /**
     * Get the sourceId property: Optional resourceId for a source resource.
     *
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceId();
    }

    /**
     * Set the sourceId property: Optional resourceId for a source resource.
     *
     * @param sourceId the sourceId value to set.
     * @return the MyWorkbookInner object itself.
     */
    public MyWorkbookInner withSourceId(String sourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MyWorkbookProperties();
        }
        this.innerProperties().withSourceId(sourceId);
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
}
