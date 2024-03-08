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
package com.lark.oapi.service.search;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.search.v2.V2;
import com.lark.oapi.service.search.v2.model.*;
import com.lark.oapi.service.search.v2.resource.App;
import com.lark.oapi.service.search.v2.resource.DataSource;
import com.lark.oapi.service.search.v2.resource.DataSourceItem;
import com.lark.oapi.service.search.v2.resource.Message;
import com.lark.oapi.service.search.v2.resource.Schema;

public class SearchService {
    private final V2 v2;
    private final App app; // app
    private final DataSource dataSource; // 数据源
    private final DataSourceItem dataSourceItem; // 数据项
    private final Message message; // message
    private final Schema schema; // 数据范式

    public SearchService(Config config) {
        this.v2 = new V2(config);
        this.app = new App(config);
        this.dataSource = new DataSource(config);
        this.dataSourceItem = new DataSourceItem(config);
        this.message = new Message(config);
        this.schema = new Schema(config);
    }

    public V2 v2() {
        return v2;
    }

    public App app() {
        return app;
    }

    public DataSource dataSource() {
        return dataSource;
    }

    public DataSourceItem dataSourceItem() {
        return dataSourceItem;
    }

    public Message message() {
        return message;
    }

    public Schema schema() {
        return schema;
    }
}