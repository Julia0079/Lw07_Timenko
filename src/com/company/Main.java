package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int[] ArrayInt;
        int[][] ArrayPoint;
        int SizeArrayInt,sum=0,mod=1,NumericPoint,PointX,PointY,MinVector=Integer.MAX_VALUE, IndexMinVector=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите количество элементов массива: ");
            SizeArrayInt = Integer.parseInt(reader.readLine());
            ArrayInt = new int[SizeArrayInt];
            for(byte i=0;i<ArrayInt.length;i++){//цикл заполнениея массива случ. числами
                ArrayInt[i] = (int)(Math.random()*20-10);//[-10;10)
                if(ArrayInt[i]>=0) sum+=ArrayInt[i];
                else mod*=ArrayInt[i];
            }
            System.out.print("Згенерированый массив:");
            for (var elem: ArrayInt) {
                System.out.print(elem+"\t");
            }
            System.out.println();
            System.out.println("Сумма положительных чисел: "+sum);
            System.out.println("Произведение отрицательных чисел: "+mod);
            System.out.print("Введите количество точек: ");
            NumericPoint = Integer.parseInt(reader.readLine());
            ArrayPoint = new int[NumericPoint][2];
            for(int row=0;row<NumericPoint;row++){
                System.out.println("Введите точку№"+(row+1));
                System.out.print("\tВведите x: ");
                PointX = Integer.parseInt(reader.readLine());
                ArrayPoint[row][0] = PointX;
                System.out.print("\tВведите y: ");
                PointY = Integer.parseInt(reader.readLine());
                ArrayPoint[row][1] = PointY;
                int tempX = PointX - 0;
                int tempY = PointY - 0;
                int TempVector = (int)Math.sqrt(Math.pow(tempX,2)+Math.pow(tempY,2));
                if(MinVector>=TempVector){
                    MinVector = TempVector;
                    IndexMinVector = row;
                }
            }
            System.out.println("Ближайшая точка к началу координат:");
            System.out.println("\tA("+ArrayPoint[IndexMinVector][0]+";"+ArrayPoint[IndexMinVector][1]+")");
        }
        catch (Exception ex){
            System.out.println("Некорентный формат ввода");
        }
    }
}
