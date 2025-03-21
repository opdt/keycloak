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

package org.keycloak.cluster.infinispan;

import org.keycloak.cluster.ClusterEvent;
import org.keycloak.cluster.ClusterListener;
import org.keycloak.cluster.ClusterProvider;
import org.keycloak.cluster.ExecutionResult;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// TODO: Comments etc
public class NoopClusterProvider implements ClusterProvider {
    @Override
    public int getClusterStartupTime() {
        return 0;
    }

    @Override
    public <T> ExecutionResult<T> executeIfNotExecuted(String taskKey, int taskTimeoutInSeconds, Callable<T> task) {
        return null;
    }

    @Override
    public Future<Boolean> executeIfNotExecutedAsync(String taskKey, int taskTimeoutInSeconds, Callable task) {
        return null;
    }

    @Override
    public void registerListener(String taskKey, ClusterListener task) {

    }

    @Override
    public void notify(String taskKey, ClusterEvent event, boolean ignoreSender, DCNotify dcNotify) {

    }

    @Override
    public void close() {

    }
}
