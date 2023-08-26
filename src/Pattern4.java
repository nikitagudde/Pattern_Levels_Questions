
public class Pattern4 {

	public static void main(String args[]) {
			int i, j ,n=4;
			for(i=1;i<=n;i++) {
				for(j=1;j<=i;j++) {
					System.out.print("#");
					
				}
				System.out.println();
			}
		
	for(i=n-1;i>=1;i--) {
		for(j=1;j<=i;j++) {
			System.out.print("#");
		}
		System.out.println();
	}
		
	}
}
