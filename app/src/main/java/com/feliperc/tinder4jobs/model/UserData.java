package com.feliperc.tinder4jobs.model;

public  class UserData {

	//private variables
    int _id;
    String _name;
    String _email;
 
    // Empty constructor
    public UserData(){
 
    }
    // constructor
    public UserData(int id, String name, String email){
        this._id = id;
        this._name = name;
        this._email = email;
    }
 
    // constructor
    public UserData(String name, String email){
        this._name = name;
        this._email = email;
    }
    // getting ID
    public int getID(){
        return this._id;
    }
 
    // setting id
    public void setID(int id){
        this._id = id;
    }
 
    // getting name
    public String getName(){
        return this._name;
    }
 
    // setting name
    public void setName(String name){
        this._name = name;
    }
 
    // getting email
    public String getEmail(){
        return this._email;
    }
 
    // setting email
    public void setEmail(String email){
        this._email = email;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInfo [name=" + _name + ", email=" + _email + "]";
	}
	
}
