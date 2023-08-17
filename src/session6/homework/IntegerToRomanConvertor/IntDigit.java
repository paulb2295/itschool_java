package session6.homework.IntegerToRomanConvertor;

public class IntDigit {
    public static final String[][] ROMAN = {{"I", "V", "X"}, {"X", "L", "C"}, {"C", "D", "M"}, {"M", "", ""}};
    private final int value;
    private final int positionOfDigitInNumber;

    public IntDigit(int value, int positionOfDigitInNumber) {
        this.value = value;
        this.positionOfDigitInNumber = positionOfDigitInNumber;
    }

    public StringBuilder returnRomanDigit() {
        StringBuilder finalResult = converterAsUnitPosition(value);
        for (int index = 0; index < finalResult.length(); index++) {
            int columnIndex = 0;
            switch (finalResult.charAt(index)) {
                case 'I':
                    columnIndex = 0;
                    break;
                case 'V':
                    columnIndex = 1;
                    break;
                case 'X':
                    columnIndex = 2;
                    break;
            }
            finalResult.replace(index, index + 1, ROMAN[positionOfDigitInNumber][columnIndex]);
        }
        return finalResult;
    }

    private StringBuilder converterAsUnitPosition(int digit) {
        StringBuilder result = new StringBuilder();
        switch (digit) {
            case 1, 2, 3: {
                for (int index = 1; index <= digit; index++) {
                    result.append('I');
                }
                break;
            }
            case 4:
                result.append("IV");
                break;
            case 5, 6, 7, 8: {
                result.append("V");
                for (int index = 6; index <= digit; index++) {
                    result.append('I');
                }
                break;
            }
            case 9:
                result.append("IX");
                break;
            default:
                break;
        }
        return result;
    }
}
