package com.tekwill.learning.trivia.datatypes;

public class Statistics {
    public int curentWorldPopulation;
    public String nickname;
    static String source;

    public Statistics(int curentWorldPopulation, String nickname) {
        this.curentWorldPopulation = curentWorldPopulation;
        this.nickname = nickname;

    }

    public Statistics() {

    }

    public void source(){
        System.out.println("www.statistica.md");
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "curentWorldPopulation=" + curentWorldPopulation +
                "nickname='" + nickname + '\'' +
                '}';


        }

    public static void main(String[] args) {
        Statistics world = new Statistics();
        System.out.println(world.curentWorldPopulation);
        System.out.println(world.nickname);
    }
}