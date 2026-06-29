package tech.crawler.entity;

public class Coders {
    private String name;
    private Long age;
    public Coders(String name,Long age) {
        this.age = age;
        this.name = name;
    }

    public Coders() {
    }
    public String getName(){
        return name;
    }
    public Long getAge(){
        return age;
    }
}
