package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        String[] parts = new String[input.length()];
        for (var i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        String output = "";
        for (var k = input.length() - 1; k >= 0; k--) {
            output += parts[k];
        }
        return output;
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        String[] parts = new String[input.length()];
        for (var i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        int i = 0;
        int j = input.length() - 1;
        while (i < j) {
            if (!parts[i].equals(parts[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        // String[] parts = new String[input.length()];
        // for (var i = 0; i < input.length(); i++) {
        // parts[i] = input.charAt(i) + "";
        // }
        // for (var k = 0; k < input.length(); k++) {
        // if (!parts[k].contains(part))
        // return false;
        // }
        // return true;

        return input.contains(part);
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        String[] parts = new String[input.length()];
        for (var i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        String output = "";
        for (var j = 0; j < input.length(); j++) {
            boolean check = false;
            for (var k = 0; k < 9; k++) {
                if (parts[j].equals(k + "")) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                output += parts[j];
            }
        }
        return output;
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        String output = "";
        output = input.toUpperCase();
        return output;
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        String output = "";
        output = input.toLowerCase();
        return output;
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        String[] parts = new String[input.length()];
        for (var i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        String output = "";
        for (var j = 0; j < input.length(); j++) {
            parts[0] = parts[0].toUpperCase();
            if (parts[j].equals(" ")) {
                parts[j + 1] = parts[j + 1].toUpperCase();
            }
            output += parts[j];
        }
        return output;
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        String vowels = "aeiou";
        String[] parts = new String[input.length()];
        for (var i = 0; i < input.length(); i++) {
            parts[i] = input.charAt(i) + "";
        }
        int count = 0;
        for (var j = 0; j < input.length(); j++) {
            if (vowels.contains(parts[j].toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        String[] parts = new String[sentence.length()];
        for (var i = 0; i < sentence.length(); i++) {
            parts[i] = sentence.charAt(i) + "";
        }
        int output = 1;
        for (var j = 0; j < sentence.length(); j++) {
            if (parts[j].equals(" ")) {
                output++;
            }
        }
        return output;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        int index = -1;
        for (var i = 0; i < input.length(); i++) {
            String text = input.substring(i);
            if (text.startsWith(substring)) {
                index = i;
            }
        }
        return index;
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String[] parts = sentence.split(" ");
        String output = "";
        for (var i = parts.length - 1; i >= 0; i--) {
            output += parts[i];
            if (i != 0) {
                output += " ";
            }
        }
        return output;
    }
}
