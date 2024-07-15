//
// Generalize noA to noT(top)
//  Use factory method newI to pull into Topping
// 
//
class Pizza {
    public Pizza noA(){
	return null;
    }
    public Pizza noT(String top){
	return null;
    }
    public Pizza noT2(String top){
	return null;
    }
    public Pizza newI(Pizza p){
	return null;
    }
	////////////////////////////////////////////////
    public Pizza i1toI2(String i1, String i2){
	return null;
	}
	////////////////////////////////////////////////
}

class Crust extends Pizza {
    public Crust() {
    }
    public String toString() {
	return "Crust";
    }
    public Pizza noA(){
	return this; // could return new Crust()
    }
    public Pizza noT(String top){
	return this;   // cannot remove Crust
    }
    public Pizza noT2(String top){
	return this; // cannot remove Crust
    }
    public Crust newI(Pizza p){
	return this; // no "new" crusts
    }
	////////////////////////////////////////////////
    public Pizza i1toI2(String i1, String i2){
	return this;
	}
	///////////////////////////////////////////////

}

class Topping extends Pizza {
    public Pizza _p;
    public String _n;
    public Topping(Pizza p, String n) {
	_p = p;
	_n = n;
    }
    public String toString(){
	return _n + " " + _p.toString();
    }
    public Pizza noT2(String top){
	if (top == this._n) {
	    return this._p.noT(top);
	}
	return this.newI(this._p.noT(top));
    }
	//////////////////////////////////////////////

	//////////////////////////////////////////////



}

class Sausage extends Topping {
    public Sausage(Pizza p){
	super(p,"Sausage");
    }

    public Pizza noA(){
	return new Sausage(this._p.noA()); //create a new instance of ( this pizza and call the noA() methord)
    }

    public Pizza noT(String top){
	if (top == this._n) {
	    return this._p.noT(top);
	}
	return new Sausage(this._p.noT(top));
    }

	
    public Sausage newI(Pizza p){
	return new Sausage(p);
    }
}

class Tomato extends Topping {
    public Tomato(Pizza p){
	super(p,"Tomato");
    }
    public Pizza noA(){
	return new Tomato(this._p.noA());
    }
    public Pizza noT(String top){
	if (top == this._n) {
	    return this._p.noT(top);
	}
	return new Tomato(this._p.noT(top));
    }
    public Tomato newI(Pizza p){
	return new Tomato(p);
    }
}

class Cheese extends Topping {
    public Cheese(Pizza p) {
	super(p, "Cheese");
    }
    public Pizza noA(){
	return new Cheese(this._p.noA());
    }
    public Pizza noT(String top){
	if (top == this._n) {
	    return this._p.noT(top);
	}
	return new Cheese(this._p.noT(top));
    }
    public Cheese newI(Pizza p){
	return new Cheese(p);
    }
}

class Pepperoni extends Topping {
    public Pepperoni(Pizza p) {
	super(p,"Pepperoni");
    }
    public Pizza noA(){
	return new Pepperoni(this._p.noA());
    }
    public Pizza noT(String top){
	if (top == this._n) {
	    return this._p.noT(top);
	}
	return new Pepperoni(this._p.noT(top));
    }
    public Pepperoni newI(Pizza p){
	return new Pepperoni(p);
    }
}

class Onion extends Topping {
    public Onion(Pizza p) {
	super(p,"Onion");
    }
    public Pizza noA(){
	return new Onion(this._p.noA());
    }
    public Pizza noT(String top){
	if (top == this._n) {
	    return this._p.noT(top);
	}
	return new Onion(this._p.noT(top));
    }
    public Onion newI(Pizza p){
	return new Onion(p);
    }
}

class Anchovy extends Topping {
    public Anchovy(Pizza p) {
	super(p,"Anchovy");
    }
    public Pizza noA(){
	return this._p.noA();
    }
    public Pizza noT(String top){
	if (top == this._n) {
	    return this._p.noT(top);
	}
	return new Anchovy(this._p.noT(top));
    }
    public Anchovy newI(Pizza p){
	return new Anchovy(p);
    }
}

public class Main6 {
    public static void main(String[] args) {
	Pizza p1 =
	    new Onion(
		new Anchovy(
		    new Cheese(
			new Pepperoni(
			    new Cheese(
				new Tomato(
				    new Crust()))))));
	System.out.printf("Pizza wi Everyth = %s%n",p1);
	System.out.printf("Pizza no Anchovy = %s%n",p1.noA());
	System.out.printf("Pizza no Cheese = %s%n",p1.noT("Cheese"));
	System.out.printf("Pizza no Tomato = %s%n",p1.noT("Tomato"));

	p1 =
	    new Sausage(
		new Onion(
		    new Anchovy(
			new Cheese(
			    new Anchovy(
				new Pepperoni(
				    new Cheese(
					new Tomato(
					    new Crust()))))))));
	
	System.out.printf("Saus Pizza wi Anchovy = %s%n",p1);
	System.out.printf("Saus Pizza no Anchovy = %s%n",p1.noA());
	System.out.printf("Pizza no Cheese = %s%n",p1.noT2("Cheese"));
	System.out.printf("Pizza no Tomato = %s%n",p1.noT2("Tomato"));

	p1 =
	    new Sausage(
		new Onion(
		    new Cheese(
			new Pepperoni(
			    new Cheese(
				new Tomato(
				    new Crust()))))));
	
	System.out.printf("Saus Pizza no Anchovy = %s%n",p1);
	System.out.printf("Saus Pizza rm Anchovy = %s%n",p1.noA());

	Pizza p2 = new Crust();
	System.out.printf("noT2 on crust only = %s\n",new Crust().noT2("Cheese"));
    }
}
