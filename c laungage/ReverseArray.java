public class ReverseArray {
    
    public static void main(String []args){

        int Arr[] = { 10,20,30,40,50};
        // for print arrayn element

        for(int i = 0; i < 5; i++){

            System.out.println(Arr[i]);

        }
        
        System.out.println("Revers the Array element");

        //for reverse array ellement

        for(int i = 5-1; i>=0; i--){

            System.out.println(Arr[i]);
        }
    }
}
