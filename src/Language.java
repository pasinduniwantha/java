public class Language {
    String language;
    Language(String a){
        language = a;
        System.out.println(language + " is Language ");
    }
    public static void main(String[] args) {
       Language l = new Language(" sinhala ");
       Language l1 = new Language(" English ");
       Language l2 = new Language(" Tamil ");
       Language l3 = new Language(" koriyan ");
    }
}

