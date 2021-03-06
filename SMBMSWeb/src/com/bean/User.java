package com.bean;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.id
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userCode
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private String userCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userName
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userPassword
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.gender
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.birthday
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.phone
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.address
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.userRole
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Integer userRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.createdBy
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Long createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.creationDate
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Date creationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.modifyBy
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Long modifyBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column smbms_user.modifyDate
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    private Date modifyDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.id
     *
     * @return the value of smbms_user.id
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.id
     *
     * @param id the value for smbms_user.id
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userCode
     *
     * @return the value of smbms_user.userCode
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userCode
     *
     * @param userCode the value for smbms_user.userCode
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userName
     *
     * @return the value of smbms_user.userName
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userName
     *
     * @param userName the value for smbms_user.userName
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userPassword
     *
     * @return the value of smbms_user.userPassword
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userPassword
     *
     * @param userPassword the value for smbms_user.userPassword
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.gender
     *
     * @return the value of smbms_user.gender
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.gender
     *
     * @param gender the value for smbms_user.gender
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.birthday
     *
     * @return the value of smbms_user.birthday
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.birthday
     *
     * @param birthday the value for smbms_user.birthday
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.phone
     *
     * @return the value of smbms_user.phone
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.phone
     *
     * @param phone the value for smbms_user.phone
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.address
     *
     * @return the value of smbms_user.address
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.address
     *
     * @param address the value for smbms_user.address
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.userRole
     *
     * @return the value of smbms_user.userRole
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Integer getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.userRole
     *
     * @param userRole the value for smbms_user.userRole
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.createdBy
     *
     * @return the value of smbms_user.createdBy
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.createdBy
     *
     * @param createdBy the value for smbms_user.createdBy
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.creationDate
     *
     * @return the value of smbms_user.creationDate
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.creationDate
     *
     * @param creationDate the value for smbms_user.creationDate
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.modifyBy
     *
     * @return the value of smbms_user.modifyBy
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.modifyBy
     *
     * @param modifyBy the value for smbms_user.modifyBy
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column smbms_user.modifyDate
     *
     * @return the value of smbms_user.modifyDate
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column smbms_user.modifyDate
     *
     * @param modifyDate the value for smbms_user.modifyDate
     *
     * @mbggenerated Mon Aug 28 08:34:13 CST 2017
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}