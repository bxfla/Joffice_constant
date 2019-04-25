package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/3/6.
 */

public class MyWillDo implements Serializable {

    /**
     * success : true
     * totalCounts : 1
     * result : [{"taskName":"付款程序审批单_刘望--部门负责人","activityName":"部门负责人","assignee":"欧阳翰","createTime":"2019-3-6 9:21:26","executionId":"FKCXSPS_.8150054","isDue":0,"piId":"FKCXSPS_.8150054","taskId":8150076,"formDefId":10078,"state":"open","isMultipleTask":0,"candidateUsers":"","candidateRoles":""}]
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

    public static class ResultBean {
        /**
         * taskName : 付款程序审批单_刘望--部门负责人
         * activityName : 部门负责人
         * assignee : 欧阳翰
         * createTime : 2019-3-6 9:21:26
         * executionId : FKCXSPS_.8150054
         * isDue : 0
         * piId : FKCXSPS_.8150054
         * taskId : 8150076
         * formDefId : 10078
         * state : open
         * isMultipleTask : 0
         * candidateUsers :
         * candidateRoles :
         */

        private String taskName;
        private String activityName;
        private String assignee;
        private String createTime;
        private String executionId;
        private String isDue;
        private String piId;
        private String taskId;
        private String formDefId;
        private String state;
        private String isMultipleTask;
        private String candidateUsers;
        private String candidateRoles;

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getActivityName() {
            return activityName;
        }

        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        public String getAssignee() {
            return assignee;
        }

        public void setAssignee(String assignee) {
            this.assignee = assignee;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getExecutionId() {
            return executionId;
        }

        public void setExecutionId(String executionId) {
            this.executionId = executionId;
        }

        public String getIsDue() {
            return isDue;
        }

        public void setIsDue(String isDue) {
            this.isDue = isDue;
        }

        public String getPiId() {
            return piId;
        }

        public void setPiId(String piId) {
            this.piId = piId;
        }

        public String getTaskId() {
            return taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public String getFormDefId() {
            return formDefId;
        }

        public void setFormDefId(String formDefId) {
            this.formDefId = formDefId;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getIsMultipleTask() {
            return isMultipleTask;
        }

        public void setIsMultipleTask(String isMultipleTask) {
            this.isMultipleTask = isMultipleTask;
        }

        public String getCandidateUsers() {
            return candidateUsers;
        }

        public void setCandidateUsers(String candidateUsers) {
            this.candidateUsers = candidateUsers;
        }

        public String getCandidateRoles() {
            return candidateRoles;
        }

        public void setCandidateRoles(String candidateRoles) {
            this.candidateRoles = candidateRoles;
        }
    }
}
