package io.github.wuhao4u.exercises.c1;

public class TranslateNumberToWord {
    static final int ONE_BILLION = 1000000000;
    static final int ONE_MILLION = 1000000;
    static final int ONE_THOUSAND = 1000;

    public static String translateNumberToWord(int number) {
        /*
        Given a non-negative integer n, print the number in words.
        Example1:
        Input: 10245
        Output: "ten thousand two hundred forty five"
        Example2:
        Input: 125
        Output: "one hundred twenty five"
         */
        StringBuilder sb = new StringBuilder();

        if (number < 0) {
            sb.append("negative");
            number = Math.abs(number);
        } else if (number == 0) {
            return "zero";
        } else if (number >= Integer.MAX_VALUE || number <= Integer.MIN_VALUE) {
            throw new UnsupportedOperationException("Number is our of range.");
        }

        int billion3Digits = number / ONE_BILLION;
        int billionNum = billion3Digits * ONE_BILLION;

        int million3Digits = (number - billionNum) / ONE_MILLION;
        int millionNum = million3Digits * ONE_MILLION;

        int thousands3Digits = (number - billionNum - millionNum) / ONE_THOUSAND;
        int thousandNum = thousands3Digits * ONE_THOUSAND;

        int hundred3Digits = number - billionNum - millionNum - thousandNum;

        if (billionNum > 0) {
            String bStr = TranslateNumberToWord.threeDigitsNumberToWord(billion3Digits);
            sb.append(bStr);
            sb.append(" billion");
        }

        if (million3Digits > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            String mStr = TranslateNumberToWord.threeDigitsNumberToWord(million3Digits);
            sb.append(mStr);
            sb.append(" million");
        }

        if (thousands3Digits > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            String tStr = TranslateNumberToWord.threeDigitsNumberToWord(thousands3Digits);
            sb.append(tStr);
            sb.append(" thousand");
        }

        if (hundred3Digits > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            String hStr = TranslateNumberToWord.threeDigitsNumberToWord(hundred3Digits);
            sb.append(hStr);
        }

        return sb.toString();
    }

    public static String threeDigitsNumberToWord(int number) {
        if (number < 100) {
            return twoDigitsNumberToWord(number);
        } else if (number == 100) {
            return "one hundred";
        } else if (number > 999) {
            return translateNumberToWord(number);
        }

        StringBuilder sb = new StringBuilder();
        int hundredth = number / 100;
        int rest = number - (hundredth * 100);

        switch (hundredth) {
            case 9:
                sb.append("nine hundred");
                break;
            case 8:
                sb.append("eight hundred");
                break;
            case 7:
                sb.append("seven hundred");
                break;
            case 6:
                sb.append("six hundred");
                break;
            case 5:
                sb.append("five hundred");
                break;
            case 4:
                sb.append("four hundred");
                break;
            case 3:
                sb.append("three hundred");
                break;
            case 2:
                sb.append("two hundred");
                break;
            case 1:
                sb.append("one hundred");
                break;
            default:
                break;
        }

        if (rest > 0) {
            sb.append(' ');
            sb.append(TranslateNumberToWord.twoDigitsNumberToWord(rest));
        }

        return sb.toString();
    }

    public static String twoDigitsNumberToWord(int number) {
        if (number < 10) {
            return oneDigitNumberToWord(number);
        } else if (number == 10) {
            return "ten";
        } else if (number > 99) {
            return threeDigitsNumberToWord(number);
        } else if (number > 10 && number < 20) {
            switch (number) {
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
                default:
                    return "";
            }
        }


        StringBuilder sb = new StringBuilder();
        int tenth = number / 10;
        int single = number - (tenth * 10);

        switch (tenth) {
            case 9:
                sb.append("ninety");
                break;
            case 8:
                sb.append("eighty");
                break;
            case 7:
                sb.append("seventy");
                break;
            case 6:
                sb.append("sixty");
                break;
            case 5:
                sb.append("fifty");
                break;
            case 4:
                sb.append("forty");
                break;
            case 3:
                sb.append("thirty");
                break;
            case 2:
                sb.append("twenty");
                break;
            default:
                break;
        }

        if (single != 0) {
            sb.append(' ');
            sb.append(TranslateNumberToWord.oneDigitNumberToWord(single));
        }

        return sb.toString();
    }

    public static String oneDigitNumberToWord(int number) {
        if (number < 0) {
            throw new UnsupportedOperationException("Number is not in range");
        } else if (number > 9) {
            return twoDigitsNumberToWord(number);
        }

        switch (number) {
            case 9:
                return "nine";
            case 8:
                return "eight";
            case 7:
                return "seven";
            case 6:
                return "six";
            case 5:
                return "five";
            case 4:
                return "four";
            case 3:
                return "three";
            case 2:
                return "two";
            case 1:
                return "one";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(TranslateNumberToWord.translateNumberToWord(-125));
//        int x = 10 / 0;
    }
}
