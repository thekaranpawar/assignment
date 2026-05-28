class Pangram{
    public static void main(String args[]){
        String str = "Pack my box with five dozen liquor jugs";

        str = str.toLowerCase();

        boolean allPresent = true;

        for(char ch = 'a'; ch <= 'z'; ++ch){
            if(str.indexOf(ch) == -1){
                allPresent = false;
                break;
            }
        }
        if(allPresent){
            System.out.println("Pangram string");
        } else{
            System.out.println("Not a Pangram string");
        }
    }
}