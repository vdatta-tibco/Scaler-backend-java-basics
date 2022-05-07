package com.scaler;

public class InheritenceFun {

    static class GrandParent {
        public boolean isSeniorCitizen () {
            return this.getAge() >= 60;
        }
        public int getAge() {
            return 60;
        }
    }

    static class Parent extends GrandParent{
        @Override
        public int getAge() {
            return 40;
        }
    }

    static class Child extends Parent {
        @Override
        public int getAge() {
            return 20;
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.isSeniorCitizen());

        GrandParent gp = new GrandParent();
        System.out.println(gp.isSeniorCitizen());

        GrandParent gp2 = new Child();
        System.out.println(gp2.isSeniorCitizen()); //this would be false as the Child object has age value of 20.
    }
}
