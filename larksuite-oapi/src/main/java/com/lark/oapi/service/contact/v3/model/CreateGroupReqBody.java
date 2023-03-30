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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class CreateGroupReqBody {
    /**
     * 自定义用户组ID，可在创建时自定义，不自定义则由系统自动生成，已创建用户组不允许修改 group_id 。;;自定义group_id数据校验规则：;;最大长度：64 字符;;校验规则：数字、大小写字母的组合，不能包含空格
     * <p> 示例值：g122817
     */
    @SerializedName("group_id")
    private String groupId;
    /**
     * 用户组的名字，企业内唯一，最大长度：100 字符
     * <p> 示例值：IT 外包组
     */
    @SerializedName("name")
    private String name;
    /**
     * 用户组描述
     * <p> 示例值：IT服务人员的集合
     */
    @SerializedName("description")
    private String description;
    /**
     * 用户组的类型。默认为1表示普通用户组
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 动态用户组的规则
     * <p> 示例值：
     */
    @SerializedName("dynamic_group_rule")
    private DynamicGroupRule dynamicGroupRule;
    /**
     * 用户组指定可见范围
     * <p> 示例值：
     */
    @SerializedName("visible_scope")
    private GroupVisibleScope visibleScope;

    // builder 开始
    public CreateGroupReqBody() {
    }

    public CreateGroupReqBody(Builder builder) {
        /**
         * 自定义用户组ID，可在创建时自定义，不自定义则由系统自动生成，已创建用户组不允许修改 group_id 。;;自定义group_id数据校验规则：;;最大长度：64 字符;;校验规则：数字、大小写字母的组合，不能包含空格
         * <p> 示例值：g122817
         */
        this.groupId = builder.groupId;
        /**
         * 用户组的名字，企业内唯一，最大长度：100 字符
         * <p> 示例值：IT 外包组
         */
        this.name = builder.name;
        /**
         * 用户组描述
         * <p> 示例值：IT服务人员的集合
         */
        this.description = builder.description;
        /**
         * 用户组的类型。默认为1表示普通用户组
         * <p> 示例值：1
         */
        this.type = builder.type;
        /**
         * 动态用户组的规则
         * <p> 示例值：
         */
        this.dynamicGroupRule = builder.dynamicGroupRule;
        /**
         * 用户组指定可见范围
         * <p> 示例值：
         */
        this.visibleScope = builder.visibleScope;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public DynamicGroupRule getDynamicGroupRule() {
        return this.dynamicGroupRule;
    }

    public void setDynamicGroupRule(DynamicGroupRule dynamicGroupRule) {
        this.dynamicGroupRule = dynamicGroupRule;
    }

    public GroupVisibleScope getVisibleScope() {
        return this.visibleScope;
    }

    public void setVisibleScope(GroupVisibleScope visibleScope) {
        this.visibleScope = visibleScope;
    }

    public static class Builder {
        /**
         * 自定义用户组ID，可在创建时自定义，不自定义则由系统自动生成，已创建用户组不允许修改 group_id 。;;自定义group_id数据校验规则：;;最大长度：64 字符;;校验规则：数字、大小写字母的组合，不能包含空格
         * <p> 示例值：g122817
         */
        private String groupId;
        /**
         * 用户组的名字，企业内唯一，最大长度：100 字符
         * <p> 示例值：IT 外包组
         */
        private String name;
        /**
         * 用户组描述
         * <p> 示例值：IT服务人员的集合
         */
        private String description;
        /**
         * 用户组的类型。默认为1表示普通用户组
         * <p> 示例值：1
         */
        private Integer type;
        /**
         * 动态用户组的规则
         * <p> 示例值：
         */
        private DynamicGroupRule dynamicGroupRule;
        /**
         * 用户组指定可见范围
         * <p> 示例值：
         */
        private GroupVisibleScope visibleScope;

        /**
         * 自定义用户组ID，可在创建时自定义，不自定义则由系统自动生成，已创建用户组不允许修改 group_id 。;;自定义group_id数据校验规则：;;最大长度：64 字符;;校验规则：数字、大小写字母的组合，不能包含空格
         * <p> 示例值：g122817
         *
         * @param groupId
         * @return
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }


        /**
         * 用户组的名字，企业内唯一，最大长度：100 字符
         * <p> 示例值：IT 外包组
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 用户组描述
         * <p> 示例值：IT服务人员的集合
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 用户组的类型。默认为1表示普通用户组
         * <p> 示例值：1
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 用户组的类型。默认为1表示普通用户组
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.contact.v3.enums.CreateGroupCreateGroupTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.contact.v3.enums.CreateGroupCreateGroupTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 动态用户组的规则
         * <p> 示例值：
         *
         * @param dynamicGroupRule
         * @return
         */
        public Builder dynamicGroupRule(DynamicGroupRule dynamicGroupRule) {
            this.dynamicGroupRule = dynamicGroupRule;
            return this;
        }


        /**
         * 用户组指定可见范围
         * <p> 示例值：
         *
         * @param visibleScope
         * @return
         */
        public Builder visibleScope(GroupVisibleScope visibleScope) {
            this.visibleScope = visibleScope;
            return this;
        }


        public CreateGroupReqBody build() {
            return new CreateGroupReqBody(this);
        }
    }
}
