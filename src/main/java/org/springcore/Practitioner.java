package org.springcore;

public class Practitioner {
    private String name;
    public Practitioner() {
        super();
    }

    public Practitioner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Practitioner{" +
                "name='" + name + '\'' +
                '}';
    }
}
