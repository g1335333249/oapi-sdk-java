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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;

public class Task {

  /**
   * 任务 ID，由飞书任务服务器发号
   * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
   */
  @SerializedName("id")
  private String id;
  /**
   * 任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。;<md-alert>;任务标题和任务富文本标题同时存在时只使用富文本标题。;</md-alert>
   * <p> 示例值：每天喝八杯水，保持身心愉悦
   */
  @SerializedName("summary")
  private String summary;
  /**
   * 任务备注。;<md-alert>;任务备注和任务富文本备注同时存在时只使用富文本备注。;</md-alert>
   * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。
   */
  @SerializedName("description")
  private String description;
  /**
   * 任务的完成时间戳（单位为秒），如果完成时间为 0，则表示任务尚未完成
   * <p> 示例值：1623499200
   */
  @SerializedName("complete_time")
  private String completeTime;
  /**
   * 任务的创建者 ID。在创建任务时无需填充该字段
   * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f346a
   */
  @SerializedName("creator_id")
  private String creatorId;
  /**
   * 接入方可以自定义的附属信息二进制格式，采用 base64 编码，解析方式由接入方自己决定
   * <p> 示例值：dGVzdA==
   */
  @SerializedName("extra")
  private String extra;
  /**
   * 任务的创建时间戳（单位为秒）
   * <p> 示例值：1623392486
   */
  @SerializedName("create_time")
  private String createTime;
  /**
   * 任务的更新时间戳（单位为秒）
   * <p> 示例值：1623392486
   */
  @SerializedName("update_time")
  private String updateTime;
  /**
   * 任务的截止时间设置
   * <p> 示例值：
   */
  @SerializedName("due")
  private Due due;
  /**
   * 任务关联的第三方平台来源信息
   * <p> 示例值：
   */
  @SerializedName("origin")
  private Origin origin;
  /**
   * 此字段用于控制该任务在飞书任务中心是否可编辑，默认为false，若为true则第三方需考虑是否需要接入事件来接收任务在任务中心的变更信息;（即将废弃）
   * <p> 示例值：true
   */
  @SerializedName("can_edit")
  private Boolean canEdit;
  /**
   * 此字段用于存储第三方需透传到端上的自定义数据，Json格式。取值举例中custom_complete字段存储「完成」按钮的跳转链接（href）或提示信息（tip），pc、ios、android三端均可自定义，其中tip字段的key为语言类型，value为提示信息，可自行增加或减少语言类型，支持的各地区语言名：it_it,
   * th_th, ko_kr, es_es, ja_jp, zh_cn, id_id, zh_hk, pt_br, de_de, fr_fr, zh_tw, ru_ru, en_us,
   * hi_in, vi_vn。href的优先级高于tip，href和tip同时不为空时只跳转不提示。链接和提示信息可自定义，其余的key需按举例中的结构传递
   * <p> 示例值：{\"custom_complete\":{\"android\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"ios\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"pc\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}}}}
   */
  @SerializedName("custom")
  private String custom;
  /**
   * 任务创建的来源
   * <p> 示例值：
   */
  @SerializedName("source")
  private Integer source;
  /**
   * 任务的关注者
   * <p> 示例值：ou_03c21c80caea2c816665f8056dc59027
   */
  @SerializedName("followers")
  private Follower[] followers;
  /**
   * 任务的执行者
   * <p> 示例值：ou_558d4999baae26e32aa2fd9bb228660b
   */
  @SerializedName("collaborators")
  private Collaborator[] collaborators;
  /**
   * 创建任务时添加的执行者用户id列表
   * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
   */
  @SerializedName("collaborator_ids")
  private String[] collaboratorIds;
  /**
   * 创建任务时添加的关注者用户id列表
   * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
   */
  @SerializedName("follower_ids")
  private String[] followerIds;
  /**
   * 重复任务重复规则
   * <p> 示例值：FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,TU,WE,TH,FR
   */
  @SerializedName("repeat_rule")
  private String repeatRule;
  /**
   * 富文本任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
   * <p> 示例值：每天喝八杯水，保持身心愉悦\[飞书开放平台\](https://open.feishu.cn/)
   */
  @SerializedName("rich_summary")
  private String richSummary;
  /**
   * 富文本任务备注。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
   * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。\[飞书开放平台](https://open.feishu.cn/)
   */
  @SerializedName("rich_description")
  private String richDescription;

