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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class InternOfferStatusOfferReq {
    /**
     * Offer ID
     * <p> 示例值：7016605170635213100
     */
    @Path
    @SerializedName("offer_id")
    private String offerId;
    @Body
    private InternOfferStatus body;

    // builder 开始
    public InternOfferStatusOfferReq() {
    }

    public InternOfferStatusOfferReq(Builder builder) {
        /**
         * Offer ID
         * <p> 示例值：7016605170635213100
         */
        this.offerId = builder.offerId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOfferId() {
        return this.offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public InternOfferStatus getInternOfferStatus() {
        return this.body;
    }

    public void setInternOfferStatus(InternOfferStatus body) {
        this.body = body;
    }

    public static class Builder {

        private String offerId; // Offer ID
        private InternOfferStatus body;

        /**
         * Offer ID
         * <p> 示例值：7016605170635213100
         *
         * @param offerId
         * @return
         */
        public Builder offerId(String offerId) {
            this.offerId = offerId;
            return this;
        }

        public InternOfferStatus getInternOfferStatus() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder internOfferStatus(InternOfferStatus body) {
            this.body = body;
            return this;
        }

        public InternOfferStatusOfferReq build() {
            return new InternOfferStatusOfferReq(this);
        }
    }
}