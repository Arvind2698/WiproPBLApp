package JavaFundamentals.Arrays;

public class HandsOn4 {
    public static void main(String[] args) {
        int[] asciiArray=new int[26];

        int i=0;
        for(int j=97;j<=122;j++){
            asciiArray[i]=j;
            i++;
        }
        System.out.println("Original ASCII array: ");
        for(int k=0;k<asciiArray.length;k++){
            System.out.print(asciiArray[k]+" ");
        }
        System.out.println("\nCharacter equivalent of ASCII values: ");
        for(int k=0;k<asciiArray.length;k++){
            System.out.print( (char)asciiArray[k]+" ");
        }
    }
}
