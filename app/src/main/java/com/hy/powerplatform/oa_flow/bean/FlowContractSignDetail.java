package com.hy.powerplatform.oa_flow.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/2/14.
 */

public class FlowContractSignDetail implements Serializable {


    /**
     * success : true
     * mainform : [{"jcbmyj":"","jgbmyj":"","runId":51510,"$type$":"WF_htqdspd","fgldyj":"[{\"ui\":\"9387\",\"un\":\"唐根六\",\"c\":\"2019-02-25 11:43\",\"v\":\"同意\"}]","flgwyj":"[{\"ui\":\"9507\",\"un\":\"熊辉林\",\"c\":\"2019-02-25 11:42\",\"v\":\"同意\"}]","htmc":"测试","cbbm":"宜春公交集团有限公司","jbqk":"测试事由","xiangguanfujian":"","mainId":112,"csbmyj":"","cwsjbyj":"","zjlyj":"[{\"ui\":\"9387\",\"un\":\"唐根六\",\"c\":\"2019-02-25 11:44\",\"v\":\"同意\"}]","cbbmfzr":"张敏","spsj":"2019-02-25"}]
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
         * jcbmyj :
         * jgbmyj :
         * runId : 51510
         * $type$ : WF_htqdspd
         * fgldyj : [{"ui":"9387","un":"唐根六","c":"2019-02-25 11:43","v":"同意"}]
         * flgwyj : [{"ui":"9507","un":"熊辉林","c":"2019-02-25 11:42","v":"同意"}]
         * htmc : 测试
         * cbbm : 宜春公交集团有限公司
         * jbqk : 测试事由
         * xiangguanfujian :
         * mainId : 112
         * csbmyj :
         * cwsjbyj :
         * zjlyj : [{"ui":"9387","un":"唐根六","c":"2019-02-25 11:44","v":"同意"}]
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
}
