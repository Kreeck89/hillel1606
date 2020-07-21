package lesson11;

import lesson11.factory.ClothesFactory;
import lesson11.model.Clothes;

import java.util.Scanner;

public class Main {
    private static final int CLOTHES_FCTORY = 1;
    private static final int FURNITURE_FCTORY = 2;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите какую фабрику необходимо создать:\n" +
                "1 - для создания Фабрики одежды\n" +
                "2 - для создания Мебельной фабрики");

        int factory = scanner.nextInt();
        if (factory == CLOTHES_FCTORY) {
            ClothesFactory clothesFactory = new ClothesFactory();
            System.out.println("Какой тип одежды необходимо сздать\n" +
                    "1 - для создания Рубашки\n" +
                    "2 - для создания Платья");
            int clothesType = scanner.nextInt();

            System.out.println("Какое количество необходимо?");
            int clothesValue = scanner.nextInt();

            Clothes[] clothes = clothesFactory.createClothes(clothesType, clothesValue);
            System.out.println("Количество созданной одежды: " + clothes.length);
        } else if (factory == FURNITURE_FCTORY) {
            //TODO: Сделать дома!
        } else {
            System.out.println("Ввели не корректное значение!");
        }


    }
}
