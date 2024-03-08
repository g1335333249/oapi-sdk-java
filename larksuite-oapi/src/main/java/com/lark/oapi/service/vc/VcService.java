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
package com.lark.oapi.service.vc;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.vc.v1.V1;
import com.lark.oapi.service.vc.v1.model.*;
import com.lark.oapi.service.vc.v1.resource.Alert;
import com.lark.oapi.service.vc.v1.resource.Export;
import com.lark.oapi.service.vc.v1.resource.Meeting;
import com.lark.oapi.service.vc.v1.resource.MeetingRecording;
import com.lark.oapi.service.vc.v1.resource.MeetingList;
import com.lark.oapi.service.vc.v1.resource.ParticipantList;
import com.lark.oapi.service.vc.v1.resource.ParticipantQualityList;
import com.lark.oapi.service.vc.v1.resource.Report;
import com.lark.oapi.service.vc.v1.resource.Reserve;
import com.lark.oapi.service.vc.v1.resource.ReserveConfig;
import com.lark.oapi.service.vc.v1.resource.ReserveConfigAdmin;
import com.lark.oapi.service.vc.v1.resource.ReserveConfigDisableInform;
import com.lark.oapi.service.vc.v1.resource.ReserveConfigForm;
import com.lark.oapi.service.vc.v1.resource.ResourceReservationList;
import com.lark.oapi.service.vc.v1.resource.Room;
import com.lark.oapi.service.vc.v1.resource.RoomConfig;
import com.lark.oapi.service.vc.v1.resource.RoomLevel;
import com.lark.oapi.service.vc.v1.resource.ScopeConfig;

public class VcService {
    private final V1 v1;
    private final Alert alert; // 告警中心
    private final Export export; // 导出
    private final Meeting meeting; // 会议
    private final MeetingRecording meetingRecording; // 录制
    private final MeetingList meetingList; // meeting_list
    private final ParticipantList participantList; // participant_list
    private final ParticipantQualityList participantQualityList; // participant_quality_list
    private final Report report; // 会议报告
    private final Reserve reserve; // 预约
    private final ReserveConfig reserveConfig; // reserve_config
    private final ReserveConfigAdmin reserveConfigAdmin; // reserve_config.admin
    private final ReserveConfigDisableInform reserveConfigDisableInform; // reserve_config.disable_inform
    private final ReserveConfigForm reserveConfigForm; // reserve_config.form
    private final ResourceReservationList resourceReservationList; // resource_reservation_list
    private final Room room; // 会议室
    private final RoomConfig roomConfig; // room_config
    private final RoomLevel roomLevel; // 会议室层级
    private final ScopeConfig scopeConfig; // 会议室配置

    public VcService(Config config) {
        this.v1 = new V1(config);
        this.alert = new Alert(config);
        this.export = new Export(config);
        this.meeting = new Meeting(config);
        this.meetingRecording = new MeetingRecording(config);
        this.meetingList = new MeetingList(config);
        this.participantList = new ParticipantList(config);
        this.participantQualityList = new ParticipantQualityList(config);
        this.report = new Report(config);
        this.reserve = new Reserve(config);
        this.reserveConfig = new ReserveConfig(config);
        this.reserveConfigAdmin = new ReserveConfigAdmin(config);
        this.reserveConfigDisableInform = new ReserveConfigDisableInform(config);
        this.reserveConfigForm = new ReserveConfigForm(config);
        this.resourceReservationList = new ResourceReservationList(config);
        this.room = new Room(config);
        this.roomConfig = new RoomConfig(config);
        this.roomLevel = new RoomLevel(config);
        this.scopeConfig = new ScopeConfig(config);
    }

    public V1 v1() {
        return v1;
    }

    public Alert alert() {
        return alert;
    }

    public Export export() {
        return export;
    }

    public Meeting meeting() {
        return meeting;
    }

    public MeetingRecording meetingRecording() {
        return meetingRecording;
    }

    public MeetingList meetingList() {
        return meetingList;
    }

    public ParticipantList participantList() {
        return participantList;
    }

    public ParticipantQualityList participantQualityList() {
        return participantQualityList;
    }

    public Report report() {
        return report;
    }

    public Reserve reserve() {
        return reserve;
    }

    public ReserveConfig reserveConfig() {
        return reserveConfig;
    }

    public ReserveConfigAdmin reserveConfigAdmin() {
        return reserveConfigAdmin;
    }

    public ReserveConfigDisableInform reserveConfigDisableInform() {
        return reserveConfigDisableInform;
    }

    public ReserveConfigForm reserveConfigForm() {
        return reserveConfigForm;
    }

    public ResourceReservationList resourceReservationList() {
        return resourceReservationList;
    }

    public Room room() {
        return room;
    }

    public RoomConfig roomConfig() {
        return roomConfig;
    }

