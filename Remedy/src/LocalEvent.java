/**
 *
 * @author user
 */
import java.time.LocalDate;

public class LocalEvent {
    
    private String description;
    private LocalDate date;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalEvent(LocalDate date, String description){        
        this.setDate(date);
        this.setDescription(description);
    }

    //Local Event calls the toString method which we didnt override
    public String toString(){
        //return "At:" + this.getDate() + " " + this.getDescription();
        //I like better
        return this.getDate() + " " + this.getDescription();
    }
}
