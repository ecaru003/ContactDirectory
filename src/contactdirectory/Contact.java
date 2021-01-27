package contactdirectory;


import java.io.Serializable;


public class Contact implements Comparable, Serializable{
    private String contactName;
    private String workPhone;
    private String homePhone;
    private String cellPhone;
    private String workEmail;
    private String personalEmail;
    private String address;
    private String customDescription;
    private int uniqueID;
    
    
    // A long list of getters and setters below////////////////////////////////
    public void setID(int id){
        uniqueID=id;
    }
    public Contact(int id){
        uniqueID = id;
    }
    public int getID(){
        return uniqueID;
    }
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String homeEmail) {
        this.personalEmail = homeEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomDescription() {
        return customDescription;
    }

    public void setCustomDescription(String customDescription) {
        this.customDescription = customDescription;
    }
    public String toString(){
        return contactName;
    }
    //Ends of getters and setters///////////////////////////////////////

    //necessary for Java's .sort method, as it requires a comparator
    @Override
    public int compareTo(Object t) {
        String s1 = this.getContactName();
        String s2 = ((Contact)t).getContactName();
        //System.out.println(s1.compareToIgnoreCase(s2));
        return s1.compareToIgnoreCase(s2);
        
    }

    
    
}
