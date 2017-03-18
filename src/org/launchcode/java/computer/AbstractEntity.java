package org.launchcode.java.computer;

/**
 * Created by kevinstock on 3/18/17.
 */
public abstract class AbstractEntity {
    public static int nextId = 1;
    public int id;

    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }
}
