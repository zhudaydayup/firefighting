package com.example.firefighting.putData.qintian;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 15:22 2019/7/24
 * @ Description：${description}
 * @ Modified By：
 */
public class CheckRecord {

    /**
     * id : 记录标识
     * ent_name : 单位名称
     * social_credit_code : 统一社会信用代码
     * checker_id : 检查人用户标识
     * checker : 检查人
     * checked_start_time : 检查开始时间
     * checked_end_time : 检查结束时间
     * checked_detail : 检查情况
     * checked_status : 检查状态
     * checked_experts : 执法专家
     * checked_deps : 执法部门
     * is_correction : 检查状态:0(正常)、1(限期整改)、2、(立即整改)
     * record_id : 执法记录ID
     * correction_detail : 处罚决定/整改措施
     * notice_law_document : 通知书
     * notice_law_document_qr : 通知书二维码
     * record_law_document : 检查记录文书
     * record_law_document_qr : 检查记录二维码
     * punish_law_document : 现场整改文书
     * punish_law_document_qr : 现场整改二维码
     * rectify_law_document : 责令整改文书
     * rectify_law_document_qr : 责令整改文书二维码
     * review_law_document : 复查文书
     * review_law_document_qr : 复查文书二维码
     * risk_level : 隐患级别（合格,责令整改,现场整改,重大隐患上报）
     * risk_content : 隐患内容
     * checked_type : 检查类型（企业内查、专业检查、执法监督）
     * inspect_type : 巡查类型（网格巡查、重点监管）
     * supervisor_id : 企业对应安监员的id
     * risk_point : 风险点
     * unit_address : 单位地址
     * ent_id : 单位唯一标识
     * department_id : 部门标识
     * fire_safety_behavior : [{"value":"1","text":"消防设计、竣工。。。"}]
     * rectification_deadline : 责令限期整改-截止时间
     */

