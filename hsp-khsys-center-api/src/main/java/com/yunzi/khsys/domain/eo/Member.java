package com.yunzi.khsys.domain.eo;


import java.util.*;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.ws.rs.QueryParam;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc custom_member
 * @author yunzi7758
 */
//@ApiModel(description = "hsp_datasource")
@TableName("custom_member")
public class Member extends SuperEntity {


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

        //@ApiModelProperty(value = "username")
        @QueryParam("username")
        private String username;

        //@ApiModelProperty(value = "pwd")
        @QueryParam("psw")
        private String psw;

        //@ApiModelProperty(value = "role")
        @QueryParam("role")
        private String role;

        //@ApiModelProperty(value = "status")
        @QueryParam("status")
        private String status;

        @TableField(exist = false)
        private String label;

        public String getLabel() {
                return remark1;
        }

        public void setLabel(String label) {
                this.label = label;
        }

        public String getValue() {
                return username;
        }

        public void setValue(String value) {
                this.value = value;
        }
        @TableField(exist = false)
        private String value;



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

        public void setUsername(String username){
        this.username = username;
        }

        public String getUsername(){
        return this.username;
        }

        public void setPsw(String psw){
        this.psw = psw;
        }

        public String getPsw(){
        return this.psw;
        }

        public void setRole(String role){
        this.role = role;
        }

        public String getRole(){
        return this.role;
        }

        public void setStatus(String status){
        this.status = status;
        }

        public String getStatus(){
        return this.status;
        }




}

