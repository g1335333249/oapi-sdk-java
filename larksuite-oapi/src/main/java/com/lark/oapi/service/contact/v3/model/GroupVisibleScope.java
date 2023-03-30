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

public class GroupVisibleScope {
    /**
     * 可见范围的 id 类型，包用户、部门两类
     * <p> 示例值：invisible
     */
    @SerializedName("visible_scope_type")
    private String visibleScopeType;
    /**
     * 指定可见用户组的用户 ID列表
     * <p> 示例值：cfe29725
     */
    @SerializedName("visible_users")
    private String[] visibleUsers;
    /**
     * 指定可见用户组的部门 ID 列表
     * <p> 示例值：
     */
    @SerializedName("visible_departments")
    private String[] visibleDepartments;
    /**
     * 用户组可用范围
     * <p> 示例值：
     */
    @SerializedName("scene_types")
    private Integer[] sceneTypes;

    // builder 开始
    public GroupVisibleScope() {
    }

    public GroupVisibleScope(Builder builder) {
        /**
         * 可见范围的 id 类型，包用户、部门两类
         * <p> 示例值：invisible
         */
        this.visibleScopeType = builder.visibleScopeType;
        /**
         * 指定可见用户组的用户 ID列表
         * <p> 示例值：cfe29725
         */
        this.visibleUsers = builder.visibleUsers;
        /**
         * 指定可见用户组的部门 ID 列表
         * <p> 示例值：
         */
        this.visibleDepartments = builder.visibleDepartments;
        /**
         * 用户组可用范围
         * <p> 示例值：
         */
        this.sceneTypes = builder.sceneTypes;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getVisibleScopeType() {
        return this.visibleScopeType;
    }

    public void setVisibleScopeType(String visibleScopeType) {
        this.visibleScopeType = visibleScopeType;
    }

    public String[] getVisibleUsers() {
        return this.visibleUsers;
    }

    public void setVisibleUsers(String[] visibleUsers) {
        this.visibleUsers = visibleUsers;
    }

    public String[] getVisibleDepartments() {
        return this.visibleDepartments;
    }

    public void setVisibleDepartments(String[] visibleDepartments) {
        this.visibleDepartments = visibleDepartments;
    }

    public Integer[] getSceneTypes() {
        return this.sceneTypes;
    }

    public void setSceneTypes(Integer[] sceneTypes) {
        this.sceneTypes = sceneTypes;
    }

    public static class Builder {
        /**
         * 可见范围的 id 类型，包用户、部门两类
         * <p> 示例值：invisible
         */
        private String visibleScopeType;
        /**
         * 指定可见用户组的用户 ID列表
         * <p> 示例值：cfe29725
         */
        private String[] visibleUsers;
        /**
         * 指定可见用户组的部门 ID 列表
         * <p> 示例值：
         */
        private String[] visibleDepartments;
        /**
         * 用户组可用范围
         * <p> 示例值：
         */
        private Integer[] sceneTypes;

        /**
         * 可见范围的 id 类型，包用户、部门两类
         * <p> 示例值：invisible
         *
         * @param visibleScopeType
         * @return
         */
        public Builder visibleScopeType(String visibleScopeType) {
            this.visibleScopeType = visibleScopeType;
            return this;
        }

        /**
         * 可见范围的 id 类型，包用户、部门两类
         * <p> 示例值：invisible
         *
         * @param visibleScopeType {@link com.lark.oapi.service.contact.v3.enums.GroupVisibleScopeVisibleScopeTypeEnum}
         * @return
         */
        public Builder visibleScopeType(com.lark.oapi.service.contact.v3.enums.GroupVisibleScopeVisibleScopeTypeEnum visibleScopeType) {
            this.visibleScopeType = visibleScopeType.getValue();
            return this;
        }


        /**
         * 指定可见用户组的用户 ID列表
         * <p> 示例值：cfe29725
         *
         * @param visibleUsers
         * @return
         */
        public Builder visibleUsers(String[] visibleUsers) {
            this.visibleUsers = visibleUsers;
            return this;
        }


        /**
         * 指定可见用户组的部门 ID 列表
         * <p> 示例值：
         *
         * @param visibleDepartments
         * @return
         */
        public Builder visibleDepartments(String[] visibleDepartments) {
            this.visibleDepartments = visibleDepartments;
            return this;
        }


        /**
         * 用户组可用范围
         * <p> 示例值：
         *
         * @param sceneTypes
         * @return
         */
        public Builder sceneTypes(Integer[] sceneTypes) {
            this.sceneTypes = sceneTypes;
            return this;
        }


        public GroupVisibleScope build() {
            return new GroupVisibleScope(this);
        }
    }
}
