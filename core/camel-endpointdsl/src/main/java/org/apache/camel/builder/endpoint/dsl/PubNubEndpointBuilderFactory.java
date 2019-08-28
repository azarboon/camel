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
 * To send and receive messages to PubNub data stream network for connected
 * devices.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PubNubEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the PubNub component.
     */
    public interface PubNubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPubNubEndpointConsumerBuilder advanced() {
            return (AdvancedPubNubEndpointConsumerBuilder) this;
        }
        /**
         * UUID to be used as a device identifier, a default UUID is generated
         * if not passed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PubNubEndpointConsumerBuilder uuid(String uuid) {
            doSetProperty("uuid", uuid);
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
        default PubNubEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default PubNubEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Also subscribe to related presence information.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default PubNubEndpointConsumerBuilder withPresence(boolean withPresence) {
            doSetProperty("withPresence", withPresence);
            return this;
        }
        /**
         * Also subscribe to related presence information.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default PubNubEndpointConsumerBuilder withPresence(String withPresence) {
            doSetProperty("withPresence", withPresence);
            return this;
        }
        /**
         * If Access Manager is utilized, client will use this authKey in all
         * restricted requests.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointConsumerBuilder authKey(String authKey) {
            doSetProperty("authKey", authKey);
            return this;
        }
        /**
         * If cipher is passed, all communications to/from PubNub will be
         * encrypted.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointConsumerBuilder cipherKey(String cipherKey) {
            doSetProperty("cipherKey", cipherKey);
            return this;
        }
        /**
         * The publish key obtained from your PubNub account. Required when
         * publishing messages.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointConsumerBuilder publishKey(String publishKey) {
            doSetProperty("publishKey", publishKey);
            return this;
        }
        /**
         * The secret key used for message signing.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointConsumerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Use SSL for secure transmission.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointConsumerBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * Use SSL for secure transmission.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointConsumerBuilder secure(String secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * The subscribe key obtained from your PubNub account. Required when
         * subscribing to channels or listening for presence events.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointConsumerBuilder subscribeKey(String subscribeKey) {
            doSetProperty("subscribeKey", subscribeKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the PubNub component.
     */
    public interface AdvancedPubNubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default PubNubEndpointConsumerBuilder basic() {
            return (PubNubEndpointConsumerBuilder) this;
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
        default AdvancedPubNubEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
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
        default AdvancedPubNubEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedPubNubEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
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
        default AdvancedPubNubEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
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
        default AdvancedPubNubEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedPubNubEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Reference to a Pubnub client in the registry.
         * 
         * The option is a: <code>com.pubnub.api.PubNub</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointConsumerBuilder pubnub(Object pubnub) {
            doSetProperty("pubnub", pubnub);
            return this;
        }
        /**
         * Reference to a Pubnub client in the registry.
         * 
         * The option will be converted to a <code>com.pubnub.api.PubNub</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointConsumerBuilder pubnub(String pubnub) {
            doSetProperty("pubnub", pubnub);
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
        default AdvancedPubNubEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
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
        default AdvancedPubNubEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the PubNub component.
     */
    public interface PubNubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPubNubEndpointProducerBuilder advanced() {
            return (AdvancedPubNubEndpointProducerBuilder) this;
        }
        /**
         * UUID to be used as a device identifier, a default UUID is generated
         * if not passed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PubNubEndpointProducerBuilder uuid(String uuid) {
            doSetProperty("uuid", uuid);
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
        default PubNubEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default PubNubEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. PUBLISH: Default. Send a message to all
         * subscribers of a channel. FIRE: allows the client to send a message
         * to BLOCKS Event Handlers. These messages will go directly to any
         * Event Handlers registered on the channel. HERENOW: Obtain information
         * about the current state of a channel including a list of unique
         * user-ids currently subscribed to the channel and the total occupancy
         * count. WHERENOW: Obtain information about the current list of
         * channels to which a uuid is subscribed to. GETSTATE: Used to get
         * key/value pairs specific to a subscriber uuid. State information is
         * supplied as a JSON object of key/value pairs SETSTATE: Used to set
         * key/value pairs specific to a subscriber uuid GETHISTORY: Fetches
         * historical messages of a channel.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PubNubEndpointProducerBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * If Access Manager is utilized, client will use this authKey in all
         * restricted requests.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointProducerBuilder authKey(String authKey) {
            doSetProperty("authKey", authKey);
            return this;
        }
        /**
         * If cipher is passed, all communications to/from PubNub will be
         * encrypted.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointProducerBuilder cipherKey(String cipherKey) {
            doSetProperty("cipherKey", cipherKey);
            return this;
        }
        /**
         * The publish key obtained from your PubNub account. Required when
         * publishing messages.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointProducerBuilder publishKey(String publishKey) {
            doSetProperty("publishKey", publishKey);
            return this;
        }
        /**
         * The secret key used for message signing.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointProducerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Use SSL for secure transmission.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointProducerBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * Use SSL for secure transmission.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointProducerBuilder secure(String secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * The subscribe key obtained from your PubNub account. Required when
         * subscribing to channels or listening for presence events.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointProducerBuilder subscribeKey(String subscribeKey) {
            doSetProperty("subscribeKey", subscribeKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the PubNub component.
     */
    public interface AdvancedPubNubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default PubNubEndpointProducerBuilder basic() {
            return (PubNubEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedPubNubEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Reference to a Pubnub client in the registry.
         * 
         * The option is a: <code>com.pubnub.api.PubNub</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointProducerBuilder pubnub(Object pubnub) {
            doSetProperty("pubnub", pubnub);
            return this;
        }
        /**
         * Reference to a Pubnub client in the registry.
         * 
         * The option will be converted to a <code>com.pubnub.api.PubNub</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointProducerBuilder pubnub(String pubnub) {
            doSetProperty("pubnub", pubnub);
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
        default AdvancedPubNubEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
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
        default AdvancedPubNubEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the PubNub component.
     */
    public interface PubNubEndpointBuilder
            extends
                PubNubEndpointConsumerBuilder, PubNubEndpointProducerBuilder {
        default AdvancedPubNubEndpointBuilder advanced() {
            return (AdvancedPubNubEndpointBuilder) this;
        }
        /**
         * UUID to be used as a device identifier, a default UUID is generated
         * if not passed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PubNubEndpointBuilder uuid(String uuid) {
            doSetProperty("uuid", uuid);
            return this;
        }
        /**
         * If Access Manager is utilized, client will use this authKey in all
         * restricted requests.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointBuilder authKey(String authKey) {
            doSetProperty("authKey", authKey);
            return this;
        }
        /**
         * If cipher is passed, all communications to/from PubNub will be
         * encrypted.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointBuilder cipherKey(String cipherKey) {
            doSetProperty("cipherKey", cipherKey);
            return this;
        }
        /**
         * The publish key obtained from your PubNub account. Required when
         * publishing messages.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointBuilder publishKey(String publishKey) {
            doSetProperty("publishKey", publishKey);
            return this;
        }
        /**
         * The secret key used for message signing.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Use SSL for secure transmission.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * Use SSL for secure transmission.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointBuilder secure(String secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * The subscribe key obtained from your PubNub account. Required when
         * subscribing to channels or listening for presence events.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PubNubEndpointBuilder subscribeKey(String subscribeKey) {
            doSetProperty("subscribeKey", subscribeKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the PubNub component.
     */
    public interface AdvancedPubNubEndpointBuilder
            extends
                AdvancedPubNubEndpointConsumerBuilder, AdvancedPubNubEndpointProducerBuilder {
        default PubNubEndpointBuilder basic() {
            return (PubNubEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedPubNubEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Reference to a Pubnub client in the registry.
         * 
         * The option is a: <code>com.pubnub.api.PubNub</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointBuilder pubnub(Object pubnub) {
            doSetProperty("pubnub", pubnub);
            return this;
        }
        /**
         * Reference to a Pubnub client in the registry.
         * 
         * The option will be converted to a <code>com.pubnub.api.PubNub</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedPubNubEndpointBuilder pubnub(String pubnub) {
            doSetProperty("pubnub", pubnub);
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
        default AdvancedPubNubEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
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
        default AdvancedPubNubEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * PubNub (camel-pubnub)
     * To send and receive messages to PubNub data stream network for connected
     * devices.
     * 
     * Category: cloud,iot,messaging
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-pubnub
     * 
     * Syntax: <code>pubnub:channel</code>
     * 
     * Path parameter: channel (required)
     * The channel used for subscribing/publishing events
     */
    default PubNubEndpointBuilder pubnub(String path) {
        class PubNubEndpointBuilderImpl extends AbstractEndpointBuilder implements PubNubEndpointBuilder, AdvancedPubNubEndpointBuilder {
            public PubNubEndpointBuilderImpl(String path) {
                super("pubnub", path);
            }
        }
        return new PubNubEndpointBuilderImpl(path);
    }
}