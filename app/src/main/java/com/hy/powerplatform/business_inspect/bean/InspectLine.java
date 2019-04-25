package com.hy.powerplatform.business_inspect.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dell on 2018/5/10.
 */

public class InspectLine implements Serializable{
    /**
     * success : true
     * data : [{"version":null,"orgId":null,"orgPath":null,"lineInfoId":72,"lineCode":"1","lineName":"1路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":1,"lineCode":"10","lineName":"10路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":64,"lineCode":"1001","lineName":"1001路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":2,"lineCode":"101","lineName":"101路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":74,"lineCode":"106","lineName":"106路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":4,"lineCode":"11","lineName":"11路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":65,"lineCode":"1101","lineName":"1101路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":93,"lineCode":"12","lineName":"12路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":6,"lineCode":"1201","lineName":"1201路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":7,"lineCode":"1202","lineName":"1202路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":8,"lineCode":"13","lineName":"13路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":9,"lineCode":"15","lineName":"15路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":87,"lineCode":"16","lineName":"16路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":10,"lineCode":"1601","lineName":"1601路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":11,"lineCode":"1602","lineName":"1602路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":88,"lineCode":"17","lineName":"17路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":12,"lineCode":"1701","lineName":"1701路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":13,"lineCode":"1702","lineName":"1702路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":89,"lineCode":"18","lineName":"18路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":14,"lineCode":"1801","lineName":"1801路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":15,"lineCode":"1802","lineName":"1802路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":16,"lineCode":"19","lineName":"19路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":67,"lineCode":"1903","lineName":"1903路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":17,"lineCode":"2","lineName":"2路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":90,"lineCode":"20","lineName":"20路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":18,"lineCode":"2001","lineName":"2001路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":19,"lineCode":"2002","lineName":"2002路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":66,"lineCode":"201","lineName":"201路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":75,"lineCode":"203","lineName":"203路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":20,"lineCode":"21","lineName":"21路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":21,"lineCode":"22","lineName":"22路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":22,"lineCode":"23","lineName":"23路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":91,"lineCode":"25","lineName":"25路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":23,"lineCode":"2501","lineName":"2501路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":24,"lineCode":"2502","lineName":"2502路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":25,"lineCode":"26","lineName":"26路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":26,"lineCode":"27","lineName":"27路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":86,"lineCode":"28","lineName":"28路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":53,"lineCode":"29","lineName":"29路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":28,"lineCode":"3","lineName":"3路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":29,"lineCode":"30","lineName":"30路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":92,"lineCode":"31","lineName":"31路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":30,"lineCode":"3101","lineName":"3101路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":31,"lineCode":"3102","lineName":"3102路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":32,"lineCode":"32","lineName":"32路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":73,"lineCode":"3202","lineName":"3202路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":81,"lineCode":"34","lineName":"34路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":33,"lineCode":"3401","lineName":"3401路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":34,"lineCode":"3402","lineName":"3402路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":71,"lineCode":"35","lineName":"35路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":62,"lineCode":"38","lineName":"38路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":918,"depName":"运营五队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.918.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:15","updateId":1,"updatetime":"2017-07-17 16:30:15","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":63,"lineCode":"39","lineName":"39路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":918,"depName":"运营五队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.918.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:15","updateId":1,"updatetime":"2017-07-17 16:30:15","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":35,"lineCode":"4","lineName":"4路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":77,"lineCode":"40","lineName":"40路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":918,"depName":"运营五队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.918.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:15","updateId":1,"updatetime":"2017-07-17 16:30:15","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":36,"lineCode":"5","lineName":"5路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":37,"lineCode":"6","lineName":"6路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":38,"lineCode":"7","lineName":"7路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":79,"lineCode":"8","lineName":"8路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":39,"lineCode":"8001","lineName":"8001路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":40,"lineCode":"8002","lineName":"8002路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":58,"lineCode":"801","lineName":"801路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":57,"lineCode":"8888","lineName":"8888路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":918,"depName":"运营五队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.918.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:15","updateId":1,"updatetime":"2017-07-17 16:30:15","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":41,"lineCode":"9","lineName":"9路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":914,"depName":"运营一队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.914.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:09","updateId":1,"updatetime":"2017-07-17 16:29:09","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":42,"lineCode":"901","lineName":"901路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":78,"lineCode":"9011","lineName":"9011路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":43,"lineCode":"9012","lineName":"9012路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":54,"lineCode":"902","lineName":"902路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":55,"lineCode":"903","lineName":"903路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":917,"depName":"高校队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.917.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:59","updateId":1,"updatetime":"2017-07-17 16:29:59","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":69,"lineCode":"909","lineName":"909路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":915,"depName":"运营二队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.915.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:24","updateId":1,"updatetime":"2017-07-17 16:29:24","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":46,"lineCode":"9901","lineName":"9901路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":47,"lineCode":"9902","lineName":"9902路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":48,"lineCode":"9903","lineName":"9903路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":49,"lineCode":"9904","lineName":"9904路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":56,"lineCode":"9905","lineName":"9905路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":50,"lineCode":"9906","lineName":"9906路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":61,"lineCode":"9907","lineName":"9907路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":83,"lineCode":"9915","lineName":"9915路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":84,"lineCode":"9916","lineName":"9916路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":95,"lineCode":"9917","lineName":"9917路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":96,"lineCode":"9918","lineName":"9918路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":94,"lineCode":"9919","lineName":"9919路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":68,"lineCode":"9920","lineName":"9920路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":97,"lineCode":"9921","lineName":"9921路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":98,"lineCode":"9922","lineName":"9922路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":99,"lineCode":"9923","lineName":"9923路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":100,"lineCode":"9925","lineName":"9925路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":919,"depName":"运营六队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.919.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:31","updateId":1,"updatetime":"2017-07-17 16:30:31","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":51,"lineCode":"9999","lineName":"9999路","depId":null,"department":{"version":null,"orgId":null,"orgPath":null,"depId":918,"depName":"运营五队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.918.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:30:15","updateId":1,"updatetime":"2017-07-17 16:30:15","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}}]
     */

