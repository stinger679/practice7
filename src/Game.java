import java.util.Stack;

public class Game {
    void start(Stack<Integer> first, Stack<Integer> second) {
        int step = 0;
        while (!first.isEmpty() && !second.isEmpty() && step < 106) {
            step++;
            var t1 = first.pop();
            var t2 = second.pop();
            if (t1 == 0 && t2 == 9) {
                first.push(t1);
                first.push(t2);
            }
            else if (t1 == 9 && t2 == 0) {
                second.push(t1);
                second.push(t2);
            }
            else {
                if (t1 > t2) {
                    first.push(t1);
                    first.push(t2);
                }
                if (t1 < t2) {
                    second.push(t1);
                    second.push(t2);
                }
            }
        }
            if (first.isEmpty()) {
                System.out.println("second " + step);
            } else if (second.isEmpty()) {
                System.out.println("first " + step);
            } else System.out.println("botva");
        }
    }
