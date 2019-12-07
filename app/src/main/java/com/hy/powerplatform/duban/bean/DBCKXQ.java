package com.hy.powerplatform.duban.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/12/6.
 */

public class DBCKXQ implements Serializable {

    /**
     * success : true
     * data : {"version":null,"orgId":null,"orgPath":null,"operId":178,"workId":157,"operator":40351,"operatorName":"毕玉","operStatus":2,"operTime":"2019-12-04","submitTitle":null,"submitContext":null,"fileIds":null,"publishTime":"2019-12-03","operLog":null,"memo":null,"updateType":null,"num":null,"statusName":null,"statusType":null,"annotation":null,"identUrge":null,"judgeSMSzxr":null,"judgeSMSdbr":null,"superWorkTask":{"version":null,"orgId":null,"orgPath":null,"workId":157,"taskType":"公司任务","taskName":"啊啊啊","taskContext":"咯咯咯咯咯","planFinishTime":null,"fileIds":null,"supervisorIds":"41059,41058,41071,888888888","supervisorNames":"唐根六,王少云,晏慧锋,超级管理员","operatorIds":"40351,41097","operatorNames":"毕玉,毕芳琴","taskStatus":3,"creater":"1","createTime":"2019-12-03","updateTime":"2019-12-03","approver":1,"approveTime":"2019-12-03","fileNames":null,"createrName":"超级管理员","approverName":"超级管理员","statusName":null,"contactsName":"超级管理员","contactsId":"888888888","superWorkTaskFiles":[]},"superTaskOperFiles":[]}
     */

    private boolean success;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        /**
         * version : null
         * orgId : null
         * orgPath : null
         * operId : 178
         * workId : 157
         * operator : 40351
         * operatorName : 毕玉
         * operStatus : 2
         * operTime : 2019-12-04
         * submitTitle : null
         * submitContext : null
         * fileIds : null
         * publishTime : 2019-12-03
         * operLog : null
         * memo : null
         * updateType : null
         * num : null
         * statusName : null
         * statusType : null
         * annotation : null
         * identUrge : null
         * judgeSMSzxr : null
         * judgeSMSdbr : null
         * superWorkTask : {"version":null,"orgId":null,"orgPath":null,"workId":157,"taskType":"公司任务","taskName":"啊啊啊","taskContext":"咯咯咯咯咯","planFinishTime":null,"fileIds":null,"supervisorIds":"41059,41058,41071,888888888","supervisorNames":"唐根六,王少云,晏慧锋,超级管理员","operatorIds":"40351,41097","operatorNames":"毕玉,毕芳琴","taskStatus":3,"creater":"1","createTime":"2019-12-03","updateTime":"2019-12-03","approver":1,"approveTime":"2019-12-03","fileNames":null,"createrName":"超级管理员","approverName":"超级管理员","statusName":null,"contactsName":"超级管理员","contactsId":"888888888","superWorkTaskFiles":[]}
         * superTaskOperFiles : []
         */

        private String version;
        private String orgId;
        private String orgPath;
        private int operId;
        private int workId;
        private int operator;
        private String operatorName;
        private int operStatus;
        private String operTime;
        private String submitTitle;
        private String submitContext;
        private String fileIds;
        private String publishTime;
        private String operLog;
        private String memo;
        private String updateType;
        private String num;
        private String statusName;
        private String statusType;
        private String annotation;
        private String identUrge;
        private String judgeSMSzxr;
        private String judgeSMSdbr;
        private SuperWorkTaskBean superWorkTask;
        private List<?> superTaskOperFiles;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getOrgId() {
            return orgId;
        }

        public void setOrgId(String orgId) {
            this.orgId = orgId;
        }

        public String getOrgPath() {
            return orgPath;
        }

        public void setOrgPath(String orgPath) {
            this.orgPath = orgPath;
        }

        public int getOperId() {
            return operId;
        }

        public void setOperId(int operId) {
            this.operId = operId;
        }

        public int getWorkId() {
            return workId;
        }

        public void setWorkId(int workId) {
            this.workId = workId;
        }

        public int getOperator() {
            return operator;
        }

