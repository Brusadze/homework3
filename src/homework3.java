import java.util.Scanner;

public class homework3 {
    //Checks if array contains exact number,
    //returns true , false
    private static boolean contains(int x, int[] arr){
        boolean result = false;
        for(int i : arr){
            if(i == x) {
                result = true;
                System.out.println(result);
                break;
            }else{
                result = false;
                System.out.println(result);
            }
        }
        return result;
    }

    //checks if first and last numbers are same
    private static boolean sameFirstLast(int[] nums){

        for(int i : nums){
            if(nums[0] == nums[nums.length-1]){
                System.out.println("რიცხვები ტოლია");
                return true;

            }else
                System.out.println("რიცხვები არ არის ტოლი");
        }
        return false;
    }

    //check how many even numbers are in array
    private static int countEvents(int[] arr){
        int result = 0;
        for(int i = 0 ; i < 6 ; i++){
            if(arr[i] % 2 == 0){
                result++;
            }
        }
        System.out.println(result);
        return result;
    }

    //calculating sum of elements in array
    private static int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
            //System.out.println(i);
        }
        System.out.println("მასივის ელემენტების ჯამი არის " + sum);
        return sum;
    }

    //calculating sum of even elements in array
    private static int sumEvens(int[] arr){
        int sum = 0;
        int sumOdd = 0;
        for(int i = 0; i < arr.length ; i++){
            if(i % 2 == 0){
                sum += arr[i];
            }
            //System.out.println(i);
        }
        for(int i = 0; i < arr.length ; i++){
            if(i % 2 != 0){
                sumOdd += arr[i];
            }
            //System.out.println(i);
        }
        System.out.println("მასივის ლუწი ინდექსის ელემენტების ჯამი არის " + sum +
                            " კენტი ინდექსების ჯამი არის " + sumOdd);
        return sum;
    }

    //calling functions
    public static void firstExercise(){
        int array[] = {1,2,3,4,5,6,7,8};
        Scanner scanner = new Scanner(System.in);
        int getInt = scanner.nextInt();
        contains(getInt,array);
    }
    public static void secondExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანე მასივის პირველი რიცხვი");
        int firstint = scanner.nextInt();
        System.out.println("შეიყვანე მასივის ბოლო რიცხვი");
        int lastint = scanner.nextInt();
        int[] arr = {firstint,1,2,3,4,5,6,7,lastint};
        sameFirstLast(arr);
    }
    public static void thirdExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეივანე 6 რიცხვი მასივისთვის");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int[] numbers = {a,b,c,d,e,f};
        countEvents(numbers);
    }
    public static void fouthExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანე სამი რიცხვი მასივისთვის");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = {a,b,c};
        sum(arr);

    }
    public static void fifthExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანე სამი რიცხვი მასივისთვის");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int[] arr = {a,b,c,d,e};
        sumEvens(arr);
    }



    public static void main(String[] args) {
        // firstExercise();
        //  secondExercise();
        // thirdExercise();
       // fouthExercise();
        fifthExercise();
    }

}
