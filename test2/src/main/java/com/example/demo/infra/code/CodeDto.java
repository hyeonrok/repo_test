package com.example.demo.infra.code;

import java.util.Date;

public class CodeDto {

	private String seq;
	private String name;
	private String memo;
	private Date reqDatetime;
	private Date modDatetime;
	private Integer delNy;
	private String codegroup_seq;
	private String codegroupseq;
	private String codegroupname;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getReqDatetime() {
		return reqDatetime;
	}
	public void setReqDatetime(Date reqDatetime) {
		this.reqDatetime = reqDatetime;
	}
	public Date getModDatetime() {
		return modDatetime;
	}
	public void setModDatetime(Date modDatetime) {
		this.modDatetime = modDatetime;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public String getCodegroup_seq() {
		return codegroup_seq;
	}
	public void setCodegroup_seq(String codegroup_seq) {
		this.codegroup_seq = codegroup_seq;
	}
	public String getCodegroupseq() {
		return codegroupseq;
	}
	public void setCodegroupseq(String codegroupseq) {
		this.codegroupseq = codegroupseq;
	}
	public String getCodegroupname() {
		return codegroupname;
	}
	public void setCodegroupname(String codegroupname) {
		this.codegroupname = codegroupname;
	}
	@Override
	public String toString() {
		return "CodeDto [seq=" + seq + ", name=" + name + ", memo=" + memo + ", reqDatetime=" + reqDatetime
				+ ", modDatetime=" + modDatetime + ", delNy=" + delNy + ", codegroup_seq=" + codegroup_seq
				+ ", codegroupseq=" + codegroupseq + ", codegroupname=" + codegroupname + "]";
	}
	
	
	
}
