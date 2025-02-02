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

import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The ehcache component enables you to perform caching operations using Ehcache
 * as cache implementation.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EhcacheEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Ehcache component.
     */
    public interface EhcacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedEhcacheEndpointConsumerBuilder advanced() {
            return (AdvancedEhcacheEndpointConsumerBuilder) this;
        }
        /**
         * The cache manager.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointConsumerBuilder cacheManager(Object cacheManager) {
            setProperty("cacheManager", cacheManager);
            return this;
        }
        /**
         * The cache manager.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointConsumerBuilder cacheManager(String cacheManager) {
            setProperty("cacheManager", cacheManager);
            return this;
        }
        /**
         * The cache manager configuration.
         * 
         * The option is a: <code>org.ehcache.config.Configuration</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointConsumerBuilder cacheManagerConfiguration(
                Object cacheManagerConfiguration) {
            setProperty("cacheManagerConfiguration", cacheManagerConfiguration);
            return this;
        }
        /**
         * The cache manager configuration.
         * 
         * The option will be converted to a
         * <code>org.ehcache.config.Configuration</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointConsumerBuilder cacheManagerConfiguration(
                String cacheManagerConfiguration) {
            setProperty("cacheManagerConfiguration", cacheManagerConfiguration);
            return this;
        }
        /**
         * URI pointing to the Ehcache XML configuration file's location.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointConsumerBuilder configurationUri(
                String configurationUri) {
            setProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointConsumerBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointConsumerBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Set the delivery mode (synchronous, asynchronous).
         * 
         * The option is a: <code>org.ehcache.event.EventFiring</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder eventFiring(
                EventFiring eventFiring) {
            setProperty("eventFiring", eventFiring);
            return this;
        }
        /**
         * Set the delivery mode (synchronous, asynchronous).
         * 
         * The option will be converted to a
         * <code>org.ehcache.event.EventFiring</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder eventFiring(String eventFiring) {
            setProperty("eventFiring", eventFiring);
            return this;
        }
        /**
         * Set the delivery mode (ordered, unordered).
         * 
         * The option is a: <code>org.ehcache.event.EventOrdering</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder eventOrdering(
                EventOrdering eventOrdering) {
            setProperty("eventOrdering", eventOrdering);
            return this;
        }
        /**
         * Set the delivery mode (ordered, unordered).
         * 
         * The option will be converted to a
         * <code>org.ehcache.event.EventOrdering</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder eventOrdering(
                String eventOrdering) {
            setProperty("eventOrdering", eventOrdering);
            return this;
        }
        /**
         * Set the type of events to listen for.
         * 
         * The option is a:
         * <code>java.util.Set&lt;org.ehcache.event.EventType&gt;</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder eventTypes(
                Set<EventType> eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * Set the type of events to listen for.
         * 
         * The option will be converted to a
         * <code>java.util.Set&lt;org.ehcache.event.EventType&gt;</code> type.
         * 
         * Group: consumer
         */
        default EhcacheEndpointConsumerBuilder eventTypes(String eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Ehcache component.
     */
    public interface AdvancedEhcacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default EhcacheEndpointConsumerBuilder basic() {
            return (EhcacheEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedEhcacheEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedEhcacheEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedEhcacheEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedEhcacheEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedEhcacheEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The default cache configuration to be used to create caches.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointConsumerBuilder configuration(
                Object configuration) {
            setProperty("configuration", configuration);
            return this;
        }
        /**
         * The default cache configuration to be used to create caches.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointConsumerBuilder configuration(
                String configuration) {
            setProperty("configuration", configuration);
            return this;
        }
        /**
         * A map of cache configuration to be used to create caches.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointConsumerBuilder configurations(
                Map<String, Object> configurations) {
            setProperty("configurations", configurations);
            return this;
        }
        /**
         * A map of cache configuration to be used to create caches.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointConsumerBuilder configurations(
                String configurations) {
            setProperty("configurations", configurations);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointConsumerBuilder keyType(String keyType) {
            setProperty("keyType", keyType);
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
        default AdvancedEhcacheEndpointConsumerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedEhcacheEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointConsumerBuilder valueType(
                String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Ehcache component.
     */
    public interface EhcacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedEhcacheEndpointProducerBuilder advanced() {
            return (AdvancedEhcacheEndpointProducerBuilder) this;
        }
        /**
         * The cache manager.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointProducerBuilder cacheManager(Object cacheManager) {
            setProperty("cacheManager", cacheManager);
            return this;
        }
        /**
         * The cache manager.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointProducerBuilder cacheManager(String cacheManager) {
            setProperty("cacheManager", cacheManager);
            return this;
        }
        /**
         * The cache manager configuration.
         * 
         * The option is a: <code>org.ehcache.config.Configuration</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointProducerBuilder cacheManagerConfiguration(
                Object cacheManagerConfiguration) {
            setProperty("cacheManagerConfiguration", cacheManagerConfiguration);
            return this;
        }
        /**
         * The cache manager configuration.
         * 
         * The option will be converted to a
         * <code>org.ehcache.config.Configuration</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointProducerBuilder cacheManagerConfiguration(
                String cacheManagerConfiguration) {
            setProperty("cacheManagerConfiguration", cacheManagerConfiguration);
            return this;
        }
        /**
         * URI pointing to the Ehcache XML configuration file's location.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointProducerBuilder configurationUri(
                String configurationUri) {
            setProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointProducerBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointProducerBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default EhcacheEndpointProducerBuilder action(String action) {
            setProperty("action", action);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default EhcacheEndpointProducerBuilder key(Object key) {
            setProperty("key", key);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option will be converted to a <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default EhcacheEndpointProducerBuilder key(String key) {
            setProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default EhcacheEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default EhcacheEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Ehcache component.
     */
    public interface AdvancedEhcacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default EhcacheEndpointProducerBuilder basic() {
            return (EhcacheEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedEhcacheEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The default cache configuration to be used to create caches.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointProducerBuilder configuration(
                Object configuration) {
            setProperty("configuration", configuration);
            return this;
        }
        /**
         * The default cache configuration to be used to create caches.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointProducerBuilder configuration(
                String configuration) {
            setProperty("configuration", configuration);
            return this;
        }
        /**
         * A map of cache configuration to be used to create caches.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointProducerBuilder configurations(
                Map<String, Object> configurations) {
            setProperty("configurations", configurations);
            return this;
        }
        /**
         * A map of cache configuration to be used to create caches.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointProducerBuilder configurations(
                String configurations) {
            setProperty("configurations", configurations);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointProducerBuilder keyType(String keyType) {
            setProperty("keyType", keyType);
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
        default AdvancedEhcacheEndpointProducerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedEhcacheEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointProducerBuilder valueType(
                String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Ehcache component.
     */
    public interface EhcacheEndpointBuilder
            extends
                EhcacheEndpointConsumerBuilder, EhcacheEndpointProducerBuilder {
        default AdvancedEhcacheEndpointBuilder advanced() {
            return (AdvancedEhcacheEndpointBuilder) this;
        }
        /**
         * The cache manager.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointBuilder cacheManager(Object cacheManager) {
            setProperty("cacheManager", cacheManager);
            return this;
        }
        /**
         * The cache manager.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheManager</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointBuilder cacheManager(String cacheManager) {
            setProperty("cacheManager", cacheManager);
            return this;
        }
        /**
         * The cache manager configuration.
         * 
         * The option is a: <code>org.ehcache.config.Configuration</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointBuilder cacheManagerConfiguration(
                Object cacheManagerConfiguration) {
            setProperty("cacheManagerConfiguration", cacheManagerConfiguration);
            return this;
        }
        /**
         * The cache manager configuration.
         * 
         * The option will be converted to a
         * <code>org.ehcache.config.Configuration</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointBuilder cacheManagerConfiguration(
                String cacheManagerConfiguration) {
            setProperty("cacheManagerConfiguration", cacheManagerConfiguration);
            return this;
        }
        /**
         * URI pointing to the Ehcache XML configuration file's location.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointBuilder configurationUri(String configurationUri) {
            setProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default EhcacheEndpointBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ehcache component.
     */
    public interface AdvancedEhcacheEndpointBuilder
            extends
                AdvancedEhcacheEndpointConsumerBuilder, AdvancedEhcacheEndpointProducerBuilder {
        default EhcacheEndpointBuilder basic() {
            return (EhcacheEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointBuilder basicPropertyBinding(
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
        default AdvancedEhcacheEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The default cache configuration to be used to create caches.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointBuilder configuration(
                Object configuration) {
            setProperty("configuration", configuration);
            return this;
        }
        /**
         * The default cache configuration to be used to create caches.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ehcache.EhcacheConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointBuilder configuration(
                String configuration) {
            setProperty("configuration", configuration);
            return this;
        }
        /**
         * A map of cache configuration to be used to create caches.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointBuilder configurations(
                Map<String, Object> configurations) {
            setProperty("configurations", configurations);
            return this;
        }
        /**
         * A map of cache configuration to be used to create caches.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * org.ehcache.config.CacheConfiguration&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointBuilder configurations(
                String configurations) {
            setProperty("configurations", configurations);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointBuilder keyType(String keyType) {
            setProperty("keyType", keyType);
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
        default AdvancedEhcacheEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedEhcacheEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedEhcacheEndpointBuilder valueType(String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.ehcache.event.EventFiring</code> enum.
     */
    enum EventFiring {
        ASYNCHRONOUS,
        SYNCHRONOUS;
    }

    /**
     * Proxy enum for <code>org.ehcache.event.EventOrdering</code> enum.
     */
    enum EventOrdering {
        UNORDERED,
        ORDERED;
    }

    /**
     * Proxy enum for <code>org.ehcache.event.EventType</code> enum.
     */
    enum EventType {
        EVICTED,
        EXPIRED,
        REMOVED,
        CREATED,
        UPDATED;
    }
    /**
     * Ehcache (camel-ehcache)
     * The ehcache component enables you to perform caching operations using
     * Ehcache as cache implementation.
     * 
     * Category: cache,datagrid,clustering
     * Available as of version: 2.18
     * Maven coordinates: org.apache.camel:camel-ehcache
     * 
     * Syntax: <code>ehcache:cacheName</code>
     * 
     * Path parameter: cacheName (required)
     * the cache name
     */
    default EhcacheEndpointBuilder ehcache(String path) {
        class EhcacheEndpointBuilderImpl extends AbstractEndpointBuilder implements EhcacheEndpointBuilder, AdvancedEhcacheEndpointBuilder {
            public EhcacheEndpointBuilderImpl(String path) {
                super("ehcache", path);
            }
        }
        return new EhcacheEndpointBuilderImpl(path);
    }
}