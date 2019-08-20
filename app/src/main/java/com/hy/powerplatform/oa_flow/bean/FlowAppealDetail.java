package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/2/22.
 */

public class FlowAppealDetail implements Serializable {

    /**
     * success : true
     * mainform : [{"QingShiNeiRong":"测试","ShenQingRen":"超级管理员","ShenQingBuMen":"宜春公交集团有限公司","runId":51500,"$type$":"WF_QingShiHuiBao","jbfgldyj":"","fgldyj":"","ShenQingBuMenDid":"","ShenQingShiJian":"2019-02-22","mainId":3,"ShenQingRenUId":"888888888","zjlyj":"","jbbmyj":"","XiangGuanFuJian":"","bmfzryj":"","LiuShuiHao":"No.20190222080"}]
     */

    private boolean success;
    private List<MainformBean> mainform;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<MainformBean> getMainform() {
        return mainform;
    }

    public void setMainform(List<MainformBean> mainform) {
        this.mainform = mainform;
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
        private String dszyj;
        private String sqbm;
        private String LiuShuiHao;

        public String getSqbm() {
            return sqbm;
        }

        public void setSqbm(String sqbm) {
            this.sqbm = sqbm;
        }

        public String getDszyj() {
            return dszyj;
        }

        public void setDszyj(String dszyj) {
            this.dszyj = dszyj;
        }

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
}
