package io.github.wuhao4u;

import java.util.*;

public class Collections {
    public static void list() {
        ArrayList list = new ArrayList();
        list.add("Andy");
        list.add("Bart");
        list.add("Carl");
        list.add("Elmo");

//        list.add(3, "Oscar");
        list.add(4, "Oscar");

        System.out.println(Arrays.toString(list.toArray()));
    }

    static void linkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Andy");
        list.add("Bart");
        list.add("Carl");
        list.add("Elmo");

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.poll());
        System.out.println(Arrays.toString(list.toArray()));
    }

    /*
    Give a list of strings, all in lowercase,
    and all start with an alphabet character, please group them based on their first character.
    If the first character is a, group them in a list 0. If the first character is ‘b’,
    group them in a list 1; other characters, group them in a list 2.

    Example1 : input: {“bcd”, “abc”, “cde”}, output: [{“abc”}, {“bcd”}, {“cde”}]

    Example2: Input: List: {“abc”, “bcd”, “bbb”, “ace”, “snb”, “aaaa”, “bbbbb”, “eeee”}
    Output: [{“abc”, “ace”, “aaaa”}, {“bcd”, “bbb”, “bbbb”}, {“snb”, “eeee”}]
     */
    public static List<String>[] groupString(List<String> input) {
        List<String>[] result = new List[3];
        result[0] = new ArrayList<>();
        result[1] = new ArrayList<>();
        result[2] = new ArrayList<>();

        if (input == null || input.size() == 0) {
            return result;
        }

        for (String s :
                input) {
            switch (s.charAt(0)) {
                case 'a':
                    result[0].add(s);
                    break;
                case 'b':
                    result[1].add(s);
                    break;
                default:
                    result[2].add(s);
            }
        }
        int x = 0;
        return result;
    }

    public static int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] tokens = s.toCharArray();

        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();
                // There may be more than one digits in number
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.toString()));
                --i;
            }
            // Current token is an opening brace, push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);

                // Closing brace encountered, solve entire brace
            else if (tokens[i] == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            // Current token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/') {
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

        // Top of 'values' contains result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    private static int applyOp(char op, int v1, int v2) {
        switch (op) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                if (v2 == 0) {
                    throw new UnsupportedOperationException("Cannot divide by 0");
                }
                return v1 / v2;
        }
        return 0;
    }

    public static void main(String[] args) {
//        list();
//        linkedList();
        System.out.println(Collections.calculate("1+2"));
        System.out.println(Collections.calculate("1 + 2 * 5"));
    }
}
