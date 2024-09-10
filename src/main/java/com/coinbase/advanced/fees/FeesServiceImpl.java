/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.fees;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.fees.*;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;


public class FeesServiceImpl extends CoinbaseServiceImpl implements FeesService {
    public FeesServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public GetTransactionsSummaryResponse getTransactionsSummary(GetTransactionsSummaryRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/transaction_summary",
                request,
                List.of(200),
                new TypeReference<GetTransactionsSummaryResponse>() {});
    }
}