package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/2/21.
 */

public class FlowInstallWillDetail implements Serializable {

    /**
     * success : true
     * taskId : 8020162
     * pkValue : mainId
     * formRights : {'BanJieQingKuangYuPingJia':'1','ShenBanBuMenYiJian':'1','BanJieJiHuaAnPai':'1','fgldyj':'1','jbbmyj':'1','bjap':'1','xiangguanfujian':'1','LiuShuiHao':'1','bjpj':'1','ShenBanShiXiang':'1','ShenBanBuMen':'1','BanJieRen':'1','jbfgldyj':'1','ShenBanShiJian':'1','bmfzryj':'2','BanJieShiJian':'1'}
     * mainform : [{"BanJieQingKuangYuPingJia":"","runId":51477,"$type$":"WF_ycsgjjtazgzxmsbb","jbfgldyj":"","BanJieRen":"","fgldyj":"","ShenBanBuMen":"宜春公交集团有限公司","ShenBanShiJian":"2019-02-21","xiangguanfujian":"","bjap":"","mainId":14,"ShenBanShiXiang":"同意","BanJieShiJian":"","jbbmyj":"","bjpj":"","BanJieJiHuaAnPai":"","bmfzryj":"","LiuShuiHao":"No.20190221024","ShenBanBuMenYiJian":""}]
     * formDefId : 10087
     * preTaskName :
     * isSignTask : false
     * trans : [{"destType":"task","destination":"分管领导","name":"to 申办部门分管领导","source":"部门负责人"}]
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
         * BanJieQingKuangYuPingJia :
         * runId : 51477
         * $type$ : WF_ycsgjjtazgzxmsbb
         * jbfgldyj :
         * BanJieRen :
         * fgldyj :
         * ShenBanBuMen : 宜春公交集团有限公司
         * ShenBanShiJian : 2019-02-21
         * xiangguanfujian :
         * bjap :
         * mainId : 14
         * ShenBanShiXiang : 同意
         * BanJieShiJian :
         * jbbmyj :
         * bjpj :
         * BanJieJiHuaAnPai :
         * bmfzryj :
         * LiuShuiHao : No.20190221024
         * ShenBanBuMenYiJian :
         */

        private String BanJieQingKuangYuPingJia;
        private String runId;
        private String $type$;
        private String jbfgldyj;
        private String BanJieRen;
        private String fgldyj;
        private String ShenBanBuMen;
        private String ShenBanShiJian;
        private String xiangguanfujian;
        private String bjap;
        private int mainId;
        private String ShenBanShiXiang;
        private String BanJieShiJian;
        private String jbbmyj;
        private String bjpj;
        private String BanJieJiHuaAnPai;
        private String bmfzryj;
        private String LiuShuiHao;
        private String ShenBanBuMenYiJian;

        public String getBanJieQingKuangYuPingJia() {
            return BanJieQingKuangYuPingJia;
        }

        public void setBanJieQingKuangYuPingJia(String BanJieQingKuangYuPingJia) {
            this.BanJieQingKuangYuPingJia = BanJieQingKuangYuPingJia;
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

        public String getBanJieRen() {
            return BanJieRen;
        }

        public void setBanJieRen(String BanJieRen) {
            this.BanJieRen = BanJieRen;
        }

        public String getFgldyj() {
            return fgldyj;
        }

        public void setFgldyj(String fgldyj) {
            this.fgldyj = fgldyj;
        }

        public String getShenBanBuMen() {
            return ShenBanBuMen;
        }

        public void setShenBanBuMen(String ShenBanBuMen) {
            this.ShenBanBuMen = ShenBanBuMen;
        }

        public String getShenBanShiJian() {
            return ShenBanShiJian;
        }

        public void setShenBanShiJian(String ShenBanShiJian) {
            this.ShenBanShiJian = ShenBanShiJian;
        }

        public String getXiangguanfujian() {
            return xiangguanfujian;
        }

        public void setXiangguanfujian(String xiangguanfujian) {
            this.xiangguanfujian = xiangguanfujian;
        }

        public String getBjap() {
            return bjap;
        }

        public void setBjap(String bjap) {
            this.bjap = bjap;
        }

        public int getMainId() {
            return mainId;
        }

        public void setMainId(int mainId) {
            this.mainId = mainId;
        }

        public String getShenBanShiXiang() {
            return ShenBanShiXiang;
        }

        public void setShenBanShiXiang(String ShenBanShiXiang) {
            this.ShenBanShiXiang = ShenBanShiXiang;
        }

        public String getBanJieShiJian() {
            return BanJieShiJian;
        }

        public void setBanJieShiJian(String BanJieShiJian) {
            this.BanJieShiJian = BanJieShiJian;
        }

        public String getJbbmyj() {
            return jbbmyj;
        }

        public void setJbbmyj(String jbbmyj) {
            this.jbbmyj = jbbmyj;
        }

        public String getBjpj() {
            return bjpj;
        }

        public void setBjpj(String bjpj) {
            this.bjpj = bjpj;
        }

        public String getBanJieJiHuaAnPai() {
            return BanJieJiHuaAnPai;
        }

        public void setBanJieJiHuaAnPai(String BanJieJiHuaAnPai) {
            this.BanJieJiHuaAnPai = BanJieJiHuaAnPai;
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

        public String getShenBanBuMenYiJian() {
            return ShenBanBuMenYiJian;
        }

        public void setShenBanBuMenYiJian(String ShenBanBuMenYiJian) {
            this.ShenBanBuMenYiJian = ShenBanBuMenYiJian;
        }
    }

    public static class TransBean {
        /**
         * destType : task
         * destination : 分管领导
         * name : to 申办部门分管领导
         * source : 部门负责人
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
