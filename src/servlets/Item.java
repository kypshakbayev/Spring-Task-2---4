package servlets;

import java.time.LocalDate;

public class Item {
    private Long id;
    private String name;
    private String opisanie;
    private String description;
    private String deadlineDate;



    public Item() {
    }

    public Item(Long id, String name, String opisanie, String description, String deadlineDate) {
        this.id = id;
        this.name = name;
        this.opisanie = opisanie;
        this.description = description;
        this.deadlineDate = deadlineDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }
}
