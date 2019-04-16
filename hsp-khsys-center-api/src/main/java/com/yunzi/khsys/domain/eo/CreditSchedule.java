package com.yunzi.khsys.domain.eo;


import java.util.*;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.ws.rs.QueryParam;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc custom_credit_schedule
 * @author yunzi7758
 */
//@ApiModel(description = "hsp_datasource")
@TableName("custom_credit_schedule")
public class CreditSchedule extends SuperEntity {


        //@ApiModelProperty(value = "乐观锁")
        @QueryParam("version")
        private Integer version;

        //@ApiModelProperty(value = "创建人")
        @QueryParam("createdBy")
        private String createdBy;

        //@ApiModelProperty(value = "创建时间")
        @QueryParam("createdAt")
        private Date createdAt;

        //@ApiModelProperty(value = "更新人")
        @QueryParam("updatedBy")
        private String updatedBy;

        //@ApiModelProperty(value = "更新时间")
        @QueryParam("updatedAt")
        private Date updatedAt;

        //@ApiModelProperty(value = "ID")
        @QueryParam("id")
        private String id;

        //@ApiModelProperty(value = "TENANT_CODE")
        @QueryParam("tenantCode")
        private String tenantCode;

        //@ApiModelProperty(value = "DR")
        @QueryParam("dr")
        private Integer dr;

        //@ApiModelProperty(value = "REMARK")
        @QueryParam("remark1")
        private String remark1;

        //@ApiModelProperty(value = "REMARK")
        @QueryParam("remark2")
        private String remark2;

        //@ApiModelProperty(value = "REMARK")
        @QueryParam("remark3")
        private String remark3;

        //@ApiModelProperty(value = "客户ID")
        @QueryParam("customId")
        private String customId;

        //@ApiModelProperty(value = "客户姓名")
        @QueryParam("customName")
        private String customName;

        //@ApiModelProperty(value = "业务人员ID")
        @QueryParam("busineserId")
        private String busineserId;

        //@ApiModelProperty(value = "业务人员姓名")
        @QueryParam("busineserName")
        private String busineserName;

        //@ApiModelProperty(value = "申请金额")
        @QueryParam("amount")
        private String amount;

        //@ApiModelProperty(value = "点数")
        @QueryParam("dot")
        private String dot;

        //@ApiModelProperty(value = "客户进件银行")
        @QueryParam("bankName")
        private String bankName;

        //@ApiModelProperty(value = "注意事项")
        @QueryParam("notes")
        private String notes;

        //@ApiModelProperty(value = "资料是否准备好")
        @QueryParam("readyDetail")
        private String readyDetail;

        //@ApiModelProperty(value = "银行申请进度")
        @QueryParam("bankProgress")
        private String bankProgress;

        //@ApiModelProperty(value = "预计放款时间")
        @QueryParam("bankAmountTime")
        private Date bankAmountTime;

        //@ApiModelProperty(value = "是否录入代扣系统（谁录入）")
        @QueryParam("dkSystem")
        private String dkSystem;



        public void setVersion(Integer version){
        this.version = version;
        }

        public Integer getVersion(){
        return this.version;
        }

        public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
        }

        public String getCreatedBy(){
        return this.createdBy;
        }

        public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
        }

        public Date getCreatedAt(){
        return this.createdAt;
        }

        public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
        }

        public String getUpdatedBy(){
        return this.updatedBy;
        }

        public void setUpdatedAt(Date updatedAt){
        this.updatedAt = updatedAt;
        }

        public Date getUpdatedAt(){
        return this.updatedAt;
        }

        public void setId(String id){
        this.id = id;
        }

        public String getId(){
        return this.id;
        }

        public void setTenantCode(String tenantCode){
        this.tenantCode = tenantCode;
        }

        public String getTenantCode(){
        return this.tenantCode;
        }

        public void setDr(Integer dr){
        this.dr = dr;
        }

        public Integer getDr(){
        return this.dr;
        }

        public void setRemark1(String remark1){
        this.remark1 = remark1;
        }

        public String getRemark1(){
        return this.remark1;
        }

        public void setRemark2(String remark2){
        this.remark2 = remark2;
        }

        public String getRemark2(){
        return this.remark2;
        }

        public void setRemark3(String remark3){
        this.remark3 = remark3;
        }

        public String getRemark3(){
        return this.remark3;
        }

        public void setCustomId(String customId){
        this.customId = customId;
        }

        public String getCustomId(){
        return this.customId;
        }

        public void setCustomName(String customName){
        this.customName = customName;
        }

        public String getCustomName(){
        return this.customName;
        }

        public void setBusineserId(String busineserId){
        this.busineserId = busineserId;
        }

        public String getBusineserId(){
        return this.busineserId;
        }

        public void setBusineserName(String busineserName){
        this.busineserName = busineserName;
        }

        public String getBusineserName(){
        return this.busineserName;
        }

        public void setAmount(String amount){
        this.amount = amount;
        }

        public String getAmount(){
        return this.amount;
        }

        public void setDot(String dot){
        this.dot = dot;
        }

        public String getDot(){
        return this.dot;
        }

        public void setBankName(String bankName){
        this.bankName = bankName;
        }

        public String getBankName(){
        return this.bankName;
        }

        public void setNotes(String notes){
        this.notes = notes;
        }

        public String getNotes(){
        return this.notes;
        }

        public void setReadyDetail(String readyDetail){
        this.readyDetail = readyDetail;
        }

        public String getReadyDetail(){
        return this.readyDetail;
        }

        public void setBankProgress(String bankProgress){
        this.bankProgress = bankProgress;
        }

        public String getBankProgress(){
        return this.bankProgress;
        }

        public void setBankAmountTime(Date bankAmountTime){
        this.bankAmountTime = bankAmountTime;
        }

        public Date getBankAmountTime(){
        return this.bankAmountTime;
        }

        public void setDkSystem(String dkSystem){
        this.dkSystem = dkSystem;
        }

        public String getDkSystem(){
        return this.dkSystem;
        }




}

