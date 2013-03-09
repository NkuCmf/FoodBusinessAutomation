package fba.models;

public class SystemUser {
	private int _systemUserId;
	private String _userName;
	
	public SystemUser(int systemUserId)
	{
		_systemUserId = systemUserId;
	}
	
	public String getUserName()
	{
		return _userName;
	}
}
