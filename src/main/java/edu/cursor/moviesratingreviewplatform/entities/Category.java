package edu.cursor.moviesratingreviewplatform.entities;

/**
 * “Category” should be returned to an end-user in human-readable format
 * (not like SCI_FI but “Science fiction”). But in DB should be saved as SCI_FI.
 */
public enum Category {
    DRM("Drama"),
    SCI_FI("Science Fiction"),
    HRR("Horror"),
    ACT("Action"),
    CMD("Comedy");

    private String fullCategoryName;

    Category(String fullCategoryName) {
        this.fullCategoryName = fullCategoryName;
    }

    public String getFullCategoryName() {
        return fullCategoryName;
    }
}
