#include<stdio.h>
#include<math.h>

float add(float x,float y);
float sub(float x,float y);
float mult(float x,float y);
float div(float x,float y);
int mod(int x,int y);      
float sqr(float x);
float sqroot(float x);  
float lg(float x);  
float cubroot(float x);
float cub(float x);
         
int main(){
  while(1){
 
  char ch;
  float n,m,q;
  float Addition,Substraction,Multiplication,division,Remainder,Square,Squareroot,Log,Cube,Cuberoot;
   
   printf("Enter 1 for ADDITION(+): \n");
   printf("Enter 2 for SUBSTRACTIOIN(-): \n");
   printf("Enter 3 for MULTIPLICATION(*): \n");
   printf("Enter 4 for DIVISION(/): \n");
   printf("Enter 5 to find REMAINDER: \n");
   printf("Enter 6 for SQUARE: \n");
   printf("Enter 7 for SQURAEROOT: \n");
   printf("Enter 8 for LOG: \n");
   printf("Enter 9 for CUBE: \n");
   printf("Enter 10 for CUBEROOT: \n");    
   
   printf("\nEnter operation no.: ");
   scanf("%c",&ch);
   
   if(ch<54){
   printf("\nEnter first number: ");
   scanf("%f",&n);
   
   printf("\nEnter second number: ");
   scanf("%f",&m);
   }
   
   else{
    printf("\nEnter number: ");
    scanf("%f",&q);
    }
   
   
   switch(ch){
   
    case 1:
    Addition= add(n,m);
    printf("Addition= %f",Addition);
       
        break;                        
     
    case 2:
    Substraction= sub(n,m);
        printf("Substraction= %f", Substraction);
        break;  
       
    case 3:
    Multiplication= mult(n,m);
        printf("Multiplication= %f",Multiplication);
        break;  
       
    case 4:
     division= div(n,m);
       printf("division= %f ",division);
        break;  
       
    case 5:
     Remainder= mod(n,m);
        printf("Remainder= %f",Remainder);
        break;  
     
    case 6:
        Square= sqr(q);
        printf("Square= %f",Square);
        break;  
       
    case 7:
    Squareroot= sqroot(q);
        printf("Squareroot= %f ",Squareroot);
        break;  
       
    case 8:
     Log= lg(q);
        printf("Log= %f",Log);
        break;  
       
    case 9:
    Cube= cub(q);
        printf("Cube=%f",Cube);
        break;  
       
    case 10:
    Cuberoot= cubroot(q);
        printf("Cuberoot=%f",Cuberoot);
        break;    
       
        }   }  }
       
   
   
    float add(float x,float y){
       return x+y;
       }
         
    float sub(float x,float y){
       return x-y;
       }
       
    float mult(float x,float y){
       return x*y;
    }                          
   
    float div(float x,float y){
       return x/y;
    }    
   
    int mod(int x,int y){
       return x%y;
       }    
   
    float sqr(float x){
       return x*x;
       }  
         
   
    float sqroot(float x){
       return sqrt(x);
       }    
   
    float lg(float x){
      return log10(x);
       }    
     
    float cub(float x){
       return x*x*x;
       }    
   
    float cubroot(float x){
       return cbrt(x);
       }