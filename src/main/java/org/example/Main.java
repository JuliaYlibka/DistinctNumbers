package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<Double> doubles = new ArrayList<Double>();
        for(int i=0;i<10;i++)
            ints.add(i);
        for(double j=0.0;j<=2;j+=0.1)
            doubles.add(j);
        System.out.println("Максимальное натуральное число: "+ max(ints));
        System.out.println("Максимальное число: "+ max(doubles));

        }
        public static <E extends Comparable<E>> E max(ArrayList<E> list) {
            E res=list.get(0);
            if (list.isEmpty())
                throw new IllegalArgumentException("Дан пустой лист!");
            else {
                for (int i = 0; i < list.size() ; i++) {
                    if(list.get(i).compareTo(res)>0){
                        res = list.get(i);
                    }
                }
                return res;
            }
        }
    }