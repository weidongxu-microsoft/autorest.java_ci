// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyDefinitionInner;

/** An instance of this class provides access to all the operations defined in PolicyDefinitionsClient. */
public interface PolicyDefinitionsClient {
    /**
     * This operation creates or updates a policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner createOrUpdate(String policyDefinitionName, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> createOrUpdateWithResponse(
        String policyDefinitionName, PolicyDefinitionInner parameters, Context context);

    /**
     * This operation deletes the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String policyDefinitionName);

    /**
     * This operation deletes the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String policyDefinitionName, Context context);

    /**
     * This operation retrieves the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner get(String policyDefinitionName);

    /**
     * This operation retrieves the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> getWithResponse(String policyDefinitionName, Context context);

    /**
     * This operation retrieves the built-in policy definition with the given name.
     *
     * @param policyDefinitionName The name of the built-in policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner getBuiltIn(String policyDefinitionName);

    /**
     * This operation retrieves the built-in policy definition with the given name.
     *
     * @param policyDefinitionName The name of the built-in policy definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> getBuiltInWithResponse(String policyDefinitionName, Context context);

    /**
     * This operation creates or updates a policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner createOrUpdateAtManagementGroup(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> createOrUpdateAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters, Context context);

    /**
     * This operation deletes the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAtManagementGroup(String policyDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner getAtManagementGroup(String policyDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> getAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves a list of all the policy definitions in a given subscription that match the optional
     * given $filter. Valid values for $filter are: 'atExactScope()', 'policyType -eq {value}' or 'category eq
     * '{value}''. If $filter is not provided, the unfiltered list includes all policy definitions associated with the
     * subscription, including those that apply directly or from management groups that contain the given subscription.
     * If $filter=atExactScope() is provided, the returned list only includes all policy definitions that at the given
     * subscription. If $filter='policyType -eq {value}' is provided, the returned list only includes all policy
     * definitions whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom, and
     * Static. If $filter='category -eq {value}' is provided, the returned list only includes all policy definitions
     * whose category match the {value}.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> list();

    /**
     * This operation retrieves a list of all the policy definitions in a given subscription that match the optional
     * given $filter. Valid values for $filter are: 'atExactScope()', 'policyType -eq {value}' or 'category eq
     * '{value}''. If $filter is not provided, the unfiltered list includes all policy definitions associated with the
     * subscription, including those that apply directly or from management groups that contain the given subscription.
     * If $filter=atExactScope() is provided, the returned list only includes all policy definitions that at the given
     * subscription. If $filter='policyType -eq {value}' is provided, the returned list only includes all policy
     * definitions whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom, and
     * Static. If $filter='category -eq {value}' is provided, the returned list only includes all policy definitions
     * whose category match the {value}.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atExactScope()', 'policyType
     *     -eq {value}' or 'category eq '{value}''. If $filter is not provided, no filtering is performed. If
     *     $filter=atExactScope() is provided, the returned list only includes all policy definitions that at the given
     *     scope. If $filter='policyType -eq {value}' is provided, the returned list only includes all policy
     *     definitions whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom, and
     *     Static. If $filter='category -eq {value}' is provided, the returned list only includes all policy definitions
     *     whose category match the {value}.
     * @param top Maximum number of records to return. When the $top filter is not provided, it will return 500 records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> list(String filter, Integer top, Context context);

    /**
     * This operation retrieves a list of all the built-in policy definitions that match the optional given $filter. If
     * $filter='policyType -eq {value}' is provided, the returned list only includes all built-in policy definitions
     * whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom, and Static. If
     * $filter='category -eq {value}' is provided, the returned list only includes all built-in policy definitions whose
     * category match the {value}.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listBuiltIn();

    /**
     * This operation retrieves a list of all the built-in policy definitions that match the optional given $filter. If
     * $filter='policyType -eq {value}' is provided, the returned list only includes all built-in policy definitions
     * whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom, and Static. If
     * $filter='category -eq {value}' is provided, the returned list only includes all built-in policy definitions whose
     * category match the {value}.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atExactScope()', 'policyType
     *     -eq {value}' or 'category eq '{value}''. If $filter is not provided, no filtering is performed. If
     *     $filter=atExactScope() is provided, the returned list only includes all policy definitions that at the given
     *     scope. If $filter='policyType -eq {value}' is provided, the returned list only includes all policy
     *     definitions whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom, and
     *     Static. If $filter='category -eq {value}' is provided, the returned list only includes all policy definitions
     *     whose category match the {value}.
     * @param top Maximum number of records to return. When the $top filter is not provided, it will return 500 records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listBuiltIn(String filter, Integer top, Context context);

    /**
     * This operation retrieves a list of all the policy definitions in a given management group that match the optional
     * given $filter. Valid values for $filter are: 'atExactScope()', 'policyType -eq {value}' or 'category eq
     * '{value}''. If $filter is not provided, the unfiltered list includes all policy definitions associated with the
     * management group, including those that apply directly or from management groups that contain the given management
     * group. If $filter=atExactScope() is provided, the returned list only includes all policy definitions that at the
     * given management group. If $filter='policyType -eq {value}' is provided, the returned list only includes all
     * policy definitions whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom,
     * and Static. If $filter='category -eq {value}' is provided, the returned list only includes all policy definitions
     * whose category match the {value}.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listByManagementGroup(String managementGroupId);

    /**
     * This operation retrieves a list of all the policy definitions in a given management group that match the optional
     * given $filter. Valid values for $filter are: 'atExactScope()', 'policyType -eq {value}' or 'category eq
     * '{value}''. If $filter is not provided, the unfiltered list includes all policy definitions associated with the
     * management group, including those that apply directly or from management groups that contain the given management
     * group. If $filter=atExactScope() is provided, the returned list only includes all policy definitions that at the
     * given management group. If $filter='policyType -eq {value}' is provided, the returned list only includes all
     * policy definitions whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom,
     * and Static. If $filter='category -eq {value}' is provided, the returned list only includes all policy definitions
     * whose category match the {value}.
     *
     * @param managementGroupId The ID of the management group.
     * @param filter The filter to apply on the operation. Valid values for $filter are: 'atExactScope()', 'policyType
     *     -eq {value}' or 'category eq '{value}''. If $filter is not provided, no filtering is performed. If
     *     $filter=atExactScope() is provided, the returned list only includes all policy definitions that at the given
     *     scope. If $filter='policyType -eq {value}' is provided, the returned list only includes all policy
     *     definitions whose type match the {value}. Possible policyType values are NotSpecified, BuiltIn, Custom, and
     *     Static. If $filter='category -eq {value}' is provided, the returned list only includes all policy definitions
     *     whose category match the {value}.
     * @param top Maximum number of records to return. When the $top filter is not provided, it will return 500 records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listByManagementGroup(
        String managementGroupId, String filter, Integer top, Context context);
}
