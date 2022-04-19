class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> st = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0)
            {
                st.add("FizzBuzz");
            }
            else if(i%5==0)
            {
                st.add("Buzz");
            }
            else if(i%3==0)
            {
                st.add("Fizz");
            }
            else
                st.add(String.valueOf(i));
        }
        return st;
    }
}