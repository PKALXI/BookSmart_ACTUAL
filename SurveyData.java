/*********************************************************************
 * SurveyData.java
 *
 * This class represents a the information a user fills our in the survey at registration
 * @author  Pranav Kalsi
 * @since   2020-11-04
 ********************************************************************
 */
public class SurveyData {
    //fields/attributes of a SurveyData object
    private String favouriteGenre;
    private String favouriteBook;
    private String favouriteAuthor;

    /**
     * Constructor method
     * @param favouriteGenre The value this.favouriteGenre should be
     * @param favouriteBook The value this.favouriteBook should be
     * @param favouriteAuthor The value this.favouriteAuthor should be
     */
    public SurveyData(String favouriteGenre, String favouriteBook, String favouriteAuthor){
        //Set fields to corresponding parameters
        this.favouriteAuthor = favouriteAuthor;
        this.favouriteBook = favouriteBook;
        this.favouriteGenre = favouriteGenre;
    }//end of constructor

    /**
     * Constructor to perform a deep copy of a SurveyData object
     * @param surveyData The SurveyData object to be copied
     */
    public SurveyData(SurveyData surveyData){
        //copy all attributes of object passed in, to this object attributes
        this.favouriteAuthor = surveyData.favouriteAuthor;
        this.favouriteBook = surveyData.favouriteBook;
        this.favouriteGenre = surveyData.favouriteGenre;
    }//end of constructor

    /**
     * This method returns the value of this objects favouriteGenre attribute
     * @return this objects favouriteGenre attribute
     */
    public String getFavouriteGenre() {
        return favouriteGenre;
    }//end of method getFavouriteGenre

    /**
     * This method sets the field "favouriteGenre" to the parameter passed in
     * @param favouriteGenre The value favouriteGenre should be
     */
    public void setFavouriteGenre(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }//end of method getFavouriteGenre

    /**
     * This method returns the value of this objects favouriteBook attribute
     * @return this objects favouriteBook attribute
     */
    public String getFavouriteBook() {
        return favouriteBook;
    }//end of method getFavouriteGenre

    /**
     * This method sets the field "favouriteBook" to the parameter passed in
     * @param favouriteBook The value favouriteBook should be
     */
    public void setFavouriteBook(String favouriteBook) {
        this.favouriteBook = favouriteBook;
    }//end of method getFavouriteGenre

    /**
     * This method returns the value of this objects favouriteAuthor attribute
     * @return this objects favouriteAuthor attribute
     */
    public String getFavouriteAuthor() {
        return favouriteAuthor;
    }//end of method getFavouriteGenre

    /**
     * This method sets the field "favouriteAuthor" to the parameter passed in
     * @param favouriteAuthor The value favouriteAuthor should be
     */
    public void setFavouriteAuthor(String favouriteAuthor) {
        this.favouriteAuthor = favouriteAuthor;
    }//end of method getFavouriteGenre
}//end of class SurveyData