        public void setOperator(int operator) {
            this.operator = operator;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public int getOperStatus() {
            return operStatus;
        }

        public void setOperStatus(int operStatus) {
            this.operStatus = operStatus;
        }

        public String getOperTime() {
            return operTime;
        }

        public void setOperTime(String operTime) {
            this.operTime = operTime;
        }

        public String getSubmitTitle() {
            return submitTitle;
        }

        public void setSubmitTitle(String submitTitle) {
            this.submitTitle = submitTitle;
        }

        public String getSubmitContext() {
            return submitContext;
        }

        public void setSubmitContext(String submitContext) {
            this.submitContext = submitContext;
        }

        public String getFileIds() {
            return fileIds;
        }

        public void setFileIds(String fileIds) {
            this.fileIds = fileIds;
        }

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public String getOperLog() {
            return operLog;
        }

        public void setOperLog(String operLog) {
            this.operLog = operLog;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getUpdateType() {
            return updateType;
        }

        public void setUpdateType(String updateType) {
            this.updateType = updateType;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getStatusName() {
            return statusName;
        }

        public void setStatusName(String statusName) {
            this.statusName = statusName;
        }

        public String getStatusType() {
            return statusType;
        }

        public void setStatusType(String statusType) {
            this.statusType = statusType;
        }

        public String getAnnotation() {
            return annotation;
        }

        public void setAnnotation(String annotation) {
            this.annotation = annotation;
        }

        public String getIdentUrge() {
            return identUrge;
        }

        public void setIdentUrge(String identUrge) {
            this.identUrge = identUrge;
        }

        public String getJudgeSMSzxr() {
            return judgeSMSzxr;
        }

        public void setJudgeSMSzxr(String judgeSMSzxr) {
            this.judgeSMSzxr = judgeSMSzxr;
        }

        public String getJudgeSMSdbr() {
            return judgeSMSdbr;
        }

        public void setJudgeSMSdbr(String judgeSMSdbr) {
            this.judgeSMSdbr = judgeSMSdbr;
        }

        public SuperWorkTaskBean getSuperWorkTask() {
            return superWorkTask;
        }

        public void setSuperWorkTask(SuperWorkTaskBean superWorkTask) {
            this.superWorkTask = superWorkTask;
        }

        public List<?> getSuperTaskOperFiles() {
            return superTaskOperFiles;
        }

        public void setSuperTaskOperFiles(List<?> superTaskOperFiles) {
            this.superTaskOperFiles = superTaskOperFiles;
        }

        public static class SuperWorkTaskBean {
            /**
             * version : null
             * orgId : null
             * orgPath : null
             * workId : 157
             * taskType : 公司任务
             * taskName : 啊啊啊
             * taskContext : 咯咯咯咯咯
             * planFinishTime : null
             * fileIds : null
             * supervisorIds : 41059,41058,41071,888888888
             * supervisorNames : 唐根六,王少云,晏慧锋,超级管理员
             * operatorIds : 40351,41097
             * operatorNames : 毕玉,毕芳琴
             * taskStatus : 3
             * creater : 1
             * createTime : 2019-12-03
             * updateTime : 2019-12-03
             * approver : 1
             * approveTime : 2019-12-03
             * fileNames : null
             * createrName : 超级管理员
             * approverName : 超级管理员
             * statusName : null
             * contactsName : 超级管理员
             * contactsId : 888888888
             * superWorkTaskFiles : []
             */

            private String version;
            private String orgId;
            private String orgPath;
            private int workId;
            private String taskType;
            private String taskName;
            private String taskContext;
            private String planFinishTime;
            private String fileIds;
            private String supervisorIds;
            private String supervisorNames;
            private String operatorIds;
            private String operatorNames;
            private int taskStatus;
            private String creater;
            private String createTime;
            private String updateTime;
            private int approver;
            private String approveTime;
            private String fileNames;
            private String createrName;
            private String approverName;
            private String statusName;
            private String contactsName;
            private String contactsId;
            private List<?> superWorkTaskFiles;

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public String getOrgId() {
                return orgId;
            }

            public void setOrgId(String orgId) {
                this.orgId = orgId;
            }

            public String getOrgPath() {
                return orgPath;
            }

            public void setOrgPath(String orgPath) {
                this.orgPath = orgPath;
            }

            public int getWorkId() {
                return workId;
            }

            public void setWorkId(int workId) {
                this.workId = workId;
            }

            public String getTaskType() {
                return taskType;
            }

            public void setTaskType(String taskType) {
                this.taskType = taskType;
            }

            public String getTaskName() {
                return taskName;
            }

            public void setTaskName(String taskName) {
                this.taskName = taskName;
            }

            public String getTaskContext() {
                return taskContext;
            }

            public void setTaskContext(String taskContext) {
                this.taskContext = taskContext;
            }

            public String getPlanFinishTime() {
                return planFinishTime;
            }

            public void setPlanFinishTime(String planFinishTime) {
                this.planFinishTime = planFinishTime;
            }

            public String getFileIds() {
                return fileIds;
            }

            public void setFileIds(String fileIds) {
                this.fileIds = fileIds;
            }

            public String getSupervisorIds() {
                return supervisorIds;
            }

            public void setSupervisorIds(String supervisorIds) {
                this.supervisorIds = supervisorIds;
            }

            public String getSupervisorNames() {
                return supervisorNames;
            }

            public void setSupervisorNames(String supervisorNames) {
                this.supervisorNames = supervisorNames;
            }

            public String getOperatorIds() {
                return operatorIds;
            }

            public void setOperatorIds(String operatorIds) {
                this.operatorIds = operatorIds;
            }

            public String getOperatorNames() {
                return operatorNames;
            }

            public void setOperatorNames(String operatorNames) {
                this.operatorNames = operatorNames;
            }

            public int getTaskStatus() {
                return taskStatus;
            }

            public void setTaskStatus(int taskStatus) {
                this.taskStatus = taskStatus;
            }

            public String getCreater() {
                return creater;
            }

            public void setCreater(String creater) {
                this.creater = creater;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public int getApprover() {
                return approver;
            }

            public void setApprover(int approver) {
                this.approver = approver;
            }

            public String getApproveTime() {
                return approveTime;
            }

            public void setApproveTime(String approveTime) {
                this.approveTime = approveTime;
            }

            public String getFileNames() {
                return fileNames;
            }

            public void setFileNames(String fileNames) {
                this.fileNames = fileNames;
            }

            public String getCreaterName() {
                return createrName;
            }

            public void setCreaterName(String createrName) {
                this.createrName = createrName;
            }

            public String getApproverName() {
                return approverName;
            }

            public void setApproverName(String approverName) {
                this.approverName = approverName;
            }

            public String getStatusName() {
                return statusName;
            }

            public void setStatusName(String statusName) {
                this.statusName = statusName;
            }

            public String getContactsName() {
                return contactsName;
            }

            public void setContactsName(String contactsName) {
                this.contactsName = contactsName;
            }

            public String getContactsId() {
                return contactsId;
            }

            public void setContactsId(String contactsId) {
                this.contactsId = contactsId;
            }

            public List<?> getSuperWorkTaskFiles() {
                return superWorkTaskFiles;
            }

            public void setSuperWorkTaskFiles(List<?> superWorkTaskFiles) {
                this.superWorkTaskFiles = superWorkTaskFiles;
            }
        }
    }
}
