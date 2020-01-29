package ourbusinessproject;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Représente un projet.
 *
 * @author matthieu.batifol
 */
public class Project {

    /**
     * Titre du projet
     */
    // NotEmpty = ni vide ni null
    @NotNull
    @NotBlank
    private String title;

    /**
     * Description du projet
     */
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