    private boolean success;
    private List<DataBean> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * version : null
         * orgId : null
         * orgPath : null
         * lineInfoId : 72
         * lineCode : 1
         * lineName : 1路
         * depId : null
         * department : {"version":null,"orgId":null,"orgPath":null,"depId":916,"depName":"运营三队","depDesc":"","depLevel":3,"parentId":890,"path":"0.883.890.916.","orgType":3,"creatorId":1,"createtime":"2017-07-17 16:29:40","updateId":1,"updatetime":"2017-07-17 16:29:40","sn":null,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}
         */

        private Object version;
        private Object orgId;
        private Object orgPath;
        private int lineInfoId;
        private String lineCode;
        private String lineName;
        private String depId;
        private DepartmentBean department;

        public DataBean(String lineCode, String lineName) {
            this.lineCode = lineCode;
            this.lineName = lineName;
        }

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

        public int getLineInfoId() {
            return lineInfoId;
        }

        public void setLineInfoId(int lineInfoId) {
            this.lineInfoId = lineInfoId;
        }

        public String getLineCode() {
            return lineCode;
        }

        public void setLineCode(String lineCode) {
            this.lineCode = lineCode;
        }

        public String getLineName() {
            return lineName;
        }

        public void setLineName(String lineName) {
            this.lineName = lineName;
        }

        public String getDepId() {
            return depId;
        }

        public void setDepId(String depId) {
            this.depId = depId;
        }

        public DepartmentBean getDepartment() {
            return department;
        }

        public void setDepartment(DepartmentBean department) {
            this.department = department;
        }

        public static class DepartmentBean implements Serializable{
            /**
             * version : null
             * orgId : null
             * orgPath : null
             * depId : 916
             * depName : 运营三队
             * depDesc :
             * depLevel : 3
             * parentId : 890
             * path : 0.883.890.916.
             * orgType : 3
             * creatorId : 1
             * createtime : 2017-07-17 16:29:40
             * updateId : 1
             * updatetime : 2017-07-17 16:29:40
             * sn : null
             * chargeIds :
             * chargeNames :
             * demension : {"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}
             */

            private Object version;
            private Object orgId;
            private Object orgPath;
            private String depId;
            private String depName;
            private String depDesc;
            private int depLevel;
            private int parentId;
            private String path;
            private int orgType;
            private int creatorId;
            private String createtime;
            private int updateId;
            private String updatetime;
            private Object sn;
            private String chargeIds;
            private String chargeNames;
            private DemensionBean demension;

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

            public String getDepId() {
                return depId;
            }

            public void setDepId(String depId) {
                this.depId = depId;
            }

            public String getDepName() {
                return depName;
            }

            public void setDepName(String depName) {
                this.depName = depName;
            }

            public String getDepDesc() {
                return depDesc;
            }

            public void setDepDesc(String depDesc) {
                this.depDesc = depDesc;
            }

            public int getDepLevel() {
                return depLevel;
            }

            public void setDepLevel(int depLevel) {
                this.depLevel = depLevel;
            }

            public int getParentId() {
                return parentId;
            }

