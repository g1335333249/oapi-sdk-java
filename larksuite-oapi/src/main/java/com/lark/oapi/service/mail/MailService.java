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
package com.lark.oapi.service.mail;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.mail.v1.V1;
import com.lark.oapi.service.mail.v1.model.*;
import com.lark.oapi.service.mail.v1.resource.Mailgroup;
import com.lark.oapi.service.mail.v1.resource.MailgroupAlias;
import com.lark.oapi.service.mail.v1.resource.MailgroupManager;
import com.lark.oapi.service.mail.v1.resource.MailgroupMember;
import com.lark.oapi.service.mail.v1.resource.MailgroupPermissionMember;
import com.lark.oapi.service.mail.v1.resource.PublicMailbox;
import com.lark.oapi.service.mail.v1.resource.PublicMailboxAlias;
import com.lark.oapi.service.mail.v1.resource.PublicMailboxMember;
import com.lark.oapi.service.mail.v1.resource.User;
import com.lark.oapi.service.mail.v1.resource.UserMailbox;
import com.lark.oapi.service.mail.v1.resource.UserMailboxAlias;

public class MailService {
    private final V1 v1;
    private final Mailgroup mailgroup; // 邮件组
    private final MailgroupAlias mailgroupAlias; // 邮件组别名
    private final MailgroupManager mailgroupManager; // 邮件组管理员
    private final MailgroupMember mailgroupMember; // 邮件组成员
    private final MailgroupPermissionMember mailgroupPermissionMember; // 邮件组权限成员
    private final PublicMailbox publicMailbox; // 公共邮箱
    private final PublicMailboxAlias publicMailboxAlias; // 公共邮箱别名
    private final PublicMailboxMember publicMailboxMember; // 公共邮箱成员
    private final User user; // 邮箱地址
    private final UserMailbox userMailbox; // 用户邮箱
    private final UserMailboxAlias userMailboxAlias; // 用户邮箱别名

    public MailService(Config config) {
        this.v1 = new V1(config);
        this.mailgroup = new Mailgroup(config);
        this.mailgroupAlias = new MailgroupAlias(config);
        this.mailgroupManager = new MailgroupManager(config);
        this.mailgroupMember = new MailgroupMember(config);
        this.mailgroupPermissionMember = new MailgroupPermissionMember(config);
        this.publicMailbox = new PublicMailbox(config);
        this.publicMailboxAlias = new PublicMailboxAlias(config);
        this.publicMailboxMember = new PublicMailboxMember(config);
        this.user = new User(config);
        this.userMailbox = new UserMailbox(config);
        this.userMailboxAlias = new UserMailboxAlias(config);
    }

    public V1 v1() {
        return v1;
    }

    public Mailgroup mailgroup() {
        return mailgroup;
    }

    public MailgroupAlias mailgroupAlias() {
        return mailgroupAlias;
    }

    public MailgroupManager mailgroupManager() {
        return mailgroupManager;
    }

    public MailgroupMember mailgroupMember() {
        return mailgroupMember;
    }

    public MailgroupPermissionMember mailgroupPermissionMember() {
        return mailgroupPermissionMember;
    }

    public PublicMailbox publicMailbox() {
        return publicMailbox;
    }

    public PublicMailboxAlias publicMailboxAlias() {
        return publicMailboxAlias;
    }

    public PublicMailboxMember publicMailboxMember() {
        return publicMailboxMember;
    }

    public User user() {
        return user;
    }

    public UserMailbox userMailbox() {
        return userMailbox;
    }

    public UserMailboxAlias userMailboxAlias() {
        return userMailboxAlias;
    }
}