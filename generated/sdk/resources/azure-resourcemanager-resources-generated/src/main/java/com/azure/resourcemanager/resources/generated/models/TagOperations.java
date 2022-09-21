// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.fluent.models.TagsResourceInner;

/** Resource collection API of TagOperations. */
public interface TagOperations {
    /**
     * Deletes a predefined tag value for a predefined tag name.
     *
     * <p>This operation allows deleting a value from the list of predefined values for an existing predefined tag name.
     * The value being deleted must not be in use as a tag value for the given tag name for any resource.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteValueWithResponse(String tagName, String tagValue, Context context);

    /**
     * Deletes a predefined tag value for a predefined tag name.
     *
     * <p>This operation allows deleting a value from the list of predefined values for an existing predefined tag name.
     * The value being deleted must not be in use as a tag value for the given tag name for any resource.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteValue(String tagName, String tagValue);

    /**
     * Creates a predefined value for a predefined tag name.
     *
     * <p>This operation allows adding a value to the list of predefined values for an existing predefined tag name. A
     * tag value can have a maximum of 256 characters.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag information along with {@link Response}.
     */
    Response<TagValue> createOrUpdateValueWithResponse(String tagName, String tagValue, Context context);

    /**
     * Creates a predefined value for a predefined tag name.
     *
     * <p>This operation allows adding a value to the list of predefined values for an existing predefined tag name. A
     * tag value can have a maximum of 256 characters.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag information.
     */
    TagValue createOrUpdateValue(String tagName, String tagValue);

    /**
     * Creates a predefined tag name.
     *
     * <p>This operation allows adding a name to the list of predefined tag names for the given subscription. A tag name
     * can have a maximum of 512 characters and is case-insensitive. Tag names cannot have the following prefixes which
     * are reserved for Azure use: 'microsoft', 'azure', 'windows'.
     *
     * @param tagName The name of the tag to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag details along with {@link Response}.
     */
    Response<TagDetails> createOrUpdateWithResponse(String tagName, Context context);

    /**
     * Creates a predefined tag name.
     *
     * <p>This operation allows adding a name to the list of predefined tag names for the given subscription. A tag name
     * can have a maximum of 512 characters and is case-insensitive. Tag names cannot have the following prefixes which
     * are reserved for Azure use: 'microsoft', 'azure', 'windows'.
     *
     * @param tagName The name of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag details.
     */
    TagDetails createOrUpdate(String tagName);

    /**
     * Deletes a predefined tag name.
     *
     * <p>This operation allows deleting a name from the list of predefined tag names for the given subscription. The
     * name being deleted must not be in use as a tag name for any resource. All predefined values for the given name
     * must have already been deleted.
     *
     * @param tagName The name of the tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String tagName, Context context);

    /**
     * Deletes a predefined tag name.
     *
     * <p>This operation allows deleting a name from the list of predefined tag names for the given subscription. The
     * name being deleted must not be in use as a tag name for any resource. All predefined values for the given name
     * must have already been deleted.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String tagName);

    /**
     * Gets a summary of tag usage under the subscription.
     *
     * <p>This operation performs a union of predefined tags, resource tags, resource group tags and subscription tags,
     * and returns a summary of usage for each tag name and value under the given subscription. In case of a large
     * number of tags, this operation may return a previously cached result.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of subscription tags as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TagDetails> list();

    /**
     * Gets a summary of tag usage under the subscription.
     *
     * <p>This operation performs a union of predefined tags, resource tags, resource group tags and subscription tags,
     * and returns a summary of usage for each tag name and value under the given subscription. In case of a large
     * number of tags, this operation may return a previously cached result.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of subscription tags as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TagDetails> list(Context context);

    /**
     * Creates or updates the entire set of tags on a resource or subscription.
     *
     * <p>This operation allows adding or replacing the entire set of tags on the specified resource or subscription.
     * The specified entity can have a maximum of 50 tags.
     *
     * @param scope The resource scope.
     * @param parameters Wrapper resource for tags API requests and responses.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wrapper resource for tags API requests and responses along with {@link Response}.
     */
    Response<TagsResource> createOrUpdateAtScopeWithResponse(
        String scope, TagsResourceInner parameters, Context context);

    /**
     * Creates or updates the entire set of tags on a resource or subscription.
     *
     * <p>This operation allows adding or replacing the entire set of tags on the specified resource or subscription.
     * The specified entity can have a maximum of 50 tags.
     *
     * @param scope The resource scope.
     * @param parameters Wrapper resource for tags API requests and responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wrapper resource for tags API requests and responses.
     */
    TagsResource createOrUpdateAtScope(String scope, TagsResourceInner parameters);

    /**
     * Selectively updates the set of tags on a resource or subscription.
     *
     * <p>This operation allows replacing, merging or selectively deleting tags on the specified resource or
     * subscription. The specified entity can have a maximum of 50 tags at the end of the operation. The 'replace'
     * option replaces the entire set of existing tags with a new set. The 'merge' option allows adding tags with new
     * names and updating the values of tags with existing names. The 'delete' option allows selectively deleting tags
     * based on given names or name/value pairs.
     *
     * @param scope The resource scope.
     * @param parameters Wrapper resource for tags patch API request only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wrapper resource for tags API requests and responses along with {@link Response}.
     */
    Response<TagsResource> updateAtScopeWithResponse(String scope, TagsPatchResource parameters, Context context);

    /**
     * Selectively updates the set of tags on a resource or subscription.
     *
     * <p>This operation allows replacing, merging or selectively deleting tags on the specified resource or
     * subscription. The specified entity can have a maximum of 50 tags at the end of the operation. The 'replace'
     * option replaces the entire set of existing tags with a new set. The 'merge' option allows adding tags with new
     * names and updating the values of tags with existing names. The 'delete' option allows selectively deleting tags
     * based on given names or name/value pairs.
     *
     * @param scope The resource scope.
     * @param parameters Wrapper resource for tags patch API request only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wrapper resource for tags API requests and responses.
     */
    TagsResource updateAtScope(String scope, TagsPatchResource parameters);

    /**
     * Gets the entire set of tags on a resource or subscription.
     *
     * @param scope The resource scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entire set of tags on a resource or subscription along with {@link Response}.
     */
    Response<TagsResource> getAtScopeWithResponse(String scope, Context context);

    /**
     * Gets the entire set of tags on a resource or subscription.
     *
     * @param scope The resource scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entire set of tags on a resource or subscription.
     */
    TagsResource getAtScope(String scope);

    /**
     * Deletes the entire set of tags on a resource or subscription.
     *
     * @param scope The resource scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteAtScopeWithResponse(String scope, Context context);

    /**
     * Deletes the entire set of tags on a resource or subscription.
     *
     * @param scope The resource scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAtScope(String scope);
}
