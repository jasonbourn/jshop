package com.jason.shop.common.base.model;

import org.joda.time.DateTime;

import java.util.Date;
  

  
/** 
 * session信息模型 
 *  
 * @author Linhai.Tan 
 */
public class JWT implements java.io.Serializable {  
  
    private static final long serialVersionUID = 1985257799572253054L;  
  
    /** 
     * token到期时间 
     */  
    private Date expirationDate;  
  
    private String memberId;
  
    private String username;

    public JWT(String id, String username) {
        this.memberId=id;
        this.username=username;
        expirationDate = DateTime.now().plusSeconds(7200).toDate();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public JWT() {
        super();
        expirationDate = DateTime.now().plusSeconds(7200).toDate();
    }  
} 