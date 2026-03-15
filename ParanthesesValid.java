    import java.util.Stack;
public class ParanthesesValid {

        public static void main(String[] args) {

//            When you see an opening bracket, push it into a stack.
//            When you see a closing bracket, check if it matches the top of the stack.
            String s = "([])";
            Stack<Character> stack = new Stack<>();
            boolean valid = true;

            for(char c : s.toCharArray()) {

                if(c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else {

                    if(stack.isEmpty()) {
                        valid = false;
                        break;
                    }

                    char top = stack.pop();

                    if(c == ')' && top != '(') valid = false;
                    if(c == '}' && top != '{') valid = false;
                    if(c == ']' && top != '[') valid = false;

                    if(!valid) break;
                }
            }

            if(!stack.isEmpty()) valid = false;

            System.out.println(valid);
        }
    }
