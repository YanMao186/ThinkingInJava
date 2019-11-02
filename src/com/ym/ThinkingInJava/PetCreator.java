//package com.ym.ThinkingInJava;
//
//import java.util.List;
//import java.util.Random;
//
//public abstract class PetCreator {
//    private Random rand = new Random(47);
//    public abstract List<Class<? extends Pet>> types();
//    public Pet randomPet() {
//        int n = rand.nextInt(types().size());
//        try {
//            return types().get(n).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