            public void setParentId(int parentId) {
                this.parentId = parentId;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getOrgType() {
                return orgType;
            }

            public void setOrgType(int orgType) {
                this.orgType = orgType;
            }

            public int getCreatorId() {
                return creatorId;
            }

            public void setCreatorId(int creatorId) {
                this.creatorId = creatorId;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public int getUpdateId() {
                return updateId;
            }

            public void setUpdateId(int updateId) {
                this.updateId = updateId;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public Object getSn() {
                return sn;
            }

            public void setSn(Object sn) {
                this.sn = sn;
            }

            public String getChargeIds() {
                return chargeIds;
            }

            public void setChargeIds(String chargeIds) {
                this.chargeIds = chargeIds;
            }

            public String getChargeNames() {
                return chargeNames;
            }

            public void setChargeNames(String chargeNames) {
                this.chargeNames = chargeNames;
            }

            public DemensionBean getDemension() {
                return demension;
            }

            public void setDemension(DemensionBean demension) {
                this.demension = demension;
            }

            public static class DemensionBean {
                /**
                 * version : null
                 * orgId : null
                 * orgPath : null
                 * demId : 1
                 * demName : 行政维度
                 * demDesc : 行政维度
                 * demType : 1
                 */

                private Object version;
                private Object orgId;
                private Object orgPath;
                private int demId;
                private String demName;
                private String demDesc;
                private int demType;

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

                public int getDemId() {
                    return demId;
                }

                public void setDemId(int demId) {
                    this.demId = demId;
                }

                public String getDemName() {
                    return demName;
                }

                public void setDemName(String demName) {
                    this.demName = demName;
                }

                public String getDemDesc() {
                    return demDesc;
                }

                public void setDemDesc(String demDesc) {
                    this.demDesc = demDesc;
                }

                public int getDemType() {
                    return demType;
                }

                public void setDemType(int demType) {
                    this.demType = demType;
                }
            }
        }
    }
//
//    /**
//     * success : true
//     * data : [{"version":null,"orgId":null,"orgPath":null,"lineInfoId":2,"lineCode":"1","lineName":"1路","depId":null,"beginDate":"1969-09-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"1路车共计车辆26台","zt":0,"photo":"xianlutupian/201802/351abfa5a58d4a81bc9109e97c1a9a1f.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":6,"lineCode":"10","lineName":"10路","depId":null,"beginDate":"2001-07-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/6504770ad77f42e8a79b5fa634c130be.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":76,"lineCode":"101","lineName":"101","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":78,"lineCode":"102","lineName":"102路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":79,"lineCode":"103","lineName":"103路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":80,"lineCode":"104","lineName":"104路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":7,"lineCode":"11","lineName":"11路","depId":null,"beginDate":"2001-08-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2012年12月1日，10台车型6811CNG空调车票价调整为2元，2012年12月3日由10台CNG更换为10台LNG空调车。 2012年12月14日，将10台车型6811CNG空调车调拨给成达巴士，由18辆LNG6936型空调车与4辆普客穿插运行。 ","zt":0,"photo":"xianlutupian/201802/1a8df1c8535449a2a85b53e0033d8614.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":18,"lineCode":"111","lineName":"11B","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":8,"lineCode":"13","lineName":"13路","depId":null,"beginDate":"2002-06-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年3月3日由友谊6710更换为福田6931 ","zt":0,"photo":"xianlutupian/201802/b1d6d4c7e0644ce0bc5959c89b95e422.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":19,"lineCode":"131","lineName":"131路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":null,"zt":0,"photo":null},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":20,"lineCode":"138","lineName":"138路","depId":null,"beginDate":"1992-11-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/b79e45a5e6324ec2a40050da04c86728.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":21,"lineCode":"158","lineName":"158路","depId":null,"beginDate":"2015-07-25","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"单程运行45-50分钟 2016年3月10日，首班由6:40改为6:30","zt":0,"photo":"xianlutupian/201802/cdbfc86f1c0d40c3bb6c878a5403b0bc.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":9,"lineCode":"16","lineName":"16路","depId":null,"beginDate":"2002-11-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2012年12月14日，将11（10台11路调拨到16路+1台南大港调拨到成达）台车型6811CNG空调车调整到16路，与5台车型为6720型普客穿插运营。 2014年12月16日，高铁新增沧州至北京站。12月19日，首班由6:40调整为6:30","zt":0,"photo":"xianlutupian/201802/4e07f0f93426428f8f6e437e0869ce18.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":10,"lineCode":"17","lineName":"17路","depId":null,"beginDate":"2003-11-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/ca6ee0e4b1d64a4f85236e0c96ab4792.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":22,"lineCode":"171","lineName":"171路","depId":null,"beginDate":"2016-05-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":11,"lineCode":"18","lineName":"18路","depId":null,"beginDate":"2003-01-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/c8d6453336274aad91d1c94c00707ff3.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":12,"lineCode":"19","lineName":"19路","depId":null,"beginDate":"2004-07-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2013年2月新购亚星6111双层车3台，暂运行于T19路 2013年4月19日，新购亚星CNG6126型公交车9台，投入运营。 ","zt":0,"photo":"xianlutupian/201802/24ee86e005fd446eb57285d47592ce97.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":13,"lineCode":"21","lineName":"21路","depId":null,"beginDate":"2004-09-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/5067c4e22bc94ecfabff18d9220bab50.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":23,"lineCode":"219","lineName":"219路","depId":null,"beginDate":"2006-12-30","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/f341dc198e5d44d5a39ddef9c6a21ed2.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":14,"lineCode":"22","lineName":"22路","depId":null,"beginDate":"2005-03-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/c7acf015a97d4f97b8e8a0b34431c10b.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":24,"lineCode":"226","lineName":"226路","depId":null,"beginDate":"2007-10-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/64653dedc3e140b19719f80082fefe99.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":84,"lineCode":"232","lineName":"232路","depId":null,"beginDate":"2018-04-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":25,"lineCode":"235","lineName":"235路","depId":null,"beginDate":"2012-01-13","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年3月14日由成达巴士调入一公司。","zt":0,"photo":"xianlutupian/201802/3ee7983881c649b29ff1b11f9c303fed.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":26,"lineCode":"236","lineName":"236路","depId":null,"beginDate":"2008-09-26","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年3月14日由成达巴士调入一公司","zt":0,"photo":"xianlutupian/201802/07d6448fd11b40dbb69b046e40877bf5.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":15,"lineCode":"29","lineName":"29路","depId":null,"beginDate":"2006-02-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/f57f799a42e2425e8a3a23f2da6bfe46.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":3,"lineCode":"3","lineName":"3路","depId":null,"beginDate":"1997-07-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2004年7月由12台中巴6600车型更换为扬子江6850型。 2014年1月29日，有8台扬子江6850更换位友谊6102，又更新为福田6931。 2014年4月15日，由福田6931更换为福田6105。","zt":0,"photo":"repair/repairManage/repairePhotos/201802/a0fc00828491415da454a318746ddd72.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":27,"lineCode":"301","lineName":"301路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":null,"zt":0,"photo":null},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":28,"lineCode":"306","lineName":"306路","depId":null,"beginDate":"1990-01-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/1092543139714aa6bd73e49cbbc51c1b.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":29,"lineCode":"307","lineName":"307路","depId":null,"beginDate":"1999-01-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/09bc17b19d5d4f9484367729e4a53e2e.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":72,"lineCode":"3071","lineName":"3071路","depId":null,"beginDate":"1999-01-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":"xianlutupian/201802/8d384ac71a9e47cc81629474828e2346.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":16,"lineCode":"31","lineName":"31路","depId":null,"beginDate":"2006-06-07","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2013年4月19日，新购亚星CNG6126型公交车11台，投入运营。 2014年12月16日，高铁新增沧州至北京站。12月19日，首班由7:00调整为6:30 ","zt":0,"photo":"xianlutupian/201802/f4ff11a364ae423eada9dde0a328b58d.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":30,"lineCode":"311","lineName":"311路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":31,"lineCode":"321","lineName":"321路","depId":null,"beginDate":"2010-08-26","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/2a59013e4b7a4badbb5907196ed09581.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":32,"lineCode":"327","lineName":"327路","depId":null,"beginDate":"2013-10-30","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/a88be42048ef42f4bdabbb755d5a1327.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":86,"lineCode":"333","lineName":"333路","depId":null,"beginDate":"2018-04-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":85,"lineCode":"3331","lineName":"3331路","depId":null,"beginDate":"2018-04-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":33,"lineCode":"400","lineName":"400路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":34,"lineCode":"402","lineName":"402路","depId":null,"beginDate":"1998-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/c8f7ac9332b94ad28924a4d45b02296c.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":87,"lineCode":"4021","lineName":"4021路","depId":null,"beginDate":"2018-04-11","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":35,"lineCode":"420","lineName":"420路","depId":null,"beginDate":"2007-11-30","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/5fd153f5e3e740749b6fd69abf473bda.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":36,"lineCode":"421","lineName":"T420路","depId":null,"beginDate":"2008-07-25","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/ef12ab2549a842ca8e5da59e317926a0.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":37,"lineCode":"430","lineName":"430路","depId":null,"beginDate":"2006-04-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/9f155ff0c8814e40a05770ccc5cfd2b2.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":38,"lineCode":"489","lineName":"489路","depId":null,"beginDate":"2016-07-26","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2016年7月26日开通运行8台亚星6936，由韩家场至市医院医专院区，总长度11.1公里。 2017年，由原来的亚星6936更换为电福田6851 ","zt":0,"photo":"xianlutupian/201802/e533c0838f5a41e48471ba7baa0d33c7.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":39,"lineCode":"505","lineName":"505路","depId":null,"beginDate":"1996-05-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/759c4e3a39834fc6ad51484b5ca5eff5.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":17,"lineCode":"52","lineName":"52路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":40,"lineCode":"528","lineName":"528路","depId":null,"beginDate":"2008-01-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/382cc6deff6842fbac1383bcdf3974e0.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":41,"lineCode":"539","lineName":"539路","depId":null,"beginDate":"2009-03-20","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2009年3月开通线路车型为胜利6720。 2009年8月由胜利6720更换为黄海6890。 2012年4月由黄海6890更换掉为利6720 2014年1月9日，由胜利6720更换为4台福田6931 ","zt":0,"photo":"xianlutupian/201802/8aa2b3faeac84df4b09c4801f69999d5.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":42,"lineCode":"543","lineName":"543路","depId":null,"beginDate":"2014-04-26","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/c9f98e406e224b0c85b46a0faae887dd.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":43,"lineCode":"561","lineName":"561路","depId":null,"beginDate":"2011-03-13","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"与402路统筹编制运营班次；2011年2月22日，票价调至2元。 ","zt":0,"photo":"xianlutupian/201802/90127ae251394b61b6f5a8afe8f212ce.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":44,"lineCode":"600","lineName":"600路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":null,"zt":0,"photo":null},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":45,"lineCode":"604","lineName":"604路","depId":null,"beginDate":"1998-01-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年2月20日，由黄海6920更换为福田6931 2014年4月9日由福田6931更换为福田6105 ","zt":0,"photo":"xianlutupian/201802/c171d7d4648f4425b8a0ed2c7924568b.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":46,"lineCode":"612","lineName":"612路","depId":null,"beginDate":"2001-11-24","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年2月20日，由胜利6832更换为福田6931 ","zt":0,"photo":"xianlutupian/201802/ecabc89b4f8041288f3a35d4148324af.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":47,"lineCode":"613","lineName":"613路","depId":null,"beginDate":"2009-09-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年3月3日由友谊6710更换为福田6931 ","zt":0,"photo":"xianlutupian/201802/f59d67ddf7b847c6b1b0240275ac45b4.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":48,"lineCode":"615","lineName":"615路","depId":null,"beginDate":"2007-07-04","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/30e5179471df446e9a7957009ca99eb4.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":82,"lineCode":"622","lineName":"622路","depId":null,"beginDate":"2010-03-23","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":49,"lineCode":"651","lineName":"651路","depId":null,"beginDate":"2010-06-03","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/79db652a785f4d62a84780abbbb8a9aa.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":50,"lineCode":"656","lineName":"656路","depId":null,"beginDate":"2013-12-15","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年2月27日由胜利6832更换为福田6931 ","zt":0,"photo":"xianlutupian/201802/98f1d96b3232450cbf839f475236c7ed.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":51,"lineCode":"701","lineName":"701路","depId":null,"beginDate":"2016-05-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/c5ffb15ea21c471dbc2bf9184868f6d6.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":52,"lineCode":"702","lineName":"702路","depId":null,"beginDate":"2016-05-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/d4952eed190148db9b0b4ca7ea163994.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":53,"lineCode":"703","lineName":"703路","depId":null,"beginDate":"2017-04-27","department":{"version":null,"orgId":null,"orgPath":null,"depId":392,"depName":"四公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.392.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:26","updateId":1,"updatetime":"2017-10-10 19:24:03","sn":4,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":null,"zt":0,"photo":null},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":54,"lineCode":"704","lineName":"704路","depId":null,"beginDate":"2017-04-27","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/b25bc30544374cb9a07956a7641639f9.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":55,"lineCode":"721","lineName":"游1","depId":null,"beginDate":"2017-05-25","department":{"version":null,"orgId":null,"orgPath":null,"depId":434,"depName":"成达巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.434.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:40:54","updateId":1,"updatetime":"2017-10-10 19:23:46","sn":2,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/092811361b954c82a3cea8766a6ad088.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":56,"lineCode":"722","lineName":"游2路","depId":null,"beginDate":"2017-05-25","department":{"version":null,"orgId":null,"orgPath":null,"depId":393,"depName":"五公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.393.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:25:03","updateId":1,"updatetime":"2017-10-10 19:24:12","sn":5,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/72b2f8098ba04ac0ba5b3fbc3d2e6bed.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":4,"lineCode":"8","lineName":"8路","depId":null,"beginDate":"1999-07-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":394,"depName":"六公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.394.","orgType":1,"creatorId":1,"createtime":"2016-03-22 10:40:32","updateId":1,"updatetime":"2017-10-10 19:24:22","sn":6,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年1月12日，由胜利6720更换为12台福田6931 2015年5月19日末班由18:06调整为18:20 ","zt":0,"photo":"xianlutupian/201802/e6d35ebb08f84548a8094781637def51.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":57,"lineCode":"800","lineName":"800路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":58,"lineCode":"801","lineName":"801路","depId":null,"beginDate":"2011-04-18","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年由黄海6890更换为宇通6852型7台，运营6台，备用1台。 ","zt":0,"photo":"xianlutupian/201802/7cc535ec23cf44f5bc2aef8d76d1ad97.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":59,"lineCode":"802","lineName":"802路","depId":null,"beginDate":"2009-07-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年由黄海6890更换为宇通6852型7台，运营6台，备用1台。 ","zt":0,"photo":"xianlutupian/201802/b7e380ed8752445fafc8936505d0006e.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":60,"lineCode":"803","lineName":"803路","depId":null,"beginDate":"2009-07-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年4月由黄海6890更换为黄海6920型15台，运行5台。 ","zt":0,"photo":"xianlutupian/201802/cabea8249591498fb8bc2e69a475382f.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":61,"lineCode":"805","lineName":"805路","depId":null,"beginDate":"2011-12-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年2月由黄海6118更换为宇通6852型1台，运行1台。 ","zt":0,"photo":"xianlutupian/201802/58461ee73612423dbabe422dbd57cc53.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":62,"lineCode":"806","lineName":"806路","depId":null,"beginDate":"2014-08-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/92da0547b53d4677802f7ee923587cfb.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":83,"lineCode":"809","lineName":"809路","depId":null,"beginDate":"2017-12-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":null,"zt":0,"photo":null},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":63,"lineCode":"810","lineName":"810路","depId":null,"beginDate":"2016-06-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":" ","zt":0,"photo":"xianlutupian/201802/a3e93c4fc62447c98143e93a71f47640.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":73,"lineCode":"8101","lineName":"810A","depId":null,"beginDate":"2016-06-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":397,"depName":"南大港分公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.397.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:15:25","updateId":1,"updatetime":"2017-10-10 19:25:29","sn":7,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/8f8f2b01f107466fbf3e6bd1422ab27f.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":88,"lineCode":"811","lineName":"811路","depId":null,"beginDate":"2018-04-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":89,"lineCode":"8111","lineName":"8111路","depId":null,"beginDate":"2018-04-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":64,"lineCode":"818","lineName":"818路","depId":null,"beginDate":"2016-08-29","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":65,"lineCode":"819","lineName":"819路","depId":null,"beginDate":"2016-08-29","department":{"version":null,"orgId":null,"orgPath":null,"depId":395,"depName":"通达公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.395.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:04:23","updateId":1,"updatetime":"2017-10-10 19:25:36","sn":8,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":66,"lineCode":"820","lineName":"820路","depId":null,"beginDate":"2012-09-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":397,"depName":"南大港分公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.397.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:15:25","updateId":1,"updatetime":"2017-10-10 19:25:29","sn":7,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2016年初由亚星6811更换为电车宇通6805 ","zt":0,"photo":"xianlutupian/201802/1ee748e9989543a1a3631d61dbf8385d.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":74,"lineCode":"8201","lineName":"8201路","depId":null,"beginDate":"2014-10-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":397,"depName":"南大港分公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.397.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:15:25","updateId":1,"updatetime":"2017-10-10 19:25:29","sn":7,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"6:50首班从南滕路发车，开往兴港桥，12:10分由新港桥开往南滕路。 第二圈1:30分由南滕路开往新港桥，5:50分由新港桥开往南滕路。 2016年初由亚星6811更换为电车宇通6805 ","zt":0,"photo":"xianlutupian/201802/1ee748e9989543a1a3631d61dbf8385d.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":67,"lineCode":"821","lineName":"821路","depId":null,"beginDate":"2012-09-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":397,"depName":"南大港分公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.397.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:15:25","updateId":1,"updatetime":"2017-10-10 19:25:29","sn":7,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2016年初由亚星6811更换为电车宇通6805 ","zt":0,"photo":"xianlutupian/201802/fed4b41de5b94ff2a1e3a1e2080e8cde.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":68,"lineCode":"822","lineName":"822路","depId":null,"beginDate":"2016-10-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":397,"depName":"南大港分公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.397.","orgType":1,"creatorId":1,"createtime":"2016-03-22 11:15:25","updateId":1,"updatetime":"2017-10-10 19:25:29","sn":7,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":""},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":5,"lineCode":"9","lineName":"9路","depId":null,"beginDate":"2000-01-28","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/5ba842b1c422489aa3d60e4aa6c619e9.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":69,"lineCode":"901","lineName":"901路","depId":null,"beginDate":"2014-01-09","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"2014年3月15日票价由5元制调整为2元制。 供暖、冷期（11月15日\u20142月底，5月15日-9月15日）实行3元制。 2014年3月28日，由6台黄海6890更换为福田LNG6105型客车 ","zt":0,"photo":"xianlutupian/201802/7d0e4708add244deb6ad25c89ab0ec35.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":70,"lineCode":"902","lineName":"902路","depId":null,"beginDate":"2015-08-08","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"单程运行55-60分钟","zt":0,"photo":"xianlutupian/201802/5ad727deac484b83b594eaabe560308d.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":77,"lineCode":"903","lineName":"903路","depId":null,"beginDate":"2017-08-30","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/9780655fc04443c4b3f0444fbc1d421d.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":71,"lineCode":"905","lineName":"905路","depId":null,"beginDate":"2017-05-06","department":{"version":null,"orgId":null,"orgPath":null,"depId":435,"depName":"大众巴士公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.435.","orgType":1,"creatorId":1,"createtime":"2017-05-18 12:41:16","updateId":1,"updatetime":"2017-10-10 19:23:54","sn":3,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":0,"photo":"xianlutupian/201802/36a0f861e24f43e19a265ec85f7bea68.png"},{"version":null,"orgId":null,"orgPath":null,"lineInfoId":81,"lineCode":"909","lineName":"909路","depId":null,"beginDate":"2017-04-01","department":{"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}},"beizhu":"","zt":1,"photo":""}]
//     */
//
//    private boolean success;
//    private List<DataBean> data;
//
//    public boolean isSuccess() {
//        return success;
//    }
//
//    public void setSuccess(boolean success) {
//        this.success = success;
//    }
//
//    public List<DataBean> getData() {
//        return data;
//    }
//
//    public void setData(List<DataBean> data) {
//        this.data = data;
//    }
//
//    public static class DataBean {
//        /**
//         * version : null
//         * orgId : null
//         * orgPath : null
//         * lineInfoId : 2
//         * lineCode : 1
//         * lineName : 1路
//         * depId : null
//         * beginDate : 1969-09-01
//         * department : {"version":null,"orgId":null,"orgPath":null,"depId":391,"depName":"一公司","depDesc":"","depLevel":2,"parentId":378,"path":"0.378.391.","orgType":1,"creatorId":1,"createtime":"2016-03-16 09:24:06","updateId":1,"updatetime":"2017-10-10 19:23:25","sn":1,"chargeIds":"","chargeNames":"","demension":{"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}}
//         * beizhu : 1路车共计车辆26台
//         * zt : 0
//         * photo : xianlutupian/201802/351abfa5a58d4a81bc9109e97c1a9a1f.png
//         */
//
//        private Object version;
//        private Object orgId;
//        private Object orgPath;
//        private int lineInfoId;
//        private String lineCode;
//        private String lineName;
//        private Object depId;
//        private String beginDate;
//        private DepartmentBean department;
//        private String beizhu;
//        private int zt;
//        private String photo;
//
//        public DataBean(String lineName,String lineCode) {
//            this.lineName = lineName;
//            this.lineCode = lineCode;
//        }
//
//        public Object getVersion() {
//            return version;
//        }
//
//        public void setVersion(Object version) {
//            this.version = version;
//        }
//
//        public Object getOrgId() {
//            return orgId;
//        }
//
//        public void setOrgId(Object orgId) {
//            this.orgId = orgId;
//        }
//
//        public Object getOrgPath() {
//            return orgPath;
//        }
//
//        public void setOrgPath(Object orgPath) {
//            this.orgPath = orgPath;
//        }
//
//        public int getLineInfoId() {
//            return lineInfoId;
//        }
//
//        public void setLineInfoId(int lineInfoId) {
//            this.lineInfoId = lineInfoId;
//        }
//
//        public String getLineCode() {
//            return lineCode;
//        }
//
//        public void setLineCode(String lineCode) {
//            this.lineCode = lineCode;
//        }
//
//        public String getLineName() {
//            return lineName;
//        }
//
//        public void setLineName(String lineName) {
//            this.lineName = lineName;
//        }
//
//        public Object getDepId() {
//            return depId;
//        }
//
//        public void setDepId(Object depId) {
//            this.depId = depId;
//        }
//
//        public String getBeginDate() {
//            return beginDate;
//        }
//
//        public void setBeginDate(String beginDate) {
//            this.beginDate = beginDate;
//        }
//
//        public DepartmentBean getDepartment() {
//            return department;
//        }
//
//        public void setDepartment(DepartmentBean department) {
//            this.department = department;
//        }
//
//        public String getBeizhu() {
//            return beizhu;
//        }
//
//        public void setBeizhu(String beizhu) {
//            this.beizhu = beizhu;
//        }
//
//        public int getZt() {
//            return zt;
//        }
//
//        public void setZt(int zt) {
//            this.zt = zt;
//        }
//
//        public String getPhoto() {
//            return photo;
//        }
//
//        public void setPhoto(String photo) {
//            this.photo = photo;
//        }
//
//        public static class DepartmentBean {
//            /**
//             * version : null
//             * orgId : null
//             * orgPath : null
//             * depId : 391
//             * depName : 一公司
//             * depDesc :
//             * depLevel : 2
//             * parentId : 378
//             * path : 0.378.391.
//             * orgType : 1
//             * creatorId : 1
//             * createtime : 2016-03-16 09:24:06
//             * updateId : 1
//             * updatetime : 2017-10-10 19:23:25
//             * sn : 1
//             * chargeIds :
//             * chargeNames :
//             * demension : {"version":null,"orgId":null,"orgPath":null,"demId":1,"demName":"行政维度","demDesc":"行政维度","demType":1}
//             */
//
//            private Object version;
//            private Object orgId;
//            private Object orgPath;
//            private int depId;
//            private String depName;
//            private String depDesc;
//            private int depLevel;
//            private int parentId;
//            private String path;
//            private int orgType;
//            private int creatorId;
//            private String createtime;
//            private int updateId;
//            private String updatetime;
//            private int sn;
//            private String chargeIds;
//            private String chargeNames;
//            private DemensionBean demension;
//
//            public Object getVersion() {
//                return version;
//            }
//
//            public void setVersion(Object version) {
//                this.version = version;
//            }
//
//            public Object getOrgId() {
//                return orgId;
//            }
//
//            public void setOrgId(Object orgId) {
//                this.orgId = orgId;
//            }
//
//            public Object getOrgPath() {
//                return orgPath;
//            }
//
//            public void setOrgPath(Object orgPath) {
//                this.orgPath = orgPath;
//            }
//
//            public int getDepId() {
//                return depId;
//            }
//
//            public void setDepId(int depId) {
//                this.depId = depId;
//            }
//
//            public String getDepName() {
//                return depName;
//            }
//
//            public void setDepName(String depName) {
//                this.depName = depName;
//            }
//
//            public String getDepDesc() {
//                return depDesc;
//            }
//
//            public void setDepDesc(String depDesc) {
//                this.depDesc = depDesc;
//            }
//
//            public int getDepLevel() {
//                return depLevel;
//            }
//
//            public void setDepLevel(int depLevel) {
//                this.depLevel = depLevel;
//            }
//
//            public int getParentId() {
//                return parentId;
//            }
//
//            public void setParentId(int parentId) {
//                this.parentId = parentId;
//            }
//
//            public String getPath() {
//                return path;
//            }
//
//            public void setPath(String path) {
//                this.path = path;
//            }
//
//            public int getOrgType() {
//                return orgType;
//            }
//
//            public void setOrgType(int orgType) {
//                this.orgType = orgType;
//            }
//
//            public int getCreatorId() {
//                return creatorId;
//            }
//
//            public void setCreatorId(int creatorId) {
//                this.creatorId = creatorId;
//            }
//
//            public String getCreatetime() {
//                return createtime;
//            }
//
//            public void setCreatetime(String createtime) {
//                this.createtime = createtime;
//            }
//
//            public int getUpdateId() {
//                return updateId;
//            }
//
//            public void setUpdateId(int updateId) {
//                this.updateId = updateId;
//            }
//
//            public String getUpdatetime() {
//                return updatetime;
//            }
//
//            public void setUpdatetime(String updatetime) {
//                this.updatetime = updatetime;
//            }
//
//            public int getSn() {
//                return sn;
//            }
//
//            public void setSn(int sn) {
//                this.sn = sn;
//            }
//
//            public String getChargeIds() {
//                return chargeIds;
//            }
//
//            public void setChargeIds(String chargeIds) {
//                this.chargeIds = chargeIds;
//            }
//
//            public String getChargeNames() {
//                return chargeNames;
//            }
//
//            public void setChargeNames(String chargeNames) {
//                this.chargeNames = chargeNames;
//            }
//
//            public DemensionBean getDemension() {
//                return demension;
//            }
//
//            public void setDemension(DemensionBean demension) {
//                this.demension = demension;
//            }
//
//            public static class DemensionBean {
//                /**
//                 * version : null
//                 * orgId : null
//                 * orgPath : null
//                 * demId : 1
//                 * demName : 行政维度
//                 * demDesc : 行政维度
//                 * demType : 1
//                 */
//
//                private Object version;
//                private Object orgId;
//                private Object orgPath;
//                private int demId;
//                private String demName;
//                private String demDesc;
//                private int demType;
//
//                public Object getVersion() {
//                    return version;
//                }
//
//                public void setVersion(Object version) {
//                    this.version = version;
//                }
//
//                public Object getOrgId() {
//                    return orgId;
//                }
//
//                public void setOrgId(Object orgId) {
//                    this.orgId = orgId;
//                }
//
//                public Object getOrgPath() {
//                    return orgPath;
//                }
//
//                public void setOrgPath(Object orgPath) {
//                    this.orgPath = orgPath;
//                }
//
//                public int getDemId() {
//                    return demId;
//                }
//
//                public void setDemId(int demId) {
//                    this.demId = demId;
//                }
//
//                public String getDemName() {
//                    return demName;
//                }
//
//                public void setDemName(String demName) {
//                    this.demName = demName;
//                }
//
//                public String getDemDesc() {
//                    return demDesc;
//                }
//
//                public void setDemDesc(String demDesc) {
//                    this.demDesc = demDesc;
//                }
//
//                public int getDemType() {
//                    return demType;
//                }
//
//                public void setDemType(int demType) {
//                    this.demType = demType;
//                }
//            }
//        }
//    }

}
