package javaassignments;

	public class Orders1 {
		double price;
		
		
		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public Orders1(double price) {
			super();
			this.price = price;
		}


		@Override
		public String toString() {
			return "Orders [price=" + price + "]";
		}}
		

