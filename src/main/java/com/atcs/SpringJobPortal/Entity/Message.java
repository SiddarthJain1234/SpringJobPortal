package com.atcs.SpringJobPortal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="message")

public class Message {
	
	
	
	
	
	public Message(int message_id, String message) {
		super();
		this.message_id = message_id;
		this.message = message;
	}
	Message(){
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int message_id;
	@Column
	String message;
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
