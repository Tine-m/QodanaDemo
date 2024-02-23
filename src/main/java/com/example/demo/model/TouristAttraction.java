package com.example.demo.model;

import java.util.List;
import java.util.Objects;

public class TouristAttraction {

    private String name;
    private String description;
    private String city;
    private int entryFee;
    private List<String> tagList;

    public TouristAttraction() {
    }

    public TouristAttraction(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TouristAttraction(String name, String description, String city, List<String> tagList) {
        this.name = name;
        this.description = description;
        this.city = city;
        this.tagList = tagList;
    }

    public TouristAttraction(String name, String description, String city, int fee, List<String> tagList) {
        this.name = name;
        this.description = description;
        this.city = city;
        this.entryFee = fee;
        this.tagList = tagList;
    }

    public String getName() {
        return name;
    }

    // hvis infromation skal komme med i JSON output
    public String getDescription() {
        return description;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEntryFee(int entryFee) {
        this.entryFee = entryFee;
    }

    public int getEntryFee() {
        return entryFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristAttraction that = (TouristAttraction) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "TouristAttraction{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", entryFee=" + entryFee +
                ", tagList=" + tagList +
                '}';
    }
}

