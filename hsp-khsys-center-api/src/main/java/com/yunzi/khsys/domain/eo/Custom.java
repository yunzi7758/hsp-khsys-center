package com.yunzi.khsys.domain.eo;


import java.util.*;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.ws.rs.QueryParam;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc custom_custom
 * @author yunzi7758
 */
//@ApiModel(description = "hsp_datasource")
@TableName("custom_custom")
public class Custom extends SuperEntity {

        @TableField(exist = false)
        private String label;

        public String getLabel() {
                return name;
        }

        public void setLabel(String label) {
                this.label = label;
        }

        public String getValue() {
                return id;
        }

        public void setValue(String value) {
                this.value = value;
        }
        @TableField(exist = false)
        private String value;
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

        //@ApiModelProperty(value = "类型")
        @QueryParam("type")
        private String type;

        //@ApiModelProperty(value = "名字")
        @QueryParam("name")
        private String name;

        //@ApiModelProperty(value = "手机")
        @QueryParam("mobilePhone")
        private String mobilePhone;

        //@ApiModelProperty(value = "是否有房")
        @QueryParam("house")
        private String house;

        //@ApiModelProperty(value = "房产详细情况")
        @QueryParam("houseDetail")
        private String houseDetail;

        //@ApiModelProperty(value = "条件")
        @QueryParam("conditions")
        private String conditions;

        //@ApiModelProperty(value = "负债")
        @QueryParam("liability")
        private String liability;

        //@ApiModelProperty(value = "客户性格")
        @QueryParam("mold")
        private String mold;

        //@ApiModelProperty(value = "客户什么时候需要资金")
        @QueryParam("needTime")
        private String needTime;

        //@ApiModelProperty(value = "发现问题（纠结点/打压点)")
        @QueryParam("problem")
        private String problem;

        //@ApiModelProperty(value = "成交状态")
        @QueryParam("trancStatus")
        private String trancStatus;

        //@ApiModelProperty(value = "跟进经理")
        @QueryParam("managerName")
        private String managerName;

        @QueryParam("managerId")
        private String managerId;

        public String getManagerId() {
                return managerId;
        }

        public void setManagerId(String managerId) {
                this.managerId = managerId;
        }

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

        public void setType(String type){
        this.type = type;
        }

        public String getType(){
        return this.type;
        }

        public void setName(String name){
        this.name = name;
        }

        public String getName(){
        return this.name;
        }

        public void setMobilePhone(String mobilePhone){
        this.mobilePhone = mobilePhone;
        }

        public String getMobilePhone(){
        return this.mobilePhone;
        }

        public void setHouse(String house){
        this.house = house;
        }

        public String getHouse(){
        return this.house;
        }

        public void setHouseDetail(String houseDetail){
        this.houseDetail = houseDetail;
        }

        public String getHouseDetail(){
        return this.houseDetail;
        }

        public void setConditions(String conditions){
        this.conditions = conditions;
        }

        public String getConditions(){
        return this.conditions;
        }

        public void setLiability(String liability){
        this.liability = liability;
        }

        public String getLiability(){
        return this.liability;
        }

        public void setMold(String mold){
        this.mold = mold;
        }

        public String getMold(){
        return this.mold;
        }

        public String getNeedTime() {
                return needTime;
        }

        public void setNeedTime(String needTime) {
                this.needTime = needTime;
        }

        public void setProblem(String problem){
        this.problem = problem;
        }

        public String getProblem(){
        return this.problem;
        }

        public void setTrancStatus(String trancStatus){
        this.trancStatus = trancStatus;
        }

        public String getTrancStatus(){
        return this.trancStatus;
        }

        public void setManagerName(String managerName){
        this.managerName = managerName;
        }

        public String getManagerName(){
        return this.managerName;
        }




}

