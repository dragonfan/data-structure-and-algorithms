package com.fhl.example.sort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * <br/>
 * <li>Author hailong.fan
 * <li>Email fanhailong@vargo.com.cn
 * <li>Date 2019/1/7 16:31
 */
public class Client {
    @Test
    public void test(){
        int[] array = new int[]{3,2,5,8,1,9,4,6,7};
        for (int i : array) {
            System.out.print(i+" ");
        }
//        bubbleSort(array);
        selectSort(array);
        System.out.println("\n");
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    @Test
    public void testCards(){
        Cards[] array = new Cards[]{new Cards(1, 5)
                , new Cards(4, 7), new Cards(2, 1), };
//        Arrays.sort(array); //100以上用
        bubbleSort(array);

//        selectSort(array);
        for (Cards cards : array) {
            System.out.println(cards.toString());
        }
    }


    //冒泡排序
    public void bubbleSort(int[] array){
        for (int i = array.length-1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    //冒泡排序
    public void bubbleSort(Cards[] array){
        for (int i = array.length-1; i >0 ; i--) {
            boolean flag = true;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j].compareTo(array[j+1])>0) {
                    Cards temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }


    //选择排序
    public void selectSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }


            if (index != i) {
                //交换
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }

    //选择排序
    public void selectSort(Cards[] array){
        for (int i = 0; i < array.length-1; i++) {
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j].compareTo(array[index]) < 0) {
                    index = j;
                }
            }
            if (index != i){

                Cards temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }

    }
}
