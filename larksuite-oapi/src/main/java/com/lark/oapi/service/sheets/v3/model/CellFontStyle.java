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

package com.lark.oapi.service.sheets.v3.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.sheets.v3.enums.*;
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

public class CellFontStyle {
    /**
     * 是否加粗
     * <p> 示例值：true
     */
    @SerializedName("bold")
    private Boolean bold;
    /**
     * 是否斜体
     * <p> 示例值：true
     */
    @SerializedName("italic")
    private Boolean italic;
    /**
     * 是否设置删除线
     * <p> 示例值：true
     */
    @SerializedName("strikethrough")
    private Boolean strikethrough;
    /**
     * 是否展示下划线
     * <p> 示例值：true
     */
    @SerializedName("underline")
    private Boolean underline;
    /**
     * 字体颜色
     * <p> 示例值：#ff00ff
     */
    @SerializedName("foreground_color")
    private String foregroundColor;
    /**
     * 背景颜色
     * <p> 示例值：#ff00ff
     */
    @SerializedName("background_color")
    private String backgroundColor;

    // builder 开始
    public CellFontStyle() {
    }

    public CellFontStyle(Builder builder) {
        /**
         * 是否加粗
         * <p> 示例值：true
         */
        this.bold = builder.bold;
        /**
         * 是否斜体
         * <p> 示例值：true
         */
        this.italic = builder.italic;
        /**
         * 是否设置删除线
         * <p> 示例值：true
         */
        this.strikethrough = builder.strikethrough;
        /**
         * 是否展示下划线
         * <p> 示例值：true
         */
        this.underline = builder.underline;
        /**
         * 字体颜色
         * <p> 示例值：#ff00ff
         */
        this.foregroundColor = builder.foregroundColor;
        /**
         * 背景颜色
         * <p> 示例值：#ff00ff
         */
        this.backgroundColor = builder.backgroundColor;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getBold() {
        return this.bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public Boolean getItalic() {
        return this.italic;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public Boolean getStrikethrough() {
        return this.strikethrough;
    }

    public void setStrikethrough(Boolean strikethrough) {
        this.strikethrough = strikethrough;
    }

    public Boolean getUnderline() {
        return this.underline;
    }

    public void setUnderline(Boolean underline) {
        this.underline = underline;
    }

    public String getForegroundColor() {
        return this.foregroundColor;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public static class Builder {
        /**
         * 是否加粗
         * <p> 示例值：true
         */
        private Boolean bold;
        /**
         * 是否斜体
         * <p> 示例值：true
         */
        private Boolean italic;
        /**
         * 是否设置删除线
         * <p> 示例值：true
         */
        private Boolean strikethrough;
        /**
         * 是否展示下划线
         * <p> 示例值：true
         */
        private Boolean underline;
        /**
         * 字体颜色
         * <p> 示例值：#ff00ff
         */
        private String foregroundColor;
        /**
         * 背景颜色
         * <p> 示例值：#ff00ff
         */
        private String backgroundColor;

        /**
         * 是否加粗
         * <p> 示例值：true
         *
         * @param bold
         * @return
         */
        public Builder bold(Boolean bold) {
            this.bold = bold;
            return this;
        }


        /**
         * 是否斜体
         * <p> 示例值：true
         *
         * @param italic
         * @return
         */
        public Builder italic(Boolean italic) {
            this.italic = italic;
            return this;
        }


        /**
         * 是否设置删除线
         * <p> 示例值：true
         *
         * @param strikethrough
         * @return
         */
        public Builder strikethrough(Boolean strikethrough) {
            this.strikethrough = strikethrough;
            return this;
        }


        /**
         * 是否展示下划线
         * <p> 示例值：true
         *
         * @param underline
         * @return
         */
        public Builder underline(Boolean underline) {
            this.underline = underline;
            return this;
        }


        /**
         * 字体颜色
         * <p> 示例值：#ff00ff
         *
         * @param foregroundColor
         * @return
         */
        public Builder foregroundColor(String foregroundColor) {
            this.foregroundColor = foregroundColor;
            return this;
        }


        /**
         * 背景颜色
         * <p> 示例值：#ff00ff
         *
         * @param backgroundColor
         * @return
         */
        public Builder backgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }


        public CellFontStyle build() {
            return new CellFontStyle(this);
        }
    }
}
