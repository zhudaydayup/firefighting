package com.example.firefighting.util.test;

import com.example.firefighting.putData.qintian.CheckRecord;
import com.example.firefighting.result.Result;
import com.example.firefighting.util.putdata.PutDataUtil;
import com.example.firefighting.util.url.PutData;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 16:56 2019/7/24
 * @ Description：${description}
 * @ Modified By：
 */
public class A {
    public static void main(String[] args) {
        CheckRecord checkRecord = new CheckRecord();
        checkRecord.setId("2019-07-24 16:29:50728");
        checkRecord.setEnt_name("南京市玄武区懿家糕点食品店");
        checkRecord.setSocial_credit_code("92320102MA1XTQGL1Clo");
        checkRecord.setChecker_id("65fef4b0-a26d-4e14-b0e8-4112e0c4cb33");
        checkRecord.setChecker("1");
        checkRecord.setChecked_start_time("2019-07-24 11:23");
        checkRecord.setChecked_end_time("2019-07-24 15:28");
        checkRecord.setChecked_detail("11");
        checkRecord.setChecked_status("");
        checkRecord.setChecked_experts("");
        checkRecord.setChecked_deps("");
        checkRecord.setIs_correction("1");
        checkRecord.setRecord_id("2019-07-24 11:24:56796");
        checkRecord.setCorrection_detail("");
        checkRecord.setNotice_law_document("");
        checkRecord.setNotice_law_document_qr("");
        checkRecord.setRecord_law_document("http://zfxc.njyjgl.cn/yjbd2/fightingPdf/20190724/1563938719322.pdf");
        checkRecord.setRecord_law_document_qr("http://zfxc.njyjgl.cn/yjbd2/fireFighting/201907241563938720039.png");
        checkRecord.setPunish_law_document("");
        checkRecord.setPunish_law_document_qr("");
        checkRecord.setRectify_law_document("http://zfxc.njyjgl.cn/yjbd2/zeling/20190724/201907241528289737.pdf");
        checkRecord.setRectify_law_document_qr("");
        checkRecord.setReview_law_document("");
        checkRecord.setReview_law_document_qr("");
        checkRecord.setRisk_level("合格");
        checkRecord.setRisk_content("安全出口是否畅通__埋压、圈占、遮挡消火栓或者占用防火间距__单位室内消火栓、灭火器、疏散指示标志和应急照明未保持完好有效");
        checkRecord.setChecked_type("");
        checkRecord.setInspect_type("网格巡查");
        checkRecord.setSupervisor_id("");
        checkRecord.setRisk_point("重点要害单位");
        checkRecord.setUnit_address("南京市玄武区新街口街道老虎桥7-2号");
        checkRecord.setEnt_id("0095c336-6531-4d3b-93d0-e6302ea33234");
        checkRecord.setDepartment_id("ad2a98e7-c8d1-4fcb-8e4d-f69262abdbca");
        System.out.println(checkRecord.toString());
        Result post = PutDataUtil.postByObj(PutData.FIRE_QIN_T.getUrl(),checkRecord);
        System.out.println(post);
    }
}
