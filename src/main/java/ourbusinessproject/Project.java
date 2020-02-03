package ourbusinessproject;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Représente un projet.
 *
 * @author matthieu.batifol
 */
@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * Titre du projet
     */
    // NotEmpty = ni vide ni null
    @NotNull
    @NotBlank
    @Column(name = "title")
    private String title;

    /**
     * Description du projet
     */
    @Column(name = "description")
    private String description;

    /**
     * Change le titre du projet
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Change la description du projet
     */
    public void setDescription(String description) {
        this.description = description;
    }

}