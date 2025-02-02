/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * This component integrates with Apache Tika to extract content and metadata
 * from thousands of file types.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TikaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Tika component.
     */
    public interface TikaEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedTikaEndpointBuilder advanced() {
            return (AdvancedTikaEndpointBuilder) this;
        }
        /**
         * To use a custom Tika config.
         * 
         * The option is a: <code>org.apache.tika.config.TikaConfig</code> type.
         * 
         * Group: producer
         */
        default TikaEndpointBuilder tikaConfig(Object tikaConfig) {
            setProperty("tikaConfig", tikaConfig);
            return this;
        }
        /**
         * To use a custom Tika config.
         * 
         * The option will be converted to a
         * <code>org.apache.tika.config.TikaConfig</code> type.
         * 
         * Group: producer
         */
        default TikaEndpointBuilder tikaConfig(String tikaConfig) {
            setProperty("tikaConfig", tikaConfig);
            return this;
        }
        /**
         * Tika Config Uri: The URI of tika-config.xml file to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TikaEndpointBuilder tikaConfigUri(String tikaConfigUri) {
            setProperty("tikaConfigUri", tikaConfigUri);
            return this;
        }
        /**
         * Tika Parse Output Encoding - Used to specify the character encoding
         * of the parsed output. Defaults to Charset.defaultCharset().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TikaEndpointBuilder tikaParseOutputEncoding(
                String tikaParseOutputEncoding) {
            setProperty("tikaParseOutputEncoding", tikaParseOutputEncoding);
            return this;
        }
        /**
         * Tika Output Format. Supported output formats. xml: Returns Parsed
         * Content as XML. html: Returns Parsed Content as HTML. text: Returns
         * Parsed Content as Text. textMain: Uses the boilerpipe library to
         * automatically extract the main content from a web page.
         * 
         * The option is a:
         * <code>org.apache.camel.component.tika.TikaParseOutputFormat</code>
         * type.
         * 
         * Group: producer
         */
        default TikaEndpointBuilder tikaParseOutputFormat(
                TikaParseOutputFormat tikaParseOutputFormat) {
            setProperty("tikaParseOutputFormat", tikaParseOutputFormat);
            return this;
        }
        /**
         * Tika Output Format. Supported output formats. xml: Returns Parsed
         * Content as XML. html: Returns Parsed Content as HTML. text: Returns
         * Parsed Content as Text. textMain: Uses the boilerpipe library to
         * automatically extract the main content from a web page.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.tika.TikaParseOutputFormat</code>
         * type.
         * 
         * Group: producer
         */
        default TikaEndpointBuilder tikaParseOutputFormat(
                String tikaParseOutputFormat) {
            setProperty("tikaParseOutputFormat", tikaParseOutputFormat);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Tika component.
     */
    public interface AdvancedTikaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default TikaEndpointBuilder basic() {
            return (TikaEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTikaEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTikaEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTikaEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTikaEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.tika.TikaParseOutputFormat</code> enum.
     */
    enum TikaParseOutputFormat {
        xml,
        html,
        text,
        textMain;
    }
    /**
     * Tika (camel-tika)
     * This component integrates with Apache Tika to extract content and
     * metadata from thousands of file types.
     * 
     * Category: document,transformation
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-tika
     * 
     * Syntax: <code>tika:operation</code>
     * 
     * Path parameter: operation (required)
     * Tika Operation - parse or detect
     * The value can be one of: parse, detect
     */
    default TikaEndpointBuilder tika(String path) {
        class TikaEndpointBuilderImpl extends AbstractEndpointBuilder implements TikaEndpointBuilder, AdvancedTikaEndpointBuilder {
            public TikaEndpointBuilderImpl(String path) {
                super("tika", path);
            }
        }
        return new TikaEndpointBuilderImpl(path);
    }
}