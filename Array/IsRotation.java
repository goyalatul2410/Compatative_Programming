
public class IsRotation {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7};
		int b[]={4,5,6,7,1,2,3};
		
		if(rotation(a, b))
			System.out.println("True");
		else
			System.out.println("False");
	}
	
	static Boolean rotation(int a[],int b[]) {
		
		if(a.length!=b.length)
			return false;
		
		int key=a[0];
		int key_i=-1;
		for(int i=0;i<b.length;i++) {
			if(b[i]==key) {
				key_i=i;
				break;
			}
		}
		if(key_i==-1)
			return false;
		for(int i=0;i<a.length;i++) {
			int j=(key_i+i)%a.length;
			if(a[i]!=b[j])
				return false;
		}
		return true;
		
	}

}
