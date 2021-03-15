package com.company;

import java.util.*;

public class Main {

        public static void main(String[] args) {
            System.out.println(" А ");

            ArrayList<String> players = new ArrayList<>();
            while (players.size() < 5) {
                Scanner s = new Scanner(System.in);
                String s1 = s.nextLine();
                players.add(s1);
            }


            getInfo(players);
            System.out.println("_____________________");
            System.out.println("список  Б: ");
            ArrayList<String> students2 = new ArrayList<>();
            while (students2.size() < 5) {
                Scanner scanner = new Scanner(System.in);
                String s2 = scanner.nextLine();
                students2.add(s2);

            }
            getInfo(students2);
            System.out.println("___________________________-");

            System.out.println("Список С:");
            ArrayList<String> listC = new ArrayList<>();
            Collections.reverse(students2);
            Iterator<String> iterator = students2.iterator();
            while (iterator.hasNext()) {
                Iterator<String> iterator1 = players.iterator();
                while (iterator1.hasNext()) {
                    String f = iterator1.next();
                    listC.add(f);
                    iterator1.remove();
                    break;
                }
                String s = iterator.next();
                listC.add(s);
            }

            getInfo(listC);
            System.out.println("_-_--_--__-__--__---");
            listC.sort(Comparator.comparing(String::length));
            System.out.println("Список С ");
            getInfo(listC);
        }

        public static void getInfo(ArrayList<?> arrayList) {
            Iterator<?> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

