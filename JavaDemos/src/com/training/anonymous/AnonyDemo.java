package com.training.anonymous;

class EmpDetails {
	void calcSalary(BonusCalculator m, int x) {
		System.out.println("Bonus Calculation.");
		System.out.println("Bonus : " + m.incRate(x));
		System.out.println("Done.");
	}
}

class AnonyDemo {

	public static void main(String[] args) {
		EmpDetails ed = new EmpDetails();
		ed.calcSalary(new BonusCalculator() {

			@Override
			public int incRate(int x) {
				System.out.println("For Manager :-");
				return x * 5;
			}
		}, 1000);

		ed.calcSalary(new BonusCalculator() {

			@Override
			public int incRate(int x) {
				System.out.println("For Developer :-");
				return x * 2;
			}
		}, 1000);
		
		//Using lambda
		ed.calcSalary((x)->{
			
			System.out.println("GM");
			return x*5;
		},3000);
	}

}
