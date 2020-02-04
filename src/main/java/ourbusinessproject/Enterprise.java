package ourbusinessproject;

import net.bytebuddy.implementation.bind.annotation.Empty;
import org.hibernate.validator.constraints.Length;
//import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Email;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

@Entity
@Table(name = "enterprise")
public class Enterprise {

    @Id
    @GeneratedValue
    private Long id;

    /** Nom de l'entreprise */
    @NotEmpty
    @Column(name = "name")
    private String name;

    /** Description de l'entreprise */
    @Length(min = 10)
    @Column(name = "description")
    private String description;

    /** Nom du contact */
    @NotEmpty
    @Column(name = "contact_name")
    private String contactName;

    /** Adresse mail de contact */
    @Email
    @NotEmpty
    @Column(name = "contact_email")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
