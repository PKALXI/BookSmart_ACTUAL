/*********************************************************************
 * Customer.java
 *
 * This class represents a customer
 * @author  Pranav Kalsi
 * @since   2020-11-04
 ********************************************************************
 */
public class Customer {
    //Fields and Attributes of a customer object
    private String firstName;
    private String email;
    private String lastName;
    private String password;
    private String username;
    private SurveyData surveyData;

    /**
     * Constructor method
     */
    public Customer(){}//end of empty constructors

    /**
     * Constructor method
     */
    public Customer(String firstName, String email, String lastName, String password, String username, SurveyData surveyData){
        //set the attributes to the corresponding parameters
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
        this.password = password;
        this.username = username;
        this.surveyData = new SurveyData(surveyData);
    }//end of constructor

    /**
     * Constructor method to perfor a deep copy customer objects
     */
    public Customer(Customer customer){
        //copy all attributes of object passed in, to this object attributes
        this.email = customer.email;
        this.firstName = customer.firstName;
        this.lastName = customer.lastName;
        this.password = customer.password;
        this.username = customer.username;
        this.surveyData = new SurveyData(customer.surveyData);
    }//end of constructor

    /**
     * This method returns the surveyData attribute of this object
     * @return the surveyData attribute of this object
     */
    public SurveyData getSurveyData() {
        return surveyData;
    }//end of method getSurveyData

    /**
     * This method sets the username attribute of this object
     * @param password the value the username attribute should be
     */
    public void setSurveyData(SurveyData surveyData) {
        this.surveyData = new SurveyData(surveyData);
    }//end of method setSurveyData

    /**
     * This method returns the surveyData attribute of this object
     * @return the surveyData attribute of this object
     */
    public String getFirstName() {
        return firstName;
    }//end of method getFirstName

    /**
     * This method sets the username attribute of this object
     * @param password the value the username attribute should be
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//end of method setFirstName

    /**
     * This method returns the surveyData attribute of this object
     * @return the surveyData attribute of this object
     */
    public String getEmail() {
        return email;
    }//end of method getEmail

    /**
     * This method sets the username attribute of this object
     * @param password the value the username attribute should be
     */
    public void setEmail(String email) {
        this.email = email;
    }//end of method setEmail

    /**
     * This method returns the surveyData attribute of this object
     * @return the surveyData attribute of this object
     */
    public String getLastName() {
        return lastName;
    }//end of method getLastName

    /**
     * This method sets the username attribute of this object
     * @param password the value the username attribute should be
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//end of method setLastName

    /**
     * This method returns the surveyData attribute of this object
     * @return the surveyData attribute of this object
     */
    public String getPassword() {
        return password;
    }//end of method getPassword

    /**
     * This method sets the username attribute of this object
     * @param password the value the username attribute should be
     */
    public void setPassword(String password) {
        this.password = password;
    }//end of method setPassword

    /**
     * This method returns the surveyData attribute of this object
     * @return the surveyData attribute of this object
     */
    public String getUsername() {
        return username;
    }//end of method getUsername

    /**
     * This method sets the username attribute of this object
     * @param username the value the username attribute should be
     */
    public void setUsername(String username) {
        this.username = username;
    }//end of method setUsername
}//end of class Customer