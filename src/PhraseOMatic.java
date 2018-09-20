public class PhraseOMatic {
    public static void main(String[] args) {
        String [] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий",
                "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};            //Создано 3 набора слов для выбора
        String [] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный",
                "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой",
                "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String [] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванрого внимания",
                "портал", "период времени", "обзор", "образец", "пункт следования"};
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;                   // Вычисляем, сколько слов в каждом списке
        int threeLenght = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLenght);        //Генерируем три случайных числа
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);
        String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " + wordListThree [rand3];
        System.out.println("Все, что нам нужно, - это "+phrase);

        ClassniyClass classniy = new ClassniyClass();
        System.out.println(classniy.AgeCount(9));
    }
}
