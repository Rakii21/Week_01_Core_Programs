public class Volume{
	public static void main(String args[]){
		int radius=6378;
		double volumeInKilo= (4/3)*3.14*radius*radius*radius;
		double volumeInMiles = volumeInKilo*0.239913;
		System.out.println("The volume of earth in cubic kilometers is "+String.format("%.2f",volumeInKilo)+" and cubic miles is "+String.format("%.2f",volumeInMiles));
		}
	}