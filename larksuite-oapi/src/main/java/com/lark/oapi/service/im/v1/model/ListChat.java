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

package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListChat {
    /**
     * 群组 ID，详情参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
     * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 群头像 URL
     * <p> 示例值：https://p3-lark-file.byteimg.com/img/lark-avatar-staging/default-avatar_44ae0ca3-e140-494b-956f-78091e348435~100x100.jpg
     */
    @SerializedName("avatar")
    private String avatar;
    /**
     * 群名称
     * <p> 示例值：测试群名称
     */
    @SerializedName("name")
    private String name;
    /**
     * 群描述
     * <p> 示例值：测试群描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 群主 ID
     * <p> 示例值：4d7a3c6g
     */
    @SerializedName("owner_id")
    private String ownerId;
    /**
     * 群主 ID 类型
     * <p> 示例值：user_id
     */
    @SerializedName("owner_id_type")
    private String ownerIdType;
    /**
     * 是否是外部群
     * <p> 示例值：false
     */
    @SerializedName("external")
    private Boolean external;
    /**
     * 租户Key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用中的唯一标识
     * <p> 示例值：736588c9260f175e
     */
    @SerializedName("tenant_key")
    private String tenantKey;

    // builder 开始
    public ListChat() {
    }

    public ListChat(Builder builder) {
        /**
         * 群组 ID，详情参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
         * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
         */
        this.chatId = builder.chatId;
        /**
         * 群头像 URL
         * <p> 示例值：https://p3-lark-file.byteimg.com/img/lark-avatar-staging/default-avatar_44ae0ca3-e140-494b-956f-78091e348435~100x100.jpg
         */
        this.avatar = builder.avatar;
        /**
         * 群名称
         * <p> 示例值：测试群名称
         */
        this.name = builder.name;
        /**
         * 群描述
         * <p> 示例值：测试群描述
         */
        this.description = builder.description;
        /**
         * 群主 ID
         * <p> 示例值：4d7a3c6g
         */
        this.ownerId = builder.ownerId;
        /**
         * 群主 ID 类型
         * <p> 示例值：user_id
         */
        this.ownerIdType = builder.ownerIdType;
        /**
         * 是否是外部群
         * <p> 示例值：false
         */
        this.external = builder.external;
        /**
         * 租户Key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用中的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        this.tenantKey = builder.tenantKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerIdType() {
        return this.ownerIdType;
    }

    public void setOwnerIdType(String ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public Boolean getExternal() {
        return this.external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public static class Builder {
        /**
         * 群组 ID，详情参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
         * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
         */
        private String chatId;
        /**
         * 群头像 URL
         * <p> 示例值：https://p3-lark-file.byteimg.com/img/lark-avatar-staging/default-avatar_44ae0ca3-e140-494b-956f-78091e348435~100x100.jpg
         */
        private String avatar;
        /**
         * 群名称
         * <p> 示例值：测试群名称
         */
        private String name;
        /**
         * 群描述
         * <p> 示例值：测试群描述
         */
        private String description;
        /**
         * 群主 ID
         * <p> 示例值：4d7a3c6g
         */
        private String ownerId;
        /**
         * 群主 ID 类型
         * <p> 示例值：user_id
         */
        private String ownerIdType;
        /**
         * 是否是外部群
         * <p> 示例值：false
         */
        private Boolean external;
        /**
         * 租户Key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用中的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        private String tenantKey;

        /**
         * 群组 ID，详情参见[群ID 说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-id-description)
         * <p> 示例值：oc_a0553eda9014c201e6969b478895c230
         *
         * @param chatId
         * @return
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }


        /**
         * 群头像 URL
         * <p> 示例值：https://p3-lark-file.byteimg.com/img/lark-avatar-staging/default-avatar_44ae0ca3-e140-494b-956f-78091e348435~100x100.jpg
         *
         * @param avatar
         * @return
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }


        /**
         * 群名称
         * <p> 示例值：测试群名称
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 群描述
         * <p> 示例值：测试群描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 群主 ID
         * <p> 示例值：4d7a3c6g
         *
         * @param ownerId
         * @return
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        /**
         * 群主 ID 类型
         * <p> 示例值：user_id
         *
         * @param ownerIdType
         * @return
         */
        public Builder ownerIdType(String ownerIdType) {
            this.ownerIdType = ownerIdType;
            return this;
        }


        /**
         * 是否是外部群
         * <p> 示例值：false
         *
         * @param external
         * @return
         */
        public Builder external(Boolean external) {
            this.external = external;
            return this;
        }


        /**
         * 租户Key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用中的唯一标识
         * <p> 示例值：736588c9260f175e
         *
         * @param tenantKey
         * @return
         */
        public Builder tenantKey(String tenantKey) {
            this.tenantKey = tenantKey;
            return this;
        }


        public ListChat build() {
            return new ListChat(this);
        }
    }
}
