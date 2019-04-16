package com.yunzi.khsys.domain.eo;


import java.util.*;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.ws.rs.QueryParam;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc custom_mortgage_schedule
 * @author yunzi7758
 */
//@ApiModel(description = "hsp_datasource")
@TableName("custom_mortgage_schedule")
public class MortgageSchedule extends SuperEntity {


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

        //@ApiModelProperty(value = "是否有执照（执照多久）")
        @QueryParam("haveLicense")
        private String haveLicense;

        //@ApiModelProperty(value = "是否有场地上门考察")
        @QueryParam("havaGroud")
        private String havaGroud;

        //@ApiModelProperty(value = "客户需求点")
        @QueryParam("requement")
        private String requement;

        //@ApiModelProperty(value = "评估是否上门评估")
        @QueryParam("bankTohome")
        private String bankTohome;

        //@ApiModelProperty(value = "银行资料是否收齐")
        @QueryParam("bankZl")
        private String bankZl;

        //@ApiModelProperty(value = "同贷书预计什么时候出（如果出了额度是多少）")
        @QueryParam("bankLoadBook")
        private String bankLoadBook;

        //@ApiModelProperty(value = "预计要垫资额度")
        @QueryParam("advanceAmount")
        private String advanceAmount;

        //@ApiModelProperty(value = "第三方收款是谁")
        @QueryParam("thirdParty")
        private String thirdParty;



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

        public void setHaveLicense(String haveLicense){
        this.haveLicense = haveLicense;
        }

        public String getHaveLicense(){
        return this.haveLicense;
        }

        public void setHavaGroud(String havaGroud){
        this.havaGroud = havaGroud;
        }

        public String getHavaGroud(){
        return this.havaGroud;
        }

        public void setRequement(String requement){
        this.requement = requement;
        }

        public String getRequement(){
        return this.requement;
        }

        public void setBankTohome(String bankTohome){
        this.bankTohome = bankTohome;
        }

        public String getBankTohome(){
        return this.bankTohome;
        }

        public void setBankZl(String bankZl){
        this.bankZl = bankZl;
        }

        public String getBankZl(){
        return this.bankZl;
        }

        public void setBankLoadBook(String bankLoadBook){
        this.bankLoadBook = bankLoadBook;
        }

        public String getBankLoadBook(){
        return this.bankLoadBook;
        }

        public void setAdvanceAmount(String advanceAmount){
        this.advanceAmount = advanceAmount;
        }

        public String getAdvanceAmount(){
        return this.advanceAmount;
        }

        public void setThirdParty(String thirdParty){
        this.thirdParty = thirdParty;
        }

        public String getThirdParty(){
        return this.thirdParty;
        }




}

