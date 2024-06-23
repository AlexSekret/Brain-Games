package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class EvenOddGame {
  public static final int MAX_NUMBER_BOUND = 100;

  public static void start() {
    // генерируем игровые данные
    String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    String[] questions = new String[Engine.MAX_ROUND_COUNT];
    String[] answers = new String[Engine.MAX_ROUND_COUNT];
    for (int i = 0; i < Engine.MAX_ROUND_COUNT; i++) {
      questions[i] = String.valueOf(Util.getRandomNumber(MAX_NUMBER_BOUND));
      answers[i] = generateAnswer(questions[i]);
    }
    // и передаем их в `Engine`, здесь должен дергаться класс `Engine`
    Engine.playGame(gameRule, questions, answers);
  }

  private static String generateAnswer(String question) {
    int number = Integer.parseInt(question);
    String result = "no";
    if (number % 2 == 0) {
      result = "yes";
    }
    return result;
  }
}
