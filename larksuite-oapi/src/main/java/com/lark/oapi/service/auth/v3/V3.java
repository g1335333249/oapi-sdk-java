// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.auth.v3;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.auth.v3.resource.*;

public class V3 {
    private final AppAccessToken appAccessToken; // app_access_token
    private final AppTicket appTicket; // app_ticket
    private final TenantAccessToken tenantAccessToken; // tenant_access_token

    public V3(Config config) {
        this.appAccessToken = new AppAccessToken(config);
        this.appTicket = new AppTicket(config);
        this.tenantAccessToken = new TenantAccessToken(config);
    }

    public AppAccessToken appAccessToken() {
        return appAccessToken;
    }

    public AppTicket appTicket() {
        return appTicket;
    }

    public TenantAccessToken tenantAccessToken() {
        return tenantAccessToken;
    }
}