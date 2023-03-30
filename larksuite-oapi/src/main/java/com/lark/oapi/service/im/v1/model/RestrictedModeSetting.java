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

import com.google.gson.annotations.SerializedName;

public class RestrictedModeSetting {
    /**
     * 防泄密模式是否开启
     * <p> 示例值：true
     */
    @SerializedName("status")
    private Boolean status;
    /**
     * 允许截屏录屏
     * <p> 示例值：all_members
     */
    @SerializedName("screenshot_has_permission_setting")
    private String screenshotHasPermissionSetting;
    /**
     * 允许下载消息中图片、视频和文件
     * <p> 示例值：all_members
     */
    @SerializedName("download_has_permission_setting")
    private String downloadHasPermissionSetting;
    /**
     * 允许复制和转发消息
     * <p> 示例值：all_members
     */
    @SerializedName("message_has_permission_setting")
    private String messageHasPermissionSetting;

    // builder 开始
    public RestrictedModeSetting() {
    }

    public RestrictedModeSetting(Builder builder) {
        /**
         * 防泄密模式是否开启
         * <p> 示例值：true
         */
        this.status = builder.status;
        /**
         * 允许截屏录屏
         * <p> 示例值：all_members
         */
        this.screenshotHasPermissionSetting = builder.screenshotHasPermissionSetting;
        /**
         * 允许下载消息中图片、视频和文件
         * <p> 示例值：all_members
         */
        this.downloadHasPermissionSetting = builder.downloadHasPermissionSetting;
        /**
         * 允许复制和转发消息
         * <p> 示例值：all_members
         */
        this.messageHasPermissionSetting = builder.messageHasPermissionSetting;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getScreenshotHasPermissionSetting() {
        return this.screenshotHasPermissionSetting;
    }

    public void setScreenshotHasPermissionSetting(String screenshotHasPermissionSetting) {
        this.screenshotHasPermissionSetting = screenshotHasPermissionSetting;
    }

    public String getDownloadHasPermissionSetting() {
        return this.downloadHasPermissionSetting;
    }

    public void setDownloadHasPermissionSetting(String downloadHasPermissionSetting) {
        this.downloadHasPermissionSetting = downloadHasPermissionSetting;
    }

    public String getMessageHasPermissionSetting() {
        return this.messageHasPermissionSetting;
    }

    public void setMessageHasPermissionSetting(String messageHasPermissionSetting) {
        this.messageHasPermissionSetting = messageHasPermissionSetting;
    }

    public static class Builder {
        /**
         * 防泄密模式是否开启
         * <p> 示例值：true
         */
        private Boolean status;
        /**
         * 允许截屏录屏
         * <p> 示例值：all_members
         */
        private String screenshotHasPermissionSetting;
        /**
         * 允许下载消息中图片、视频和文件
         * <p> 示例值：all_members
         */
        private String downloadHasPermissionSetting;
        /**
         * 允许复制和转发消息
         * <p> 示例值：all_members
         */
        private String messageHasPermissionSetting;

        /**
         * 防泄密模式是否开启
         * <p> 示例值：true
         *
         * @param status
         * @return
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }


        /**
         * 允许截屏录屏
         * <p> 示例值：all_members
         *
         * @param screenshotHasPermissionSetting
         * @return
         */
        public Builder screenshotHasPermissionSetting(String screenshotHasPermissionSetting) {
            this.screenshotHasPermissionSetting = screenshotHasPermissionSetting;
            return this;
        }

        /**
         * 允许截屏录屏
         * <p> 示例值：all_members
         *
         * @param screenshotHasPermissionSetting {@link com.lark.oapi.service.im.v1.enums.RestrictedModeSettingScreenshotHasPermissionSettingEnum}
         * @return
         */
        public Builder screenshotHasPermissionSetting(com.lark.oapi.service.im.v1.enums.RestrictedModeSettingScreenshotHasPermissionSettingEnum screenshotHasPermissionSetting) {
            this.screenshotHasPermissionSetting = screenshotHasPermissionSetting.getValue();
            return this;
        }


        /**
         * 允许下载消息中图片、视频和文件
         * <p> 示例值：all_members
         *
         * @param downloadHasPermissionSetting
         * @return
         */
        public Builder downloadHasPermissionSetting(String downloadHasPermissionSetting) {
            this.downloadHasPermissionSetting = downloadHasPermissionSetting;
            return this;
        }

        /**
         * 允许下载消息中图片、视频和文件
         * <p> 示例值：all_members
         *
         * @param downloadHasPermissionSetting {@link com.lark.oapi.service.im.v1.enums.RestrictedModeSettingDownloadHasPermissionSettingEnum}
         * @return
         */
        public Builder downloadHasPermissionSetting(com.lark.oapi.service.im.v1.enums.RestrictedModeSettingDownloadHasPermissionSettingEnum downloadHasPermissionSetting) {
            this.downloadHasPermissionSetting = downloadHasPermissionSetting.getValue();
            return this;
        }


        /**
         * 允许复制和转发消息
         * <p> 示例值：all_members
         *
         * @param messageHasPermissionSetting
         * @return
         */
        public Builder messageHasPermissionSetting(String messageHasPermissionSetting) {
            this.messageHasPermissionSetting = messageHasPermissionSetting;
            return this;
        }

        /**
         * 允许复制和转发消息
         * <p> 示例值：all_members
         *
         * @param messageHasPermissionSetting {@link com.lark.oapi.service.im.v1.enums.RestrictedModeSettingMessageHasPermissionSettingEnum}
         * @return
         */
        public Builder messageHasPermissionSetting(com.lark.oapi.service.im.v1.enums.RestrictedModeSettingMessageHasPermissionSettingEnum messageHasPermissionSetting) {
            this.messageHasPermissionSetting = messageHasPermissionSetting.getValue();
            return this;
        }


        public RestrictedModeSetting build() {
            return new RestrictedModeSetting(this);
        }
    }
}
