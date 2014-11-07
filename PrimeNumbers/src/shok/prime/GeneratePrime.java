package shok.prime;

public class GeneratePrime {

	public void Get_prime_nos(int n){
		for(int i=2;i<n;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if (count==2){
				System.out.println(i);
			}
		}
	}
}
