#include <stdio.h>

/*
One Away: There are three types of edits that can be performed on strings: insert a character, remove a ,replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

EXAMPLE

pale, ple -> true

pales, pale -> true

pale, bale -> true

pale, bake -> false
*/
int main() {
    int *j,i,f,count=1;
    char *s1,*s2;
    s1= "somestring";
    s2= "omestring";
    j=calloc(sizeof(int),128);
    for(i=0;s1[i]!='/0';i++){
        f=s1[i];
        j[f]+=1;
        f=s2[i];
        j[f]-=1;
    }
    
    for (i=0;i<128;i++){
        if(j[f]!=0)
            if(count==0){
                printf("false");
                break;
                }
            else
                count =1;
    }
    return 0;
}