    private String id;
    private String ent_name;
    private String social_credit_code;
    private String checker_id;
    private String checker;
    private String checked_start_time;
    private String checked_end_time;
    private String checked_detail;
    private String checked_status;
    private String checked_experts;
    private String checked_deps;
    private String is_correction;
    private String record_id;
    private String correction_detail;
    private String notice_law_document;
    private String notice_law_document_qr;
    private String record_law_document;
    private String record_law_document_qr;
    private String punish_law_document;
    private String punish_law_document_qr;
    private String rectify_law_document;
    private String rectify_law_document_qr;
    private String review_law_document;
    private String review_law_document_qr;
    private String risk_level;
    private String risk_content;
    private String checked_type;
    private String inspect_type;
    private String supervisor_id;
    private String risk_point;
    private String unit_address;
    private String ent_id;
    private String department_id;
//    private String rectification_deadline;
//    private List<FireSafetyBehaviorBean> fire_safety_behavior;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnt_name() {
        return ent_name;
    }

    public void setEnt_name(String ent_name) {
        this.ent_name = ent_name;
    }

    public String getSocial_credit_code() {
        return social_credit_code;
    }

    public void setSocial_credit_code(String social_credit_code) {
        this.social_credit_code = social_credit_code;
    }

    public String getChecker_id() {
        return checker_id;
    }

    public void setChecker_id(String checker_id) {
        this.checker_id = checker_id;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getChecked_start_time() {
        return checked_start_time;
    }

    public void setChecked_start_time(String checked_start_time) {
        this.checked_start_time = checked_start_time;
    }

    public String getChecked_end_time() {
        return checked_end_time;
    }

    public void setChecked_end_time(String checked_end_time) {
        this.checked_end_time = checked_end_time;
    }

    public String getChecked_detail() {
        return checked_detail;
    }

    public void setChecked_detail(String checked_detail) {
        this.checked_detail = checked_detail;
    }

    public String getChecked_status() {
        return checked_status;
    }

    public void setChecked_status(String checked_status) {
        this.checked_status = checked_status;
    }

    public String getChecked_experts() {
        return checked_experts;
    }

    public void setChecked_experts(String checked_experts) {
        this.checked_experts = checked_experts;
    }

    public String getChecked_deps() {
        return checked_deps;
    }

    public void setChecked_deps(String checked_deps) {
        this.checked_deps = checked_deps;
    }

    public String getIs_correction() {
        return is_correction;
    }

    public void setIs_correction(String is_correction) {
        this.is_correction = is_correction;
    }

    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }

    public String getCorrection_detail() {
        return correction_detail;
    }

    public void setCorrection_detail(String correction_detail) {
        this.correction_detail = correction_detail;
    }

    public String getNotice_law_document() {
        return notice_law_document;
    }

    public void setNotice_law_document(String notice_law_document) {
        this.notice_law_document = notice_law_document;
    }

    public String getNotice_law_document_qr() {
        return notice_law_document_qr;
    }

    public void setNotice_law_document_qr(String notice_law_document_qr) {
        this.notice_law_document_qr = notice_law_document_qr;
    }

    public String getRecord_law_document() {
        return record_law_document;
    }

    public void setRecord_law_document(String record_law_document) {
        this.record_law_document = record_law_document;
    }

    public String getRecord_law_document_qr() {
        return record_law_document_qr;
    }

    public void setRecord_law_document_qr(String record_law_document_qr) {
        this.record_law_document_qr = record_law_document_qr;
    }

    public String getPunish_law_document() {
        return punish_law_document;
    }

    public void setPunish_law_document(String punish_law_document) {
        this.punish_law_document = punish_law_document;
    }

    public String getPunish_law_document_qr() {
        return punish_law_document_qr;
    }

    public void setPunish_law_document_qr(String punish_law_document_qr) {
        this.punish_law_document_qr = punish_law_document_qr;
    }

    public String getRectify_law_document() {
        return rectify_law_document;
    }

    public void setRectify_law_document(String rectify_law_document) {
        this.rectify_law_document = rectify_law_document;
    }

    public String getRectify_law_document_qr() {
        return rectify_law_document_qr;
    }

    public void setRectify_law_document_qr(String rectify_law_document_qr) {
        this.rectify_law_document_qr = rectify_law_document_qr;
    }

    public String getReview_law_document() {
        return review_law_document;
    }

    public void setReview_law_document(String review_law_document) {
        this.review_law_document = review_law_document;
    }

    public String getReview_law_document_qr() {
        return review_law_document_qr;
    }

    public void setReview_law_document_qr(String review_law_document_qr) {
        this.review_law_document_qr = review_law_document_qr;
    }

    public String getRisk_level() {
        return risk_level;
    }

    public void setRisk_level(String risk_level) {
        this.risk_level = risk_level;
    }

    public String getRisk_content() {
        return risk_content;
    }

    public void setRisk_content(String risk_content) {
        this.risk_content = risk_content;
    }

    public String getChecked_type() {
        return checked_type;
    }

    public void setChecked_type(String checked_type) {
        this.checked_type = checked_type;
    }

    public String getInspect_type() {
        return inspect_type;
    }

    public void setInspect_type(String inspect_type) {
        this.inspect_type = inspect_type;
    }

    public String getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(String supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    public String getRisk_point() {
        return risk_point;
    }

    public void setRisk_point(String risk_point) {
        this.risk_point = risk_point;
    }

    public String getUnit_address() {
        return unit_address;
    }

    public void setUnit_address(String unit_address) {
        this.unit_address = unit_address;
    }

    public String getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(String ent_id) {
        this.ent_id = ent_id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }


    @Override
    public String toString() {
        return "CheckRecord{" +
                "id='" + id + '\'' +
                ", ent_name='" + ent_name + '\'' +
                ", social_credit_code='" + social_credit_code + '\'' +
                ", checker_id='" + checker_id + '\'' +
                ", checker='" + checker + '\'' +
                ", checked_start_time='" + checked_start_time + '\'' +
                ", checked_end_time='" + checked_end_time + '\'' +
                ", checked_detail='" + checked_detail + '\'' +
                ", checked_status='" + checked_status + '\'' +
                ", checked_experts='" + checked_experts + '\'' +
                ", checked_deps='" + checked_deps + '\'' +
                ", is_correction='" + is_correction + '\'' +
                ", record_id='" + record_id + '\'' +
                ", correction_detail='" + correction_detail + '\'' +
                ", notice_law_document='" + notice_law_document + '\'' +
                ", notice_law_document_qr='" + notice_law_document_qr + '\'' +
                ", record_law_document='" + record_law_document + '\'' +
                ", record_law_document_qr='" + record_law_document_qr + '\'' +
                ", punish_law_document='" + punish_law_document + '\'' +
                ", punish_law_document_qr='" + punish_law_document_qr + '\'' +
                ", rectify_law_document='" + rectify_law_document + '\'' +
                ", rectify_law_document_qr='" + rectify_law_document_qr + '\'' +
                ", review_law_document='" + review_law_document + '\'' +
                ", review_law_document_qr='" + review_law_document_qr + '\'' +
                ", risk_level='" + risk_level + '\'' +
                ", risk_content='" + risk_content + '\'' +
                ", checked_type='" + checked_type + '\'' +
                ", inspect_type='" + inspect_type + '\'' +
                ", supervisor_id='" + supervisor_id + '\'' +
                ", risk_point='" + risk_point + '\'' +
                ", unit_address='" + unit_address + '\'' +
                ", ent_id='" + ent_id + '\'' +
                ", department_id='" + department_id + '\'' +
                '}';
    }
}
