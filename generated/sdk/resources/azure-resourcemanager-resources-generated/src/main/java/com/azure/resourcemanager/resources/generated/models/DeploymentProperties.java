// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Deployment properties.
 */
@Fluent
public class DeploymentProperties implements JsonSerializable<DeploymentProperties> {
    /*
     * The template content. You use this element when you want to pass the template syntax directly in the request
     * rather than link to an existing template. It can be a JObject or well-formed JSON string. Use either the
     * templateLink property or the template property, but not both.
     */
    private Object template;

    /*
     * The URI of the template. Use either the templateLink property or the template property, but not both.
     */
    private TemplateLink templateLink;

    /*
     * Name and value pairs that define the deployment parameters for the template. You use this element when you want
     * to provide the parameter values directly in the request rather than link to an existing parameter file. Use
     * either the parametersLink property or the parameters property, but not both. It can be a JObject or a well formed
     * JSON string.
     */
    private Object parameters;

    /*
     * The URI of parameters file. You use this element to link to an existing parameters file. Use either the
     * parametersLink property or the parameters property, but not both.
     */
    private ParametersLink parametersLink;

    /*
     * The mode that is used to deploy resources. This value can be either Incremental or Complete. In Incremental mode,
     * resources are deployed without deleting existing resources that are not included in the template. In Complete
     * mode, resources are deployed and existing resources in the resource group that are not included in the template
     * are deleted. Be careful when using Complete mode as you may unintentionally delete resources.
     */
    private DeploymentMode mode;

    /*
     * The debug setting of the deployment.
     */
    private DebugSetting debugSetting;

    /*
     * The deployment on error behavior.
     */
    private OnErrorDeployment onErrorDeployment;

    /*
     * Specifies whether template expressions are evaluated within the scope of the parent template or nested template.
     * Only applicable to nested templates. If not specified, default value is outer.
     */
    private ExpressionEvaluationOptions expressionEvaluationOptions;

    /**
     * Creates an instance of DeploymentProperties class.
     */
    public DeploymentProperties() {
    }

    /**
     * Get the template property: The template content. You use this element when you want to pass the template syntax
     * directly in the request rather than link to an existing template. It can be a JObject or well-formed JSON string.
     * Use either the templateLink property or the template property, but not both.
     * 
     * @return the template value.
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template property: The template content. You use this element when you want to pass the template syntax
     * directly in the request rather than link to an existing template. It can be a JObject or well-formed JSON string.
     * Use either the templateLink property or the template property, but not both.
     * 
     * @param template the template value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the templateLink property: The URI of the template. Use either the templateLink property or the template
     * property, but not both.
     * 
     * @return the templateLink value.
     */
    public TemplateLink templateLink() {
        return this.templateLink;
    }

    /**
     * Set the templateLink property: The URI of the template. Use either the templateLink property or the template
     * property, but not both.
     * 
     * @param templateLink the templateLink value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withTemplateLink(TemplateLink templateLink) {
        this.templateLink = templateLink;
        return this;
    }

    /**
     * Get the parameters property: Name and value pairs that define the deployment parameters for the template. You use
     * this element when you want to provide the parameter values directly in the request rather than link to an
     * existing parameter file. Use either the parametersLink property or the parameters property, but not both. It can
     * be a JObject or a well formed JSON string.
     * 
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Name and value pairs that define the deployment parameters for the template. You use
     * this element when you want to provide the parameter values directly in the request rather than link to an
     * existing parameter file. Use either the parametersLink property or the parameters property, but not both. It can
     * be a JObject or a well formed JSON string.
     * 
     * @param parameters the parameters value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the parametersLink property: The URI of parameters file. You use this element to link to an existing
     * parameters file. Use either the parametersLink property or the parameters property, but not both.
     * 
     * @return the parametersLink value.
     */
    public ParametersLink parametersLink() {
        return this.parametersLink;
    }

