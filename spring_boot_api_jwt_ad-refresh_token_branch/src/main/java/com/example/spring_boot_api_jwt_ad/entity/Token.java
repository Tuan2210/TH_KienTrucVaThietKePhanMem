package com.example.spring_boot_api_jwt_ad.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_token")
@Getter
@Setter
public class Token extends BaseEntity {

    @Column(length = 1000)
    private String token;

    private Date tokenExpDate;
    
    public User user;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getTokenExpDate() {
		return tokenExpDate;
	}

	public void setTokenExpDate(Date tokenExpDate) {
		this.tokenExpDate = tokenExpDate;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Token(String token, Date tokenExpDate) {
		super();
		this.token = token;
		this.tokenExpDate = tokenExpDate;
	}

	public Token() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Token [token=" + token + ", tokenExpDate=" + tokenExpDate + "]";
	}

	public void setCreatedBy(Long userId) {
		// TODO Auto-generated method stub
//		this.user.get
		
	}

    
}
