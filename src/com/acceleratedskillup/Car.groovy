package com.acceleratedskillup;

class Car {
  int numberOfDoors
  String brand
  String model
  def script
  
	Car(script) {
		this.script = script
	}
	Car(script,NoDoor,Brd,Mdl) {
		this.script = script;
		numberOfDoors = NoDoor;
		brand = Brd;
		model = Mdl;
	}
	
  	void printOutCar() {
		script.echo "using script.echo"
  		script.echo "numberOfDoors:${numberOfDoors}"    	
		script.echo "brand:${brand}"    	
		script.echo "model:${model}"
  	}  
  
}
