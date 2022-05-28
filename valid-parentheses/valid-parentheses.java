class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char temp = s.charAt(i);
            if(temp==' ')
            {
                
            }
            else
            {
                if(temp=='(' || temp=='{' || temp=='[')
                    st.push(temp);
                else if(temp==')')
                {
                    if(!st.isEmpty() &&st.peek()=='(')
                        st.pop();
                    else
                        return false;
                }
                else if(temp=='}')
                {
                    if(!st.isEmpty() &&st.peek()=='{')
                        st.pop();
                    else
                        return false;
                }
                else if(temp==']')
                {
                    if(!st.isEmpty() &&st.peek()=='[')
                        st.pop();
                    else
                        return false;
                }
            }

        }
                    if(st.isEmpty())
                return true;
            else
                return false;
    }
}