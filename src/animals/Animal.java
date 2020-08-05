/*1. Создать классы Собака и Кот с наследованием от класса Животное.
  2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
  Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
  4.* Добавить подсчет созданных котов, собак и животных.
*/

package animals;

import java.util.Random;

public class Animal {

    protected String name;
    protected String type; // значение кошка или собака
    protected int maxRun; // значение бега
    protected int maxSwim; // значение плавания
    public Random random = new Random(); // рандомное значение для бега и плавания


    public Animal(String name) {
        this.name = name; // при создании объекта нужно ввести имя
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }


    public void run(int dist) { // выводит инфо об объекте относительно бега
        if (this.maxRun < dist) {
            System.out.println(type + " " + name + " пробежал " + maxRun + " м, но он может больше! его предел " + dist + " м");
        } else {
            System.out.println(type + " " + name + " не может убежать так делако, его предел " + dist + " м");
        }
        }

        public void swim (int dist){// выводит инфо об объекте относительно плавания
            if (this.maxSwim < dist) {
                System.out.println(type + " " + name + " проплыл " + maxSwim + " метров, но он может больше! его предел " + dist + " м");
            } else {
                System.out.println(type + " " + name + " не может уплыть так делако, его предел " + dist + " м");
            }
            }


            public void info () { // выводит инфо сведения обо всех
                System.out.println(type + " " + name + " Пробежал " + maxRun + " метров, Проплыл " + maxSwim + " метров");
            }

}
