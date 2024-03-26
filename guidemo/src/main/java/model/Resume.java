package model;

import java.util.ArrayList;

public class Resume {
    
    private String name;
    private ArrayList<String> achievements = new ArrayList();

    public Resume(String name) {
        this.name = name;
    }

    /**
     * copy constructor, copies over the attribute values from other Resume
     * @param other
     */
    public Resume(Resume other) {
        this.name = other.name;
        this.achievements = new ArrayList(other.achievements);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAchievements() {
        return new ArrayList(achievements); // return a copy of the list, not a reference to it
    }

    public void addAchievement(String achievement) {
        this.achievements.add(achievement);
    }

    public String toString() {
        return "resume for " + this.name + " " + this.achievements.size() + " achievements";
    }

    public boolean equals(Resume other) {

        if (this.name != other.name) {
            return false;
        }

        for (String achievement : this.achievements) {
            if (!other.achievements.contains(achievement)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Resume r = new Resume("john");
        r.addAchievement("graduated BCIS from MRU");
        r.addAchievement("worked as lead software developer");
        r.addAchievement("discovered cold fusion");

        System.out.println(r);

        r.getAchievements().clear();
        System.out.println(r);

        Resume r2 = new Resume(r);
        System.out.println(r2);

        System.out.println(r == r2);
        System.out.println(r.equals(r2));


        String hello = "hello world";
        String hello2 = hello.toUpperCase();
        System.out.println(hello2);
    }

}
