// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.BackupRestoreOperationType;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.List;

/**
 * Description of a restore request.
 */
@Fluent
public final class RestoreRequestInner extends ProxyOnlyResource {
    /*
     * RestoreRequest resource specific properties
     */
    private RestoreRequestProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of RestoreRequestInner class.
     */
    public RestoreRequestInner() {
    }

    /**
     * Get the innerProperties property: RestoreRequest resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private RestoreRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestoreRequestInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the storageAccountUrl property: SAS URL to the container.
     * 
     * @return the storageAccountUrl value.
     */
    public String storageAccountUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountUrl();
    }

    /**
     * Set the storageAccountUrl property: SAS URL to the container.
     * 
     * @param storageAccountUrl the storageAccountUrl value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withStorageAccountUrl(String storageAccountUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withStorageAccountUrl(storageAccountUrl);
        return this;
    }

    /**
     * Get the blobName property: Name of a blob which contains the backup.
     * 
     * @return the blobName value.
     */
    public String blobName() {
        return this.innerProperties() == null ? null : this.innerProperties().blobName();
    }

    /**
     * Set the blobName property: Name of a blob which contains the backup.
     * 
     * @param blobName the blobName value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withBlobName(String blobName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withBlobName(blobName);
        return this;
    }

    /**
     * Get the overwrite property: &lt;code&gt;true&lt;/code&gt; if the restore operation can overwrite target app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. &lt;code&gt;true&lt;/code&gt; is needed if trying to restore over an
     * existing app.
     * 
     * @return the overwrite value.
     */
    public Boolean overwrite() {
        return this.innerProperties() == null ? null : this.innerProperties().overwrite();
    }

    /**
     * Set the overwrite property: &lt;code&gt;true&lt;/code&gt; if the restore operation can overwrite target app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. &lt;code&gt;true&lt;/code&gt; is needed if trying to restore over an
     * existing app.
     * 
     * @param overwrite the overwrite value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withOverwrite(Boolean overwrite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withOverwrite(overwrite);
        return this;
    }

    /**
     * Get the siteName property: Name of an app.
     * 
     * @return the siteName value.
     */
    public String siteName() {
        return this.innerProperties() == null ? null : this.innerProperties().siteName();
    }

    /**
     * Set the siteName property: Name of an app.
     * 
     * @param siteName the siteName value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withSiteName(String siteName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withSiteName(siteName);
        return this;
    }

    /**
     * Get the databases property: Collection of databases which should be restored. This list has to match the list of
     * databases included in the backup.
     * 
     * @return the databases value.
     */
    public List<DatabaseBackupSetting> databases() {
        return this.innerProperties() == null ? null : this.innerProperties().databases();
    }

    /**
     * Set the databases property: Collection of databases which should be restored. This list has to match the list of
     * databases included in the backup.
     * 
     * @param databases the databases value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withDatabases(List<DatabaseBackupSetting> databases) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withDatabases(databases);
        return this;
    }

    /**
     * Get the ignoreConflictingHostNames property: Changes a logic when restoring an app with custom domains.
     * &lt;code&gt;true&lt;/code&gt; to remove custom domains automatically. If &lt;code&gt;false&lt;/code&gt;, custom
     * domains are added to
     * the app's object when it is being restored, but that might fail due to conflicts during the operation.
     * 
     * @return the ignoreConflictingHostNames value.
     */
    public Boolean ignoreConflictingHostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().ignoreConflictingHostNames();
    }

    /**
     * Set the ignoreConflictingHostNames property: Changes a logic when restoring an app with custom domains.
     * &lt;code&gt;true&lt;/code&gt; to remove custom domains automatically. If &lt;code&gt;false&lt;/code&gt;, custom
     * domains are added to
     * the app's object when it is being restored, but that might fail due to conflicts during the operation.
     * 
     * @param ignoreConflictingHostNames the ignoreConflictingHostNames value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withIgnoreConflictingHostNames(Boolean ignoreConflictingHostNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withIgnoreConflictingHostNames(ignoreConflictingHostNames);
        return this;
    }

    /**
     * Get the ignoreDatabases property: Ignore the databases and only restore the site content.
     * 
     * @return the ignoreDatabases value.
     */
    public Boolean ignoreDatabases() {
        return this.innerProperties() == null ? null : this.innerProperties().ignoreDatabases();
    }

    /**
     * Set the ignoreDatabases property: Ignore the databases and only restore the site content.
     * 
     * @param ignoreDatabases the ignoreDatabases value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withIgnoreDatabases(Boolean ignoreDatabases) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withIgnoreDatabases(ignoreDatabases);
        return this;
    }

    /**
     * Get the appServicePlan property: Specify app service plan that will own restored site.
     * 
     * @return the appServicePlan value.
     */
    public String appServicePlan() {
        return this.innerProperties() == null ? null : this.innerProperties().appServicePlan();
    }

    /**
     * Set the appServicePlan property: Specify app service plan that will own restored site.
     * 
     * @param appServicePlan the appServicePlan value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withAppServicePlan(String appServicePlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withAppServicePlan(appServicePlan);
        return this;
    }

    /**
     * Get the operationType property: Operation type.
     * 
     * @return the operationType value.
     */
    public BackupRestoreOperationType operationType() {
        return this.innerProperties() == null ? null : this.innerProperties().operationType();
    }

    /**
     * Set the operationType property: Operation type.
     * 
     * @param operationType the operationType value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withOperationType(BackupRestoreOperationType operationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withOperationType(operationType);
        return this;
    }

    /**
     * Get the adjustConnectionStrings property: &lt;code&gt;true&lt;/code&gt; if SiteConfig.ConnectionStrings should be
     * set in new app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the adjustConnectionStrings value.
     */
    public Boolean adjustConnectionStrings() {
        return this.innerProperties() == null ? null : this.innerProperties().adjustConnectionStrings();
    }

    /**
     * Set the adjustConnectionStrings property: &lt;code&gt;true&lt;/code&gt; if SiteConfig.ConnectionStrings should be
     * set in new app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param adjustConnectionStrings the adjustConnectionStrings value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withAdjustConnectionStrings(Boolean adjustConnectionStrings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withAdjustConnectionStrings(adjustConnectionStrings);
        return this;
    }

    /**
     * Get the hostingEnvironment property: App Service Environment name, if needed (only when restoring an app to an
     * App Service Environment).
     * 
     * @return the hostingEnvironment value.
     */
    public String hostingEnvironment() {
        return this.innerProperties() == null ? null : this.innerProperties().hostingEnvironment();
    }

    /**
     * Set the hostingEnvironment property: App Service Environment name, if needed (only when restoring an app to an
     * App Service Environment).
     * 
     * @param hostingEnvironment the hostingEnvironment value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withHostingEnvironment(String hostingEnvironment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestoreRequestProperties();
        }
        this.innerProperties().withHostingEnvironment(hostingEnvironment);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestoreRequestInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestoreRequestInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RestoreRequestInner.
     */
    public static RestoreRequestInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestoreRequestInner deserializedRestoreRequestInner = new RestoreRequestInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRestoreRequestInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRestoreRequestInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRestoreRequestInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedRestoreRequestInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedRestoreRequestInner.innerProperties = RestoreRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestoreRequestInner;
        });
    }
}