    public RoomLevel roomLevel() {
        return roomLevel;
    }

    public ScopeConfig scopeConfig() {
        return scopeConfig;
    }

    public abstract static class P2MeetingAllMeetingEndedV1Handler implements IEventHandler<P2MeetingAllMeetingEndedV1> {
        @Override
        public P2MeetingAllMeetingEndedV1 getEvent() {
            return new P2MeetingAllMeetingEndedV1();
        }
    }

    public abstract static class P2MeetingAllMeetingStartedV1Handler implements IEventHandler<P2MeetingAllMeetingStartedV1> {
        @Override
        public P2MeetingAllMeetingStartedV1 getEvent() {
            return new P2MeetingAllMeetingStartedV1();
        }
    }

    public abstract static class P2MeetingJoinMeetingV1Handler implements IEventHandler<P2MeetingJoinMeetingV1> {
        @Override
        public P2MeetingJoinMeetingV1 getEvent() {
            return new P2MeetingJoinMeetingV1();
        }
    }

    public abstract static class P2MeetingLeaveMeetingV1Handler implements IEventHandler<P2MeetingLeaveMeetingV1> {
        @Override
        public P2MeetingLeaveMeetingV1 getEvent() {
            return new P2MeetingLeaveMeetingV1();
        }
    }

    public abstract static class P2MeetingEndedV1Handler implements IEventHandler<P2MeetingEndedV1> {
        @Override
        public P2MeetingEndedV1 getEvent() {
            return new P2MeetingEndedV1();
        }
    }

    public abstract static class P2MeetingStartedV1Handler implements IEventHandler<P2MeetingStartedV1> {
        @Override
        public P2MeetingStartedV1 getEvent() {
            return new P2MeetingStartedV1();
        }
    }

    public abstract static class P2MeetingRecordingEndedV1Handler implements IEventHandler<P2MeetingRecordingEndedV1> {
        @Override
        public P2MeetingRecordingEndedV1 getEvent() {
            return new P2MeetingRecordingEndedV1();
        }
    }

    public abstract static class P2MeetingRecordingReadyV1Handler implements IEventHandler<P2MeetingRecordingReadyV1> {
        @Override
        public P2MeetingRecordingReadyV1 getEvent() {
            return new P2MeetingRecordingReadyV1();
        }
    }

    public abstract static class P2MeetingRecordingStartedV1Handler implements IEventHandler<P2MeetingRecordingStartedV1> {
        @Override
        public P2MeetingRecordingStartedV1 getEvent() {
            return new P2MeetingRecordingStartedV1();
        }
    }

    public abstract static class P2MeetingShareEndedV1Handler implements IEventHandler<P2MeetingShareEndedV1> {
        @Override
        public P2MeetingShareEndedV1 getEvent() {
            return new P2MeetingShareEndedV1();
        }
    }

    public abstract static class P2MeetingShareStartedV1Handler implements IEventHandler<P2MeetingShareStartedV1> {
        @Override
        public P2MeetingShareStartedV1 getEvent() {
            return new P2MeetingShareStartedV1();
        }
    }

    public abstract static class P2ReserveConfigUpdatedV1Handler implements IEventHandler<P2ReserveConfigUpdatedV1> {
        @Override
        public P2ReserveConfigUpdatedV1 getEvent() {
            return new P2ReserveConfigUpdatedV1();
        }
    }

    public abstract static class P2RoomCreatedV1Handler implements IEventHandler<P2RoomCreatedV1> {
        @Override
        public P2RoomCreatedV1 getEvent() {
            return new P2RoomCreatedV1();
        }
    }

    public abstract static class P2RoomDeletedV1Handler implements IEventHandler<P2RoomDeletedV1> {
        @Override
        public P2RoomDeletedV1 getEvent() {
            return new P2RoomDeletedV1();
        }
    }

    public abstract static class P2RoomUpdatedV1Handler implements IEventHandler<P2RoomUpdatedV1> {
        @Override
        public P2RoomUpdatedV1 getEvent() {
            return new P2RoomUpdatedV1();
        }
    }

    public abstract static class P2RoomLevelCreatedV1Handler implements IEventHandler<P2RoomLevelCreatedV1> {
        @Override
        public P2RoomLevelCreatedV1 getEvent() {
            return new P2RoomLevelCreatedV1();
        }
    }

    public abstract static class P2RoomLevelDeletedV1Handler implements IEventHandler<P2RoomLevelDeletedV1> {
        @Override
        public P2RoomLevelDeletedV1 getEvent() {
            return new P2RoomLevelDeletedV1();
        }
    }

    public abstract static class P2RoomLevelUpdatedV1Handler implements IEventHandler<P2RoomLevelUpdatedV1> {
        @Override
        public P2RoomLevelUpdatedV1 getEvent() {
            return new P2RoomLevelUpdatedV1();
        }
    }
}