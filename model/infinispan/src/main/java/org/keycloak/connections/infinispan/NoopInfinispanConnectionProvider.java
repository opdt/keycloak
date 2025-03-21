/*
 * Copyright 2025 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.connections.infinispan;

import org.infinispan.Cache;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.util.concurrent.BlockingManager;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.ScheduledExecutorService;

// TODO: Comments etc
public class NoopInfinispanConnectionProvider implements InfinispanConnectionProvider {
    @Override
    public <K, V> Cache<K, V> getCache(String name, boolean createIfAbsent) {
        return null;
    }

    @Override
    public <K, V> RemoteCache<K, V> getRemoteCache(String name) {
        return null;
    }

    @Override
    public TopologyInfo getTopologyInfo() {
        return null;
    }

    @Override
    public CompletionStage<Void> migrateToProtoStream() {
        return null;
    }

    @Override
    public ScheduledExecutorService getScheduledExecutor() {
        return null;
    }

    @Override
    public BlockingManager getBlockingManager() {
        return null;
    }

    @Override
    public void close() {

    }
}
