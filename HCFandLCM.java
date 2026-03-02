class HCFandLCM{
    public static void main(String[] args) {
// FindingHcf
	int n1=18,n2=20;
	int min=0;
	int hcf=1;
	if(n1<n2) {
		min=n1;
	}
	else {
		min=n2;
	}
	for(int i=min;i>=1;i--) {
		if(n1%i==0 && n2%i==0) {
			hcf=i;
			break;
		}
		
	}
	System.out.println("Hcf is "+hcf);
	int lcm=(n1*n2)/hcf;
	System.out.println("Lcm is "+lcm);
}
    }