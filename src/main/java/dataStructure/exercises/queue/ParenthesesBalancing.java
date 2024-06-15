package dataStructure.exercises.queue;
/*Para resolver este problema de validação de expressões matemáticas quanto ao uso correto de parênteses,
colchetes e chaves, podemos utilizar uma abordagem baseada em pilha.
A pilha nos permite verificar se cada abertura de um símbolo tem seu correspondente fechamento na ordem correta.*/

//2*(3+4+5*[2+3])
//[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)]+[5+8]+17)+2]

import java.util.Set;
import java.util.Stack;

public class ParenthesesBalancing {
    public static boolean solve(String expression) {
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (openSymbols.contains(c)) {
                stack.push(c);
            }
            if (closeSymbols.contains(c)) {
                if (stack.isEmpty()) return false;
                var open = stack.pop();
                if (open == '(' && c != ')') return false;
                if (open == '{' && c != '}') return false;
                if (open == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(solve("2*(3+4+5*[2+3])"));
        System.out.println(solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)]+[5+8]+17)+2]"));
    }
}
