package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/2/12.
 */

public class MyChuChai implements Serializable {

    /**
     * success : true
     * mainform : [{"sbbmDid":"378","zjxj":"200","mudidi":"北京","runId":51365,"chuchairenyuan":"欧阳晓林","mainId":10010,"jiezhiriqi":"2019-02-13","yjfy":"100","keshuru":"","sbbm":"宜春公交集团有限公司","jtgj2":"","tujing":"日本","jtgj1":"on","yqh":"","jtgj4":"","jtgj3":"","$type$":"WF_chuchaishenqingshenpi","ccsy":"测试事由","ccdd":"济南","fgldyj":"","ccrq":"2019-02-12","sqsj":"2019-02-12","ccts":"2","xiangguanfujian":"","chuchairenyuanUId":"1729","zjlyj":"","bmfzryj":""}]
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
         * sbbmDid : 378
         * zjxj : 200
         * mudidi : 北京
         * runId : 51365
         * chuchairenyuan : 欧阳晓林
         * mainId : 10010
         * jiezhiriqi : 2019-02-13
         * yjfy : 100
         * keshuru :
         * sbbm : 宜春公交集团有限公司
         * jtgj2 :
         * tujing : 日本
         * jtgj1 : on
         * yqh :
         * jtgj4 :
         * jtgj3 :
         * $type$ : WF_chuchaishenqingshenpi
         * ccsy : 测试事由
         * ccdd : 济南
         * fgldyj :
         * ccrq : 2019-02-12
         * sqsj : 2019-02-12
         * ccts : 2
         * xiangguanfujian :
         * chuchairenyuanUId : 1729
         * zjlyj :
         * bmfzryj :
         */

        private String sbbmDid;
        private String zjxj;
        private String mudidi;
        private String runId;
        private String chuchairenyuan;
        private int mainId;
        private String jiezhiriqi;
        private String yjfy;
        private String keshuru;
        private String sbbm;
        private String jtgj2;
        private String tujing;
        private String jtgj1;
        private String yqh;
        private String jtgj4;
        private String jtgj3;
        private String $type$;
        private String ccsy;
        private String ccdd;
        private String fgldyj;
        private String ccrq;
        private String sqsj;
        private String ccts;
        private String xiangguanfujian;
        private String chuchairenyuanUId;
        private String zjlyj;
        private String bmfzryj;

        public String getSbbmDid() {
            return sbbmDid;
        }

        public void setSbbmDid(String sbbmDid) {
            this.sbbmDid = sbbmDid;
        }

        public String getZjxj() {
            return zjxj;
        }

        public void setZjxj(String zjxj) {
            this.zjxj = zjxj;
        }

        public String getMudidi() {
            return mudidi;
        }

        public void setMudidi(String mudidi) {
            this.mudidi = mudidi;
        }

        public String getRunId() {
            return runId;
        }

        public void setRunId(String runId) {
            this.runId = runId;
        }

        public String getChuchairenyuan() {
            return chuchairenyuan;
        }

        public void setChuchairenyuan(String chuchairenyuan) {
            this.chuchairenyuan = chuchairenyuan;
        }

        public int getMainId() {
            return mainId;
        }

        public void setMainId(int mainId) {
            this.mainId = mainId;
        }

        public String getJiezhiriqi() {
            return jiezhiriqi;
        }

        public void setJiezhiriqi(String jiezhiriqi) {
            this.jiezhiriqi = jiezhiriqi;
        }

        public String getYjfy() {
            return yjfy;
        }

        public void setYjfy(String yjfy) {
            this.yjfy = yjfy;
        }

        public String getKeshuru() {
            return keshuru;
        }

        public void setKeshuru(String keshuru) {
            this.keshuru = keshuru;
        }

        public String getSbbm() {
            return sbbm;
        }

        public void setSbbm(String sbbm) {
            this.sbbm = sbbm;
        }

        public String getJtgj2() {
            return jtgj2;
        }

        public void setJtgj2(String jtgj2) {
            this.jtgj2 = jtgj2;
        }

        public String getTujing() {
            return tujing;
        }

        public void setTujing(String tujing) {
            this.tujing = tujing;
        }

        public String getJtgj1() {
            return jtgj1;
        }

        public void setJtgj1(String jtgj1) {
            this.jtgj1 = jtgj1;
        }

        public String getYqh() {
            return yqh;
        }

        public void setYqh(String yqh) {
            this.yqh = yqh;
        }

        public String getJtgj4() {
            return jtgj4;
        }

        public void setJtgj4(String jtgj4) {
            this.jtgj4 = jtgj4;
        }

        public String getJtgj3() {
            return jtgj3;
        }

        public void setJtgj3(String jtgj3) {
            this.jtgj3 = jtgj3;
        }

        public String get$type$() {
            return $type$;
        }

        public void set$type$(String $type$) {
            this.$type$ = $type$;
        }

        public String getCcsy() {
            return ccsy;
        }

        public void setCcsy(String ccsy) {
            this.ccsy = ccsy;
        }

        public String getCcdd() {
            return ccdd;
        }

        public void setCcdd(String ccdd) {
            this.ccdd = ccdd;
        }

        public String getFgldyj() {
            return fgldyj;
        }

        public void setFgldyj(String fgldyj) {
            this.fgldyj = fgldyj;
        }

        public String getCcrq() {
            return ccrq;
        }

        public void setCcrq(String ccrq) {
            this.ccrq = ccrq;
        }

        public String getSqsj() {
            return sqsj;
        }

        public void setSqsj(String sqsj) {
            this.sqsj = sqsj;
        }

        public String getCcts() {
            return ccts;
        }

        public void setCcts(String ccts) {
            this.ccts = ccts;
        }

        public String getXiangguanfujian() {
            return xiangguanfujian;
        }

        public void setXiangguanfujian(String xiangguanfujian) {
            this.xiangguanfujian = xiangguanfujian;
        }

        public String getChuchairenyuanUId() {
            return chuchairenyuanUId;
        }

        public void setChuchairenyuanUId(String chuchairenyuanUId) {
            this.chuchairenyuanUId = chuchairenyuanUId;
        }

        public String getZjlyj() {
            return zjlyj;
        }

        public void setZjlyj(String zjlyj) {
            this.zjlyj = zjlyj;
        }

        public String getBmfzryj() {
            return bmfzryj;
        }

        public void setBmfzryj(String bmfzryj) {
            this.bmfzryj = bmfzryj;
        }
    }
}
