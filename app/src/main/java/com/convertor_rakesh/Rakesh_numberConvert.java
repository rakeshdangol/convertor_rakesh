package com.convertor_rakesh;

class Rakesh_numberConvert {
    public String word;
    String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String Convert(int number) {
        if (number % 100 < 20) {
            word = ones[number % 20];
            number = number / 100;
        } else {
            word = ones[number % 10];
            number /= 10;
            word = tens[number % 10] + " " + word;
            number /= 10;
        }
        if (number == 0)
            return word;
        return ones[number] + " " + " hundred " + " and " + word;


    }
}

