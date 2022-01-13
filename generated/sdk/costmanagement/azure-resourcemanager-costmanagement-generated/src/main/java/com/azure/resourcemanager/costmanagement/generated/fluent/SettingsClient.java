// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.SettingInner;

/** An instance of this class provides access to all the operations defined in SettingsClient. */
public interface SettingsClient {
    /**
     * Lists all of the settings that have been customized.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SettingInner> list();

    /**
     * Lists all of the settings that have been customized.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SettingInner> list(Context context);

    /**
     * Retrieves the current value for a specific setting.
     *
     * @param settingName Name of the setting. Allowed values: myscope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return state of the myscope setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SettingInner get(String settingName);

    /**
     * Retrieves the current value for a specific setting.
     *
     * @param settingName Name of the setting. Allowed values: myscope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return state of the myscope setting along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SettingInner> getWithResponse(String settingName, Context context);

    /**
     * Sets a new value for a specific setting.
     *
     * @param settingName Name of the setting. Allowed values: myscope.
     * @param parameters Body supplied to the CreateOrUpdate setting operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return state of the myscope setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SettingInner createOrUpdate(String settingName, SettingInner parameters);

    /**
     * Sets a new value for a specific setting.
     *
     * @param settingName Name of the setting. Allowed values: myscope.
     * @param parameters Body supplied to the CreateOrUpdate setting operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return state of the myscope setting along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SettingInner> createOrUpdateWithResponse(String settingName, SettingInner parameters, Context context);

    /**
     * Remove the current value for a specific setting and reverts back to the default value, if applicable.
     *
     * @param settingName Name of the setting. Allowed values: myscope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String settingName);

    /**
     * Remove the current value for a specific setting and reverts back to the default value, if applicable.
     *
     * @param settingName Name of the setting. Allowed values: myscope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String settingName, Context context);
}
