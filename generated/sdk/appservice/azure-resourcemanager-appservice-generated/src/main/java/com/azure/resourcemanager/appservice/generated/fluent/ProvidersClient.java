// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.ApplicationStackResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmOperationDescriptionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.FunctionAppStackInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.WebAppStackInner;
import com.azure.resourcemanager.appservice.generated.models.ProviderOsTypeSelected;
import com.azure.resourcemanager.appservice.generated.models.ProviderStackOsType;

/**
 * An instance of this class provides access to all the operations defined in ProvidersClient.
 */
public interface ProvidersClient {
    /**
     * Get available application frameworks and their versions
     * 
     * Description for Get available application frameworks and their versions.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> getAvailableStacks();

    /**
     * Get available application frameworks and their versions
     * 
     * Description for Get available application frameworks and their versions.
     * 
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> getAvailableStacks(ProviderOsTypeSelected osTypeSelected,
        Context context);

    /**
     * Get available Function app frameworks and their versions
     * 
     * Description for Get available Function app frameworks and their versions.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacks();

    /**
     * Get available Function app frameworks and their versions
     * 
     * Description for Get available Function app frameworks and their versions.
     * 
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacks(ProviderStackOsType stackOsType, Context context);

    /**
     * Get available Function app frameworks and their versions for location
     * 
     * Description for Get available Function app frameworks and their versions for location.
     * 
     * @param location Function App stack location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacksForLocation(String location);

    /**
     * Get available Function app frameworks and their versions for location
     * 
     * Description for Get available Function app frameworks and their versions for location.
     * 
     * @param location Function App stack location.
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacksForLocation(String location,
        ProviderStackOsType stackOsType, Context context);

    /**
     * Get available Web app frameworks and their versions for location
     * 
     * Description for Get available Web app frameworks and their versions for location.
     * 
     * @param location Web App stack location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacksForLocation(String location);

    /**
     * Get available Web app frameworks and their versions for location
     * 
     * Description for Get available Web app frameworks and their versions for location.
     * 
     * @param location Web App stack location.
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacksForLocation(String location, ProviderStackOsType stackOsType,
        Context context);

    /**
     * Gets all available operations for the Microsoft.Web resource provider. Also exposes resource metric definitions
     * 
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource metric definitions.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CsmOperationDescriptionInner> listOperations();

    /**
     * Gets all available operations for the Microsoft.Web resource provider. Also exposes resource metric definitions
     * 
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource metric definitions.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CsmOperationDescriptionInner> listOperations(Context context);

    /**
     * Get available Web app frameworks and their versions
     * 
     * Description for Get available Web app frameworks and their versions.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacks();

    /**
     * Get available Web app frameworks and their versions
     * 
     * Description for Get available Web app frameworks and their versions.
     * 
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacks(ProviderStackOsType stackOsType, Context context);

    /**
     * Get available application frameworks and their versions
     * 
     * Description for Get available application frameworks and their versions.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> list();

    /**
     * Get available application frameworks and their versions
     * 
     * Description for Get available application frameworks and their versions.
     * 
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> list(ProviderOsTypeSelected osTypeSelected, Context context);
}
