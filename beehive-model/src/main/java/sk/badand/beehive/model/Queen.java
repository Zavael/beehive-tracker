/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.badand.beehive.model;

import sk.badand.beehive.model.enums.Color;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author abadinka
 */
public final class Queen implements Serializable{
    public static final Queen NO_QUEEN = new Queen("", new Breed(""), Color.NONE, false, null);
    
    private final String name;
    private final Breed breed;
    private final MarkSign markSign;
    private final boolean accepted;
    private final LocalDate installed;
    private LocalDate removed;
    private LocalDate died;
    
    public Queen(Breed breed){
        this("", breed, Color.NONE, true, null);
    }

    public Queen(String name, Breed breed, Color markColor, boolean accepted, LocalDate installed) {
        this.name = name;
        this.breed = breed;
        this.markSign = new MarkSign(markColor);
        this.accepted = accepted;
        this.installed = installed;
        this.removed = null;
        this.died = null;
    }

    public Breed getBreed() {
        return breed;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public LocalDate getInstalled() {
        return installed;
    }

    public LocalDate getRemoved() {
        return removed;
    }

    public void setRemoved(LocalDate removed) {
        this.removed = removed;
    }
    
    public void die() {
        this.died = LocalDate.now();
        this.removed = died;
    }
    
    public boolean isDead() {
        return died != null;
    }
    
    
    public boolean isMarked() {
        return markSign.isMarked();
    }
    
    public Color markColor() {
        return markSign.getMarkingColor();
    }
    
    public String calculateAge() {
        return "unspecified";
    }

    public String getName() {
        return name;
    }
    
}
