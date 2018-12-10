package bokesoft.xialj.demo.dubbo.bean;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class ResultVO implements Serializable{
	private static final long serialVersionUID = 201811210001L;
	private String id;
	private boolean suceess;
	private String errMsg;
	private String data;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isSuceess() {
		return suceess;
	}
	public void setSuceess(boolean suceess) {
		this.suceess = suceess;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String toStirng(){
		return JSON.toJSONString(this);		
	}
	
}
