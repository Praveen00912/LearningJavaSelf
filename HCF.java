/*class HCF{
    public static void main(String[] args){
        int n1=20;
        int n2=30;
        int min=0; // initializing min. value
        int hcf=1;
        if(n1<n2)
        {
            min=n1;
        }
        else {
            min=n2;
        }
        for(int i= min;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf=i;
                break;
            }
        }
        System.out.println("hcf is: "+hcf);   //18 12
    }
}
*/
/*class HCF{
    public static void main(String[] args) {
        int n1= 18;
        int n2= 12;
        int min=0;
        int hcf=1;
        if(n1<n2)
        {
            min=n1;
        }
        else{
            min=n2;
        }
        for(int i=min;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf=i;
                break;
            }
        }
        System.out.println("hcf is: "+hcf);
            int lcm=(n1*n2)/hcf;
            System.out.println("LCM is: "+lcm);
    }

}*/

class HCF{      //Ecluilds method
    public static void main(String[] args) {
        int a= 18; int b=20 ;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(":hcf is: "+a);
    }
}