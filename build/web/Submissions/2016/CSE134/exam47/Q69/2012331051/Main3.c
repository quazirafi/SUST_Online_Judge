#include <stdio.h>
int main()
{
    int n;
    while(scanf("%d",&n)==1){
        if (n>0){
            int i = 1;
            int j = 0;
            printf("0");
            for (i=1;i<=n;++i){
                printf(" %d",i);
            }
            printf(" ");
            printf("\n");
        }
        else if (n<0){
            int i=1;
            int j= -1;
            int lm = n*(-1);
            printf("0");
            for (i=1;i<=lm;++i){
                printf(" %d",j--);
            }
            printf("\n");
        }
    }
    return 0;
}
