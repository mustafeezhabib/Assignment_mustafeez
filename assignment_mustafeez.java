public class EvaluationMustafeez{
public static void fnEvaluation()
{
int sumX=0;
int sumY=0;
int sumXY=0;
int reversed=0;
Scanner sc=new Scanner(System.in);
// Enter Value for N
System.out.println("Enter a number, N");
int n=sc.nextInt();
// Enter value for X
System.out.println("Enter a number, X");
int x=sc.nextInt();
//Enter value for Y
System.out.println("Enter a number, Y");
int y=sc.nextInt();

// Get the natural number between 1 to N
for(int i=1; i<=n-1; i++) {
if (i%x==0);
sumX=sumX +i ;}

//Get the natural numbers between 1 to N
for(int j=1; j<=n-1; j++) {
if (j%y==0);
sumY= sumY + j ;}

// Add all the natural numbers for value X and Y
sumXY= sumX + sumY;

//reverse the value
while(sumXY!=0) {
int digit = sumXY % 10;
reversed=reversed * 10 + digit;
sumXY/=10;
}

// Print the reversed value
System.out.println("Reversed Number : "+reversed);
}}
