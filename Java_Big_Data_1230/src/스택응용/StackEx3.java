package 스택응용;

import java.util.Scanner;
import java.util.Stack;

// 스택을 이용해서 괄호의 열림과 닫힘 체크
public class StackEx3 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') { // 닫힌 괄호 일 때 pop
                if (!st.isEmpty()) st.pop(); // 스택이 비어 있지 않으며 pop
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }
        }
            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }

    }
}
