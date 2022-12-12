/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dubbo.mock.handler;

import java.util.Objects;

/**
 * handle the {@link Byte} type result.
 */
public class ByteTypeHandler implements TypeHandler<Byte> {

    @Override
    public boolean isMatch(ResultContext resultContext) {
        return Objects.equals(Byte.class, resultContext.getTargetType())
            || Objects.equals(byte.class, resultContext.getTargetType());
    }

    @Override
    public Byte handleResult(ResultContext resultContext) {
        return Byte.valueOf(resultContext.getData());
    }
}
