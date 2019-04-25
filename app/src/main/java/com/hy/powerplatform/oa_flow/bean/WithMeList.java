package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/3/11.
 */

public class WithMeList implements Serializable {

    /**
     * success : true
     * totalCounts : 51
     * result : [{"runId":"51310","subject":"付款程序审批单_李春华","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51297","subject":"付款程序审批单_钟婷","createtime":"钟婷","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51318","subject":"报修项目登记表new20190118-093609","createtime":"施鹏","defId":"20307","piId":"","runStatus":"2","formTitle":"报修项目登记表","formDefId":"10105"},{"runId":"51366","subject":"驾驶员入职流程表20190125-105118","createtime":"李建萍","defId":"10105","piId":"","runStatus":"2","formTitle":"驾驶员入职流程表news","formDefId":"10117"},{"runId":"51305","subject":"付款程序审批单_苏晚章","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51306","subject":"付款程序审批单_易睿","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51307","subject":"付款程序审批单_李春华","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51309","subject":"付款程序审批单_易睿","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51321","subject":"报修项目登记表new20190118-094743","createtime":"付伟博","defId":"20307","piId":"","runStatus":"2","formTitle":"报修项目登记表","formDefId":"10105"},{"runId":"51378","subject":"员工请假流程_乐朋","createtime":"付伟博","defId":"10135","piId":"","runStatus":"2","formTitle":"宜春公交集团请假表单","formDefId":"83"},{"runId":"51376","subject":"员工请假流程_魏福健","createtime":"付伟博","defId":"10135","piId":"","runStatus":"2","formTitle":"宜春公交集团请假表单","formDefId":"83"},{"runId":"51382","subject":"驾驶员入职流程表20190129-150932","createtime":"林婕","defId":"10105","piId":"","runStatus":"2","formTitle":"驾驶员入职流程表news","formDefId":"10117"},{"runId":"51313","subject":"合同签订审批流程20190118-085617","createtime":"漆明","defId":"10165","piId":"","runStatus":"2","formTitle":"合同签订审批单","formDefId":"66"},{"runId":"51150","subject":"付款程序审批单_付伟博","createtime":"付伟博","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51025","subject":"付款程序审批单_付伟博","createtime":"付伟博","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51371","subject":"付款程序审批单_黄外香","createtime":"黄外香","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51338","subject":"付款程序审批单_黄祖能","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51340","subject":"付款程序审批单_黄祖能","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51337","subject":"付款程序审批单_易睿","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"},{"runId":"51336","subject":"付款程序审批单_田乐","createtime":"田乐","defId":"10151","piId":"","runStatus":"2","formTitle":"付款程序审批单","formDefId":"10078"}]
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
         * runId : 51310
         * subject : 付款程序审批单_李春华
         * createtime : 田乐
         * defId : 10151
         * piId :
         * runStatus : 2
         * formTitle : 付款程序审批单
         * formDefId : 10078
         */

        private String runId;
        private String subject;
        private String createtime;
        private String defId;
        private String piId;
        private String runStatus;
        private String formTitle;
        private String formDefId;

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

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getDefId() {
            return defId;
        }

        public void setDefId(String defId) {
            this.defId = defId;
        }

        public String getPiId() {
            return piId;
        }

        public void setPiId(String piId) {
            this.piId = piId;
        }

        public String getRunStatus() {
            return runStatus;
        }

        public void setRunStatus(String runStatus) {
            this.runStatus = runStatus;
        }

        public String getFormTitle() {
            return formTitle;
        }

        public void setFormTitle(String formTitle) {
            this.formTitle = formTitle;
        }

        public String getFormDefId() {
            return formDefId;
        }

        public void setFormDefId(String formDefId) {
            this.formDefId = formDefId;
        }
    }
}
