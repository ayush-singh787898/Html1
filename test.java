import java.util.*;
class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        // for __ in range(int(input())):

//   n=int(input())
  int n2=str(n*2); 
  n3=str(n*3)
  n=str(n)
  s=n+n2+n3
  count=0
  s=list(s)
  for i in range(1,10):
    if str(i) in s:
      count+=1
  if(count==9):
    if(len(s)==len(set(s))):
      print(1)
    else:
      print(0)
  else:  
    print(0)
        
    }
} 
// for __ in range(int(input())):
//   n=int(input())
//   n2=str(n*2) 
//   n3=str(n*3)
//   n=str(n)
//   s=n+n2+n3
//   count=0
//   s=list(s)
//   for i in range(1,10):
//     if str(i) in s:
//       count+=1
//   if(count==9):
//     if(len(s)==len(set(s))):
//       print(1)
//     else:
//       print(0)
//   else:  
//     print(0)