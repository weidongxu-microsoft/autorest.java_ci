// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.FunctionEnvelopeInner;
import java.util.Map;

/**
 * An immutable client-side representation of FunctionEnvelope.
 */
public interface FunctionEnvelope {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the functionAppId property: Function App ID.
     * 
     * @return the functionAppId value.
     */
    String functionAppId();

    /**
     * Gets the scriptRootPathHref property: Script root path URI.
     * 
     * @return the scriptRootPathHref value.
     */
    String scriptRootPathHref();

    /**
     * Gets the scriptHref property: Script URI.
     * 
     * @return the scriptHref value.
     */
    String scriptHref();

    /**
     * Gets the configHref property: Config URI.
     * 
     * @return the configHref value.
     */
    String configHref();

    /**
     * Gets the testDataHref property: Test data URI.
     * 
     * @return the testDataHref value.
     */
    String testDataHref();

    /**
     * Gets the secretsFileHref property: Secrets file URI.
     * 
     * @return the secretsFileHref value.
     */
    String secretsFileHref();

    /**
     * Gets the href property: Function URI.
     * 
     * @return the href value.
     */
    String href();

    /**
     * Gets the config property: Config information.
     * 
     * @return the config value.
     */
    Object config();

    /**
     * Gets the files property: File list.
     * 
     * @return the files value.
     */
    Map<String, String> files();

    /**
     * Gets the testData property: Test data used when testing via the Azure Portal.
     * 
     * @return the testData value.
     */
    String testData();

    /**
     * Gets the invokeUrlTemplate property: The invocation URL.
     * 
     * @return the invokeUrlTemplate value.
     */
    String invokeUrlTemplate();

    /**
     * Gets the language property: The function language.
     * 
     * @return the language value.
     */
    String language();

    /**
     * Gets the isDisabled property: Gets or sets a value indicating whether the function is disabled.
     * 
     * @return the isDisabled value.
     */
    Boolean isDisabled();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.FunctionEnvelopeInner object.
     * 
     * @return the inner object.
     */
    FunctionEnvelopeInner innerModel();

    /**
     * The entirety of the FunctionEnvelope definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The FunctionEnvelope definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FunctionEnvelope definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             * 
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Site name.
             * @return the next definition stage.
             */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the FunctionEnvelope definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithKind, DefinitionStages.WithFunctionAppId,
            DefinitionStages.WithScriptRootPathHref, DefinitionStages.WithScriptHref, DefinitionStages.WithConfigHref,
            DefinitionStages.WithTestDataHref, DefinitionStages.WithSecretsFileHref, DefinitionStages.WithHref,
            DefinitionStages.WithConfig, DefinitionStages.WithFiles, DefinitionStages.WithTestData,
            DefinitionStages.WithInvokeUrlTemplate, DefinitionStages.WithLanguage, DefinitionStages.WithIsDisabled {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FunctionEnvelope create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FunctionEnvelope create(Context context);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify functionAppId.
         */
        interface WithFunctionAppId {
            /**
             * Specifies the functionAppId property: Function App ID..
             * 
             * @param functionAppId Function App ID.
             * @return the next definition stage.
             */
            WithCreate withFunctionAppId(String functionAppId);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify scriptRootPathHref.
         */
        interface WithScriptRootPathHref {
            /**
             * Specifies the scriptRootPathHref property: Script root path URI..
             * 
             * @param scriptRootPathHref Script root path URI.
             * @return the next definition stage.
             */
            WithCreate withScriptRootPathHref(String scriptRootPathHref);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify scriptHref.
         */
        interface WithScriptHref {
            /**
             * Specifies the scriptHref property: Script URI..
             * 
             * @param scriptHref Script URI.
             * @return the next definition stage.
             */
            WithCreate withScriptHref(String scriptHref);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify configHref.
         */
        interface WithConfigHref {
            /**
             * Specifies the configHref property: Config URI..
             * 
             * @param configHref Config URI.
             * @return the next definition stage.
             */
            WithCreate withConfigHref(String configHref);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify testDataHref.
         */
        interface WithTestDataHref {
            /**
             * Specifies the testDataHref property: Test data URI..
             * 
             * @param testDataHref Test data URI.
             * @return the next definition stage.
             */
            WithCreate withTestDataHref(String testDataHref);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify secretsFileHref.
         */
        interface WithSecretsFileHref {
            /**
             * Specifies the secretsFileHref property: Secrets file URI..
             * 
             * @param secretsFileHref Secrets file URI.
             * @return the next definition stage.
             */
            WithCreate withSecretsFileHref(String secretsFileHref);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify href.
         */
        interface WithHref {
            /**
             * Specifies the href property: Function URI..
             * 
             * @param href Function URI.
             * @return the next definition stage.
             */
            WithCreate withHref(String href);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify config.
         */
        interface WithConfig {
            /**
             * Specifies the config property: Config information..
             * 
             * @param config Config information.
             * @return the next definition stage.
             */
            WithCreate withConfig(Object config);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify files.
         */
        interface WithFiles {
            /**
             * Specifies the files property: File list..
             * 
             * @param files File list.
             * @return the next definition stage.
             */
            WithCreate withFiles(Map<String, String> files);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify testData.
         */
        interface WithTestData {
            /**
             * Specifies the testData property: Test data used when testing via the Azure Portal..
             * 
             * @param testData Test data used when testing via the Azure Portal.
             * @return the next definition stage.
             */
            WithCreate withTestData(String testData);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify invokeUrlTemplate.
         */
        interface WithInvokeUrlTemplate {
            /**
             * Specifies the invokeUrlTemplate property: The invocation URL.
             * 
             * @param invokeUrlTemplate The invocation URL.
             * @return the next definition stage.
             */
            WithCreate withInvokeUrlTemplate(String invokeUrlTemplate);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify language.
         */
        interface WithLanguage {
            /**
             * Specifies the language property: The function language.
             * 
             * @param language The function language.
             * @return the next definition stage.
             */
            WithCreate withLanguage(String language);
        }

        /**
         * The stage of the FunctionEnvelope definition allowing to specify isDisabled.
         */
        interface WithIsDisabled {
            /**
             * Specifies the isDisabled property: Gets or sets a value indicating whether the function is disabled.
             * 
             * @param isDisabled Gets or sets a value indicating whether the function is disabled.
             * @return the next definition stage.
             */
            WithCreate withIsDisabled(Boolean isDisabled);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    FunctionEnvelope refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FunctionEnvelope refresh(Context context);

    /**
     * Get function keys for a function in a web site, or a deployment slot.
     * 
     * Description for Get function keys for a function in a web site, or a deployment slot.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource along with {@link Response}.
     */
    Response<StringDictionary> listFunctionKeysWithResponse(Context context);

    /**
     * Get function keys for a function in a web site, or a deployment slot.
     * 
     * Description for Get function keys for a function in a web site, or a deployment slot.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return string dictionary resource.
     */
    StringDictionary listFunctionKeys();

    /**
     * Get function secrets for a function in a web site, or a deployment slot.
     * 
     * Description for Get function secrets for a function in a web site, or a deployment slot.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return function secrets along with {@link Response}.
     */
    Response<FunctionSecrets> listFunctionSecretsWithResponse(Context context);

    /**
     * Get function secrets for a function in a web site, or a deployment slot.
     * 
     * Description for Get function secrets for a function in a web site, or a deployment slot.
     * 
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return function secrets.
     */
    FunctionSecrets listFunctionSecrets();
}
