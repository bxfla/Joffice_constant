package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/1/29.
 */

public class FlowContractSign implements Serializable {


    /**
     * success : true
     * taskId : 8060128
     * pkValue : mainId
     * formRights : {'csbmyj':'1','cwsjbyj':'2','jcbmyj':'1','fgldyj':'1','htmc':'1','cbbm':'1','cbbmfzr':'1','zjlyj':'1','xiangguanfujian':'1','spsj':'1','jbqk':'1','jgbmyj':'1','flgwyj':'1'}
     * mainform : [{"jcbmyj":"","jgbmyj":"","runId":51509,"$type$":"WF_htqdspd","fgldyj":"","flgwyj":"","htmc":"测试","cbbm":"宜春公交集团有限公司","jbqk":"情况","xiangguanfujian":"","mainId":111,"csbmyj":"","cwsjbyj":"","zjlyj":"","cbbmfzr":"张敏","spsj":"2019-02-25"}]
     * formDefId : 66
     * preTaskName :
     * isSignTask : false
     * trans : [{"destType":"task","destination":"监管部门","name":"to 监管部门","source":"财务审计部"}]
     */

    private boolean success;
    private String taskId;
    private String pkValue;
    private String formRights;
    private String formDefId;
    private String preTaskName;
    private boolean isSignTask;
    private List<MainformBean> mainform;
    private List<TransBean> trans;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getPkValue() {
        return pkValue;
    }

    public void setPkValue(String pkValue) {
        this.pkValue = pkValue;
    }

    public String getFormRights() {
        return formRights;
    }

    public void setFormRights(String formRights) {
        this.formRights = formRights;
    }

    public String getFormDefId() {
        return formDefId;
    }

    public void setFormDefId(String formDefId) {
        this.formDefId = formDefId;
    }

    public String getPreTaskName() {
        return preTaskName;
    }

    public void setPreTaskName(String preTaskName) {
        this.preTaskName = preTaskName;
    }

    public boolean isIsSignTask() {
        return isSignTask;
    }

    public void setIsSignTask(boolean isSignTask) {
        this.isSignTask = isSignTask;
    }

    public List<MainformBean> getMainform() {
        return mainform;
    }

    public void setMainform(List<MainformBean> mainform) {
        this.mainform = mainform;
    }

    public List<TransBean> getTrans() {
        return trans;
    }

    public void setTrans(List<TransBean> trans) {
        this.trans = trans;
    }

    public static class MainformBean {
        /**
         * jcbmyj :
         * jgbmyj :
         * runId : 51509
         * $type$ : WF_htqdspd
         * fgldyj :
         * flgwyj :
         * htmc : 测试
         * cbbm : 宜春公交集团有限公司
         * jbqk : 情况
         * xiangguanfujian :
         * mainId : 111
         * csbmyj :
         * cwsjbyj :
         * zjlyj :
         * cbbmfzr : 张敏
         * spsj : 2019-02-25
         */

        private String jcbmyj;
        private String jgbmyj;
        private String runId;
        private String $type$;
        private String fgldyj;
        private String flgwyj;
        private String htmc;
        private String cbbm;
        private String jbqk;
        private String xiangguanfujian;
        private int mainId;
        private String csbmyj;
        private String cwsjbyj;
        private String zjlyj;
        private String cbbmfzr;
        private String spsj;

        public String getJcbmyj() {
            return jcbmyj;
        }

        public void setJcbmyj(String jcbmyj) {
            this.jcbmyj = jcbmyj;
        }

        public String getJgbmyj() {
            return jgbmyj;
        }

        public void setJgbmyj(String jgbmyj) {
            this.jgbmyj = jgbmyj;
        }

        public String getRunId() {
            return runId;
        }

        public void setRunId(String runId) {
            this.runId = runId;
        }

        public String get$type$() {
            return $type$;
        }

        public void set$type$(String $type$) {
            this.$type$ = $type$;
        }

        public String getFgldyj() {
            return fgldyj;
        }

        public void setFgldyj(String fgldyj) {
            this.fgldyj = fgldyj;
        }

        public String getFlgwyj() {
            return flgwyj;
        }

        public void setFlgwyj(String flgwyj) {
            this.flgwyj = flgwyj;
        }

        public String getHtmc() {
            return htmc;
        }

        public void setHtmc(String htmc) {
            this.htmc = htmc;
        }

        public String getCbbm() {
            return cbbm;
        }

        public void setCbbm(String cbbm) {
            this.cbbm = cbbm;
        }

        public String getJbqk() {
            return jbqk;
        }

        public void setJbqk(String jbqk) {
            this.jbqk = jbqk;
        }

        public String getXiangguanfujian() {
            return xiangguanfujian;
        }

        public void setXiangguanfujian(String xiangguanfujian) {
            this.xiangguanfujian = xiangguanfujian;
        }

        public int getMainId() {
            return mainId;
        }

        public void setMainId(int mainId) {
            this.mainId = mainId;
        }

        public String getCsbmyj() {
            return csbmyj;
        }

        public void setCsbmyj(String csbmyj) {
            this.csbmyj = csbmyj;
        }

        public String getCwsjbyj() {
            return cwsjbyj;
        }

        public void setCwsjbyj(String cwsjbyj) {
            this.cwsjbyj = cwsjbyj;
        }

        public String getZjlyj() {
            return zjlyj;
        }

        public void setZjlyj(String zjlyj) {
            this.zjlyj = zjlyj;
        }

        public String getCbbmfzr() {
            return cbbmfzr;
        }

        public void setCbbmfzr(String cbbmfzr) {
            this.cbbmfzr = cbbmfzr;
        }

        public String getSpsj() {
            return spsj;
        }

        public void setSpsj(String spsj) {
            this.spsj = spsj;
        }
    }

    public static class TransBean {
        /**
         * destType : task
         * destination : 监管部门
         * name : to 监管部门
         * source : 财务审计部
         */

        private String destType;
        private String destination;
        private String name;
        private String source;

        public String getDestType() {
            return destType;
        }

        public void setDestType(String destType) {
            this.destType = destType;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }
    }
}
