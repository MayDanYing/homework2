package ru.geekbrains.lesson4;

//Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль:
// успешно пробежал, не смог пробежать и т.д.).
//Создайте два класса: беговая дорожка и стена, при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать).
// У препятствий есть длина (для дорожки) или высота (для стены),
// а у участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий,
// то дальше по списку он препятствий не идет.
//        Создайте два массива: с участниками и препятствиями, и
//        заставьте всех участников пройти этот набор препятствий.

public class main {

    public static void main(String[] args) {
        Competition first = new Competition(new Run(3000), new Wall(1.0));
        Competitors competitors = new Competitors("Array of competitors",
                new HumanBeing("James"),
                new Kitty ("Fluffy"),
                new Robot("Jericho"));
        first.action(competitors);
        competitors.Info();
           }
    }

