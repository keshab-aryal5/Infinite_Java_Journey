package assignment;

public class Question1 {
    public static void main(String[] args) {
        String name = "KESHAB";
        System.out.println(name.toLowerCase());
        String name2 = " keshab aryal";
        System.out.println(name2.replace(" ","_"));

        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","keshab"));

        String sample = "keshab  aryal";
        int index = sample.indexOf("  ");
        if(index>-1){
            System.out.println("Yes at index "+index);
        }
        else {
            System.out.println("No, not present");
        }
        System.out.println("Dear Harry,\nThis Java course is nice.\nThanks");
    }
}
