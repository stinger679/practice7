import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws Exception {
        var first  = new Stack<Integer>();
        var second = new Stack<Integer>();
        var reader = new BufferedReader(new InputStreamReader(System.in));

        // Ввод данных для первого игрока
        var input = reader.readLine();
        var splited = input.split(" ");
        for (var t : splited) { first.push(Integer.parseInt(t)); }

        input = reader.readLine();

        // Ввод данных для второго игрока
        splited = input.split(" ");
        for (var t : splited) { second.push(Integer.parseInt(t)); }

        Game game = new Game();
        game.start(first, second);

        main(args);
    }
}