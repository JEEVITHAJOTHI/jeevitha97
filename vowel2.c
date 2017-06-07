#include<stdio.h>
#include<conio.h>
int main()
{
char alp;
    printf("enter the letter");
    scanf("%c",&alp);
if(alp=='a'||alp=='e'||alp=='i'||alp=='u'||alp=='o'||alp=='A'||alp=='E'||alp=='I'||alp=='O'||alp=='U')
    printf("\tthe letter is vowel");
else
    printf("\tthe letter is consonant");
return 0;
}
