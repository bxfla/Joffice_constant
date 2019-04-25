package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/1/24.
 */

public class MyLeave implements Serializable {

    /**
     * success : true
     * totalCounts : 3
     * result : [{"version":null,"orgId":null,"orgPath":null,"runId":51281,"subject":"员工请假流程_超级管理员","creator":"超级管理员","assignee":null,"createtime":"2019-01-23 19:33:43","isMany":null,"showData":null,"piId":null,"pdId":"YGQJLC_-6","piDbid":7780001,"processName":"员工请假流程","busDesc":null,"entityName":"WF_YuanGongQingJiaDan","entityId":"126","formDefId":83,"runStatus":2,"appUser":null,"defId":"10135","userId":null,"defHtml":null},{"version":null,"orgId":null,"orgPath":null,"runId":51276,"subject":"员工请假流程_超级管理员","creator":"超级管理员","assignee":null,"createtime":"2019-01-23 14:25:32","isMany":null,"showData":null,"piId":null,"pdId":"YGQJLC_-6","piDbid":7740001,"processName":"员工请假流程","busDesc":null,"entityName":"WF_YuanGongQingJiaDan","entityId":"124","formDefId":83,"runStatus":2,"appUser":null,"defId":"10135","userId":null,"defHtml":null},{"version":null,"orgId":null,"orgPath":null,"runId":51235,"subject":"员工请假流程_超级管理员","creator":"超级管理员","assignee":null,"createtime":"2019-01-16 17:15:02","isMany":null,"showData":null,"piId":null,"pdId":"YGQJLC_-6","piDbid":7510001,"processName":"员工请假流程","busDesc":null,"entityName":"WF_YuanGongQingJiaDan","entityId":"90","formDefId":83,"runStatus":2,"appUser":null,"defId":"10135","userId":null,"defHtml":null}]
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
         * version : null
         * orgId : null
         * orgPath : null
         * runId : 51281
         * subject : 员工请假流程_超级管理员
         * creator : 超级管理员
         * assignee : null
         * createtime : 2019-01-23 19:33:43
         * isMany : null
         * showData : null
         * piId : null
         * pdId : YGQJLC_-6
         * piDbid : 7780001
         * processName : 员工请假流程
         * busDesc : null
         * entityName : WF_YuanGongQingJiaDan
         * entityId : 126
         * formDefId : 83
         * runStatus : 2
         * appUser : null
         * defId : 10135
         * userId : null
         * defHtml : null
         */

        private Object version;
        private Object orgId;
        private Object orgPath;
        private String runId;
        private String subject;
        private String creator;
        private Object assignee;
        private String createtime;
        private Object isMany;
        private Object showData;
        private Object piId;
        private String pdId;
        private int piDbid;
        private String processName;
        private Object busDesc;
        private String entityName;
        private String entityId;
        private String formDefId;
        private int runStatus;
        private Object appUser;
        private String defId;
        private Object userId;
        private Object defHtml;

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

        public String getRunId() {
            return runId;
        }

        public void setRunId(String runId) {
            this.runId = runId;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public Object getAssignee() {
            return assignee;
        }

        public void setAssignee(Object assignee) {
            this.assignee = assignee;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public Object getIsMany() {
            return isMany;
        }

        public void setIsMany(Object isMany) {
            this.isMany = isMany;
        }

        public Object getShowData() {
            return showData;
        }

        public void setShowData(Object showData) {
            this.showData = showData;
        }

        public Object getPiId() {
            return piId;
        }

        public void setPiId(Object piId) {
            this.piId = piId;
        }

        public String getPdId() {
            return pdId;
        }

        public void setPdId(String pdId) {
            this.pdId = pdId;
        }

        public int getPiDbid() {
            return piDbid;
        }

        public void setPiDbid(int piDbid) {
            this.piDbid = piDbid;
        }

        public String getProcessName() {
            return processName;
        }

        public void setProcessName(String processName) {
            this.processName = processName;
        }

        public Object getBusDesc() {
            return busDesc;
        }

        public void setBusDesc(Object busDesc) {
            this.busDesc = busDesc;
        }

        public String getEntityName() {
            return entityName;
        }

        public void setEntityName(String entityName) {
            this.entityName = entityName;
        }

        public String getEntityId() {
            return entityId;
        }

        public void setEntityId(String entityId) {
            this.entityId = entityId;
        }

        public String getFormDefId() {
            return formDefId;
        }

        public void setFormDefId(String formDefId) {
            this.formDefId = formDefId;
        }

        public int getRunStatus() {
            return runStatus;
        }

        public void setRunStatus(int runStatus) {
            this.runStatus = runStatus;
        }

        public Object getAppUser() {
            return appUser;
        }

        public void setAppUser(Object appUser) {
            this.appUser = appUser;
        }

        public String getDefId() {
            return defId;
        }

        public void setDefId(String defId) {
            this.defId = defId;
        }

        public Object getUserId() {
            return userId;
        }

        public void setUserId(Object userId) {
            this.userId = userId;
        }

        public Object getDefHtml() {
            return defHtml;
        }

        public void setDefHtml(Object defHtml) {
            this.defHtml = defHtml;
        }
    }
}
