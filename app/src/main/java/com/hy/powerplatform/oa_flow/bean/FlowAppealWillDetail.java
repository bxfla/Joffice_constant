package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/2/22.
 */

public class FlowAppealWillDetail implements Serializable {


    /**
     * success : true
     * taskId : 8050048
     * pkValue : mainId
     * formRights : {'ShenQingRen':'1','XiangGuanFuJian':'1','QingShiNeiRong':'1','jbbmyj':'1','jbfgldyj':'1','ShenQingShiJian':'1','fgldyj':'2','zjlyj':'1','LiuShuiHao':'1','bmfzryj':'1','ShenQingBuMen':'1'}
     * mainform : [{"QingShiNeiRong":"测试","ShenQingRen":"超级管理员","ShenQingBuMen":"宜春公交集团有限公司","runId":51500,"$type$":"WF_QingShiHuiBao","jbfgldyj":"","fgldyj":"","ShenQingBuMenDid":"","ShenQingShiJian":"2019-02-22","mainId":3,"ShenQingRenUId":"888888888","zjlyj":"","jbbmyj":"","XiangGuanFuJian":"","bmfzryj":"","LiuShuiHao":"No.20190222080"}]
     * formDefId : 10113
     * preTaskName :
     * isSignTask : false
     * trans : [{"destType":"task","destination":"总经理","name":"to 总经理","source":"分管领导"},{"destType":"task","destination":"发起人","name":"to 发起人","source":"分管领导"},{"destType":"task","destination":"经办分管领导","name":"to 经办分管领导","source":"分管领导"},{"destType":"task","destination":"经办部门","name":"to 经办部门","source":"分管领导"}]
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
         * QingShiNeiRong : 测试
         * ShenQingRen : 超级管理员
         * ShenQingBuMen : 宜春公交集团有限公司
         * runId : 51500
         * $type$ : WF_QingShiHuiBao
         * jbfgldyj :
         * fgldyj :
         * ShenQingBuMenDid :
         * ShenQingShiJian : 2019-02-22
         * mainId : 3
         * ShenQingRenUId : 888888888
         * zjlyj :
         * jbbmyj :
         * XiangGuanFuJian :
         * bmfzryj :
         * LiuShuiHao : No.20190222080
         */

        private String QingShiNeiRong;
        private String ShenQingRen;
        private String ShenQingBuMen;
        private String runId;
        private String $type$;
        private String jbfgldyj;
        private String fgldyj;
        private String ShenQingBuMenDid;
        private String ShenQingShiJian;
        private int mainId;
        private String ShenQingRenUId;
        private String zjlyj;
        private String jbbmyj;
        private String XiangGuanFuJian;
        private String bmfzryj;
        private String LiuShuiHao;

        public String getQingShiNeiRong() {
            return QingShiNeiRong;
        }

        public void setQingShiNeiRong(String QingShiNeiRong) {
            this.QingShiNeiRong = QingShiNeiRong;
        }

        public String getShenQingRen() {
            return ShenQingRen;
        }

        public void setShenQingRen(String ShenQingRen) {
            this.ShenQingRen = ShenQingRen;
        }

        public String getShenQingBuMen() {
            return ShenQingBuMen;
        }

        public void setShenQingBuMen(String ShenQingBuMen) {
            this.ShenQingBuMen = ShenQingBuMen;
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

        public String getJbfgldyj() {
            return jbfgldyj;
        }

        public void setJbfgldyj(String jbfgldyj) {
            this.jbfgldyj = jbfgldyj;
        }

        public String getFgldyj() {
            return fgldyj;
        }

        public void setFgldyj(String fgldyj) {
            this.fgldyj = fgldyj;
        }

        public String getShenQingBuMenDid() {
            return ShenQingBuMenDid;
        }

        public void setShenQingBuMenDid(String ShenQingBuMenDid) {
            this.ShenQingBuMenDid = ShenQingBuMenDid;
        }

        public String getShenQingShiJian() {
            return ShenQingShiJian;
        }

        public void setShenQingShiJian(String ShenQingShiJian) {
            this.ShenQingShiJian = ShenQingShiJian;
        }

        public int getMainId() {
            return mainId;
        }

        public void setMainId(int mainId) {
            this.mainId = mainId;
        }

        public String getShenQingRenUId() {
            return ShenQingRenUId;
        }

        public void setShenQingRenUId(String ShenQingRenUId) {
            this.ShenQingRenUId = ShenQingRenUId;
        }

        public String getZjlyj() {
            return zjlyj;
        }

        public void setZjlyj(String zjlyj) {
            this.zjlyj = zjlyj;
        }

        public String getJbbmyj() {
            return jbbmyj;
        }

        public void setJbbmyj(String jbbmyj) {
            this.jbbmyj = jbbmyj;
        }

        public String getXiangGuanFuJian() {
            return XiangGuanFuJian;
        }

        public void setXiangGuanFuJian(String XiangGuanFuJian) {
            this.XiangGuanFuJian = XiangGuanFuJian;
        }

        public String getBmfzryj() {
            return bmfzryj;
        }

        public void setBmfzryj(String bmfzryj) {
            this.bmfzryj = bmfzryj;
        }

        public String getLiuShuiHao() {
            return LiuShuiHao;
        }

        public void setLiuShuiHao(String LiuShuiHao) {
            this.LiuShuiHao = LiuShuiHao;
        }
    }

    public static class TransBean {
        /**
         * destType : task
         * destination : 总经理
         * name : to 总经理
         * source : 分管领导
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