    /**
     * Set the parametersLink property: The URI of parameters file. You use this element to link to an existing
     * parameters file. Use either the parametersLink property or the parameters property, but not both.
     * 
     * @param parametersLink the parametersLink value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withParametersLink(ParametersLink parametersLink) {
        this.parametersLink = parametersLink;
        return this;
    }

    /**
     * Get the mode property: The mode that is used to deploy resources. This value can be either Incremental or
     * Complete. In Incremental mode, resources are deployed without deleting existing resources that are not included
     * in the template. In Complete mode, resources are deployed and existing resources in the resource group that are
     * not included in the template are deleted. Be careful when using Complete mode as you may unintentionally delete
     * resources.
     * 
     * @return the mode value.
     */
    public DeploymentMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The mode that is used to deploy resources. This value can be either Incremental or
     * Complete. In Incremental mode, resources are deployed without deleting existing resources that are not included
     * in the template. In Complete mode, resources are deployed and existing resources in the resource group that are
     * not included in the template are deleted. Be careful when using Complete mode as you may unintentionally delete
     * resources.
     * 
     * @param mode the mode value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withMode(DeploymentMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the debugSetting property: The debug setting of the deployment.
     * 
     * @return the debugSetting value.
     */
    public DebugSetting debugSetting() {
        return this.debugSetting;
    }

    /**
     * Set the debugSetting property: The debug setting of the deployment.
     * 
     * @param debugSetting the debugSetting value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withDebugSetting(DebugSetting debugSetting) {
        this.debugSetting = debugSetting;
        return this;
    }

    /**
     * Get the onErrorDeployment property: The deployment on error behavior.
     * 
     * @return the onErrorDeployment value.
     */
    public OnErrorDeployment onErrorDeployment() {
        return this.onErrorDeployment;
    }

    /**
     * Set the onErrorDeployment property: The deployment on error behavior.
     * 
     * @param onErrorDeployment the onErrorDeployment value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withOnErrorDeployment(OnErrorDeployment onErrorDeployment) {
        this.onErrorDeployment = onErrorDeployment;
        return this;
    }

    /**
     * Get the expressionEvaluationOptions property: Specifies whether template expressions are evaluated within the
     * scope of the parent template or nested template. Only applicable to nested templates. If not specified, default
     * value is outer.
     * 
     * @return the expressionEvaluationOptions value.
     */
    public ExpressionEvaluationOptions expressionEvaluationOptions() {
        return this.expressionEvaluationOptions;
    }

    /**
     * Set the expressionEvaluationOptions property: Specifies whether template expressions are evaluated within the
     * scope of the parent template or nested template. Only applicable to nested templates. If not specified, default
     * value is outer.
     * 
     * @param expressionEvaluationOptions the expressionEvaluationOptions value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties
        withExpressionEvaluationOptions(ExpressionEvaluationOptions expressionEvaluationOptions) {
        this.expressionEvaluationOptions = expressionEvaluationOptions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (templateLink() != null) {
            templateLink().validate();
        }
        if (parametersLink() != null) {
            parametersLink().validate();
        }
        if (mode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property mode in model DeploymentProperties"));
        }
        if (debugSetting() != null) {
            debugSetting().validate();
        }
        if (onErrorDeployment() != null) {
            onErrorDeployment().validate();
        }
        if (expressionEvaluationOptions() != null) {
            expressionEvaluationOptions().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeploymentProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        jsonWriter.writeUntypedField("template", this.template);
        jsonWriter.writeJsonField("templateLink", this.templateLink);
        jsonWriter.writeUntypedField("parameters", this.parameters);
        jsonWriter.writeJsonField("parametersLink", this.parametersLink);
        jsonWriter.writeJsonField("debugSetting", this.debugSetting);
        jsonWriter.writeJsonField("onErrorDeployment", this.onErrorDeployment);
        jsonWriter.writeJsonField("expressionEvaluationOptions", this.expressionEvaluationOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeploymentProperties.
     */
    public static DeploymentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentProperties deserializedDeploymentProperties = new DeploymentProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("mode".equals(fieldName)) {
                    deserializedDeploymentProperties.mode = DeploymentMode.fromString(reader.getString());
                } else if ("template".equals(fieldName)) {
                    deserializedDeploymentProperties.template = reader.readUntyped();
                } else if ("templateLink".equals(fieldName)) {
                    deserializedDeploymentProperties.templateLink = TemplateLink.fromJson(reader);
                } else if ("parameters".equals(fieldName)) {
                    deserializedDeploymentProperties.parameters = reader.readUntyped();
                } else if ("parametersLink".equals(fieldName)) {
                    deserializedDeploymentProperties.parametersLink = ParametersLink.fromJson(reader);
                } else if ("debugSetting".equals(fieldName)) {
                    deserializedDeploymentProperties.debugSetting = DebugSetting.fromJson(reader);
                } else if ("onErrorDeployment".equals(fieldName)) {
                    deserializedDeploymentProperties.onErrorDeployment = OnErrorDeployment.fromJson(reader);
                } else if ("expressionEvaluationOptions".equals(fieldName)) {
                    deserializedDeploymentProperties.expressionEvaluationOptions
                        = ExpressionEvaluationOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentProperties;
        });
    }
}
