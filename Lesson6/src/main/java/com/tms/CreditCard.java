package com.tms;
import java.util.Scanner;

public class CreditCard {
    Scanner sc = new Scanner(System.in);
    //    1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//    Добавьте метод, который позволяет начислять сумму на кредитную
//    карточку.
//    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//    Добавьте метод, который выводит текущую информацию о карточке.
//    Напишите программу, которая создает три объекта класса CreditCard у
//    которых заданы номер счета и начальная сумма
//    Тестовый сценарий для проверки:
//    Положите деньги на первые две карточки и снимите с третьей.
//    Выведите на экран текущее состояние всех трех карточек.
    String nameCard;
    int numberCard;
    int cash;

    public CreditCard (String NameCard,int numberCard,int cash){
        this.nameCard = NameCard;
        this.cash = cash;
        this.numberCard = numberCard;
    }
    public void StatusCard (){
        System.out.println("Информация по вашей карточке: Имя карты - "+ this.nameCard +", Номер счета карты - "+this.numberCard + " ,сумма на счету: " +this.cash);
    }

    public void Cash() {
        System.out.println("Какую сумму кладем на ваш счет карточки "+ this.nameCard);
        int cs = sc.nextInt();
        this.cash += cs;
        System.out.println("На счет вашей карты "+this.nameCard +" "+ this.numberCard + " поступило: "+ cs +" условных единиц");
    }


    public void Withdraw(){
        System.out.println("Сколько денег вы хотите снять с вашей карты "+this.nameCard+" остаток на счету: "+ this.cash);
        int cs = sc.nextInt();
        this.cash -= cs;
        System.out.println("С вашего лицевого счета карты "+this.nameCard+ " снято: "+ cs + " условных единиц");
    }
}