package session16.homework;
@FunctionalInterface
interface NLettersPrint {
    String printNLetters (String string, int number);
}

class LetterPrintTest{
    public static void main(String[] args) {

        NLettersPrint nLettersPrint = ((string, number) -> {
            if(number >= string.length()){
               return string;
            }else {
                return string.substring(0,number);
            }
        });

        String string = "Jack fruit";
        int length = 4;
        System.out.println(nLettersPrint.printNLetters(string,length));

    }


}
