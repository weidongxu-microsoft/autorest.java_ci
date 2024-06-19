// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.generated.models.DnsSettings;
import com.azure.resourcemanager.network.generated.models.ExplicitProxy;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyInsights;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyIntrusionDetection;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySnat;
import com.azure.resourcemanager.network.generated.models.FirewallPolicySql;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyThreatIntelWhitelist;
import java.io.IOException;

/**
 * The FirewallPolicyDraftProperties model.
 */
@Fluent
public final class FirewallPolicyDraftProperties implements JsonSerializable<FirewallPolicyDraftProperties> {
    /*
     * The parent firewall policy from which rules are inherited.
     */
    private SubResource basePolicy;

    /*
     * The operation mode for Threat Intelligence.
     */
    private AzureFirewallThreatIntelMode threatIntelMode;

    /*
     * ThreatIntel Whitelist for Firewall Policy.
     */
    private FirewallPolicyThreatIntelWhitelist threatIntelWhitelist;

    /*
     * Insights on Firewall Policy.
     */
    private FirewallPolicyInsights insights;

    /*
     * The private IP addresses/IP ranges to which traffic will not be SNAT.
     */
    private FirewallPolicySnat snat;

    /*
     * SQL Settings definition.
     */
    private FirewallPolicySql sql;

    /*
     * DNS Proxy Settings definition.
     */
    private DnsSettings dnsSettings;

    /*
     * Explicit Proxy Settings definition.
     */
    private ExplicitProxy explicitProxy;

    /*
     * The configuration for Intrusion detection.
     */
    private FirewallPolicyIntrusionDetection intrusionDetection;

    /**
     * Creates an instance of FirewallPolicyDraftProperties class.
     */
    public FirewallPolicyDraftProperties() {
    }

    /**
     * Get the basePolicy property: The parent firewall policy from which rules are inherited.
     * 
     * @return the basePolicy value.
     */
    public SubResource basePolicy() {
        return this.basePolicy;
    }

    /**
     * Set the basePolicy property: The parent firewall policy from which rules are inherited.
     * 
     * @param basePolicy the basePolicy value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withBasePolicy(SubResource basePolicy) {
        this.basePolicy = basePolicy;
        return this;
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     * 
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     * 
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     * 
     * @return the threatIntelWhitelist value.
     */
    public FirewallPolicyThreatIntelWhitelist threatIntelWhitelist() {
        return this.threatIntelWhitelist;
    }

    /**
     * Set the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     * 
     * @param threatIntelWhitelist the threatIntelWhitelist value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties
        withThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist) {
        this.threatIntelWhitelist = threatIntelWhitelist;
        return this;
    }

    /**
     * Get the insights property: Insights on Firewall Policy.
     * 
     * @return the insights value.
     */
    public FirewallPolicyInsights insights() {
        return this.insights;
    }

    /**
     * Set the insights property: Insights on Firewall Policy.
     * 
     * @param insights the insights value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withInsights(FirewallPolicyInsights insights) {
        this.insights = insights;
        return this;
    }

    /**
     * Get the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     * @return the snat value.
     */
    public FirewallPolicySnat snat() {
        return this.snat;
    }

    /**
     * Set the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     * @param snat the snat value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withSnat(FirewallPolicySnat snat) {
        this.snat = snat;
        return this;
    }

    /**
     * Get the sql property: SQL Settings definition.
     * 
     * @return the sql value.
     */
    public FirewallPolicySql sql() {
        return this.sql;
    }

    /**
     * Set the sql property: SQL Settings definition.
     * 
     * @param sql the sql value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withSql(FirewallPolicySql sql) {
        this.sql = sql;
        return this;
    }

    /**
     * Get the dnsSettings property: DNS Proxy Settings definition.
     * 
     * @return the dnsSettings value.
     */
    public DnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: DNS Proxy Settings definition.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withDnsSettings(DnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the explicitProxy property: Explicit Proxy Settings definition.
     * 
     * @return the explicitProxy value.
     */
    public ExplicitProxy explicitProxy() {
        return this.explicitProxy;
    }

    /**
     * Set the explicitProxy property: Explicit Proxy Settings definition.
     * 
     * @param explicitProxy the explicitProxy value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withExplicitProxy(ExplicitProxy explicitProxy) {
        this.explicitProxy = explicitProxy;
        return this;
    }

    /**
     * Get the intrusionDetection property: The configuration for Intrusion detection.
     * 
     * @return the intrusionDetection value.
     */
    public FirewallPolicyIntrusionDetection intrusionDetection() {
        return this.intrusionDetection;
    }

    /**
     * Set the intrusionDetection property: The configuration for Intrusion detection.
     * 
     * @param intrusionDetection the intrusionDetection value to set.
     * @return the FirewallPolicyDraftProperties object itself.
     */
    public FirewallPolicyDraftProperties withIntrusionDetection(FirewallPolicyIntrusionDetection intrusionDetection) {
        this.intrusionDetection = intrusionDetection;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (threatIntelWhitelist() != null) {
            threatIntelWhitelist().validate();
        }
        if (insights() != null) {
            insights().validate();
        }
        if (snat() != null) {
            snat().validate();
        }
        if (sql() != null) {
            sql().validate();
        }
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (explicitProxy() != null) {
            explicitProxy().validate();
        }
        if (intrusionDetection() != null) {
            intrusionDetection().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("basePolicy", this.basePolicy);
        jsonWriter.writeStringField("threatIntelMode",
            this.threatIntelMode == null ? null : this.threatIntelMode.toString());
        jsonWriter.writeJsonField("threatIntelWhitelist", this.threatIntelWhitelist);
        jsonWriter.writeJsonField("insights", this.insights);
        jsonWriter.writeJsonField("snat", this.snat);
        jsonWriter.writeJsonField("sql", this.sql);
        jsonWriter.writeJsonField("dnsSettings", this.dnsSettings);
        jsonWriter.writeJsonField("explicitProxy", this.explicitProxy);
        jsonWriter.writeJsonField("intrusionDetection", this.intrusionDetection);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallPolicyDraftProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallPolicyDraftProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirewallPolicyDraftProperties.
     */
    public static FirewallPolicyDraftProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallPolicyDraftProperties deserializedFirewallPolicyDraftProperties
                = new FirewallPolicyDraftProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("basePolicy".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.basePolicy = SubResource.fromJson(reader);
                } else if ("threatIntelMode".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.threatIntelMode
                        = AzureFirewallThreatIntelMode.fromString(reader.getString());
                } else if ("threatIntelWhitelist".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.threatIntelWhitelist
                        = FirewallPolicyThreatIntelWhitelist.fromJson(reader);
                } else if ("insights".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.insights = FirewallPolicyInsights.fromJson(reader);
                } else if ("snat".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.snat = FirewallPolicySnat.fromJson(reader);
                } else if ("sql".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.sql = FirewallPolicySql.fromJson(reader);
                } else if ("dnsSettings".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.dnsSettings = DnsSettings.fromJson(reader);
                } else if ("explicitProxy".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.explicitProxy = ExplicitProxy.fromJson(reader);
                } else if ("intrusionDetection".equals(fieldName)) {
                    deserializedFirewallPolicyDraftProperties.intrusionDetection
                        = FirewallPolicyIntrusionDetection.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallPolicyDraftProperties;
        });
    }
}
