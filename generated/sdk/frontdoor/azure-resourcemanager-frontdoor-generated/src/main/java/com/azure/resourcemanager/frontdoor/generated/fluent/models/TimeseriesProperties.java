// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.models.AggregationInterval;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesDataPoint;
import com.azure.resourcemanager.frontdoor.generated.models.TimeseriesType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the properties of a timeseries. */
@Fluent
public final class TimeseriesProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimeseriesProperties.class);

    /*
     * The endpoint associated with the Timeseries data point
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /*
     * The start DateTime of the Timeseries in UTC
     */
    @JsonProperty(value = "startDateTimeUTC")
    private String startDateTimeUtc;

    /*
     * The end DateTime of the Timeseries in UTC
     */
    @JsonProperty(value = "endDateTimeUTC")
    private String endDateTimeUtc;

    /*
     * The aggregation interval of the Timeseries
     */
    @JsonProperty(value = "aggregationInterval")
    private AggregationInterval aggregationInterval;

    /*
     * The type of Timeseries
     */
    @JsonProperty(value = "timeseriesType")
    private TimeseriesType timeseriesType;

    /*
     * The country associated with the Timeseries. Values are country ISO codes
     * as specified here- https://www.iso.org/iso-3166-country-codes.html
     */
    @JsonProperty(value = "country")
    private String country;

    /*
     * The set of data points for the timeseries
     */
    @JsonProperty(value = "timeseriesData")
    private List<TimeseriesDataPoint> timeseriesData;

    /**
     * Get the endpoint property: The endpoint associated with the Timeseries data point.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint associated with the Timeseries data point.
     *
     * @param endpoint the endpoint value to set.
     * @return the TimeseriesProperties object itself.
     */
    public TimeseriesProperties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the startDateTimeUtc property: The start DateTime of the Timeseries in UTC.
     *
     * @return the startDateTimeUtc value.
     */
    public String startDateTimeUtc() {
        return this.startDateTimeUtc;
    }

    /**
     * Set the startDateTimeUtc property: The start DateTime of the Timeseries in UTC.
     *
     * @param startDateTimeUtc the startDateTimeUtc value to set.
     * @return the TimeseriesProperties object itself.
     */
    public TimeseriesProperties withStartDateTimeUtc(String startDateTimeUtc) {
        this.startDateTimeUtc = startDateTimeUtc;
        return this;
    }

    /**
     * Get the endDateTimeUtc property: The end DateTime of the Timeseries in UTC.
     *
     * @return the endDateTimeUtc value.
     */
    public String endDateTimeUtc() {
        return this.endDateTimeUtc;
    }

    /**
     * Set the endDateTimeUtc property: The end DateTime of the Timeseries in UTC.
     *
     * @param endDateTimeUtc the endDateTimeUtc value to set.
     * @return the TimeseriesProperties object itself.
     */
    public TimeseriesProperties withEndDateTimeUtc(String endDateTimeUtc) {
        this.endDateTimeUtc = endDateTimeUtc;
        return this;
    }

    /**
     * Get the aggregationInterval property: The aggregation interval of the Timeseries.
     *
     * @return the aggregationInterval value.
     */
    public AggregationInterval aggregationInterval() {
        return this.aggregationInterval;
    }

    /**
     * Set the aggregationInterval property: The aggregation interval of the Timeseries.
     *
     * @param aggregationInterval the aggregationInterval value to set.
     * @return the TimeseriesProperties object itself.
     */
    public TimeseriesProperties withAggregationInterval(AggregationInterval aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }

    /**
     * Get the timeseriesType property: The type of Timeseries.
     *
     * @return the timeseriesType value.
     */
    public TimeseriesType timeseriesType() {
        return this.timeseriesType;
    }

    /**
     * Set the timeseriesType property: The type of Timeseries.
     *
     * @param timeseriesType the timeseriesType value to set.
     * @return the TimeseriesProperties object itself.
     */
    public TimeseriesProperties withTimeseriesType(TimeseriesType timeseriesType) {
        this.timeseriesType = timeseriesType;
        return this;
    }

    /**
     * Get the country property: The country associated with the Timeseries. Values are country ISO codes as specified
     * here- https://www.iso.org/iso-3166-country-codes.html.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: The country associated with the Timeseries. Values are country ISO codes as specified
     * here- https://www.iso.org/iso-3166-country-codes.html.
     *
     * @param country the country value to set.
     * @return the TimeseriesProperties object itself.
     */
    public TimeseriesProperties withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the timeseriesData property: The set of data points for the timeseries.
     *
     * @return the timeseriesData value.
     */
    public List<TimeseriesDataPoint> timeseriesData() {
        return this.timeseriesData;
    }

    /**
     * Set the timeseriesData property: The set of data points for the timeseries.
     *
     * @param timeseriesData the timeseriesData value to set.
     * @return the TimeseriesProperties object itself.
     */
    public TimeseriesProperties withTimeseriesData(List<TimeseriesDataPoint> timeseriesData) {
        this.timeseriesData = timeseriesData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeseriesData() != null) {
            timeseriesData().forEach(e -> e.validate());
        }
    }
}
