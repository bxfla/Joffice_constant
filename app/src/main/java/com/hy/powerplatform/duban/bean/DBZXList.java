package com.hy.powerplatform.duban.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/12/4.
 */

public class DBZXList implements Serializable {

    /**
     * success : true
     * totalCounts : 4
     * result : [{"identUrge":null,"operId":177,"createTime":"2019-12-03 17:38:25","taskType":"公司任务","createrName":"超级管理员","operTime":null,"creater":"1","updateType":null,"taskName":"测试6","contactsName":"超级管理员","fileIds":null,"supervisorNames":"唐根六,王少云,晏慧锋,超级管理员","operatorNames":"敖军,毕玉","operatorIds":"40694,40351","planFinishTime":null,"workId":156,"approverName":"超级管理员","submitFileIds":null,"operStatus":1,"publishTime":"2019-12-03 17:38:45","approver":1,"operator":40351,"supervisorIds":"41059,41058,41071,888888888","num":null,"taskStatus":3,"operatorName":"毕玉","taskContext":"测试督办6","contactsId":"888888888","approveTime":"2019-12-03 17:38:45"},{"identUrge":null,"operId":175,"createTime":"2019-12-03 17:37:11","taskType":"公司任务","createrName":"超级管理员","operTime":null,"creater":"1","updateType":null,"taskName":"测试5","contactsName":"超级管理员","fileIds":null,"supervisorNames":"唐根六,王少云,晏慧锋,超级管理员","operatorNames":"敖军,毕玉","operatorIds":"40694,40351","planFinishTime":null,"workId":155,"approverName":"超级管理员","submitFileIds":null,"operStatus":1,"publishTime":"2019-12-03 17:38:01","approver":1,"operator":40351,"supervisorIds":"41059,41058,41071,888888888","num":null,"taskStatus":3,"operatorName":"毕玉","taskContext":"测试督办5","contactsId":"888888888","approveTime":"2019-12-03 17:38:01"},{"identUrge":null,"operId":173,"createTime":"2019-12-03 17:33:13","taskType":"公司任务","createrName":"超级管理员","operTime":null,"creater":"1","updateType":null,"taskName":"测试4","contactsName":"超级管理员","fileIds":null,"supervisorNames":"唐根六,王少云,晏慧锋,超级管理员","operatorNames":"敖军,毕玉","operatorIds":"40694,40351","planFinishTime":null,"workId":154,"approverName":"超级管理员","submitFileIds":null,"operStatus":1,"publishTime":"2019-12-03 17:34:47","approver":1,"operator":40351,"supervisorIds":"41059,41058,41071,888888888","num":null,"taskStatus":3,"operatorName":"毕玉","taskContext":"测试督办4","contactsId":"888888888","approveTime":"2019-12-03 17:34:47"},{"identUrge":null,"operId":171,"createTime":"2019-12-03 16:08:15","taskType":"公司任务","createrName":"超级管理员","operTime":null,"creater":"1","updateType":null,"taskName":"测试3","contactsName":"超级管理员","fileIds":null,"supervisorNames":"唐根六,王少云,晏慧锋,超级管理员","operatorNames":"敖军,毕玉","operatorIds":"40694,40351","planFinishTime":null,"workId":152,"approverName":"超级管理员","submitFileIds":null,"operStatus":1,"publishTime":"2019-12-03 16:08:17","approver":1,"operator":40351,"supervisorIds":"41059,41058,41071,888888888","num":null,"taskStatus":3,"operatorName":"毕玉","taskContext":"测试督办3","contactsId":"888888888","approveTime":"2019-12-03 16:08:17"}]
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

    public static class ResultBean implements Serializable{
        /**
         * identUrge : null
         * operId : 177
         * createTime : 2019-12-03 17:38:25
         * taskType : 公司任务
         * createrName : 超级管理员
         * operTime : null
         * creater : 1
         * updateType : null
         * taskName : 测试6
         * contactsName : 超级管理员
         * fileIds : null
         * supervisorNames : 唐根六,王少云,晏慧锋,超级管理员
         * operatorNames : 敖军,毕玉
         * operatorIds : 40694,40351
         * planFinishTime : null
         * workId : 156
         * approverName : 超级管理员
         * submitFileIds : null
         * operStatus : 1
         * publishTime : 2019-12-03 17:38:45
         * approver : 1
         * operator : 40351
         * supervisorIds : 41059,41058,41071,888888888
         * num : null
         * taskStatus : 3
         * operatorName : 毕玉
         * taskContext : 测试督办6
         * contactsId : 888888888
         * approveTime : 2019-12-03 17:38:45
         */

