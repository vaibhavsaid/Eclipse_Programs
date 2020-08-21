package com.example2;

public class Exe {

public static void main(String[] args) {

Animal[] A = new Animal[5000];
int added = 0;
for(int i = 0 ; i<A.length;i++){
if(i%2 == 0){
A[i] = new Cat();

}
else if(i%3 == 0){
A[i] = new Dog();

}
else {
A[i] = new Snake();
added++;
}
}
System.out.println("Added Dog objects ------> " + added);


int count = 0;

for(int i = 0 ; i<A.length ;i++){
if(A[i] instanceof Snake){
count++;
}
}
System.out.println("Number of Dog objects in an array----> " + count);


}

}