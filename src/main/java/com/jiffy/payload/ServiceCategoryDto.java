package com.jiffy.payload;

public class ServiceCategoryDto {

    private Long id;
    private String category;

    // Constructors, getters, and setters

    // Constructors
    public ServiceCategoryDto() {
    }

    public ServiceCategoryDto(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