        private Object identUrge;
        private int operId;
        private String createTime;
        private String taskType;
        private String createrName;
        private Object operTime;
        private String creater;
        private String updateType;
        private String taskName;
        private String contactsName;
        private Object fileIds;
        private String supervisorNames;
        private String operatorNames;
        private String operatorIds;
        private String planFinishTime;
        private int workId;
        private String approverName;
        private Object submitFileIds;
        private int operStatus;
        private String publishTime;
        private int approver;
        private int operator;
        private String supervisorIds;
        private Object num;
        private int taskStatus;
        private String operatorName;
        private String taskContext;
        private String contactsId;
        private String approveTime;

        public Object getIdentUrge() {
            return identUrge;
        }

        public void setIdentUrge(Object identUrge) {
            this.identUrge = identUrge;
        }

        public int getOperId() {
            return operId;
        }

        public void setOperId(int operId) {
            this.operId = operId;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getTaskType() {
            return taskType;
        }

        public void setTaskType(String taskType) {
            this.taskType = taskType;
        }

        public String getCreaterName() {
            return createrName;
        }

        public void setCreaterName(String createrName) {
            this.createrName = createrName;
        }

        public Object getOperTime() {
            return operTime;
        }

        public void setOperTime(Object operTime) {
            this.operTime = operTime;
        }

        public String getCreater() {
            return creater;
        }

        public void setCreater(String creater) {
            this.creater = creater;
        }

        public String getUpdateType() {
            return updateType;
        }

        public void setUpdateType(String updateType) {
            this.updateType = updateType;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getContactsName() {
            return contactsName;
        }

        public void setContactsName(String contactsName) {
            this.contactsName = contactsName;
        }

        public Object getFileIds() {
            return fileIds;
        }

        public void setFileIds(Object fileIds) {
            this.fileIds = fileIds;
        }

        public String getSupervisorNames() {
            return supervisorNames;
        }

        public void setSupervisorNames(String supervisorNames) {
            this.supervisorNames = supervisorNames;
        }

        public String getOperatorNames() {
            return operatorNames;
        }

        public void setOperatorNames(String operatorNames) {
            this.operatorNames = operatorNames;
        }

        public String getOperatorIds() {
            return operatorIds;
        }

        public void setOperatorIds(String operatorIds) {
            this.operatorIds = operatorIds;
        }

        public String getPlanFinishTime() {
            return planFinishTime;
        }

        public void setPlanFinishTime(String planFinishTime) {
            this.planFinishTime = planFinishTime;
        }

        public int getWorkId() {
            return workId;
        }

        public void setWorkId(int workId) {
            this.workId = workId;
        }

        public String getApproverName() {
            return approverName;
        }

        public void setApproverName(String approverName) {
            this.approverName = approverName;
        }

        public Object getSubmitFileIds() {
            return submitFileIds;
        }

        public void setSubmitFileIds(Object submitFileIds) {
            this.submitFileIds = submitFileIds;
        }

        public int getOperStatus() {
            return operStatus;
        }

        public void setOperStatus(int operStatus) {
            this.operStatus = operStatus;
        }

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public int getApprover() {
            return approver;
        }

        public void setApprover(int approver) {
            this.approver = approver;
        }

        public int getOperator() {
            return operator;
        }

        public void setOperator(int operator) {
            this.operator = operator;
        }

        public String getSupervisorIds() {
            return supervisorIds;
        }

        public void setSupervisorIds(String supervisorIds) {
            this.supervisorIds = supervisorIds;
        }

        public Object getNum() {
            return num;
        }

        public void setNum(Object num) {
            this.num = num;
        }

        public int getTaskStatus() {
            return taskStatus;
        }

        public void setTaskStatus(int taskStatus) {
            this.taskStatus = taskStatus;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getTaskContext() {
            return taskContext;
        }

        public void setTaskContext(String taskContext) {
            this.taskContext = taskContext;
        }

        public String getContactsId() {
            return contactsId;
        }

        public void setContactsId(String contactsId) {
            this.contactsId = contactsId;
        }

        public String getApproveTime() {
            return approveTime;
        }

        public void setApproveTime(String approveTime) {
            this.approveTime = approveTime;
        }
    }
}
