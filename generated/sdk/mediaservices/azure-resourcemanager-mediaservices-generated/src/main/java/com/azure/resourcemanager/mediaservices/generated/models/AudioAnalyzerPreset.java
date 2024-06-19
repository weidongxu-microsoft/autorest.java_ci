// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The Audio Analyzer preset applies a pre-defined set of AI-based analysis operations, including speech transcription.
 * Currently, the preset supports processing of content with a single audio track.
 */
@Fluent
public class AudioAnalyzerPreset extends Preset {
    /*
     * The discriminator for derived types.
     */
    private String odataType = "#Microsoft.Media.AudioAnalyzerPreset";

    /*
     * The language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').
     * If you know the language of your content, it is recommended that you specify it. The language must be specified
     * explicitly for AudioAnalysisMode::Basic, since automatic language detection is not included in basic mode. If the
     * language isn't specified or set to null, automatic language detection will choose the first language detected and
     * process with the selected language for the duration of the file. It does not currently support dynamically
     * switching between languages after the first language is detected. The automatic detection works best with audio
     * recordings with clearly discernable speech. If automatic detection fails to find the language, transcription
     * would fallback to 'en-US'." The list of supported languages is available here:
     * https://go.microsoft.com/fwlink/?linkid=2109463
     */
    private String audioLanguage;

    /*
     * Determines the set of audio analysis operations to be performed. If unspecified, the Standard AudioAnalysisMode
     * would be chosen.
     */
    private AudioAnalysisMode mode;

    /*
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     */
    private Map<String, String> experimentalOptions;

    /**
     * Creates an instance of AudioAnalyzerPreset class.
     */
    public AudioAnalyzerPreset() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the audioLanguage property: The language for the audio payload in the input using the BCP-47 format of
     * 'language tag-region' (e.g: 'en-US'). If you know the language of your content, it is recommended that you
     * specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language
     * detection is not included in basic mode. If the language isn't specified or set to null, automatic language
     * detection will choose the first language detected and process with the selected language for the duration of the
     * file. It does not currently support dynamically switching between languages after the first language is detected.
     * The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection
     * fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is
     * available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     * 
     * @return the audioLanguage value.
     */
    public String audioLanguage() {
        return this.audioLanguage;
    }

    /**
     * Set the audioLanguage property: The language for the audio payload in the input using the BCP-47 format of
     * 'language tag-region' (e.g: 'en-US'). If you know the language of your content, it is recommended that you
     * specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language
     * detection is not included in basic mode. If the language isn't specified or set to null, automatic language
     * detection will choose the first language detected and process with the selected language for the duration of the
     * file. It does not currently support dynamically switching between languages after the first language is detected.
     * The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection
     * fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is
     * available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     * 
     * @param audioLanguage the audioLanguage value to set.
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
        return this;
    }

    /**
     * Get the mode property: Determines the set of audio analysis operations to be performed. If unspecified, the
     * Standard AudioAnalysisMode would be chosen.
     * 
     * @return the mode value.
     */
    public AudioAnalysisMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Determines the set of audio analysis operations to be performed. If unspecified, the
     * Standard AudioAnalysisMode would be chosen.
     * 
     * @param mode the mode value to set.
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withMode(AudioAnalysisMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the experimentalOptions property: Dictionary containing key value pairs for parameters not exposed in the
     * preset itself.
     * 
     * @return the experimentalOptions value.
     */
    public Map<String, String> experimentalOptions() {
        return this.experimentalOptions;
    }

    /**
     * Set the experimentalOptions property: Dictionary containing key value pairs for parameters not exposed in the
     * preset itself.
     * 
     * @param experimentalOptions the experimentalOptions value to set.
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withExperimentalOptions(Map<String, String> experimentalOptions) {
        this.experimentalOptions = experimentalOptions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        jsonWriter.writeStringField("audioLanguage", this.audioLanguage);
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        jsonWriter.writeMapField("experimentalOptions", this.experimentalOptions,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AudioAnalyzerPreset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AudioAnalyzerPreset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AudioAnalyzerPreset.
     */
    public static AudioAnalyzerPreset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.Media.VideoAnalyzerPreset".equals(discriminatorValue)) {
                    return VideoAnalyzerPreset.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static AudioAnalyzerPreset fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AudioAnalyzerPreset deserializedAudioAnalyzerPreset = new AudioAnalyzerPreset();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedAudioAnalyzerPreset.odataType = reader.getString();
                } else if ("audioLanguage".equals(fieldName)) {
                    deserializedAudioAnalyzerPreset.audioLanguage = reader.getString();
                } else if ("mode".equals(fieldName)) {
                    deserializedAudioAnalyzerPreset.mode = AudioAnalysisMode.fromString(reader.getString());
                } else if ("experimentalOptions".equals(fieldName)) {
                    Map<String, String> experimentalOptions = reader.readMap(reader1 -> reader1.getString());
                    deserializedAudioAnalyzerPreset.experimentalOptions = experimentalOptions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAudioAnalyzerPreset;
        });
    }
}
