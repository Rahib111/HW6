package com.abb.model;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = new Human[0];
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild (Human human)
    {
        Human[] oldChildren = children;

        children = new Human[children.length + 1];

        for (int i = 0; i < oldChildren.length; i++)
            children[i] = oldChildren[i];

        children[children.length - 1] = human;
    }

    public void deleteChild (int index)
    {
        if(index >= children.length){
            return;
        }
        Human[] oldChildren = children;

        children = new Human[children.length - 1];

        int j = 0;
        for (int i = 0; i < oldChildren.length; i++)
        {
            if (i != index) {
                children[j] = oldChildren[i];
                j++;
            }
        }

    }

    public void deleteChild (Human child)
    {
        boolean flag = true;
        for (Human human: children)
        {
            if (human.equals(child))
                flag = false;
        }
        if (flag)
            return;

        Human[] oldChildren = children;

        children = new Human[children.length - 1];

        int index = 0;
        for (int i = 0; i < oldChildren.length; i++)
        {
            if (oldChildren[i].equals(child))
                continue;
            children[index] = oldChildren[i];
            index++;
        }
    }

    public int countFamily ()
    {
        return children.length + 2;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Family))
            return false;

        Family family = (Family) o;

        if (!family.mother.equals(this.mother))
            return false;
        if (!family.father.equals(this.father))
            return false;
        if (family.children.length != this.children.length)
            return false;
        for (int i = 0; i < family.children.length; i++)
        {
            if (!family.children[i].equals(this.children[i]))
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family finalize method was called!");
        super.finalize();
    }
}
