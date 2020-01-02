package com.hy.powerplatform.oa_flow.metting.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/12/31.
 */

public class WillOpenList implements Serializable {

    /**
     * success : true
     * totalCounts : 1
     * result : [{"version":null,"orgId":null,"orgPath":null,"confId":142,"confTopic":"阿斯顿撒多","confProperty":"座谈会","importLevel":0,"feeBudget":0,"compere":"9546","recorder":"9547","attendUsers":"9354","status":1,"isEmail":1,"isMobile":0,"startTime":"2020-01-02 10:00","endTime":"2020-01-02 11:00","roomId":4,"roomName":"大会议室","roomLocation":"大会议室","confContent":"按发放的撒旦法发发发","compereName":"王少科","recorderName":"陈维","attendUsersName":"欧阳晓林","checkUserId":null,"checkName":"超级管理员","checkReason":"","createtime":"2020-01-02 09:02","sendtime":"2020-01-02 09:02","typeId":3,"attProbablyCount":"2","confInitiatorId":1,"readPersonIds":"9354","readPersonNames":"欧阳晓林","readCount":1,"approvedUserId":1,"approvedName":"超级管理员","approvedText":"部门负责人发起的会议直接跳过初审","confPrivilege":[{"version":null,"orgId":null,"orgPath":null,"privilegeId":1196,"userId":9547,"confId":142,"fullname":"陈维","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1197,"userId":9547,"confId":142,"fullname":"陈维","rights":3},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1195,"userId":9404,"confId":142,"fullname":"谭军","rights":2},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1193,"userId":9404,"confId":142,"fullname":"谭军","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1191,"userId":1,"confId":142,"fullname":"超级管理员","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1192,"userId":1,"confId":142,"fullname":"超级管理员","rights":2},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1198,"userId":9546,"confId":142,"fullname":"王少科","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1194,"userId":9354,"confId":142,"fullname":"欧阳晓林","rights":1}],"attachFiles":[]}]
     */

