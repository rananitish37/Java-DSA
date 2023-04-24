import javax.xml.stream.events.StartDocument;

public class searchInSorted {
    
    //method1

    // public static void bruteforece(int num[][],int key){
    //     for(int i=0;i<num.length;i++){
    //         for(int j=0;j<num[0].length;j++){
    //             if(num[i][j]==key){
    //                 System.out.println("element found at index: "+"("+i+","+j+")");
    //                 return;
    //             }
    //         }
    //     }
    // }

    // method2

    // public static void rowWise(int [][]num,int key){
    //     for(int i=0;i<num.length;i++){
    //         int start=0,end=num[i].length-1;
    //         while(start<end){
    //             int mid=(start+end)/2;
    //             if (num[i][mid] == key) {
    //                 System.out.println("element found at index: "+"("+i+","+j+")");
    //                 return;
    //             }else if(num[i][mid] < key){
    //                 start=mid+1;
    //             }else{
    //                 end=mid-1;
    //             }
    //         }
    //     }
    //     System.out.println("element not found");
    // }

    //method3
    public static void stairecaseSearch(int num[][],int key){
        int row=0,col=num[0].length-1;
        while(row<num.length && col>=0){
            if(num[row][col]==key){
                System.out.println("element found at index: "+"("+row+","+col+")");
                break;
            }else if (num[row][col] < key) {
                row++;
            }else{
                col--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        int key=33;
        // bruteforece(arr, key);
        // rowWise(arr, key);
        stairecaseSearch(arr, key);
    }
}
