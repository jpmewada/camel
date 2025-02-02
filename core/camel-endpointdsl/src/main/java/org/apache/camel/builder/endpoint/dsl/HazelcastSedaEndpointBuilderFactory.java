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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The hazelcast-seda component is used to access Hazelcast BlockingQueue.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastSedaEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Hazelcast SEDA component.
     */
    public interface HazelcastSedaEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedHazelcastSedaEndpointConsumerBuilder advanced() {
            return (AdvancedHazelcastSedaEndpointConsumerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointConsumerBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointConsumerBuilder defaultOperation(
                String defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointConsumerBuilder hazelcastInstance(
                Object hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointConsumerBuilder hazelcastInstance(
                String hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointConsumerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            setProperty("hazelcastInstanceName", hazelcastInstanceName);
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
        default HazelcastSedaEndpointConsumerBuilder bridgeErrorHandler(
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
        default HazelcastSedaEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder onErrorDelay(
                int onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder onErrorDelay(
                String onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder pollTimeout(int pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder pollTimeout(
                String pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder transacted(
                boolean transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder transacted(
                String transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder transferExchange(
                boolean transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointConsumerBuilder transferExchange(
                String transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Hazelcast SEDA component.
     */
    public interface AdvancedHazelcastSedaEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default HazelcastSedaEndpointConsumerBuilder basic() {
            return (HazelcastSedaEndpointConsumerBuilder) this;
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder exchangePattern(
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder exchangePattern(
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder synchronous(
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
        default AdvancedHazelcastSedaEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Hazelcast SEDA component.
     */
    public interface HazelcastSedaEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedHazelcastSedaEndpointProducerBuilder advanced() {
            return (AdvancedHazelcastSedaEndpointProducerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointProducerBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointProducerBuilder defaultOperation(
                String defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointProducerBuilder hazelcastInstance(
                Object hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointProducerBuilder hazelcastInstance(
                String hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointProducerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            setProperty("hazelcastInstanceName", hazelcastInstanceName);
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
        default HazelcastSedaEndpointProducerBuilder lazyStartProducer(
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
        default HazelcastSedaEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder onErrorDelay(
                int onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder onErrorDelay(
                String onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder pollTimeout(int pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder pollTimeout(
                String pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder transacted(
                boolean transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder transacted(
                String transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder transferExchange(
                boolean transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointProducerBuilder transferExchange(
                String transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Hazelcast SEDA component.
     */
    public interface AdvancedHazelcastSedaEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default HazelcastSedaEndpointProducerBuilder basic() {
            return (HazelcastSedaEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHazelcastSedaEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedHazelcastSedaEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedHazelcastSedaEndpointProducerBuilder synchronous(
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
        default AdvancedHazelcastSedaEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Hazelcast SEDA component.
     */
    public interface HazelcastSedaEndpointBuilder
            extends
                HazelcastSedaEndpointConsumerBuilder, HazelcastSedaEndpointProducerBuilder {
        default AdvancedHazelcastSedaEndpointBuilder advanced() {
            return (AdvancedHazelcastSedaEndpointBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointBuilder defaultOperation(
                String defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointBuilder hazelcastInstance(
                Object hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default HazelcastSedaEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            setProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder onErrorDelay(int onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder onErrorDelay(String onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder pollTimeout(int pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder pollTimeout(String pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder transacted(boolean transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder transacted(String transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder transferExchange(
                boolean transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastSedaEndpointBuilder transferExchange(
                String transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hazelcast SEDA component.
     */
    public interface AdvancedHazelcastSedaEndpointBuilder
            extends
                AdvancedHazelcastSedaEndpointConsumerBuilder, AdvancedHazelcastSedaEndpointProducerBuilder {
        default HazelcastSedaEndpointBuilder basic() {
            return (HazelcastSedaEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHazelcastSedaEndpointBuilder basicPropertyBinding(
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
        default AdvancedHazelcastSedaEndpointBuilder basicPropertyBinding(
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
        default AdvancedHazelcastSedaEndpointBuilder synchronous(
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
        default AdvancedHazelcastSedaEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
     * enum.
     */
    enum HazelcastOperation {
        put,
        delete,
        get,
        update,
        query,
        getAll,
        clear,
        putIfAbsent,
        allAll,
        removeAll,
        retainAll,
        evict,
        evictAll,
        valueCount,
        containsKey,
        containsValue,
        keySet,
        removevalue,
        increment,
        decrement,
        setvalue,
        destroy,
        compareAndSet,
        getAndAdd,
        add,
        offer,
        peek,
        poll,
        remainingCapacity,
        drainTo,
        removeIf,
        take,
        publish,
        readOnceHeal,
        readOnceTail,
        capacity;
    }
    /**
     * Hazelcast SEDA (camel-hazelcast)
     * The hazelcast-seda component is used to access Hazelcast BlockingQueue.
     * 
     * Category: cache,datagrid
     * Available as of version: 2.7
     * Maven coordinates: org.apache.camel:camel-hazelcast
     * 
     * Syntax: <code>hazelcast-seda:cacheName</code>
     * 
     * Path parameter: cacheName (required)
     * The name of the cache
     */
    default HazelcastSedaEndpointBuilder hazelcastSeda(String path) {
        class HazelcastSedaEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastSedaEndpointBuilder, AdvancedHazelcastSedaEndpointBuilder {
            public HazelcastSedaEndpointBuilderImpl(String path) {
                super("hazelcast-seda", path);
            }
        }
        return new HazelcastSedaEndpointBuilderImpl(path);
    }
}