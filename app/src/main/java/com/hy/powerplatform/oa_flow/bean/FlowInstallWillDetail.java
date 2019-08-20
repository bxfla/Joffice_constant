package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/2/21.
 */

public class FlowInstallWillDetail implements Serializable {


    /**
     * success : true
     * taskId : 9291946
     * pkValue : mainId
     * formRights : {'zjlyj':'2','BanJieQingKuangYuPingJia':'1','ShenBanBuMenYiJian':'1','fgldyj':'1','BanJieRen':'1','BanJieShiJian':'1','xiangguanfujian':'1','BanJieJiHuaAnPai':'1','ShenBanShiJian':'1','ShenBanShiXiang':'1','bjap':'1','bjpj':'1','ShenBanBuMen':'1','bmfzryj':'1','jbfgldyj':'1','jbbmyj':'1','wczt':'1','LiuShuiHao':'1'}
     * mainform : [{"BanJieQingKuangYuPingJia":"","runId":52183,"wczt":"","$type$":"WF_ycsgjjtazgzxmsbb","jbfgldyj":"","BanJieRen":"","fgldyj":"[{\"ui\":\"153\",\"un\":\"袁斌\",\"c\":\"2019-08-06 10:50\",\"v\":\"同意2\"}]","ShenBanBuMen":"宜春公交集团有限公司","ShenBanShiJian":"2019-08-06","xiangguanfujian":"","bjap":"","mainId":43,"ShenBanShiXiang":"测试","BanJieShiJian":"","zjlyj":"","jbbmyj":"","bjpj":"","BanJieJiHuaAnPai":"","bmfzryj":"[{\"ui\":\"1729\",\"un\":\"欧阳晓林\",\"c\":\"2019-08-06 10:50\",\"v\":\"同意\"}]","LiuShuiHao":"No.20190806023","ShenBanBuMenYiJian":""}]
     * formDefId : 10087
     * preTaskName :
     * isSignTask : false
     * trans : [{"destType":"task","destination":"经办分管领导","name":"to 经办分管领导","source":"总经理"}]
     * runId : 52183
     */

    private boolean success;
    private String taskId;
    private String pkValue;
    private String formRights;
    private String formDefId;
    private String preTaskName;
    private boolean isSignTask;
    private int runId;
    private boolean revoke;
    private List<MainformBean> mainform;
    private List<TransBean> trans;

    public boolean isRevoke() {
        return revoke;
    }

    public void setRevoke(boolean revoke) {
        this.revoke = revoke;
    }

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

    public int getRunId() {
        return runId;
    }

    public void setRunId(int runId) {
        this.runId = runId;
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
         * runId : 52183
         * wczt :
         * $type$ : WF_ycsgjjtazgzxmsbb
         * jbfgldyj :
         * BanJieRen :
         * fgldyj : [{"ui":"153","un":"袁斌","c":"2019-08-06 10:50","v":"同意2"}]
         * ShenBanBuMen : 宜春公交集团有限公司
         * ShenBanShiJian : 2019-08-06
         * xiangguanfujian :
         * bjap :
         * mainId : 43
         * ShenBanShiXiang : 测试
         * BanJieShiJian :
         * zjlyj :
         * jbbmyj :
         * bjpj :
         * BanJieJiHuaAnPai :
         * bmfzryj : [{"ui":"1729","un":"欧阳晓林","c":"2019-08-06 10:50","v":"同意"}]
         * LiuShuiHao : No.20190806023
         * ShenBanBuMenYiJian :
         */

        private String BanJieQingKuangYuPingJia;
        private String runId;
        private String wczt;
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
        private String zjlyj;
        private String jbbmyj;
        private String bjpj;
        private String BanJieJiHuaAnPai;
        private String bmfzryj;
        private String LiuShuiHao;
        private String ShenBanBuMenYiJian;
        private String ys;

        public String getYs() {
            return ys;
        }

        public void setYs(String ys) {
            this.ys = ys;
        }

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

        public String getWczt() {
            return wczt;
        }

        public void setWczt(String wczt) {
            this.wczt = wczt;
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
         * destination : 经办分管领导
         * name : to 经办分管领导
         * source : 总经理
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
