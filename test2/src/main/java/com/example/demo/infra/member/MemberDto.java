package com.example.demo.infra.member;

import java.util.Date;

public class MemberDto {

	private String memberSeq;
	private String memberName;
	private String memberId;
	private String memberPwd;
	private String memberEmail;
	private Integer genderCd;
	private String birthDay;
	private String phoneNumber;
	private Integer memberDelNy;
	private Date memberRegDate;
	private Date memberModDate;
	
	private String productSeq;
	private String productName;
	private Double productPrice;
	private Double productSalePrice;
	private Integer productGenderCd;
	private Integer productSeasonCd;
	private Integer productBestNy;
	private Integer productNewNy;
	private String memberSeqF;
	
	private String code;
	private String client_id;
	private String redirect_uri;
	private String response_type;
	
	public String getMemberSeq() {
		return memberSeq;
	}
	public void setMemberSeq(String memberSeq) {
		this.memberSeq = memberSeq;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Integer getGenderCd() {
		return genderCd;
	}
	public void setGenderCd(Integer genderCd) {
		this.genderCd = genderCd;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getMemberDelNy() {
		return memberDelNy;
	}
	public void setMemberDelNy(Integer memberDelNy) {
		this.memberDelNy = memberDelNy;
	}
	public Date getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(Date memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public Date getMemberModDate() {
		return memberModDate;
	}
	public void setMemberModDate(Date memberModDate) {
		this.memberModDate = memberModDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Double getProductSalePrice() {
		return productSalePrice;
	}
	public void setProductSalePrice(Double productSalePrice) {
		this.productSalePrice = productSalePrice;
	}
	public Integer getProductGenderCd() {
		return productGenderCd;
	}
	public void setProductGenderCd(Integer productGenderCd) {
		this.productGenderCd = productGenderCd;
	}
	public Integer getProductSeasonCd() {
		return productSeasonCd;
	}
	public void setProductSeasonCd(Integer productSeasonCd) {
		this.productSeasonCd = productSeasonCd;
	}
	@Override
	public String toString() {
		return "MemberDto [memberSeq=" + memberSeq + ", memberName=" + memberName + ", memberId=" + memberId
				+ ", memberPwd=" + memberPwd + ", memberEmail=" + memberEmail + ", genderCd=" + genderCd + ", birthDay="
				+ birthDay + ", phoneNumber=" + phoneNumber + ", memberDelNy=" + memberDelNy + ", memberRegDate="
				+ memberRegDate + ", memberModDate=" + memberModDate + "]";
	}
	public Integer getProductBestNy() {
		return productBestNy;
	}
	public void setProductBestNy(Integer productBestNy) {
		this.productBestNy = productBestNy;
	}
	public Integer getProductNewNy() {
		return productNewNy;
	}
	public void setProductNewNy(Integer productNewNy) {
		this.productNewNy = productNewNy;
	}
	public String getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(String productSeq) {
		this.productSeq = productSeq;
	}
	public String getMemberSeqF() {
		return memberSeqF;
	}
	public void setMemberSeqF(String memberSeqF) {
		this.memberSeqF = memberSeqF;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getRedirect_uri() {
		return redirect_uri;
	}
	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}
	public String getResponse_type() {
		return response_type;
	}
	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}
	
	

}
