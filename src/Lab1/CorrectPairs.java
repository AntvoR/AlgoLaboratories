import java.util.Stack;

class CorrectPairs {
    public boolean CheckPairs(String str) {
        Stack<Character> st = new Stack<Character>();
        for(char ch : str.toCharArray()) {
            if (ch != '{' && ch != '(' && ch != '[' && ch != ')' && ch != ']' && ch != '}') {
                    continue;
            }
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char stpop = st.pop();
                if (ch == ')' && stpop != '('){
                    return  false;
                }
                if (ch == ']' && stpop != '[') {
                    return false;
                }
                if (ch == '}' && stpop != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
