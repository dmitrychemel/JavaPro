package lesson2_generics.task6;

public class Main {
//    Задание: имитация игры-викторины.
//    Суть игры – участники разбиваются по командам, например, команда разработчиков, команда тестировщиков, команда аналитиков.
//    То есть у нас есть классы - Разработчик, Тестировщик, Аналитик.
//    Класс Команда, который содержит список участников. При этом команда может состоять только из участников одной профессии,
//    нельзя в команду тестировщиков добавить разработчика и т.д.
//    Класс Игра, который содержит метод старта соревнования и принимает две команды. При этом соревнование может проводиться
//    только между командами одной и той же профессии (аналитики не могут играть против тестировщиков).
//    Задача метода - просто случайным образом из двух команд выбрать победителя и назначить этой команде призовое очко.
//    Также класс Игра должен содержать метод, который сравнивает призовые очки двух команд (сравнивать можно очки команд разных профессий).
//    После написания всех классов протестировать игру - создать несколько команд разных профессий, запустить между ними соревнования, а потом сравнить набранные очки.

    public static void main(String[] args) {
        Analyst analyst1 = new Analyst();
        Analyst analyst2 = new Analyst();
        Developer developer1 = new Developer();
        Developer developer2 = new Developer();


        Team<Analyst> analystTeam = new Team<>("analyct1");
        analystTeam.add(analyst1);
        analystTeam.add(analyst2);

        Team<Analyst> analystTeam2 = new Team<>("analyct2");
        analystTeam2.add(analyst1);
        analystTeam2.add(analyst2);

        Team<Developer> developerTeam = new Team<>("developer1");
        developerTeam.add(developer1);
        developerTeam.add(developer2);

        Team<Developer> developerTeam2 = new Team<>("developer2");
        developerTeam2.add(developer1);
        developerTeam2.add(developer2);

        Game game = new Game();

        for (int i = 0; i < 1; i++) {
            game.play(analystTeam, analystTeam2);
            game.play(developerTeam, developerTeam2);
        }

        int scoreAnalyct1 = analystTeam.getScore();
        int scoreAnalyct2 = analystTeam2.getScore();
        System.out.println(scoreAnalyct1 + " " + scoreAnalyct2);
        game.compareAll(analystTeam, analystTeam2);
        game.compareAll(analystTeam2, developerTeam2);
    }
}
