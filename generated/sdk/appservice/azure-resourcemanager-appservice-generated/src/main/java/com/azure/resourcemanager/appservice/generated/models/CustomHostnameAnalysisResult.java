// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.CustomHostnameAnalysisResultInner;
import java.util.List;

/**
 * An immutable client-side representation of CustomHostnameAnalysisResult.
 */
public interface CustomHostnameAnalysisResult {
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
     * Gets the isHostnameAlreadyVerified property: &lt;code&gt;true&lt;/code&gt; if hostname is already verified;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isHostnameAlreadyVerified value.
     */
    Boolean isHostnameAlreadyVerified();

    /**
     * Gets the customDomainVerificationTest property: DNS verification test result.
     * 
     * @return the customDomainVerificationTest value.
     */
    DnsVerificationTestResult customDomainVerificationTest();

    /**
     * Gets the customDomainVerificationFailureInfo property: Raw failure information if DNS verification fails.
     * 
     * @return the customDomainVerificationFailureInfo value.
     */
    ErrorEntity customDomainVerificationFailureInfo();

    /**
     * Gets the hasConflictOnScaleUnit property: &lt;code&gt;true&lt;/code&gt; if there is a conflict on a scale unit;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the hasConflictOnScaleUnit value.
     */
    Boolean hasConflictOnScaleUnit();

    /**
     * Gets the hasConflictAcrossSubscription property: &lt;code&gt;true&lt;/code&gt; if there is a conflict across
     * subscriptions; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the hasConflictAcrossSubscription value.
     */
    Boolean hasConflictAcrossSubscription();

    /**
     * Gets the conflictingAppResourceId property: Name of the conflicting app on scale unit if it's within the same
     * subscription.
     * 
     * @return the conflictingAppResourceId value.
     */
    String conflictingAppResourceId();

    /**
     * Gets the cNameRecords property: CName records controller can see for this hostname.
     * 
     * @return the cNameRecords value.
     */
    List<String> cNameRecords();

    /**
     * Gets the txtRecords property: TXT records controller can see for this hostname.
     * 
     * @return the txtRecords value.
     */
    List<String> txtRecords();

    /**
     * Gets the aRecords property: A records controller can see for this hostname.
     * 
     * @return the aRecords value.
     */
    List<String> aRecords();

    /**
     * Gets the alternateCNameRecords property: Alternate CName records controller can see for this hostname.
     * 
     * @return the alternateCNameRecords value.
     */
    List<String> alternateCNameRecords();

    /**
     * Gets the alternateTxtRecords property: Alternate TXT records controller can see for this hostname.
     * 
     * @return the alternateTxtRecords value.
     */
    List<String> alternateTxtRecords();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.CustomHostnameAnalysisResultInner
     * object.
     * 
     * @return the inner object.
     */
    CustomHostnameAnalysisResultInner innerModel();
}
