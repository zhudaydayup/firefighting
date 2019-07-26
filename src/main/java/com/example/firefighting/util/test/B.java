package com.example.firefighting.util.test;

import com.example.firefighting.putData.qintian.DeadlineCorrect;
import com.example.firefighting.result.Result;
import com.example.firefighting.util.putdata.PutDataUtil;
import com.example.firefighting.util.url.PutData;


/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 17:28 2019/7/24
 * @ Description：${description}
 * @ Modified By：
 */
public class B {
    public static void main(String[] args) {
        DeadlineCorrect deadlineCorrect = new DeadlineCorrect();
        deadlineCorrect.setId("2019-07-24 16:29:50728");
        deadlineCorrect.setEnt_name("南京市玄武区懿家糕点食品店");
        deadlineCorrect.setSocial_credit_code("92320102MA1XTQGL1Clo");
        deadlineCorrect.setChecker_id("65fef4b0-a26d-4e14-b0e8-4112e0c4cb33");
        deadlineCorrect.setChecker("1");
        deadlineCorrect.setChecked_start_time("2019-07-24 11:23");
        deadlineCorrect.setChecked_end_time("2019-07-24 15:28");
        deadlineCorrect.setChecked_detail("11");
        deadlineCorrect.setChecked_status("");
        deadlineCorrect.setChecked_experts("");
        deadlineCorrect.setChecked_deps("");
        deadlineCorrect.setIs_correction("1");
        deadlineCorrect.setRecord_id("2019-07-24 11:24:56796");
        deadlineCorrect.setCorrection_detail("");
        deadlineCorrect.setNotice_law_document("");
        deadlineCorrect.setNotice_law_document_qr("");
        deadlineCorrect.setRecord_law_document("http://zfxc.njyjgl.cn/yjbd2/fightingPdf/20190724/1563938719322.pdf");
        deadlineCorrect.setRecord_law_document_qr("http://zfxc.njyjgl.cn/yjbd2/fireFighting/201907241563938720039.png");
        deadlineCorrect.setPunish_law_document("");
        deadlineCorrect.setPunish_law_document_qr("");
        deadlineCorrect.setRectify_law_document("http://zfxc.njyjgl.cn/yjbd2/zeling/20190724/201907241528289737.pdf");
        deadlineCorrect.setRectify_law_document_qr("");
        deadlineCorrect.setReview_law_document("");
        deadlineCorrect.setReview_law_document_qr("");
        deadlineCorrect.setRisk_level("合格");
        deadlineCorrect.setRisk_content("安全出口是否畅通__埋压、圈占、遮挡消火栓或者占用防火间距__单位室内消火栓、灭火器、疏散指示标志和应急照明未保持完好有效");
        deadlineCorrect.setChecked_type("");
        deadlineCorrect.setInspect_type("网格巡查");
        deadlineCorrect.setSupervisor_id("");
        deadlineCorrect.setRisk_point("重点要害单位");
        deadlineCorrect.setUnit_address("南京市玄武区新街口街道老虎桥7-2号");
        deadlineCorrect.setEnt_id("0095c336-6531-4d3b-93d0-e6302ea33234");
        deadlineCorrect.setDepartment_id("ad2a98e7-c8d1-4fcb-8e4d-f69262abdbca");
        DeadlineCorrect.FireSafetyBehaviorBean fireSafetyBehaviorBean =new DeadlineCorrect.FireSafetyBehaviorBean();
        fireSafetyBehaviorBean.setValue(1);
        fireSafetyBehaviorBean.setText("安全出口是否畅通");
        Result post = PutDataUtil.postByObj(PutData.FIRE_QIN_T.getUrl(), deadlineCorrect);
        System.out.println(post);
    }
}
