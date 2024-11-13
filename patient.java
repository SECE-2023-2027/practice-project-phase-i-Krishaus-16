package com.emr.entities;


public class patient {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String contactInfo;

    public patient(String id, String name, int age, String gender, String contactInfo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactInfo = contactInfo;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

	public static boolean containsKey(String patientId) {
		// TODO Auto-generated method stub
		return false;
	}
}
