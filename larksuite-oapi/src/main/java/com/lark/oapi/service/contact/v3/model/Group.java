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

public class Group {
    /**
     * 用户组ID
     * <p> 示例值：g193821
     */
    @SerializedName("id")
    private String id;
    /**
     * 用户组名字
     * <p> 示例值：IT 外包组
     */
    @SerializedName("name")
    private String name;
    /**
     * 用户组描述
     * <p> 示例值：IT 外包组，需要对该组人群进行细颗粒度权限管控。
     */
    @SerializedName("description")
    private String description;
    /**
     * 用户组成员中用户的数量
     * <p> 示例值：2
     */
    @SerializedName("member_user_count")
    private Integer memberUserCount;
    /**
     * 普通用户组成员中部门的数量，动态用户组成员中没有部门。
     * <p> 示例值：0
     */
    @SerializedName("member_department_count")
    private Integer memberDepartmentCount;
    /**
     * 用户组的类型
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
    public Group() {
    }

    public Group(Builder builder) {
        /**
         * 用户组ID
         * <p> 示例值：g193821
         */
        this.id = builder.id;
        /**
         * 用户组名字
         * <p> 示例值：IT 外包组
         */
        this.name = builder.name;
        /**
         * 用户组描述
         * <p> 示例值：IT 外包组，需要对该组人群进行细颗粒度权限管控。
         */
        this.description = builder.description;
        /**
         * 用户组成员中用户的数量
         * <p> 示例值：2
         */
        this.memberUserCount = builder.memberUserCount;
        /**
         * 普通用户组成员中部门的数量，动态用户组成员中没有部门。
         * <p> 示例值：0
         */
        this.memberDepartmentCount = builder.memberDepartmentCount;
        /**
         * 用户组的类型
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getMemberUserCount() {
        return this.memberUserCount;
    }

    public void setMemberUserCount(Integer memberUserCount) {
        this.memberUserCount = memberUserCount;
    }

    public Integer getMemberDepartmentCount() {
        return this.memberDepartmentCount;
    }

    public void setMemberDepartmentCount(Integer memberDepartmentCount) {
        this.memberDepartmentCount = memberDepartmentCount;
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
         * 用户组ID
         * <p> 示例值：g193821
         */
        private String id;
        /**
         * 用户组名字
         * <p> 示例值：IT 外包组
         */
        private String name;
        /**
         * 用户组描述
         * <p> 示例值：IT 外包组，需要对该组人群进行细颗粒度权限管控。
         */
        private String description;
        /**
         * 用户组成员中用户的数量
         * <p> 示例值：2
         */
        private Integer memberUserCount;
        /**
         * 普通用户组成员中部门的数量，动态用户组成员中没有部门。
         * <p> 示例值：0
         */
        private Integer memberDepartmentCount;
        /**
         * 用户组的类型
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
         * 用户组ID
         * <p> 示例值：g193821
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 用户组名字
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
         * <p> 示例值：IT 外包组，需要对该组人群进行细颗粒度权限管控。
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 用户组成员中用户的数量
         * <p> 示例值：2
         *
         * @param memberUserCount
         * @return
         */
        public Builder memberUserCount(Integer memberUserCount) {
            this.memberUserCount = memberUserCount;
            return this;
        }


        /**
         * 普通用户组成员中部门的数量，动态用户组成员中没有部门。
         * <p> 示例值：0
         *
         * @param memberDepartmentCount
         * @return
         */
        public Builder memberDepartmentCount(Integer memberDepartmentCount) {
            this.memberDepartmentCount = memberDepartmentCount;
            return this;
        }


        /**
         * 用户组的类型
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
         * 用户组的类型
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.contact.v3.enums.GroupGroupTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.contact.v3.enums.GroupGroupTypeEnum type) {
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


        public Group build() {
            return new Group(this);
        }
    }
}
