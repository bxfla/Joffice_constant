package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/2/18.
 */

public class FlowOverTimeDetail implements Serializable {

    /**
     * success : true
     * taskId : 8031466
     * pkValue : mainId
     * formRights : {}
     * mainform : [{"addClassPlace":"公司","beginTime":"上午","depName":"宜春公交集团有限公司","runId":51539,"$type$":"WF_YuanGongJiaBanShenQing","FuJian":"","endClassDate":"2019-02-19","endTime":"上午","addClassContent":"测试","depNameDid":"378","applyDate":"2019-02-18","fgldyj":"","applyName":"欧阳晓林","addClassDate":"2019-02-18","mainId":2,"zjlyj":"","applyNameUId":"888888888","bmfzryj":"","addClassCounts":"1","dataUrl_save":""}]
     * formDefId : 73
     * preTaskName :
     * isSignTask : false
     * trans : [{"destType":"task","destination":"分管领导","name":"to 分管领导","source":"部门负责人签字"},{"destType":"start","destination":"发起人","name":"to","source":"部门负责人签字"}]
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
         * addClassPlace : 公司
         * beginTime : 上午
         * depName : 宜春公交集团有限公司
         * runId : 51539
         * $type$ : WF_YuanGongJiaBanShenQing
         * FuJian :
         * endClassDate : 2019-02-19
         * endTime : 上午
         * addClassContent : 测试
         * depNameDid : 378
         * applyDate : 2019-02-18
         * fgldyj :
         * applyName : 欧阳晓林
         * addClassDate : 2019-02-18
         * mainId : 2
         * zjlyj :
         * applyNameUId : 888888888
         * bmfzryj :
         * addClassCounts : 1
         * dataUrl_save :
         */

        private String addClassPlace;
        private String beginTime;
        private String depName;
        private String runId;
        private String $type$;
        private String FuJian;
        private String endClassDate;
        private String endTime;
        private String addClassContent;
        private String depNameDid;
        private String applyDate;
        private String fgldyj;
        private String applyName;
        private String addClassDate;
        private int mainId;
        private String zjlyj;
        private String applyNameUId;
        private String bmfzryj;
        private String addClassCounts;
        private String dataUrl_save;

        public String getAddClassPlace() {
            return addClassPlace;
        }

        public void setAddClassPlace(String addClassPlace) {
            this.addClassPlace = addClassPlace;
        }

        public String getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public String getDepName() {
            return depName;
        }

        public void setDepName(String depName) {
            this.depName = depName;
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

        public String getFuJian() {
            return FuJian;
        }

        public void setFuJian(String FuJian) {
            this.FuJian = FuJian;
        }

        public String getEndClassDate() {
            return endClassDate;
        }

        public void setEndClassDate(String endClassDate) {
            this.endClassDate = endClassDate;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getAddClassContent() {
            return addClassContent;
        }

        public void setAddClassContent(String addClassContent) {
            this.addClassContent = addClassContent;
        }

        public String getDepNameDid() {
            return depNameDid;
        }

        public void setDepNameDid(String depNameDid) {
            this.depNameDid = depNameDid;
        }

        public String getApplyDate() {
            return applyDate;
        }

        public void setApplyDate(String applyDate) {
            this.applyDate = applyDate;
        }

        public String getFgldyj() {
            return fgldyj;
        }

        public void setFgldyj(String fgldyj) {
            this.fgldyj = fgldyj;
        }

        public String getApplyName() {
            return applyName;
        }

        public void setApplyName(String applyName) {
            this.applyName = applyName;
        }

        public String getAddClassDate() {
            return addClassDate;
        }

        public void setAddClassDate(String addClassDate) {
            this.addClassDate = addClassDate;
        }

        public int getMainId() {
            return mainId;
        }

        public void setMainId(int mainId) {
            this.mainId = mainId;
        }

        public String getZjlyj() {
            return zjlyj;
        }

        public void setZjlyj(String zjlyj) {
            this.zjlyj = zjlyj;
        }

        public String getApplyNameUId() {
            return applyNameUId;
        }

        public void setApplyNameUId(String applyNameUId) {
            this.applyNameUId = applyNameUId;
        }

        public String getBmfzryj() {
            return bmfzryj;
        }

        public void setBmfzryj(String bmfzryj) {
            this.bmfzryj = bmfzryj;
        }

        public String getAddClassCounts() {
            return addClassCounts;
        }

        public void setAddClassCounts(String addClassCounts) {
            this.addClassCounts = addClassCounts;
        }

        public String getDataUrl_save() {
            return dataUrl_save;
        }

        public void setDataUrl_save(String dataUrl_save) {
            this.dataUrl_save = dataUrl_save;
        }
    }

    public static class TransBean {
        /**
         * destType : task
         * destination : 分管领导
         * name : to 分管领导
         * source : 部门负责人签字
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
