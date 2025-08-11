
class Solution {

    public int calculate(String s) {
        Deque<Integer> deq = new ArrayDeque<>();
        int i = 0;
        char operation = '+';
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ' ') {
                i++;
                continue;
            } else if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                if (operation == '+') {
                    deq.push(num);
                } else if (operation == '-') {
                    deq.push(-num);
                } else if (operation == '*') {
                    s deq
                    .push(deq.pop() * num);
                } else if (operation == '/') {
                    deq.push(deq.pop() / num);
                }
            } else {
                operation = c;
                i++;
            }
        }
        int ret = 0;
        while (!deq.isEmpty()) {
            ret += deq.pop();
        }
        return ret;
    }
}