    private boolean success;
    private int totalCounts;
    private List<ResultBean> result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean implements Serializable {
        /**
         * version : null
         * orgId : null
         * orgPath : null
         * confId : 142
         * confTopic : 阿斯顿撒多
         * confProperty : 座谈会
         * importLevel : 0
         * feeBudget : 0.0
         * compere : 9546
         * recorder : 9547
         * attendUsers : 9354
         * status : 1
         * isEmail : 1
         * isMobile : 0
         * startTime : 2020-01-02 10:00
         * endTime : 2020-01-02 11:00
         * roomId : 4
         * roomName : 大会议室
         * roomLocation : 大会议室
         * confContent : 按发放的撒旦法发发发
         * compereName : 王少科
         * recorderName : 陈维
         * attendUsersName : 欧阳晓林
         * checkUserId : null
         * checkName : 超级管理员
         * checkReason :
         * createtime : 2020-01-02 09:02
         * sendtime : 2020-01-02 09:02
         * typeId : 3
         * attProbablyCount : 2
         * confInitiatorId : 1
         * readPersonIds : 9354
         * readPersonNames : 欧阳晓林
         * readCount : 1
         * approvedUserId : 1
         * approvedName : 超级管理员
         * approvedText : 部门负责人发起的会议直接跳过初审
         * confPrivilege : [{"version":null,"orgId":null,"orgPath":null,"privilegeId":1196,"userId":9547,"confId":142,"fullname":"陈维","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1197,"userId":9547,"confId":142,"fullname":"陈维","rights":3},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1195,"userId":9404,"confId":142,"fullname":"谭军","rights":2},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1193,"userId":9404,"confId":142,"fullname":"谭军","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1191,"userId":1,"confId":142,"fullname":"超级管理员","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1192,"userId":1,"confId":142,"fullname":"超级管理员","rights":2},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1198,"userId":9546,"confId":142,"fullname":"王少科","rights":1},{"version":null,"orgId":null,"orgPath":null,"privilegeId":1194,"userId":9354,"confId":142,"fullname":"欧阳晓林","rights":1}]
         * attachFiles : []
         */

        private Object version;
        private Object orgId;
        private Object orgPath;
        private int confId;
        private String confTopic;
        private String confProperty;
        private int importLevel;
        private double feeBudget;
        private String compere;
        private String recorder;
        private String attendUsers;
        private int status;
        private int isEmail;
        private int isMobile;
        private String startTime;
        private String endTime;
        private int roomId;
        private String roomName;
        private String roomLocation;
        private String confContent;
        private String compereName;
        private String recorderName;
        private String attendUsersName;
        private Object checkUserId;
        private String checkName;
        private String checkReason;
        private String createtime;
        private String sendtime;
        private int typeId;
        private String attProbablyCount;
        private int confInitiatorId;
        private String readPersonIds;
        private String readPersonNames;
        private int readCount;
        private int approvedUserId;
        private String approvedName;
        private String approvedText;
        private List<ConfPrivilegeBean> confPrivilege;
        private List<?> attachFiles;

        public Object getVersion() {
            return version;
        }

        public void setVersion(Object version) {
            this.version = version;
        }

        public Object getOrgId() {
            return orgId;
        }

        public void setOrgId(Object orgId) {
            this.orgId = orgId;
        }

        public Object getOrgPath() {
            return orgPath;
        }

        public void setOrgPath(Object orgPath) {
            this.orgPath = orgPath;
        }

        public int getConfId() {
            return confId;
        }

        public void setConfId(int confId) {
            this.confId = confId;
        }

        public String getConfTopic() {
            return confTopic;
        }

        public void setConfTopic(String confTopic) {
            this.confTopic = confTopic;
        }

        public String getConfProperty() {
            return confProperty;
        }

        public void setConfProperty(String confProperty) {
            this.confProperty = confProperty;
        }

        public int getImportLevel() {
            return importLevel;
        }

        public void setImportLevel(int importLevel) {
            this.importLevel = importLevel;
        }

        public double getFeeBudget() {
            return feeBudget;
        }

        public void setFeeBudget(double feeBudget) {
            this.feeBudget = feeBudget;
        }

        public String getCompere() {
            return compere;
        }

        public void setCompere(String compere) {
            this.compere = compere;
        }

        public String getRecorder() {
            return recorder;
        }

        public void setRecorder(String recorder) {
            this.recorder = recorder;
        }

        public String getAttendUsers() {
            return attendUsers;
        }

        public void setAttendUsers(String attendUsers) {
            this.attendUsers = attendUsers;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getIsEmail() {
            return isEmail;
        }

        public void setIsEmail(int isEmail) {
            this.isEmail = isEmail;
        }

        public int getIsMobile() {
            return isMobile;
        }

        public void setIsMobile(int isMobile) {
            this.isMobile = isMobile;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public int getRoomId() {
            return roomId;
        }

        public void setRoomId(int roomId) {
            this.roomId = roomId;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }

        public String getRoomLocation() {
            return roomLocation;
        }

        public void setRoomLocation(String roomLocation) {
            this.roomLocation = roomLocation;
        }

        public String getConfContent() {
            return confContent;
        }

        public void setConfContent(String confContent) {
            this.confContent = confContent;
        }

        public String getCompereName() {
            return compereName;
        }

        public void setCompereName(String compereName) {
            this.compereName = compereName;
        }

        public String getRecorderName() {
            return recorderName;
        }

        public void setRecorderName(String recorderName) {
            this.recorderName = recorderName;
        }

        public String getAttendUsersName() {
            return attendUsersName;
        }

        public void setAttendUsersName(String attendUsersName) {
            this.attendUsersName = attendUsersName;
        }

        public Object getCheckUserId() {
            return checkUserId;
        }

        public void setCheckUserId(Object checkUserId) {
            this.checkUserId = checkUserId;
        }

        public String getCheckName() {
            return checkName;
        }

        public void setCheckName(String checkName) {
            this.checkName = checkName;
        }

        public String getCheckReason() {
            return checkReason;
        }

        public void setCheckReason(String checkReason) {
            this.checkReason = checkReason;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getSendtime() {
            return sendtime;
        }

        public void setSendtime(String sendtime) {
            this.sendtime = sendtime;
        }

        public int getTypeId() {
            return typeId;
        }

        public void setTypeId(int typeId) {
            this.typeId = typeId;
        }

        public String getAttProbablyCount() {
            return attProbablyCount;
        }

        public void setAttProbablyCount(String attProbablyCount) {
            this.attProbablyCount = attProbablyCount;
        }

        public int getConfInitiatorId() {
            return confInitiatorId;
        }

        public void setConfInitiatorId(int confInitiatorId) {
            this.confInitiatorId = confInitiatorId;
        }

        public String getReadPersonIds() {
            return readPersonIds;
        }

        public void setReadPersonIds(String readPersonIds) {
            this.readPersonIds = readPersonIds;
        }

        public String getReadPersonNames() {
            return readPersonNames;
        }

        public void setReadPersonNames(String readPersonNames) {
            this.readPersonNames = readPersonNames;
        }

        public int getReadCount() {
            return readCount;
        }

        public void setReadCount(int readCount) {
            this.readCount = readCount;
        }

        public int getApprovedUserId() {
            return approvedUserId;
        }

        public void setApprovedUserId(int approvedUserId) {
            this.approvedUserId = approvedUserId;
        }

        public String getApprovedName() {
            return approvedName;
        }

        public void setApprovedName(String approvedName) {
            this.approvedName = approvedName;
        }

        public String getApprovedText() {
            return approvedText;
        }

        public void setApprovedText(String approvedText) {
            this.approvedText = approvedText;
        }

        public List<ConfPrivilegeBean> getConfPrivilege() {
            return confPrivilege;
        }

        public void setConfPrivilege(List<ConfPrivilegeBean> confPrivilege) {
            this.confPrivilege = confPrivilege;
        }

        public List<?> getAttachFiles() {
            return attachFiles;
        }

        public void setAttachFiles(List<?> attachFiles) {
            this.attachFiles = attachFiles;
        }

        public static class ConfPrivilegeBean implements Serializable {
            /**
             * version : null
             * orgId : null
             * orgPath : null
             * privilegeId : 1196
             * userId : 9547
             * confId : 142
             * fullname : 陈维
             * rights : 1
             */

            private Object version;
            private Object orgId;
            private Object orgPath;
            private int privilegeId;
            private int userId;
            private int confId;
            private String fullname;
            private int rights;

            public Object getVersion() {
                return version;
            }

            public void setVersion(Object version) {
                this.version = version;
            }

            public Object getOrgId() {
                return orgId;
            }

            public void setOrgId(Object orgId) {
                this.orgId = orgId;
            }

            public Object getOrgPath() {
                return orgPath;
            }

            public void setOrgPath(Object orgPath) {
                this.orgPath = orgPath;
            }

            public int getPrivilegeId() {
                return privilegeId;
            }

            public void setPrivilegeId(int privilegeId) {
                this.privilegeId = privilegeId;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getConfId() {
                return confId;
            }

            public void setConfId(int confId) {
                this.confId = confId;
            }

            public String getFullname() {
                return fullname;
            }

            public void setFullname(String fullname) {
                this.fullname = fullname;
            }

            public int getRights() {
                return rights;
            }

            public void setRights(int rights) {
                this.rights = rights;
            }
        }
    }
}