  // builder 开始
  public Task() {
  }

  public Task(Builder builder) {
    /**
     * 任务 ID，由飞书任务服务器发号
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     */
    this.id = builder.id;
    /**
     * 任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。;<md-alert>;任务标题和任务富文本标题同时存在时只使用富文本标题。;</md-alert>
     * <p> 示例值：每天喝八杯水，保持身心愉悦
     */
    this.summary = builder.summary;
    /**
     * 任务备注。;<md-alert>;任务备注和任务富文本备注同时存在时只使用富文本备注。;</md-alert>
     * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。
     */
    this.description = builder.description;
    /**
     * 任务的完成时间戳（单位为秒），如果完成时间为 0，则表示任务尚未完成
     * <p> 示例值：1623499200
     */
    this.completeTime = builder.completeTime;
    /**
     * 任务的创建者 ID。在创建任务时无需填充该字段
     * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f346a
     */
    this.creatorId = builder.creatorId;
    /**
     * 接入方可以自定义的附属信息二进制格式，采用 base64 编码，解析方式由接入方自己决定
     * <p> 示例值：dGVzdA==
     */
    this.extra = builder.extra;
    /**
     * 任务的创建时间戳（单位为秒）
     * <p> 示例值：1623392486
     */
    this.createTime = builder.createTime;
    /**
     * 任务的更新时间戳（单位为秒）
     * <p> 示例值：1623392486
     */
    this.updateTime = builder.updateTime;
    /**
     * 任务的截止时间设置
     * <p> 示例值：
     */
    this.due = builder.due;
    /**
     * 任务关联的第三方平台来源信息
     * <p> 示例值：
     */
    this.origin = builder.origin;
    /**
     * 此字段用于控制该任务在飞书任务中心是否可编辑，默认为false，若为true则第三方需考虑是否需要接入事件来接收任务在任务中心的变更信息;（即将废弃）
     * <p> 示例值：true
     */
    this.canEdit = builder.canEdit;
    /**
     * 此字段用于存储第三方需透传到端上的自定义数据，Json格式。取值举例中custom_complete字段存储「完成」按钮的跳转链接（href）或提示信息（tip），pc、ios、android三端均可自定义，其中tip字段的key为语言类型，value为提示信息，可自行增加或减少语言类型，支持的各地区语言名：it_it, th_th, ko_kr, es_es, ja_jp, zh_cn, id_id, zh_hk, pt_br, de_de, fr_fr, zh_tw, ru_ru, en_us, hi_in, vi_vn。href的优先级高于tip，href和tip同时不为空时只跳转不提示。链接和提示信息可自定义，其余的key需按举例中的结构传递
     * <p> 示例值：{\"custom_complete\":{\"android\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"ios\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"pc\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}}}}
     */
    this.custom = builder.custom;
    /**
     * 任务创建的来源
     * <p> 示例值：
     */
    this.source = builder.source;
    /**
     * 任务的关注者
     * <p> 示例值：ou_03c21c80caea2c816665f8056dc59027
     */
    this.followers = builder.followers;
    /**
     * 任务的执行者
     * <p> 示例值：ou_558d4999baae26e32aa2fd9bb228660b
     */
    this.collaborators = builder.collaborators;
    /**
     * 创建任务时添加的执行者用户id列表
     * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
     */
    this.collaboratorIds = builder.collaboratorIds;
    /**
     * 创建任务时添加的关注者用户id列表
     * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
     */
    this.followerIds = builder.followerIds;
    /**
     * 重复任务重复规则
     * <p> 示例值：FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,TU,WE,TH,FR
     */
    this.repeatRule = builder.repeatRule;
    /**
     * 富文本任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
     * <p> 示例值：每天喝八杯水，保持身心愉悦\[飞书开放平台\](https://open.feishu.cn/)
     */
    this.richSummary = builder.richSummary;
    /**
     * 富文本任务备注。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
     * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。\[飞书开放平台](https://open.feishu.cn/)
     */
    this.richDescription = builder.richDescription;
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

  public String getSummary() {
    return this.summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCompleteTime() {
    return this.completeTime;
  }

  public void setCompleteTime(String completeTime) {
    this.completeTime = completeTime;
  }

  public String getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public Due getDue() {
    return this.due;
  }

  public void setDue(Due due) {
    this.due = due;
  }

  public Origin getOrigin() {
    return this.origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }

  public Boolean getCanEdit() {
    return this.canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public String getCustom() {
    return this.custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public Integer getSource() {
    return this.source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public Follower[] getFollowers() {
    return this.followers;
  }

  public void setFollowers(Follower[] followers) {
    this.followers = followers;
  }

  public Collaborator[] getCollaborators() {
    return this.collaborators;
  }

  public void setCollaborators(Collaborator[] collaborators) {
    this.collaborators = collaborators;
  }

  public String[] getCollaboratorIds() {
    return this.collaboratorIds;
  }

  public void setCollaboratorIds(String[] collaboratorIds) {
    this.collaboratorIds = collaboratorIds;
  }

  public String[] getFollowerIds() {
    return this.followerIds;
  }

  public void setFollowerIds(String[] followerIds) {
    this.followerIds = followerIds;
  }

  public String getRepeatRule() {
    return this.repeatRule;
  }

  public void setRepeatRule(String repeatRule) {
    this.repeatRule = repeatRule;
  }

  public String getRichSummary() {
    return this.richSummary;
  }

  public void setRichSummary(String richSummary) {
    this.richSummary = richSummary;
  }

  public String getRichDescription() {
    return this.richDescription;
  }

  public void setRichDescription(String richDescription) {
    this.richDescription = richDescription;
  }

  public static class Builder {

    /**
     * 任务 ID，由飞书任务服务器发号
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     */
    private String id;
    /**
     * 任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。;<md-alert>;任务标题和任务富文本标题同时存在时只使用富文本标题。;</md-alert>
     * <p> 示例值：每天喝八杯水，保持身心愉悦
     */
    private String summary;
    /**
     * 任务备注。;<md-alert>;任务备注和任务富文本备注同时存在时只使用富文本备注。;</md-alert>
     * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。
     */
    private String description;
    /**
     * 任务的完成时间戳（单位为秒），如果完成时间为 0，则表示任务尚未完成
     * <p> 示例值：1623499200
     */
    private String completeTime;
    /**
     * 任务的创建者 ID。在创建任务时无需填充该字段
     * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f346a
     */
    private String creatorId;
    /**
     * 接入方可以自定义的附属信息二进制格式，采用 base64 编码，解析方式由接入方自己决定
     * <p> 示例值：dGVzdA==
     */
    private String extra;
    /**
     * 任务的创建时间戳（单位为秒）
     * <p> 示例值：1623392486
     */
    private String createTime;
    /**
     * 任务的更新时间戳（单位为秒）
     * <p> 示例值：1623392486
     */
    private String updateTime;
    /**
     * 任务的截止时间设置
     * <p> 示例值：
     */
    private Due due;
    /**
     * 任务关联的第三方平台来源信息
     * <p> 示例值：
     */
    private Origin origin;
    /**
     * 此字段用于控制该任务在飞书任务中心是否可编辑，默认为false，若为true则第三方需考虑是否需要接入事件来接收任务在任务中心的变更信息;（即将废弃）
     * <p> 示例值：true
     */
    private Boolean canEdit;
    /**
     * 此字段用于存储第三方需透传到端上的自定义数据，Json格式。取值举例中custom_complete字段存储「完成」按钮的跳转链接（href）或提示信息（tip），pc、ios、android三端均可自定义，其中tip字段的key为语言类型，value为提示信息，可自行增加或减少语言类型，支持的各地区语言名：it_it,
     * th_th, ko_kr, es_es, ja_jp, zh_cn, id_id, zh_hk, pt_br, de_de, fr_fr, zh_tw, ru_ru, en_us,
     * hi_in, vi_vn。href的优先级高于tip，href和tip同时不为空时只跳转不提示。链接和提示信息可自定义，其余的key需按举例中的结构传递
     * <p> 示例值：{\"custom_complete\":{\"android\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"ios\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"pc\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}}}}
     */
    private String custom;
    /**
     * 任务创建的来源
     * <p> 示例值：
     */
    private Integer source;
    /**
     * 任务的关注者
     * <p> 示例值：ou_03c21c80caea2c816665f8056dc59027
     */
    private Follower[] followers;
    /**
     * 任务的执行者
     * <p> 示例值：ou_558d4999baae26e32aa2fd9bb228660b
     */
    private Collaborator[] collaborators;
    /**
     * 创建任务时添加的执行者用户id列表
     * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
     */
    private String[] collaboratorIds;
    /**
     * 创建任务时添加的关注者用户id列表
     * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
     */
    private String[] followerIds;
    /**
     * 重复任务重复规则
     * <p> 示例值：FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,TU,WE,TH,FR
     */
    private String repeatRule;
    /**
     * 富文本任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
     * <p> 示例值：每天喝八杯水，保持身心愉悦\[飞书开放平台\](https://open.feishu.cn/)
     */
    private String richSummary;
    /**
     * 富文本任务备注。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
     * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。\[飞书开放平台](https://open.feishu.cn/)
     */
    private String richDescription;

    /**
     * 任务 ID，由飞书任务服务器发号
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。;<md-alert>;任务标题和任务富文本标题同时存在时只使用富文本标题。;</md-alert>
     * <p> 示例值：每天喝八杯水，保持身心愉悦
     *
     * @param summary
     * @return
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }


    /**
     * 任务备注。;<md-alert>;任务备注和任务富文本备注同时存在时只使用富文本备注。;</md-alert>
     * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。
     *
     * @param description
     * @return
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }


    /**
     * 任务的完成时间戳（单位为秒），如果完成时间为 0，则表示任务尚未完成
     * <p> 示例值：1623499200
     *
     * @param completeTime
     * @return
     */
    public Builder completeTime(String completeTime) {
      this.completeTime = completeTime;
      return this;
    }


    /**
     * 任务的创建者 ID。在创建任务时无需填充该字段
     * <p> 示例值：ou_99e1a581b36ecc4862cbfbce473f346a
     *
     * @param creatorId
     * @return
     */
    public Builder creatorId(String creatorId) {
      this.creatorId = creatorId;
      return this;
    }


    /**
     * 接入方可以自定义的附属信息二进制格式，采用 base64 编码，解析方式由接入方自己决定
     * <p> 示例值：dGVzdA==
     *
     * @param extra
     * @return
     */
    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }


    /**
     * 任务的创建时间戳（单位为秒）
     * <p> 示例值：1623392486
     *
     * @param createTime
     * @return
     */
    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }


    /**
     * 任务的更新时间戳（单位为秒）
     * <p> 示例值：1623392486
     *
     * @param updateTime
     * @return
     */
    public Builder updateTime(String updateTime) {
      this.updateTime = updateTime;
      return this;
    }


    /**
     * 任务的截止时间设置
     * <p> 示例值：
     *
     * @param due
     * @return
     */
    public Builder due(Due due) {
      this.due = due;
      return this;
    }


    /**
     * 任务关联的第三方平台来源信息
     * <p> 示例值：
     *
     * @param origin
     * @return
     */
    public Builder origin(Origin origin) {
      this.origin = origin;
      return this;
    }


    /**
     * 此字段用于控制该任务在飞书任务中心是否可编辑，默认为false，若为true则第三方需考虑是否需要接入事件来接收任务在任务中心的变更信息;（即将废弃）
     * <p> 示例值：true
     *
     * @param canEdit
     * @return
     */
    public Builder canEdit(Boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }


    /**
     * 此字段用于存储第三方需透传到端上的自定义数据，Json格式。取值举例中custom_complete字段存储「完成」按钮的跳转链接（href）或提示信息（tip），pc、ios、android三端均可自定义，其中tip字段的key为语言类型，value为提示信息，可自行增加或减少语言类型，支持的各地区语言名：it_it,
     * th_th, ko_kr, es_es, ja_jp, zh_cn, id_id, zh_hk, pt_br, de_de, fr_fr, zh_tw, ru_ru, en_us,
     * hi_in, vi_vn。href的优先级高于tip，href和tip同时不为空时只跳转不提示。链接和提示信息可自定义，其余的key需按举例中的结构传递
     * <p> 示例值：{\"custom_complete\":{\"android\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"ios\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}},\"pc\":{\"href\":\"https://www.feishu.cn/\",\"tip\":{\"zh_cn\":\"你好\",\"en_us\":\"hello\"}}}}
     *
     * @param custom
     * @return
     */
    public Builder custom(String custom) {
      this.custom = custom;
      return this;
    }


    /**
     * 任务创建的来源
     * <p> 示例值：
     *
     * @param source
     * @return
     */
    public Builder source(Integer source) {
      this.source = source;
      return this;
    }

    /**
     * 任务创建的来源
     * <p> 示例值：
     *
     * @param source {@link com.lark.oapi.service.task.v1.enums.TaskSourceEnum}
     * @return
     */
    public Builder source(com.lark.oapi.service.task.v1.enums.TaskSourceEnum source) {
      this.source = source.getValue();
      return this;
    }


    /**
     * 任务的关注者
     * <p> 示例值：ou_03c21c80caea2c816665f8056dc59027
     *
     * @param followers
     * @return
     */
    public Builder followers(Follower[] followers) {
      this.followers = followers;
      return this;
    }


    /**
     * 任务的执行者
     * <p> 示例值：ou_558d4999baae26e32aa2fd9bb228660b
     *
     * @param collaborators
     * @return
     */
    public Builder collaborators(Collaborator[] collaborators) {
      this.collaborators = collaborators;
      return this;
    }


    /**
     * 创建任务时添加的执行者用户id列表
     * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
     *
     * @param collaboratorIds
     * @return
     */
    public Builder collaboratorIds(String[] collaboratorIds) {
      this.collaboratorIds = collaboratorIds;
      return this;
    }


    /**
     * 创建任务时添加的关注者用户id列表
     * <p> 示例值：["ou_1400208f15333e20e11339d39067844b", "ou_84ed6312949945c8ae6168f10829e9e6"]
     *
     * @param followerIds
     * @return
     */
    public Builder followerIds(String[] followerIds) {
      this.followerIds = followerIds;
      return this;
    }


    /**
     * 重复任务重复规则
     * <p> 示例值：FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,TU,WE,TH,FR
     *
     * @param repeatRule
     * @return
     */
    public Builder repeatRule(String repeatRule) {
      this.repeatRule = repeatRule;
      return this;
    }


    /**
     * 富文本任务标题。创建任务时，如果没有标题填充，飞书服务器会将其视为无主题的任务。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
     * <p> 示例值：每天喝八杯水，保持身心愉悦\[飞书开放平台\](https://open.feishu.cn/)
     *
     * @param richSummary
     * @return
     */
    public Builder richSummary(String richSummary) {
      this.richSummary = richSummary;
      return this;
    }


    /**
     * 富文本任务备注。语法格式参见[Markdown模块](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/task-v1/markdown-module)
     * <p> 示例值：多吃水果，多运动，健康生活，快乐工作。\[飞书开放平台](https://open.feishu.cn/)
     *
     * @param richDescription
     * @return
     */
    public Builder richDescription(String richDescription) {
      this.richDescription = richDescription;
      return this;
    }


    public Task build() {
      return new Task(this);
    }
  }
}
