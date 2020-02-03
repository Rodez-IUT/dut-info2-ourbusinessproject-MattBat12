package ourbusinessproject;

import net.bytebuddy.implementation.bind.annotation.Empty;
import org.hibernate.validator.constraints.Length;
//import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Email;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Enterprise {

    /** Nom de l'entreprise */
    @NotEmpty
    private String name;

    /** Description de l'entreprise */
    @Length(min = 10)
    private String description;

    /** Nom du contact */
    @NotEmpty
    private String contactName;

    /** Adresse mail de contact */
    @Email
    @NotEmpty
    private String contactEmail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
