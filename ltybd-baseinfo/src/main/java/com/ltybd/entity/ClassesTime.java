package com.ltybd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="班次时间2")
@Entity
@Table(name = "op_classes_time")
public class ClassesTime {
	
	@Id
	@ApiModelProperty(value = "班次时间id",hidden=true)
	private Integer classes_time_id;
	
	@ApiModelProperty(value = "开始时间")
	@JsonFormat(timezone = "GMT+8",pattern = "HH:mm")
	@DateTimeFormat(pattern="HH:mm")
	@NotNull(message="开始时间不能为空")
	private Date start_time;
	
	@ApiModelProperty(value = "结束时间")
	@JsonFormat(timezone = "GMT+8",pattern = "HH:mm")
	@DateTimeFormat(pattern="HH:mm")
	@NotNull(message="结束时间不能为空")
	private Date end_time;
	
	@ApiModelProperty(value = "班次id")
	@NotNull(message="请传入所属班次")
	@Min(value=1,message="必须为大于或者等于1的正整数")
	private Integer classes_id;
	
	@Column(insertable=false,updatable=false)
	@ApiModelProperty(value = "班次名称",hidden=true)
	private String classes_name;
	
	@ApiModelProperty(value="创建时间(yyyy-MM-dd HH:mm:ss)",hidden=true)
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date create_date;

	public Integer getClasses_time_id() {
		return classes_time_id;
	}

	public void setClasses_time_id(Integer classes_time_id) {
		this.classes_time_id = classes_time_id;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Integer getClasses_id() {
		return classes_id;
	}

	public void setClasses_id(Integer classes_id) {
		this.classes_id = classes_id;
	}
	
	public String getClasses_name() {
		return classes_name;
	}

	public void setClasses_name(String classes_name) {
		this.classes_name = classes_name;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
}
