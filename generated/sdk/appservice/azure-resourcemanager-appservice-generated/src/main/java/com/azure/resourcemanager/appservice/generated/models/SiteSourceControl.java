// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteSourceControlInner;

/**
 * An immutable client-side representation of SiteSourceControl.
 */
public interface SiteSourceControl {
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
     * Gets the repoUrl property: Repository or source control URL.
     * 
     * @return the repoUrl value.
     */
    String repoUrl();

    /**
     * Gets the branch property: Name of branch to use for deployment.
     * 
     * @return the branch value.
     */
    String branch();

    /**
     * Gets the isManualIntegration property: &lt;code&gt;true&lt;/code&gt; to limit to manual integration; &lt;code&gt;false&lt;/code&gt; to enable continuous integration (which configures webhooks into online repos like GitHub).
     * 
     * @return the isManualIntegration value.
     */
    Boolean isManualIntegration();

    /**
     * Gets the isGitHubAction property: &lt;code&gt;true&lt;/code&gt; if this is deployed via GitHub action.
     * 
     * @return the isGitHubAction value.
     */
    Boolean isGitHubAction();

    /**
     * Gets the deploymentRollbackEnabled property: &lt;code&gt;true&lt;/code&gt; to enable deployment rollback; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the deploymentRollbackEnabled value.
     */
    Boolean deploymentRollbackEnabled();

    /**
     * Gets the isMercurial property: &lt;code&gt;true&lt;/code&gt; for a Mercurial repository; &lt;code&gt;false&lt;/code&gt; for a Git repository.
     * 
     * @return the isMercurial value.
     */
    Boolean isMercurial();

    /**
     * Gets the gitHubActionConfiguration property: If GitHub Action is selected, than the associated configuration.
     * 
     * @return the gitHubActionConfiguration value.
     */
    GitHubActionConfiguration gitHubActionConfiguration();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SiteSourceControlInner object.
     * 
     * @return the inner object.
     */
    SiteSourceControlInner innerModel();
}
