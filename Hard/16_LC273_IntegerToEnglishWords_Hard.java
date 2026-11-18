// LeetCode 273 - Integer to English Words
class LC273_IntegerToEnglishWords_Hard {
    String[] below20 = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
        "Nineteen"
    };

    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String result = "";
        int index = 0;

        while (num > 0) {
            int part = num % 1000;

            if (part != 0) {
                String words = convert(part);
                result = words + " " + thousands[index]
                        + (result.isEmpty() ? "" : " " + result);
            }

            num = num / 1000;
            index++;
        }

        return result.trim();
    }

    public String convert(int num) {
        if (num == 0) {
            return "";
        }

        if (num < 20) {
            return below20[num];
        }

        if (num < 100) {
            return tens[num / 10]
                    + (num % 10 == 0 ? "" : " " + convert(num % 10));
        }

        return below20[num / 100] + " Hundred"
                + (num % 100 == 0 ? "" : " " + convert(num % 100));
    }
}
