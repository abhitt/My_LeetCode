class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Process the string and manage the stack
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    stack.pop(); // Remove the closest non-star character
                }
            }
        }

        // Use StringBuilder to build the final string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert characters at the beginning
        }

        return result.toString();
    }
}