package com.example.sonyshah.spacewood;

/**
 * Created by Sony Shah on 30-03-2019.
 */

public class furnituresofa {

    private String Title;
    private String Description;
    private int img;

    public furnituresofa(){

    }

    public furnituresofa(String title, String description, int img) {
        Title = title;
        Description = description;
        this.img = img;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
