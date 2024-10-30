package kr.or.connect.daoexam.dto;

public class Role {
	private int role_Id;
	private String description;
	public int getRole_Id() {
		return role_Id;
	}
	public void setRole_Id(int role_Id) {
		this.role_Id = role_Id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Role [role_Id=" + role_Id + ", description=" + description + "]";
	}
	
	
}
